package com.google.javascript.jscomp;

import org.junit.Test;
import java.lang.reflect.Method;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.ParameterizedType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.UnknownType;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.StringType;
import com.google.javascript.rhino.jstype.NumberType;
import com.google.javascript.jscomp.Scope.Arguments;
import com.google.javascript.rhino.jstype.EnumElementType;
import java.lang.reflect.Constructor;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.jstype.FunctionType;
import java.util.List;
import com.google.javascript.rhino.jstype.UnionType;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import com.google.javascript.rhino.jstype.ObjectType.Property;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.VoidType;
import com.google.javascript.rhino.JSDocInfo;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertFalse;

public final class com_google_javascript_jscomp_TypeValidatorTest {
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.report
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method report(com.google.javascript.jscomp.JSError)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#report(com.google.javascript.jscomp.JSError)}
 * @utbot.executesCondition {@code (shouldReport): False}
 * @utbot.returnsFrom {@code return error;}
 *  */
    @Test
    public void testReport_NotShouldReport() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class jSErrorType = Class.forName("com.google.javascript.jscomp.JSError");
        Method reportMethod = typeValidatorClazz.getDeclaredMethod("report", jSErrorType);
        reportMethod.setAccessible(true);
        java.lang.Object[] reportMethodArguments = new java.lang.Object[1];
        reportMethodArguments[0] = ((Object) null);
        JSError actual = ((JSError) reportMethod.invoke(typeValidator, reportMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#report(com.google.javascript.jscomp.JSError)}
 * @utbot.executesCondition {@code (shouldReport): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#report(com.google.javascript.jscomp.JSError)}
 * @utbot.returnsFrom {@code return error;}
 *  */
    @Test
    public void testReport_ShouldReport() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "compiler", compiler);
        typeValidator.setShouldReport(true);
        JSError jSError = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
        CheckLevel defaultLevel = CheckLevel.OFF;
        setField(jSError, "com.google.javascript.jscomp.JSError", "defaultLevel", defaultLevel);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class jSErrorType = Class.forName("com.google.javascript.jscomp.JSError");
        Method reportMethod = typeValidatorClazz.getDeclaredMethod("report", jSErrorType);
        reportMethod.setAccessible(true);
        java.lang.Object[] reportMethodArguments = new java.lang.Object[1];
        reportMethodArguments[0] = jSError;
        JSError actual = ((JSError) reportMethod.invoke(typeValidator, reportMethodArguments));
        
        // com.google.javascript.jscomp.JSError has overridden equals method
        assertEquals(jSError, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method report(com.google.javascript.jscomp.JSError)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#report(com.google.javascript.jscomp.JSError)}
 * @utbot.executesCondition {@code (shouldReport): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#report(com.google.javascript.jscomp.JSError)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.report(error);
 *  */
    @Test
    public void testReport_ThrowNullPointerException() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        typeValidator.setShouldReport(true);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.report] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.report(TypeValidator.java:793) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class jSErrorType = Class.forName("com.google.javascript.jscomp.JSError");
        Method reportMethod = typeValidatorClazz.getDeclaredMethod("report", jSErrorType);
        reportMethod.setAccessible(true);
        java.lang.Object[] reportMethodArguments = new java.lang.Object[1];
        reportMethodArguments[0] = ((Object) null);
        try {
            reportMethod.invoke(typeValidator, reportMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.mismatch
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mismatch(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSTypeNative)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#mismatch(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: mismatch(t, n, msg, found, getNativeType(required));
 *  */
    @Test
    public void testMismatch_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.mismatch] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:788)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:655) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method mismatchMethod = typeValidatorClazz.getDeclaredMethod("mismatch", nodeTraversalType, nodeType, stringType, jSTypeType, jSTypeNativeType);
        mismatchMethod.setAccessible(true);
        java.lang.Object[] mismatchMethodArguments = new java.lang.Object[5];
        mismatchMethodArguments[0] = ((Object) null);
        mismatchMethodArguments[1] = ((Object) null);
        mismatchMethodArguments[2] = ((Object) null);
        mismatchMethodArguments[3] = ((Object) null);
        mismatchMethodArguments[4] = jSTypeNative;
        try {
            mismatchMethod.invoke(typeValidator, mismatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#mismatch(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.invokes com.google.javascript.jscomp.TypeValidator#mismatch(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: mismatch(t, n, msg, found, getNativeType(required));
 *  */
    @Test
    public void testMismatch_ThrowNullPointerException_1() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.mismatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:650)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:655) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method mismatchMethod = typeValidatorClazz.getDeclaredMethod("mismatch", nodeTraversalType, nodeType, stringType, jSTypeType, jSTypeNativeType);
        mismatchMethod.setAccessible(true);
        java.lang.Object[] mismatchMethodArguments = new java.lang.Object[5];
        mismatchMethodArguments[0] = ((Object) null);
        mismatchMethodArguments[1] = ((Object) null);
        mismatchMethodArguments[2] = ((Object) null);
        mismatchMethodArguments[3] = ((Object) null);
        mismatchMethodArguments[4] = jSTypeNative;
        try {
            mismatchMethod.invoke(typeValidator, mismatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#mismatch(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: mismatch(t, n, msg, found, getNativeType(required));
 *  */
    @Test
    public void testMismatch_ThrowNullPointerException() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.mismatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:788)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:655) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method mismatchMethod = typeValidatorClazz.getDeclaredMethod("mismatch", nodeTraversalType, nodeType, stringType, jSTypeType, jSTypeNativeType);
        mismatchMethod.setAccessible(true);
        java.lang.Object[] mismatchMethodArguments = new java.lang.Object[5];
        mismatchMethodArguments[0] = ((Object) null);
        mismatchMethodArguments[1] = ((Object) null);
        mismatchMethodArguments[2] = ((Object) null);
        mismatchMethodArguments[3] = ((Object) null);
        mismatchMethodArguments[4] = ((Object) null);
        try {
            mismatchMethod.invoke(typeValidator, mismatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.mismatch
    
    ///region OTHER: ERROR SUITE for method mismatch(java.lang.String, com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testMismatch1() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        String string = "";
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.mismatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.registerMismatch(TypeValidator.java:668)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:660) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method mismatchMethod = typeValidatorClazz.getDeclaredMethod("mismatch", stringType, nodeType, stringType, jSTypeType, jSTypeType);
        mismatchMethod.setAccessible(true);
        java.lang.Object[] mismatchMethodArguments = new java.lang.Object[5];
        mismatchMethodArguments[0] = string;
        mismatchMethodArguments[1] = node;
        mismatchMethodArguments[2] = ((Object) null);
        mismatchMethodArguments[3] = ((Object) null);
        mismatchMethodArguments[4] = ((Object) null);
        try {
            mismatchMethod.invoke(typeValidator, mismatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.mismatch
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mismatch(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#mismatch(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getSourceName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: mismatch(t.getSourceName(), n, msg, found, required);
 *  */
    @Test
    public void testMismatch_ThrowNullPointerException1() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.mismatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:650) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method mismatchMethod = typeValidatorClazz.getDeclaredMethod("mismatch", nodeTraversalType, nodeType, stringType, jSTypeType, jSTypeType);
        mismatchMethod.setAccessible(true);
        java.lang.Object[] mismatchMethodArguments = new java.lang.Object[5];
        mismatchMethodArguments[0] = ((Object) null);
        mismatchMethodArguments[1] = ((Object) null);
        mismatchMethodArguments[2] = ((Object) null);
        mismatchMethodArguments[3] = ((Object) null);
        mismatchMethodArguments[4] = ((Object) null);
        try {
            mismatchMethod.invoke(typeValidator, mismatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method mismatch(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testMismatch2() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        String string = "";
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.mismatch] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.toStringHelper(ProxyObjectType.java:260)
            com.google.javascript.rhino.jstype.ParameterizedType.toStringHelper(ParameterizedType.java:68)
            com.google.javascript.rhino.jstype.JSType.toString(JSType.java:1466)
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1305)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            java.base/java.text.MessageFormat.format(MessageFormat.java:861)
            com.google.javascript.jscomp.TypeValidator.formatFoundRequired(TypeValidator.java:704)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:662)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:650) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method mismatchMethod = typeValidatorClazz.getDeclaredMethod("mismatch", nodeTraversalType, nodeType, stringType, jSTypeType, jSTypeType);
        mismatchMethod.setAccessible(true);
        java.lang.Object[] mismatchMethodArguments = new java.lang.Object[5];
        mismatchMethodArguments[0] = nodeTraversal;
        mismatchMethodArguments[1] = ((Object) null);
        mismatchMethodArguments[2] = string;
        mismatchMethodArguments[3] = ((Object) null);
        mismatchMethodArguments[4] = parameterizedType;
        try {
            mismatchMethod.invoke(typeValidator, mismatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMismatch3() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.mismatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.registerMismatch(TypeValidator.java:668)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:660)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:650) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method mismatchMethod = typeValidatorClazz.getDeclaredMethod("mismatch", nodeTraversalType, nodeType, stringType, jSTypeType, jSTypeType);
        mismatchMethod.setAccessible(true);
        java.lang.Object[] mismatchMethodArguments = new java.lang.Object[5];
        mismatchMethodArguments[0] = nodeTraversal;
        mismatchMethodArguments[1] = ((Object) null);
        mismatchMethodArguments[2] = ((Object) null);
        mismatchMethodArguments[3] = ((Object) null);
        mismatchMethodArguments[4] = ((Object) null);
        try {
            mismatchMethod.invoke(typeValidator, mismatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectCanAssignToPropertyOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method expectCanAssignToPropertyOf(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectCanAssignToPropertyOf(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String)}
 *  */
    @Test
    public void testExpectCanAssignToPropertyOf_ReturnTrue() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        boolean actual = typeValidator.expectCanAssignToPropertyOf(null, null, null, noType, null, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectCanAssignToPropertyOf(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String)}
 *  */
    @Test
    public void testExpectCanAssignToPropertyOf_ReturnTrue_1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NoType referencedType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        boolean actual = typeValidator.expectCanAssignToPropertyOf(null, null, null, parameterizedType, null, null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expectCanAssignToPropertyOf(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectCanAssignToPropertyOf(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isNoType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !leftType.isNoType() && !rightType.canAssignTo(leftType)
 *  */
    @Test
    public void testExpectCanAssignToPropertyOf_ThrowNullPointerException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectCanAssignToPropertyOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectCanAssignToPropertyOf(TypeValidator.java:365) */
        typeValidator.expectCanAssignToPropertyOf(null, null, null, null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectStringOrNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method expectStringOrNumber(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectStringOrNumber(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.executesCondition {@code (!type.matchesNumberContext()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#matchesNumberContext()}
 *  */
    @Test
    public void testExpectStringOrNumber_TypeMatchesNumberContext() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        typeValidator.expectStringOrNumber(null, null, noType, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expectStringOrNumber(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectStringOrNumber(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#matchesNumberContext()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !type.matchesNumberContext() && !type.matchesStringContext()
 *  */
    @Test
    public void testExpectStringOrNumber_ThrowNullPointerException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectStringOrNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectStringOrNumber(TypeValidator.java:243) */
        typeValidator.expectStringOrNumber(null, null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectNotNullOrUndefined
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method expectNotNullOrUndefined(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectNotNullOrUndefined(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (!type.isNoType()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isNoType()}
 *  */
    @Test
    public void testExpectNotNullOrUndefined_TypeIsNoType() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NoType referencedType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        boolean actual = typeValidator.expectNotNullOrUndefined(null, null, parameterizedType, null, null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expectNotNullOrUndefined(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectNotNullOrUndefined(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isNoType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !type.isNoType() && !type.isUnknownType() && type.isSubtype(nullOrUndefined) && !containsForwardDeclaredUnresolvedName(type)
 *  */
    @Test
    public void testExpectNotNullOrUndefined_ThrowNullPointerException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectNotNullOrUndefined] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectNotNullOrUndefined(TypeValidator.java:257) */
        typeValidator.expectNotNullOrUndefined(null, null, null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectSwitchMatchesCase
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expectSwitchMatchesCase(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectSwitchMatchesCase(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#canTestForShallowEqualityWith(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !switchType.canTestForShallowEqualityWith(caseType) && (caseType.autoboxesTo() == null || !caseType.autoboxesTo().isSubtype(switchType))
 *  */
    @Test
    public void testExpectSwitchMatchesCase_ThrowNullPointerException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectSwitchMatchesCase] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectSwitchMatchesCase(TypeValidator.java:304) */
        typeValidator.expectSwitchMatchesCase(null, null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectArgumentMatchesParameter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method expectArgumentMatchesParameter(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node, int)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectArgumentMatchesParameter(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int)}
 *  */
    @Test
    public void testExpectArgumentMatchesParameter() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        
        typeValidator.expectArgumentMatchesParameter(null, null, unknownType, null, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectArgumentMatchesParameter(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int)}
 *  */
    @Test
    public void testExpectArgumentMatchesParameter_1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        typeValidator.expectArgumentMatchesParameter(null, null, parameterizedType, null, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectArgumentMatchesParameter(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int)}
 *  */
    @Test
    public void testExpectArgumentMatchesParameter_2() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        typeValidator.expectArgumentMatchesParameter(null, null, parameterizedType, null, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectArgumentMatchesParameter(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int)}
 *  */
    @Test
    public void testExpectArgumentMatchesParameter_3() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        typeValidator.expectArgumentMatchesParameter(null, null, parameterizedType, null, null, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expectArgumentMatchesParameter(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node, int)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectArgumentMatchesParameter(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#canAssignTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !argType.canAssignTo(paramType)
 *  */
    @Test
    public void testExpectArgumentMatchesParameter_ThrowNullPointerException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectArgumentMatchesParameter] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectArgumentMatchesParameter(TypeValidator.java:428) */
        typeValidator.expectArgumentMatchesParameter(null, null, null, null, null, -255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method expectArgumentMatchesParameter(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node, int)
    
    @Test
    public void testExpectArgumentMatchesParameter1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        StringType referencedType2 = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectArgumentMatchesParameter] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1333)
            com.google.javascript.rhino.jstype.JSType.isSubtype(JSType.java:1324)
            com.google.javascript.rhino.jstype.JSType.canAssignTo(JSType.java:846)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.TemplateType.canAssignTo(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.TemplateType.canAssignTo(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.ParameterizedType.canAssignTo(ParameterizedType.java:50)
            com.google.javascript.jscomp.TypeValidator.expectArgumentMatchesParameter(TypeValidator.java:428) */
        typeValidator.expectArgumentMatchesParameter(null, null, parameterizedType, null, null, -255);
    }
    
    @Test
    public void testExpectArgumentMatchesParameter2() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        StringType referencedType2 = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectArgumentMatchesParameter] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1333)
            com.google.javascript.rhino.jstype.JSType.isSubtype(JSType.java:1324)
            com.google.javascript.rhino.jstype.JSType.canAssignTo(JSType.java:846)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.ParameterizedType.canAssignTo(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.ParameterizedType.canAssignTo(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.ParameterizedType.canAssignTo(ParameterizedType.java:50)
            com.google.javascript.jscomp.TypeValidator.expectArgumentMatchesParameter(TypeValidator.java:428) */
        typeValidator.expectArgumentMatchesParameter(null, null, parameterizedType, null, null, -255);
    }
    
    @Test
    public void testExpectArgumentMatchesParameter3() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        StringType referencedType3 = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectArgumentMatchesParameter] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1333)
            com.google.javascript.rhino.jstype.JSType.isSubtype(JSType.java:1324)
            com.google.javascript.rhino.jstype.JSType.canAssignTo(JSType.java:846)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.ParameterizedType.canAssignTo(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.ParameterizedType.canAssignTo(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.TemplateType.canAssignTo(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.ParameterizedType.canAssignTo(ParameterizedType.java:50)
            com.google.javascript.jscomp.TypeValidator.expectArgumentMatchesParameter(TypeValidator.java:428) */
        typeValidator.expectArgumentMatchesParameter(null, null, parameterizedType, null, null, -255);
    }
    
    @Test
    public void testExpectArgumentMatchesParameter4() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        StringType referencedType3 = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectArgumentMatchesParameter] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1333)
            com.google.javascript.rhino.jstype.JSType.isSubtype(JSType.java:1324)
            com.google.javascript.rhino.jstype.JSType.canAssignTo(JSType.java:846)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.TemplateType.canAssignTo(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.ParameterizedType.canAssignTo(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.ParameterizedType.canAssignTo(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.ParameterizedType.canAssignTo(ParameterizedType.java:50)
            com.google.javascript.jscomp.TypeValidator.expectArgumentMatchesParameter(TypeValidator.java:428) */
        typeValidator.expectArgumentMatchesParameter(null, null, parameterizedType, null, null, -255);
    }
    
    @Test
    public void testExpectArgumentMatchesParameter5() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        StringType referencedType3 = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectArgumentMatchesParameter] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1333)
            com.google.javascript.rhino.jstype.JSType.isSubtype(JSType.java:1324)
            com.google.javascript.rhino.jstype.JSType.canAssignTo(JSType.java:846)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.ParameterizedType.canAssignTo(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.TemplateType.canAssignTo(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.ParameterizedType.canAssignTo(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.ParameterizedType.canAssignTo(ParameterizedType.java:50)
            com.google.javascript.jscomp.TypeValidator.expectArgumentMatchesParameter(TypeValidator.java:428) */
        typeValidator.expectArgumentMatchesParameter(null, null, parameterizedType, null, null, -255);
    }
    
    @Test
    public void testExpectArgumentMatchesParameter6() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        StringType referencedType3 = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectArgumentMatchesParameter] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1333)
            com.google.javascript.rhino.jstype.JSType.isSubtype(JSType.java:1324)
            com.google.javascript.rhino.jstype.JSType.canAssignTo(JSType.java:846)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.ParameterizedType.canAssignTo(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.TemplateType.canAssignTo(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.TemplateType.canAssignTo(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.ParameterizedType.canAssignTo(ParameterizedType.java:50)
            com.google.javascript.jscomp.TypeValidator.expectArgumentMatchesParameter(TypeValidator.java:428) */
        typeValidator.expectArgumentMatchesParameter(null, null, parameterizedType, null, null, -255);
    }
    
    @Test
    public void testExpectArgumentMatchesParameter7() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType6 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType7 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType8 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType9 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType10 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType11 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType12 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType13 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType14 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType15 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NumberType referencedType16 = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
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
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectArgumentMatchesParameter] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1333)
            com.google.javascript.rhino.jstype.JSType.isSubtype(JSType.java:1324)
            com.google.javascript.rhino.jstype.JSType.canAssignTo(JSType.java:846)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.ParameterizedType.canAssignTo(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.ParameterizedType.canAssignTo(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.ParameterizedType.canAssignTo(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.TemplateType.canAssignTo(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.ParameterizedType.canAssignTo(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.ParameterizedType.canAssignTo(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.ParameterizedType.canAssignTo(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.ParameterizedType.canAssignTo(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.ParameterizedType.canAssignTo(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.ParameterizedType.canAssignTo(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.ParameterizedType.canAssignTo(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.ParameterizedType.canAssignTo(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.ParameterizedType.canAssignTo(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.ParameterizedType.canAssignTo(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.ParameterizedType.canAssignTo(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.ParameterizedType.canAssignTo(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:250)
            com.google.javascript.rhino.jstype.ParameterizedType.canAssignTo(ParameterizedType.java:50)
            com.google.javascript.jscomp.TypeValidator.expectArgumentMatchesParameter(TypeValidator.java:428) */
        typeValidator.expectArgumentMatchesParameter(null, null, parameterizedType, null, null, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectValidTypeofName
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expectValidTypeofName(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectValidTypeofName(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getSourceName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: report(JSError.make(t.getSourceName(), n, UNKNOWN_TYPEOF_VALUE, found));
 *  */
    @Test
    public void testExpectValidTypeofName_ThrowNullPointerException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectValidTypeofName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectValidTypeofName(TypeValidator.java:165) */
        typeValidator.expectValidTypeofName(null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method expectValidTypeofName(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, java.lang.String)
    
    @Test
    public void testExpectValidTypeofName1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        String string = "";
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method expectValidTypeofNameMethod = typeValidatorClazz.getDeclaredMethod("expectValidTypeofName", nodeTraversalType, numberNodeType, stringType);
        expectValidTypeofNameMethod.setAccessible(true);
        java.lang.Object[] expectValidTypeofNameMethodArguments = new java.lang.Object[3];
        expectValidTypeofNameMethodArguments[0] = nodeTraversal;
        expectValidTypeofNameMethodArguments[1] = numberNode;
        expectValidTypeofNameMethodArguments[2] = string;
        expectValidTypeofNameMethod.invoke(typeValidator, expectValidTypeofNameMethodArguments);
    }
    
    @Test
    public void testExpectValidTypeofName2() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = new Node(0);
        
        typeValidator.expectValidTypeofName(nodeTraversal, node, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectAllInterfaceProperties
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expectAllInterfaceProperties(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectAllInterfaceProperties(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getInstanceType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ObjectType instance = type.getInstanceType();
 *  */
    @Test
    public void testExpectAllInterfaceProperties_ThrowNullPointerException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectAllInterfaceProperties] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectAllInterfaceProperties(TypeValidator.java:594) */
        typeValidator.expectAllInterfaceProperties(null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method expectAllInterfaceProperties(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectAllInterfaceProperties(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getInstanceType()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: ObjectType instance = type.getInstanceType();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testExpectAllInterfaceProperties_ThrowIllegalStateException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        typeValidator.expectAllInterfaceProperties(null, null, noType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method expectUndeclaredVariable(java.lang.String, com.google.javascript.jscomp.CompilerInput, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope$Var, java.lang.String, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectUndeclaredVariable(java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope.Var,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testExpectUndeclaredVariable() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        Node node = new Node(1);
        Scope.Arguments arguments = new Scope.Arguments(null);
        
        Scope.Arguments actual = ((Scope.Arguments) typeValidator.expectUndeclaredVariable(null, null, node, null, arguments, null, null));
        
        Scope.Arguments expected = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        String name = "arguments";
        setField(expected, "com.google.javascript.jscomp.Scope$Var", "name", name);
        setField(expected, "com.google.javascript.jscomp.Scope$Var", "index", -1);
        
        // com.google.javascript.jscomp.Scope.Arguments has overridden equals method
        assertEquals(expected, actual);
        
        JSType finalArgumentsType = ((JSType) getFieldValue(arguments, "com.google.javascript.jscomp.Scope$Var", "type"));
        
        assertNull(finalArgumentsType);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectUndeclaredVariable(java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope.Var,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (varType != typeRegistry.getNativeType(UNKNOWN_TYPE)): True}
 * @utbot.executesCondition {@code (varType != typeRegistry.getNativeType(UNKNOWN_TYPE)): False}
 * @utbot.returnsFrom {@code return newVar;}
 *  */
    @Test
    public void testExpectUndeclaredVariable_VarTypeEqualsTypeRegistryGetNativeType_1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(1);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class anonymousPredicateType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, enumElementTypeType, scopeType, intType, compilerInputType, anonymousPredicateType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[8];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = enumElementType;
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Method expectUndeclaredVariableMethod = typeValidatorClazz.getDeclaredMethod("expectUndeclaredVariable", stringType, compilerInputType, nodeType, nodeType, varClazz, stringType, enumElementTypeType);
        expectUndeclaredVariableMethod.setAccessible(true);
        java.lang.Object[] expectUndeclaredVariableMethodArguments = new java.lang.Object[7];
        expectUndeclaredVariableMethodArguments[0] = ((Object) null);
        expectUndeclaredVariableMethodArguments[1] = ((Object) null);
        expectUndeclaredVariableMethodArguments[2] = stringNode;
        expectUndeclaredVariableMethodArguments[3] = ((Object) null);
        expectUndeclaredVariableMethodArguments[4] = var;
        expectUndeclaredVariableMethodArguments[5] = ((Object) null);
        expectUndeclaredVariableMethodArguments[6] = ((Object) null);
        Scope.Var actual = ((Scope.Var) expectUndeclaredVariableMethod.invoke(typeValidator, expectUndeclaredVariableMethodArguments));
        
        Scope.Var expected = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        expected.setType(enumElementType);
        
        // com.google.javascript.jscomp.Scope.Var has overridden equals method
        assertEquals(expected, actual);
        
        JSTypeRegistry typeValidatorTypeRegistry = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes0 = ((JSType) get(typeValidatorTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typeValidatorTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes1 = ((JSType) get(typeValidatorTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry typeValidatorTypeRegistry2 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes2 = ((JSType) get(typeValidatorTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry typeValidatorTypeRegistry3 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes3 = ((JSType) get(typeValidatorTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry typeValidatorTypeRegistry4 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes4 = ((JSType) get(typeValidatorTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry typeValidatorTypeRegistry5 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes5 = ((JSType) get(typeValidatorTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry typeValidatorTypeRegistry6 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes6 = ((JSType) get(typeValidatorTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry typeValidatorTypeRegistry7 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes7 = ((JSType) get(typeValidatorTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry typeValidatorTypeRegistry8 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes8 = ((JSType) get(typeValidatorTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry typeValidatorTypeRegistry9 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes9 = ((JSType) get(typeValidatorTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry typeValidatorTypeRegistry10 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes10 = ((JSType) get(typeValidatorTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry typeValidatorTypeRegistry11 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes11 = ((JSType) get(typeValidatorTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry typeValidatorTypeRegistry12 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes12 = ((JSType) get(typeValidatorTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry typeValidatorTypeRegistry13 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes13 = ((JSType) get(typeValidatorTypeRegistry13TypeRegistryNativeTypes, 13));
        JSTypeRegistry typeValidatorTypeRegistry14 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes14 = ((JSType) get(typeValidatorTypeRegistry14TypeRegistryNativeTypes, 14));
        JSTypeRegistry typeValidatorTypeRegistry15 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes15 = ((JSType) get(typeValidatorTypeRegistry15TypeRegistryNativeTypes, 15));
        JSTypeRegistry typeValidatorTypeRegistry16 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes16 = ((JSType) get(typeValidatorTypeRegistry16TypeRegistryNativeTypes, 16));
        JSTypeRegistry typeValidatorTypeRegistry17 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes17 = ((JSType) get(typeValidatorTypeRegistry17TypeRegistryNativeTypes, 17));
        JSTypeRegistry typeValidatorTypeRegistry18 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes18 = ((JSType) get(typeValidatorTypeRegistry18TypeRegistryNativeTypes, 18));
        JSTypeRegistry typeValidatorTypeRegistry19 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes19 = ((JSType) get(typeValidatorTypeRegistry19TypeRegistryNativeTypes, 19));
        JSTypeRegistry typeValidatorTypeRegistry20 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes20 = ((JSType) get(typeValidatorTypeRegistry20TypeRegistryNativeTypes, 20));
        JSTypeRegistry typeValidatorTypeRegistry21 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes21 = ((JSType) get(typeValidatorTypeRegistry21TypeRegistryNativeTypes, 21));
        JSTypeRegistry typeValidatorTypeRegistry22 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes22 = ((JSType) get(typeValidatorTypeRegistry22TypeRegistryNativeTypes, 22));
        JSTypeRegistry typeValidatorTypeRegistry23 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes23 = ((JSType) get(typeValidatorTypeRegistry23TypeRegistryNativeTypes, 23));
        JSTypeRegistry typeValidatorTypeRegistry24 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes24 = ((JSType) get(typeValidatorTypeRegistry24TypeRegistryNativeTypes, 24));
        JSTypeRegistry typeValidatorTypeRegistry25 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry25TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes25 = ((JSType) get(typeValidatorTypeRegistry25TypeRegistryNativeTypes, 25));
        JSTypeRegistry typeValidatorTypeRegistry26 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry26TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes26 = ((JSType) get(typeValidatorTypeRegistry26TypeRegistryNativeTypes, 26));
        JSTypeRegistry typeValidatorTypeRegistry27 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry27TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes27 = ((JSType) get(typeValidatorTypeRegistry27TypeRegistryNativeTypes, 27));
        JSTypeRegistry typeValidatorTypeRegistry28 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry28TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes28 = ((JSType) get(typeValidatorTypeRegistry28TypeRegistryNativeTypes, 28));
        JSTypeRegistry typeValidatorTypeRegistry29 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry29TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes29 = ((JSType) get(typeValidatorTypeRegistry29TypeRegistryNativeTypes, 29));
        JSTypeRegistry typeValidatorTypeRegistry30 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry30TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes30 = ((JSType) get(typeValidatorTypeRegistry30TypeRegistryNativeTypes, 30));
        JSTypeRegistry typeValidatorTypeRegistry31 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry31TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry31, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes31 = ((JSType) get(typeValidatorTypeRegistry31TypeRegistryNativeTypes, 31));
        JSTypeRegistry typeValidatorTypeRegistry32 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry32TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry32, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes32 = ((JSType) get(typeValidatorTypeRegistry32TypeRegistryNativeTypes, 32));
        JSTypeRegistry typeValidatorTypeRegistry33 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry33TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry33, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes33 = ((JSType) get(typeValidatorTypeRegistry33TypeRegistryNativeTypes, 33));
        JSTypeRegistry typeValidatorTypeRegistry34 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry34TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry34, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes34 = ((JSType) get(typeValidatorTypeRegistry34TypeRegistryNativeTypes, 34));
        JSTypeRegistry typeValidatorTypeRegistry35 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry35TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry35, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes35 = ((JSType) get(typeValidatorTypeRegistry35TypeRegistryNativeTypes, 35));
        JSTypeRegistry typeValidatorTypeRegistry36 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry36TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry36, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes36 = ((JSType) get(typeValidatorTypeRegistry36TypeRegistryNativeTypes, 36));
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes0);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes1);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes2);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes3);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes4);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes5);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes6);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes7);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes8);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes9);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes10);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes11);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes12);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes13);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes14);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes15);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes16);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes17);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes18);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes19);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes20);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes21);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes22);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes23);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes24);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes25);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes26);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes27);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes28);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes29);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes30);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes31);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes32);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes33);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes34);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes35);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes36);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectUndeclaredVariable(java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope.Var,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (varType != typeRegistry.getNativeType(UNKNOWN_TYPE)): False}
 * @utbot.returnsFrom {@code return newVar;}
 *  */
    @Test
    public void testExpectUndeclaredVariable_VarTypeEqualsTypeRegistryGetNativeType() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[40];
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        nativeTypes[35] = ((JSType) enumElementType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        Node node = new Node(4);
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class anonymousPredicateType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, enumElementTypeType, scopeType, intType, compilerInputType, anonymousPredicateType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[8];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = enumElementType;
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        Scope.Var actual = typeValidator.expectUndeclaredVariable(null, null, node, null, var, null, null);
        
        Scope.Var expected = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        expected.setType(enumElementType);
        
        // com.google.javascript.jscomp.Scope.Var has overridden equals method
        assertEquals(expected, actual);
        
        JSTypeRegistry typeValidatorTypeRegistry = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes0 = ((JSType) get(typeValidatorTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typeValidatorTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes1 = ((JSType) get(typeValidatorTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry typeValidatorTypeRegistry2 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes2 = ((JSType) get(typeValidatorTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry typeValidatorTypeRegistry3 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes3 = ((JSType) get(typeValidatorTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry typeValidatorTypeRegistry4 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes4 = ((JSType) get(typeValidatorTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry typeValidatorTypeRegistry5 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes5 = ((JSType) get(typeValidatorTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry typeValidatorTypeRegistry6 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes6 = ((JSType) get(typeValidatorTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry typeValidatorTypeRegistry7 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes7 = ((JSType) get(typeValidatorTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry typeValidatorTypeRegistry8 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes8 = ((JSType) get(typeValidatorTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry typeValidatorTypeRegistry9 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes9 = ((JSType) get(typeValidatorTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry typeValidatorTypeRegistry10 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes10 = ((JSType) get(typeValidatorTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry typeValidatorTypeRegistry11 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes11 = ((JSType) get(typeValidatorTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry typeValidatorTypeRegistry12 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes12 = ((JSType) get(typeValidatorTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry typeValidatorTypeRegistry13 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes13 = ((JSType) get(typeValidatorTypeRegistry13TypeRegistryNativeTypes, 13));
        JSTypeRegistry typeValidatorTypeRegistry14 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes14 = ((JSType) get(typeValidatorTypeRegistry14TypeRegistryNativeTypes, 14));
        JSTypeRegistry typeValidatorTypeRegistry15 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes15 = ((JSType) get(typeValidatorTypeRegistry15TypeRegistryNativeTypes, 15));
        JSTypeRegistry typeValidatorTypeRegistry16 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes16 = ((JSType) get(typeValidatorTypeRegistry16TypeRegistryNativeTypes, 16));
        JSTypeRegistry typeValidatorTypeRegistry17 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes17 = ((JSType) get(typeValidatorTypeRegistry17TypeRegistryNativeTypes, 17));
        JSTypeRegistry typeValidatorTypeRegistry18 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes18 = ((JSType) get(typeValidatorTypeRegistry18TypeRegistryNativeTypes, 18));
        JSTypeRegistry typeValidatorTypeRegistry19 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes19 = ((JSType) get(typeValidatorTypeRegistry19TypeRegistryNativeTypes, 19));
        JSTypeRegistry typeValidatorTypeRegistry20 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes20 = ((JSType) get(typeValidatorTypeRegistry20TypeRegistryNativeTypes, 20));
        JSTypeRegistry typeValidatorTypeRegistry21 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes21 = ((JSType) get(typeValidatorTypeRegistry21TypeRegistryNativeTypes, 21));
        JSTypeRegistry typeValidatorTypeRegistry22 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes22 = ((JSType) get(typeValidatorTypeRegistry22TypeRegistryNativeTypes, 22));
        JSTypeRegistry typeValidatorTypeRegistry23 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes23 = ((JSType) get(typeValidatorTypeRegistry23TypeRegistryNativeTypes, 23));
        JSTypeRegistry typeValidatorTypeRegistry24 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes24 = ((JSType) get(typeValidatorTypeRegistry24TypeRegistryNativeTypes, 24));
        JSTypeRegistry typeValidatorTypeRegistry25 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry25TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes25 = ((JSType) get(typeValidatorTypeRegistry25TypeRegistryNativeTypes, 25));
        JSTypeRegistry typeValidatorTypeRegistry26 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry26TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes26 = ((JSType) get(typeValidatorTypeRegistry26TypeRegistryNativeTypes, 26));
        JSTypeRegistry typeValidatorTypeRegistry27 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry27TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes27 = ((JSType) get(typeValidatorTypeRegistry27TypeRegistryNativeTypes, 27));
        JSTypeRegistry typeValidatorTypeRegistry28 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry28TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes28 = ((JSType) get(typeValidatorTypeRegistry28TypeRegistryNativeTypes, 28));
        JSTypeRegistry typeValidatorTypeRegistry29 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry29TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes29 = ((JSType) get(typeValidatorTypeRegistry29TypeRegistryNativeTypes, 29));
        JSTypeRegistry typeValidatorTypeRegistry30 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry30TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes30 = ((JSType) get(typeValidatorTypeRegistry30TypeRegistryNativeTypes, 30));
        JSTypeRegistry typeValidatorTypeRegistry31 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry31TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry31, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes31 = ((JSType) get(typeValidatorTypeRegistry31TypeRegistryNativeTypes, 31));
        JSTypeRegistry typeValidatorTypeRegistry32 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry32TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry32, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes32 = ((JSType) get(typeValidatorTypeRegistry32TypeRegistryNativeTypes, 32));
        JSTypeRegistry typeValidatorTypeRegistry33 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry33TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry33, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes33 = ((JSType) get(typeValidatorTypeRegistry33TypeRegistryNativeTypes, 33));
        JSTypeRegistry typeValidatorTypeRegistry34 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry34TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry34, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes34 = ((JSType) get(typeValidatorTypeRegistry34TypeRegistryNativeTypes, 34));
        JSTypeRegistry typeValidatorTypeRegistry35 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry35TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry35, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes36 = ((JSType) get(typeValidatorTypeRegistry35TypeRegistryNativeTypes, 36));
        JSTypeRegistry typeValidatorTypeRegistry36 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry36TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry36, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes37 = ((JSType) get(typeValidatorTypeRegistry36TypeRegistryNativeTypes, 37));
        JSTypeRegistry typeValidatorTypeRegistry37 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry37TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry37, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes38 = ((JSType) get(typeValidatorTypeRegistry37TypeRegistryNativeTypes, 38));
        JSTypeRegistry typeValidatorTypeRegistry38 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry38TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry38, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes39 = ((JSType) get(typeValidatorTypeRegistry38TypeRegistryNativeTypes, 39));
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes0);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes1);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes2);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes3);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes4);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes5);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes6);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes7);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes8);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes9);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes10);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes11);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes12);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes13);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes14);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes15);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes16);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes17);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes18);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes19);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes20);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes21);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes22);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes23);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes24);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes25);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes26);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes27);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes28);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes29);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes30);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes31);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes32);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes33);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes34);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes36);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes37);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes38);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes39);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expectUndeclaredVariable(java.lang.String, com.google.javascript.jscomp.CompilerInput, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope$Var, java.lang.String, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectUndeclaredVariable(java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope.Var,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (n.isGetProp() || NodeUtil.isObjectLitKey(n, parent)): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: JSDocInfo info = n.getJSDocInfo();
 *  */
    @Test
    public void testExpectUndeclaredVariable_ThrowClassCastException() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        int[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable] produces [java.lang.ClassCastException: class [I cannot be cast to class com.google.javascript.rhino.JSDocInfo ([I is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.JSDocInfo is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @20990919)]
            com.google.javascript.rhino.Node.getJSDocInfo(Node.java:1851)
            com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable(TypeValidator.java:532) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class stringType = Class.forName("java.lang.String");
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method expectUndeclaredVariableMethod = typeValidatorClazz.getDeclaredMethod("expectUndeclaredVariable", stringType, compilerInputType, numberNodeType, numberNodeType, varType, stringType, jSTypeType);
        expectUndeclaredVariableMethod.setAccessible(true);
        java.lang.Object[] expectUndeclaredVariableMethodArguments = new java.lang.Object[7];
        expectUndeclaredVariableMethodArguments[0] = ((Object) null);
        expectUndeclaredVariableMethodArguments[1] = ((Object) null);
        expectUndeclaredVariableMethodArguments[2] = numberNode;
        expectUndeclaredVariableMethodArguments[3] = ((Object) null);
        expectUndeclaredVariableMethodArguments[4] = ((Object) null);
        expectUndeclaredVariableMethodArguments[5] = ((Object) null);
        expectUndeclaredVariableMethodArguments[6] = ((Object) null);
        try {
            expectUndeclaredVariableMethod.invoke(typeValidator, expectUndeclaredVariableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectUndeclaredVariable(java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope.Var,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (n.isGetProp() || NodeUtil.isObjectLitKey(n, parent)): True}
 * @utbot.executesCondition {@code (NodeUtil.isObjectLitKey(n, parent)): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope.Var#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType varType = var.getType();
 *  */
    @Test
    public void testExpectUndeclaredVariable_ThrowNullPointerException_2() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable(TypeValidator.java:540) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class stringType = Class.forName("java.lang.String");
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method expectUndeclaredVariableMethod = typeValidatorClazz.getDeclaredMethod("expectUndeclaredVariable", stringType, compilerInputType, numberNodeType, numberNodeType, varType, stringType, jSTypeType);
        expectUndeclaredVariableMethod.setAccessible(true);
        java.lang.Object[] expectUndeclaredVariableMethodArguments = new java.lang.Object[7];
        expectUndeclaredVariableMethodArguments[0] = ((Object) null);
        expectUndeclaredVariableMethodArguments[1] = ((Object) null);
        expectUndeclaredVariableMethodArguments[2] = numberNode;
        expectUndeclaredVariableMethodArguments[3] = ((Object) null);
        expectUndeclaredVariableMethodArguments[4] = ((Object) null);
        expectUndeclaredVariableMethodArguments[5] = ((Object) null);
        expectUndeclaredVariableMethodArguments[6] = ((Object) null);
        try {
            expectUndeclaredVariableMethod.invoke(typeValidator, expectUndeclaredVariableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectUndeclaredVariable(java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope.Var,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isGetProp()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.isGetProp() || NodeUtil.isObjectLitKey(n, parent)
 *  */
    @Test
    public void testExpectUndeclaredVariable_ThrowNullPointerException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable(TypeValidator.java:530) */
        typeValidator.expectUndeclaredVariable(null, null, null, null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectUndeclaredVariable(java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope.Var,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (n.isGetProp() || NodeUtil.isObjectLitKey(n, parent)): True}
 * @utbot.executesCondition {@code (NodeUtil.isObjectLitKey(n, parent)): True}
 * @utbot.executesCondition {@code (info == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: info = parent.getJSDocInfo();
 *  */
    @Test
    public void testExpectUndeclaredVariable_ThrowNullPointerException_4() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(148);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable(TypeValidator.java:534) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class stringType = Class.forName("java.lang.String");
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method expectUndeclaredVariableMethod = typeValidatorClazz.getDeclaredMethod("expectUndeclaredVariable", stringType, compilerInputType, numberNodeType, numberNodeType, varType, stringType, jSTypeType);
        expectUndeclaredVariableMethod.setAccessible(true);
        java.lang.Object[] expectUndeclaredVariableMethodArguments = new java.lang.Object[7];
        expectUndeclaredVariableMethodArguments[0] = ((Object) null);
        expectUndeclaredVariableMethodArguments[1] = ((Object) null);
        expectUndeclaredVariableMethodArguments[2] = numberNode;
        expectUndeclaredVariableMethodArguments[3] = ((Object) null);
        expectUndeclaredVariableMethodArguments[4] = ((Object) null);
        expectUndeclaredVariableMethodArguments[5] = ((Object) null);
        expectUndeclaredVariableMethodArguments[6] = ((Object) null);
        try {
            expectUndeclaredVariableMethod.invoke(typeValidator, expectUndeclaredVariableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectUndeclaredVariable(java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope.Var,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (n.isGetProp() || NodeUtil.isObjectLitKey(n, parent)): False}
 * @utbot.executesCondition {@code (info == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: info = parent.getJSDocInfo();
 *  */
    @Test
    public void testExpectUndeclaredVariable_ThrowNullPointerException_1() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable(TypeValidator.java:534) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class stringType = Class.forName("java.lang.String");
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method expectUndeclaredVariableMethod = typeValidatorClazz.getDeclaredMethod("expectUndeclaredVariable", stringType, compilerInputType, numberNodeType, numberNodeType, varType, stringType, jSTypeType);
        expectUndeclaredVariableMethod.setAccessible(true);
        java.lang.Object[] expectUndeclaredVariableMethodArguments = new java.lang.Object[7];
        expectUndeclaredVariableMethodArguments[0] = ((Object) null);
        expectUndeclaredVariableMethodArguments[1] = ((Object) null);
        expectUndeclaredVariableMethodArguments[2] = numberNode;
        expectUndeclaredVariableMethodArguments[3] = ((Object) null);
        expectUndeclaredVariableMethodArguments[4] = ((Object) null);
        expectUndeclaredVariableMethodArguments[5] = ((Object) null);
        expectUndeclaredVariableMethodArguments[6] = ((Object) null);
        try {
            expectUndeclaredVariableMethod.invoke(typeValidator, expectUndeclaredVariableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectUndeclaredVariable(java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope.Var,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (n.isGetProp() || NodeUtil.isObjectLitKey(n, parent)): True}
 * @utbot.executesCondition {@code (NodeUtil.isObjectLitKey(n, parent)): False}
 * @utbot.executesCondition {@code (varType != null): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope.Var#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: varType != typeRegistry.getNativeType(UNKNOWN_TYPE)
 *  */
    @Test
    public void testExpectUndeclaredVariable_ThrowNullPointerException_3() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Node node = new Node(-254);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class anonymousPredicateType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, enumElementTypeType, scopeType, intType, compilerInputType, anonymousPredicateType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[8];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = enumElementType;
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable(TypeValidator.java:546) */
        typeValidator.expectUndeclaredVariable(null, null, node, null, var, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method expectUndeclaredVariable(java.lang.String, com.google.javascript.jscomp.CompilerInput, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope$Var, java.lang.String, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectUndeclaredVariable(java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope.Var,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (n.isGetProp() || NodeUtil.isObjectLitKey(n, parent)): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isGetProp()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSDocInfo()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: JSDocInfo info = n.getJSDocInfo();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testExpectUndeclaredVariable_ThrowUnsupportedOperationException() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class stringType = Class.forName("java.lang.String");
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method expectUndeclaredVariableMethod = typeValidatorClazz.getDeclaredMethod("expectUndeclaredVariable", stringType, compilerInputType, numberNodeType, numberNodeType, varType, stringType, jSTypeType);
        expectUndeclaredVariableMethod.setAccessible(true);
        java.lang.Object[] expectUndeclaredVariableMethodArguments = new java.lang.Object[7];
        expectUndeclaredVariableMethodArguments[0] = ((Object) null);
        expectUndeclaredVariableMethodArguments[1] = ((Object) null);
        expectUndeclaredVariableMethodArguments[2] = numberNode;
        expectUndeclaredVariableMethodArguments[3] = ((Object) null);
        expectUndeclaredVariableMethodArguments[4] = ((Object) null);
        expectUndeclaredVariableMethodArguments[5] = ((Object) null);
        expectUndeclaredVariableMethodArguments[6] = ((Object) null);
        try {
            expectUndeclaredVariableMethod.invoke(typeValidator, expectUndeclaredVariableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.formatFoundRequired
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method formatFoundRequired(java.lang.String, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testFormatFoundRequired1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method formatFoundRequiredMethod = typeValidatorClazz.getDeclaredMethod("formatFoundRequired", stringType, jSTypeType, jSTypeType);
        formatFoundRequiredMethod.setAccessible(true);
        java.lang.Object[] formatFoundRequiredMethodArguments = new java.lang.Object[3];
        formatFoundRequiredMethodArguments[0] = ((Object) null);
        formatFoundRequiredMethodArguments[1] = ((Object) null);
        formatFoundRequiredMethodArguments[2] = ((Object) null);
        String actual = ((String) formatFoundRequiredMethod.invoke(typeValidator, formatFoundRequiredMethodArguments));
        
        String expected = "null\nfound   : null\nrequired: null";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getReadableJSTypeName(com.google.javascript.rhino.Node, boolean)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#getReadableJSTypeName(com.google.javascript.rhino.Node,boolean)}
 * @utbot.returnsFrom {@code return type.toString();}
 *  */
    @Test
    public void testGetReadableJSTypeName_ReturnTypeToString() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(42);
        Object jsType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        FunctionType ownerFunction = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(jsType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction", ownerFunction);
        setField(numberNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Method getReadableJSTypeNameMethod = typeValidatorClazz.getDeclaredMethod("getReadableJSTypeName", numberNodeType, booleanType);
        getReadableJSTypeNameMethod.setAccessible(true);
        java.lang.Object[] getReadableJSTypeNameMethodArguments = new java.lang.Object[2];
        getReadableJSTypeNameMethodArguments[0] = numberNode;
        getReadableJSTypeNameMethodArguments[1] = false;
        String actual = ((String) getReadableJSTypeNameMethod.invoke(typeValidator, getReadableJSTypeNameMethodArguments));
        
        String expected = "Function";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#getReadableJSTypeName(com.google.javascript.rhino.Node,boolean)}
 * @utbot.returnsFrom {@code return type.toString();}
 *  */
    @Test
    public void testGetReadableJSTypeName_ReturnTypeToString_1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        Object jsType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        FunctionType ownerFunction = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(jsType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction", ownerFunction);
        setField(stringNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Method getReadableJSTypeNameMethod = typeValidatorClazz.getDeclaredMethod("getReadableJSTypeName", stringNodeType, booleanType);
        getReadableJSTypeNameMethod.setAccessible(true);
        java.lang.Object[] getReadableJSTypeNameMethodArguments = new java.lang.Object[2];
        getReadableJSTypeNameMethodArguments[0] = stringNode;
        getReadableJSTypeNameMethodArguments[1] = false;
        String actual = ((String) getReadableJSTypeNameMethod.invoke(typeValidator, getReadableJSTypeNameMethodArguments));
        
        String expected = "Function";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getReadableJSTypeName(com.google.javascript.rhino.Node, boolean)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#getReadableJSTypeName(com.google.javascript.rhino.Node,boolean)}
 * @utbot.executesCondition {@code (n.isGetProp()): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JSType type = getJSType(n);
 *  */
    @Test
    public void testGetReadableJSTypeName_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        Node node = new Node(2);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:788)
            com.google.javascript.jscomp.TypeValidator.getJSType(TypeValidator.java:781)
            com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName(TypeValidator.java:747) */
        typeValidator.getReadableJSTypeName(node, false);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#getReadableJSTypeName(com.google.javascript.rhino.Node,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isGetProp()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.isGetProp()
 *  */
    @Test
    public void testGetReadableJSTypeName_ThrowNullPointerException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName(TypeValidator.java:722) */
        typeValidator.getReadableJSTypeName(null, false);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#getReadableJSTypeName(com.google.javascript.rhino.Node,boolean)}
 * @utbot.executesCondition {@code (n.isGetProp()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ObjectType objectType = getJSType(n.getFirstChild()).dereference();
 *  */
    @Test
    public void testGetReadableJSTypeName_ThrowNullPointerException_1() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getJSType(TypeValidator.java:775)
            com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName(TypeValidator.java:723) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Method getReadableJSTypeNameMethod = typeValidatorClazz.getDeclaredMethod("getReadableJSTypeName", stringNodeType, booleanType);
        getReadableJSTypeNameMethod.setAccessible(true);
        java.lang.Object[] getReadableJSTypeNameMethodArguments = new java.lang.Object[2];
        getReadableJSTypeNameMethodArguments[0] = stringNode;
        getReadableJSTypeNameMethodArguments[1] = false;
        try {
            getReadableJSTypeNameMethod.invoke(typeValidator, getReadableJSTypeNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#getReadableJSTypeName(com.google.javascript.rhino.Node,boolean)}
 * @utbot.executesCondition {@code (n.isGetProp()): False}
 * @utbot.executesCondition {@code (dereference): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: type.isFunctionPrototypeType() || (type.toObjectType() != null && type.toObjectType().getConstructor() != null)
 *  */
    @Test
    public void testGetReadableJSTypeName_ThrowNullPointerException_4() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        Node node = new Node(42);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName(TypeValidator.java:756) */
        typeValidator.getReadableJSTypeName(node, false);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#getReadableJSTypeName(com.google.javascript.rhino.Node,boolean)}
 * @utbot.executesCondition {@code (n.isGetProp()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType type = getJSType(n);
 *  */
    @Test
    public void testGetReadableJSTypeName_ThrowNullPointerException_2() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(2);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:788)
            com.google.javascript.jscomp.TypeValidator.getJSType(TypeValidator.java:781)
            com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName(TypeValidator.java:747) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Method getReadableJSTypeNameMethod = typeValidatorClazz.getDeclaredMethod("getReadableJSTypeName", stringNodeType, booleanType);
        getReadableJSTypeNameMethod.setAccessible(true);
        java.lang.Object[] getReadableJSTypeNameMethodArguments = new java.lang.Object[2];
        getReadableJSTypeNameMethodArguments[0] = stringNode;
        getReadableJSTypeNameMethodArguments[1] = false;
        try {
            getReadableJSTypeNameMethod.invoke(typeValidator, getReadableJSTypeNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#getReadableJSTypeName(com.google.javascript.rhino.Node,boolean)}
 * @utbot.executesCondition {@code (n.isGetProp()): False}
 * @utbot.executesCondition {@code (dereference): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#dereference()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ObjectType dereferenced = type.dereference();
 *  */
    @Test
    public void testGetReadableJSTypeName_ThrowNullPointerException_3() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-254);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName(TypeValidator.java:749) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Method getReadableJSTypeNameMethod = typeValidatorClazz.getDeclaredMethod("getReadableJSTypeName", stringNodeType, booleanType);
        getReadableJSTypeNameMethod.setAccessible(true);
        java.lang.Object[] getReadableJSTypeNameMethodArguments = new java.lang.Object[2];
        getReadableJSTypeNameMethodArguments[0] = stringNode;
        getReadableJSTypeNameMethodArguments[1] = true;
        try {
            getReadableJSTypeNameMethod.invoke(typeValidator, getReadableJSTypeNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#getReadableJSTypeName(com.google.javascript.rhino.Node,boolean)}
 * @utbot.executesCondition {@code (n.isGetProp()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ObjectType objectType = getJSType(n.getFirstChild()).dereference();
 *  */
    @Test
    public void testGetReadableJSTypeName_ThrowNullPointerException_5() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName(TypeValidator.java:723) */
        typeValidator.getReadableJSTypeName(node, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectInterfaceProperty
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expectInterfaceProperty(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.ObjectType, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectInterfaceProperty(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#getSlot(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: StaticSlot<JSType> propSlot = instance.getSlot(prop);
 *  */
    @Test
    public void testExpectInterfaceProperty_ThrowNullPointerException() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectInterfaceProperty] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectInterfaceProperty(TypeValidator.java:611) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class stringType = Class.forName("java.lang.String");
        Method expectInterfacePropertyMethod = typeValidatorClazz.getDeclaredMethod("expectInterfaceProperty", nodeTraversalType, nodeType, objectTypeType, objectTypeType, stringType);
        expectInterfacePropertyMethod.setAccessible(true);
        java.lang.Object[] expectInterfacePropertyMethodArguments = new java.lang.Object[5];
        expectInterfacePropertyMethodArguments[0] = ((Object) null);
        expectInterfacePropertyMethodArguments[1] = ((Object) null);
        expectInterfacePropertyMethodArguments[2] = ((Object) null);
        expectInterfacePropertyMethodArguments[3] = ((Object) null);
        expectInterfacePropertyMethodArguments[4] = ((Object) null);
        try {
            expectInterfacePropertyMethod.invoke(typeValidator, expectInterfacePropertyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.getMismatches
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMismatches()
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#getMismatches()}
 * @utbot.returnsFrom {@code return mismatches;}
 *  */
    @Test
    public void testGetMismatches_ReturnMismatches() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        Iterable actual = typeValidator.getMismatches();
        
        assertNull(actual);
        
        List finalTypeValidatorMismatches = ((List) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "mismatches"));
        
        assertNull(finalTypeValidatorMismatches);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.setShouldReport
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setShouldReport(boolean)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#setShouldReport(boolean)}
 *  */
    @Test
    public void testSetShouldReport() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        typeValidator.setShouldReport(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method expectObject(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectObject(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testExpectObject_ReturnTrue() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        boolean actual = typeValidator.expectObject(null, null, functionType, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectObject(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testExpectObject_ReturnTrue_1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        FunctionType primitiveType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(enumElementType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType);
        
        boolean actual = typeValidator.expectObject(null, null, enumElementType, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectObject(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testExpectObject_ReturnTrue_2() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        FunctionType primitiveType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(primitiveType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType1);
        setField(enumElementType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType);
        
        boolean actual = typeValidator.expectObject(null, null, enumElementType, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectObject(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testExpectObject_ReturnTrue_3() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        ParameterizedType primitiveType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        FunctionType referencedType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(primitiveType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(enumElementType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType);
        
        boolean actual = typeValidator.expectObject(null, null, enumElementType, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectObject(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testExpectObject_ReturnTrue_4() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        ParameterizedType primitiveType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        setField(primitiveType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(enumElementType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType);
        
        boolean actual = typeValidator.expectObject(null, null, enumElementType, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectObject(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testExpectObject_ReturnTrue_5() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        ParameterizedType primitiveType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(primitiveType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(enumElementType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType);
        
        boolean actual = typeValidator.expectObject(null, null, enumElementType, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectObject(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testExpectObject_ReturnTrue_6() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        ParameterizedType primitiveType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        EnumElementType referencedType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        FunctionType primitiveType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(referencedType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType1);
        setField(primitiveType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(enumElementType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType);
        
        boolean actual = typeValidator.expectObject(null, null, enumElementType, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectObject(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testExpectObject_ReturnTrue_7() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        ParameterizedType primitiveType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        FunctionType referencedType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(primitiveType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(enumElementType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType);
        
        boolean actual = typeValidator.expectObject(null, null, enumElementType, null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method expectObject(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectObject(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testExpectObject_ReturnTrue_8() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        boolean actual = typeValidator.expectObject(null, null, noType, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectObject(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testExpectObject_ReturnTrue_9() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        
        boolean actual = typeValidator.expectObject(null, null, unknownType, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectObject(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testExpectObject_ReturnTrue_10() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        Object primitiveType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        setField(enumElementType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType);
        
        boolean actual = typeValidator.expectObject(null, null, enumElementType, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectObject(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testExpectObject_ReturnTrue_11() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        UnknownType primitiveType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(enumElementType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType);
        
        boolean actual = typeValidator.expectObject(null, null, enumElementType, null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expectObject(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectObject(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#matchesObjectContext()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !type.matchesObjectContext()
 *  */
    @Test
    public void testExpectObject_ThrowNullPointerException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectObject] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectObject(TypeValidator.java:175) */
        typeValidator.expectObject(null, null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method expectObject(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    @Test
    public void testExpectObject1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType1 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType2 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType3 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType4 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType5 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType6 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType7 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType8 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType9 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType10 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType11 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType12 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType13 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType14 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType15 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType16 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType17 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType18 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType19 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType20 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType21 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType22 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType23 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType24 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType25 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        Object primitiveType26 = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        setField(primitiveType25, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType26);
        setField(primitiveType24, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType25);
        setField(primitiveType23, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType24);
        setField(primitiveType22, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType23);
        setField(primitiveType21, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType22);
        setField(primitiveType20, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType21);
        setField(primitiveType19, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType20);
        setField(primitiveType18, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType19);
        setField(primitiveType17, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType18);
        setField(primitiveType16, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType17);
        setField(primitiveType15, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType16);
        setField(primitiveType14, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType15);
        setField(primitiveType13, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType14);
        setField(primitiveType12, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType13);
        setField(primitiveType11, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType12);
        setField(primitiveType10, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType11);
        setField(primitiveType9, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType10);
        setField(primitiveType8, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType9);
        setField(primitiveType7, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType8);
        setField(primitiveType6, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType7);
        setField(primitiveType5, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType6);
        setField(primitiveType4, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType5);
        setField(primitiveType3, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType4);
        setField(primitiveType2, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType3);
        setField(primitiveType1, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType2);
        setField(primitiveType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType1);
        setField(enumElementType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Method expectObjectMethod = typeValidatorClazz.getDeclaredMethod("expectObject", nodeTraversalType, numberNodeType, enumElementTypeType, stringType);
        expectObjectMethod.setAccessible(true);
        java.lang.Object[] expectObjectMethodArguments = new java.lang.Object[4];
        expectObjectMethodArguments[0] = ((Object) null);
        expectObjectMethodArguments[1] = numberNode;
        expectObjectMethodArguments[2] = enumElementType;
        expectObjectMethodArguments[3] = ((Object) null);
        boolean actual = ((Boolean) expectObjectMethod.invoke(typeValidator, expectObjectMethodArguments));
        
        assertTrue(actual);
    }
    
    @Test
    public void testExpectObject2() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType1 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType2 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType3 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType4 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType5 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType6 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType7 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType8 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType9 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType10 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType11 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType12 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType13 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType14 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType15 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType16 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType17 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType18 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType19 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType20 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType21 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType22 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType23 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType24 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType25 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        NoType primitiveType26 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(primitiveType25, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType26);
        setField(primitiveType24, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType25);
        setField(primitiveType23, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType24);
        setField(primitiveType22, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType23);
        setField(primitiveType21, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType22);
        setField(primitiveType20, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType21);
        setField(primitiveType19, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType20);
        setField(primitiveType18, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType19);
        setField(primitiveType17, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType18);
        setField(primitiveType16, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType17);
        setField(primitiveType15, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType16);
        setField(primitiveType14, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType15);
        setField(primitiveType13, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType14);
        setField(primitiveType12, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType13);
        setField(primitiveType11, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType12);
        setField(primitiveType10, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType11);
        setField(primitiveType9, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType10);
        setField(primitiveType8, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType9);
        setField(primitiveType7, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType8);
        setField(primitiveType6, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType7);
        setField(primitiveType5, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType6);
        setField(primitiveType4, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType5);
        setField(primitiveType3, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType4);
        setField(primitiveType2, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType3);
        setField(primitiveType1, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType2);
        setField(primitiveType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType1);
        setField(enumElementType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType);
        
        boolean actual = typeValidator.expectObject(null, null, enumElementType, null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectActualObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expectActualObject(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectActualObject(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !type.isObject()
 *  */
    @Test
    public void testExpectActualObject_ThrowNullPointerException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectActualObject] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectActualObject(TypeValidator.java:187) */
        typeValidator.expectActualObject(null, null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method expectActualObject(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    @Test
    public void testExpectActualObject1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        UnionType primitiveType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        setField(primitiveType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        setField(enumElementType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType);
        
        typeValidator.expectActualObject(nodeTraversal, null, enumElementType, null);
    }
    
    @Test
    public void testExpectActualObject2() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Node node = new Node(0);
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        String string = "";
        
        typeValidator.expectActualObject(null, node, unionType, string);
    }
    
    @Test
    public void testExpectActualObject3() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        UnionType primitiveType1 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(primitiveType1, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        setField(primitiveType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType1);
        setField(enumElementType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType);
        
        typeValidator.expectActualObject(nodeTraversal, null, enumElementType, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method expectActualObject(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    @Test(expected = StackOverflowError.class)
    public void testExpectActualObject4() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(primitiveType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType);
        setField(enumElementType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType);
        
        typeValidator.expectActualObject(null, null, enumElementType, null);
    }
    
    @Test
    public void testExpectActualObject5() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        UnionType primitiveType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        alternates.add(null);
        setField(primitiveType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        setField(enumElementType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectActualObject] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.isObject(UnionType.java:379)
            com.google.javascript.rhino.jstype.EnumElementType.isObject(EnumElementType.java:112)
            com.google.javascript.jscomp.TypeValidator.expectActualObject(TypeValidator.java:187) */
        typeValidator.expectActualObject(nodeTraversal, null, enumElementType, null);
    }
    
    @Test
    public void testExpectActualObject6() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Node node = new Node(0);
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectActualObject] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.isObject(UnionType.java:379)
            com.google.javascript.jscomp.TypeValidator.expectActualObject(TypeValidator.java:187) */
        typeValidator.expectActualObject(null, node, unionType, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectCanAssignTo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method expectCanAssignTo(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectCanAssignTo(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testExpectCanAssignTo_ReturnTrue() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        
        boolean actual = typeValidator.expectCanAssignTo(null, null, unknownType, null, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectCanAssignTo(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testExpectCanAssignTo_ReturnTrue_1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        boolean actual = typeValidator.expectCanAssignTo(null, null, parameterizedType, null, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectCanAssignTo(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testExpectCanAssignTo_ReturnTrue_2() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        boolean actual = typeValidator.expectCanAssignTo(null, null, parameterizedType, null, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectCanAssignTo(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testExpectCanAssignTo_ReturnTrue_3() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        boolean actual = typeValidator.expectCanAssignTo(null, null, parameterizedType, null, null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expectCanAssignTo(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectCanAssignTo(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#canAssignTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !rightType.canAssignTo(leftType)
 *  */
    @Test
    public void testExpectCanAssignTo_ThrowNullPointerException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectCanAssignTo] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectCanAssignTo(TypeValidator.java:404) */
        typeValidator.expectCanAssignTo(null, null, null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method expectCanAssignTo(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    @Test
    public void testExpectCanAssignTo1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType6 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType7 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType6, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType7);
        setField(referencedType5, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType6);
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        boolean actual = typeValidator.expectCanAssignTo(nodeTraversal, null, parameterizedType, null, null);
        
        assertTrue(actual);
    }
    
    @Test
    public void testExpectCanAssignTo2() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = new Node(0);
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType6 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType7 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType6, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType7);
        setField(referencedType5, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType6);
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        boolean actual = typeValidator.expectCanAssignTo(nodeTraversal, node, parameterizedType, null, null);
        
        assertTrue(actual);
    }
    
    @Test
    public void testExpectCanAssignTo3() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = new Node(0);
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType6 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object referencedType7 = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        setField(referencedType6, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType7);
        setField(referencedType5, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType6);
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        boolean actual = typeValidator.expectCanAssignTo(nodeTraversal, node, parameterizedType, null, null);
        
        assertTrue(actual);
    }
    
    @Test
    public void testExpectCanAssignTo4() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType6 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType7 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType8 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType9 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType8, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType9);
        setField(referencedType7, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType8);
        setField(referencedType6, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType7);
        setField(referencedType5, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType6);
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        boolean actual = typeValidator.expectCanAssignTo(null, null, parameterizedType, null, null);
        
        assertTrue(actual);
    }
    
    @Test
    public void testExpectCanAssignTo5() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = new Node(0);
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType6 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType7 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType8 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType9 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType10 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType11 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object referencedType12 = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
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
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        boolean actual = typeValidator.expectCanAssignTo(nodeTraversal, node, parameterizedType, null, null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method expectCanAssignTo(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    @Test(expected = StackOverflowError.class)
    public void testExpectCanAssignTo6() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = new Node(0);
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        typeValidator.expectCanAssignTo(nodeTraversal, node, parameterizedType, null, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testExpectCanAssignTo7() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = new Node(0);
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(referencedType5, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        typeValidator.expectCanAssignTo(nodeTraversal, node, parameterizedType, null, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testExpectCanAssignTo8() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = new Node(0);
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(referencedType5, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        typeValidator.expectCanAssignTo(nodeTraversal, node, parameterizedType, null, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testExpectCanAssignTo9() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = new Node(0);
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(referencedType5, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        typeValidator.expectCanAssignTo(nodeTraversal, node, parameterizedType, null, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testExpectCanAssignTo10() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType6 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(referencedType6, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(referencedType5, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType6);
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        typeValidator.expectCanAssignTo(null, null, parameterizedType, null, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testExpectCanAssignTo11() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType6 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType7 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType8 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(referencedType8, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(referencedType7, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType8);
        setField(referencedType6, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType7);
        setField(referencedType5, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType6);
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        typeValidator.expectCanAssignTo(null, null, parameterizedType, null, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testExpectCanAssignTo12() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType6 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType7 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType8 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType9 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType9, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType8);
        setField(referencedType8, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType9);
        setField(referencedType7, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType8);
        setField(referencedType6, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType7);
        setField(referencedType5, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType6);
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        typeValidator.expectCanAssignTo(null, null, parameterizedType, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method expectString(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectString(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#matchesStringContext()}
 *  */
    @Test
    public void testExpectString_JSTypeMatchesStringContext() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        typeValidator.expectString(null, null, noType, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expectString(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectString(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !type.matchesStringContext()
 *  */
    @Test
    public void testExpectString_ThrowNullPointerException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectString(TypeValidator.java:209) */
        typeValidator.expectString(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectString(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#matchesStringContext()}
 * @utbot.invokes com.google.javascript.jscomp.TypeValidator#mismatch(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSTypeNative)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: mismatch(t, n, msg, type, STRING_TYPE);
 *  */
    @Test
    public void testExpectString_ThrowNullPointerException_1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:788)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:655)
            com.google.javascript.jscomp.TypeValidator.expectString(TypeValidator.java:210) */
        typeValidator.expectString(null, null, anonymousFunctionType, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method expectString(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    @Test
    public void testExpectString1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[15];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 30 out of bounds for length 15]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:788)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:655)
            com.google.javascript.jscomp.TypeValidator.expectString(TypeValidator.java:210) */
        typeValidator.expectString(nodeTraversal, null, functionType, string);
    }
    
    @Test
    public void testExpectString2() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        LinkedHashMap properties = new LinkedHashMap();
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectString] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:148)
            com.google.javascript.rhino.jstype.PrototypeObjectType.getPropertyType(PrototypeObjectType.java:217)
            com.google.javascript.rhino.jstype.FunctionType.getPropertyType(FunctionType.java:614)
            com.google.javascript.rhino.jstype.PrototypeObjectType.hasOverridenNativeProperty(PrototypeObjectType.java:322)
            com.google.javascript.rhino.jstype.PrototypeObjectType.matchesStringContext(PrototypeObjectType.java:310)
            com.google.javascript.rhino.jstype.FunctionType.matchesStringContext(FunctionType.java:66)
            com.google.javascript.jscomp.TypeValidator.expectString(TypeValidator.java:209) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class errorFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Method expectStringMethod = typeValidatorClazz.getDeclaredMethod("expectString", nodeTraversalType, numberNodeType, errorFunctionTypeType, stringType);
        expectStringMethod.setAccessible(true);
        java.lang.Object[] expectStringMethodArguments = new java.lang.Object[4];
        expectStringMethodArguments[0] = nodeTraversal;
        expectStringMethodArguments[1] = numberNode;
        expectStringMethodArguments[2] = errorFunctionType;
        expectStringMethodArguments[3] = ((Object) null);
        try {
            expectStringMethod.invoke(typeValidator, expectStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExpectString3() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[31];
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
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:650)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:655)
            com.google.javascript.jscomp.TypeValidator.expectString(TypeValidator.java:210) */
        typeValidator.expectString(null, null, anonymousFunctionType, string);
    }
    
    @Test
    public void testExpectString4() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[36];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.registerMismatch(TypeValidator.java:669)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:660)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:650)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:655)
            com.google.javascript.jscomp.TypeValidator.expectString(TypeValidator.java:210) */
        typeValidator.expectString(nodeTraversal, null, anonymousFunctionType, null);
    }
    
    @Test
    public void testExpectString5() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        LinkedHashMap properties = new LinkedHashMap();
        String string = "";
        ObjectType.Property property = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        properties.put(string, property);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectString] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:148)
            com.google.javascript.rhino.jstype.PrototypeObjectType.getPropertyType(PrototypeObjectType.java:217)
            com.google.javascript.rhino.jstype.FunctionType.getPropertyType(FunctionType.java:614)
            com.google.javascript.rhino.jstype.PrototypeObjectType.hasOverridenNativeProperty(PrototypeObjectType.java:322)
            com.google.javascript.rhino.jstype.PrototypeObjectType.matchesStringContext(PrototypeObjectType.java:310)
            com.google.javascript.rhino.jstype.FunctionType.matchesStringContext(FunctionType.java:66)
            com.google.javascript.jscomp.TypeValidator.expectString(TypeValidator.java:209) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Method expectStringMethod = typeValidatorClazz.getDeclaredMethod("expectString", nodeTraversalType, numberNodeType, anonymousFunctionTypeType, stringType);
        expectStringMethod.setAccessible(true);
        java.lang.Object[] expectStringMethodArguments = new java.lang.Object[4];
        expectStringMethodArguments[0] = nodeTraversal;
        expectStringMethodArguments[1] = numberNode;
        expectStringMethodArguments[2] = anonymousFunctionType;
        expectStringMethodArguments[3] = ((Object) null);
        try {
            expectStringMethod.invoke(typeValidator, expectStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectIndexMatch
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expectIndexMatch(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectIndexMatch(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(n.isGetElem());
 *  */
    @Test
    public void testExpectIndexMatch_ThrowNullPointerException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectIndexMatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectIndexMatch(TypeValidator.java:325) */
        typeValidator.expectIndexMatch(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectIndexMatch(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isGetElem()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isStruct()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: objType.isStruct()
 *  */
    @Test
    public void testExpectIndexMatch_ThrowNullPointerException_1() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(35);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectIndexMatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectIndexMatch(TypeValidator.java:327) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method expectIndexMatchMethod = typeValidatorClazz.getDeclaredMethod("expectIndexMatch", nodeTraversalType, numberNodeType, jSTypeType, jSTypeType);
        expectIndexMatchMethod.setAccessible(true);
        java.lang.Object[] expectIndexMatchMethodArguments = new java.lang.Object[4];
        expectIndexMatchMethodArguments[0] = ((Object) null);
        expectIndexMatchMethodArguments[1] = numberNode;
        expectIndexMatchMethodArguments[2] = ((Object) null);
        expectIndexMatchMethodArguments[3] = ((Object) null);
        try {
            expectIndexMatchMethod.invoke(typeValidator, expectIndexMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method expectIndexMatch(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectIndexMatch(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isGetElem()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(n.isGetElem());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testExpectIndexMatch_ThrowIllegalStateException() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method expectIndexMatchMethod = typeValidatorClazz.getDeclaredMethod("expectIndexMatch", nodeTraversalType, numberNodeType, jSTypeType, jSTypeType);
        expectIndexMatchMethod.setAccessible(true);
        java.lang.Object[] expectIndexMatchMethodArguments = new java.lang.Object[4];
        expectIndexMatchMethodArguments[0] = ((Object) null);
        expectIndexMatchMethodArguments[1] = numberNode;
        expectIndexMatchMethodArguments[2] = ((Object) null);
        expectIndexMatchMethodArguments[3] = ((Object) null);
        try {
            expectIndexMatchMethod.invoke(typeValidator, expectIndexMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method expectIndexMatch(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    @Test(expected = StackOverflowError.class)
    public void testExpectIndexMatch1() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(35);
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class parameterizedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method expectIndexMatchMethod = typeValidatorClazz.getDeclaredMethod("expectIndexMatch", nodeTraversalType, numberNodeType, parameterizedTypeType, parameterizedTypeType);
        expectIndexMatchMethod.setAccessible(true);
        java.lang.Object[] expectIndexMatchMethodArguments = new java.lang.Object[4];
        expectIndexMatchMethodArguments[0] = nodeTraversal;
        expectIndexMatchMethodArguments[1] = numberNode;
        expectIndexMatchMethodArguments[2] = parameterizedType;
        expectIndexMatchMethodArguments[3] = ((Object) null);
        try {
            expectIndexMatchMethod.invoke(typeValidator, expectIndexMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testExpectIndexMatch2() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(35);
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class parameterizedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method expectIndexMatchMethod = typeValidatorClazz.getDeclaredMethod("expectIndexMatch", nodeTraversalType, numberNodeType, parameterizedTypeType, parameterizedTypeType);
        expectIndexMatchMethod.setAccessible(true);
        java.lang.Object[] expectIndexMatchMethodArguments = new java.lang.Object[4];
        expectIndexMatchMethodArguments[0] = nodeTraversal;
        expectIndexMatchMethodArguments[1] = numberNode;
        expectIndexMatchMethodArguments[2] = parameterizedType;
        expectIndexMatchMethodArguments[3] = ((Object) null);
        try {
            expectIndexMatchMethod.invoke(typeValidator, expectIndexMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testExpectIndexMatch3() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(35);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method expectIndexMatchMethod = typeValidatorClazz.getDeclaredMethod("expectIndexMatch", nodeTraversalType, numberNodeType, templateTypeType, templateTypeType);
        expectIndexMatchMethod.setAccessible(true);
        java.lang.Object[] expectIndexMatchMethodArguments = new java.lang.Object[4];
        expectIndexMatchMethodArguments[0] = nodeTraversal;
        expectIndexMatchMethodArguments[1] = numberNode;
        expectIndexMatchMethodArguments[2] = templateType;
        expectIndexMatchMethodArguments[3] = ((Object) null);
        try {
            expectIndexMatchMethod.invoke(typeValidator, expectIndexMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testExpectIndexMatch4() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(35);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method expectIndexMatchMethod = typeValidatorClazz.getDeclaredMethod("expectIndexMatch", nodeTraversalType, numberNodeType, templateTypeType, templateTypeType);
        expectIndexMatchMethod.setAccessible(true);
        java.lang.Object[] expectIndexMatchMethodArguments = new java.lang.Object[4];
        expectIndexMatchMethodArguments[0] = nodeTraversal;
        expectIndexMatchMethodArguments[1] = numberNode;
        expectIndexMatchMethodArguments[2] = templateType;
        expectIndexMatchMethodArguments[3] = ((Object) null);
        try {
            expectIndexMatchMethod.invoke(typeValidator, expectIndexMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testExpectIndexMatch5() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(35);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method expectIndexMatchMethod = typeValidatorClazz.getDeclaredMethod("expectIndexMatch", nodeTraversalType, numberNodeType, templateTypeType, templateTypeType);
        expectIndexMatchMethod.setAccessible(true);
        java.lang.Object[] expectIndexMatchMethodArguments = new java.lang.Object[4];
        expectIndexMatchMethodArguments[0] = nodeTraversal;
        expectIndexMatchMethodArguments[1] = numberNode;
        expectIndexMatchMethodArguments[2] = templateType;
        expectIndexMatchMethodArguments[3] = ((Object) null);
        try {
            expectIndexMatchMethod.invoke(typeValidator, expectIndexMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testExpectIndexMatch6() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(35);
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class parameterizedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method expectIndexMatchMethod = typeValidatorClazz.getDeclaredMethod("expectIndexMatch", nodeTraversalType, numberNodeType, parameterizedTypeType, parameterizedTypeType);
        expectIndexMatchMethod.setAccessible(true);
        java.lang.Object[] expectIndexMatchMethodArguments = new java.lang.Object[4];
        expectIndexMatchMethodArguments[0] = nodeTraversal;
        expectIndexMatchMethodArguments[1] = numberNode;
        expectIndexMatchMethodArguments[2] = parameterizedType;
        expectIndexMatchMethodArguments[3] = ((Object) null);
        try {
            expectIndexMatchMethod.invoke(typeValidator, expectIndexMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testExpectIndexMatch7() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(35);
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class parameterizedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method expectIndexMatchMethod = typeValidatorClazz.getDeclaredMethod("expectIndexMatch", nodeTraversalType, numberNodeType, parameterizedTypeType, parameterizedTypeType);
        expectIndexMatchMethod.setAccessible(true);
        java.lang.Object[] expectIndexMatchMethodArguments = new java.lang.Object[4];
        expectIndexMatchMethodArguments[0] = nodeTraversal;
        expectIndexMatchMethodArguments[1] = numberNode;
        expectIndexMatchMethodArguments[2] = parameterizedType;
        expectIndexMatchMethodArguments[3] = ((Object) null);
        try {
            expectIndexMatchMethod.invoke(typeValidator, expectIndexMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testExpectIndexMatch8() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(35);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method expectIndexMatchMethod = typeValidatorClazz.getDeclaredMethod("expectIndexMatch", nodeTraversalType, numberNodeType, templateTypeType, templateTypeType);
        expectIndexMatchMethod.setAccessible(true);
        java.lang.Object[] expectIndexMatchMethodArguments = new java.lang.Object[4];
        expectIndexMatchMethodArguments[0] = nodeTraversal;
        expectIndexMatchMethodArguments[1] = numberNode;
        expectIndexMatchMethodArguments[2] = templateType;
        expectIndexMatchMethodArguments[3] = ((Object) null);
        try {
            expectIndexMatchMethod.invoke(typeValidator, expectIndexMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testExpectIndexMatch9() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(35);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method expectIndexMatchMethod = typeValidatorClazz.getDeclaredMethod("expectIndexMatch", nodeTraversalType, numberNodeType, templateTypeType, templateTypeType);
        expectIndexMatchMethod.setAccessible(true);
        java.lang.Object[] expectIndexMatchMethodArguments = new java.lang.Object[4];
        expectIndexMatchMethodArguments[0] = ((Object) null);
        expectIndexMatchMethodArguments[1] = numberNode;
        expectIndexMatchMethodArguments[2] = templateType;
        expectIndexMatchMethodArguments[3] = ((Object) null);
        try {
            expectIndexMatchMethod.invoke(typeValidator, expectIndexMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testExpectIndexMatch10() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(35);
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class parameterizedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method expectIndexMatchMethod = typeValidatorClazz.getDeclaredMethod("expectIndexMatch", nodeTraversalType, numberNodeType, parameterizedTypeType, parameterizedTypeType);
        expectIndexMatchMethod.setAccessible(true);
        java.lang.Object[] expectIndexMatchMethodArguments = new java.lang.Object[4];
        expectIndexMatchMethodArguments[0] = nodeTraversal;
        expectIndexMatchMethodArguments[1] = numberNode;
        expectIndexMatchMethodArguments[2] = parameterizedType;
        expectIndexMatchMethodArguments[3] = ((Object) null);
        try {
            expectIndexMatchMethod.invoke(typeValidator, expectIndexMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testExpectIndexMatch11() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(35);
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class parameterizedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method expectIndexMatchMethod = typeValidatorClazz.getDeclaredMethod("expectIndexMatch", nodeTraversalType, numberNodeType, parameterizedTypeType, parameterizedTypeType);
        expectIndexMatchMethod.setAccessible(true);
        java.lang.Object[] expectIndexMatchMethodArguments = new java.lang.Object[4];
        expectIndexMatchMethodArguments[0] = nodeTraversal;
        expectIndexMatchMethodArguments[1] = numberNode;
        expectIndexMatchMethodArguments[2] = parameterizedType;
        expectIndexMatchMethodArguments[3] = ((Object) null);
        try {
            expectIndexMatchMethod.invoke(typeValidator, expectIndexMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExpectIndexMatch12() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(35);
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectIndexMatch] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionTypeBuilder.reduceAlternatesWithoutUnion(UnionTypeBuilder.java:239)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.build(UnionTypeBuilder.java:251)
            com.google.javascript.rhino.jstype.UnionType.autobox(UnionType.java:215)
            com.google.javascript.rhino.jstype.JSType.dereference(JSType.java:896)
            com.google.javascript.jscomp.TypeValidator.expectIndexMatch(TypeValidator.java:334) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class unionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method expectIndexMatchMethod = typeValidatorClazz.getDeclaredMethod("expectIndexMatch", nodeTraversalType, numberNodeType, unionTypeType, unionTypeType);
        expectIndexMatchMethod.setAccessible(true);
        java.lang.Object[] expectIndexMatchMethodArguments = new java.lang.Object[4];
        expectIndexMatchMethodArguments[0] = nodeTraversal;
        expectIndexMatchMethodArguments[1] = numberNode;
        expectIndexMatchMethodArguments[2] = unionType;
        expectIndexMatchMethodArguments[3] = ((Object) null);
        try {
            expectIndexMatchMethod.invoke(typeValidator, expectIndexMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExpectIndexMatch13() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(35);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        alternates.add(null);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectIndexMatch] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.isStruct(UnionType.java:272)
            com.google.javascript.jscomp.TypeValidator.expectIndexMatch(TypeValidator.java:327) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class unionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method expectIndexMatchMethod = typeValidatorClazz.getDeclaredMethod("expectIndexMatch", nodeTraversalType, numberNodeType, unionTypeType, unionTypeType);
        expectIndexMatchMethod.setAccessible(true);
        java.lang.Object[] expectIndexMatchMethodArguments = new java.lang.Object[4];
        expectIndexMatchMethodArguments[0] = nodeTraversal;
        expectIndexMatchMethodArguments[1] = numberNode;
        expectIndexMatchMethodArguments[2] = unionType;
        expectIndexMatchMethodArguments[3] = enumElementType;
        try {
            expectIndexMatchMethod.invoke(typeValidator, expectIndexMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExpectIndexMatch14() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(35);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectIndexMatch] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isStruct(ProxyObjectType.java:192)
            com.google.javascript.rhino.jstype.ParameterizedType.isStruct(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.isStruct(ProxyObjectType.java:192)
            com.google.javascript.rhino.jstype.TemplateType.isStruct(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.isStruct(ProxyObjectType.java:192)
            com.google.javascript.rhino.jstype.TemplateType.isStruct(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.isStruct(ProxyObjectType.java:192)
            com.google.javascript.rhino.jstype.TemplateType.isStruct(TemplateType.java:48)
            com.google.javascript.jscomp.TypeValidator.expectIndexMatch(TypeValidator.java:327) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method expectIndexMatchMethod = typeValidatorClazz.getDeclaredMethod("expectIndexMatch", nodeTraversalType, numberNodeType, templateTypeType, templateTypeType);
        expectIndexMatchMethod.setAccessible(true);
        java.lang.Object[] expectIndexMatchMethodArguments = new java.lang.Object[4];
        expectIndexMatchMethodArguments[0] = nodeTraversal;
        expectIndexMatchMethodArguments[1] = numberNode;
        expectIndexMatchMethodArguments[2] = templateType;
        expectIndexMatchMethodArguments[3] = ((Object) null);
        try {
            expectIndexMatchMethod.invoke(typeValidator, expectIndexMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExpectIndexMatch15() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(35);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectIndexMatch] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isStruct(ProxyObjectType.java:192)
            com.google.javascript.rhino.jstype.TemplateType.isStruct(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.isStruct(ProxyObjectType.java:192)
            com.google.javascript.rhino.jstype.ParameterizedType.isStruct(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.isStruct(ProxyObjectType.java:192)
            com.google.javascript.rhino.jstype.ParameterizedType.isStruct(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.isStruct(ProxyObjectType.java:192)
            com.google.javascript.rhino.jstype.ParameterizedType.isStruct(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.isStruct(ProxyObjectType.java:192)
            com.google.javascript.rhino.jstype.TemplateType.isStruct(TemplateType.java:48)
            com.google.javascript.jscomp.TypeValidator.expectIndexMatch(TypeValidator.java:327) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method expectIndexMatchMethod = typeValidatorClazz.getDeclaredMethod("expectIndexMatch", nodeTraversalType, numberNodeType, templateTypeType, templateTypeType);
        expectIndexMatchMethod.setAccessible(true);
        java.lang.Object[] expectIndexMatchMethodArguments = new java.lang.Object[4];
        expectIndexMatchMethodArguments[0] = nodeTraversal;
        expectIndexMatchMethodArguments[1] = numberNode;
        expectIndexMatchMethodArguments[2] = templateType;
        expectIndexMatchMethodArguments[3] = ((Object) null);
        try {
            expectIndexMatchMethod.invoke(typeValidator, expectIndexMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExpectIndexMatch16() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(35);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectIndexMatch] produces [java.lang.NullPointerException] */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method expectIndexMatchMethod = typeValidatorClazz.getDeclaredMethod("expectIndexMatch", nodeTraversalType, numberNodeType, templateTypeType, templateTypeType);
        expectIndexMatchMethod.setAccessible(true);
        java.lang.Object[] expectIndexMatchMethodArguments = new java.lang.Object[4];
        expectIndexMatchMethodArguments[0] = nodeTraversal;
        expectIndexMatchMethodArguments[1] = numberNode;
        expectIndexMatchMethodArguments[2] = templateType;
        expectIndexMatchMethodArguments[3] = ((Object) null);
        try {
            expectIndexMatchMethod.invoke(typeValidator, expectIndexMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExpectIndexMatch17() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(35);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectIndexMatch] produces [java.lang.NullPointerException] */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method expectIndexMatchMethod = typeValidatorClazz.getDeclaredMethod("expectIndexMatch", nodeTraversalType, numberNodeType, templateTypeType, templateTypeType);
        expectIndexMatchMethod.setAccessible(true);
        java.lang.Object[] expectIndexMatchMethodArguments = new java.lang.Object[4];
        expectIndexMatchMethodArguments[0] = nodeTraversal;
        expectIndexMatchMethodArguments[1] = numberNode;
        expectIndexMatchMethodArguments[2] = templateType;
        expectIndexMatchMethodArguments[3] = ((Object) null);
        try {
            expectIndexMatchMethod.invoke(typeValidator, expectIndexMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExpectIndexMatch18() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(35);
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectIndexMatch] produces [java.lang.NullPointerException] */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class parameterizedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method expectIndexMatchMethod = typeValidatorClazz.getDeclaredMethod("expectIndexMatch", nodeTraversalType, numberNodeType, parameterizedTypeType, parameterizedTypeType);
        expectIndexMatchMethod.setAccessible(true);
        java.lang.Object[] expectIndexMatchMethodArguments = new java.lang.Object[4];
        expectIndexMatchMethodArguments[0] = ((Object) null);
        expectIndexMatchMethodArguments[1] = numberNode;
        expectIndexMatchMethodArguments[2] = parameterizedType;
        expectIndexMatchMethodArguments[3] = ((Object) null);
        try {
            expectIndexMatchMethod.invoke(typeValidator, expectIndexMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExpectIndexMatch19() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(35);
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        alternates.add(anonymousFunctionType);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectIndexMatch] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry$1.getConstructor(JSTypeRegistry.java:527)
            com.google.javascript.rhino.jstype.JSType.isStruct(JSType.java:304)
            com.google.javascript.rhino.jstype.UnionType.isStruct(UnionType.java:272)
            com.google.javascript.jscomp.TypeValidator.expectIndexMatch(TypeValidator.java:327) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class unionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method expectIndexMatchMethod = typeValidatorClazz.getDeclaredMethod("expectIndexMatch", nodeTraversalType, numberNodeType, unionTypeType, unionTypeType);
        expectIndexMatchMethod.setAccessible(true);
        java.lang.Object[] expectIndexMatchMethodArguments = new java.lang.Object[4];
        expectIndexMatchMethodArguments[0] = nodeTraversal;
        expectIndexMatchMethodArguments[1] = numberNode;
        expectIndexMatchMethodArguments[2] = unionType;
        expectIndexMatchMethodArguments[3] = ((Object) null);
        try {
            expectIndexMatchMethod.invoke(typeValidator, expectIndexMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectAnyObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expectAnyObject(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectAnyObject(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.invokes com.google.javascript.jscomp.TypeValidator#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JSType anyObjectType = getNativeType(NO_OBJECT_TYPE);
 *  */
    @Test
    public void testExpectAnyObject_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectAnyObject] produces [java.lang.ArrayIndexOutOfBoundsException: Index 44 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:788)
            com.google.javascript.jscomp.TypeValidator.expectAnyObject(TypeValidator.java:197) */
        typeValidator.expectAnyObject(null, null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method expectNumber(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectNumber(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.executesCondition {@code (!type.matchesNumberContext()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#matchesNumberContext()}
 *  */
    @Test
    public void testExpectNumber_TypeMatchesNumberContext() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        typeValidator.expectNumber(null, null, noType, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expectNumber(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectNumber(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#matchesNumberContext()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !type.matchesNumberContext()
 *  */
    @Test
    public void testExpectNumber_ThrowNullPointerException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectNumber(TypeValidator.java:220) */
        typeValidator.expectNumber(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectNumber(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.executesCondition {@code (!type.matchesNumberContext()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#matchesNumberContext()}
 * @utbot.invokes com.google.javascript.jscomp.TypeValidator#mismatch(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSTypeNative)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: mismatch(t, n, msg, type, NUMBER_TYPE);
 *  */
    @Test
    public void testExpectNumber_ThrowNullPointerException_1() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:788)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:655)
            com.google.javascript.jscomp.TypeValidator.expectNumber(TypeValidator.java:221) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class errorFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Method expectNumberMethod = typeValidatorClazz.getDeclaredMethod("expectNumber", nodeTraversalType, nodeType, errorFunctionTypeType, stringType);
        expectNumberMethod.setAccessible(true);
        java.lang.Object[] expectNumberMethodArguments = new java.lang.Object[4];
        expectNumberMethodArguments[0] = ((Object) null);
        expectNumberMethodArguments[1] = ((Object) null);
        expectNumberMethodArguments[2] = errorFunctionType;
        expectNumberMethodArguments[3] = ((Object) null);
        try {
            expectNumberMethod.invoke(typeValidator, expectNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method expectNumber(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    @Test
    public void testExpectNumber1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null, null, null, null, null, null, null, null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        Node node = new Node(0);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 9]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:788)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:655)
            com.google.javascript.jscomp.TypeValidator.expectNumber(TypeValidator.java:221) */
        typeValidator.expectNumber(null, node, functionType, string);
    }
    
    @Test
    public void testExpectNumber2() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        LinkedHashMap properties = new LinkedHashMap();
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectNumber] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:148)
            com.google.javascript.rhino.jstype.PrototypeObjectType.getPropertyType(PrototypeObjectType.java:217)
            com.google.javascript.rhino.jstype.FunctionType.getPropertyType(FunctionType.java:614)
            com.google.javascript.rhino.jstype.PrototypeObjectType.hasOverridenNativeProperty(PrototypeObjectType.java:322)
            com.google.javascript.rhino.jstype.PrototypeObjectType.matchesNumberContext(PrototypeObjectType.java:303)
            com.google.javascript.rhino.jstype.FunctionType.matchesNumberContext(FunctionType.java:66)
            com.google.javascript.jscomp.TypeValidator.expectNumber(TypeValidator.java:220) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class errorFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Method expectNumberMethod = typeValidatorClazz.getDeclaredMethod("expectNumber", nodeTraversalType, numberNodeType, errorFunctionTypeType, stringType);
        expectNumberMethod.setAccessible(true);
        java.lang.Object[] expectNumberMethodArguments = new java.lang.Object[4];
        expectNumberMethodArguments[0] = nodeTraversal;
        expectNumberMethodArguments[1] = numberNode;
        expectNumberMethodArguments[2] = errorFunctionType;
        expectNumberMethodArguments[3] = ((Object) null);
        try {
            expectNumberMethod.invoke(typeValidator, expectNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExpectNumber3() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[26];
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
        nativeTypes[17] = ((JSType) enumElementType);
        nativeTypes[18] = ((JSType) enumElementType);
        nativeTypes[19] = ((JSType) enumElementType);
        nativeTypes[20] = ((JSType) enumElementType);
        nativeTypes[21] = ((JSType) enumElementType);
        nativeTypes[22] = ((JSType) enumElementType);
        nativeTypes[23] = ((JSType) enumElementType);
        nativeTypes[24] = ((JSType) enumElementType);
        nativeTypes[25] = ((JSType) enumElementType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.registerMismatch(TypeValidator.java:669)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:660)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:650)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:655)
            com.google.javascript.jscomp.TypeValidator.expectNumber(TypeValidator.java:221) */
        typeValidator.expectNumber(nodeTraversal, null, anonymousFunctionType, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectCanOverride
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method expectCanOverride(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, java.lang.String, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectCanOverride(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testExpectCanOverride() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        
        typeValidator.expectCanOverride(null, null, unknownType, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectCanOverride(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testExpectCanOverride_1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        typeValidator.expectCanOverride(null, null, parameterizedType, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectCanOverride(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testExpectCanOverride_2() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object referencedType1 = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        typeValidator.expectCanOverride(null, null, parameterizedType, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectCanOverride(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testExpectCanOverride_3() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType1 = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        typeValidator.expectCanOverride(null, null, parameterizedType, null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expectCanOverride(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, java.lang.String, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectCanOverride(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#canAssignTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !overridingType.canAssignTo(hiddenType)
 *  */
    @Test
    public void testExpectCanOverride_ThrowNullPointerException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectCanOverride] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectCanOverride(TypeValidator.java:452) */
        typeValidator.expectCanOverride(null, null, null, null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method expectCanOverride(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, java.lang.String, com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testExpectCanOverride1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType6 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object referencedType7 = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        setField(referencedType6, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType7);
        setField(referencedType5, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType6);
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        typeValidator.expectCanOverride(null, null, parameterizedType, null, null, null);
    }
    
    @Test
    public void testExpectCanOverride2() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType6 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType7 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType6, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType7);
        setField(referencedType5, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType6);
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        typeValidator.expectCanOverride(null, null, parameterizedType, null, null, null);
    }
    
    @Test
    public void testExpectCanOverride3() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType6 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType7 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType8 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType9 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType10 = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
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
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        typeValidator.expectCanOverride(nodeTraversal, null, parameterizedType, null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method expectCanOverride(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, java.lang.String, com.google.javascript.rhino.jstype.JSType)
    
    @Test(expected = StackOverflowError.class)
    public void testExpectCanOverride4() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType6 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType7 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType8 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(referencedType8, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType8);
        setField(referencedType7, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType8);
        setField(referencedType6, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType7);
        setField(referencedType5, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType6);
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        typeValidator.expectCanOverride(nodeTraversal, null, parameterizedType, null, null, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testExpectCanOverride5() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType6 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType7 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType8 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType9 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType10 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(referencedType10, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType10);
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
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        typeValidator.expectCanOverride(nodeTraversal, null, parameterizedType, null, null, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testExpectCanOverride6() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType6 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType7 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType8 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType9 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType10 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType11 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType11, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType11);
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
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        typeValidator.expectCanOverride(nodeTraversal, null, parameterizedType, null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectSuperType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method expectSuperType(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.ObjectType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectSuperType(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.executesCondition {@code (declaredSuper != null): False}
 *  */
    @Test
    public void testExpectSuperType_DeclaredSuperEqualsNull_1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        typeValidator.expectSuperType(null, null, null, noType);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectSuperType(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.executesCondition {@code (!(superObject instanceof UnknownType)): False}
 *  */
    @Test
    public void testExpectSuperType_SuperObjectNotInstanceOfUnknownType() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object unresolvedTypeExpression = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        TemplateType implicitPrototypeFallback1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class unresolvedTypeExpressionType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method expectSuperTypeMethod = typeValidatorClazz.getDeclaredMethod("expectSuperType", nodeTraversalType, nodeType, unresolvedTypeExpressionType, unresolvedTypeExpressionType);
        expectSuperTypeMethod.setAccessible(true);
        java.lang.Object[] expectSuperTypeMethodArguments = new java.lang.Object[4];
        expectSuperTypeMethodArguments[0] = ((Object) null);
        expectSuperTypeMethodArguments[1] = ((Object) null);
        expectSuperTypeMethodArguments[2] = unresolvedTypeExpression;
        expectSuperTypeMethodArguments[3] = errorFunctionType;
        expectSuperTypeMethod.invoke(typeValidator, expectSuperTypeMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectSuperType(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.executesCondition {@code (!(superObject instanceof UnknownType)): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testExpectSuperType_NotSuperObjectInstanceOfUnknownType() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", templateType);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        typeValidator.expectSuperType(null, null, templateType, functionType);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectSuperType(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType)}
 *  */
    @Test
    public void testExpectSuperType() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoType implicitPrototypeFallback = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        typeValidator.expectSuperType(null, null, null, functionType);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectSuperType(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.executesCondition {@code (declaredSuper != null): False}
 *  */
    @Test
    public void testExpectSuperType_DeclaredSuperEqualsNull() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        typeValidator.expectSuperType(null, null, null, functionType);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expectSuperType(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.ObjectType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectSuperType(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#getConstructor()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FunctionType subCtor = subObject.getConstructor();
 *  */
    @Test
    public void testExpectSuperType_ThrowNullPointerException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectSuperType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectSuperType(TypeValidator.java:470) */
        typeValidator.expectSuperType(null, null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method expectSuperType(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.ObjectType)
    
    @Test(expected = StackOverflowError.class)
    public void testExpectSuperType1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        UnknownType implicitPrototypeFallback1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        typeValidator.expectSuperType(nodeTraversal, null, parameterizedType, functionType);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testExpectSuperType2() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object implicitPrototypeFallback = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        ParameterizedType implicitPrototypeFallback1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(implicitPrototypeFallback1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class parameterizedTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method expectSuperTypeMethod = typeValidatorClazz.getDeclaredMethod("expectSuperType", nodeTraversalType, stringNodeType, parameterizedTypeType, parameterizedTypeType);
        expectSuperTypeMethod.setAccessible(true);
        java.lang.Object[] expectSuperTypeMethodArguments = new java.lang.Object[4];
        expectSuperTypeMethodArguments[0] = ((Object) null);
        expectSuperTypeMethodArguments[1] = stringNode;
        expectSuperTypeMethodArguments[2] = parameterizedType;
        expectSuperTypeMethodArguments[3] = functionType;
        try {
            expectSuperTypeMethod.invoke(typeValidator, expectSuperTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testExpectSuperType3() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object referencedType1 = createInstance("com.google.javascript.rhino.jstype.ProxyObjectType");
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object implicitPrototypeFallback = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        ParameterizedType implicitPrototypeFallback1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType2 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(implicitPrototypeFallback1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class parameterizedTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method expectSuperTypeMethod = typeValidatorClazz.getDeclaredMethod("expectSuperType", nodeTraversalType, stringNodeType, parameterizedTypeType, parameterizedTypeType);
        expectSuperTypeMethod.setAccessible(true);
        java.lang.Object[] expectSuperTypeMethodArguments = new java.lang.Object[4];
        expectSuperTypeMethodArguments[0] = ((Object) null);
        expectSuperTypeMethodArguments[1] = stringNode;
        expectSuperTypeMethodArguments[2] = parameterizedType;
        expectSuperTypeMethodArguments[3] = functionType;
        try {
            expectSuperTypeMethod.invoke(typeValidator, expectSuperTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testExpectSuperType4() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object implicitPrototypeFallback = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        TemplateType implicitPrototypeFallback1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType1 = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        setField(implicitPrototypeFallback1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        typeValidator.expectSuperType(null, null, parameterizedType, functionType);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testExpectSuperType5() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ParameterizedType implicitPrototypeFallback1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType3 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(implicitPrototypeFallback1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class parameterizedTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method expectSuperTypeMethod = typeValidatorClazz.getDeclaredMethod("expectSuperType", nodeTraversalType, stringNodeType, parameterizedTypeType, parameterizedTypeType);
        expectSuperTypeMethod.setAccessible(true);
        java.lang.Object[] expectSuperTypeMethodArguments = new java.lang.Object[4];
        expectSuperTypeMethodArguments[0] = ((Object) null);
        expectSuperTypeMethodArguments[1] = stringNode;
        expectSuperTypeMethodArguments[2] = parameterizedType;
        expectSuperTypeMethodArguments[3] = functionType;
        try {
            expectSuperTypeMethod.invoke(typeValidator, expectSuperTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExpectSuperType6() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        UnknownType implicitPrototypeFallback1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectSuperType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:788)
            com.google.javascript.jscomp.TypeValidator.expectSuperType(TypeValidator.java:477) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class errorFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method expectSuperTypeMethod = typeValidatorClazz.getDeclaredMethod("expectSuperType", nodeTraversalType, nodeType, errorFunctionTypeType, errorFunctionTypeType);
        expectSuperTypeMethod.setAccessible(true);
        java.lang.Object[] expectSuperTypeMethodArguments = new java.lang.Object[4];
        expectSuperTypeMethodArguments[0] = nodeTraversal;
        expectSuperTypeMethodArguments[1] = ((Object) null);
        expectSuperTypeMethodArguments[2] = errorFunctionType;
        expectSuperTypeMethodArguments[3] = functionType;
        try {
            expectSuperTypeMethod.invoke(typeValidator, expectSuperTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExpectSuperType7() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        EnumType enumType = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType implicitPrototypeFallback1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        setField(implicitPrototypeFallback1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectSuperType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:788)
            com.google.javascript.jscomp.TypeValidator.expectSuperType(TypeValidator.java:477) */
        typeValidator.expectSuperType(nodeTraversal, null, enumType, functionType);
    }
    
    @Test
    public void testExpectSuperType8() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object namedType = createInstance("com.google.javascript.rhino.jstype.NamedType");
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ParameterizedType implicitPrototypeFallback1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(implicitPrototypeFallback1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectSuperType] produces [java.lang.NullPointerException] */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class namedTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method expectSuperTypeMethod = typeValidatorClazz.getDeclaredMethod("expectSuperType", nodeTraversalType, nodeType, namedTypeType, namedTypeType);
        expectSuperTypeMethod.setAccessible(true);
        java.lang.Object[] expectSuperTypeMethodArguments = new java.lang.Object[4];
        expectSuperTypeMethodArguments[0] = nodeTraversal;
        expectSuperTypeMethodArguments[1] = ((Object) null);
        expectSuperTypeMethodArguments[2] = namedType;
        expectSuperTypeMethodArguments[3] = functionType;
        try {
            expectSuperTypeMethod.invoke(typeValidator, expectSuperTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExpectSuperType9() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object implicitPrototypeFallback = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        TemplateType implicitPrototypeFallback1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType1 = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        setField(implicitPrototypeFallback1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectSuperType] produces [java.lang.NullPointerException] */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method expectSuperTypeMethod = typeValidatorClazz.getDeclaredMethod("expectSuperType", nodeTraversalType, stringNodeType, templateTypeType, templateTypeType);
        expectSuperTypeMethod.setAccessible(true);
        java.lang.Object[] expectSuperTypeMethodArguments = new java.lang.Object[4];
        expectSuperTypeMethodArguments[0] = ((Object) null);
        expectSuperTypeMethodArguments[1] = stringNode;
        expectSuperTypeMethodArguments[2] = templateType;
        expectSuperTypeMethodArguments[3] = functionType;
        try {
            expectSuperTypeMethod.invoke(typeValidator, expectSuperTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExpectSuperType10() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object implicitPrototypeFallback = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        TemplateType implicitPrototypeFallback1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType1 = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        setField(implicitPrototypeFallback1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectSuperType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:788)
            com.google.javascript.jscomp.TypeValidator.expectSuperType(TypeValidator.java:477) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method expectSuperTypeMethod = typeValidatorClazz.getDeclaredMethod("expectSuperType", nodeTraversalType, stringNodeType, templateTypeType, templateTypeType);
        expectSuperTypeMethod.setAccessible(true);
        java.lang.Object[] expectSuperTypeMethodArguments = new java.lang.Object[4];
        expectSuperTypeMethodArguments[0] = ((Object) null);
        expectSuperTypeMethodArguments[1] = stringNode;
        expectSuperTypeMethodArguments[2] = templateType;
        expectSuperTypeMethodArguments[3] = functionType;
        try {
            expectSuperTypeMethod.invoke(typeValidator, expectSuperTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExpectSuperType11() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object recordType = createInstance("com.google.javascript.rhino.jstype.RecordType");
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType implicitPrototypeFallback1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(implicitPrototypeFallback1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectSuperType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:788)
            com.google.javascript.jscomp.TypeValidator.expectSuperType(TypeValidator.java:477) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class recordTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method expectSuperTypeMethod = typeValidatorClazz.getDeclaredMethod("expectSuperType", nodeTraversalType, nodeType, recordTypeType, recordTypeType);
        expectSuperTypeMethod.setAccessible(true);
        java.lang.Object[] expectSuperTypeMethodArguments = new java.lang.Object[4];
        expectSuperTypeMethodArguments[0] = nodeTraversal;
        expectSuperTypeMethodArguments[1] = ((Object) null);
        expectSuperTypeMethodArguments[2] = recordType;
        expectSuperTypeMethodArguments[3] = functionType;
        try {
            expectSuperTypeMethod.invoke(typeValidator, expectSuperTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExpectSuperType12() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        EnumType enumType = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ParameterizedType implicitPrototypeFallback1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType2 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(implicitPrototypeFallback1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectSuperType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:788)
            com.google.javascript.jscomp.TypeValidator.expectSuperType(TypeValidator.java:477) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class enumTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method expectSuperTypeMethod = typeValidatorClazz.getDeclaredMethod("expectSuperType", nodeTraversalType, stringNodeType, enumTypeType, enumTypeType);
        expectSuperTypeMethod.setAccessible(true);
        java.lang.Object[] expectSuperTypeMethodArguments = new java.lang.Object[4];
        expectSuperTypeMethodArguments[0] = ((Object) null);
        expectSuperTypeMethodArguments[1] = stringNode;
        expectSuperTypeMethodArguments[2] = enumType;
        expectSuperTypeMethodArguments[3] = functionType;
        try {
            expectSuperTypeMethod.invoke(typeValidator, expectSuperTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExpectSuperType13() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.IndexedType");
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object implicitPrototypeFallback = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        TemplateType implicitPrototypeFallback1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType2 = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        setField(implicitPrototypeFallback1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectSuperType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:788)
            com.google.javascript.jscomp.TypeValidator.expectSuperType(TypeValidator.java:477) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class parameterizedTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method expectSuperTypeMethod = typeValidatorClazz.getDeclaredMethod("expectSuperType", nodeTraversalType, numberNodeType, parameterizedTypeType, parameterizedTypeType);
        expectSuperTypeMethod.setAccessible(true);
        java.lang.Object[] expectSuperTypeMethodArguments = new java.lang.Object[4];
        expectSuperTypeMethodArguments[0] = ((Object) null);
        expectSuperTypeMethodArguments[1] = numberNode;
        expectSuperTypeMethodArguments[2] = parameterizedType;
        expectSuperTypeMethodArguments[3] = functionType;
        try {
            expectSuperTypeMethod.invoke(typeValidator, expectSuperTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExpectSuperType14() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType implicitPrototypeFallback1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object referencedType2 = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(implicitPrototypeFallback1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectSuperType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.checkEquivalenceHelper(JSType.java:698)
            com.google.javascript.rhino.jstype.JSType.isEquivalentTo(JSType.java:624)
            com.google.javascript.jscomp.TypeValidator.expectSuperType(TypeValidator.java:476) */
        typeValidator.expectSuperType(null, null, parameterizedType, functionType);
    }
    
    @Test
    public void testExpectSuperType15() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.ProxyObjectType");
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType2 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ParameterizedType implicitPrototypeFallback1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(implicitPrototypeFallback1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectSuperType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.checkEquivalenceHelper(JSType.java:698)
            com.google.javascript.rhino.jstype.JSType.isEquivalentTo(JSType.java:624)
            com.google.javascript.jscomp.TypeValidator.expectSuperType(TypeValidator.java:476) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class parameterizedTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method expectSuperTypeMethod = typeValidatorClazz.getDeclaredMethod("expectSuperType", nodeTraversalType, stringNodeType, parameterizedTypeType, parameterizedTypeType);
        expectSuperTypeMethod.setAccessible(true);
        java.lang.Object[] expectSuperTypeMethodArguments = new java.lang.Object[4];
        expectSuperTypeMethodArguments[0] = ((Object) null);
        expectSuperTypeMethodArguments[1] = stringNode;
        expectSuperTypeMethodArguments[2] = parameterizedType;
        expectSuperTypeMethodArguments[3] = functionType;
        try {
            expectSuperTypeMethod.invoke(typeValidator, expectSuperTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExpectSuperType16() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ParameterizedType implicitPrototypeFallback1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType5 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(implicitPrototypeFallback1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectSuperType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.checkEquivalenceHelper(JSType.java:658)
            com.google.javascript.rhino.jstype.JSType.isEquivalentTo(JSType.java:624)
            com.google.javascript.jscomp.TypeValidator.expectSuperType(TypeValidator.java:476) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method expectSuperTypeMethod = typeValidatorClazz.getDeclaredMethod("expectSuperType", nodeTraversalType, numberNodeType, objectTypeType, objectTypeType);
        expectSuperTypeMethod.setAccessible(true);
        java.lang.Object[] expectSuperTypeMethodArguments = new java.lang.Object[4];
        expectSuperTypeMethodArguments[0] = nodeTraversal;
        expectSuperTypeMethodArguments[1] = numberNode;
        expectSuperTypeMethodArguments[2] = ((Object) null);
        expectSuperTypeMethodArguments[3] = functionType;
        try {
            expectSuperTypeMethod.invoke(typeValidator, expectSuperTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExpectSuperType17() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType5 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", referencedType5);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectSuperType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:788)
            com.google.javascript.jscomp.TypeValidator.expectSuperType(TypeValidator.java:477) */
        typeValidator.expectSuperType(nodeTraversal, null, parameterizedType, functionType);
    }
    
    @Test
    public void testExpectSuperType18() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ParameterizedType implicitPrototypeFallback1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType4 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(implicitPrototypeFallback1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectSuperType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ParameterizedType.isUnknownType(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.JSType.checkEquivalenceHelper(JSType.java:658)
            com.google.javascript.rhino.jstype.JSType.isEquivalentTo(JSType.java:624)
            com.google.javascript.jscomp.TypeValidator.expectSuperType(TypeValidator.java:476) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class parameterizedTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method expectSuperTypeMethod = typeValidatorClazz.getDeclaredMethod("expectSuperType", nodeTraversalType, stringNodeType, parameterizedTypeType, parameterizedTypeType);
        expectSuperTypeMethod.setAccessible(true);
        java.lang.Object[] expectSuperTypeMethodArguments = new java.lang.Object[4];
        expectSuperTypeMethodArguments[0] = ((Object) null);
        expectSuperTypeMethodArguments[1] = stringNode;
        expectSuperTypeMethodArguments[2] = parameterizedType;
        expectSuperTypeMethodArguments[3] = functionType;
        try {
            expectSuperTypeMethod.invoke(typeValidator, expectSuperTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectBitwiseable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method expectBitwiseable(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectBitwiseable(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.executesCondition {@code (!type.matchesNumberContext()): False}
 *  */
    @Test
    public void testExpectBitwiseable_TypeMatchesNumberContext() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        typeValidator.expectBitwiseable(null, null, noType, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectBitwiseable(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.executesCondition {@code (!type.matchesNumberContext()): True}
 * @utbot.executesCondition {@code (!type.isSubtype(allValueTypes)): False}
 *  */
    @Test
    public void testExpectBitwiseable_TypeIsSubtype() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        UnknownType allValueTypes = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "allValueTypes", allValueTypes);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        typeValidator.expectBitwiseable(null, null, functionType, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectBitwiseable(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.executesCondition {@code (!type.matchesNumberContext()): True}
 * @utbot.executesCondition {@code (!type.isSubtype(allValueTypes)): False}
 *  */
    @Test
    public void testExpectBitwiseable_TypeIsSubtype_1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ParameterizedType allValueTypes = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        setField(allValueTypes, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "allValueTypes", allValueTypes);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        typeValidator.expectBitwiseable(null, null, functionType, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expectBitwiseable(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectBitwiseable(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#matchesNumberContext()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !type.matchesNumberContext() && !type.isSubtype(allValueTypes)
 *  */
    @Test
    public void testExpectBitwiseable_ThrowNullPointerException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectBitwiseable] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectBitwiseable(TypeValidator.java:231) */
        typeValidator.expectBitwiseable(null, null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method expectBitwiseable(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    @Test
    public void testExpectBitwiseable1() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectBitwiseable] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:148)
            com.google.javascript.rhino.jstype.PrototypeObjectType.getPropertyType(PrototypeObjectType.java:217)
            com.google.javascript.rhino.jstype.FunctionType.getPropertyType(FunctionType.java:614)
            com.google.javascript.rhino.jstype.PrototypeObjectType.hasOverridenNativeProperty(PrototypeObjectType.java:322)
            com.google.javascript.rhino.jstype.PrototypeObjectType.matchesNumberContext(PrototypeObjectType.java:303)
            com.google.javascript.rhino.jstype.FunctionType.matchesNumberContext(FunctionType.java:66)
            com.google.javascript.jscomp.TypeValidator.expectBitwiseable(TypeValidator.java:231) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Method expectBitwiseableMethod = typeValidatorClazz.getDeclaredMethod("expectBitwiseable", nodeTraversalType, numberNodeType, anonymousFunctionTypeType, stringType);
        expectBitwiseableMethod.setAccessible(true);
        java.lang.Object[] expectBitwiseableMethodArguments = new java.lang.Object[4];
        expectBitwiseableMethodArguments[0] = nodeTraversal;
        expectBitwiseableMethodArguments[1] = numberNode;
        expectBitwiseableMethodArguments[2] = anonymousFunctionType;
        expectBitwiseableMethodArguments[3] = ((Object) null);
        try {
            expectBitwiseableMethod.invoke(typeValidator, expectBitwiseableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectCanCast
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expectCanCast(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectCanCast(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#restrictByNotNullOrUndefined()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: castType = castType.restrictByNotNullOrUndefined();
 *  */
    @Test
    public void testExpectCanCast_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        VoidType voidType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(voidType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectCanCast] produces [java.lang.ArrayIndexOutOfBoundsException: Index 43 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.rhino.jstype.VoidType.restrictByNotNullOrUndefined(VoidType.java:59)
            com.google.javascript.jscomp.TypeValidator.expectCanCast(TypeValidator.java:503) */
        typeValidator.expectCanCast(null, null, null, voidType);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectCanCast(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#restrictByNotNullOrUndefined()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: castType = castType.restrictByNotNullOrUndefined();
 *  */
    @Test
    public void testExpectCanCast_ThrowNullPointerException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectCanCast] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectCanCast(TypeValidator.java:503) */
        typeValidator.expectCanCast(null, null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.registerMismatch
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method registerMismatch(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.JSError)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#registerMismatch(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.JSError)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#restrictByNotNullOrUndefined()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: found = found.restrictByNotNullOrUndefined();
 *  */
    @Test
    public void testRegisterMismatch_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        VoidType voidType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(voidType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.registerMismatch] produces [java.lang.ArrayIndexOutOfBoundsException: Index 43 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.rhino.jstype.VoidType.restrictByNotNullOrUndefined(VoidType.java:59)
            com.google.javascript.jscomp.TypeValidator.registerMismatch(TypeValidator.java:668) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class voidTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class jSErrorType = Class.forName("com.google.javascript.jscomp.JSError");
        Method registerMismatchMethod = typeValidatorClazz.getDeclaredMethod("registerMismatch", voidTypeType, voidTypeType, jSErrorType);
        registerMismatchMethod.setAccessible(true);
        java.lang.Object[] registerMismatchMethodArguments = new java.lang.Object[3];
        registerMismatchMethodArguments[0] = voidType;
        registerMismatchMethodArguments[1] = ((Object) null);
        registerMismatchMethodArguments[2] = ((Object) null);
        try {
            registerMismatchMethod.invoke(typeValidator, registerMismatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#registerMismatch(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.JSError)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#restrictByNotNullOrUndefined()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: found = found.restrictByNotNullOrUndefined();
 *  */
    @Test
    public void testRegisterMismatch_ThrowNullPointerException() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.registerMismatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.registerMismatch(TypeValidator.java:668) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class jSErrorType = Class.forName("com.google.javascript.jscomp.JSError");
        Method registerMismatchMethod = typeValidatorClazz.getDeclaredMethod("registerMismatch", jSTypeType, jSTypeType, jSErrorType);
        registerMismatchMethod.setAccessible(true);
        java.lang.Object[] registerMismatchMethodArguments = new java.lang.Object[3];
        registerMismatchMethodArguments[0] = ((Object) null);
        registerMismatchMethodArguments[1] = ((Object) null);
        registerMismatchMethodArguments[2] = ((Object) null);
        try {
            registerMismatchMethod.invoke(typeValidator, registerMismatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.getNativeType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.returnsFrom {@code return typeRegistry.getNativeType(typeId);}
 *  */
    @Test
    public void testGetNativeType_JSTypeRegistryGetNativeType() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method getNativeTypeMethod = typeValidatorClazz.getDeclaredMethod("getNativeType", jSTypeNativeType);
        getNativeTypeMethod.setAccessible(true);
        java.lang.Object[] getNativeTypeMethodArguments = new java.lang.Object[1];
        getNativeTypeMethodArguments[0] = jSTypeNative;
        JSType actual = ((JSType) getNativeTypeMethod.invoke(typeValidator, getNativeTypeMethodArguments));
        
        assertNull(actual);
        
        JSTypeRegistry typeValidatorTypeRegistry = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes0 = ((JSType) get(typeValidatorTypeRegistryTypeRegistryNativeTypes, 0));
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return typeRegistry.getNativeType(typeId);
 *  */
    @Test
    public void testGetNativeType_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.U2U_FUNCTION_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.getNativeType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 48 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:788) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method getNativeTypeMethod = typeValidatorClazz.getDeclaredMethod("getNativeType", jSTypeNativeType);
        getNativeTypeMethod.setAccessible(true);
        java.lang.Object[] getNativeTypeMethodArguments = new java.lang.Object[1];
        getNativeTypeMethodArguments[0] = jSTypeNative;
        try {
            getNativeTypeMethod.invoke(typeValidator, getNativeTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return typeRegistry.getNativeType(typeId);
 *  */
    @Test
    public void testGetNativeType_ThrowNullPointerException() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.getNativeType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:788) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method getNativeTypeMethod = typeValidatorClazz.getDeclaredMethod("getNativeType", jSTypeNativeType);
        getNativeTypeMethod.setAccessible(true);
        java.lang.Object[] getNativeTypeMethodArguments = new java.lang.Object[1];
        getNativeTypeMethodArguments[0] = ((Object) null);
        try {
            getNativeTypeMethod.invoke(typeValidator, getNativeTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.registerIfMismatch
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method registerIfMismatch(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.JSError)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#registerIfMismatch(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.JSError)}
 * @utbot.executesCondition {@code (found != null): True}
 * @utbot.executesCondition {@code (required != null): True}
 *  */
    @Test
    public void testRegisterIfMismatch_RequiredNotEqualsNull() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object unresolvedTypeExpression = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class unresolvedTypeExpressionType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class jSErrorType = Class.forName("com.google.javascript.jscomp.JSError");
        Method registerIfMismatchMethod = typeValidatorClazz.getDeclaredMethod("registerIfMismatch", unresolvedTypeExpressionType, unresolvedTypeExpressionType, jSErrorType);
        registerIfMismatchMethod.setAccessible(true);
        java.lang.Object[] registerIfMismatchMethodArguments = new java.lang.Object[3];
        registerIfMismatchMethodArguments[0] = unresolvedTypeExpression;
        registerIfMismatchMethodArguments[1] = enumElementType;
        registerIfMismatchMethodArguments[2] = ((Object) null);
        registerIfMismatchMethod.invoke(typeValidator, registerIfMismatchMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#registerIfMismatch(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.JSError)}
 * @utbot.executesCondition {@code (found != null): True}
 * @utbot.executesCondition {@code (required != null): False}
 *  */
    @Test
    public void testRegisterIfMismatch_RequiredEqualsNull() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class jSErrorType = Class.forName("com.google.javascript.jscomp.JSError");
        Method registerIfMismatchMethod = typeValidatorClazz.getDeclaredMethod("registerIfMismatch", enumElementTypeType, enumElementTypeType, jSErrorType);
        registerIfMismatchMethod.setAccessible(true);
        java.lang.Object[] registerIfMismatchMethodArguments = new java.lang.Object[3];
        registerIfMismatchMethodArguments[0] = enumElementType;
        registerIfMismatchMethodArguments[1] = ((Object) null);
        registerIfMismatchMethodArguments[2] = ((Object) null);
        registerIfMismatchMethod.invoke(typeValidator, registerIfMismatchMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#registerIfMismatch(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.JSError)}
 * @utbot.executesCondition {@code (found != null): True}
 * @utbot.executesCondition {@code (required != null): True}
 *  */
    @Test
    public void testRegisterIfMismatch_RequiredNotEqualsNull_1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class parameterizedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class jSErrorType = Class.forName("com.google.javascript.jscomp.JSError");
        Method registerIfMismatchMethod = typeValidatorClazz.getDeclaredMethod("registerIfMismatch", parameterizedTypeType, parameterizedTypeType, jSErrorType);
        registerIfMismatchMethod.setAccessible(true);
        java.lang.Object[] registerIfMismatchMethodArguments = new java.lang.Object[3];
        registerIfMismatchMethodArguments[0] = parameterizedType;
        registerIfMismatchMethodArguments[1] = enumElementType;
        registerIfMismatchMethodArguments[2] = ((Object) null);
        registerIfMismatchMethod.invoke(typeValidator, registerIfMismatchMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#registerIfMismatch(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.JSError)}
 * @utbot.executesCondition {@code (found != null): False}
 *  */
    @Test
    public void testRegisterIfMismatch_FoundEqualsNull() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class jSErrorType = Class.forName("com.google.javascript.jscomp.JSError");
        Method registerIfMismatchMethod = typeValidatorClazz.getDeclaredMethod("registerIfMismatch", jSTypeType, jSTypeType, jSErrorType);
        registerIfMismatchMethod.setAccessible(true);
        java.lang.Object[] registerIfMismatchMethodArguments = new java.lang.Object[3];
        registerIfMismatchMethodArguments[0] = ((Object) null);
        registerIfMismatchMethodArguments[1] = ((Object) null);
        registerIfMismatchMethodArguments[2] = ((Object) null);
        registerIfMismatchMethod.invoke(typeValidator, registerIfMismatchMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#registerIfMismatch(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.JSError)}
 * @utbot.executesCondition {@code (found != null): True}
 * @utbot.executesCondition {@code (required != null): True}
 *  */
    @Test
    public void testRegisterIfMismatch_RequiredNotEqualsNull_2() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class parameterizedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class jSErrorType = Class.forName("com.google.javascript.jscomp.JSError");
        Method registerIfMismatchMethod = typeValidatorClazz.getDeclaredMethod("registerIfMismatch", parameterizedTypeType, parameterizedTypeType, jSErrorType);
        registerIfMismatchMethod.setAccessible(true);
        java.lang.Object[] registerIfMismatchMethodArguments = new java.lang.Object[3];
        registerIfMismatchMethodArguments[0] = parameterizedType;
        registerIfMismatchMethodArguments[1] = enumElementType;
        registerIfMismatchMethodArguments[2] = ((Object) null);
        registerIfMismatchMethod.invoke(typeValidator, registerIfMismatchMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#registerIfMismatch(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.JSError)}
 * @utbot.executesCondition {@code (found != null): True}
 * @utbot.executesCondition {@code (required != null): True}
 *  */
    @Test
    public void testRegisterIfMismatch_RequiredNotEqualsNull_3() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class parameterizedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class jSErrorType = Class.forName("com.google.javascript.jscomp.JSError");
        Method registerIfMismatchMethod = typeValidatorClazz.getDeclaredMethod("registerIfMismatch", parameterizedTypeType, parameterizedTypeType, jSErrorType);
        registerIfMismatchMethod.setAccessible(true);
        java.lang.Object[] registerIfMismatchMethodArguments = new java.lang.Object[3];
        registerIfMismatchMethodArguments[0] = parameterizedType;
        registerIfMismatchMethodArguments[1] = enumElementType;
        registerIfMismatchMethodArguments[2] = ((Object) null);
        registerIfMismatchMethod.invoke(typeValidator, registerIfMismatchMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.getJSType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getJSType(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#getJSType(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsType == null): True}
 * @utbot.invokes com.google.javascript.jscomp.TypeValidator#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
 * @utbot.returnsFrom {@code return getNativeType(UNKNOWN_TYPE);}
 *  */
    @Test
    public void testGetJSType_JsTypeEqualsNull() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        Node node = new Node(0);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = typeValidatorClazz.getDeclaredMethod("getJSType", nodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = node;
        JSType actual = ((JSType) getJSTypeMethod.invoke(typeValidator, getJSTypeMethodArguments));
        
        assertNull(actual);
        
        JSTypeRegistry typeValidatorTypeRegistry = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes0 = ((JSType) get(typeValidatorTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typeValidatorTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes1 = ((JSType) get(typeValidatorTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry typeValidatorTypeRegistry2 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes2 = ((JSType) get(typeValidatorTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry typeValidatorTypeRegistry3 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes3 = ((JSType) get(typeValidatorTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry typeValidatorTypeRegistry4 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes4 = ((JSType) get(typeValidatorTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry typeValidatorTypeRegistry5 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes5 = ((JSType) get(typeValidatorTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry typeValidatorTypeRegistry6 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes6 = ((JSType) get(typeValidatorTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry typeValidatorTypeRegistry7 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes7 = ((JSType) get(typeValidatorTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry typeValidatorTypeRegistry8 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes8 = ((JSType) get(typeValidatorTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry typeValidatorTypeRegistry9 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes9 = ((JSType) get(typeValidatorTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry typeValidatorTypeRegistry10 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes10 = ((JSType) get(typeValidatorTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry typeValidatorTypeRegistry11 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes11 = ((JSType) get(typeValidatorTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry typeValidatorTypeRegistry12 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes12 = ((JSType) get(typeValidatorTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry typeValidatorTypeRegistry13 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes13 = ((JSType) get(typeValidatorTypeRegistry13TypeRegistryNativeTypes, 13));
        JSTypeRegistry typeValidatorTypeRegistry14 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes14 = ((JSType) get(typeValidatorTypeRegistry14TypeRegistryNativeTypes, 14));
        JSTypeRegistry typeValidatorTypeRegistry15 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes15 = ((JSType) get(typeValidatorTypeRegistry15TypeRegistryNativeTypes, 15));
        JSTypeRegistry typeValidatorTypeRegistry16 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes16 = ((JSType) get(typeValidatorTypeRegistry16TypeRegistryNativeTypes, 16));
        JSTypeRegistry typeValidatorTypeRegistry17 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes17 = ((JSType) get(typeValidatorTypeRegistry17TypeRegistryNativeTypes, 17));
        JSTypeRegistry typeValidatorTypeRegistry18 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes18 = ((JSType) get(typeValidatorTypeRegistry18TypeRegistryNativeTypes, 18));
        JSTypeRegistry typeValidatorTypeRegistry19 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes19 = ((JSType) get(typeValidatorTypeRegistry19TypeRegistryNativeTypes, 19));
        JSTypeRegistry typeValidatorTypeRegistry20 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes20 = ((JSType) get(typeValidatorTypeRegistry20TypeRegistryNativeTypes, 20));
        JSTypeRegistry typeValidatorTypeRegistry21 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes21 = ((JSType) get(typeValidatorTypeRegistry21TypeRegistryNativeTypes, 21));
        JSTypeRegistry typeValidatorTypeRegistry22 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes22 = ((JSType) get(typeValidatorTypeRegistry22TypeRegistryNativeTypes, 22));
        JSTypeRegistry typeValidatorTypeRegistry23 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes23 = ((JSType) get(typeValidatorTypeRegistry23TypeRegistryNativeTypes, 23));
        JSTypeRegistry typeValidatorTypeRegistry24 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes24 = ((JSType) get(typeValidatorTypeRegistry24TypeRegistryNativeTypes, 24));
        JSTypeRegistry typeValidatorTypeRegistry25 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry25TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes25 = ((JSType) get(typeValidatorTypeRegistry25TypeRegistryNativeTypes, 25));
        JSTypeRegistry typeValidatorTypeRegistry26 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry26TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes26 = ((JSType) get(typeValidatorTypeRegistry26TypeRegistryNativeTypes, 26));
        JSTypeRegistry typeValidatorTypeRegistry27 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry27TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes27 = ((JSType) get(typeValidatorTypeRegistry27TypeRegistryNativeTypes, 27));
        JSTypeRegistry typeValidatorTypeRegistry28 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry28TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes28 = ((JSType) get(typeValidatorTypeRegistry28TypeRegistryNativeTypes, 28));
        JSTypeRegistry typeValidatorTypeRegistry29 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry29TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes29 = ((JSType) get(typeValidatorTypeRegistry29TypeRegistryNativeTypes, 29));
        JSTypeRegistry typeValidatorTypeRegistry30 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry30TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes30 = ((JSType) get(typeValidatorTypeRegistry30TypeRegistryNativeTypes, 30));
        JSTypeRegistry typeValidatorTypeRegistry31 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry31TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry31, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes31 = ((JSType) get(typeValidatorTypeRegistry31TypeRegistryNativeTypes, 31));
        JSTypeRegistry typeValidatorTypeRegistry32 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry32TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry32, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes32 = ((JSType) get(typeValidatorTypeRegistry32TypeRegistryNativeTypes, 32));
        JSTypeRegistry typeValidatorTypeRegistry33 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry33TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry33, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes33 = ((JSType) get(typeValidatorTypeRegistry33TypeRegistryNativeTypes, 33));
        JSTypeRegistry typeValidatorTypeRegistry34 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry34TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry34, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes34 = ((JSType) get(typeValidatorTypeRegistry34TypeRegistryNativeTypes, 34));
        JSTypeRegistry typeValidatorTypeRegistry35 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry35TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry35, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes35 = ((JSType) get(typeValidatorTypeRegistry35TypeRegistryNativeTypes, 35));
        JSTypeRegistry typeValidatorTypeRegistry36 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry36TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry36, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes36 = ((JSType) get(typeValidatorTypeRegistry36TypeRegistryNativeTypes, 36));
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes0);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes1);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes2);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes3);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes4);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes5);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes6);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes7);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes8);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes9);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes10);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes11);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes12);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes13);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes14);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes15);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes16);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes17);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes18);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes19);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes20);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes21);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes22);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes23);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes24);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes25);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes26);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes27);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes28);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes29);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes30);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes31);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes32);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes33);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes34);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes35);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes36);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#getJSType(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsType == null): False}
 * @utbot.returnsFrom {@code return jsType;}
 *  */
    @Test
    public void testGetJSType_JsTypeNotEqualsNull() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = typeValidatorClazz.getDeclaredMethod("getJSType", nodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = node;
        EnumElementType actual = ((EnumElementType) getJSTypeMethod.invoke(typeValidator, getJSTypeMethodArguments));
        
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
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#getJSType(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsType == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getNativeType(UNKNOWN_TYPE);
 *  */
    @Test
    public void testGetJSType_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.getJSType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:788)
            com.google.javascript.jscomp.TypeValidator.getJSType(TypeValidator.java:781) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = typeValidatorClazz.getDeclaredMethod("getJSType", stringNodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = stringNode;
        try {
            getJSTypeMethod.invoke(typeValidator, getJSTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#getJSType(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType jsType = n.getJSType();
 *  */
    @Test
    public void testGetJSType_ThrowNullPointerException() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.getJSType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getJSType(TypeValidator.java:775) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = typeValidatorClazz.getDeclaredMethod("getJSType", nodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = ((Object) null);
        try {
            getJSTypeMethod.invoke(typeValidator, getJSTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#getJSType(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsType == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getNativeType(UNKNOWN_TYPE);
 *  */
    @Test
    public void testGetJSType_ThrowNullPointerException_1() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.getJSType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:788)
            com.google.javascript.jscomp.TypeValidator.getJSType(TypeValidator.java:781) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = typeValidatorClazz.getDeclaredMethod("getJSType", stringNodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = stringNode;
        try {
            getJSTypeMethod.invoke(typeValidator, getJSTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.containsForwardDeclaredUnresolvedName
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method containsForwardDeclaredUnresolvedName(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#containsForwardDeclaredUnresolvedName(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isUnionType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: type.isUnionType()
 *  */
    @Test
    public void testContainsForwardDeclaredUnresolvedName_ThrowNullPointerException() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.containsForwardDeclaredUnresolvedName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.containsForwardDeclaredUnresolvedName(TypeValidator.java:284) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method containsForwardDeclaredUnresolvedNameMethod = typeValidatorClazz.getDeclaredMethod("containsForwardDeclaredUnresolvedName", jSTypeType);
        containsForwardDeclaredUnresolvedNameMethod.setAccessible(true);
        java.lang.Object[] containsForwardDeclaredUnresolvedNameMethodArguments = new java.lang.Object[1];
        containsForwardDeclaredUnresolvedNameMethodArguments[0] = ((Object) null);
        try {
            containsForwardDeclaredUnresolvedNameMethod.invoke(typeValidator, containsForwardDeclaredUnresolvedNameMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields880894847761800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields880894847761800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass880894847766800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields880894847761800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass880894847766800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields880894849437400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields880894849437400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass880894849439600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields880894849437400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass880894849439600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

