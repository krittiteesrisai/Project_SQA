package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.ScriptOrFnNode;
import java.lang.reflect.Method;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.UnionType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.NumberType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import java.util.LinkedHashMap;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.jstype.FunctionType;
import java.lang.reflect.InvocationTargetException;
import com.google.javascript.rhino.jstype.BooleanType;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;

public final class com_google_javascript_jscomp_TypedScopeCreatorTest {
    ///region Test suites for executable com.google.javascript.jscomp.TypedScopeCreator.attachLiteralTypes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method attachLiteralTypes(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#attachLiteralTypes(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 *  */
    @Test
    public void testAttachLiteralTypes_SwitchNGetTypeCasedefault() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method attachLiteralTypesMethod = typedScopeCreatorClazz.getDeclaredMethod("attachLiteralTypes", scriptOrFnNodeType);
        attachLiteralTypesMethod.setAccessible(true);
        java.lang.Object[] attachLiteralTypesMethodArguments = new java.lang.Object[1];
        attachLiteralTypesMethodArguments[0] = scriptOrFnNode;
        attachLiteralTypesMethod.invoke(typedScopeCreator, attachLiteralTypesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#attachLiteralTypes(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getJSType() == null): False}
 *  */
    @Test
    public void testAttachLiteralTypes_NGetJSTypeNotEqualsNull() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(64);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method attachLiteralTypesMethod = typedScopeCreatorClazz.getDeclaredMethod("attachLiteralTypes", scriptOrFnNodeType);
        attachLiteralTypesMethod.setAccessible(true);
        java.lang.Object[] attachLiteralTypesMethodArguments = new java.lang.Object[1];
        attachLiteralTypesMethodArguments[0] = scriptOrFnNode;
        attachLiteralTypesMethod.invoke(typedScopeCreator, attachLiteralTypesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#attachLiteralTypes(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getJSType() == null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#createAnonymousObjectType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#setJSType(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testAttachLiteralTypes_NGetJSTypeEqualsNull() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(64);
        
        JSType initialFunctionNodeJsType = ((JSType) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "jsType"));
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method attachLiteralTypesMethod = typedScopeCreatorClazz.getDeclaredMethod("attachLiteralTypes", functionNodeType);
        attachLiteralTypesMethod.setAccessible(true);
        java.lang.Object[] attachLiteralTypesMethodArguments = new java.lang.Object[1];
        attachLiteralTypesMethodArguments[0] = functionNode;
        attachLiteralTypesMethod.invoke(typedScopeCreator, attachLiteralTypesMethodArguments);
        
        JSTypeRegistry typedScopeCreatorTypeRegistry = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes0 = ((JSType) get(typedScopeCreatorTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typedScopeCreatorTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes1 = ((JSType) get(typedScopeCreatorTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry typedScopeCreatorTypeRegistry2 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes2 = ((JSType) get(typedScopeCreatorTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry typedScopeCreatorTypeRegistry3 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes3 = ((JSType) get(typedScopeCreatorTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry typedScopeCreatorTypeRegistry4 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes4 = ((JSType) get(typedScopeCreatorTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry typedScopeCreatorTypeRegistry5 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes5 = ((JSType) get(typedScopeCreatorTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry typedScopeCreatorTypeRegistry6 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes6 = ((JSType) get(typedScopeCreatorTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry typedScopeCreatorTypeRegistry7 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes7 = ((JSType) get(typedScopeCreatorTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry typedScopeCreatorTypeRegistry8 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes8 = ((JSType) get(typedScopeCreatorTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry typedScopeCreatorTypeRegistry9 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes9 = ((JSType) get(typedScopeCreatorTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry typedScopeCreatorTypeRegistry10 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes10 = ((JSType) get(typedScopeCreatorTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry typedScopeCreatorTypeRegistry11 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes11 = ((JSType) get(typedScopeCreatorTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry typedScopeCreatorTypeRegistry12 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes12 = ((JSType) get(typedScopeCreatorTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry typedScopeCreatorTypeRegistry13 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes13 = ((JSType) get(typedScopeCreatorTypeRegistry13TypeRegistryNativeTypes, 13));
        JSTypeRegistry typedScopeCreatorTypeRegistry14 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes14 = ((JSType) get(typedScopeCreatorTypeRegistry14TypeRegistryNativeTypes, 14));
        JSTypeRegistry typedScopeCreatorTypeRegistry15 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes15 = ((JSType) get(typedScopeCreatorTypeRegistry15TypeRegistryNativeTypes, 15));
        JSTypeRegistry typedScopeCreatorTypeRegistry16 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes16 = ((JSType) get(typedScopeCreatorTypeRegistry16TypeRegistryNativeTypes, 16));
        JSTypeRegistry typedScopeCreatorTypeRegistry17 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes17 = ((JSType) get(typedScopeCreatorTypeRegistry17TypeRegistryNativeTypes, 17));
        JSTypeRegistry typedScopeCreatorTypeRegistry18 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes18 = ((JSType) get(typedScopeCreatorTypeRegistry18TypeRegistryNativeTypes, 18));
        JSTypeRegistry typedScopeCreatorTypeRegistry19 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes19 = ((JSType) get(typedScopeCreatorTypeRegistry19TypeRegistryNativeTypes, 19));
        JSTypeRegistry typedScopeCreatorTypeRegistry20 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes20 = ((JSType) get(typedScopeCreatorTypeRegistry20TypeRegistryNativeTypes, 20));
        JSTypeRegistry typedScopeCreatorTypeRegistry21 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes21 = ((JSType) get(typedScopeCreatorTypeRegistry21TypeRegistryNativeTypes, 21));
        JSTypeRegistry typedScopeCreatorTypeRegistry22 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes22 = ((JSType) get(typedScopeCreatorTypeRegistry22TypeRegistryNativeTypes, 22));
        JSTypeRegistry typedScopeCreatorTypeRegistry23 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes23 = ((JSType) get(typedScopeCreatorTypeRegistry23TypeRegistryNativeTypes, 23));
        JSTypeRegistry typedScopeCreatorTypeRegistry24 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes24 = ((JSType) get(typedScopeCreatorTypeRegistry24TypeRegistryNativeTypes, 24));
        
        JSType finalFunctionNodeJsType = ((JSType) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "jsType"));
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes0);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes1);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes2);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes3);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes4);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes5);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes6);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes7);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes8);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes9);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes10);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes11);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes12);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes13);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes14);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes15);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes16);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes17);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes18);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes19);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes20);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes21);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes22);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes23);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes24);
        
        assertFalse(initialFunctionNodeJsType == finalFunctionNodeJsType);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method attachLiteralTypes(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#attachLiteralTypes(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.TypedScopeCreator#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
 * @utbot.invokes {@link com.google.javascript.rhino.Node#setJSType(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 *  */
    @Test
    public void testAttachLiteralTypes_NodeSetJSType_3() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[27];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        Node node = new Node(47);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method attachLiteralTypesMethod = typedScopeCreatorClazz.getDeclaredMethod("attachLiteralTypes", nodeType);
        attachLiteralTypesMethod.setAccessible(true);
        java.lang.Object[] attachLiteralTypesMethodArguments = new java.lang.Object[1];
        attachLiteralTypesMethodArguments[0] = node;
        attachLiteralTypesMethod.invoke(typedScopeCreator, attachLiteralTypesMethodArguments);
        
        JSTypeRegistry typedScopeCreatorTypeRegistry = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes0 = ((JSType) get(typedScopeCreatorTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typedScopeCreatorTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes1 = ((JSType) get(typedScopeCreatorTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry typedScopeCreatorTypeRegistry2 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes2 = ((JSType) get(typedScopeCreatorTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry typedScopeCreatorTypeRegistry3 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes3 = ((JSType) get(typedScopeCreatorTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry typedScopeCreatorTypeRegistry4 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes4 = ((JSType) get(typedScopeCreatorTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry typedScopeCreatorTypeRegistry5 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes5 = ((JSType) get(typedScopeCreatorTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry typedScopeCreatorTypeRegistry6 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes6 = ((JSType) get(typedScopeCreatorTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry typedScopeCreatorTypeRegistry7 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes7 = ((JSType) get(typedScopeCreatorTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry typedScopeCreatorTypeRegistry8 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes8 = ((JSType) get(typedScopeCreatorTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry typedScopeCreatorTypeRegistry9 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes9 = ((JSType) get(typedScopeCreatorTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry typedScopeCreatorTypeRegistry10 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes10 = ((JSType) get(typedScopeCreatorTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry typedScopeCreatorTypeRegistry11 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes11 = ((JSType) get(typedScopeCreatorTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry typedScopeCreatorTypeRegistry12 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes12 = ((JSType) get(typedScopeCreatorTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry typedScopeCreatorTypeRegistry13 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes13 = ((JSType) get(typedScopeCreatorTypeRegistry13TypeRegistryNativeTypes, 13));
        JSTypeRegistry typedScopeCreatorTypeRegistry14 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes14 = ((JSType) get(typedScopeCreatorTypeRegistry14TypeRegistryNativeTypes, 14));
        JSTypeRegistry typedScopeCreatorTypeRegistry15 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes15 = ((JSType) get(typedScopeCreatorTypeRegistry15TypeRegistryNativeTypes, 15));
        JSTypeRegistry typedScopeCreatorTypeRegistry16 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes16 = ((JSType) get(typedScopeCreatorTypeRegistry16TypeRegistryNativeTypes, 16));
        JSTypeRegistry typedScopeCreatorTypeRegistry17 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes17 = ((JSType) get(typedScopeCreatorTypeRegistry17TypeRegistryNativeTypes, 17));
        JSTypeRegistry typedScopeCreatorTypeRegistry18 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes18 = ((JSType) get(typedScopeCreatorTypeRegistry18TypeRegistryNativeTypes, 18));
        JSTypeRegistry typedScopeCreatorTypeRegistry19 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes19 = ((JSType) get(typedScopeCreatorTypeRegistry19TypeRegistryNativeTypes, 19));
        JSTypeRegistry typedScopeCreatorTypeRegistry20 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes20 = ((JSType) get(typedScopeCreatorTypeRegistry20TypeRegistryNativeTypes, 20));
        JSTypeRegistry typedScopeCreatorTypeRegistry21 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes21 = ((JSType) get(typedScopeCreatorTypeRegistry21TypeRegistryNativeTypes, 21));
        JSTypeRegistry typedScopeCreatorTypeRegistry22 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes22 = ((JSType) get(typedScopeCreatorTypeRegistry22TypeRegistryNativeTypes, 22));
        JSTypeRegistry typedScopeCreatorTypeRegistry23 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes23 = ((JSType) get(typedScopeCreatorTypeRegistry23TypeRegistryNativeTypes, 23));
        JSTypeRegistry typedScopeCreatorTypeRegistry24 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes24 = ((JSType) get(typedScopeCreatorTypeRegistry24TypeRegistryNativeTypes, 24));
        JSTypeRegistry typedScopeCreatorTypeRegistry25 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry25TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes25 = ((JSType) get(typedScopeCreatorTypeRegistry25TypeRegistryNativeTypes, 25));
        JSTypeRegistry typedScopeCreatorTypeRegistry26 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry26TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes26 = ((JSType) get(typedScopeCreatorTypeRegistry26TypeRegistryNativeTypes, 26));
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes0);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes1);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes2);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes3);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes4);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes5);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes6);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes7);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes8);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes9);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes10);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes11);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes12);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes13);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes14);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes15);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes16);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes17);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes18);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes19);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes20);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes21);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes22);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes23);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes24);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes25);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes26);
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#attachLiteralTypes(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.TypedScopeCreator#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
 * @utbot.invokes {@link com.google.javascript.rhino.Node#setJSType(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 *  */
    @Test
    public void testAttachLiteralTypes_NodeSetJSType() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(69);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method attachLiteralTypesMethod = typedScopeCreatorClazz.getDeclaredMethod("attachLiteralTypes", functionNodeType);
        attachLiteralTypesMethod.setAccessible(true);
        java.lang.Object[] attachLiteralTypesMethodArguments = new java.lang.Object[1];
        attachLiteralTypesMethodArguments[0] = functionNode;
        attachLiteralTypesMethod.invoke(typedScopeCreator, attachLiteralTypesMethodArguments);
        
        JSTypeRegistry typedScopeCreatorTypeRegistry = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes0 = ((JSType) get(typedScopeCreatorTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typedScopeCreatorTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes1 = ((JSType) get(typedScopeCreatorTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry typedScopeCreatorTypeRegistry2 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes2 = ((JSType) get(typedScopeCreatorTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry typedScopeCreatorTypeRegistry3 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes3 = ((JSType) get(typedScopeCreatorTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry typedScopeCreatorTypeRegistry4 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes4 = ((JSType) get(typedScopeCreatorTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry typedScopeCreatorTypeRegistry5 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes5 = ((JSType) get(typedScopeCreatorTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry typedScopeCreatorTypeRegistry6 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes6 = ((JSType) get(typedScopeCreatorTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry typedScopeCreatorTypeRegistry7 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes7 = ((JSType) get(typedScopeCreatorTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry typedScopeCreatorTypeRegistry8 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes8 = ((JSType) get(typedScopeCreatorTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry typedScopeCreatorTypeRegistry9 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes9 = ((JSType) get(typedScopeCreatorTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry typedScopeCreatorTypeRegistry10 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes10 = ((JSType) get(typedScopeCreatorTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry typedScopeCreatorTypeRegistry11 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes11 = ((JSType) get(typedScopeCreatorTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry typedScopeCreatorTypeRegistry12 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes12 = ((JSType) get(typedScopeCreatorTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry typedScopeCreatorTypeRegistry13 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes13 = ((JSType) get(typedScopeCreatorTypeRegistry13TypeRegistryNativeTypes, 13));
        JSTypeRegistry typedScopeCreatorTypeRegistry14 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes14 = ((JSType) get(typedScopeCreatorTypeRegistry14TypeRegistryNativeTypes, 14));
        JSTypeRegistry typedScopeCreatorTypeRegistry15 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes15 = ((JSType) get(typedScopeCreatorTypeRegistry15TypeRegistryNativeTypes, 15));
        JSTypeRegistry typedScopeCreatorTypeRegistry16 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes16 = ((JSType) get(typedScopeCreatorTypeRegistry16TypeRegistryNativeTypes, 16));
        JSTypeRegistry typedScopeCreatorTypeRegistry17 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes17 = ((JSType) get(typedScopeCreatorTypeRegistry17TypeRegistryNativeTypes, 17));
        JSTypeRegistry typedScopeCreatorTypeRegistry18 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes18 = ((JSType) get(typedScopeCreatorTypeRegistry18TypeRegistryNativeTypes, 18));
        JSTypeRegistry typedScopeCreatorTypeRegistry19 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes19 = ((JSType) get(typedScopeCreatorTypeRegistry19TypeRegistryNativeTypes, 19));
        JSTypeRegistry typedScopeCreatorTypeRegistry20 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes20 = ((JSType) get(typedScopeCreatorTypeRegistry20TypeRegistryNativeTypes, 20));
        JSTypeRegistry typedScopeCreatorTypeRegistry21 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes21 = ((JSType) get(typedScopeCreatorTypeRegistry21TypeRegistryNativeTypes, 21));
        JSTypeRegistry typedScopeCreatorTypeRegistry22 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes22 = ((JSType) get(typedScopeCreatorTypeRegistry22TypeRegistryNativeTypes, 22));
        JSTypeRegistry typedScopeCreatorTypeRegistry23 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes23 = ((JSType) get(typedScopeCreatorTypeRegistry23TypeRegistryNativeTypes, 23));
        JSTypeRegistry typedScopeCreatorTypeRegistry24 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes24 = ((JSType) get(typedScopeCreatorTypeRegistry24TypeRegistryNativeTypes, 24));
        JSTypeRegistry typedScopeCreatorTypeRegistry25 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry25TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes25 = ((JSType) get(typedScopeCreatorTypeRegistry25TypeRegistryNativeTypes, 25));
        JSTypeRegistry typedScopeCreatorTypeRegistry26 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry26TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes26 = ((JSType) get(typedScopeCreatorTypeRegistry26TypeRegistryNativeTypes, 26));
        JSTypeRegistry typedScopeCreatorTypeRegistry27 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry27TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes27 = ((JSType) get(typedScopeCreatorTypeRegistry27TypeRegistryNativeTypes, 27));
        JSTypeRegistry typedScopeCreatorTypeRegistry28 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry28TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes28 = ((JSType) get(typedScopeCreatorTypeRegistry28TypeRegistryNativeTypes, 28));
        JSTypeRegistry typedScopeCreatorTypeRegistry29 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry29TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes29 = ((JSType) get(typedScopeCreatorTypeRegistry29TypeRegistryNativeTypes, 29));
        JSTypeRegistry typedScopeCreatorTypeRegistry30 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry30TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes30 = ((JSType) get(typedScopeCreatorTypeRegistry30TypeRegistryNativeTypes, 30));
        JSTypeRegistry typedScopeCreatorTypeRegistry31 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry31TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry31, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes31 = ((JSType) get(typedScopeCreatorTypeRegistry31TypeRegistryNativeTypes, 31));
        JSTypeRegistry typedScopeCreatorTypeRegistry32 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry32TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry32, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes32 = ((JSType) get(typedScopeCreatorTypeRegistry32TypeRegistryNativeTypes, 32));
        JSTypeRegistry typedScopeCreatorTypeRegistry33 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry33TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry33, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes33 = ((JSType) get(typedScopeCreatorTypeRegistry33TypeRegistryNativeTypes, 33));
        JSTypeRegistry typedScopeCreatorTypeRegistry34 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry34TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry34, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes34 = ((JSType) get(typedScopeCreatorTypeRegistry34TypeRegistryNativeTypes, 34));
        JSTypeRegistry typedScopeCreatorTypeRegistry35 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry35TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry35, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes35 = ((JSType) get(typedScopeCreatorTypeRegistry35TypeRegistryNativeTypes, 35));
        JSTypeRegistry typedScopeCreatorTypeRegistry36 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry36TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry36, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes36 = ((JSType) get(typedScopeCreatorTypeRegistry36TypeRegistryNativeTypes, 36));
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes0);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes1);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes2);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes3);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes4);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes5);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes6);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes7);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes8);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes9);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes10);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes11);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes12);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes13);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes14);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes15);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes16);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes17);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes18);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes19);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes20);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes21);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes22);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes23);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes24);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes25);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes26);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes27);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes28);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes29);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes30);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes31);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes32);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes33);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes34);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes35);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes36);
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#attachLiteralTypes(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.TypedScopeCreator#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
 * @utbot.invokes {@link com.google.javascript.rhino.Node#setJSType(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 *  */
    @Test
    public void testAttachLiteralTypes_NodeSetJSType_1() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(41);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method attachLiteralTypesMethod = typedScopeCreatorClazz.getDeclaredMethod("attachLiteralTypes", functionNodeType);
        attachLiteralTypesMethod.setAccessible(true);
        java.lang.Object[] attachLiteralTypesMethodArguments = new java.lang.Object[1];
        attachLiteralTypesMethodArguments[0] = functionNode;
        attachLiteralTypesMethod.invoke(typedScopeCreator, attachLiteralTypesMethodArguments);
        
        JSTypeRegistry typedScopeCreatorTypeRegistry = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes0 = ((JSType) get(typedScopeCreatorTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typedScopeCreatorTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes1 = ((JSType) get(typedScopeCreatorTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry typedScopeCreatorTypeRegistry2 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes2 = ((JSType) get(typedScopeCreatorTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry typedScopeCreatorTypeRegistry3 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes3 = ((JSType) get(typedScopeCreatorTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry typedScopeCreatorTypeRegistry4 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes4 = ((JSType) get(typedScopeCreatorTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry typedScopeCreatorTypeRegistry5 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes5 = ((JSType) get(typedScopeCreatorTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry typedScopeCreatorTypeRegistry6 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes6 = ((JSType) get(typedScopeCreatorTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry typedScopeCreatorTypeRegistry7 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes7 = ((JSType) get(typedScopeCreatorTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry typedScopeCreatorTypeRegistry8 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes8 = ((JSType) get(typedScopeCreatorTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry typedScopeCreatorTypeRegistry9 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes9 = ((JSType) get(typedScopeCreatorTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry typedScopeCreatorTypeRegistry10 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes10 = ((JSType) get(typedScopeCreatorTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry typedScopeCreatorTypeRegistry11 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes11 = ((JSType) get(typedScopeCreatorTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry typedScopeCreatorTypeRegistry12 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes12 = ((JSType) get(typedScopeCreatorTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry typedScopeCreatorTypeRegistry13 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes13 = ((JSType) get(typedScopeCreatorTypeRegistry13TypeRegistryNativeTypes, 13));
        JSTypeRegistry typedScopeCreatorTypeRegistry14 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes14 = ((JSType) get(typedScopeCreatorTypeRegistry14TypeRegistryNativeTypes, 14));
        JSTypeRegistry typedScopeCreatorTypeRegistry15 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes15 = ((JSType) get(typedScopeCreatorTypeRegistry15TypeRegistryNativeTypes, 15));
        JSTypeRegistry typedScopeCreatorTypeRegistry16 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes16 = ((JSType) get(typedScopeCreatorTypeRegistry16TypeRegistryNativeTypes, 16));
        JSTypeRegistry typedScopeCreatorTypeRegistry17 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes17 = ((JSType) get(typedScopeCreatorTypeRegistry17TypeRegistryNativeTypes, 17));
        JSTypeRegistry typedScopeCreatorTypeRegistry18 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes18 = ((JSType) get(typedScopeCreatorTypeRegistry18TypeRegistryNativeTypes, 18));
        JSTypeRegistry typedScopeCreatorTypeRegistry19 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes19 = ((JSType) get(typedScopeCreatorTypeRegistry19TypeRegistryNativeTypes, 19));
        JSTypeRegistry typedScopeCreatorTypeRegistry20 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes20 = ((JSType) get(typedScopeCreatorTypeRegistry20TypeRegistryNativeTypes, 20));
        JSTypeRegistry typedScopeCreatorTypeRegistry21 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes21 = ((JSType) get(typedScopeCreatorTypeRegistry21TypeRegistryNativeTypes, 21));
        JSTypeRegistry typedScopeCreatorTypeRegistry22 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes22 = ((JSType) get(typedScopeCreatorTypeRegistry22TypeRegistryNativeTypes, 22));
        JSTypeRegistry typedScopeCreatorTypeRegistry23 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes23 = ((JSType) get(typedScopeCreatorTypeRegistry23TypeRegistryNativeTypes, 23));
        JSTypeRegistry typedScopeCreatorTypeRegistry24 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes24 = ((JSType) get(typedScopeCreatorTypeRegistry24TypeRegistryNativeTypes, 24));
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes0);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes1);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes2);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes3);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes4);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes5);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes6);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes7);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes8);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes9);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes10);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes11);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes12);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes13);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes14);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes15);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes16);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes17);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes18);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes19);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes20);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes21);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes22);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes23);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes24);
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#attachLiteralTypes(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.TypedScopeCreator#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
 * @utbot.invokes {@link com.google.javascript.rhino.Node#setJSType(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 *  */
    @Test
    public void testAttachLiteralTypes_NodeSetJSType_2() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[31];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(40);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method attachLiteralTypesMethod = typedScopeCreatorClazz.getDeclaredMethod("attachLiteralTypes", functionNodeType);
        attachLiteralTypesMethod.setAccessible(true);
        java.lang.Object[] attachLiteralTypesMethodArguments = new java.lang.Object[1];
        attachLiteralTypesMethodArguments[0] = functionNode;
        attachLiteralTypesMethod.invoke(typedScopeCreator, attachLiteralTypesMethodArguments);
        
        JSTypeRegistry typedScopeCreatorTypeRegistry = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes0 = ((JSType) get(typedScopeCreatorTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typedScopeCreatorTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes1 = ((JSType) get(typedScopeCreatorTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry typedScopeCreatorTypeRegistry2 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes2 = ((JSType) get(typedScopeCreatorTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry typedScopeCreatorTypeRegistry3 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes3 = ((JSType) get(typedScopeCreatorTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry typedScopeCreatorTypeRegistry4 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes4 = ((JSType) get(typedScopeCreatorTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry typedScopeCreatorTypeRegistry5 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes5 = ((JSType) get(typedScopeCreatorTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry typedScopeCreatorTypeRegistry6 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes6 = ((JSType) get(typedScopeCreatorTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry typedScopeCreatorTypeRegistry7 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes7 = ((JSType) get(typedScopeCreatorTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry typedScopeCreatorTypeRegistry8 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes8 = ((JSType) get(typedScopeCreatorTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry typedScopeCreatorTypeRegistry9 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes9 = ((JSType) get(typedScopeCreatorTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry typedScopeCreatorTypeRegistry10 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes10 = ((JSType) get(typedScopeCreatorTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry typedScopeCreatorTypeRegistry11 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes11 = ((JSType) get(typedScopeCreatorTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry typedScopeCreatorTypeRegistry12 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes12 = ((JSType) get(typedScopeCreatorTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry typedScopeCreatorTypeRegistry13 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes13 = ((JSType) get(typedScopeCreatorTypeRegistry13TypeRegistryNativeTypes, 13));
        JSTypeRegistry typedScopeCreatorTypeRegistry14 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes14 = ((JSType) get(typedScopeCreatorTypeRegistry14TypeRegistryNativeTypes, 14));
        JSTypeRegistry typedScopeCreatorTypeRegistry15 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes15 = ((JSType) get(typedScopeCreatorTypeRegistry15TypeRegistryNativeTypes, 15));
        JSTypeRegistry typedScopeCreatorTypeRegistry16 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes16 = ((JSType) get(typedScopeCreatorTypeRegistry16TypeRegistryNativeTypes, 16));
        JSTypeRegistry typedScopeCreatorTypeRegistry17 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes17 = ((JSType) get(typedScopeCreatorTypeRegistry17TypeRegistryNativeTypes, 17));
        JSTypeRegistry typedScopeCreatorTypeRegistry18 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes18 = ((JSType) get(typedScopeCreatorTypeRegistry18TypeRegistryNativeTypes, 18));
        JSTypeRegistry typedScopeCreatorTypeRegistry19 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes19 = ((JSType) get(typedScopeCreatorTypeRegistry19TypeRegistryNativeTypes, 19));
        JSTypeRegistry typedScopeCreatorTypeRegistry20 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes20 = ((JSType) get(typedScopeCreatorTypeRegistry20TypeRegistryNativeTypes, 20));
        JSTypeRegistry typedScopeCreatorTypeRegistry21 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes21 = ((JSType) get(typedScopeCreatorTypeRegistry21TypeRegistryNativeTypes, 21));
        JSTypeRegistry typedScopeCreatorTypeRegistry22 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes22 = ((JSType) get(typedScopeCreatorTypeRegistry22TypeRegistryNativeTypes, 22));
        JSTypeRegistry typedScopeCreatorTypeRegistry23 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes23 = ((JSType) get(typedScopeCreatorTypeRegistry23TypeRegistryNativeTypes, 23));
        JSTypeRegistry typedScopeCreatorTypeRegistry24 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes24 = ((JSType) get(typedScopeCreatorTypeRegistry24TypeRegistryNativeTypes, 24));
        JSTypeRegistry typedScopeCreatorTypeRegistry25 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry25TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes25 = ((JSType) get(typedScopeCreatorTypeRegistry25TypeRegistryNativeTypes, 25));
        JSTypeRegistry typedScopeCreatorTypeRegistry26 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry26TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes26 = ((JSType) get(typedScopeCreatorTypeRegistry26TypeRegistryNativeTypes, 26));
        JSTypeRegistry typedScopeCreatorTypeRegistry27 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry27TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes27 = ((JSType) get(typedScopeCreatorTypeRegistry27TypeRegistryNativeTypes, 27));
        JSTypeRegistry typedScopeCreatorTypeRegistry28 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry28TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes28 = ((JSType) get(typedScopeCreatorTypeRegistry28TypeRegistryNativeTypes, 28));
        JSTypeRegistry typedScopeCreatorTypeRegistry29 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry29TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes29 = ((JSType) get(typedScopeCreatorTypeRegistry29TypeRegistryNativeTypes, 29));
        JSTypeRegistry typedScopeCreatorTypeRegistry30 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry30TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes30 = ((JSType) get(typedScopeCreatorTypeRegistry30TypeRegistryNativeTypes, 30));
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes0);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes1);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes2);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes3);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes4);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes5);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes6);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes7);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes8);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes9);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes10);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes11);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes12);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes13);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes14);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes15);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes16);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes17);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes18);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes19);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes20);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes21);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes22);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes23);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes24);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes25);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes26);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes27);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes28);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes29);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes30);
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#attachLiteralTypes(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.TypedScopeCreator#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
 * @utbot.invokes {@link com.google.javascript.rhino.Node#setJSType(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 *  */
    @Test
    public void testAttachLiteralTypes_NodeSetJSType_4() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[39];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(122);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method attachLiteralTypesMethod = typedScopeCreatorClazz.getDeclaredMethod("attachLiteralTypes", scriptOrFnNodeType);
        attachLiteralTypesMethod.setAccessible(true);
        java.lang.Object[] attachLiteralTypesMethodArguments = new java.lang.Object[1];
        attachLiteralTypesMethodArguments[0] = scriptOrFnNode;
        attachLiteralTypesMethod.invoke(typedScopeCreator, attachLiteralTypesMethodArguments);
        
        JSTypeRegistry typedScopeCreatorTypeRegistry = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes0 = ((JSType) get(typedScopeCreatorTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typedScopeCreatorTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes1 = ((JSType) get(typedScopeCreatorTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry typedScopeCreatorTypeRegistry2 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes2 = ((JSType) get(typedScopeCreatorTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry typedScopeCreatorTypeRegistry3 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes3 = ((JSType) get(typedScopeCreatorTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry typedScopeCreatorTypeRegistry4 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes4 = ((JSType) get(typedScopeCreatorTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry typedScopeCreatorTypeRegistry5 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes5 = ((JSType) get(typedScopeCreatorTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry typedScopeCreatorTypeRegistry6 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes6 = ((JSType) get(typedScopeCreatorTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry typedScopeCreatorTypeRegistry7 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes7 = ((JSType) get(typedScopeCreatorTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry typedScopeCreatorTypeRegistry8 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes8 = ((JSType) get(typedScopeCreatorTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry typedScopeCreatorTypeRegistry9 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes9 = ((JSType) get(typedScopeCreatorTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry typedScopeCreatorTypeRegistry10 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes10 = ((JSType) get(typedScopeCreatorTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry typedScopeCreatorTypeRegistry11 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes11 = ((JSType) get(typedScopeCreatorTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry typedScopeCreatorTypeRegistry12 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes12 = ((JSType) get(typedScopeCreatorTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry typedScopeCreatorTypeRegistry13 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes13 = ((JSType) get(typedScopeCreatorTypeRegistry13TypeRegistryNativeTypes, 13));
        JSTypeRegistry typedScopeCreatorTypeRegistry14 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes14 = ((JSType) get(typedScopeCreatorTypeRegistry14TypeRegistryNativeTypes, 14));
        JSTypeRegistry typedScopeCreatorTypeRegistry15 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes15 = ((JSType) get(typedScopeCreatorTypeRegistry15TypeRegistryNativeTypes, 15));
        JSTypeRegistry typedScopeCreatorTypeRegistry16 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes16 = ((JSType) get(typedScopeCreatorTypeRegistry16TypeRegistryNativeTypes, 16));
        JSTypeRegistry typedScopeCreatorTypeRegistry17 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes17 = ((JSType) get(typedScopeCreatorTypeRegistry17TypeRegistryNativeTypes, 17));
        JSTypeRegistry typedScopeCreatorTypeRegistry18 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes18 = ((JSType) get(typedScopeCreatorTypeRegistry18TypeRegistryNativeTypes, 18));
        JSTypeRegistry typedScopeCreatorTypeRegistry19 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes19 = ((JSType) get(typedScopeCreatorTypeRegistry19TypeRegistryNativeTypes, 19));
        JSTypeRegistry typedScopeCreatorTypeRegistry20 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes20 = ((JSType) get(typedScopeCreatorTypeRegistry20TypeRegistryNativeTypes, 20));
        JSTypeRegistry typedScopeCreatorTypeRegistry21 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes21 = ((JSType) get(typedScopeCreatorTypeRegistry21TypeRegistryNativeTypes, 21));
        JSTypeRegistry typedScopeCreatorTypeRegistry22 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes22 = ((JSType) get(typedScopeCreatorTypeRegistry22TypeRegistryNativeTypes, 22));
        JSTypeRegistry typedScopeCreatorTypeRegistry23 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes23 = ((JSType) get(typedScopeCreatorTypeRegistry23TypeRegistryNativeTypes, 23));
        JSTypeRegistry typedScopeCreatorTypeRegistry24 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes24 = ((JSType) get(typedScopeCreatorTypeRegistry24TypeRegistryNativeTypes, 24));
        JSTypeRegistry typedScopeCreatorTypeRegistry25 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry25TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes25 = ((JSType) get(typedScopeCreatorTypeRegistry25TypeRegistryNativeTypes, 25));
        JSTypeRegistry typedScopeCreatorTypeRegistry26 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry26TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes26 = ((JSType) get(typedScopeCreatorTypeRegistry26TypeRegistryNativeTypes, 26));
        JSTypeRegistry typedScopeCreatorTypeRegistry27 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry27TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes27 = ((JSType) get(typedScopeCreatorTypeRegistry27TypeRegistryNativeTypes, 27));
        JSTypeRegistry typedScopeCreatorTypeRegistry28 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry28TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes28 = ((JSType) get(typedScopeCreatorTypeRegistry28TypeRegistryNativeTypes, 28));
        JSTypeRegistry typedScopeCreatorTypeRegistry29 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry29TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes29 = ((JSType) get(typedScopeCreatorTypeRegistry29TypeRegistryNativeTypes, 29));
        JSTypeRegistry typedScopeCreatorTypeRegistry30 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry30TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes30 = ((JSType) get(typedScopeCreatorTypeRegistry30TypeRegistryNativeTypes, 30));
        JSTypeRegistry typedScopeCreatorTypeRegistry31 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry31TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry31, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes31 = ((JSType) get(typedScopeCreatorTypeRegistry31TypeRegistryNativeTypes, 31));
        JSTypeRegistry typedScopeCreatorTypeRegistry32 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry32TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry32, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes32 = ((JSType) get(typedScopeCreatorTypeRegistry32TypeRegistryNativeTypes, 32));
        JSTypeRegistry typedScopeCreatorTypeRegistry33 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry33TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry33, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes33 = ((JSType) get(typedScopeCreatorTypeRegistry33TypeRegistryNativeTypes, 33));
        JSTypeRegistry typedScopeCreatorTypeRegistry34 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry34TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry34, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes34 = ((JSType) get(typedScopeCreatorTypeRegistry34TypeRegistryNativeTypes, 34));
        JSTypeRegistry typedScopeCreatorTypeRegistry35 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry35TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry35, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes35 = ((JSType) get(typedScopeCreatorTypeRegistry35TypeRegistryNativeTypes, 35));
        JSTypeRegistry typedScopeCreatorTypeRegistry36 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry36TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry36, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes36 = ((JSType) get(typedScopeCreatorTypeRegistry36TypeRegistryNativeTypes, 36));
        JSTypeRegistry typedScopeCreatorTypeRegistry37 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry37TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry37, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes37 = ((JSType) get(typedScopeCreatorTypeRegistry37TypeRegistryNativeTypes, 37));
        JSTypeRegistry typedScopeCreatorTypeRegistry38 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry38TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry38, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes38 = ((JSType) get(typedScopeCreatorTypeRegistry38TypeRegistryNativeTypes, 38));
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes0);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes1);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes2);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes3);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes4);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes5);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes6);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes7);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes8);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes9);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes10);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes11);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes12);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes13);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes14);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes15);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes16);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes17);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes18);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes19);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes20);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes21);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes22);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes23);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes24);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes25);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes26);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes27);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes28);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes29);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes30);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes31);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes32);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes33);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes34);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes35);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes36);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes37);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes38);
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#attachLiteralTypes(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.TypedScopeCreator#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
 * @utbot.invokes {@link com.google.javascript.rhino.Node#setJSType(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 *  */
    @Test
    public void testAttachLiteralTypes_NodeSetJSType_5() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[11];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(44);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method attachLiteralTypesMethod = typedScopeCreatorClazz.getDeclaredMethod("attachLiteralTypes", scriptOrFnNodeType);
        attachLiteralTypesMethod.setAccessible(true);
        java.lang.Object[] attachLiteralTypesMethodArguments = new java.lang.Object[1];
        attachLiteralTypesMethodArguments[0] = scriptOrFnNode;
        attachLiteralTypesMethod.invoke(typedScopeCreator, attachLiteralTypesMethodArguments);
        
        JSTypeRegistry typedScopeCreatorTypeRegistry = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes0 = ((JSType) get(typedScopeCreatorTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typedScopeCreatorTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes1 = ((JSType) get(typedScopeCreatorTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry typedScopeCreatorTypeRegistry2 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes2 = ((JSType) get(typedScopeCreatorTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry typedScopeCreatorTypeRegistry3 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes3 = ((JSType) get(typedScopeCreatorTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry typedScopeCreatorTypeRegistry4 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes4 = ((JSType) get(typedScopeCreatorTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry typedScopeCreatorTypeRegistry5 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes5 = ((JSType) get(typedScopeCreatorTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry typedScopeCreatorTypeRegistry6 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes6 = ((JSType) get(typedScopeCreatorTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry typedScopeCreatorTypeRegistry7 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes7 = ((JSType) get(typedScopeCreatorTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry typedScopeCreatorTypeRegistry8 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes8 = ((JSType) get(typedScopeCreatorTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry typedScopeCreatorTypeRegistry9 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes9 = ((JSType) get(typedScopeCreatorTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry typedScopeCreatorTypeRegistry10 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes10 = ((JSType) get(typedScopeCreatorTypeRegistry10TypeRegistryNativeTypes, 10));
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes0);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes1);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes2);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes3);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes4);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes5);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes6);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes7);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes8);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes9);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes10);
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#attachLiteralTypes(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.TypedScopeCreator#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
 * @utbot.invokes {@link com.google.javascript.rhino.Node#setJSType(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 *  */
    @Test
    public void testAttachLiteralTypes_NodeSetJSType_6() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(39);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method attachLiteralTypesMethod = typedScopeCreatorClazz.getDeclaredMethod("attachLiteralTypes", functionNodeType);
        attachLiteralTypesMethod.setAccessible(true);
        java.lang.Object[] attachLiteralTypesMethodArguments = new java.lang.Object[1];
        attachLiteralTypesMethodArguments[0] = functionNode;
        attachLiteralTypesMethod.invoke(typedScopeCreator, attachLiteralTypesMethodArguments);
        
        JSTypeRegistry typedScopeCreatorTypeRegistry = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes0 = ((JSType) get(typedScopeCreatorTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typedScopeCreatorTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes1 = ((JSType) get(typedScopeCreatorTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry typedScopeCreatorTypeRegistry2 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes2 = ((JSType) get(typedScopeCreatorTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry typedScopeCreatorTypeRegistry3 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes3 = ((JSType) get(typedScopeCreatorTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry typedScopeCreatorTypeRegistry4 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes4 = ((JSType) get(typedScopeCreatorTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry typedScopeCreatorTypeRegistry5 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes5 = ((JSType) get(typedScopeCreatorTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry typedScopeCreatorTypeRegistry6 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes6 = ((JSType) get(typedScopeCreatorTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry typedScopeCreatorTypeRegistry7 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes7 = ((JSType) get(typedScopeCreatorTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry typedScopeCreatorTypeRegistry8 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes8 = ((JSType) get(typedScopeCreatorTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry typedScopeCreatorTypeRegistry9 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes9 = ((JSType) get(typedScopeCreatorTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry typedScopeCreatorTypeRegistry10 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes10 = ((JSType) get(typedScopeCreatorTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry typedScopeCreatorTypeRegistry11 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes11 = ((JSType) get(typedScopeCreatorTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry typedScopeCreatorTypeRegistry12 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes12 = ((JSType) get(typedScopeCreatorTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry typedScopeCreatorTypeRegistry13 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes13 = ((JSType) get(typedScopeCreatorTypeRegistry13TypeRegistryNativeTypes, 13));
        JSTypeRegistry typedScopeCreatorTypeRegistry14 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes14 = ((JSType) get(typedScopeCreatorTypeRegistry14TypeRegistryNativeTypes, 14));
        JSTypeRegistry typedScopeCreatorTypeRegistry15 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes15 = ((JSType) get(typedScopeCreatorTypeRegistry15TypeRegistryNativeTypes, 15));
        JSTypeRegistry typedScopeCreatorTypeRegistry16 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes16 = ((JSType) get(typedScopeCreatorTypeRegistry16TypeRegistryNativeTypes, 16));
        JSTypeRegistry typedScopeCreatorTypeRegistry17 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes17 = ((JSType) get(typedScopeCreatorTypeRegistry17TypeRegistryNativeTypes, 17));
        JSTypeRegistry typedScopeCreatorTypeRegistry18 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes18 = ((JSType) get(typedScopeCreatorTypeRegistry18TypeRegistryNativeTypes, 18));
        JSTypeRegistry typedScopeCreatorTypeRegistry19 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes19 = ((JSType) get(typedScopeCreatorTypeRegistry19TypeRegistryNativeTypes, 19));
        JSTypeRegistry typedScopeCreatorTypeRegistry20 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes20 = ((JSType) get(typedScopeCreatorTypeRegistry20TypeRegistryNativeTypes, 20));
        JSTypeRegistry typedScopeCreatorTypeRegistry21 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes21 = ((JSType) get(typedScopeCreatorTypeRegistry21TypeRegistryNativeTypes, 21));
        JSTypeRegistry typedScopeCreatorTypeRegistry22 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes22 = ((JSType) get(typedScopeCreatorTypeRegistry22TypeRegistryNativeTypes, 22));
        JSTypeRegistry typedScopeCreatorTypeRegistry23 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes23 = ((JSType) get(typedScopeCreatorTypeRegistry23TypeRegistryNativeTypes, 23));
        JSTypeRegistry typedScopeCreatorTypeRegistry24 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes24 = ((JSType) get(typedScopeCreatorTypeRegistry24TypeRegistryNativeTypes, 24));
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes0);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes1);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes2);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes3);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes4);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes5);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes6);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes7);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes8);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes9);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes10);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes11);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes12);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes13);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes14);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes15);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes16);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes17);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes18);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes19);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes20);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes21);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes22);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes23);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes24);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method attachLiteralTypes(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#attachLiteralTypes(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: n.setJSType(getNativeType(UNKNOWN_TYPE));
 *  */
    @Test
    public void testAttachLiteralTypes_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(69);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.attachLiteralTypes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:765)
            com.google.javascript.jscomp.TypedScopeCreator.getNativeType(TypedScopeCreator.java:354)
            com.google.javascript.jscomp.TypedScopeCreator.attachLiteralTypes(TypedScopeCreator.java:339) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method attachLiteralTypesMethod = typedScopeCreatorClazz.getDeclaredMethod("attachLiteralTypes", functionNodeType);
        attachLiteralTypesMethod.setAccessible(true);
        java.lang.Object[] attachLiteralTypesMethodArguments = new java.lang.Object[1];
        attachLiteralTypesMethodArguments[0] = functionNode;
        try {
            attachLiteralTypesMethod.invoke(typedScopeCreator, attachLiteralTypesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#attachLiteralTypes(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.TypedScopeCreator#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: n.setJSType(getNativeType(NUMBER_TYPE));
 *  */
    @Test
    public void testAttachLiteralTypes_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.attachLiteralTypes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 2]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:765)
            com.google.javascript.jscomp.TypedScopeCreator.getNativeType(TypedScopeCreator.java:354)
            com.google.javascript.jscomp.TypedScopeCreator.attachLiteralTypes(TypedScopeCreator.java:326) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method attachLiteralTypesMethod = typedScopeCreatorClazz.getDeclaredMethod("attachLiteralTypes", functionNodeType);
        attachLiteralTypesMethod.setAccessible(true);
        java.lang.Object[] attachLiteralTypesMethodArguments = new java.lang.Object[1];
        attachLiteralTypesMethodArguments[0] = functionNode;
        try {
            attachLiteralTypesMethod.invoke(typedScopeCreator, attachLiteralTypesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#attachLiteralTypes(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getJSType() == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: n.setJSType(typeRegistry.createAnonymousObjectType());
 *  */
    @Test
    public void testAttachLiteralTypes_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        Node node = new Node(64);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.attachLiteralTypes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:765)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:769)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:113)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:96)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createAnonymousObjectType(JSTypeRegistry.java:1208)
            com.google.javascript.jscomp.TypedScopeCreator.attachLiteralTypes(TypedScopeCreator.java:344) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method attachLiteralTypesMethod = typedScopeCreatorClazz.getDeclaredMethod("attachLiteralTypes", nodeType);
        attachLiteralTypesMethod.setAccessible(true);
        java.lang.Object[] attachLiteralTypesMethodArguments = new java.lang.Object[1];
        attachLiteralTypesMethodArguments[0] = node;
        try {
            attachLiteralTypesMethod.invoke(typedScopeCreator, attachLiteralTypesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#attachLiteralTypes(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getJSType() == null): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: n.setJSType(typeRegistry.createAnonymousObjectType());
 *  */
    @Test
    public void testAttachLiteralTypes_ThrowClassCastException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[19] = ((JSType) unionType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(64);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.attachLiteralTypes] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.UnionType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.UnionType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @538862bb)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:769)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:113)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:96)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createAnonymousObjectType(JSTypeRegistry.java:1208)
            com.google.javascript.jscomp.TypedScopeCreator.attachLiteralTypes(TypedScopeCreator.java:344) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method attachLiteralTypesMethod = typedScopeCreatorClazz.getDeclaredMethod("attachLiteralTypes", functionNodeType);
        attachLiteralTypesMethod.setAccessible(true);
        java.lang.Object[] attachLiteralTypesMethodArguments = new java.lang.Object[1];
        attachLiteralTypesMethodArguments[0] = functionNode;
        try {
            attachLiteralTypesMethod.invoke(typedScopeCreator, attachLiteralTypesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#attachLiteralTypes(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.getType())
 *  */
    @Test
    public void testAttachLiteralTypes_ThrowNullPointerException() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.attachLiteralTypes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.attachLiteralTypes(TypedScopeCreator.java:312) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method attachLiteralTypesMethod = typedScopeCreatorClazz.getDeclaredMethod("attachLiteralTypes", nodeType);
        attachLiteralTypesMethod.setAccessible(true);
        java.lang.Object[] attachLiteralTypesMethodArguments = new java.lang.Object[1];
        attachLiteralTypesMethodArguments[0] = ((Object) null);
        try {
            attachLiteralTypesMethod.invoke(typedScopeCreator, attachLiteralTypesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#attachLiteralTypes(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.TypedScopeCreator#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: n.setJSType(getNativeType(REGEXP_TYPE));
 *  */
    @Test
    public void testAttachLiteralTypes_ThrowNullPointerException_2() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(47);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.attachLiteralTypes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.getNativeType(TypedScopeCreator.java:354)
            com.google.javascript.jscomp.TypedScopeCreator.attachLiteralTypes(TypedScopeCreator.java:335) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method attachLiteralTypesMethod = typedScopeCreatorClazz.getDeclaredMethod("attachLiteralTypes", scriptOrFnNodeType);
        attachLiteralTypesMethod.setAccessible(true);
        java.lang.Object[] attachLiteralTypesMethodArguments = new java.lang.Object[1];
        attachLiteralTypesMethodArguments[0] = scriptOrFnNode;
        try {
            attachLiteralTypesMethod.invoke(typedScopeCreator, attachLiteralTypesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#attachLiteralTypes(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.TypedScopeCreator#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: n.setJSType(getNativeType(BOOLEAN_TYPE));
 *  */
    @Test
    public void testAttachLiteralTypes_ThrowNullPointerException_3() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(43);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.attachLiteralTypes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.getNativeType(TypedScopeCreator.java:354)
            com.google.javascript.jscomp.TypedScopeCreator.attachLiteralTypes(TypedScopeCreator.java:331) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method attachLiteralTypesMethod = typedScopeCreatorClazz.getDeclaredMethod("attachLiteralTypes", scriptOrFnNodeType);
        attachLiteralTypesMethod.setAccessible(true);
        java.lang.Object[] attachLiteralTypesMethodArguments = new java.lang.Object[1];
        attachLiteralTypesMethodArguments[0] = scriptOrFnNode;
        try {
            attachLiteralTypesMethod.invoke(typedScopeCreator, attachLiteralTypesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#attachLiteralTypes(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: n.setJSType(getNativeType(UNKNOWN_TYPE));
 *  */
    @Test
    public void testAttachLiteralTypes_ThrowNullPointerException_4() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(69);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.attachLiteralTypes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.getNativeType(TypedScopeCreator.java:354)
            com.google.javascript.jscomp.TypedScopeCreator.attachLiteralTypes(TypedScopeCreator.java:339) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method attachLiteralTypesMethod = typedScopeCreatorClazz.getDeclaredMethod("attachLiteralTypes", scriptOrFnNodeType);
        attachLiteralTypesMethod.setAccessible(true);
        java.lang.Object[] attachLiteralTypesMethodArguments = new java.lang.Object[1];
        attachLiteralTypesMethodArguments[0] = scriptOrFnNode;
        try {
            attachLiteralTypesMethod.invoke(typedScopeCreator, attachLiteralTypesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#attachLiteralTypes(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.TypedScopeCreator#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: n.setJSType(getNativeType(NULL_TYPE));
 *  */
    @Test
    public void testAttachLiteralTypes_ThrowNullPointerException_5() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(41);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.attachLiteralTypes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.getNativeType(TypedScopeCreator.java:354)
            com.google.javascript.jscomp.TypedScopeCreator.attachLiteralTypes(TypedScopeCreator.java:314) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method attachLiteralTypesMethod = typedScopeCreatorClazz.getDeclaredMethod("attachLiteralTypes", scriptOrFnNodeType);
        attachLiteralTypesMethod.setAccessible(true);
        java.lang.Object[] attachLiteralTypesMethodArguments = new java.lang.Object[1];
        attachLiteralTypesMethodArguments[0] = scriptOrFnNode;
        try {
            attachLiteralTypesMethod.invoke(typedScopeCreator, attachLiteralTypesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#attachLiteralTypes(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.TypedScopeCreator#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: n.setJSType(getNativeType(VOID_TYPE));
 *  */
    @Test
    public void testAttachLiteralTypes_ThrowNullPointerException_6() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(122);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.attachLiteralTypes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.getNativeType(TypedScopeCreator.java:354)
            com.google.javascript.jscomp.TypedScopeCreator.attachLiteralTypes(TypedScopeCreator.java:318) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method attachLiteralTypesMethod = typedScopeCreatorClazz.getDeclaredMethod("attachLiteralTypes", scriptOrFnNodeType);
        attachLiteralTypesMethod.setAccessible(true);
        java.lang.Object[] attachLiteralTypesMethodArguments = new java.lang.Object[1];
        attachLiteralTypesMethodArguments[0] = scriptOrFnNode;
        try {
            attachLiteralTypesMethod.invoke(typedScopeCreator, attachLiteralTypesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#attachLiteralTypes(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.TypedScopeCreator#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: n.setJSType(getNativeType(STRING_TYPE));
 *  */
    @Test
    public void testAttachLiteralTypes_ThrowNullPointerException_7() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(40);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.attachLiteralTypes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.getNativeType(TypedScopeCreator.java:354)
            com.google.javascript.jscomp.TypedScopeCreator.attachLiteralTypes(TypedScopeCreator.java:322) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method attachLiteralTypesMethod = typedScopeCreatorClazz.getDeclaredMethod("attachLiteralTypes", scriptOrFnNodeType);
        attachLiteralTypesMethod.setAccessible(true);
        java.lang.Object[] attachLiteralTypesMethodArguments = new java.lang.Object[1];
        attachLiteralTypesMethodArguments[0] = scriptOrFnNode;
        try {
            attachLiteralTypesMethod.invoke(typedScopeCreator, attachLiteralTypesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#attachLiteralTypes(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getJSType() == null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#createAnonymousObjectType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: n.setJSType(typeRegistry.createAnonymousObjectType());
 *  */
    @Test
    public void testAttachLiteralTypes_ThrowNullPointerException_1() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(64);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.attachLiteralTypes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.attachLiteralTypes(TypedScopeCreator.java:344) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method attachLiteralTypesMethod = typedScopeCreatorClazz.getDeclaredMethod("attachLiteralTypes", scriptOrFnNodeType);
        attachLiteralTypesMethod.setAccessible(true);
        java.lang.Object[] attachLiteralTypesMethodArguments = new java.lang.Object[1];
        attachLiteralTypesMethodArguments[0] = scriptOrFnNode;
        try {
            attachLiteralTypesMethod.invoke(typedScopeCreator, attachLiteralTypesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypedScopeCreator.createScope
    
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createScope(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: newScope = new Scope(parent, root);
 *  */
    @Test
    public void testCreateScope_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createScope] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:765)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:769)
            com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis(FunctionType.java:752)
            com.google.javascript.jscomp.Scope.<init>(Scope.java:288)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:170) */
        typedScopeCreator.createScope(node, scope);
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: newScope = new Scope(parent, root);
 *  */
    @Test
    public void testCreateScope_ThrowClassCastException() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        NumberType numberType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        nativeTypes[19] = ((JSType) numberType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createScope] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.NumberType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.NumberType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @538862bb)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:769)
            com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis(FunctionType.java:752)
            com.google.javascript.jscomp.Scope.<init>(Scope.java:288)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:170) */
        typedScopeCreator.createScope(node, scope);
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (parent == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCreateScope_ThrowNullPointerException() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:208)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:164) */
        typedScopeCreator.createScope(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (parent == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCreateScope_ThrowNullPointerException_2() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Node node = new Node(105);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:208)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:164) */
        typedScopeCreator.createScope(node, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#createScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (parent == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCreateScope_ThrowNullPointerException_1() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        short[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:208)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:164) */
        typedScopeCreator.createScope(node, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createScope(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)
    
    @Test(expected = RuntimeException.class)
    public void testCreateScope1() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "compiler", compiler);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        Object objectValue = createInstance("java.lang.Object");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        typedScopeCreator.createScope(node, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createScope(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)
    
    @Test
    public void testCreateScope2() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(118);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope.<init>(Scope.java:303)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:210)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:164) */
        typedScopeCreator.createScope(scriptOrFnNode, null);
    }
    
    @Test
    public void testCreateScope3() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(132);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope.<init>(Scope.java:303)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:210)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:164) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method createScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("createScope", stringNodeType, scopeType);
        createScopeMethod.setAccessible(true);
        java.lang.Object[] createScopeMethodArguments = new java.lang.Object[2];
        createScopeMethodArguments[0] = stringNode;
        createScopeMethodArguments[1] = ((Object) null);
        try {
            createScopeMethod.invoke(typedScopeCreator, createScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateScope4() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        String objectValue = "";
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope.<init>(Scope.java:303)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:210)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:164) */
        typedScopeCreator.createScope(scriptOrFnNode, null);
    }
    
    @Test
    public void testCreateScope5() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:208)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:164) */
        typedScopeCreator.createScope(scriptOrFnNode, null);
    }
    
    @Test
    public void testCreateScope6() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope.<init>(Scope.java:303)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:210)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:164) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method createScopeMethod = typedScopeCreatorClazz.getDeclaredMethod("createScope", stringNodeType, scopeType);
        createScopeMethod.setAccessible(true);
        java.lang.Object[] createScopeMethodArguments = new java.lang.Object[2];
        createScopeMethodArguments[0] = stringNode;
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
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:208) */
        typedScopeCreator.createInitialScope(null);
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#createInitialScope(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCreateInitialScope_ThrowNullPointerException_1() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        int[] objectValue = {};
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createInitialScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:208) */
        typedScopeCreator.createInitialScope(scriptOrFnNode);
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#createInitialScope(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCreateInitialScope_ThrowNullPointerException_2() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createInitialScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:208) */
        typedScopeCreator.createInitialScope(functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#createInitialScope(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCreateInitialScope_ThrowNullPointerException_3() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(-255);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(132);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        int[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.createInitialScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(TypedScopeCreator.java:208) */
        typedScopeCreator.createInitialScope(node);
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
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null};
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
        JSTypeRegistry typedScopeCreatorTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes1 = ((JSType) get(typedScopeCreatorTypeRegistry1TypeRegistryNativeTypes, 1));
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes0);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes1);
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
        JSTypeNative jSTypeNative = JSTypeNative.NUMBER_OBJECT_FUNCTION_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.getNativeType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:765)
            com.google.javascript.jscomp.TypedScopeCreator.getNativeType(TypedScopeCreator.java:354) */
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
            com.google.javascript.jscomp.TypedScopeCreator.getNativeType(TypedScopeCreator.java:354) */
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
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeType(TypedScopeCreator.java:254) */
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
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        vars.put(string, var);
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
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:765)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeFunctionType(JSTypeRegistry.java:773)
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType(TypedScopeCreator.java:242) */
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
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        nativeTypes[0] = ((JSType) templateType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.TemplateType cannot be cast to class com.google.javascript.rhino.jstype.FunctionType (com.google.javascript.rhino.jstype.TemplateType and com.google.javascript.rhino.jstype.FunctionType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @538862bb)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeFunctionType(JSTypeRegistry.java:773)
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType(TypedScopeCreator.java:242) */
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
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_FUNCTION_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType(TypedScopeCreator.java:243) */
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
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        nativeTypes[0] = ((JSType) noType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType(TypedScopeCreator.java:243) */
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
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[9];
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        nativeTypes[0] = ((JSType) noType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeType(TypedScopeCreator.java:254)
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType(TypedScopeCreator.java:243) */
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
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[9];
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        nativeTypes[1] = ((JSType) noObjectType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_FUNCTION_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeType(TypedScopeCreator.java:254)
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType(TypedScopeCreator.java:243) */
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
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType(TypedScopeCreator.java:242) */
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
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[9];
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        nativeTypes[0] = ((JSType) noObjectType);
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
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[9];
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        nativeTypes[0] = ((JSType) noType);
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
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        Object typeOfThis = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        String className = "";
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        nativeTypes[0] = ((JSType) noType);
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
    
    ///region OTHER: ERROR SUITE for method declareNativeFunctionType(com.google.javascript.jscomp.Scope, com.google.javascript.rhino.jstype.JSTypeNative)
    
    @Test
    public void testDeclareNativeFunctionType1() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[1];
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        String className = "\u0000\u0000";
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        nativeTypes[0] = ((JSType) functionType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:113)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:261)
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType(TypedScopeCreator.java:245) */
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
    
    ///region Test suites for executable com.google.javascript.jscomp.TypedScopeCreator.getPrototypePropertyOwner
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPrototypePropertyOwner(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#getPrototypePropertyOwner(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.GETPROP): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetPrototypePropertyOwner_NGetTypeNotEqualsTokenGETPROP() throws Exception  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getPrototypePropertyOwnerMethod = typedScopeCreatorClazz.getDeclaredMethod("getPrototypePropertyOwner", scriptOrFnNodeType);
        getPrototypePropertyOwnerMethod.setAccessible(true);
        java.lang.Object[] getPrototypePropertyOwnerMethodArguments = new java.lang.Object[1];
        getPrototypePropertyOwnerMethodArguments[0] = scriptOrFnNode;
        Node actual = ((Node) getPrototypePropertyOwnerMethod.invoke(null, getPrototypePropertyOwnerMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#getPrototypePropertyOwner(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.GETPROP): True}
 * @utbot.executesCondition {@code (firstChild.getType() == Token.GETPROP): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetPrototypePropertyOwner_FirstChildGetTypeNotEqualsTokenGETPROP() throws Exception  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getPrototypePropertyOwnerMethod = typedScopeCreatorClazz.getDeclaredMethod("getPrototypePropertyOwner", scriptOrFnNodeType);
        getPrototypePropertyOwnerMethod.setAccessible(true);
        java.lang.Object[] getPrototypePropertyOwnerMethodArguments = new java.lang.Object[1];
        getPrototypePropertyOwnerMethodArguments[0] = scriptOrFnNode;
        Node actual = ((Node) getPrototypePropertyOwnerMethod.invoke(null, getPrototypePropertyOwnerMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#getPrototypePropertyOwner(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.GETPROP): True}
 * @utbot.executesCondition {@code (firstChild.getType() == Token.GETPROP): True}
 * @utbot.executesCondition {@code (firstChild.getLastChild().getString().equals("prototype")): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetPrototypePropertyOwner_NotFirstChildGetLastChildGetStringEquals() throws Exception  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(last, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getPrototypePropertyOwnerMethod = typedScopeCreatorClazz.getDeclaredMethod("getPrototypePropertyOwner", functionNodeType);
        getPrototypePropertyOwnerMethod.setAccessible(true);
        java.lang.Object[] getPrototypePropertyOwnerMethodArguments = new java.lang.Object[1];
        getPrototypePropertyOwnerMethodArguments[0] = functionNode;
        Node actual = ((Node) getPrototypePropertyOwnerMethod.invoke(null, getPrototypePropertyOwnerMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPrototypePropertyOwner(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#getPrototypePropertyOwner(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getType() == Token.GETPROP
 *  */
    @Test
    public void testGetPrototypePropertyOwner_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.getPrototypePropertyOwner] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.getPrototypePropertyOwner(TypedScopeCreator.java:298) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getPrototypePropertyOwnerMethod = typedScopeCreatorClazz.getDeclaredMethod("getPrototypePropertyOwner", nodeType);
        getPrototypePropertyOwnerMethod.setAccessible(true);
        java.lang.Object[] getPrototypePropertyOwnerMethodArguments = new java.lang.Object[1];
        getPrototypePropertyOwnerMethodArguments[0] = ((Object) null);
        try {
            getPrototypePropertyOwnerMethod.invoke(null, getPrototypePropertyOwnerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#getPrototypePropertyOwner(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.GETPROP): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: firstChild.getType() == Token.GETPROP && firstChild.getLastChild().getString().equals("prototype")
 *  */
    @Test
    public void testGetPrototypePropertyOwner_ThrowNullPointerException_1() throws Throwable  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.getPrototypePropertyOwner] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.getPrototypePropertyOwner(TypedScopeCreator.java:300) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getPrototypePropertyOwnerMethod = typedScopeCreatorClazz.getDeclaredMethod("getPrototypePropertyOwner", scriptOrFnNodeType);
        getPrototypePropertyOwnerMethod.setAccessible(true);
        java.lang.Object[] getPrototypePropertyOwnerMethodArguments = new java.lang.Object[1];
        getPrototypePropertyOwnerMethodArguments[0] = scriptOrFnNode;
        try {
            getPrototypePropertyOwnerMethod.invoke(null, getPrototypePropertyOwnerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#getPrototypePropertyOwner(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.GETPROP): True}
 * @utbot.executesCondition {@code (firstChild.getType() == Token.GETPROP): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: firstChild.getLastChild().getString().equals("prototype")
 *  */
    @Test
    public void testGetPrototypePropertyOwner_ThrowNullPointerException_2() throws Throwable  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.getPrototypePropertyOwner] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.getPrototypePropertyOwner(TypedScopeCreator.java:301) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getPrototypePropertyOwnerMethod = typedScopeCreatorClazz.getDeclaredMethod("getPrototypePropertyOwner", scriptOrFnNodeType);
        getPrototypePropertyOwnerMethod.setAccessible(true);
        java.lang.Object[] getPrototypePropertyOwnerMethodArguments = new java.lang.Object[1];
        getPrototypePropertyOwnerMethodArguments[0] = scriptOrFnNode;
        try {
            getPrototypePropertyOwnerMethod.invoke(null, getPrototypePropertyOwnerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#getPrototypePropertyOwner(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.GETPROP): True}
 * @utbot.executesCondition {@code (firstChild.getType() == Token.GETPROP): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: firstChild.getLastChild().getString().equals("prototype")
 *  */
    @Test
    public void testGetPrototypePropertyOwner_ThrowNullPointerException_3() throws Throwable  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypedScopeCreator.getPrototypePropertyOwner] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedScopeCreator.getPrototypePropertyOwner(TypedScopeCreator.java:301) */
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getPrototypePropertyOwnerMethod = typedScopeCreatorClazz.getDeclaredMethod("getPrototypePropertyOwner", scriptOrFnNodeType);
        getPrototypePropertyOwnerMethod.setAccessible(true);
        java.lang.Object[] getPrototypePropertyOwnerMethodArguments = new java.lang.Object[1];
        getPrototypePropertyOwnerMethodArguments[0] = scriptOrFnNode;
        try {
            getPrototypePropertyOwnerMethod.invoke(null, getPrototypePropertyOwnerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getPrototypePropertyOwner(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#getPrototypePropertyOwner(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: firstChild.getLastChild().getString().equals("prototype")
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetPrototypePropertyOwner_ThrowUnsupportedOperationException() throws Throwable  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getPrototypePropertyOwnerMethod = typedScopeCreatorClazz.getDeclaredMethod("getPrototypePropertyOwner", scriptOrFnNodeType);
        getPrototypePropertyOwnerMethod.setAccessible(true);
        java.lang.Object[] getPrototypePropertyOwnerMethodArguments = new java.lang.Object[1];
        getPrototypePropertyOwnerMethodArguments[0] = scriptOrFnNode;
        try {
            getPrototypePropertyOwnerMethod.invoke(null, getPrototypePropertyOwnerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypedScopeCreator}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypedScopeCreator#getPrototypePropertyOwner(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: firstChild.getLastChild().getString().equals("prototype")
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetPrototypePropertyOwner_ThrowIllegalStateException() throws Throwable  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class typedScopeCreatorClazz = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getPrototypePropertyOwnerMethod = typedScopeCreatorClazz.getDeclaredMethod("getPrototypePropertyOwner", scriptOrFnNodeType);
        getPrototypePropertyOwnerMethod.setAccessible(true);
        java.lang.Object[] getPrototypePropertyOwnerMethodArguments = new java.lang.Object[1];
        getPrototypePropertyOwnerMethodArguments[0] = scriptOrFnNode;
        try {
            getPrototypePropertyOwnerMethod.invoke(null, getPrototypePropertyOwnerMethodArguments);
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
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:765)
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeValueType(TypedScopeCreator.java:250) */
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
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeType(TypedScopeCreator.java:254)
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeValueType(TypedScopeCreator.java:250) */
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
            com.google.javascript.jscomp.TypedScopeCreator.declareNativeValueType(TypedScopeCreator.java:250) */
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
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        Scope scope = new Scope(((Node) null), ((ObjectType) null));
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method declareNativeValueType(com.google.javascript.jscomp.Scope, java.lang.String, com.google.javascript.rhino.jstype.JSTypeNative)
    
    @Test
    public void testDeclareNativeValueType1() throws Exception  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        BooleanType booleanType = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        nativeTypes[24] = ((JSType) booleanType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        JSTypeNative jSTypeNative = JSTypeNative.REFERENCE_ERROR_FUNCTION_TYPE;
        
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
        declareNativeValueTypeMethod.invoke(typedScopeCreator, declareNativeValueTypeMethodArguments);
        
        JSTypeRegistry typedScopeCreatorTypeRegistry = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes0 = ((JSType) get(typedScopeCreatorTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typedScopeCreatorTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes1 = ((JSType) get(typedScopeCreatorTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry typedScopeCreatorTypeRegistry2 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes2 = ((JSType) get(typedScopeCreatorTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry typedScopeCreatorTypeRegistry3 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes3 = ((JSType) get(typedScopeCreatorTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry typedScopeCreatorTypeRegistry4 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes4 = ((JSType) get(typedScopeCreatorTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry typedScopeCreatorTypeRegistry5 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes5 = ((JSType) get(typedScopeCreatorTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry typedScopeCreatorTypeRegistry6 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes6 = ((JSType) get(typedScopeCreatorTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry typedScopeCreatorTypeRegistry7 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes7 = ((JSType) get(typedScopeCreatorTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry typedScopeCreatorTypeRegistry8 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes8 = ((JSType) get(typedScopeCreatorTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry typedScopeCreatorTypeRegistry9 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes9 = ((JSType) get(typedScopeCreatorTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry typedScopeCreatorTypeRegistry10 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes10 = ((JSType) get(typedScopeCreatorTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry typedScopeCreatorTypeRegistry11 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes11 = ((JSType) get(typedScopeCreatorTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry typedScopeCreatorTypeRegistry12 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes12 = ((JSType) get(typedScopeCreatorTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry typedScopeCreatorTypeRegistry13 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes13 = ((JSType) get(typedScopeCreatorTypeRegistry13TypeRegistryNativeTypes, 13));
        JSTypeRegistry typedScopeCreatorTypeRegistry14 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes14 = ((JSType) get(typedScopeCreatorTypeRegistry14TypeRegistryNativeTypes, 14));
        JSTypeRegistry typedScopeCreatorTypeRegistry15 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes15 = ((JSType) get(typedScopeCreatorTypeRegistry15TypeRegistryNativeTypes, 15));
        JSTypeRegistry typedScopeCreatorTypeRegistry16 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes16 = ((JSType) get(typedScopeCreatorTypeRegistry16TypeRegistryNativeTypes, 16));
        JSTypeRegistry typedScopeCreatorTypeRegistry17 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes17 = ((JSType) get(typedScopeCreatorTypeRegistry17TypeRegistryNativeTypes, 17));
        JSTypeRegistry typedScopeCreatorTypeRegistry18 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes18 = ((JSType) get(typedScopeCreatorTypeRegistry18TypeRegistryNativeTypes, 18));
        JSTypeRegistry typedScopeCreatorTypeRegistry19 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes19 = ((JSType) get(typedScopeCreatorTypeRegistry19TypeRegistryNativeTypes, 19));
        JSTypeRegistry typedScopeCreatorTypeRegistry20 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes20 = ((JSType) get(typedScopeCreatorTypeRegistry20TypeRegistryNativeTypes, 20));
        JSTypeRegistry typedScopeCreatorTypeRegistry21 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes21 = ((JSType) get(typedScopeCreatorTypeRegistry21TypeRegistryNativeTypes, 21));
        JSTypeRegistry typedScopeCreatorTypeRegistry22 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes22 = ((JSType) get(typedScopeCreatorTypeRegistry22TypeRegistryNativeTypes, 22));
        JSTypeRegistry typedScopeCreatorTypeRegistry23 = ((JSTypeRegistry) getFieldValue(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typedScopeCreatorTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typedScopeCreatorTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypedScopeCreatorTypeRegistryNativeTypes23 = ((JSType) get(typedScopeCreatorTypeRegistry23TypeRegistryNativeTypes, 23));
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes0);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes1);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes2);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes3);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes4);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes5);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes6);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes7);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes8);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes9);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes10);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes11);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes12);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes13);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes14);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes15);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes16);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes17);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes18);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes19);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes20);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes21);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes22);
        
        assertNull(finalTypedScopeCreatorTypeRegistryNativeTypes23);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method declareNativeValueType(com.google.javascript.jscomp.Scope, java.lang.String, com.google.javascript.rhino.jstype.JSTypeNative)
    
    @Test(expected = IllegalStateException.class)
    public void testDeclareNativeValueType2() throws Throwable  {
        TypedScopeCreator typedScopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[34];
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
        nativeTypes[19] = ((JSType) templateType);
        nativeTypes[20] = ((JSType) templateType);
        nativeTypes[21] = ((JSType) templateType);
        nativeTypes[22] = ((JSType) templateType);
        nativeTypes[23] = ((JSType) templateType);
        nativeTypes[24] = ((JSType) templateType);
        nativeTypes[25] = ((JSType) templateType);
        nativeTypes[27] = ((JSType) templateType);
        nativeTypes[28] = ((JSType) templateType);
        nativeTypes[29] = ((JSType) templateType);
        nativeTypes[30] = ((JSType) templateType);
        nativeTypes[31] = ((JSType) templateType);
        nativeTypes[32] = ((JSType) templateType);
        nativeTypes[33] = ((JSType) templateType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typedScopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        String string = "\u0000";
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        vars.put(string, var);
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        JSTypeNative jSTypeNative = JSTypeNative.REGEXP_TYPE;
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields901523808506400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields901523808506400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass901523808512900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields901523808506400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass901523808512900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields901523808825500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields901523808825500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass901523808828600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields901523808825500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass901523808828600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

