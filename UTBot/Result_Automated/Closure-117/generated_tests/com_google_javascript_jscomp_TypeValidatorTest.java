package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import java.lang.reflect.Method;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.TemplatizedType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.TemplateType;
import java.lang.reflect.Constructor;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.jscomp.Scope.Arguments;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.jstype.UnionType;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import com.google.javascript.rhino.jstype.Property;
import java.util.List;
import com.google.javascript.rhino.jstype.UnknownType;
import com.google.javascript.rhino.jstype.VoidType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.TemplateTypeMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertFalse;

public final class com_google_javascript_jscomp_TypeValidatorTest {
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
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:904)
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:797)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:661) */
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
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:656)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:661) */
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
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:797)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:661) */
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
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.mismatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.registerMismatch(TypeValidator.java:674)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:666) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class stringType = Class.forName("java.lang.String");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method mismatchMethod = typeValidatorClazz.getDeclaredMethod("mismatch", stringType, numberNodeType, stringType, jSTypeType, jSTypeType);
        mismatchMethod.setAccessible(true);
        java.lang.Object[] mismatchMethodArguments = new java.lang.Object[5];
        mismatchMethodArguments[0] = string;
        mismatchMethodArguments[1] = numberNode;
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
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:656) */
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
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.mismatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.registerMismatch(TypeValidator.java:674)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:666)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:656) */
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
        mismatchMethodArguments[4] = noResolvedType;
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
            com.google.javascript.jscomp.TypeValidator.registerMismatch(TypeValidator.java:674)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:666)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:656) */
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
            com.google.javascript.jscomp.TypeValidator.report(TypeValidator.java:802) */
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
            com.google.javascript.jscomp.TypeValidator.containsForwardDeclaredUnresolvedName(TypeValidator.java:286) */
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
            com.google.javascript.jscomp.TypeValidator.expectInterfaceProperty(TypeValidator.java:609) */
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
            com.google.javascript.jscomp.TypeValidator.expectAllInterfaceProperties(TypeValidator.java:592) */
        typeValidator.expectAllInterfaceProperties(null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method expectAllInterfaceProperties(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectAllInterfaceProperties(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: ObjectType instance = type.getInstanceType();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testExpectAllInterfaceProperties_ThrowIllegalStateException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        typeValidator.expectAllInterfaceProperties(null, null, functionType);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectAllInterfaceProperties(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: ObjectType instance = type.getInstanceType();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testExpectAllInterfaceProperties_ThrowIllegalStateException_1() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noResolvedTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method expectAllInterfacePropertiesMethod = typeValidatorClazz.getDeclaredMethod("expectAllInterfaceProperties", nodeTraversalType, nodeType, noResolvedTypeType);
        expectAllInterfacePropertiesMethod.setAccessible(true);
        java.lang.Object[] expectAllInterfacePropertiesMethodArguments = new java.lang.Object[3];
        expectAllInterfacePropertiesMethodArguments[0] = ((Object) null);
        expectAllInterfacePropertiesMethodArguments[1] = ((Object) null);
        expectAllInterfacePropertiesMethodArguments[2] = noResolvedType;
        try {
            expectAllInterfacePropertiesMethod.invoke(typeValidator, expectAllInterfacePropertiesMethodArguments);
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
 * @utbot.executesCondition {@code (n.isGetProp()): False}
 * @utbot.executesCondition {@code (dereference): False}
 * @utbot.executesCondition {@code (type.isFunctionPrototypeType()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isGetProp()}
 * @utbot.invokes com.google.javascript.jscomp.TypeValidator#getJSType(com.google.javascript.rhino.Node)
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isFunctionPrototypeType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#toString()}
 * @utbot.returnsFrom {@code return type.toString();}
 *  */
    @Test
    public void testGetReadableJSTypeName_NotTypeIsFunctionPrototypeType() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        Object jsType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        NoObjectType ownerFunction = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
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
    public void testGetReadableJSTypeName_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(32);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:904)
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:797)
            com.google.javascript.jscomp.TypeValidator.getJSType(TypeValidator.java:790)
            com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName(TypeValidator.java:756) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Method getReadableJSTypeNameMethod = typeValidatorClazz.getDeclaredMethod("getReadableJSTypeName", numberNodeType, booleanType);
        getReadableJSTypeNameMethod.setAccessible(true);
        java.lang.Object[] getReadableJSTypeNameMethodArguments = new java.lang.Object[2];
        getReadableJSTypeNameMethodArguments[0] = numberNode;
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
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isGetProp()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.isGetProp()
 *  */
    @Test
    public void testGetReadableJSTypeName_ThrowNullPointerException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName(TypeValidator.java:731) */
        typeValidator.getReadableJSTypeName(null, false);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#getReadableJSTypeName(com.google.javascript.rhino.Node,boolean)}
 * @utbot.executesCondition {@code (n.isGetProp()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes com.google.javascript.jscomp.TypeValidator#getJSType(com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ObjectType objectType = getJSType(n.getFirstChild()).dereference();
 *  */
    @Test
    public void testGetReadableJSTypeName_ThrowNullPointerException_1() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getJSType(TypeValidator.java:784)
            com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName(TypeValidator.java:732) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType type = getJSType(n);
 *  */
    @Test
    public void testGetReadableJSTypeName_ThrowNullPointerException_2() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(2);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:797)
            com.google.javascript.jscomp.TypeValidator.getJSType(TypeValidator.java:790)
            com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName(TypeValidator.java:756) */
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
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[36];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(1);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName(TypeValidator.java:758) */
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
 * @utbot.executesCondition {@code (n.isGetProp()): False}
 * @utbot.executesCondition {@code (dereference): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isFunctionPrototypeType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: type.isFunctionPrototypeType() || (type.toObjectType() != null && type.toObjectType().getConstructor() != null)
 *  */
    @Test
    public void testGetReadableJSTypeName_ThrowNullPointerException_4() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[36];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(1);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName(TypeValidator.java:763) */
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
            com.google.javascript.jscomp.TypeValidator.expectValidTypeofName(TypeValidator.java:167) */
        typeValidator.expectValidTypeofName(null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method expectValidTypeofName(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, java.lang.String)
    
    @Test
    public void testExpectValidTypeofName1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        String sourceName = "";
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "sourceName", sourceName);
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
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectNotNullOrUndefined
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method expectNotNullOrUndefined(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectNotNullOrUndefined(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testExpectNotNullOrUndefined_ReturnTrue() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplatizedType templatizedType = ((TemplatizedType) createInstance("com.google.javascript.rhino.jstype.TemplatizedType"));
        TemplatizedType referencedType = ((TemplatizedType) createInstance("com.google.javascript.rhino.jstype.TemplatizedType"));
        NoType referencedType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templatizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        boolean actual = typeValidator.expectNotNullOrUndefined(null, null, templatizedType, null, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectNotNullOrUndefined(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testExpectNotNullOrUndefined_ReturnTrue_1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplatizedType referencedType = ((TemplatizedType) createInstance("com.google.javascript.rhino.jstype.TemplatizedType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplatizedType referencedType2 = ((TemplatizedType) createInstance("com.google.javascript.rhino.jstype.TemplatizedType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoType referencedType4 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        boolean actual = typeValidator.expectNotNullOrUndefined(null, null, templateType, null, null);
        
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
            com.google.javascript.jscomp.TypeValidator.expectNotNullOrUndefined(TypeValidator.java:259) */
        typeValidator.expectNotNullOrUndefined(null, null, null, null, null);
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
            com.google.javascript.jscomp.TypeValidator.expectStringOrNumber(TypeValidator.java:245) */
        typeValidator.expectStringOrNumber(null, null, null, null);
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
            com.google.javascript.jscomp.TypeValidator.expectSwitchMatchesCase(TypeValidator.java:306) */
        typeValidator.expectSwitchMatchesCase(null, null, null, null);
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
        TemplatizedType templatizedType = ((TemplatizedType) createInstance("com.google.javascript.rhino.jstype.TemplatizedType"));
        NoType referencedType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(templatizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        boolean actual = typeValidator.expectCanAssignToPropertyOf(null, null, null, templatizedType, null, null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expectCanAssignToPropertyOf(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectCanAssignToPropertyOf(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isNoType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !leftType.isNoType() && !rightType.isSubtype(leftType)
 *  */
    @Test
    public void testExpectCanAssignToPropertyOf_ThrowNullPointerException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectCanAssignToPropertyOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectCanAssignToPropertyOf(TypeValidator.java:370) */
        typeValidator.expectCanAssignToPropertyOf(null, null, null, null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectArgumentMatchesParameter
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expectArgumentMatchesParameter(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node, int)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectArgumentMatchesParameter(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !argType.isSubtype(paramType)
 *  */
    @Test
    public void testExpectArgumentMatchesParameter_ThrowNullPointerException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectArgumentMatchesParameter] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectArgumentMatchesParameter(TypeValidator.java:425) */
        typeValidator.expectArgumentMatchesParameter(null, null, null, null, null, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method expectUndeclaredVariable(java.lang.String, com.google.javascript.jscomp.CompilerInput, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope$Var, java.lang.String, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectUndeclaredVariable(java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope.Var,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (varType != null): False}
 * @utbot.returnsFrom {@code return newVar;}
 *  */
    @Test
    public void testExpectUndeclaredVariable_VarTypeEqualsNull() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
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
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Method expectUndeclaredVariableMethod = typeValidatorClazz.getDeclaredMethod("expectUndeclaredVariable", stringType, compilerInputType, nodeType, nodeType, varClazz, stringType, jSTypeType);
        expectUndeclaredVariableMethod.setAccessible(true);
        java.lang.Object[] expectUndeclaredVariableMethodArguments = new java.lang.Object[7];
        expectUndeclaredVariableMethodArguments[0] = ((Object) null);
        expectUndeclaredVariableMethodArguments[1] = ((Object) null);
        expectUndeclaredVariableMethodArguments[2] = numberNode;
        expectUndeclaredVariableMethodArguments[3] = ((Object) null);
        expectUndeclaredVariableMethodArguments[4] = var;
        expectUndeclaredVariableMethodArguments[5] = ((Object) null);
        expectUndeclaredVariableMethodArguments[6] = ((Object) null);
        Scope.Var actual = ((Scope.Var) expectUndeclaredVariableMethod.invoke(typeValidator, expectUndeclaredVariableMethodArguments));
        
        Scope.Var expected = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        
        // com.google.javascript.jscomp.Scope.Var has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectUndeclaredVariable(java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope.Var,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (varType != null): True}
 * @utbot.executesCondition {@code (varType != typeRegistry.getNativeType(UNKNOWN_TYPE)): True}
 * @utbot.executesCondition {@code (varType != typeRegistry.getNativeType(UNKNOWN_TYPE)): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.returnsFrom {@code return newVar;}
 *  */
    @Test
    public void testExpectUndeclaredVariable_VarTypeEqualsTypeRegistryGetNativeType() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(1);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class anonymousPredicateType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, templateTypeType, scopeType, intType, compilerInputType, anonymousPredicateType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[8];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = templateType;
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Method expectUndeclaredVariableMethod = typeValidatorClazz.getDeclaredMethod("expectUndeclaredVariable", stringType, compilerInputType, nodeType, nodeType, varClazz, stringType, templateTypeType);
        expectUndeclaredVariableMethod.setAccessible(true);
        java.lang.Object[] expectUndeclaredVariableMethodArguments = new java.lang.Object[7];
        expectUndeclaredVariableMethodArguments[0] = ((Object) null);
        expectUndeclaredVariableMethodArguments[1] = ((Object) null);
        expectUndeclaredVariableMethodArguments[2] = numberNode;
        expectUndeclaredVariableMethodArguments[3] = ((Object) null);
        expectUndeclaredVariableMethodArguments[4] = var;
        expectUndeclaredVariableMethodArguments[5] = ((Object) null);
        expectUndeclaredVariableMethodArguments[6] = ((Object) null);
        Scope.Var actual = ((Scope.Var) expectUndeclaredVariableMethod.invoke(typeValidator, expectUndeclaredVariableMethodArguments));
        
        Scope.Var expected = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        expected.setType(templateType);
        
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expectUndeclaredVariable(java.lang.String, com.google.javascript.jscomp.CompilerInput, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope$Var, java.lang.String, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectUndeclaredVariable(java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope.Var,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (n.isGetProp() || NodeUtil.isObjectLitKey(n)): True}
 * @utbot.executesCondition {@code (NodeUtil.isObjectLitKey(n)): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: JSDocInfo info = n.getJSDocInfo();
 *  */
    @Test
    public void testExpectUndeclaredVariable_ThrowClassCastException() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(148);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        short[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable] produces [java.lang.ClassCastException: class [S cannot be cast to class com.google.javascript.rhino.JSDocInfo ([S is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.JSDocInfo is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7fa7457f)]
            com.google.javascript.rhino.Node.getJSDocInfo(Node.java:1880)
            com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable(TypeValidator.java:530) */
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
 * @utbot.executesCondition {@code (n.isGetProp() || NodeUtil.isObjectLitKey(n)): True}
 * @utbot.executesCondition {@code (NodeUtil.isObjectLitKey(n)): False}
 * @utbot.executesCondition {@code (varType != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: varType != typeRegistry.getNativeType(UNKNOWN_TYPE)
 *  */
    @Test
    public void testExpectUndeclaredVariable_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-252);
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
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:904)
            com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable(TypeValidator.java:544) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.isGetProp() || NodeUtil.isObjectLitKey(n)
 *  */
    @Test
    public void testExpectUndeclaredVariable_ThrowNullPointerException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable(TypeValidator.java:528) */
        typeValidator.expectUndeclaredVariable(null, null, null, null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectUndeclaredVariable(java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope.Var,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (n.isGetProp() || NodeUtil.isObjectLitKey(n)): False}
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
 * @utbot.executesCondition {@code (n.isGetProp() || NodeUtil.isObjectLitKey(n)): True}
 * @utbot.executesCondition {@code (NodeUtil.isObjectLitKey(n)): True}
 * @utbot.executesCondition {@code (info == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: info = parent.getJSDocInfo();
 *  */
    @Test
    public void testExpectUndeclaredVariable_ThrowNullPointerException_3() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(148);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable] produces [java.lang.NullPointerException]
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
 * @utbot.executesCondition {@code (n.isGetProp() || NodeUtil.isObjectLitKey(n)): True}
 * @utbot.executesCondition {@code (NodeUtil.isObjectLitKey(n)): False}
 * @utbot.executesCondition {@code (varType != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: varType != typeRegistry.getNativeType(UNKNOWN_TYPE)
 *  */
    @Test
    public void testExpectUndeclaredVariable_ThrowNullPointerException_2() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-254);
        TemplatizedType templatizedType = ((TemplatizedType) createInstance("com.google.javascript.rhino.jstype.TemplatizedType"));
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class templatizedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class anonymousPredicateType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, templatizedTypeType, scopeType, intType, compilerInputType, anonymousPredicateType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[8];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = templatizedType;
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable(TypeValidator.java:544) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Method expectUndeclaredVariableMethod = typeValidatorClazz.getDeclaredMethod("expectUndeclaredVariable", stringType, compilerInputType, nodeType, nodeType, varClazz, stringType, templatizedTypeType);
        expectUndeclaredVariableMethod.setAccessible(true);
        java.lang.Object[] expectUndeclaredVariableMethodArguments = new java.lang.Object[7];
        expectUndeclaredVariableMethodArguments[0] = ((Object) null);
        expectUndeclaredVariableMethodArguments[1] = ((Object) null);
        expectUndeclaredVariableMethodArguments[2] = stringNode;
        expectUndeclaredVariableMethodArguments[3] = ((Object) null);
        expectUndeclaredVariableMethodArguments[4] = var;
        expectUndeclaredVariableMethodArguments[5] = ((Object) null);
        expectUndeclaredVariableMethodArguments[6] = ((Object) null);
        try {
            expectUndeclaredVariableMethod.invoke(typeValidator, expectUndeclaredVariableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method expectUndeclaredVariable(java.lang.String, com.google.javascript.jscomp.CompilerInput, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope$Var, java.lang.String, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectUndeclaredVariable(java.lang.String,com.google.javascript.jscomp.CompilerInput,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope.Var,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (n.isGetProp() || NodeUtil.isObjectLitKey(n)): False}
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method expectUndeclaredVariable(java.lang.String, com.google.javascript.jscomp.CompilerInput, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope$Var, java.lang.String, com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testExpectUndeclaredVariable1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[36];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        String string = "";
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Scope.Arguments arguments = new Scope.Arguments(scope);
        String string1 = "";
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class stringType = Class.forName("java.lang.String");
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class argumentsType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class noResolvedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method expectUndeclaredVariableMethod = typeValidatorClazz.getDeclaredMethod("expectUndeclaredVariable", stringType, compilerInputType, stringNodeType, stringNodeType, argumentsType, stringType, noResolvedTypeType);
        expectUndeclaredVariableMethod.setAccessible(true);
        java.lang.Object[] expectUndeclaredVariableMethodArguments = new java.lang.Object[7];
        expectUndeclaredVariableMethodArguments[0] = string;
        expectUndeclaredVariableMethodArguments[1] = ((Object) null);
        expectUndeclaredVariableMethodArguments[2] = stringNode;
        expectUndeclaredVariableMethodArguments[3] = stringNode1;
        expectUndeclaredVariableMethodArguments[4] = arguments;
        expectUndeclaredVariableMethodArguments[5] = string1;
        expectUndeclaredVariableMethodArguments[6] = noResolvedType;
        Scope.Arguments actual = ((Scope.Arguments) expectUndeclaredVariableMethod.invoke(typeValidator, expectUndeclaredVariableMethodArguments));
        
        Scope.Arguments expected = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        String name = "arguments";
        setField(expected, "com.google.javascript.jscomp.Scope$Var", "name", name);
        setField(expected, "com.google.javascript.jscomp.Scope$Var", "index", -1);
        setField(expected, "com.google.javascript.jscomp.Scope$Var", "scope", scope);
        
        // com.google.javascript.jscomp.Scope.Arguments has overridden equals method
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
        
        JSType finalArgumentsType = ((JSType) getFieldValue(arguments, "com.google.javascript.jscomp.Scope$Var", "type"));
        
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
        
        assertNull(finalArgumentsType);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method expectUndeclaredVariable(java.lang.String, com.google.javascript.jscomp.CompilerInput, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope$Var, java.lang.String, com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testExpectUndeclaredVariable2() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        String string = "";
        CompilerInput compilerInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(148);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable(TypeValidator.java:538) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class stringType = Class.forName("java.lang.String");
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method expectUndeclaredVariableMethod = typeValidatorClazz.getDeclaredMethod("expectUndeclaredVariable", stringType, compilerInputType, numberNodeType, numberNodeType, varType, stringType, jSTypeType);
        expectUndeclaredVariableMethod.setAccessible(true);
        java.lang.Object[] expectUndeclaredVariableMethodArguments = new java.lang.Object[7];
        expectUndeclaredVariableMethodArguments[0] = string;
        expectUndeclaredVariableMethodArguments[1] = compilerInput;
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
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method expectObject(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
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
    public void testExpectObject_ReturnTrue_2() throws Exception  {
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
    public void testExpectObject_ReturnTrue_3() throws Exception  {
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
    public void testExpectObject_ReturnTrue_4() throws Exception  {
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
    public void testExpectObject_ReturnTrue_5() throws Exception  {
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
        TemplatizedType primitiveType9 = ((TemplatizedType) createInstance("com.google.javascript.rhino.jstype.TemplatizedType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        setField(primitiveType9, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
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
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectObject(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testExpectObject_ReturnTrue_6() throws Exception  {
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
        TemplatizedType primitiveType9 = ((TemplatizedType) createInstance("com.google.javascript.rhino.jstype.TemplatizedType"));
        FunctionType referencedType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(primitiveType9, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
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
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectObject(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testExpectObject_ReturnTrue_7() throws Exception  {
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
        TemplatizedType primitiveType9 = ((TemplatizedType) createInstance("com.google.javascript.rhino.jstype.TemplatizedType"));
        EnumElementType referencedType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        Object primitiveType10 = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        setField(referencedType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType10);
        setField(primitiveType9, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
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
            com.google.javascript.jscomp.TypeValidator.expectObject(TypeValidator.java:177) */
        typeValidator.expectObject(null, null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method expectObject(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    @Test(expected = StackOverflowError.class)
    public void testExpectObject1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = new Node(0);
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
        TemplatizedType primitiveType9 = ((TemplatizedType) createInstance("com.google.javascript.rhino.jstype.TemplatizedType"));
        setField(primitiveType9, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", primitiveType8);
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
        String string = "";
        
        typeValidator.expectObject(nodeTraversal, node, enumElementType, string);
    }
    
    @Test(expected = StackOverflowError.class)
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
        TemplatizedType primitiveType9 = ((TemplatizedType) createInstance("com.google.javascript.rhino.jstype.TemplatizedType"));
        EnumElementType referencedType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", referencedType);
        setField(primitiveType9, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
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
        
        typeValidator.expectObject(null, null, enumElementType, null);
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
            com.google.javascript.jscomp.TypeValidator.expectActualObject(TypeValidator.java:189) */
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
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        String string = "";
        
        typeValidator.expectActualObject(null, null, unionType, string);
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
            com.google.javascript.rhino.jstype.UnionType.isObject(UnionType.java:385)
            com.google.javascript.rhino.jstype.EnumElementType.isObject(EnumElementType.java:108)
            com.google.javascript.jscomp.TypeValidator.expectActualObject(TypeValidator.java:189) */
        typeValidator.expectActualObject(nodeTraversal, null, enumElementType, null);
    }
    
    @Test
    public void testExpectActualObject6() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectActualObject] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.isObject(UnionType.java:385)
            com.google.javascript.jscomp.TypeValidator.expectActualObject(TypeValidator.java:189) */
        typeValidator.expectActualObject(nodeTraversal, null, unionType, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectBitwiseable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method expectBitwiseable(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectBitwiseable(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#matchesNumberContext()}
 *  */
    @Test
    public void testExpectBitwiseable_JSTypeMatchesNumberContext() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        typeValidator.expectBitwiseable(null, null, noType, null);
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
            com.google.javascript.jscomp.TypeValidator.expectBitwiseable(TypeValidator.java:233) */
        typeValidator.expectBitwiseable(null, null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method expectBitwiseable(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    @Test(expected = StackOverflowError.class)
    public void testExpectBitwiseable1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType allValueTypes = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(allValueTypes, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", allValueTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "allValueTypes", allValueTypes);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        typeValidator.expectBitwiseable(nodeTraversal, null, functionType, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testExpectBitwiseable2() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplatizedType allValueTypes = ((TemplatizedType) createInstance("com.google.javascript.rhino.jstype.TemplatizedType"));
        TemplatizedType referencedType = ((TemplatizedType) createInstance("com.google.javascript.rhino.jstype.TemplatizedType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", allValueTypes);
        setField(allValueTypes, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "allValueTypes", allValueTypes);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Method expectBitwiseableMethod = typeValidatorClazz.getDeclaredMethod("expectBitwiseable", nodeTraversalType, numberNodeType, functionTypeType, stringType);
        expectBitwiseableMethod.setAccessible(true);
        java.lang.Object[] expectBitwiseableMethodArguments = new java.lang.Object[4];
        expectBitwiseableMethodArguments[0] = nodeTraversal;
        expectBitwiseableMethodArguments[1] = numberNode;
        expectBitwiseableMethodArguments[2] = functionType;
        expectBitwiseableMethodArguments[3] = ((Object) null);
        try {
            expectBitwiseableMethod.invoke(typeValidator, expectBitwiseableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testExpectBitwiseable3() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType allValueTypes = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplatizedType referencedType = ((TemplatizedType) createInstance("com.google.javascript.rhino.jstype.TemplatizedType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", allValueTypes);
        setField(allValueTypes, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "allValueTypes", allValueTypes);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        String string = "";
        
        typeValidator.expectBitwiseable(null, null, functionType, string);
    }
    
    @Test
    public void testExpectBitwiseable4() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object properties = createInstance("com.google.javascript.rhino.jstype.PropertyMap");
        LinkedHashMap properties1 = new LinkedHashMap();
        setField(properties, "com.google.javascript.rhino.jstype.PropertyMap", "properties", properties1);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectBitwiseable] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.isEmptyType(JSType.java:177)
            com.google.javascript.rhino.jstype.ObjectType.getPropertyType(ObjectType.java:426)
            com.google.javascript.rhino.jstype.FunctionType.getPropertyType(FunctionType.java:632)
            com.google.javascript.rhino.jstype.PrototypeObjectType.hasOverridenNativeProperty(PrototypeObjectType.java:193)
            com.google.javascript.rhino.jstype.PrototypeObjectType.matchesNumberContext(PrototypeObjectType.java:174)
            com.google.javascript.rhino.jstype.FunctionType.matchesNumberContext(FunctionType.java:66)
            com.google.javascript.jscomp.TypeValidator.expectBitwiseable(TypeValidator.java:233) */
        typeValidator.expectBitwiseable(nodeTraversal, null, functionType, null);
    }
    
    @Test
    public void testExpectBitwiseable5() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType allValueTypes = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplatizedType referencedType1 = ((TemplatizedType) createInstance("com.google.javascript.rhino.jstype.TemplatizedType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(allValueTypes, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "allValueTypes", allValueTypes);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectBitwiseable] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:144)
            com.google.javascript.rhino.jstype.TemplatizedType.isUnknownType(TemplatizedType.java:51)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:144)
            com.google.javascript.rhino.jstype.TemplateType.isUnknownType(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:144)
            com.google.javascript.rhino.jstype.TemplateType.isUnknownType(TemplateType.java:48)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1238)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:1024)
            com.google.javascript.jscomp.TypeValidator.expectBitwiseable(TypeValidator.java:233) */
        typeValidator.expectBitwiseable(nodeTraversal, null, functionType, null);
    }
    
    @Test
    public void testExpectBitwiseable6() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        Object properties = createInstance("com.google.javascript.rhino.jstype.PropertyMap");
        LinkedHashMap properties1 = new LinkedHashMap();
        String string = "";
        Property property = ((Property) createInstance("com.google.javascript.rhino.jstype.Property"));
        properties1.put(string, property);
        String string1 = "";
        Object object = createInstance("java.lang.Object");
        properties1.put(string1, object);
        setField(properties, "com.google.javascript.rhino.jstype.PropertyMap", "properties", properties1);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectBitwiseable] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.isEmptyType(JSType.java:177)
            com.google.javascript.rhino.jstype.ObjectType.getPropertyType(ObjectType.java:426)
            com.google.javascript.rhino.jstype.FunctionType.getPropertyType(FunctionType.java:632)
            com.google.javascript.rhino.jstype.PrototypeObjectType.hasOverridenNativeProperty(PrototypeObjectType.java:193)
            com.google.javascript.rhino.jstype.PrototypeObjectType.matchesNumberContext(PrototypeObjectType.java:174)
            com.google.javascript.rhino.jstype.FunctionType.matchesNumberContext(FunctionType.java:66)
            com.google.javascript.jscomp.TypeValidator.expectBitwiseable(TypeValidator.java:233) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class errorFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Method expectBitwiseableMethod = typeValidatorClazz.getDeclaredMethod("expectBitwiseable", nodeTraversalType, numberNodeType, errorFunctionTypeType, stringType);
        expectBitwiseableMethod.setAccessible(true);
        java.lang.Object[] expectBitwiseableMethodArguments = new java.lang.Object[4];
        expectBitwiseableMethodArguments[0] = nodeTraversal;
        expectBitwiseableMethodArguments[1] = numberNode;
        expectBitwiseableMethodArguments[2] = errorFunctionType;
        expectBitwiseableMethodArguments[3] = ((Object) null);
        try {
            expectBitwiseableMethod.invoke(typeValidator, expectBitwiseableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
            com.google.javascript.jscomp.TypeValidator.expectNumber(TypeValidator.java:222) */
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
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:797)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:661)
            com.google.javascript.jscomp.TypeValidator.expectNumber(TypeValidator.java:223) */
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
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object properties = createInstance("com.google.javascript.rhino.jstype.PropertyMap");
        LinkedHashMap properties1 = new LinkedHashMap();
        String string = "";
        Property property = ((Property) createInstance("com.google.javascript.rhino.jstype.Property"));
        properties1.put(string, property);
        setField(properties, "com.google.javascript.rhino.jstype.PropertyMap", "properties", properties1);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectNumber] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.isEmptyType(JSType.java:177)
            com.google.javascript.rhino.jstype.ObjectType.getPropertyType(ObjectType.java:426)
            com.google.javascript.rhino.jstype.FunctionType.getPropertyType(FunctionType.java:632)
            com.google.javascript.rhino.jstype.PrototypeObjectType.hasOverridenNativeProperty(PrototypeObjectType.java:193)
            com.google.javascript.rhino.jstype.PrototypeObjectType.matchesNumberContext(PrototypeObjectType.java:174)
            com.google.javascript.rhino.jstype.FunctionType.matchesNumberContext(FunctionType.java:66)
            com.google.javascript.jscomp.TypeValidator.expectNumber(TypeValidator.java:222) */
        typeValidator.expectNumber(nodeTraversal, null, functionType, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectString
    
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
            com.google.javascript.jscomp.TypeValidator.expectString(TypeValidator.java:211) */
        typeValidator.expectString(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectString(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: mismatch(t, n, msg, type, STRING_TYPE);
 *  */
    @Test
    public void testExpectString_ThrowNullPointerException_1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:797)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:661)
            com.google.javascript.jscomp.TypeValidator.expectString(TypeValidator.java:212) */
        typeValidator.expectString(null, null, functionType, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectString(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: mismatch(t, n, msg, type, STRING_TYPE);
 *  */
    @Test
    public void testExpectString_ThrowNullPointerException_2() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[31];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:656)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:661)
            com.google.javascript.jscomp.TypeValidator.expectString(TypeValidator.java:212) */
        typeValidator.expectString(null, null, functionType, null);
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
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:904)
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:797)
            com.google.javascript.jscomp.TypeValidator.expectAnyObject(TypeValidator.java:199) */
        typeValidator.expectAnyObject(null, null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectIndexMatch
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expectIndexMatch(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectIndexMatch(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isGetElem()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(n.isGetElem());
 *  */
    @Test
    public void testExpectIndexMatch_ThrowNullPointerException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectIndexMatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectIndexMatch(TypeValidator.java:327) */
        typeValidator.expectIndexMatch(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectIndexMatch(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isGetElem()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: objType.isStruct()
 *  */
    @Test
    public void testExpectIndexMatch_ThrowNullPointerException_1() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(35);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectIndexMatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectIndexMatch(TypeValidator.java:329) */
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
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectCanOverride
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expectCanOverride(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, java.lang.String, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectCanOverride(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !overridingType.isSubtype(hiddenType)
 *  */
    @Test
    public void testExpectCanOverride_ThrowNullPointerException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectCanOverride] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectCanOverride(TypeValidator.java:449) */
        typeValidator.expectCanOverride(null, null, null, null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectSuperType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method expectSuperType(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.ObjectType)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (declaredSuper != null): False},
    ///     {@code (declaredSuper != null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectSuperType(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.executesCondition {@code (implicitProto == null): True}
 *  */
    @Test
    public void testExpectSuperType_ImplicitProtoEqualsNull_1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        typeValidator.expectSuperType(null, null, null, noType);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectSuperType(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.executesCondition {@code (implicitProto == null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#getImplicitPrototype()}
 *  */
    @Test
    public void testExpectSuperType_ImplicitProtoNotEqualsNull() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoType implicitPrototypeFallback = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        typeValidator.expectSuperType(null, null, null, functionType);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectSuperType(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.executesCondition {@code (implicitProto == null): True}
 *  */
    @Test
    public void testExpectSuperType_ImplicitProtoEqualsNull() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        typeValidator.expectSuperType(null, null, null, functionType);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method expectSuperType(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.ObjectType)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (implicitProto == null): False}
    /// invoke:
    ///     {@link com.google.javascript.rhino.jstype.ObjectType#getImplicitPrototype()} once
    /// execute conditions:
    ///     {@code (declaredSuper != null): True}
    /// invoke:
    ///     {@link com.google.javascript.rhino.jstype.ObjectType#isTemplatizedType()} once
    /// execute conditions:
    ///     {@code (declaredSuper.isTemplatizedType()): True}
    /// invoke:
    ///     {@link com.google.javascript.rhino.jstype.ObjectType#toMaybeTemplatizedType()} once,
    ///     {@link com.google.javascript.rhino.jstype.TemplatizedType#getReferencedType()} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectSuperType(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.executesCondition {@code (declaredSuper != null): True}
 * @utbot.executesCondition {@code (!(superObject instanceof UnknownType)): False}
 *  */
    @Test
    public void testExpectSuperType_SuperObjectNotInstanceOfUnknownType() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        Object implicitPrototypeFallback = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        TemplatizedType implicitPrototypeFallback1 = ((TemplatizedType) createInstance("com.google.javascript.rhino.jstype.TemplatizedType"));
        EnumElementType referencedObjType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(implicitPrototypeFallback1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class unknownTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method expectSuperTypeMethod = typeValidatorClazz.getDeclaredMethod("expectSuperType", nodeTraversalType, nodeType, unknownTypeType, unknownTypeType);
        expectSuperTypeMethod.setAccessible(true);
        java.lang.Object[] expectSuperTypeMethodArguments = new java.lang.Object[4];
        expectSuperTypeMethodArguments[0] = ((Object) null);
        expectSuperTypeMethodArguments[1] = ((Object) null);
        expectSuperTypeMethodArguments[2] = unknownType;
        expectSuperTypeMethodArguments[3] = errorFunctionType;
        expectSuperTypeMethod.invoke(typeValidator, expectSuperTypeMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectSuperType(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.executesCondition {@code (declaredSuper != null): True}
 * @utbot.executesCondition {@code (!(superObject instanceof UnknownType)): True}
 * @utbot.executesCondition {@code (!declaredSuper.isEquivalentTo(superObject)): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testExpectSuperType_DeclaredSuperIsEquivalentTo() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        TemplatizedType implicitPrototypeFallback1 = ((TemplatizedType) createInstance("com.google.javascript.rhino.jstype.TemplatizedType"));
        setField(implicitPrototypeFallback1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", templateType);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        typeValidator.expectSuperType(null, null, templateType, functionType);
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
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        TemplateType implicitPrototypeFallback1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplatizedType referencedType = ((TemplatizedType) createInstance("com.google.javascript.rhino.jstype.TemplatizedType"));
        setField(implicitPrototypeFallback1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
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
            com.google.javascript.jscomp.TypeValidator.expectSuperType(TypeValidator.java:467) */
        typeValidator.expectSuperType(null, null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectCanAssignTo
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expectCanAssignTo(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectCanAssignTo(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !rightType.isSubtype(leftType)
 *  */
    @Test
    public void testExpectCanAssignTo_ThrowNullPointerException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectCanAssignTo] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectCanAssignTo(TypeValidator.java:405) */
        typeValidator.expectCanAssignTo(null, null, null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectCanCast
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method expectCanCast(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectCanCast(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#canCastTo(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testExpectCanCast_JSTypeCanCastTo() throws Exception  {
        Class jSTypeClazz = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object prevCAN_CAST_TO_VISITOR = getStaticFieldValue(jSTypeClazz, "CAN_CAST_TO_VISITOR");
        try {
            Object canCastToVisitor = createInstance("com.google.javascript.rhino.jstype.CanCastToVisitor");
            setStaticField(jSTypeClazz, "CAN_CAST_TO_VISITOR", canCastToVisitor);
            TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
            NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
            
            typeValidator.expectCanCast(null, null, null, noType);
        } finally {
            setStaticField(JSType.class, "CAN_CAST_TO_VISITOR", prevCAN_CAST_TO_VISITOR);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expectCanCast(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectCanCast(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#canCastTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !type.canCastTo(castType)
 *  */
    @Test
    public void testExpectCanCast_ThrowNullPointerException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectCanCast] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectCanCast(TypeValidator.java:504) */
        typeValidator.expectCanCast(null, null, null, null);
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
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.getNativeType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:904)
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:797) */
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
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:797) */
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
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(voidType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.registerMismatch] produces [java.lang.ArrayIndexOutOfBoundsException: Index 43 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:904)
            com.google.javascript.rhino.jstype.VoidType.restrictByNotNullOrUndefined(VoidType.java:59)
            com.google.javascript.jscomp.TypeValidator.registerMismatch(TypeValidator.java:674) */
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
            com.google.javascript.jscomp.TypeValidator.registerMismatch(TypeValidator.java:674) */
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
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.registerIfMismatch
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method registerIfMismatch(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.JSError)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#registerIfMismatch(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.JSError)}
 * @utbot.executesCondition {@code (found != null): True}
 * @utbot.executesCondition {@code (required != null): False}
 *  */
    @Test
    public void testRegisterIfMismatch_RequiredEqualsNull() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class jSErrorType = Class.forName("com.google.javascript.jscomp.JSError");
        Method registerIfMismatchMethod = typeValidatorClazz.getDeclaredMethod("registerIfMismatch", templateTypeType, templateTypeType, jSErrorType);
        registerIfMismatchMethod.setAccessible(true);
        java.lang.Object[] registerIfMismatchMethodArguments = new java.lang.Object[3];
        registerIfMismatchMethodArguments[0] = templateType;
        registerIfMismatchMethodArguments[1] = ((Object) null);
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
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:904)
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:797)
            com.google.javascript.jscomp.TypeValidator.getJSType(TypeValidator.java:790) */
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
            com.google.javascript.jscomp.TypeValidator.getJSType(TypeValidator.java:784) */
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
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:797)
            com.google.javascript.jscomp.TypeValidator.getJSType(TypeValidator.java:790) */
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
        
                java.lang.reflect.Method methodForGetDeclaredFields905073922851300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields905073922851300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass905073922862800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields905073922851300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass905073922862800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields905073924181800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields905073924181800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass905073924186000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields905073924181800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass905073924186000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields905073924992800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields905073924992800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass905073924996800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields905073924992800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass905073924996800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
                
                return field.get(null);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (java.lang.reflect.InvocationTargetException e3) {
                e3.printStackTrace();
            }
        } while (clazz != null);
    
        throw new NoSuchFieldException("Field '" + fieldName + "' not found on class " + originClass);
    }
    
    private static void setStaticField(Class<?> clazz, String fieldName, Object fieldValue) throws NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field field;
    
        try {
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
            } catch (Exception e) {
                clazz = clazz.getSuperclass();
                field = null;
            }
        } while (field == null);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields905073926356200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields905073926356200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass905073926359800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields905073926356200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass905073926359800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(null, fieldValue);
        }
        catch(java.lang.reflect.InvocationTargetException e){
            e.printStackTrace();
        }
        catch(NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

