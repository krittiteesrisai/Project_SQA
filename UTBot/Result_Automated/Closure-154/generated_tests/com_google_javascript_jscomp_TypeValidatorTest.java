package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import java.lang.reflect.Method;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.rhino.ScriptOrFnNode;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.UnknownType;
import com.google.javascript.rhino.jstype.EnumElementType;
import java.lang.reflect.Constructor;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.jstype.StringType;
import com.google.javascript.rhino.JSDocInfo;
import java.util.Set;
import java.util.LinkedHashSet;
import com.google.javascript.rhino.jstype.UnionType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import com.google.javascript.rhino.jstype.FunctionPrototypeType;
import com.google.javascript.rhino.jstype.InstanceObjectType;
import java.util.LinkedHashMap;
import com.google.javascript.rhino.jstype.VoidType;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.NullType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.AllType;
import com.google.javascript.rhino.jstype.NumberType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertNull;
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
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:813)
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:729)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:602) */
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
    public void testMismatch_ThrowNullPointerException_1() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.mismatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:597)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:602) */
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
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:729)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:602) */
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
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#mismatch(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testMismatch_ThrowNullPointerException_2() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        String sourceName = "";
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "sourceName", sourceName);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.mismatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.registerMismatch(TypeValidator.java:618)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:607)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:597)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:602) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method mismatchMethod = typeValidatorClazz.getDeclaredMethod("mismatch", nodeTraversalType, nodeType, stringType, jSTypeType, jSTypeNativeType);
        mismatchMethod.setAccessible(true);
        java.lang.Object[] mismatchMethodArguments = new java.lang.Object[5];
        mismatchMethodArguments[0] = nodeTraversal;
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
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:597) */
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
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#mismatch(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getSourceName()}
 * @utbot.invokes com.google.javascript.jscomp.TypeValidator#mismatch(java.lang.String,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: mismatch(t.getSourceName(), n, msg, found, required);
 *  */
    @Test
    public void testMismatch_ThrowNullPointerException_11() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.mismatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.registerMismatch(TypeValidator.java:618)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:607)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:597) */
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
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.mismatch
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mismatch(java.lang.String, com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#mismatch(java.lang.String,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes com.google.javascript.jscomp.TypeValidator#registerMismatch(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: registerMismatch(found, required);
 *  */
    @Test
    public void testMismatch_ThrowNullPointerException2() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.mismatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.registerMismatch(TypeValidator.java:618)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:607) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method mismatchMethod = typeValidatorClazz.getDeclaredMethod("mismatch", stringType, nodeType, stringType, jSTypeType, jSTypeType);
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
            com.google.javascript.jscomp.TypeValidator.expectAllInterfaceProperties(TypeValidator.java:561) */
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
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        typeValidator.expectAllInterfaceProperties(null, null, noObjectType);
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
    public void testExpectNotNullOrUndefined_ReturnTrue_1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        boolean actual = typeValidator.expectNotNullOrUndefined(null, null, noType, null, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectNotNullOrUndefined(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testExpectNotNullOrUndefined_ReturnTrue() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoType referencedType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        boolean actual = typeValidator.expectNotNullOrUndefined(null, null, templateType, null, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectNotNullOrUndefined(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testExpectNotNullOrUndefined_ReturnTrue_2() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoType referencedType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        boolean actual = typeValidator.expectNotNullOrUndefined(null, null, templateType, null, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectNotNullOrUndefined(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testExpectNotNullOrUndefined_ReturnTrue_3() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.NamedType");
        NoType referencedType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
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
            com.google.javascript.jscomp.TypeValidator.expectNotNullOrUndefined(TypeValidator.java:236) */
        typeValidator.expectNotNullOrUndefined(null, null, null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getReadableJSTypeName(com.google.javascript.rhino.Node, boolean)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#getReadableJSTypeName(com.google.javascript.rhino.Node,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetReadableJSTypeName_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        Node node = new Node(-256);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:813)
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:729)
            com.google.javascript.jscomp.TypeValidator.getJSType(TypeValidator.java:722)
            com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName(TypeValidator.java:688) */
        typeValidator.getReadableJSTypeName(node, false);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#getReadableJSTypeName(com.google.javascript.rhino.Node,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getType() == Token.GETPROP
 *  */
    @Test
    public void testGetReadableJSTypeName_ThrowNullPointerException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName(TypeValidator.java:670) */
        typeValidator.getReadableJSTypeName(null, false);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#getReadableJSTypeName(com.google.javascript.rhino.Node,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ObjectType objectType = getJSType(n.getFirstChild()).dereference();
 *  */
    @Test
    public void testGetReadableJSTypeName_ThrowNullPointerException_1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(33);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getJSType(TypeValidator.java:716)
            com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName(TypeValidator.java:671) */
        typeValidator.getReadableJSTypeName(functionNode, false);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#getReadableJSTypeName(com.google.javascript.rhino.Node,boolean)}
 * @utbot.executesCondition {@code (dereference): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#dereference()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ObjectType dereferenced = type.dereference();
 *  */
    @Test
    public void testGetReadableJSTypeName_ThrowNullPointerException_3() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        Node node = new Node(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName(TypeValidator.java:690) */
        typeValidator.getReadableJSTypeName(node, true);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#getReadableJSTypeName(com.google.javascript.rhino.Node,boolean)}
 * @utbot.executesCondition {@code (dereference): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: type.isFunctionPrototypeType() || (type.toObjectType() != null && type.toObjectType().getConstructor() != null)
 *  */
    @Test
    public void testGetReadableJSTypeName_ThrowNullPointerException_4() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(42);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName(TypeValidator.java:697) */
        typeValidator.getReadableJSTypeName(scriptOrFnNode, false);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#getReadableJSTypeName(com.google.javascript.rhino.Node,boolean)}
 * @utbot.executesCondition {@code (dereference): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: type.isFunctionPrototypeType() || (type.toObjectType() != null && type.toObjectType().getConstructor() != null)
 *  */
    @Test
    public void testGetReadableJSTypeName_ThrowNullPointerException_5() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName(TypeValidator.java:697) */
        typeValidator.getReadableJSTypeName(scriptOrFnNode, false);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#getReadableJSTypeName(com.google.javascript.rhino.Node,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType type = getJSType(n);
 *  */
    @Test
    public void testGetReadableJSTypeName_ThrowNullPointerException_6() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(1);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:729)
            com.google.javascript.jscomp.TypeValidator.getJSType(TypeValidator.java:722)
            com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName(TypeValidator.java:688) */
        typeValidator.getReadableJSTypeName(functionNode, false);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#getReadableJSTypeName(com.google.javascript.rhino.Node,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ObjectType objectType = getJSType(n.getFirstChild()).dereference();
 *  */
    @Test
    public void testGetReadableJSTypeName_ThrowNullPointerException_2() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:729)
            com.google.javascript.jscomp.TypeValidator.getJSType(TypeValidator.java:722)
            com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName(TypeValidator.java:671) */
        typeValidator.getReadableJSTypeName(functionNode, false);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#getReadableJSTypeName(com.google.javascript.rhino.Node,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#dereference()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ObjectType objectType = getJSType(n.getFirstChild()).dereference();
 *  */
    @Test
    public void testGetReadableJSTypeName_ThrowNullPointerException_7() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName(TypeValidator.java:671) */
        typeValidator.getReadableJSTypeName(functionNode, false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getReadableJSTypeName(com.google.javascript.rhino.Node, boolean)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#getReadableJSTypeName(com.google.javascript.rhino.Node,boolean)}
 * @utbot.executesCondition {@code (dereference): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes com.google.javascript.jscomp.TypeValidator#getJSType(com.google.javascript.rhino.Node)
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String qualifiedName = n.getQualifiedName();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetReadableJSTypeName_ThrowUnsupportedOperationException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        typeValidator.getReadableJSTypeName(functionNode, false);
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
 * @utbot.executesCondition {@code (!type.matchesNumberContext()): True}
 * @utbot.executesCondition {@code (!type.matchesStringContext()): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: mismatch(t, n, msg, type, NUMBER_STRING);
 *  */
    @Test
    public void testExpectStringOrNumber_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectStringOrNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index 54 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:813)
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:729)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:602)
            com.google.javascript.jscomp.TypeValidator.expectStringOrNumber(TypeValidator.java:223) */
        typeValidator.expectStringOrNumber(null, null, functionType, null);
    }
    
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
            com.google.javascript.jscomp.TypeValidator.expectStringOrNumber(TypeValidator.java:222) */
        typeValidator.expectStringOrNumber(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectStringOrNumber(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.executesCondition {@code (!type.matchesNumberContext()): True}
 * @utbot.executesCondition {@code (!type.matchesStringContext()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: mismatch(t, n, msg, type, NUMBER_STRING);
 *  */
    @Test
    public void testExpectStringOrNumber_ThrowNullPointerException_1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectStringOrNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:729)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:602)
            com.google.javascript.jscomp.TypeValidator.expectStringOrNumber(TypeValidator.java:223) */
        typeValidator.expectStringOrNumber(null, null, functionType, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectSwitchMatchesCase
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method expectSwitchMatchesCase(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectSwitchMatchesCase(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testExpectSwitchMatchesCase() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        
        typeValidator.expectSwitchMatchesCase(null, null, functionType, unknownType);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectSwitchMatchesCase(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testExpectSwitchMatchesCase_1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        
        typeValidator.expectSwitchMatchesCase(null, null, unknownType, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectSwitchMatchesCase(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testExpectSwitchMatchesCase_2() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        typeValidator.expectSwitchMatchesCase(null, null, functionType, templateType);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectSwitchMatchesCase(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testExpectSwitchMatchesCase_4() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object proxyObjectType = createInstance("com.google.javascript.rhino.jstype.ProxyObjectType");
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(proxyObjectType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method expectSwitchMatchesCaseMethod = typeValidatorClazz.getDeclaredMethod("expectSwitchMatchesCase", nodeTraversalType, nodeType, functionTypeType, functionTypeType);
        expectSwitchMatchesCaseMethod.setAccessible(true);
        java.lang.Object[] expectSwitchMatchesCaseMethodArguments = new java.lang.Object[4];
        expectSwitchMatchesCaseMethodArguments[0] = ((Object) null);
        expectSwitchMatchesCaseMethodArguments[1] = ((Object) null);
        expectSwitchMatchesCaseMethodArguments[2] = functionType;
        expectSwitchMatchesCaseMethodArguments[3] = proxyObjectType;
        expectSwitchMatchesCaseMethod.invoke(typeValidator, expectSwitchMatchesCaseMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectSwitchMatchesCase(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testExpectSwitchMatchesCase_6() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        FunctionType referencedType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        
        typeValidator.expectSwitchMatchesCase(null, null, templateType, unknownType);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectSwitchMatchesCase(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testExpectSwitchMatchesCase_3() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        typeValidator.expectSwitchMatchesCase(null, null, functionType, templateType);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectSwitchMatchesCase(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testExpectSwitchMatchesCase_7() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        typeValidator.expectSwitchMatchesCase(null, null, templateType, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectSwitchMatchesCase(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testExpectSwitchMatchesCase_8() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        typeValidator.expectSwitchMatchesCase(null, null, templateType, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectSwitchMatchesCase(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testExpectSwitchMatchesCase_5() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType3 = createInstance("com.google.javascript.rhino.jstype.NamedType");
        UnknownType referencedType4 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        typeValidator.expectSwitchMatchesCase(null, null, functionType, templateType);
    }
    ///endregion
    
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
            com.google.javascript.jscomp.TypeValidator.expectSwitchMatchesCase(TypeValidator.java:283) */
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
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        typeValidator.expectArgumentMatchesParameter(null, null, templateType, null, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectArgumentMatchesParameter(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,int)}
 *  */
    @Test
    public void testExpectArgumentMatchesParameter_2() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        typeValidator.expectArgumentMatchesParameter(null, null, templateType, null, null, -255);
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
            com.google.javascript.jscomp.TypeValidator.expectArgumentMatchesParameter(TypeValidator.java:395) */
        typeValidator.expectArgumentMatchesParameter(null, null, null, null, null, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectInterfaceProperty
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expectInterfaceProperty(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.ObjectType, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectInterfaceProperty(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#hasProperty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !instance.hasProperty(prop)
 *  */
    @Test
    public void testExpectInterfaceProperty_ThrowNullPointerException() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectInterfaceProperty] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectInterfaceProperty(TypeValidator.java:578) */
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
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.formatFoundRequired
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method formatFoundRequired(java.lang.String, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testFormatFoundRequired1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        String string = "";
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method formatFoundRequiredMethod = typeValidatorClazz.getDeclaredMethod("formatFoundRequired", stringType, jSTypeType, jSTypeType);
        formatFoundRequiredMethod.setAccessible(true);
        java.lang.Object[] formatFoundRequiredMethodArguments = new java.lang.Object[3];
        formatFoundRequiredMethodArguments[0] = string;
        formatFoundRequiredMethodArguments[1] = ((Object) null);
        formatFoundRequiredMethodArguments[2] = ((Object) null);
        String actual = ((String) formatFoundRequiredMethod.invoke(typeValidator, formatFoundRequiredMethodArguments));
        
        String expected = "\nfound   : null\nrequired: null";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectCanAssignToPropertyOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method expectCanAssignToPropertyOf(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectCanAssignToPropertyOf(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testExpectCanAssignToPropertyOf_ReturnTrue_1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        boolean actual = typeValidator.expectCanAssignToPropertyOf(null, null, null, noType, null, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectCanAssignToPropertyOf(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testExpectCanAssignToPropertyOf_ReturnTrue() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoType referencedType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        boolean actual = typeValidator.expectCanAssignToPropertyOf(null, null, null, templateType, null, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectCanAssignToPropertyOf(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testExpectCanAssignToPropertyOf_ReturnTrue_2() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoType referencedType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        boolean actual = typeValidator.expectCanAssignToPropertyOf(null, null, null, templateType, null, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectCanAssignToPropertyOf(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testExpectCanAssignToPropertyOf_ReturnTrue_3() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.NamedType");
        NoType referencedType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        boolean actual = typeValidator.expectCanAssignToPropertyOf(null, null, null, templateType, null, null);
        
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
            com.google.javascript.jscomp.TypeValidator.expectCanAssignToPropertyOf(TypeValidator.java:335) */
        typeValidator.expectCanAssignToPropertyOf(null, null, null, null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method expectCanAssignToPropertyOf(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node, java.lang.String)
    
    @Test
    public void testExpectCanAssignToPropertyOf1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType7 = createInstance("com.google.javascript.rhino.jstype.ParameterizedType");
        TemplateType referencedType8 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType9 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType10 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoType referencedType11 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
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
        
        boolean actual = typeValidator.expectCanAssignToPropertyOf(nodeTraversal, scriptOrFnNode, null, templateType, null, null);
        
        assertTrue(actual);
    }
    
    @Test
    public void testExpectCanAssignToPropertyOf2() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.ParameterizedType");
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
        NoType referencedType12 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
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
        String string = "";
        
        boolean actual = typeValidator.expectCanAssignToPropertyOf(nodeTraversal, functionNode, null, templateType, null, string);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method expectCanAssignToPropertyOf(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node, java.lang.String)
    
    @Test(expected = StackOverflowError.class)
    public void testExpectCanAssignToPropertyOf3() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType4 = createInstance("com.google.javascript.rhino.jstype.ParameterizedType");
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType5, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        String string = "";
        
        typeValidator.expectCanAssignToPropertyOf(null, functionNode, null, templateType, null, string);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testExpectCanAssignToPropertyOf4() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Node node = new Node(0);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.ParameterizedType");
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType5 = createInstance("com.google.javascript.rhino.jstype.ParameterizedType");
        TemplateType referencedType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType7 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType7, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(referencedType6, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType7);
        setField(referencedType5, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType6);
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        String string = "";
        
        typeValidator.expectCanAssignToPropertyOf(null, node, null, templateType, scriptOrFnNode, string);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testExpectCanAssignToPropertyOf5() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType4 = createInstance("com.google.javascript.rhino.jstype.ParameterizedType");
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType7 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType8 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType8, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType7);
        setField(referencedType7, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType8);
        setField(referencedType6, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType7);
        setField(referencedType5, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType6);
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        typeValidator.expectCanAssignToPropertyOf(nodeTraversal, null, null, templateType, null, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testExpectCanAssignToPropertyOf6() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType7 = createInstance("com.google.javascript.rhino.jstype.ParameterizedType");
        TemplateType referencedType8 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType9 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType10 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType11 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType11, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
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
        String string = "";
        
        typeValidator.expectCanAssignToPropertyOf(null, null, enumElementType, templateType, null, string);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testExpectCanAssignToPropertyOf7() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object prototypeObjectType = createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType");
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType7 = createInstance("com.google.javascript.rhino.jstype.ParameterizedType");
        TemplateType referencedType8 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType9 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType10 = createInstance("com.google.javascript.rhino.jstype.ParameterizedType");
        TemplateType referencedType11 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType12 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType13 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType13, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType6);
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
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class prototypeObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Method expectCanAssignToPropertyOfMethod = typeValidatorClazz.getDeclaredMethod("expectCanAssignToPropertyOf", nodeTraversalType, functionNodeType, prototypeObjectTypeType, prototypeObjectTypeType, functionNodeType, stringType);
        expectCanAssignToPropertyOfMethod.setAccessible(true);
        java.lang.Object[] expectCanAssignToPropertyOfMethodArguments = new java.lang.Object[6];
        expectCanAssignToPropertyOfMethodArguments[0] = nodeTraversal;
        expectCanAssignToPropertyOfMethodArguments[1] = functionNode;
        expectCanAssignToPropertyOfMethodArguments[2] = prototypeObjectType;
        expectCanAssignToPropertyOfMethodArguments[3] = templateType;
        expectCanAssignToPropertyOfMethodArguments[4] = ((Object) null);
        expectCanAssignToPropertyOfMethodArguments[5] = ((Object) null);
        try {
            expectCanAssignToPropertyOfMethod.invoke(typeValidator, expectCanAssignToPropertyOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method expectUndeclaredVariable(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope$Var, java.lang.String, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectUndeclaredVariable(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope.Var,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testExpectUndeclaredVariable() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class anonymousObjectType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, jSTypeType, scopeType, intType, compilerInputType, booleanType, jSDocInfoType, anonymousObjectType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[10];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = false;
        varConstructorArguments[8] = ((Object) null);
        varConstructorArguments[9] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        typeValidator.expectUndeclaredVariable(null, scriptOrFnNode, null, var, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectUndeclaredVariable(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope.Var,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (varType != typeRegistry.getNativeType(UNKNOWN_TYPE)): False}
 *  */
    @Test
    public void testExpectUndeclaredVariable_VarTypeEqualsTypeRegistryGetNativeType() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(256);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class anonymousObjectType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, noTypeType, scopeType, intType, compilerInputType, booleanType, jSDocInfoType, anonymousObjectType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[10];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = noType;
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = false;
        varConstructorArguments[8] = ((Object) null);
        varConstructorArguments[9] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        typeValidator.expectUndeclaredVariable(null, functionNode, null, var, null, null);
        
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
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectUndeclaredVariable(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope.Var,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testExpectUndeclaredVariable_1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        nativeTypes[35] = ((JSType) templateType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        Node node = new Node(2);
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class anonymousObjectType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, templateTypeType, scopeType, intType, compilerInputType, booleanType, jSDocInfoType, anonymousObjectType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[10];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = templateType;
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = false;
        varConstructorArguments[8] = ((Object) null);
        varConstructorArguments[9] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        typeValidator.expectUndeclaredVariable(null, node, null, var, null, null);
        
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
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expectUndeclaredVariable(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope$Var, java.lang.String, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectUndeclaredVariable(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope.Var,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: JSDocInfo info = n.getJSDocInfo();
 *  */
    @Test
    public void testExpectUndeclaredVariable_ThrowClassCastException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        short[] objectValue = {};
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable] produces [java.lang.ClassCastException: class [S cannot be cast to class com.google.javascript.rhino.JSDocInfo ([S is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.JSDocInfo is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7fa7457f)]
            com.google.javascript.rhino.Node.getJSDocInfo(Node.java:1961)
            com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable(TypeValidator.java:502) */
        typeValidator.expectUndeclaredVariable(null, scriptOrFnNode, null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectUndeclaredVariable(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope.Var,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: varType != typeRegistry.getNativeType(UNKNOWN_TYPE)
 *  */
    @Test
    public void testExpectUndeclaredVariable_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        Node node = new Node(1);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class anonymousObjectType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, noTypeType, scopeType, intType, compilerInputType, booleanType, jSDocInfoType, anonymousObjectType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[10];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = noType;
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = false;
        varConstructorArguments[8] = ((Object) null);
        varConstructorArguments[9] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:813)
            com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable(TypeValidator.java:516) */
        typeValidator.expectUndeclaredVariable(null, node, null, var, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectUndeclaredVariable(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope.Var,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType varType = var.getType();
 *  */
    @Test
    public void testExpectUndeclaredVariable_ThrowNullPointerException_1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable(TypeValidator.java:510) */
        typeValidator.expectUndeclaredVariable(null, scriptOrFnNode, null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectUndeclaredVariable(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope.Var,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getType() == Token.GETPROP
 *  */
    @Test
    public void testExpectUndeclaredVariable_ThrowNullPointerException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable(TypeValidator.java:501) */
        typeValidator.expectUndeclaredVariable(null, null, null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectUndeclaredVariable(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope.Var,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (info == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: info = parent.getJSDocInfo();
 *  */
    @Test
    public void testExpectUndeclaredVariable_ThrowNullPointerException_3() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable(TypeValidator.java:504) */
        typeValidator.expectUndeclaredVariable(null, scriptOrFnNode, null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectUndeclaredVariable(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope.Var,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (info == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: info = parent.getJSDocInfo();
 *  */
    @Test
    public void testExpectUndeclaredVariable_ThrowNullPointerException_4() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable(TypeValidator.java:504) */
        typeValidator.expectUndeclaredVariable(null, scriptOrFnNode, null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectUndeclaredVariable(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope.Var,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (info == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: info = parent.getJSDocInfo();
 *  */
    @Test
    public void testExpectUndeclaredVariable_ThrowNullPointerException_5() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable(TypeValidator.java:504) */
        typeValidator.expectUndeclaredVariable(null, scriptOrFnNode, null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectUndeclaredVariable(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope.Var,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: varType != typeRegistry.getNativeType(UNKNOWN_TYPE)
 *  */
    @Test
    public void testExpectUndeclaredVariable_ThrowNullPointerException_2() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class anonymousObjectType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, noTypeType, scopeType, intType, compilerInputType, booleanType, jSDocInfoType, anonymousObjectType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[10];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = noType;
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = false;
        varConstructorArguments[8] = ((Object) null);
        varConstructorArguments[9] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable(TypeValidator.java:516) */
        typeValidator.expectUndeclaredVariable(null, scriptOrFnNode, null, var, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method expectUndeclaredVariable(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope$Var, java.lang.String, com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testExpectUndeclaredVariable1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class anonymousObjectType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, jSTypeType, scopeType, intType, compilerInputType, booleanType, jSDocInfoType, anonymousObjectType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[10];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = false;
        varConstructorArguments[8] = ((Object) null);
        varConstructorArguments[9] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        String string = "";
        StringType stringType1 = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Method expectUndeclaredVariableMethod = typeValidatorClazz.getDeclaredMethod("expectUndeclaredVariable", stringType, nodeType, nodeType, varClazz, stringType, jSTypeType);
        expectUndeclaredVariableMethod.setAccessible(true);
        java.lang.Object[] expectUndeclaredVariableMethodArguments = new java.lang.Object[6];
        expectUndeclaredVariableMethodArguments[0] = ((Object) null);
        expectUndeclaredVariableMethodArguments[1] = stringNode;
        expectUndeclaredVariableMethodArguments[2] = scriptOrFnNode;
        expectUndeclaredVariableMethodArguments[3] = var;
        expectUndeclaredVariableMethodArguments[4] = string;
        expectUndeclaredVariableMethodArguments[5] = stringType1;
        expectUndeclaredVariableMethod.invoke(typeValidator, expectUndeclaredVariableMethodArguments);
    }
    
    @Test
    public void testExpectUndeclaredVariable2() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        String string = "";
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Node node = new Node(0);
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class anonymousObjectType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, jSTypeType, scopeType, intType, compilerInputType, booleanType, jSDocInfoType, anonymousObjectType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[10];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = false;
        varConstructorArguments[8] = ((Object) null);
        varConstructorArguments[9] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        StringType stringType1 = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Method expectUndeclaredVariableMethod = typeValidatorClazz.getDeclaredMethod("expectUndeclaredVariable", stringType, nodeType, nodeType, varClazz, stringType, jSTypeType);
        expectUndeclaredVariableMethod.setAccessible(true);
        java.lang.Object[] expectUndeclaredVariableMethodArguments = new java.lang.Object[6];
        expectUndeclaredVariableMethodArguments[0] = string;
        expectUndeclaredVariableMethodArguments[1] = stringNode;
        expectUndeclaredVariableMethodArguments[2] = node;
        expectUndeclaredVariableMethodArguments[3] = var;
        expectUndeclaredVariableMethodArguments[4] = string;
        expectUndeclaredVariableMethodArguments[5] = stringType1;
        expectUndeclaredVariableMethod.invoke(typeValidator, expectUndeclaredVariableMethodArguments);
    }
    
    @Test
    public void testExpectUndeclaredVariable3() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        String string = "";
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Node node = new Node(0);
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class anonymousObjectType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, jSTypeType, scopeType, intType, compilerInputType, booleanType, jSDocInfoType, anonymousObjectType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[10];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = false;
        varConstructorArguments[8] = ((Object) null);
        varConstructorArguments[9] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        String string1 = "";
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Method expectUndeclaredVariableMethod = typeValidatorClazz.getDeclaredMethod("expectUndeclaredVariable", stringType, nodeType, nodeType, varClazz, stringType, jSTypeType);
        expectUndeclaredVariableMethod.setAccessible(true);
        java.lang.Object[] expectUndeclaredVariableMethodArguments = new java.lang.Object[6];
        expectUndeclaredVariableMethodArguments[0] = string;
        expectUndeclaredVariableMethodArguments[1] = numberNode;
        expectUndeclaredVariableMethodArguments[2] = node;
        expectUndeclaredVariableMethodArguments[3] = var;
        expectUndeclaredVariableMethodArguments[4] = string1;
        expectUndeclaredVariableMethodArguments[5] = noResolvedType;
        expectUndeclaredVariableMethod.invoke(typeValidator, expectUndeclaredVariableMethodArguments);
        
        Object numberNodePropListHead = getFieldValue(numberNode, "com.google.javascript.rhino.Node", "propListHead");
        Object numberNodePropListHeadPropListHeadObjectValue = getFieldValue(numberNodePropListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue");
        Object numberNodePropListHeadPropListHeadObjectValuePropListHeadObjectValueInfo = getFieldValue(numberNodePropListHeadPropListHeadObjectValue, "com.google.javascript.rhino.JSDocInfo", "info");
        Set finalNumberNodePropListHeadObjectValueInfoSuppressions = ((Set) getFieldValue(numberNodePropListHeadPropListHeadObjectValuePropListHeadObjectValueInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "suppressions"));
        
        assertNull(finalNumberNodePropListHeadObjectValueInfoSuppressions);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method expectUndeclaredVariable(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope$Var, java.lang.String, com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testExpectUndeclaredVariable4() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        String string = "";
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable(TypeValidator.java:510) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class stringType = Class.forName("java.lang.String");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method expectUndeclaredVariableMethod = typeValidatorClazz.getDeclaredMethod("expectUndeclaredVariable", stringType, numberNodeType, numberNodeType, varType, stringType, jSTypeType);
        expectUndeclaredVariableMethod.setAccessible(true);
        java.lang.Object[] expectUndeclaredVariableMethodArguments = new java.lang.Object[6];
        expectUndeclaredVariableMethodArguments[0] = string;
        expectUndeclaredVariableMethodArguments[1] = numberNode;
        expectUndeclaredVariableMethodArguments[2] = scriptOrFnNode;
        expectUndeclaredVariableMethodArguments[3] = ((Object) null);
        expectUndeclaredVariableMethodArguments[4] = ((Object) null);
        expectUndeclaredVariableMethodArguments[5] = ((Object) null);
        try {
            expectUndeclaredVariableMethod.invoke(typeValidator, expectUndeclaredVariableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExpectUndeclaredVariable5() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        String string = "";
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable(TypeValidator.java:510) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class stringType = Class.forName("java.lang.String");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method expectUndeclaredVariableMethod = typeValidatorClazz.getDeclaredMethod("expectUndeclaredVariable", stringType, numberNodeType, numberNodeType, varType, stringType, jSTypeType);
        expectUndeclaredVariableMethod.setAccessible(true);
        java.lang.Object[] expectUndeclaredVariableMethodArguments = new java.lang.Object[6];
        expectUndeclaredVariableMethodArguments[0] = string;
        expectUndeclaredVariableMethodArguments[1] = numberNode;
        expectUndeclaredVariableMethodArguments[2] = scriptOrFnNode;
        expectUndeclaredVariableMethodArguments[3] = ((Object) null);
        expectUndeclaredVariableMethodArguments[4] = ((Object) null);
        expectUndeclaredVariableMethodArguments[5] = ((Object) null);
        try {
            expectUndeclaredVariableMethod.invoke(typeValidator, expectUndeclaredVariableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExpectUndeclaredVariable6() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        String string = "";
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        LinkedHashSet suppressions = new LinkedHashSet();
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "suppressions", suppressions);
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable(TypeValidator.java:510) */
        typeValidator.expectUndeclaredVariable(string, node, null, null, null, null);
    }
    
    @Test
    public void testExpectUndeclaredVariable7() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        Object prototypeObjectType = createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType");
        nativeTypes[35] = ((JSType) prototypeObjectType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        Node node = new Node(0);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class anonymousObjectType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, noTypeType, scopeType, intType, compilerInputType, booleanType, jSDocInfoType, anonymousObjectType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[10];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = noType;
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = false;
        varConstructorArguments[8] = ((Object) null);
        varConstructorArguments[9] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable(TypeValidator.java:526) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Method expectUndeclaredVariableMethod = typeValidatorClazz.getDeclaredMethod("expectUndeclaredVariable", stringType, nodeType, nodeType, varClazz, stringType, noTypeType);
        expectUndeclaredVariableMethod.setAccessible(true);
        java.lang.Object[] expectUndeclaredVariableMethodArguments = new java.lang.Object[6];
        expectUndeclaredVariableMethodArguments[0] = ((Object) null);
        expectUndeclaredVariableMethodArguments[1] = node;
        expectUndeclaredVariableMethodArguments[2] = ((Object) null);
        expectUndeclaredVariableMethodArguments[3] = var;
        expectUndeclaredVariableMethodArguments[4] = ((Object) null);
        expectUndeclaredVariableMethodArguments[5] = noResolvedType;
        try {
            expectUndeclaredVariableMethod.invoke(typeValidator, expectUndeclaredVariableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method expectUndeclaredVariable(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope$Var, java.lang.String, com.google.javascript.rhino.jstype.JSType)
    
    @Test(timeout = 1000L)
    public void testExpectUndeclaredVariable8() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        String string = "";
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class stringType = Class.forName("java.lang.String");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method expectUndeclaredVariableMethod = typeValidatorClazz.getDeclaredMethod("expectUndeclaredVariable", stringType, numberNodeType, numberNodeType, varType, stringType, jSTypeType);
        expectUndeclaredVariableMethod.setAccessible(true);
        java.lang.Object[] expectUndeclaredVariableMethodArguments = new java.lang.Object[6];
        expectUndeclaredVariableMethodArguments[0] = string;
        expectUndeclaredVariableMethodArguments[1] = numberNode;
        expectUndeclaredVariableMethodArguments[2] = ((Object) null);
        expectUndeclaredVariableMethodArguments[3] = ((Object) null);
        expectUndeclaredVariableMethodArguments[4] = ((Object) null);
        expectUndeclaredVariableMethodArguments[5] = ((Object) null);
        try {
            expectUndeclaredVariableMethod.invoke(typeValidator, expectUndeclaredVariableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        FunctionType referencedType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        boolean actual = typeValidator.expectObject(null, null, templateType, null);
        
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
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        boolean actual = typeValidator.expectObject(null, null, templateType, null);
        
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
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        boolean actual = typeValidator.expectObject(null, null, templateType, null);
        
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
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        FunctionType referencedType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        boolean actual = typeValidator.expectObject(null, null, templateType, null);
        
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
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoObjectType referencedType3 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        boolean actual = typeValidator.expectObject(null, null, templateType, null);
        
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
    public void testExpectObject_ReturnTrue_6() throws Exception  {
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
    public void testExpectObject_ReturnTrue_7() throws Exception  {
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
    public void testExpectObject_ReturnTrue_8() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        
        boolean actual = typeValidator.expectObject(null, null, noObjectType, null);
        
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
            com.google.javascript.jscomp.TypeValidator.expectObject(TypeValidator.java:154) */
        typeValidator.expectObject(null, null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method expectObject(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    @Test
    public void testExpectObject1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
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
        TemplateType referencedType16 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType17 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType18 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType19 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType20 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType21 = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        setField(referencedType20, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType21);
        setField(referencedType19, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType20);
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
        String string = "";
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Method expectObjectMethod = typeValidatorClazz.getDeclaredMethod("expectObject", nodeTraversalType, stringNodeType, templateTypeType, stringType);
        expectObjectMethod.setAccessible(true);
        java.lang.Object[] expectObjectMethodArguments = new java.lang.Object[4];
        expectObjectMethodArguments[0] = ((Object) null);
        expectObjectMethodArguments[1] = stringNode;
        expectObjectMethodArguments[2] = templateType;
        expectObjectMethodArguments[3] = string;
        boolean actual = ((Boolean) expectObjectMethod.invoke(typeValidator, expectObjectMethodArguments));
        
        assertTrue(actual);
    }
    
    @Test
    public void testExpectObject2() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
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
        TemplateType referencedType16 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType17 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType18 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType19 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType20 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        FunctionType referencedType21 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(referencedType20, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType21);
        setField(referencedType19, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType20);
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
        String string = "";
        
        boolean actual = typeValidator.expectObject(null, null, templateType, string);
        
        assertTrue(actual);
    }
    
    @Test
    public void testExpectObject3() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
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
        TemplateType referencedType16 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType17 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType18 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType19 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType20 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType21 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType20, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType21);
        setField(referencedType19, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType20);
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
        String string = "";
        
        boolean actual = typeValidator.expectObject(null, null, templateType, string);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method expectObject(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    @Test(expected = StackOverflowError.class)
    public void testExpectObject4() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        typeValidator.expectObject(null, null, templateType, null);
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
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectActualObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method expectActualObject(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectActualObject(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isObject()}
 *  */
    @Test
    public void testExpectActualObject_JSTypeIsObject() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        typeValidator.expectActualObject(null, null, unionType, null);
    }
    ///endregion
    
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
            com.google.javascript.jscomp.TypeValidator.expectActualObject(TypeValidator.java:166) */
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
    ///endregion
    
    ///region OTHER: ERROR SUITE for method expectActualObject(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    @Test(expected = StackOverflowError.class)
    public void testExpectActualObject2() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(primitiveType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType);
        setField(enumElementType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType);
        
        typeValidator.expectActualObject(null, null, enumElementType, null);
    }
    
    @Test
    public void testExpectActualObject3() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectActualObject] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.isObject(UnionType.java:351)
            com.google.javascript.jscomp.TypeValidator.expectActualObject(TypeValidator.java:166) */
        typeValidator.expectActualObject(null, null, unionType, null);
    }
    
    @Test
    public void testExpectActualObject4() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        UnionType primitiveType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        setField(primitiveType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        setField(enumElementType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", primitiveType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectActualObject] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.isObject(UnionType.java:351)
            com.google.javascript.rhino.jstype.EnumElementType.isObject(EnumElementType.java:104)
            com.google.javascript.jscomp.TypeValidator.expectActualObject(TypeValidator.java:166) */
        typeValidator.expectActualObject(nodeTraversal, null, enumElementType, null);
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
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:813)
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:729)
            com.google.javascript.jscomp.TypeValidator.expectAnyObject(TypeValidator.java:176) */
        typeValidator.expectAnyObject(null, null, null, null);
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
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectSuperType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expectSuperType(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.ObjectType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectSuperType(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#equals(java.lang.Object)}
 * @utbot.invokes com.google.javascript.jscomp.TypeValidator#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: declaredSuper.equals(getNativeType(OBJECT_TYPE))
 *  */
    @Test
    public void testExpectSuperType_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoType implicitPrototypeFallback1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectSuperType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:813)
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:729)
            com.google.javascript.jscomp.TypeValidator.expectSuperType(TypeValidator.java:444) */
        typeValidator.expectSuperType(null, null, null, functionType);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectSuperType(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FunctionType subCtor = subObject.getConstructor();
 *  */
    @Test
    public void testExpectSuperType_ThrowNullPointerException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectSuperType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectSuperType(TypeValidator.java:440) */
        typeValidator.expectSuperType(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectSuperType(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !declaredSuper.equals(superObject)
 *  */
    @Test
    public void testExpectSuperType_ThrowNullPointerException_3() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoObjectType implicitPrototypeFallback = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectSuperType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectSuperType(TypeValidator.java:443) */
        typeValidator.expectSuperType(null, null, null, functionType);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectSuperType(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: subObject.getImplicitPrototype().getImplicitPrototype()
 *  */
    @Test
    public void testExpectSuperType_ThrowNullPointerException_1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectSuperType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectSuperType(TypeValidator.java:442) */
        typeValidator.expectSuperType(null, null, null, functionType);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectSuperType(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !declaredSuper.equals(superObject)
 *  */
    @Test
    public void testExpectSuperType_ThrowNullPointerException_2() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectSuperType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectSuperType(TypeValidator.java:443) */
        typeValidator.expectSuperType(null, null, null, functionType);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method expectSuperType(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.ObjectType)
    
    @Test
    public void testExpectSuperType1() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectSuperType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectSuperType(TypeValidator.java:442) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method expectSuperTypeMethod = typeValidatorClazz.getDeclaredMethod("expectSuperType", nodeTraversalType, scriptOrFnNodeType, objectTypeType, objectTypeType);
        expectSuperTypeMethod.setAccessible(true);
        java.lang.Object[] expectSuperTypeMethodArguments = new java.lang.Object[4];
        expectSuperTypeMethodArguments[0] = nodeTraversal;
        expectSuperTypeMethodArguments[1] = scriptOrFnNode;
        expectSuperTypeMethodArguments[2] = ((Object) null);
        expectSuperTypeMethodArguments[3] = noResolvedType;
        try {
            expectSuperTypeMethod.invoke(typeValidator, expectSuperTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExpectSuperType2() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        FunctionPrototypeType implicitPrototypeFallback1 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectSuperType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:729)
            com.google.javascript.jscomp.TypeValidator.expectSuperType(TypeValidator.java:444) */
        typeValidator.expectSuperType(nodeTraversal, null, noObjectType, functionType);
    }
    
    @Test
    public void testExpectSuperType3() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[36];
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        nativeTypes[0] = ((JSType) templateType);
        nativeTypes[1] = ((JSType) templateType);
        nativeTypes[2] = ((JSType) templateType);
        nativeTypes[3] = ((JSType) templateType);
        nativeTypes[4] = ((JSType) templateType);
        nativeTypes[5] = ((JSType) templateType);
        nativeTypes[6] = ((JSType) templateType);
        nativeTypes[7] = ((JSType) templateType);
        nativeTypes[8] = ((JSType) templateType);
        nativeTypes[9] = ((JSType) templateType);
        nativeTypes[10] = ((JSType) templateType);
        nativeTypes[11] = ((JSType) templateType);
        nativeTypes[12] = ((JSType) templateType);
        nativeTypes[13] = ((JSType) templateType);
        nativeTypes[14] = ((JSType) templateType);
        nativeTypes[15] = ((JSType) templateType);
        nativeTypes[16] = ((JSType) templateType);
        nativeTypes[17] = ((JSType) templateType);
        nativeTypes[18] = ((JSType) templateType);
        nativeTypes[20] = ((JSType) templateType);
        nativeTypes[21] = ((JSType) templateType);
        nativeTypes[22] = ((JSType) templateType);
        nativeTypes[23] = ((JSType) templateType);
        nativeTypes[24] = ((JSType) templateType);
        nativeTypes[25] = ((JSType) templateType);
        nativeTypes[26] = ((JSType) templateType);
        nativeTypes[27] = ((JSType) templateType);
        nativeTypes[28] = ((JSType) templateType);
        nativeTypes[29] = ((JSType) templateType);
        nativeTypes[30] = ((JSType) templateType);
        nativeTypes[31] = ((JSType) templateType);
        nativeTypes[32] = ((JSType) templateType);
        nativeTypes[33] = ((JSType) templateType);
        nativeTypes[34] = ((JSType) templateType);
        nativeTypes[35] = ((JSType) templateType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        FunctionType implicitPrototypeFallback1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectSuperType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectSuperType(TypeValidator.java:458) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noResolvedTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method expectSuperTypeMethod = typeValidatorClazz.getDeclaredMethod("expectSuperType", nodeTraversalType, numberNodeType, noResolvedTypeType, noResolvedTypeType);
        expectSuperTypeMethod.setAccessible(true);
        java.lang.Object[] expectSuperTypeMethodArguments = new java.lang.Object[4];
        expectSuperTypeMethodArguments[0] = nodeTraversal;
        expectSuperTypeMethodArguments[1] = numberNode;
        expectSuperTypeMethodArguments[2] = noResolvedType;
        expectSuperTypeMethodArguments[3] = errorFunctionType;
        try {
            expectSuperTypeMethod.invoke(typeValidator, expectSuperTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExpectSuperType4() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectSuperType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo(FunctionType.java:649)
            com.google.javascript.rhino.jstype.JSType.equals(JSType.java:348)
            com.google.javascript.jscomp.TypeValidator.expectSuperType(TypeValidator.java:443) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class errorFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method expectSuperTypeMethod = typeValidatorClazz.getDeclaredMethod("expectSuperType", nodeTraversalType, scriptOrFnNodeType, errorFunctionTypeType, errorFunctionTypeType);
        expectSuperTypeMethod.setAccessible(true);
        java.lang.Object[] expectSuperTypeMethodArguments = new java.lang.Object[4];
        expectSuperTypeMethodArguments[0] = nodeTraversal;
        expectSuperTypeMethodArguments[1] = scriptOrFnNode;
        expectSuperTypeMethodArguments[2] = errorFunctionType;
        expectSuperTypeMethodArguments[3] = errorFunctionType;
        try {
            expectSuperTypeMethod.invoke(typeValidator, expectSuperTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExpectSuperType5() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        StringType stringType = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        nativeTypes[19] = ((JSType) stringType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object unresolvedTypeExpression = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        Object implicitPrototypeFallback = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        FunctionType implicitPrototypeFallback1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectSuperType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectSuperType(TypeValidator.java:458) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class unresolvedTypeExpressionType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method expectSuperTypeMethod = typeValidatorClazz.getDeclaredMethod("expectSuperType", nodeTraversalType, nodeType, unresolvedTypeExpressionType, unresolvedTypeExpressionType);
        expectSuperTypeMethod.setAccessible(true);
        java.lang.Object[] expectSuperTypeMethodArguments = new java.lang.Object[4];
        expectSuperTypeMethodArguments[0] = nodeTraversal;
        expectSuperTypeMethodArguments[1] = ((Object) null);
        expectSuperTypeMethodArguments[2] = unresolvedTypeExpression;
        expectSuperTypeMethodArguments[3] = errorFunctionType;
        try {
            expectSuperTypeMethod.invoke(typeValidator, expectSuperTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExpectSuperType6() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[26];
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        nativeTypes[19] = ((JSType) anonymousFunctionType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object implicitPrototypeFallback = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        FunctionType implicitPrototypeFallback1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectSuperType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo(FunctionType.java:656)
            com.google.javascript.rhino.jstype.JSType.equals(JSType.java:348)
            com.google.javascript.jscomp.TypeValidator.expectSuperType(TypeValidator.java:444) */
        typeValidator.expectSuperType(nodeTraversal, scriptOrFnNode, null, functionType);
    }
    
    @Test
    public void testExpectSuperType7() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[26];
        Object proxyObjectType = createInstance("com.google.javascript.rhino.jstype.ProxyObjectType");
        nativeTypes[19] = ((JSType) proxyObjectType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object implicitPrototypeFallback = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        Object implicitPrototypeFallback1 = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectSuperType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isEquivalentTo(ProxyObjectType.java:207)
            com.google.javascript.rhino.jstype.JSType.isEquivalentTo(JSType.java:331)
            com.google.javascript.rhino.jstype.JSType.equals(JSType.java:348)
            com.google.javascript.jscomp.TypeValidator.expectSuperType(TypeValidator.java:444) */
        typeValidator.expectSuperType(nodeTraversal, functionNode, null, functionType);
    }
    
    @Test
    public void testExpectSuperType8() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Node node = new Node(0);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectSuperType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:729)
            com.google.javascript.jscomp.TypeValidator.expectSuperType(TypeValidator.java:444) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method expectSuperTypeMethod = typeValidatorClazz.getDeclaredMethod("expectSuperType", nodeTraversalType, nodeType, anonymousFunctionTypeType, anonymousFunctionTypeType);
        expectSuperTypeMethod.setAccessible(true);
        java.lang.Object[] expectSuperTypeMethodArguments = new java.lang.Object[4];
        expectSuperTypeMethodArguments[0] = ((Object) null);
        expectSuperTypeMethodArguments[1] = node;
        expectSuperTypeMethodArguments[2] = anonymousFunctionType;
        expectSuperTypeMethodArguments[3] = errorFunctionType;
        try {
            expectSuperTypeMethod.invoke(typeValidator, expectSuperTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExpectSuperType9() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[26];
        InstanceObjectType instanceObjectType = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        nativeTypes[19] = ((JSType) instanceObjectType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object implicitPrototypeFallback = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        NoType implicitPrototypeFallback1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectSuperType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.registerMismatch(TypeValidator.java:618)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:607)
            com.google.javascript.jscomp.TypeValidator.expectSuperType(TypeValidator.java:452) */
        typeValidator.expectSuperType(nodeTraversal, null, null, functionType);
    }
    
    @Test
    public void testExpectSuperType10() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[20];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object implicitPrototypeFallback = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        Object implicitPrototypeFallback1 = createInstance("com.google.javascript.rhino.jstype.NamedType");
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectSuperType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectSuperType(TypeValidator.java:452) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method expectSuperTypeMethod = typeValidatorClazz.getDeclaredMethod("expectSuperType", nodeTraversalType, numberNodeType, objectTypeType, objectTypeType);
        expectSuperTypeMethod.setAccessible(true);
        java.lang.Object[] expectSuperTypeMethodArguments = new java.lang.Object[4];
        expectSuperTypeMethodArguments[0] = ((Object) null);
        expectSuperTypeMethodArguments[1] = numberNode;
        expectSuperTypeMethodArguments[2] = ((Object) null);
        expectSuperTypeMethodArguments[3] = functionType;
        try {
            expectSuperTypeMethod.invoke(typeValidator, expectSuperTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expectString(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectString(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testExpectString_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 30 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:813)
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:729)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:602)
            com.google.javascript.jscomp.TypeValidator.expectString(TypeValidator.java:189) */
        typeValidator.expectString(null, null, functionType, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectString(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !type.matchesStringContext()
 *  */
    @Test
    public void testExpectString_ThrowNullPointerException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectString(TypeValidator.java:188) */
        typeValidator.expectString(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectString(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: mismatch(t, n, msg, type, STRING_TYPE);
 *  */
    @Test
    public void testExpectString_ThrowNullPointerException_1() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:729)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:602)
            com.google.javascript.jscomp.TypeValidator.expectString(TypeValidator.java:189) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class errorFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Method expectStringMethod = typeValidatorClazz.getDeclaredMethod("expectString", nodeTraversalType, nodeType, errorFunctionTypeType, stringType);
        expectStringMethod.setAccessible(true);
        java.lang.Object[] expectStringMethodArguments = new java.lang.Object[4];
        expectStringMethodArguments[0] = ((Object) null);
        expectStringMethodArguments[1] = ((Object) null);
        expectStringMethodArguments[2] = errorFunctionType;
        expectStringMethodArguments[3] = ((Object) null);
        try {
            expectStringMethod.invoke(typeValidator, expectStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:597)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:602)
            com.google.javascript.jscomp.TypeValidator.expectString(TypeValidator.java:189) */
        typeValidator.expectString(null, null, functionType, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method expectString(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    @Test
    public void testExpectString1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = new Node(0);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectString] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:110)
            com.google.javascript.rhino.jstype.PrototypeObjectType.getPropertyType(PrototypeObjectType.java:211)
            com.google.javascript.rhino.jstype.FunctionType.getPropertyType(FunctionType.java:428)
            com.google.javascript.rhino.jstype.PrototypeObjectType.hasOverridenNativeProperty(PrototypeObjectType.java:302)
            com.google.javascript.rhino.jstype.PrototypeObjectType.matchesStringContext(PrototypeObjectType.java:290)
            com.google.javascript.rhino.jstype.FunctionType.matchesStringContext(FunctionType.java:65)
            com.google.javascript.jscomp.TypeValidator.expectString(TypeValidator.java:188) */
        typeValidator.expectString(nodeTraversal, node, anonymousFunctionType, string);
    }
    
    @Test
    public void testExpectString2() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[31];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.registerMismatch(TypeValidator.java:619)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:607)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:597)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:602)
            com.google.javascript.jscomp.TypeValidator.expectString(TypeValidator.java:189) */
        typeValidator.expectString(nodeTraversal, null, anonymousFunctionType, null);
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
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:813)
            com.google.javascript.rhino.jstype.VoidType.restrictByNotNullOrUndefined(VoidType.java:59)
            com.google.javascript.jscomp.TypeValidator.expectCanCast(TypeValidator.java:474) */
        typeValidator.expectCanCast(null, null, null, voidType);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectCanCast(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: castType = castType.restrictByNotNullOrUndefined();
 *  */
    @Test
    public void testExpectCanCast_ThrowNullPointerException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectCanCast] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectCanCast(TypeValidator.java:474) */
        typeValidator.expectCanCast(null, null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method expectCanCast(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testExpectCanCast1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectCanCast] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionTypeBuilder.reduceAlternatesWithoutUnion(UnionTypeBuilder.java:181)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.build(UnionTypeBuilder.java:193)
            com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined(UnionType.java:222)
            com.google.javascript.jscomp.TypeValidator.expectCanCast(TypeValidator.java:474) */
        typeValidator.expectCanCast(null, null, null, unionType);
    }
    
    @Test
    public void testExpectCanCast2() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Node node = new Node(0);
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        alternates.add(templateType);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectCanCast] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionTypeBuilder.reduceAlternatesWithoutUnion(UnionTypeBuilder.java:181)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.build(UnionTypeBuilder.java:193)
            com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined(UnionType.java:222)
            com.google.javascript.jscomp.TypeValidator.expectCanCast(TypeValidator.java:474) */
        typeValidator.expectCanCast(null, node, null, unionType);
    }
    
    @Test
    public void testExpectCanCast3() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object prototypeObjectType = createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType");
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        alternates.add(null);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectCanCast] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined(UnionType.java:220)
            com.google.javascript.jscomp.TypeValidator.expectCanCast(TypeValidator.java:474) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class prototypeObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method expectCanCastMethod = typeValidatorClazz.getDeclaredMethod("expectCanCast", nodeTraversalType, nodeType, prototypeObjectTypeType, prototypeObjectTypeType);
        expectCanCastMethod.setAccessible(true);
        java.lang.Object[] expectCanCastMethodArguments = new java.lang.Object[4];
        expectCanCastMethodArguments[0] = ((Object) null);
        expectCanCastMethodArguments[1] = ((Object) null);
        expectCanCastMethodArguments[2] = prototypeObjectType;
        expectCanCastMethodArguments[3] = unionType;
        try {
            expectCanCastMethod.invoke(typeValidator, expectCanCastMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExpectCanCast4() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Node node = new Node(0);
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        alternates.add(errorFunctionType);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(unionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectCanCast] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:813)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.reduceAlternatesWithoutUnion(UnionTypeBuilder.java:181)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.build(UnionTypeBuilder.java:193)
            com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined(UnionType.java:222)
            com.google.javascript.jscomp.TypeValidator.expectCanCast(TypeValidator.java:474) */
        typeValidator.expectCanCast(null, node, null, unionType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectIndexMatch
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method expectIndexMatch(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectIndexMatch(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testExpectIndexMatch_1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object unresolvedTypeExpression = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class unresolvedTypeExpressionType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method expectIndexMatchMethod = typeValidatorClazz.getDeclaredMethod("expectIndexMatch", nodeTraversalType, nodeType, unresolvedTypeExpressionType, unresolvedTypeExpressionType);
        expectIndexMatchMethod.setAccessible(true);
        java.lang.Object[] expectIndexMatchMethodArguments = new java.lang.Object[4];
        expectIndexMatchMethodArguments[0] = ((Object) null);
        expectIndexMatchMethodArguments[1] = ((Object) null);
        expectIndexMatchMethodArguments[2] = unresolvedTypeExpression;
        expectIndexMatchMethodArguments[3] = noType;
        expectIndexMatchMethod.invoke(typeValidator, expectIndexMatchMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectIndexMatch(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testExpectIndexMatch() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        typeValidator.expectIndexMatch(null, null, templateType, noType);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expectIndexMatch(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectIndexMatch(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isUnknownType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: objType.isUnknownType()
 *  */
    @Test
    public void testExpectIndexMatch_ThrowNullPointerException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectIndexMatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectIndexMatch(TypeValidator.java:304) */
        typeValidator.expectIndexMatch(null, null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method expectIndexMatch(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testExpectIndexMatch1() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object unresolvedTypeExpression = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectIndexMatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:729)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:602)
            com.google.javascript.jscomp.TypeValidator.expectStringOrNumber(TypeValidator.java:223)
            com.google.javascript.jscomp.TypeValidator.expectIndexMatch(TypeValidator.java:305) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class unresolvedTypeExpressionType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method expectIndexMatchMethod = typeValidatorClazz.getDeclaredMethod("expectIndexMatch", nodeTraversalType, nodeType, unresolvedTypeExpressionType, unresolvedTypeExpressionType);
        expectIndexMatchMethod.setAccessible(true);
        java.lang.Object[] expectIndexMatchMethodArguments = new java.lang.Object[4];
        expectIndexMatchMethodArguments[0] = nodeTraversal;
        expectIndexMatchMethodArguments[1] = ((Object) null);
        expectIndexMatchMethodArguments[2] = unresolvedTypeExpression;
        expectIndexMatchMethodArguments[3] = anonymousFunctionType;
        try {
            expectIndexMatchMethod.invoke(typeValidator, expectIndexMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExpectIndexMatch2() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        LinkedHashMap properties = new LinkedHashMap();
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectIndexMatch] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:110)
            com.google.javascript.rhino.jstype.PrototypeObjectType.getPropertyType(PrototypeObjectType.java:211)
            com.google.javascript.rhino.jstype.FunctionType.getPropertyType(FunctionType.java:428)
            com.google.javascript.rhino.jstype.PrototypeObjectType.hasOverridenNativeProperty(PrototypeObjectType.java:302)
            com.google.javascript.rhino.jstype.PrototypeObjectType.matchesNumberContext(PrototypeObjectType.java:283)
            com.google.javascript.rhino.jstype.FunctionType.matchesNumberContext(FunctionType.java:65)
            com.google.javascript.jscomp.TypeValidator.expectStringOrNumber(TypeValidator.java:222)
            com.google.javascript.jscomp.TypeValidator.expectIndexMatch(TypeValidator.java:305) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class unknownTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method expectIndexMatchMethod = typeValidatorClazz.getDeclaredMethod("expectIndexMatch", nodeTraversalType, nodeType, unknownTypeType, unknownTypeType);
        expectIndexMatchMethod.setAccessible(true);
        java.lang.Object[] expectIndexMatchMethodArguments = new java.lang.Object[4];
        expectIndexMatchMethodArguments[0] = nodeTraversal;
        expectIndexMatchMethodArguments[1] = ((Object) null);
        expectIndexMatchMethodArguments[2] = unknownType;
        expectIndexMatchMethodArguments[3] = errorFunctionType;
        try {
            expectIndexMatchMethod.invoke(typeValidator, expectIndexMatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExpectIndexMatch3() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectIndexMatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:729)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:602)
            com.google.javascript.jscomp.TypeValidator.expectStringOrNumber(TypeValidator.java:223)
            com.google.javascript.jscomp.TypeValidator.expectIndexMatch(TypeValidator.java:305) */
        typeValidator.expectIndexMatch(null, null, templateType, anonymousFunctionType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectNumber
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expectNumber(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectNumber(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testExpectNumber_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:813)
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:729)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:602)
            com.google.javascript.jscomp.TypeValidator.expectNumber(TypeValidator.java:200) */
        typeValidator.expectNumber(null, null, functionType, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectNumber(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !type.matchesNumberContext()
 *  */
    @Test
    public void testExpectNumber_ThrowNullPointerException() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.expectNumber(TypeValidator.java:199) */
        typeValidator.expectNumber(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectNumber(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: mismatch(t, n, msg, type, NUMBER_TYPE);
 *  */
    @Test
    public void testExpectNumber_ThrowNullPointerException_1() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:729)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:602)
            com.google.javascript.jscomp.TypeValidator.expectNumber(TypeValidator.java:200) */
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
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectNumber(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: mismatch(t, n, msg, type, NUMBER_TYPE);
 *  */
    @Test
    public void testExpectNumber_ThrowNullPointerException_2() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:597)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:602)
            com.google.javascript.jscomp.TypeValidator.expectNumber(TypeValidator.java:200) */
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
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.registerMismatch(TypeValidator.java:619)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:607)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:597)
            com.google.javascript.jscomp.TypeValidator.mismatch(TypeValidator.java:602)
            com.google.javascript.jscomp.TypeValidator.expectNumber(TypeValidator.java:200) */
        typeValidator.expectNumber(nodeTraversal, null, functionType, string);
    }
    
    @Test
    public void testExpectNumber2() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = new Node(0);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        LinkedHashMap properties = new LinkedHashMap();
        properties.put(null, null);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectNumber] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:110)
            com.google.javascript.rhino.jstype.PrototypeObjectType.getPropertyType(PrototypeObjectType.java:211)
            com.google.javascript.rhino.jstype.FunctionType.getPropertyType(FunctionType.java:428)
            com.google.javascript.rhino.jstype.PrototypeObjectType.hasOverridenNativeProperty(PrototypeObjectType.java:302)
            com.google.javascript.rhino.jstype.PrototypeObjectType.matchesNumberContext(PrototypeObjectType.java:283)
            com.google.javascript.rhino.jstype.FunctionType.matchesNumberContext(FunctionType.java:65)
            com.google.javascript.jscomp.TypeValidator.expectNumber(TypeValidator.java:199) */
        typeValidator.expectNumber(nodeTraversal, node, functionType, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.expectBitwiseable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method expectBitwiseable(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectBitwiseable(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 *  */
    @Test
    public void testExpectBitwiseable() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        UnknownType allValueTypes = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "allValueTypes", allValueTypes);
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class errorFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Method expectBitwiseableMethod = typeValidatorClazz.getDeclaredMethod("expectBitwiseable", nodeTraversalType, nodeType, errorFunctionTypeType, stringType);
        expectBitwiseableMethod.setAccessible(true);
        java.lang.Object[] expectBitwiseableMethodArguments = new java.lang.Object[4];
        expectBitwiseableMethodArguments[0] = ((Object) null);
        expectBitwiseableMethodArguments[1] = ((Object) null);
        expectBitwiseableMethodArguments[2] = errorFunctionType;
        expectBitwiseableMethodArguments[3] = ((Object) null);
        expectBitwiseableMethod.invoke(typeValidator, expectBitwiseableMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectBitwiseable(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 *  */
    @Test
    public void testExpectBitwiseable_1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType allValueTypes = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
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
            com.google.javascript.jscomp.TypeValidator.expectBitwiseable(TypeValidator.java:210) */
        typeValidator.expectBitwiseable(null, null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method expectBitwiseable(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    @Test
    public void testExpectBitwiseable1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType allValueTypes = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType1 = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(allValueTypes, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "allValueTypes", allValueTypes);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        typeValidator.expectBitwiseable(nodeTraversal, null, anonymousFunctionType, null);
    }
    
    @Test
    public void testExpectBitwiseable2() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType allValueTypes = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType2 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(allValueTypes, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "allValueTypes", allValueTypes);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        typeValidator.expectBitwiseable(nodeTraversal, scriptOrFnNode, anonymousFunctionType, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method expectBitwiseable(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    @Test(expected = StackOverflowError.class)
    public void testExpectBitwiseable3() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType allValueTypes = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(allValueTypes, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", allValueTypes);
        setField(typeValidator, "com.google.javascript.jscomp.TypeValidator", "allValueTypes", allValueTypes);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        typeValidator.expectBitwiseable(nodeTraversal, null, anonymousFunctionType, null);
    }
    
    @Test
    public void testExpectBitwiseable4() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectBitwiseable] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:110)
            com.google.javascript.rhino.jstype.PrototypeObjectType.getPropertyType(PrototypeObjectType.java:211)
            com.google.javascript.rhino.jstype.FunctionType.getPropertyType(FunctionType.java:428)
            com.google.javascript.rhino.jstype.PrototypeObjectType.hasOverridenNativeProperty(PrototypeObjectType.java:302)
            com.google.javascript.rhino.jstype.PrototypeObjectType.matchesNumberContext(PrototypeObjectType.java:283)
            com.google.javascript.rhino.jstype.FunctionType.matchesNumberContext(FunctionType.java:65)
            com.google.javascript.jscomp.TypeValidator.expectBitwiseable(TypeValidator.java:210) */
        typeValidator.expectBitwiseable(nodeTraversal, null, anonymousFunctionType, string);
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
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        typeValidator.expectCanOverride(null, null, templateType, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#expectCanOverride(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testExpectCanOverride_2() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType1 = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        typeValidator.expectCanOverride(null, null, templateType, null, null, null);
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
            com.google.javascript.jscomp.TypeValidator.expectCanOverride(TypeValidator.java:419) */
        typeValidator.expectCanOverride(null, null, null, null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method expectCanOverride(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, java.lang.String, com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testExpectCanOverride1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnionType referencedType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(referencedType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        String string = "";
        
        typeValidator.expectCanOverride(null, null, templateType, null, string, null);
    }
    
    @Test
    public void testExpectCanOverride2() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
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
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        String string = "";
        EnumType enumType = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        
        typeValidator.expectCanOverride(nodeTraversal, scriptOrFnNode, templateType, null, string, enumType);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method expectCanOverride(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, java.lang.String, com.google.javascript.rhino.jstype.JSType)
    
    @Test(expected = StackOverflowError.class)
    public void testExpectCanOverride3() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        typeValidator.expectCanOverride(null, null, templateType, null, null, null);
    }
    
    @Test
    public void testExpectCanOverride4() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnionType referencedType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        alternates.add(null);
        setField(referencedType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        String string = "";
        NullType nullType = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectCanOverride] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.canAssignTo(UnionType.java:198)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:199)
            com.google.javascript.rhino.jstype.TemplateType.canAssignTo(TemplateType.java:48)
            com.google.javascript.jscomp.TypeValidator.expectCanOverride(TypeValidator.java:419) */
        typeValidator.expectCanOverride(nodeTraversal, functionNode, templateType, null, string, nullType);
    }
    
    @Test
    public void testExpectCanOverride5() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnionType referencedType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        NullType nullType = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        alternates.add(nullType);
        setField(referencedType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectCanOverride] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.isSubtype(JSType.java:897)
            com.google.javascript.rhino.jstype.ValueType.isSubtype(ValueType.java:54)
            com.google.javascript.rhino.jstype.NullType.isSubtype(NullType.java:50)
            com.google.javascript.rhino.jstype.JSType.canAssignTo(JSType.java:444)
            com.google.javascript.rhino.jstype.UnionType.canAssignTo(UnionType.java:201)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:199)
            com.google.javascript.rhino.jstype.TemplateType.canAssignTo(TemplateType.java:48)
            com.google.javascript.jscomp.TypeValidator.expectCanOverride(TypeValidator.java:419) */
        typeValidator.expectCanOverride(nodeTraversal, functionNode, templateType, null, null, null);
    }
    
    @Test
    public void testExpectCanOverride6() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnionType referencedType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        alternates.add(anonymousFunctionType);
        setField(referencedType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        VoidType voidType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectCanOverride] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.isSubtype(JSType.java:897)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:736)
            com.google.javascript.rhino.jstype.JSType.canAssignTo(JSType.java:444)
            com.google.javascript.rhino.jstype.UnionType.canAssignTo(UnionType.java:201)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:199)
            com.google.javascript.rhino.jstype.TemplateType.canAssignTo(TemplateType.java:48)
            com.google.javascript.jscomp.TypeValidator.expectCanOverride(TypeValidator.java:419) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Method expectCanOverrideMethod = typeValidatorClazz.getDeclaredMethod("expectCanOverride", nodeTraversalType, numberNodeType, templateTypeType, templateTypeType, stringType, templateTypeType);
        expectCanOverrideMethod.setAccessible(true);
        java.lang.Object[] expectCanOverrideMethodArguments = new java.lang.Object[6];
        expectCanOverrideMethodArguments[0] = ((Object) null);
        expectCanOverrideMethodArguments[1] = numberNode;
        expectCanOverrideMethodArguments[2] = templateType;
        expectCanOverrideMethodArguments[3] = ((Object) null);
        expectCanOverrideMethodArguments[4] = ((Object) null);
        expectCanOverrideMethodArguments[5] = voidType;
        try {
            expectCanOverrideMethod.invoke(typeValidator, expectCanOverrideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.bothIntrinsics
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method bothIntrinsics(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#bothIntrinsics(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return (leftType.isConstructor() || leftType.isEnumType()) && (rightType.isConstructor() || rightType.isEnumType());}
 *  */
    @Test
    public void testBothIntrinsics_ReturnLeftTypeIsConstructorOrLeftTypeIsEnumTypeAndRightTypeIsConstructorOrRightTypeIsEnumType() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        FunctionType referencedType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", noObjectTypeType, noObjectTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = noObjectType;
        bothIntrinsicsMethodArguments[1] = templateType;
        boolean actual = ((Boolean) bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#bothIntrinsics(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return (leftType.isConstructor() || leftType.isEnumType()) && (rightType.isConstructor() || rightType.isEnumType());}
 *  */
    @Test
    public void testBothIntrinsics_ReturnLeftTypeIsConstructorOrLeftTypeIsEnumTypeAndRightTypeIsConstructorOrRightTypeIsEnumType_1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        FunctionType referencedType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(referencedType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", templateTypeType, templateTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = templateType;
        bothIntrinsicsMethodArguments[1] = noObjectType;
        boolean actual = ((Boolean) bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#bothIntrinsics(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return (leftType.isConstructor() || leftType.isEnumType()) && (rightType.isConstructor() || rightType.isEnumType());}
 *  */
    @Test
    public void testBothIntrinsics_ReturnLeftTypeIsConstructorOrLeftTypeIsEnumTypeAndRightTypeIsConstructorOrRightTypeIsEnumType_2() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object proxyObjectType = createInstance("com.google.javascript.rhino.jstype.ProxyObjectType");
        FunctionType referencedType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(referencedType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(proxyObjectType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType1 = createInstance("com.google.javascript.rhino.jstype.NamedType");
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        FunctionType referencedType3 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(referencedType3, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class proxyObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", proxyObjectTypeType, proxyObjectTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = proxyObjectType;
        bothIntrinsicsMethodArguments[1] = templateType;
        boolean actual = ((Boolean) bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method bothIntrinsics(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#bothIntrinsics(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (leftType.isConstructor() || leftType.isEnumType()) && (rightType.isConstructor() || rightType.isEnumType());
 *  */
    @Test
    public void testBothIntrinsics_ThrowNullPointerException() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.bothIntrinsics] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.bothIntrinsics(TypeValidator.java:378) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", jSTypeType, jSTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = ((Object) null);
        bothIntrinsicsMethodArguments[1] = ((Object) null);
        try {
            bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#bothIntrinsics(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (rightType.isConstructor() || rightType.isEnumType())
 *  */
    @Test
    public void testBothIntrinsics_ThrowNullPointerException_1() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.bothIntrinsics] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.bothIntrinsics(TypeValidator.java:379) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", jSTypeType, jSTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = ((Object) null);
        bothIntrinsicsMethodArguments[1] = noType;
        try {
            bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#bothIntrinsics(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (rightType.isConstructor() || rightType.isEnumType())
 *  */
    @Test
    public void testBothIntrinsics_ThrowNullPointerException_2() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        FunctionType referencedType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(referencedType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.bothIntrinsics] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.bothIntrinsics(TypeValidator.java:379) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", jSTypeType, jSTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = ((Object) null);
        bothIntrinsicsMethodArguments[1] = templateType;
        try {
            bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#bothIntrinsics(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (rightType.isConstructor() || rightType.isEnumType())
 *  */
    @Test
    public void testBothIntrinsics_ThrowNullPointerException_3() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoObjectType referencedType1 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(referencedType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.bothIntrinsics] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.bothIntrinsics(TypeValidator.java:379) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", jSTypeType, jSTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = ((Object) null);
        bothIntrinsicsMethodArguments[1] = templateType;
        try {
            bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#bothIntrinsics(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (rightType.isConstructor() || rightType.isEnumType())
 *  */
    @Test
    public void testBothIntrinsics_ThrowNullPointerException_4() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.ParameterizedType");
        NoObjectType referencedType1 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(referencedType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.bothIntrinsics] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.bothIntrinsics(TypeValidator.java:379) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", jSTypeType, jSTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = ((Object) null);
        bothIntrinsicsMethodArguments[1] = templateType;
        try {
            bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method bothIntrinsics(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testBothIntrinsics1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", templateTypeType, templateTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = templateType;
        bothIntrinsicsMethodArguments[1] = noResolvedType;
        boolean actual = ((Boolean) bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testBothIntrinsics2() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", anonymousFunctionTypeType, anonymousFunctionTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = anonymousFunctionType;
        bothIntrinsicsMethodArguments[1] = noResolvedType;
        boolean actual = ((Boolean) bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testBothIntrinsics3() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(referencedType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class errorFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", errorFunctionTypeType, errorFunctionTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = errorFunctionType;
        bothIntrinsicsMethodArguments[1] = templateType;
        boolean actual = ((Boolean) bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testBothIntrinsics4() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        EnumType enumType = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.ParameterizedType");
        FunctionType referencedType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class enumTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", enumTypeType, enumTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = enumType;
        bothIntrinsicsMethodArguments[1] = templateType;
        boolean actual = ((Boolean) bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testBothIntrinsics5() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        EnumType enumType = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        FunctionType referencedType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class enumTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", enumTypeType, enumTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = enumType;
        bothIntrinsicsMethodArguments[1] = templateType;
        boolean actual = ((Boolean) bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testBothIntrinsics6() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        FunctionType referencedType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", jSTypeType, jSTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = ((Object) null);
        bothIntrinsicsMethodArguments[1] = templateType;
        boolean actual = ((Boolean) bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testBothIntrinsics7() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        EnumType enumType = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.ParameterizedType");
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoType referencedType2 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class enumTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", enumTypeType, enumTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = enumType;
        bothIntrinsicsMethodArguments[1] = templateType;
        boolean actual = ((Boolean) bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testBothIntrinsics8() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.ParameterizedType");
        Object referencedType1 = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(referencedType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class errorFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", errorFunctionTypeType, errorFunctionTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = errorFunctionType;
        bothIntrinsicsMethodArguments[1] = templateType;
        boolean actual = ((Boolean) bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testBothIntrinsics9() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType1 = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(referencedType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class errorFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", errorFunctionTypeType, errorFunctionTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = errorFunctionType;
        bothIntrinsicsMethodArguments[1] = templateType;
        boolean actual = ((Boolean) bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testBothIntrinsics10() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.ParameterizedType");
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType2 = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(referencedType2, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", functionTypeType, functionTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = functionType;
        bothIntrinsicsMethodArguments[1] = templateType;
        boolean actual = ((Boolean) bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testBothIntrinsics11() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoType referencedType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(referencedType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        TemplateType templateType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType2 = createInstance("com.google.javascript.rhino.jstype.ParameterizedType");
        Object referencedType3 = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        setField(referencedType3, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(templateType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", templateTypeType, templateTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = templateType;
        bothIntrinsicsMethodArguments[1] = templateType1;
        boolean actual = ((Boolean) bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments));
        
        assertTrue(actual);
    }
    
    @Test
    public void testBothIntrinsics12() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType2 = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(referencedType2, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", functionTypeType, functionTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = functionType;
        bothIntrinsicsMethodArguments[1] = templateType;
        boolean actual = ((Boolean) bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testBothIntrinsics13() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType2 = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", jSTypeType, jSTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = ((Object) null);
        bothIntrinsicsMethodArguments[1] = templateType;
        boolean actual = ((Boolean) bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testBothIntrinsics14() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object parameterizedType = createInstance("com.google.javascript.rhino.jstype.ParameterizedType");
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType1 = createInstance("com.google.javascript.rhino.jstype.ParameterizedType");
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType3 = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(referencedType3, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class parameterizedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", parameterizedTypeType, parameterizedTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = parameterizedType;
        bothIntrinsicsMethodArguments[1] = templateType;
        boolean actual = ((Boolean) bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testBothIntrinsics15() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        TemplateType templateType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType1 = createInstance("com.google.javascript.rhino.jstype.ParameterizedType");
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType3 = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(referencedType3, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(templateType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", templateTypeType, templateTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = templateType;
        bothIntrinsicsMethodArguments[1] = templateType1;
        boolean actual = ((Boolean) bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testBothIntrinsics16() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoType referencedType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        TemplateType templateType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType2 = createInstance("com.google.javascript.rhino.jstype.ParameterizedType");
        Object referencedType3 = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(referencedType3, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(templateType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", templateTypeType, templateTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = templateType;
        bothIntrinsicsMethodArguments[1] = templateType1;
        boolean actual = ((Boolean) bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testBothIntrinsics17() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(referencedType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        TemplateType templateType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        FunctionType referencedType4 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(referencedType4, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(templateType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", templateTypeType, templateTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = templateType;
        bothIntrinsicsMethodArguments[1] = templateType1;
        boolean actual = ((Boolean) bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments));
        
        assertTrue(actual);
    }
    
    @Test
    public void testBothIntrinsics18() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType3 = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(referencedType3, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class noResolvedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", noResolvedTypeType, noResolvedTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = noResolvedType;
        bothIntrinsicsMethodArguments[1] = templateType;
        boolean actual = ((Boolean) bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testBothIntrinsics19() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        FunctionType referencedType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        TemplateType templateType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType3 = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(referencedType3, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(templateType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", templateTypeType, templateTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = templateType;
        bothIntrinsicsMethodArguments[1] = templateType1;
        boolean actual = ((Boolean) bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testBothIntrinsics20() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.ParameterizedType");
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType3 = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", jSTypeType, jSTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = ((Object) null);
        bothIntrinsicsMethodArguments[1] = templateType;
        boolean actual = ((Boolean) bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testBothIntrinsics21() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType4 = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", templateTypeType, templateTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = templateType;
        bothIntrinsicsMethodArguments[1] = noResolvedType;
        boolean actual = ((Boolean) bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testBothIntrinsics22() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType3 = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(referencedType3, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        TemplateType templateType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(templateType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", templateTypeType, templateTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = templateType;
        bothIntrinsicsMethodArguments[1] = templateType1;
        boolean actual = ((Boolean) bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments));
        
        assertTrue(actual);
    }
    
    @Test
    public void testBothIntrinsics23() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        FunctionType referencedType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        TemplateType templateType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType4 = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(referencedType4, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(templateType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", templateTypeType, templateTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = templateType;
        bothIntrinsicsMethodArguments[1] = templateType1;
        boolean actual = ((Boolean) bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testBothIntrinsics24() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType2 = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(referencedType2, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", templateTypeType, templateTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = templateType;
        bothIntrinsicsMethodArguments[1] = templateType;
        boolean actual = ((Boolean) bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments));
        
        assertTrue(actual);
    }
    
    @Test
    public void testBothIntrinsics25() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType3 = createInstance("com.google.javascript.rhino.jstype.ParameterizedType");
        FunctionType referencedType4 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        TemplateType templateType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType5 = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(referencedType5, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(templateType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", templateTypeType, templateTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = templateType;
        bothIntrinsicsMethodArguments[1] = templateType1;
        boolean actual = ((Boolean) bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testBothIntrinsics26() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType5 = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", jSTypeType, jSTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = ((Object) null);
        bothIntrinsicsMethodArguments[1] = templateType;
        boolean actual = ((Boolean) bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testBothIntrinsics27() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType4 = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        TemplateType templateType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType6 = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(referencedType6, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(referencedType5, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType6);
        setField(templateType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", templateTypeType, templateTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = templateType;
        bothIntrinsicsMethodArguments[1] = templateType1;
        boolean actual = ((Boolean) bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method bothIntrinsics(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    @Test(expected = StackOverflowError.class)
    public void testBothIntrinsics28() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", templateTypeType, templateTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = templateType;
        bothIntrinsicsMethodArguments[1] = noResolvedType;
        try {
            bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testBothIntrinsics29() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.ParameterizedType");
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", jSTypeType, jSTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = ((Object) null);
        bothIntrinsicsMethodArguments[1] = templateType;
        try {
            bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testBothIntrinsics30() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        TemplateType templateType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType1 = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(referencedType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(templateType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", templateTypeType, templateTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = templateType;
        bothIntrinsicsMethodArguments[1] = templateType1;
        try {
            bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testBothIntrinsics31() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.ParameterizedType");
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", jSTypeType, jSTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = ((Object) null);
        bothIntrinsicsMethodArguments[1] = templateType;
        try {
            bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testBothIntrinsics32() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        TemplateType templateType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType2 = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(referencedType2, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(templateType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", templateTypeType, templateTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = templateType;
        bothIntrinsicsMethodArguments[1] = templateType1;
        try {
            bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testBothIntrinsics33() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        TemplateType templateType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType1 = createInstance("com.google.javascript.rhino.jstype.ParameterizedType");
        Object referencedType2 = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(referencedType2, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(templateType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", templateTypeType, templateTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = templateType;
        bothIntrinsicsMethodArguments[1] = templateType1;
        try {
            bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testBothIntrinsics34() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.NamedType");
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType3 = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(referencedType3, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.bothIntrinsics] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.bothIntrinsics(TypeValidator.java:379) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method bothIntrinsicsMethod = typeValidatorClazz.getDeclaredMethod("bothIntrinsics", jSTypeType, jSTypeType);
        bothIntrinsicsMethod.setAccessible(true);
        java.lang.Object[] bothIntrinsicsMethodArguments = new java.lang.Object[2];
        bothIntrinsicsMethodArguments[0] = ((Object) null);
        bothIntrinsicsMethodArguments[1] = templateType;
        try {
            bothIntrinsicsMethod.invoke(typeValidator, bothIntrinsicsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        boolean actual = typeValidator.expectCanAssignTo(null, null, templateType, null, null);
        
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
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        boolean actual = typeValidator.expectCanAssignTo(null, null, templateType, null, null);
        
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
            com.google.javascript.jscomp.TypeValidator.expectCanAssignTo(TypeValidator.java:364) */
        typeValidator.expectCanAssignTo(null, null, null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method expectCanAssignTo(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    @Test
    public void testExpectCanAssignTo1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnionType referencedType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(referencedType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Method expectCanAssignToMethod = typeValidatorClazz.getDeclaredMethod("expectCanAssignTo", nodeTraversalType, numberNodeType, templateTypeType, templateTypeType, stringType);
        expectCanAssignToMethod.setAccessible(true);
        java.lang.Object[] expectCanAssignToMethodArguments = new java.lang.Object[5];
        expectCanAssignToMethodArguments[0] = nodeTraversal;
        expectCanAssignToMethodArguments[1] = numberNode;
        expectCanAssignToMethodArguments[2] = templateType;
        expectCanAssignToMethodArguments[3] = ((Object) null);
        expectCanAssignToMethodArguments[4] = ((Object) null);
        boolean actual = ((Boolean) expectCanAssignToMethod.invoke(typeValidator, expectCanAssignToMethodArguments));
        
        assertTrue(actual);
    }
    
    @Test
    public void testExpectCanAssignTo2() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType6 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType5, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType6);
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Method expectCanAssignToMethod = typeValidatorClazz.getDeclaredMethod("expectCanAssignTo", nodeTraversalType, numberNodeType, templateTypeType, templateTypeType, stringType);
        expectCanAssignToMethod.setAccessible(true);
        java.lang.Object[] expectCanAssignToMethodArguments = new java.lang.Object[5];
        expectCanAssignToMethodArguments[0] = nodeTraversal;
        expectCanAssignToMethodArguments[1] = numberNode;
        expectCanAssignToMethodArguments[2] = templateType;
        expectCanAssignToMethodArguments[3] = ((Object) null);
        expectCanAssignToMethodArguments[4] = ((Object) null);
        boolean actual = ((Boolean) expectCanAssignToMethod.invoke(typeValidator, expectCanAssignToMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method expectCanAssignTo(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, java.lang.String)
    
    @Test(expected = StackOverflowError.class)
    public void testExpectCanAssignTo3() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        typeValidator.expectCanAssignTo(null, null, templateType, null, null);
    }
    
    @Test
    public void testExpectCanAssignTo4() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnionType referencedType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        alternates.add(null);
        setField(referencedType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        Object parameterizedType = createInstance("com.google.javascript.rhino.jstype.ParameterizedType");
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectCanAssignTo] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.canAssignTo(UnionType.java:198)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:199)
            com.google.javascript.rhino.jstype.TemplateType.canAssignTo(TemplateType.java:48)
            com.google.javascript.jscomp.TypeValidator.expectCanAssignTo(TypeValidator.java:364) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Method expectCanAssignToMethod = typeValidatorClazz.getDeclaredMethod("expectCanAssignTo", nodeTraversalType, numberNodeType, templateTypeType, templateTypeType, stringType);
        expectCanAssignToMethod.setAccessible(true);
        java.lang.Object[] expectCanAssignToMethodArguments = new java.lang.Object[5];
        expectCanAssignToMethodArguments[0] = ((Object) null);
        expectCanAssignToMethodArguments[1] = numberNode;
        expectCanAssignToMethodArguments[2] = templateType;
        expectCanAssignToMethodArguments[3] = parameterizedType;
        expectCanAssignToMethodArguments[4] = string;
        try {
            expectCanAssignToMethod.invoke(typeValidator, expectCanAssignToMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testExpectCanAssignTo5() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnionType referencedType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        alternates.add(anonymousFunctionType);
        setField(referencedType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.expectCanAssignTo] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.isSubtype(JSType.java:897)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:736)
            com.google.javascript.rhino.jstype.JSType.canAssignTo(JSType.java:444)
            com.google.javascript.rhino.jstype.UnionType.canAssignTo(UnionType.java:201)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:199)
            com.google.javascript.rhino.jstype.TemplateType.canAssignTo(TemplateType.java:48)
            com.google.javascript.jscomp.TypeValidator.expectCanAssignTo(TypeValidator.java:364) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Method expectCanAssignToMethod = typeValidatorClazz.getDeclaredMethod("expectCanAssignTo", nodeTraversalType, numberNodeType, templateTypeType, templateTypeType, stringType);
        expectCanAssignToMethod.setAccessible(true);
        java.lang.Object[] expectCanAssignToMethodArguments = new java.lang.Object[5];
        expectCanAssignToMethodArguments[0] = nodeTraversal;
        expectCanAssignToMethodArguments[1] = numberNode;
        expectCanAssignToMethodArguments[2] = templateType;
        expectCanAssignToMethodArguments[3] = ((Object) null);
        expectCanAssignToMethodArguments[4] = ((Object) null);
        try {
            expectCanAssignToMethod.invoke(typeValidator, expectCanAssignToMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.registerMismatch
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method registerMismatch(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#registerMismatch(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#restrictByNotNullOrUndefined()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: found = found.restrictByNotNullOrUndefined();
 *  */
    @Test
    public void testRegisterMismatch_ThrowNullPointerException() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.registerMismatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.registerMismatch(TypeValidator.java:618) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method registerMismatchMethod = typeValidatorClazz.getDeclaredMethod("registerMismatch", jSTypeType, jSTypeType);
        registerMismatchMethod.setAccessible(true);
        java.lang.Object[] registerMismatchMethodArguments = new java.lang.Object[2];
        registerMismatchMethodArguments[0] = ((Object) null);
        registerMismatchMethodArguments[1] = ((Object) null);
        try {
            registerMismatchMethod.invoke(typeValidator, registerMismatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method registerMismatch(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testRegisterMismatch1() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.registerMismatch] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionTypeBuilder.reduceAlternatesWithoutUnion(UnionTypeBuilder.java:181)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.build(UnionTypeBuilder.java:193)
            com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined(UnionType.java:222)
            com.google.javascript.jscomp.TypeValidator.registerMismatch(TypeValidator.java:618) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class unionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method registerMismatchMethod = typeValidatorClazz.getDeclaredMethod("registerMismatch", unionTypeType, unionTypeType);
        registerMismatchMethod.setAccessible(true);
        java.lang.Object[] registerMismatchMethodArguments = new java.lang.Object[2];
        registerMismatchMethodArguments[0] = unionType;
        registerMismatchMethodArguments[1] = ((Object) null);
        try {
            registerMismatchMethod.invoke(typeValidator, registerMismatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRegisterMismatch2() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        alternates.add(null);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(unionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.registerMismatch] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined(UnionType.java:220)
            com.google.javascript.jscomp.TypeValidator.registerMismatch(TypeValidator.java:618) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class unionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method registerMismatchMethod = typeValidatorClazz.getDeclaredMethod("registerMismatch", unionTypeType, unionTypeType);
        registerMismatchMethod.setAccessible(true);
        java.lang.Object[] registerMismatchMethodArguments = new java.lang.Object[2];
        registerMismatchMethodArguments[0] = unionType;
        registerMismatchMethodArguments[1] = anonymousFunctionType;
        try {
            registerMismatchMethod.invoke(typeValidator, registerMismatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRegisterMismatch3() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
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
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.registerMismatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.registerMismatch(TypeValidator.java:619) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class unionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method registerMismatchMethod = typeValidatorClazz.getDeclaredMethod("registerMismatch", unionTypeType, unionTypeType);
        registerMismatchMethod.setAccessible(true);
        java.lang.Object[] registerMismatchMethodArguments = new java.lang.Object[2];
        registerMismatchMethodArguments[0] = unionType;
        registerMismatchMethodArguments[1] = ((Object) null);
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
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null};
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
        JSTypeRegistry typeValidatorTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typeValidator, "com.google.javascript.jscomp.TypeValidator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeValidatorTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeValidatorTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeValidatorTypeRegistryNativeTypes1 = ((JSType) get(typeValidatorTypeRegistry1TypeRegistryNativeTypes, 1));
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes0);
        
        assertNull(finalTypeValidatorTypeRegistryNativeTypes1);
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
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:813)
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:729) */
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
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:729) */
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
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = typeValidatorClazz.getDeclaredMethod("getJSType", scriptOrFnNodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = scriptOrFnNode;
        TemplateType actual = ((TemplateType) getJSTypeMethod.invoke(typeValidator, getJSTypeMethodArguments));
        
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.TemplateType", "name"));
        assertNull(actualName);
        
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
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.getJSType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:813)
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:729)
            com.google.javascript.jscomp.TypeValidator.getJSType(TypeValidator.java:722) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = typeValidatorClazz.getDeclaredMethod("getJSType", scriptOrFnNodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = scriptOrFnNode;
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
            com.google.javascript.jscomp.TypeValidator.getJSType(TypeValidator.java:716) */
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
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.getJSType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.getNativeType(TypeValidator.java:729)
            com.google.javascript.jscomp.TypeValidator.getJSType(TypeValidator.java:722) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = typeValidatorClazz.getDeclaredMethod("getJSType", scriptOrFnNodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = scriptOrFnNode;
        try {
            getJSTypeMethod.invoke(typeValidator, getJSTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeValidator.registerIfMismatch
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method registerIfMismatch(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#registerIfMismatch(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (found != null): True}
 * @utbot.executesCondition {@code (required != null): True}
 *  */
    @Test
    public void testRegisterIfMismatch_RequiredNotEqualsNull() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class unknownTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method registerIfMismatchMethod = typeValidatorClazz.getDeclaredMethod("registerIfMismatch", unknownTypeType, unknownTypeType);
        registerIfMismatchMethod.setAccessible(true);
        java.lang.Object[] registerIfMismatchMethodArguments = new java.lang.Object[2];
        registerIfMismatchMethodArguments[0] = unknownType;
        registerIfMismatchMethodArguments[1] = templateType;
        registerIfMismatchMethod.invoke(typeValidator, registerIfMismatchMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#registerIfMismatch(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (found != null): True}
 * @utbot.executesCondition {@code (required != null): False}
 *  */
    @Test
    public void testRegisterIfMismatch_RequiredEqualsNull() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method registerIfMismatchMethod = typeValidatorClazz.getDeclaredMethod("registerIfMismatch", templateTypeType, templateTypeType);
        registerIfMismatchMethod.setAccessible(true);
        java.lang.Object[] registerIfMismatchMethodArguments = new java.lang.Object[2];
        registerIfMismatchMethodArguments[0] = templateType;
        registerIfMismatchMethodArguments[1] = ((Object) null);
        registerIfMismatchMethod.invoke(typeValidator, registerIfMismatchMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#registerIfMismatch(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (found != null): False}
 *  */
    @Test
    public void testRegisterIfMismatch_FoundEqualsNull() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method registerIfMismatchMethod = typeValidatorClazz.getDeclaredMethod("registerIfMismatch", jSTypeType, jSTypeType);
        registerIfMismatchMethod.setAccessible(true);
        java.lang.Object[] registerIfMismatchMethodArguments = new java.lang.Object[2];
        registerIfMismatchMethodArguments[0] = ((Object) null);
        registerIfMismatchMethodArguments[1] = ((Object) null);
        registerIfMismatchMethod.invoke(typeValidator, registerIfMismatchMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#registerIfMismatch(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (found != null): True}
 * @utbot.executesCondition {@code (required != null): True}
 *  */
    @Test
    public void testRegisterIfMismatch_RequiredNotEqualsNull_1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method registerIfMismatchMethod = typeValidatorClazz.getDeclaredMethod("registerIfMismatch", templateTypeType, templateTypeType);
        registerIfMismatchMethod.setAccessible(true);
        java.lang.Object[] registerIfMismatchMethodArguments = new java.lang.Object[2];
        registerIfMismatchMethodArguments[0] = templateType;
        registerIfMismatchMethodArguments[1] = templateType;
        registerIfMismatchMethod.invoke(typeValidator, registerIfMismatchMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#registerIfMismatch(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (found != null): True}
 * @utbot.executesCondition {@code (required != null): True}
 *  */
    @Test
    public void testRegisterIfMismatch_RequiredNotEqualsNull_2() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method registerIfMismatchMethod = typeValidatorClazz.getDeclaredMethod("registerIfMismatch", templateTypeType, templateTypeType);
        registerIfMismatchMethod.setAccessible(true);
        java.lang.Object[] registerIfMismatchMethodArguments = new java.lang.Object[2];
        registerIfMismatchMethodArguments[0] = templateType;
        registerIfMismatchMethodArguments[1] = templateType;
        registerIfMismatchMethod.invoke(typeValidator, registerIfMismatchMethodArguments);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method registerIfMismatch(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testRegisterIfMismatch1() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnionType referencedType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        StringType stringType = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        alternates.add(stringType);
        setField(referencedType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method registerIfMismatchMethod = typeValidatorClazz.getDeclaredMethod("registerIfMismatch", templateTypeType, templateTypeType);
        registerIfMismatchMethod.setAccessible(true);
        java.lang.Object[] registerIfMismatchMethodArguments = new java.lang.Object[2];
        registerIfMismatchMethodArguments[0] = templateType;
        registerIfMismatchMethodArguments[1] = unknownType;
        registerIfMismatchMethod.invoke(typeValidator, registerIfMismatchMethodArguments);
    }
    
    @Test
    public void testRegisterIfMismatch2() throws Exception  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnionType referencedType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        alternates.add(anonymousFunctionType);
        setField(referencedType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        AllType allType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method registerIfMismatchMethod = typeValidatorClazz.getDeclaredMethod("registerIfMismatch", templateTypeType, templateTypeType);
        registerIfMismatchMethod.setAccessible(true);
        java.lang.Object[] registerIfMismatchMethodArguments = new java.lang.Object[2];
        registerIfMismatchMethodArguments[0] = templateType;
        registerIfMismatchMethodArguments[1] = allType;
        registerIfMismatchMethod.invoke(typeValidator, registerIfMismatchMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method registerIfMismatch(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    @Test(expected = StackOverflowError.class)
    public void testRegisterIfMismatch3() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method registerIfMismatchMethod = typeValidatorClazz.getDeclaredMethod("registerIfMismatch", templateTypeType, templateTypeType);
        registerIfMismatchMethod.setAccessible(true);
        java.lang.Object[] registerIfMismatchMethodArguments = new java.lang.Object[2];
        registerIfMismatchMethodArguments[0] = templateType;
        registerIfMismatchMethodArguments[1] = unknownType;
        try {
            registerIfMismatchMethod.invoke(typeValidator, registerIfMismatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRegisterIfMismatch4() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnionType referencedType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        alternates.add(null);
        setField(referencedType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.registerIfMismatch] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.canAssignTo(UnionType.java:198)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:199)
            com.google.javascript.rhino.jstype.TemplateType.canAssignTo(TemplateType.java:48)
            com.google.javascript.jscomp.TypeValidator.registerIfMismatch(TypeValidator.java:642) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method registerIfMismatchMethod = typeValidatorClazz.getDeclaredMethod("registerIfMismatch", templateTypeType, templateTypeType);
        registerIfMismatchMethod.setAccessible(true);
        java.lang.Object[] registerIfMismatchMethodArguments = new java.lang.Object[2];
        registerIfMismatchMethodArguments[0] = templateType;
        registerIfMismatchMethodArguments[1] = unknownType;
        try {
            registerIfMismatchMethod.invoke(typeValidator, registerIfMismatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRegisterIfMismatch5() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnionType referencedType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        EnumType returnType = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        alternates.add(anonymousFunctionType);
        setField(referencedType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.registerIfMismatch] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:110)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:775)
            com.google.javascript.rhino.jstype.JSType.canAssignTo(JSType.java:444)
            com.google.javascript.rhino.jstype.UnionType.canAssignTo(UnionType.java:201)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:199)
            com.google.javascript.rhino.jstype.TemplateType.canAssignTo(TemplateType.java:48)
            com.google.javascript.jscomp.TypeValidator.registerIfMismatch(TypeValidator.java:642) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method registerIfMismatchMethod = typeValidatorClazz.getDeclaredMethod("registerIfMismatch", templateTypeType, templateTypeType);
        registerIfMismatchMethod.setAccessible(true);
        java.lang.Object[] registerIfMismatchMethodArguments = new java.lang.Object[2];
        registerIfMismatchMethodArguments[0] = templateType;
        registerIfMismatchMethodArguments[1] = noResolvedType;
        try {
            registerIfMismatchMethod.invoke(typeValidator, registerIfMismatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRegisterIfMismatch6() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnionType referencedType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        UnknownType jsType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnTypeInferred", true);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        alternates.add(errorFunctionType);
        setField(referencedType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.registerIfMismatch] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:110)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:775)
            com.google.javascript.rhino.jstype.JSType.canAssignTo(JSType.java:444)
            com.google.javascript.rhino.jstype.UnionType.canAssignTo(UnionType.java:201)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:199)
            com.google.javascript.rhino.jstype.TemplateType.canAssignTo(TemplateType.java:48)
            com.google.javascript.jscomp.TypeValidator.registerIfMismatch(TypeValidator.java:642) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method registerIfMismatchMethod = typeValidatorClazz.getDeclaredMethod("registerIfMismatch", templateTypeType, templateTypeType);
        registerIfMismatchMethod.setAccessible(true);
        java.lang.Object[] registerIfMismatchMethodArguments = new java.lang.Object[2];
        registerIfMismatchMethodArguments[0] = templateType;
        registerIfMismatchMethodArguments[1] = enumElementType;
        try {
            registerIfMismatchMethod.invoke(typeValidator, registerIfMismatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testRegisterIfMismatch7() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnionType referencedType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        alternates.add(errorFunctionType);
        setField(referencedType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        NumberType numberType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.registerIfMismatch] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:110)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:775)
            com.google.javascript.rhino.jstype.JSType.canAssignTo(JSType.java:444)
            com.google.javascript.rhino.jstype.UnionType.canAssignTo(UnionType.java:201)
            com.google.javascript.rhino.jstype.ProxyObjectType.canAssignTo(ProxyObjectType.java:199)
            com.google.javascript.rhino.jstype.TemplateType.canAssignTo(TemplateType.java:48)
            com.google.javascript.jscomp.TypeValidator.registerIfMismatch(TypeValidator.java:642) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method registerIfMismatchMethod = typeValidatorClazz.getDeclaredMethod("registerIfMismatch", templateTypeType, templateTypeType);
        registerIfMismatchMethod.setAccessible(true);
        java.lang.Object[] registerIfMismatchMethodArguments = new java.lang.Object[2];
        registerIfMismatchMethodArguments[0] = templateType;
        registerIfMismatchMethodArguments[1] = numberType;
        try {
            registerIfMismatchMethod.invoke(typeValidator, registerIfMismatchMethodArguments);
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
 * @utbot.executesCondition {@code (type instanceof UnionType): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isNoResolvedType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return type.isNoResolvedType();
 *  */
    @Test
    public void testContainsForwardDeclaredUnresolvedName_ThrowNullPointerException() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.containsForwardDeclaredUnresolvedName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.containsForwardDeclaredUnresolvedName(TypeValidator.java:270) */
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
    
    /**
    @utbot.classUnderTest {@link TypeValidator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeValidator#containsForwardDeclaredUnresolvedName(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type instanceof UnionType): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.UnionType#getAlternates()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(JSType alt: ((UnionType) type).getAlternates())
 *  */
    @Test
    public void testContainsForwardDeclaredUnresolvedName_ThrowNullPointerException_1() throws Throwable  {
        TypeValidator typeValidator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeValidator.containsForwardDeclaredUnresolvedName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeValidator.containsForwardDeclaredUnresolvedName(TypeValidator.java:264) */
        Class typeValidatorClazz = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class unionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method containsForwardDeclaredUnresolvedNameMethod = typeValidatorClazz.getDeclaredMethod("containsForwardDeclaredUnresolvedName", unionTypeType);
        containsForwardDeclaredUnresolvedNameMethod.setAccessible(true);
        java.lang.Object[] containsForwardDeclaredUnresolvedNameMethodArguments = new java.lang.Object[1];
        containsForwardDeclaredUnresolvedNameMethodArguments[0] = unionType;
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
        
                java.lang.reflect.Method methodForGetDeclaredFields913218533019400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields913218533019400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass913218533025600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields913218533019400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass913218533025600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields913218534540200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields913218534540200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass913218534542600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields913218534540200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass913218534542600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

