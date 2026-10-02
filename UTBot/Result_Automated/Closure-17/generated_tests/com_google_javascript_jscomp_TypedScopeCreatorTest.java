package com.google.javascript.jscomp;

import org.junit.Test;
import java.lang.reflect.Method;
import com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents;
import java.util.LinkedHashMap;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.ParameterizedType;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.jscomp.Scope.Arguments;
import com.google.javascript.jscomp.SourceFile.OnDisk;
import com.google.javascript.rhino.jstype.SimpleSourceFile;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static java.lang.reflect.Array.get;

public final class com_google_javascript_jscomp_TypedScopeCreatorTest {
    ///region Test suites for executable com.google.javascript.jscomp.TypedScopeCreator.getFunctionAnalysisResults
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFunctionAnalysisResults(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#getFunctionAnalysisResults(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetFunctionAnalysisResults_NEqualsNull() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getFunctionAnalysisResultsMethod = typedScopeCreatorClazz.getDeclaredMethod("getFunctionAnalysisResults", nodeType);
        getFunctionAnalysisResultsMethod.setAccessible(true);
        java.lang.Object[] getFunctionAnalysisResultsMethodArguments = new java.lang.Object[1];
        getFunctionAnalysisResultsMethodArguments[0] = ((Object) null);
        FunctionTypeBuilder.AstFunctionContents actual = ((FunctionTypeBuilder.AstFunctionContents) getFunctionAnalysisResultsMethod.invoke(typedScopeCreator, getFunctionAnalysisResultsMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#getFunctionAnalysisResults(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n == null): False}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return functionAnalysisResults.get(n);}
 *  */
    @Test
    public void testGetFunctionAnalysisResults_NNotEqualsNull() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        LinkedHashMap functionAnalysisResults = new LinkedHashMap();
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "functionAnalysisResults", functionAnalysisResults);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getFunctionAnalysisResultsMethod = typedScopeCreatorClazz.getDeclaredMethod("getFunctionAnalysisResults", numberNodeType);
        getFunctionAnalysisResultsMethod.setAccessible(true);
        java.lang.Object[] getFunctionAnalysisResultsMethodArguments = new java.lang.Object[1];
        getFunctionAnalysisResultsMethodArguments[0] = numberNode;
        FunctionTypeBuilder.AstFunctionContents actual = ((FunctionTypeBuilder.AstFunctionContents) getFunctionAnalysisResultsMethod.invoke(typedScopeCreator, getFunctionAnalysisResultsMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFunctionAnalysisResults(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#getFunctionAnalysisResults(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n == null): False}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return functionAnalysisResults.get(n);
 *  */
    @Test
    public void testGetFunctionAnalysisResults_ThrowNullPointerException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.getFunctionAnalysisResults] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.getFunctionAnalysisResults(TypedScopeCreator.java:2020) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getFunctionAnalysisResultsMethod = typedScopeCreatorClazz.getDeclaredMethod("getFunctionAnalysisResults", numberNodeType);
        getFunctionAnalysisResultsMethod.setAccessible(true);
        java.lang.Object[] getFunctionAnalysisResultsMethodArguments = new java.lang.Object[1];
        getFunctionAnalysisResultsMethodArguments[0] = numberNode;
        try {
            getFunctionAnalysisResultsMethod.invoke(typedScopeCreator, getFunctionAnalysisResultsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method declareNativeFunctionType(com.google.javascript.jscomp.Scope, com.google.javascript.rhino.jstype.JSTypeNative)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeFunctionType(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: FunctionType t = typeRegistry.getNativeFunctionType(tId);
 *  */
    @Test
    public void testDeclareNativeFunctionType_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:886)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeFunctionType(JSTypeRegistry.java:894)
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType(TypedScopeCreator.java:327) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = ((Object) null);
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeFunctionType(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: FunctionType t = typeRegistry.getNativeFunctionType(tId);
 *  */
    @Test
    public void testDeclareNativeFunctionType_ThrowClassCastException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[9];
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        nativeTypes[0] = ((JSType) parameterizedType);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        nativeTypes[1] = ((JSType) enumElementType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.ParameterizedType cannot be cast to class com.google.javascript.rhino.jstype.FunctionType (com.google.javascript.rhino.jstype.ParameterizedType and com.google.javascript.rhino.jstype.FunctionType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @2df97f40)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeFunctionType(JSTypeRegistry.java:894)
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType(TypedScopeCreator.java:327) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = ((Object) null);
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeFunctionType(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: declareNativeType(scope, t.getInstanceType().getReferenceName(), t);
 *  */
    @Test
    public void testDeclareNativeFunctionType_ThrowNullPointerException_1() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType(TypedScopeCreator.java:328) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = ((Object) null);
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeFunctionType(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: declareNativeType(scope, t.getInstanceType().getReferenceName(), t);
 *  */
    @Test
    public void testDeclareNativeFunctionType_ThrowNullPointerException_2() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[9];
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        nativeTypes[0] = ((JSType) noResolvedType);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        nativeTypes[1] = ((JSType) enumElementType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType(TypedScopeCreator.java:328) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = ((Object) null);
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeFunctionType(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: declareNativeType(scope, t.getInstanceType().getReferenceName(), t);
 *  */
    @Test
    public void testDeclareNativeFunctionType_ThrowNullPointerException_3() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[17];
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        Object typeOfThis = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        String className = "";
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        nativeTypes[0] = ((JSType) errorFunctionType);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        nativeTypes[1] = ((JSType) enumElementType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeType(TypedScopeCreator.java:339)
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType(TypedScopeCreator.java:328) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = ((Object) null);
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeFunctionType(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: declareNativeType(scope, t.getInstanceType().getReferenceName(), t);
 *  */
    @Test
    public void testDeclareNativeFunctionType_ThrowNullPointerException_4() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[17];
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        nativeTypes[0] = ((JSType) noResolvedType);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        nativeTypes[1] = ((JSType) enumElementType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeType(TypedScopeCreator.java:339)
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType(TypedScopeCreator.java:328) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = ((Object) null);
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeFunctionType(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: declareNativeType(scope, t.getInstanceType().getReferenceName(), t);
 *  */
    @Test
    public void testDeclareNativeFunctionType_ThrowNullPointerException_5() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[9];
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        Object typeOfThis = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        nativeTypes[0] = ((JSType) anonymousFunctionType);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        nativeTypes[1] = ((JSType) enumElementType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeType(TypedScopeCreator.java:339)
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType(TypedScopeCreator.java:328) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = ((Object) null);
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeFunctionType(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FunctionType t = typeRegistry.getNativeFunctionType(tId);
 *  */
    @Test
    public void testDeclareNativeFunctionType_ThrowNullPointerException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType(TypedScopeCreator.java:327) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = ((Object) null);
        declareNativeFunctionTypeMethodArguments[1] = ((Object) null);
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method declareNativeFunctionType(com.google.javascript.jscomp.Scope, com.google.javascript.rhino.jstype.JSTypeNative)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeFunctionType(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: declareNativeType(scope, t.getInstanceType().getReferenceName(), t);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeclareNativeFunctionType_ThrowIllegalStateException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[17];
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        nativeTypes[0] = ((JSType) noResolvedType);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        nativeTypes[1] = ((JSType) enumElementType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = ((Object) null);
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeFunctionType(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: declareNativeType(scope, t.getInstanceType().getReferenceName(), t);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeclareNativeFunctionType_ThrowIllegalStateException_1() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[17];
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        nativeTypes[0] = ((JSType) anonymousFunctionType);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        nativeTypes[1] = ((JSType) enumElementType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = scope;
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeFunctionType(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: declareNativeType(scope, t.getInstanceType().getReferenceName(), t);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeclareNativeFunctionType_ThrowIllegalStateException_2() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[9];
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        Object typeOfThis = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        String className = "";
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        nativeTypes[0] = ((JSType) errorFunctionType);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        nativeTypes[1] = ((JSType) enumElementType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeFunctionTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeFunctionType", scopeType, jSTypeNativeType);
        declareNativeFunctionTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeFunctionTypeMethodArguments = new java.lang.Object[2];
        declareNativeFunctionTypeMethodArguments[0] = scope;
        declareNativeFunctionTypeMethodArguments[1] = jSTypeNative;
        try {
            declareNativeFunctionTypeMethod.invoke(typedScopeCreator, declareNativeFunctionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypedScopeCreator.declareNativeValueType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method declareNativeValueType(com.google.javascript.jscomp.Scope, java.lang.String, com.google.javascript.rhino.jstype.JSTypeNative)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeValueType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: declareNativeType(scope, name, typeRegistry.getNativeType(tId));
 *  */
    @Test
    public void testDeclareNativeValueType_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeValueType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:886)
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeValueType(TypedScopeCreator.java:335) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeValueTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeValueType", scopeType, stringType, jSTypeNativeType);
        declareNativeValueTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeValueTypeMethodArguments = new java.lang.Object[3];
        declareNativeValueTypeMethodArguments[0] = ((Object) null);
        declareNativeValueTypeMethodArguments[1] = ((Object) null);
        declareNativeValueTypeMethodArguments[2] = jSTypeNative;
        try {
            declareNativeValueTypeMethod.invoke(typedScopeCreator, declareNativeValueTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeValueType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.invokes com.google.javascript.jscomp.TypedScopeCreator#declareNativeType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSType)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: declareNativeType(scope, name, typeRegistry.getNativeType(tId));
 *  */
    @Test
    public void testDeclareNativeValueType_ThrowNullPointerException_1() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeValueType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeType(TypedScopeCreator.java:339)
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeValueType(TypedScopeCreator.java:335) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeValueTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeValueType", scopeType, stringType, jSTypeNativeType);
        declareNativeValueTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeValueTypeMethodArguments = new java.lang.Object[3];
        declareNativeValueTypeMethodArguments[0] = ((Object) null);
        declareNativeValueTypeMethodArguments[1] = ((Object) null);
        declareNativeValueTypeMethodArguments[2] = jSTypeNative;
        try {
            declareNativeValueTypeMethod.invoke(typedScopeCreator, declareNativeValueTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeValueType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: declareNativeType(scope, name, typeRegistry.getNativeType(tId));
 *  */
    @Test
    public void testDeclareNativeValueType_ThrowNullPointerException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeValueType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeValueType(TypedScopeCreator.java:335) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeValueTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeValueType", scopeType, stringType, jSTypeNativeType);
        declareNativeValueTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeValueTypeMethodArguments = new java.lang.Object[3];
        declareNativeValueTypeMethodArguments[0] = ((Object) null);
        declareNativeValueTypeMethodArguments[1] = ((Object) null);
        declareNativeValueTypeMethodArguments[2] = ((Object) null);
        try {
            declareNativeValueTypeMethod.invoke(typedScopeCreator, declareNativeValueTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method declareNativeValueType(com.google.javascript.jscomp.Scope, java.lang.String, com.google.javascript.rhino.jstype.JSTypeNative)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeValueType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: declareNativeType(scope, name, typeRegistry.getNativeType(tId));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeclareNativeValueType_ThrowIllegalStateException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_FUNCTION_TYPE;
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeValueTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeValueType", scopeType, stringType, jSTypeNativeType);
        declareNativeValueTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeValueTypeMethodArguments = new java.lang.Object[3];
        declareNativeValueTypeMethodArguments[0] = scope;
        declareNativeValueTypeMethodArguments[1] = ((Object) null);
        declareNativeValueTypeMethodArguments[2] = jSTypeNative;
        try {
            declareNativeValueTypeMethod.invoke(typedScopeCreator, declareNativeValueTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeValueType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: declareNativeType(scope, name, typeRegistry.getNativeType(tId));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeclareNativeValueType_ThrowIllegalStateException_1() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        String string = "";
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method declareNativeValueTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeValueType", scopeType, stringType, jSTypeNativeType);
        declareNativeValueTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeValueTypeMethodArguments = new java.lang.Object[3];
        declareNativeValueTypeMethodArguments[0] = scope;
        declareNativeValueTypeMethodArguments[1] = string;
        declareNativeValueTypeMethodArguments[2] = jSTypeNative;
        try {
            declareNativeValueTypeMethod.invoke(typedScopeCreator, declareNativeValueTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypedScopeCreator.createScope
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createScope(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (parent == null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: process
 *  */
    @Test
    public void testCreateScope_ThrowNullPointerException() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:201) */
        typedScopeCreator.createScope(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createScope(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: newScope = new Scope(parent, root);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateScope_ThrowIllegalArgumentException() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        
        typedScopeCreator.createScope(null, scope);
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (parent == null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.jscomp.TypedScopeCreator.FirstOrderFunctionAnalyzer#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: process
 *  */
    @Test(expected = NullPointerException.class)
    public void testCreateScope_ThrowNullPointerException_1() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "compiler", compiler);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method createScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("createScope", numberNodeType, scopeType);
        createScopeMethod.setAccessible(true);
        java.lang.Object[] createScopeMethodArguments = new java.lang.Object[2];
        createScopeMethodArguments[0] = numberNode;
        createScopeMethodArguments[1] = ((Object) null);
        try {
            createScopeMethod.invoke(typedScopeCreator, createScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createScope(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)
    
    @Test(expected = StackOverflowError.class)
    public void testCreateScope1() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ParameterizedType typeOfThis = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(typeOfThis, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", typeOfThis);
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(numberNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method createScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("createScope", numberNodeType, scopeType);
        createScopeMethod.setAccessible(true);
        java.lang.Object[] createScopeMethodArguments = new java.lang.Object[2];
        createScopeMethodArguments[0] = numberNode;
        createScopeMethodArguments[1] = scope;
        try {
            createScopeMethod.invoke(typedScopeCreator, createScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateScope2() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(numberNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "depth", -3);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.getFunctionAnalysisResults(TypedScopeCreator.java:2020)
            com.google.javascript.jscomp.TypedScopeCreator.access$800(TypedScopeCreator.java:95)
            com.google.javascript.jscomp.TypedScopeCreator$LocalScopeBuilder.build(TypedScopeCreator.java:1862)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:213) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method createScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("createScope", numberNodeType, scopeType);
        createScopeMethod.setAccessible(true);
        java.lang.Object[] createScopeMethodArguments = new java.lang.Object[2];
        createScopeMethodArguments[0] = numberNode;
        createScopeMethodArguments[1] = scope;
        try {
            createScopeMethod.invoke(typedScopeCreator, createScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateScope3() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverseRoots(NodeTraversal.java:309)
            com.google.javascript.jscomp.NodeTraversal.traverseRoots(NodeTraversal.java:464)
            com.google.javascript.jscomp.TypedScopeCreator$FirstOrderFunctionAnalyzer.process(TypedScopeCreator.java:1958)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:201) */
        typedScopeCreator.createScope(node, null);
    }
    
    @Test
    public void testCreateScope4() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object jsType = createInstance("com.google.javascript.rhino.jstype.NamedType");
        setField(numberNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createScope] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.toMaybeFunctionType(ProxyObjectType.java:208)
            com.google.javascript.rhino.jstype.JSType.isFunctionType(JSType.java:267)
            com.google.javascript.jscomp.Scope.<init>(Scope.java:397)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:210) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method createScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("createScope", numberNodeType, scopeType);
        createScopeMethod.setAccessible(true);
        java.lang.Object[] createScopeMethodArguments = new java.lang.Object[2];
        createScopeMethodArguments[0] = numberNode;
        createScopeMethodArguments[1] = scope;
        try {
            createScopeMethod.invoke(typedScopeCreator, createScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateScope5() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ParameterizedType typeOfThis = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NoType referencedType3 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(numberNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "depth", -3);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.getFunctionAnalysisResults(TypedScopeCreator.java:2020)
            com.google.javascript.jscomp.TypedScopeCreator.access$800(TypedScopeCreator.java:95)
            com.google.javascript.jscomp.TypedScopeCreator$LocalScopeBuilder.build(TypedScopeCreator.java:1862)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:213) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method createScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("createScope", numberNodeType, scopeType);
        createScopeMethod.setAccessible(true);
        java.lang.Object[] createScopeMethodArguments = new java.lang.Object[2];
        createScopeMethodArguments[0] = numberNode;
        createScopeMethodArguments[1] = scope;
        try {
            createScopeMethod.invoke(typedScopeCreator, createScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateScope6() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "depth", -3);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.getFunctionAnalysisResults(TypedScopeCreator.java:2020)
            com.google.javascript.jscomp.TypedScopeCreator.access$800(TypedScopeCreator.java:95)
            com.google.javascript.jscomp.TypedScopeCreator$LocalScopeBuilder.build(TypedScopeCreator.java:1862)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:213) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method createScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("createScope", numberNodeType, scopeType);
        createScopeMethod.setAccessible(true);
        java.lang.Object[] createScopeMethodArguments = new java.lang.Object[2];
        createScopeMethodArguments[0] = numberNode;
        createScopeMethodArguments[1] = scope;
        try {
            createScopeMethod.invoke(typedScopeCreator, createScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateScope7() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope.<init>(Scope.java:414)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:300)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:204) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method createScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("createScope", numberNodeType, scopeType);
        createScopeMethod.setAccessible(true);
        java.lang.Object[] createScopeMethodArguments = new java.lang.Object[2];
        createScopeMethodArguments[0] = numberNode;
        createScopeMethodArguments[1] = ((Object) null);
        try {
            createScopeMethod.invoke(typedScopeCreator, createScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateScope8() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.TypedScopeCreator$FirstOrderFunctionAnalyzer.process(TypedScopeCreator.java:1956)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:201) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method createScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("createScope", numberNodeType, scopeType);
        createScopeMethod.setAccessible(true);
        java.lang.Object[] createScopeMethodArguments = new java.lang.Object[2];
        createScopeMethodArguments[0] = numberNode;
        createScopeMethodArguments[1] = ((Object) null);
        try {
            createScopeMethod.invoke(typedScopeCreator, createScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypedScopeCreator.createInitialScope
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createInitialScope(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#createInitialScope(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCreateInitialScope_ThrowNullPointerException() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createInitialScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:297) */
        typedScopeCreator.createInitialScope(null);
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#createInitialScope(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCreateInitialScope_ThrowNullPointerException_1() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createInitialScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:297) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method createInitialScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("createInitialScope", numberNodeType);
        createInitialScopeMethod.setAccessible(true);
        java.lang.Object[] createInitialScopeMethodArguments = new java.lang.Object[1];
        createInitialScopeMethodArguments[0] = numberNode;
        try {
            createInitialScopeMethod.invoke(typedScopeCreator, createInitialScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#createInitialScope(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCreateInitialScope_ThrowNullPointerException_2() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        short[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createInitialScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:297) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method createInitialScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("createInitialScope", numberNodeType);
        createInitialScopeMethod.setAccessible(true);
        java.lang.Object[] createInitialScopeMethodArguments = new java.lang.Object[1];
        createInitialScopeMethodArguments[0] = numberNode;
        try {
            createInitialScopeMethod.invoke(typedScopeCreator, createInitialScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#createInitialScope(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCreateInitialScope_ThrowNullPointerException_3() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createInitialScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:297) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method createInitialScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("createInitialScope", numberNodeType);
        createInitialScopeMethod.setAccessible(true);
        java.lang.Object[] createInitialScopeMethodArguments = new java.lang.Object[1];
        createInitialScopeMethodArguments[0] = numberNode;
        try {
            createInitialScopeMethod.invoke(typedScopeCreator, createInitialScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createInitialScope(com.google.javascript.rhino.Node)
    
    @Test
    public void testCreateInitialScope1() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createInitialScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope.<init>(Scope.java:414)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:300) */
        typedScopeCreator.createInitialScope(node);
    }
    
    @Test
    public void testCreateInitialScope2() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(132);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createInitialScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope.<init>(Scope.java:414)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:300) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method createInitialScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("createInitialScope", numberNodeType);
        createInitialScopeMethod.setAccessible(true);
        java.lang.Object[] createInitialScopeMethodArguments = new java.lang.Object[1];
        createInitialScopeMethodArguments[0] = numberNode;
        try {
            createInitialScopeMethod.invoke(typedScopeCreator, createInitialScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateInitialScope3() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createInitialScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:297) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method createInitialScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("createInitialScope", numberNodeType);
        createInitialScopeMethod.setAccessible(true);
        java.lang.Object[] createInitialScopeMethodArguments = new java.lang.Object[1];
        createInitialScopeMethodArguments[0] = numberNode;
        try {
            createInitialScopeMethod.invoke(typedScopeCreator, createInitialScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method createInitialScope(com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testCreateInitialScope4() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method createInitialScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("createInitialScope", numberNodeType);
        createInitialScopeMethod.setAccessible(true);
        java.lang.Object[] createInitialScopeMethodArguments = new java.lang.Object[1];
        createInitialScopeMethodArguments[0] = numberNode;
        try {
            createInitialScopeMethod.invoke(typedScopeCreator, createInitialScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypedScopeCreator.declareNativeType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method declareNativeType(com.google.javascript.jscomp.Scope, java.lang.String, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#declare(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean)}
 *  */
    @Test
    public void testDeclareNativeType_ScopeDeclare() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        String string = " ";
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method declareNativeTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeType", scopeType, stringType, jSTypeType);
        declareNativeTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeTypeMethodArguments = new java.lang.Object[3];
        declareNativeTypeMethodArguments[0] = scope;
        declareNativeTypeMethodArguments[1] = string;
        declareNativeTypeMethodArguments[2] = ((Object) null);
        declareNativeTypeMethod.invoke(typedScopeCreator, declareNativeTypeMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method declareNativeType(com.google.javascript.jscomp.Scope, java.lang.String, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#declare(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scope.declare(name, null, t, null, false);
 *  */
    @Test
    public void testDeclareNativeType_ThrowNullPointerException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeType(TypedScopeCreator.java:339) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method declareNativeTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeType", scopeType, stringType, jSTypeType);
        declareNativeTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeTypeMethodArguments = new java.lang.Object[3];
        declareNativeTypeMethodArguments[0] = ((Object) null);
        declareNativeTypeMethodArguments[1] = ((Object) null);
        declareNativeTypeMethodArguments[2] = ((Object) null);
        try {
            declareNativeTypeMethod.invoke(typedScopeCreator, declareNativeTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method declareNativeType(com.google.javascript.jscomp.Scope, java.lang.String, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: scope.declare(name, null, t, null, false);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeclareNativeType_ThrowIllegalStateException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method declareNativeTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeType", scopeType, stringType, jSTypeType);
        declareNativeTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeTypeMethodArguments = new java.lang.Object[3];
        declareNativeTypeMethodArguments[0] = scope;
        declareNativeTypeMethodArguments[1] = ((Object) null);
        declareNativeTypeMethodArguments[2] = ((Object) null);
        try {
            declareNativeTypeMethod.invoke(typedScopeCreator, declareNativeTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: scope.declare(name, null, t, null, false);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeclareNativeType_ThrowIllegalStateException_1() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        String string = "";
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method declareNativeTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeType", scopeType, stringType, jSTypeType);
        declareNativeTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeTypeMethodArguments = new java.lang.Object[3];
        declareNativeTypeMethodArguments[0] = scope;
        declareNativeTypeMethodArguments[1] = string;
        declareNativeTypeMethodArguments[2] = ((Object) null);
        try {
            declareNativeTypeMethod.invoke(typedScopeCreator, declareNativeTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#declareNativeType(com.google.javascript.jscomp.Scope,java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: scope.declare(name, null, t, null, false);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeclareNativeType_ThrowIllegalStateException_2() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        String string = " ";
        Scope.Arguments arguments = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        vars.put(string, arguments);
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method declareNativeTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("declareNativeType", scopeType, stringType, jSTypeType);
        declareNativeTypeMethod.setAccessible(true);
        java.lang.Object[] declareNativeTypeMethodArguments = new java.lang.Object[3];
        declareNativeTypeMethodArguments[0] = scope;
        declareNativeTypeMethodArguments[1] = string;
        declareNativeTypeMethodArguments[2] = ((Object) null);
        try {
            declareNativeTypeMethod.invoke(typedScopeCreator, declareNativeTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypedScopeCreator.patchGlobalScope
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method patchGlobalScope(com.google.javascript.jscomp.Scope, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#patchGlobalScope(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: String scriptName = NodeUtil.getSourceName(scriptRoot);
 *  */
    @Test
    public void testPatchGlobalScope_ThrowClassCastException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        byte[] objectValue = {};
        setField(next, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.patchGlobalScope] produces [java.lang.ClassCastException: class [B cannot be cast to class com.google.javascript.rhino.jstype.StaticSourceFile ([B is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.jstype.StaticSourceFile is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @2df97f40)]
            com.google.javascript.rhino.Node.getStaticSourceFile(Node.java:1110)
            com.google.javascript.rhino.Node.getSourceFileName(Node.java:1104)
            com.google.javascript.jscomp.NodeUtil.getSourceName(NodeUtil.java:2844)
            com.google.javascript.jscomp.TypedScopeCreator.patchGlobalScope(TypedScopeCreator.java:256) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method patchGlobalScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("patchGlobalScope", scopeType, numberNodeType);
        patchGlobalScopeMethod.setAccessible(true);
        java.lang.Object[] patchGlobalScopeMethodArguments = new java.lang.Object[2];
        patchGlobalScopeMethodArguments[0] = scope;
        patchGlobalScopeMethodArguments[1] = numberNode;
        try {
            patchGlobalScopeMethod.invoke(typedScopeCreator, patchGlobalScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#patchGlobalScope(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isScript()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(scriptRoot.isScript());
 *  */
    @Test
    public void testPatchGlobalScope_ThrowNullPointerException() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.patchGlobalScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.patchGlobalScope(TypedScopeCreator.java:252) */
        typedScopeCreator.patchGlobalScope(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#patchGlobalScope(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkNotNull(java.lang.Object)}
 * @utbot.invokes {@link java.util.Map#keySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node node: ImmutableList.copyOf(functionAnalysisResults.keySet()))
 *  */
    @Test
    public void testPatchGlobalScope_ThrowNullPointerException_1() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        SourceFile.OnDisk objectValue = ((SourceFile.OnDisk) createInstance("com.google.javascript.jscomp.SourceFile$OnDisk"));
        String fileName = "";
        setField(objectValue, "com.google.javascript.jscomp.SourceFile", "fileName", fileName);
        setField(next, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.patchGlobalScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.patchGlobalScope(TypedScopeCreator.java:258) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method patchGlobalScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("patchGlobalScope", scopeType, numberNodeType);
        patchGlobalScopeMethod.setAccessible(true);
        java.lang.Object[] patchGlobalScopeMethodArguments = new java.lang.Object[2];
        patchGlobalScopeMethodArguments[0] = scope;
        patchGlobalScopeMethodArguments[1] = numberNode;
        try {
            patchGlobalScopeMethod.invoke(typedScopeCreator, patchGlobalScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method patchGlobalScope(com.google.javascript.jscomp.Scope, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#patchGlobalScope(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(scriptRoot.isScript());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testPatchGlobalScope_ThrowIllegalStateException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method patchGlobalScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("patchGlobalScope", scopeType, numberNodeType);
        patchGlobalScopeMethod.setAccessible(true);
        java.lang.Object[] patchGlobalScopeMethodArguments = new java.lang.Object[2];
        patchGlobalScopeMethodArguments[0] = ((Object) null);
        patchGlobalScopeMethodArguments[1] = numberNode;
        try {
            patchGlobalScopeMethod.invoke(typedScopeCreator, patchGlobalScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#patchGlobalScope(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(globalScope.isGlobal());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testPatchGlobalScope_ThrowIllegalStateException_1() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method patchGlobalScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("patchGlobalScope", scopeType, numberNodeType);
        patchGlobalScopeMethod.setAccessible(true);
        java.lang.Object[] patchGlobalScopeMethodArguments = new java.lang.Object[2];
        patchGlobalScopeMethodArguments[0] = scope;
        patchGlobalScopeMethodArguments[1] = numberNode;
        try {
            patchGlobalScopeMethod.invoke(typedScopeCreator, patchGlobalScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#patchGlobalScope(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String scriptName = NodeUtil.getSourceName(scriptRoot);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testPatchGlobalScope_ThrowUnsupportedOperationException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method patchGlobalScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("patchGlobalScope", scopeType, numberNodeType);
        patchGlobalScopeMethod.setAccessible(true);
        java.lang.Object[] patchGlobalScopeMethodArguments = new java.lang.Object[2];
        patchGlobalScopeMethodArguments[0] = scope;
        patchGlobalScopeMethodArguments[1] = numberNode;
        try {
            patchGlobalScopeMethod.invoke(typedScopeCreator, patchGlobalScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#patchGlobalScope(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkNotNull(globalScope);
 *  */
    @Test(expected = NullPointerException.class)
    public void testPatchGlobalScope_ThrowNullPointerException_2() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method patchGlobalScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("patchGlobalScope", scopeType, numberNodeType);
        patchGlobalScopeMethod.setAccessible(true);
        java.lang.Object[] patchGlobalScopeMethodArguments = new java.lang.Object[2];
        patchGlobalScopeMethodArguments[0] = ((Object) null);
        patchGlobalScopeMethodArguments[1] = numberNode;
        try {
            patchGlobalScopeMethod.invoke(typedScopeCreator, patchGlobalScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#patchGlobalScope(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkNotNull(scriptName);
 *  */
    @Test(expected = NullPointerException.class)
    public void testPatchGlobalScope_ThrowNullPointerException_3() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method patchGlobalScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("patchGlobalScope", scopeType, numberNodeType);
        patchGlobalScopeMethod.setAccessible(true);
        java.lang.Object[] patchGlobalScopeMethodArguments = new java.lang.Object[2];
        patchGlobalScopeMethodArguments[0] = scope;
        patchGlobalScopeMethodArguments[1] = numberNode;
        try {
            patchGlobalScopeMethod.invoke(typedScopeCreator, patchGlobalScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#patchGlobalScope(com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkNotNull(scriptName);
 *  */
    @Test(expected = NullPointerException.class)
    public void testPatchGlobalScope_ThrowNullPointerException_4() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        SimpleSourceFile objectValue = ((SimpleSourceFile) createInstance("com.google.javascript.rhino.jstype.SimpleSourceFile"));
        setField(next, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method patchGlobalScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("patchGlobalScope", scopeType, stringNodeType);
        patchGlobalScopeMethod.setAccessible(true);
        java.lang.Object[] patchGlobalScopeMethodArguments = new java.lang.Object[2];
        patchGlobalScopeMethodArguments[0] = scope;
        patchGlobalScopeMethodArguments[1] = stringNode;
        try {
            patchGlobalScopeMethod.invoke(typedScopeCreator, patchGlobalScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypedScopeCreator.getNativeType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.returnsFrom {@code return typeRegistry.getNativeType(nativeType);}
 *  */
    @Test
    public void testGetNativeType_JSTypeRegistryGetNativeType() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method getNativeTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("getNativeType", jSTypeNativeType);
        getNativeTypeMethod.setAccessible(true);
        java.lang.Object[] getNativeTypeMethodArguments = new java.lang.Object[1];
        getNativeTypeMethodArguments[0] = jSTypeNative;
        JSType actual = ((JSType) getNativeTypeMethod.invoke(typedScopeCreator, getNativeTypeMethodArguments));
        
        assertNull(actual);
        
        JSTypeRegistry typedScopeCreatorTypeRegistry = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes0 = ((JSType) get(typedScopeCreatorTypeRegistryTypeRegistryNativeTypes, 0));
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return typeRegistry.getNativeType(nativeType);
 *  */
    @Test
    public void testGetNativeType_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ERROR_FUNCTION_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.getNativeType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:886)
            com.google.javascript.jscomp.TypedScopeCreator.getNativeType(TypedScopeCreator.java:391) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method getNativeTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("getNativeType", jSTypeNativeType);
        getNativeTypeMethod.setAccessible(true);
        java.lang.Object[] getNativeTypeMethodArguments = new java.lang.Object[1];
        getNativeTypeMethodArguments[0] = jSTypeNative;
        try {
            getNativeTypeMethod.invoke(typedScopeCreator, getNativeTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return typeRegistry.getNativeType(nativeType);
 *  */
    @Test
    public void testGetNativeType_ThrowNullPointerException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.getNativeType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.getNativeType(TypedScopeCreator.java:391) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method getNativeTypeMethod = typedScopeCreatorClazz.getDeclaredMethod("getNativeType", jSTypeNativeType);
        getNativeTypeMethod.setAccessible(true);
        java.lang.Object[] getNativeTypeMethodArguments = new java.lang.Object[1];
        getNativeTypeMethodArguments[0] = ((Object) null);
        try {
            getNativeTypeMethod.invoke(typedScopeCreator, getNativeTypeMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields883356652690000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields883356652690000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass883356652696500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields883356652690000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass883356652696500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields883356653249800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields883356653249800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass883356653252800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields883356653249800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass883356653252800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

