package com.google.javascript.rhino.jstype;

import org.junit.Test;
import com.google.javascript.rhino.Node;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import com.google.javascript.rhino.ErrorReporter;
import java.util.Map;
import java.util.Set;
import com.google.common.collect.Multimap;
import com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.rhino.ScriptOrFnNode;
import com.google.javascript.rhino.ObjArray;
import com.google.javascript.rhino.ObjToIntMap;
import com.google.javascript.rhino.testing.TestErrorReporter;
import java.util.HashSet;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multiset;
import java.util.Collection;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;

public final class com_google_javascript_rhino_jstype_FunctionBuilderTest {
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionBuilder.build
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method build()
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#build()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.returnsFrom {@code return new FunctionType(registry, name, sourceNode, new ArrowType(registry, parametersNode, returnType, inferredReturnType), typeOfThis, templateTypeName, isConstructor, isNativeType);}
 *  */
    @Test
    public void testBuild_Return_2() throws Exception  {
        Class emptyImmutableListClazz = Class.forName("com.google.common.collect.EmptyImmutableList");
        Object prevINSTANCE = getStaticFieldValue(emptyImmutableListClazz, "INSTANCE");
        try {
            Object instance = createInstance("com.google.common.collect.EmptyImmutableList");
            setStaticField(emptyImmutableListClazz, "INSTANCE", instance);
            FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
            JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
            com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
            setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry", registry);
            Node parametersNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "parametersNode", parametersNode);
            TemplateType returnType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "returnType", returnType);
            String templateTypeName = "";
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "templateTypeName", templateTypeName);
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "isNativeType", true);
            
            FunctionType actual = functionBuilder.build();
            
            FunctionType expected = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
            ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
            setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parametersNode);
            setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
            setField(call, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
            setField(expected, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
            Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
            Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
            setField(expected, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            List implementedInterfaces = new ArrayList();
            expected.setImplementedInterfaces(implementedInterfaces);
            setField(expected, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeName", templateTypeName);
            HashMap properties = new HashMap();
            setField(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
            setField(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(expected, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(expected, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
            
            ArrowType expectedCall = ((ArrowType) getFieldValue(expected, "com.google.javascript.rhino.jstype.FunctionType", "call"));
            ArrowType actualCall = ((ArrowType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call"));
            Node expectedCallParameters = expectedCall.parameters;
            Node actualCallParameters = actualCall.parameters;
            int expectedCallParametersType = expectedCallParameters.getType();
            int actualCallParametersType = actualCallParameters.getType();
            assertEquals(expectedCallParametersType, actualCallParametersType);
            
            Node actualCallParametersNext = actualCallParameters.getNext();
            assertNull(actualCallParametersNext);
            
            Node actualCallParametersFirst = ((Node) getFieldValue(actualCallParameters, "com.google.javascript.rhino.Node", "first"));
            assertNull(actualCallParametersFirst);
            
            Node actualCallParametersLast = ((Node) getFieldValue(actualCallParameters, "com.google.javascript.rhino.Node", "last"));
            assertNull(actualCallParametersLast);
            
            Object actualCallParametersPropListHead = getFieldValue(actualCallParameters, "com.google.javascript.rhino.Node", "propListHead");
            assertNull(actualCallParametersPropListHead);
            
            int expectedCallParametersSourcePosition = ((Integer) getFieldValue(expectedCallParameters, "com.google.javascript.rhino.Node", "sourcePosition"));
            int actualCallParametersSourcePosition = ((Integer) getFieldValue(actualCallParameters, "com.google.javascript.rhino.Node", "sourcePosition"));
            assertEquals(expectedCallParametersSourcePosition, actualCallParametersSourcePosition);
            
            JSType actualCallParametersJsType = ((JSType) getFieldValue(actualCallParameters, "com.google.javascript.rhino.Node", "jsType"));
            assertNull(actualCallParametersJsType);
            
            Node actualCallParametersParent = actualCallParameters.getParent();
            assertNull(actualCallParametersParent);
            
            JSType expectedCallReturnType = expectedCall.returnType;
            JSType actualCallReturnType = actualCall.returnType;
            // com.google.javascript.rhino.jstype.JSType has overridden equals method
            assertEquals(expectedCallReturnType, actualCallReturnType);
            
            boolean actualCallReturnTypeInferred = actualCall.returnTypeInferred;
            assertFalse(actualCallReturnTypeInferred);
            
            boolean actualCallResolved = ((Boolean) getFieldValue(actualCall, "com.google.javascript.rhino.jstype.JSType", "resolved"));
            assertFalse(actualCallResolved);
            
            JSType actualCallResolveResult = ((JSType) getFieldValue(actualCall, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
            assertNull(actualCallResolveResult);
            
            JSTypeRegistry expectedCallRegistry = expectedCall.registry;
            JSTypeRegistry actualCallRegistry = actualCall.registry;
            ErrorReporter actualCallRegistryReporter = ((ErrorReporter) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
            assertNull(actualCallRegistryReporter);
            
            com.google.javascript.rhino.jstype.JSType[] expectedCallRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(expectedCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            com.google.javascript.rhino.jstype.JSType[] actualCallRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            int expectedCallRegistryNativeTypesSize = expectedCallRegistryNativeTypes.length;
            assertEquals(expectedCallRegistryNativeTypesSize, actualCallRegistryNativeTypes.length);
            assertTrue(deepEquals(expectedCallRegistryNativeTypes, actualCallRegistryNativeTypes));
            
            Map actualCallRegistryNamesToTypes = ((Map) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
            assertNull(actualCallRegistryNamesToTypes);
            
            Set actualCallRegistryNamespaces = ((Set) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
            assertNull(actualCallRegistryNamespaces);
            
            Set actualCallRegistryEnumTypeNames = ((Set) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "enumTypeNames"));
            assertNull(actualCallRegistryEnumTypeNames);
            
            Set actualCallRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
            assertNull(actualCallRegistryForwardDeclaredTypes);
            
            Map actualCallRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
            assertNull(actualCallRegistryTypesIndexedByProperty);
            
            Map actualCallRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
            assertNull(actualCallRegistryGreatestSubtypeByProperty);
            
            Multimap actualCallRegistryInterfaceToImplementors = ((Multimap) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
            assertNull(actualCallRegistryInterfaceToImplementors);
            
            Multimap actualCallRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
            assertNull(actualCallRegistryUnresolvedNamedTypes);
            
            Multimap actualCallRegistryResolvedNamedTypes = ((Multimap) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
            assertNull(actualCallRegistryResolvedNamedTypes);
            
            boolean actualCallRegistryLastGeneration = ((Boolean) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "lastGeneration"));
            assertFalse(actualCallRegistryLastGeneration);
            
            String actualCallRegistryTemplateTypeName = ((String) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypeName"));
            assertNull(actualCallRegistryTemplateTypeName);
            
            TemplateType actualCallRegistryTemplateType = ((TemplateType) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
            assertNull(actualCallRegistryTemplateType);
            
            boolean actualCallRegistryTolerateUndefinedValues = ((Boolean) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "tolerateUndefinedValues"));
            assertFalse(actualCallRegistryTolerateUndefinedValues);
            
            JSTypeRegistry.ResolveMode actualCallRegistryResolveMode = actualCallRegistry.getResolveMode();
            assertNull(actualCallRegistryResolveMode);
            
            FunctionPrototypeType actualPrototype = actual.getPrototype();
            assertNull(actualPrototype);
            
            Object expectedKind = getFieldValue(expected, "com.google.javascript.rhino.jstype.FunctionType", "kind");
            Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
            assertEquals(expectedKind, actualKind);
            
            ObjectType actualTypeOfThis = actual.getTypeOfThis();
            assertNull(actualTypeOfThis);
            
            Node actualSource = actual.getSource();
            assertNull(actualSource);
            
            List expectedImplementedInterfaces = ((List) getFieldValue(expected, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
            List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
            assertTrue(deepEquals(expectedImplementedInterfaces, actualImplementedInterfaces));
            
            List actualSubTypes = actual.getSubTypes();
            assertNull(actualSubTypes);
            
            String expectedTemplateTypeName = expected.getTemplateTypeName();
            String actualTemplateTypeName = actual.getTemplateTypeName();
            assertEquals(expectedTemplateTypeName, actualTemplateTypeName);
            
            String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
            assertNull(actualClassName);
            
            Map expectedProperties = ((Map) getFieldValue(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
            Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
            assertTrue(deepEquals(expectedProperties, actualProperties));
            
            ObjectType actualImplicitPrototype = actual.getImplicitPrototype();
            assertNull(actualImplicitPrototype);
            
            boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
            assertTrue(actualNativeType);
            
            boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
            assertFalse(actualPrettyPrint);
            
            boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
            assertFalse(actualVisited);
            
            JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
            assertNull(actualDocInfo);
            
            boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
            assertTrue(actualUnknown);
            
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            
            JSTypeRegistry functionBuilderRegistry = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes0 = ((JSType) get(functionBuilderRegistryRegistryNativeTypes, 0));
            JSTypeRegistry functionBuilderRegistry1 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes1 = ((JSType) get(functionBuilderRegistry1RegistryNativeTypes, 1));
            JSTypeRegistry functionBuilderRegistry2 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes2 = ((JSType) get(functionBuilderRegistry2RegistryNativeTypes, 2));
            JSTypeRegistry functionBuilderRegistry3 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes3 = ((JSType) get(functionBuilderRegistry3RegistryNativeTypes, 3));
            JSTypeRegistry functionBuilderRegistry4 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes4 = ((JSType) get(functionBuilderRegistry4RegistryNativeTypes, 4));
            JSTypeRegistry functionBuilderRegistry5 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes5 = ((JSType) get(functionBuilderRegistry5RegistryNativeTypes, 5));
            JSTypeRegistry functionBuilderRegistry6 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes6 = ((JSType) get(functionBuilderRegistry6RegistryNativeTypes, 6));
            JSTypeRegistry functionBuilderRegistry7 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes7 = ((JSType) get(functionBuilderRegistry7RegistryNativeTypes, 7));
            JSTypeRegistry functionBuilderRegistry8 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes8 = ((JSType) get(functionBuilderRegistry8RegistryNativeTypes, 8));
            JSTypeRegistry functionBuilderRegistry9 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes9 = ((JSType) get(functionBuilderRegistry9RegistryNativeTypes, 9));
            JSTypeRegistry functionBuilderRegistry10 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes10 = ((JSType) get(functionBuilderRegistry10RegistryNativeTypes, 10));
            JSTypeRegistry functionBuilderRegistry11 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes11 = ((JSType) get(functionBuilderRegistry11RegistryNativeTypes, 11));
            JSTypeRegistry functionBuilderRegistry12 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes12 = ((JSType) get(functionBuilderRegistry12RegistryNativeTypes, 12));
            JSTypeRegistry functionBuilderRegistry13 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes13 = ((JSType) get(functionBuilderRegistry13RegistryNativeTypes, 13));
            JSTypeRegistry functionBuilderRegistry14 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes14 = ((JSType) get(functionBuilderRegistry14RegistryNativeTypes, 14));
            JSTypeRegistry functionBuilderRegistry15 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry15RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes15 = ((JSType) get(functionBuilderRegistry15RegistryNativeTypes, 15));
            JSTypeRegistry functionBuilderRegistry16 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry16RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes16 = ((JSType) get(functionBuilderRegistry16RegistryNativeTypes, 16));
            JSTypeRegistry functionBuilderRegistry17 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry17RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes17 = ((JSType) get(functionBuilderRegistry17RegistryNativeTypes, 17));
            JSTypeRegistry functionBuilderRegistry18 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry18RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes18 = ((JSType) get(functionBuilderRegistry18RegistryNativeTypes, 18));
            JSTypeRegistry functionBuilderRegistry19 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry19RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes19 = ((JSType) get(functionBuilderRegistry19RegistryNativeTypes, 19));
            JSTypeRegistry functionBuilderRegistry20 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry20RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes20 = ((JSType) get(functionBuilderRegistry20RegistryNativeTypes, 20));
            JSTypeRegistry functionBuilderRegistry21 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry21RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes21 = ((JSType) get(functionBuilderRegistry21RegistryNativeTypes, 21));
            JSTypeRegistry functionBuilderRegistry22 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry22RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes22 = ((JSType) get(functionBuilderRegistry22RegistryNativeTypes, 22));
            JSTypeRegistry functionBuilderRegistry23 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry23RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes23 = ((JSType) get(functionBuilderRegistry23RegistryNativeTypes, 23));
            JSTypeRegistry functionBuilderRegistry24 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry24RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes24 = ((JSType) get(functionBuilderRegistry24RegistryNativeTypes, 24));
            JSTypeRegistry functionBuilderRegistry25 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry25RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes25 = ((JSType) get(functionBuilderRegistry25RegistryNativeTypes, 25));
            JSTypeRegistry functionBuilderRegistry26 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry26RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes26 = ((JSType) get(functionBuilderRegistry26RegistryNativeTypes, 26));
            JSTypeRegistry functionBuilderRegistry27 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry27RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes27 = ((JSType) get(functionBuilderRegistry27RegistryNativeTypes, 27));
            JSTypeRegistry functionBuilderRegistry28 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry28RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes28 = ((JSType) get(functionBuilderRegistry28RegistryNativeTypes, 28));
            JSTypeRegistry functionBuilderRegistry29 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry29RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes29 = ((JSType) get(functionBuilderRegistry29RegistryNativeTypes, 29));
            JSTypeRegistry functionBuilderRegistry30 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry30RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes30 = ((JSType) get(functionBuilderRegistry30RegistryNativeTypes, 30));
            JSTypeRegistry functionBuilderRegistry31 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry31RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry31, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes31 = ((JSType) get(functionBuilderRegistry31RegistryNativeTypes, 31));
            JSTypeRegistry functionBuilderRegistry32 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry32RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry32, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes32 = ((JSType) get(functionBuilderRegistry32RegistryNativeTypes, 32));
            JSTypeRegistry functionBuilderRegistry33 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry33RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry33, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes33 = ((JSType) get(functionBuilderRegistry33RegistryNativeTypes, 33));
            JSTypeRegistry functionBuilderRegistry34 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry34RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry34, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes34 = ((JSType) get(functionBuilderRegistry34RegistryNativeTypes, 34));
            JSTypeRegistry functionBuilderRegistry35 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry35RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry35, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes35 = ((JSType) get(functionBuilderRegistry35RegistryNativeTypes, 35));
            JSTypeRegistry functionBuilderRegistry36 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry36RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry36, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes36 = ((JSType) get(functionBuilderRegistry36RegistryNativeTypes, 36));
            
            assertNull(finalFunctionBuilderRegistryNativeTypes0);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes1);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes2);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes3);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes4);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes5);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes6);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes7);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes8);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes9);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes10);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes11);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes12);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes13);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes14);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes15);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes16);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes17);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes18);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes19);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes20);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes21);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes22);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes23);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes24);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes25);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes26);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes27);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes28);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes29);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes30);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes31);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes32);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes33);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes34);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes35);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes36);
        } finally {
            setStaticField(emptyImmutableListClazz, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#build()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.returnsFrom {@code return new FunctionType(registry, name, sourceNode, new ArrowType(registry, parametersNode, returnType, inferredReturnType), typeOfThis, templateTypeName, isConstructor, isNativeType);}
 *  */
    @Test
    public void testBuild_Return_4() throws Exception  {
        Class emptyImmutableListClazz = Class.forName("com.google.common.collect.EmptyImmutableList");
        Object prevINSTANCE = getStaticFieldValue(emptyImmutableListClazz, "INSTANCE");
        try {
            Object instance = createInstance("com.google.common.collect.EmptyImmutableList");
            setStaticField(emptyImmutableListClazz, "INSTANCE", instance);
            FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
            JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
            com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
            setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry", registry);
            FunctionNode sourceNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
            sourceNode.setType(105);
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode", sourceNode);
            FunctionNode parametersNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "parametersNode", parametersNode);
            TemplateType returnType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "returnType", returnType);
            NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "typeOfThis", typeOfThis);
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "isConstructor", true);
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "isNativeType", true);
            
            FunctionType actual = functionBuilder.build();
            
            FunctionType expected = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
            ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
            setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parametersNode);
            setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
            setField(call, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
            setField(expected, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
            Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
            Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
            setField(expected, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            InstanceObjectType typeOfThis1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(typeOfThis1, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", expected);
            HashMap properties = new HashMap();
            setField(typeOfThis1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
            setField(typeOfThis1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(typeOfThis1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(typeOfThis1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
            setField(expected, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
            expected.setSource(sourceNode);
            List implementedInterfaces = new ArrayList();
            expected.setImplementedInterfaces(implementedInterfaces);
            HashMap properties1 = new HashMap();
            setField(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties1);
            setField(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(expected, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(expected, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
            
            ArrowType expectedCall = ((ArrowType) getFieldValue(expected, "com.google.javascript.rhino.jstype.FunctionType", "call"));
            ArrowType actualCall = ((ArrowType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call"));
            Node expectedCallParameters = expectedCall.parameters;
            Node actualCallParameters = actualCall.parameters;
            String actualCallParametersFunctionName = (((FunctionNode) actualCallParameters)).getFunctionName();
            assertNull(actualCallParametersFunctionName);
            
            boolean actualCallParametersItsNeedsActivation = ((Boolean) getFieldValue(actualCallParameters, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
            assertFalse(actualCallParametersItsNeedsActivation);
            
            int expectedCallParametersItsFunctionType = ((Integer) getFieldValue(expectedCallParameters, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
            int actualCallParametersItsFunctionType = ((Integer) getFieldValue(actualCallParameters, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
            assertEquals(expectedCallParametersItsFunctionType, actualCallParametersItsFunctionType);
            
            boolean actualCallParametersItsIgnoreDynamicScope = ((Boolean) getFieldValue(actualCallParameters, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
            assertFalse(actualCallParametersItsIgnoreDynamicScope);
            
            int expectedCallParametersEncodedSourceStart = (((ScriptOrFnNode) expectedCallParameters)).getEncodedSourceStart();
            int actualCallParametersEncodedSourceStart = (((ScriptOrFnNode) actualCallParameters)).getEncodedSourceStart();
            assertEquals(expectedCallParametersEncodedSourceStart, actualCallParametersEncodedSourceStart);
            
            int expectedCallParametersEncodedSourceEnd = (((ScriptOrFnNode) expectedCallParameters)).getEncodedSourceEnd();
            int actualCallParametersEncodedSourceEnd = (((ScriptOrFnNode) actualCallParameters)).getEncodedSourceEnd();
            assertEquals(expectedCallParametersEncodedSourceEnd, actualCallParametersEncodedSourceEnd);
            
            String actualCallParametersSourceName = (((ScriptOrFnNode) actualCallParameters)).getSourceName();
            assertNull(actualCallParametersSourceName);
            
            int expectedCallParametersBaseLineno = (((ScriptOrFnNode) expectedCallParameters)).getBaseLineno();
            int actualCallParametersBaseLineno = (((ScriptOrFnNode) actualCallParameters)).getBaseLineno();
            assertEquals(expectedCallParametersBaseLineno, actualCallParametersBaseLineno);
            
            int expectedCallParametersEndLineno = (((ScriptOrFnNode) expectedCallParameters)).getEndLineno();
            int actualCallParametersEndLineno = (((ScriptOrFnNode) actualCallParameters)).getEndLineno();
            assertEquals(expectedCallParametersEndLineno, actualCallParametersEndLineno);
            
            ObjArray actualCallParametersFunctions = ((ObjArray) getFieldValue(actualCallParameters, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
            assertNull(actualCallParametersFunctions);
            
            ObjArray actualCallParametersRegexps = ((ObjArray) getFieldValue(actualCallParameters, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
            assertNull(actualCallParametersRegexps);
            
            ObjArray actualCallParametersItsVariables = ((ObjArray) getFieldValue(actualCallParameters, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
            assertNull(actualCallParametersItsVariables);
            
            ObjArray actualCallParametersItsConst = ((ObjArray) getFieldValue(actualCallParameters, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
            assertNull(actualCallParametersItsConst);
            
            ObjToIntMap actualCallParametersItsVariableNames = ((ObjToIntMap) getFieldValue(actualCallParameters, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
            assertNull(actualCallParametersItsVariableNames);
            
            int expectedCallParametersVarStart = ((Integer) getFieldValue(expectedCallParameters, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
            int actualCallParametersVarStart = ((Integer) getFieldValue(actualCallParameters, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
            assertEquals(expectedCallParametersVarStart, actualCallParametersVarStart);
            
            Object actualCallParametersCompilerData = (((ScriptOrFnNode) actualCallParameters)).getCompilerData();
            assertNull(actualCallParametersCompilerData);
            
            int expectedCallParametersType = expectedCallParameters.getType();
            int actualCallParametersType = actualCallParameters.getType();
            assertEquals(expectedCallParametersType, actualCallParametersType);
            
            Node actualCallParametersNext = actualCallParameters.getNext();
            assertNull(actualCallParametersNext);
            
            Node actualCallParametersFirst = ((Node) getFieldValue(actualCallParameters, "com.google.javascript.rhino.Node", "first"));
            assertNull(actualCallParametersFirst);
            
            Node actualCallParametersLast = ((Node) getFieldValue(actualCallParameters, "com.google.javascript.rhino.Node", "last"));
            assertNull(actualCallParametersLast);
            
            Object actualCallParametersPropListHead = getFieldValue(actualCallParameters, "com.google.javascript.rhino.Node", "propListHead");
            assertNull(actualCallParametersPropListHead);
            
            int expectedCallParametersSourcePosition = ((Integer) getFieldValue(expectedCallParameters, "com.google.javascript.rhino.Node", "sourcePosition"));
            int actualCallParametersSourcePosition = ((Integer) getFieldValue(actualCallParameters, "com.google.javascript.rhino.Node", "sourcePosition"));
            assertEquals(expectedCallParametersSourcePosition, actualCallParametersSourcePosition);
            
            JSType actualCallParametersJsType = ((JSType) getFieldValue(actualCallParameters, "com.google.javascript.rhino.Node", "jsType"));
            assertNull(actualCallParametersJsType);
            
            Node actualCallParametersParent = actualCallParameters.getParent();
            assertNull(actualCallParametersParent);
            
            JSType expectedCallReturnType = expectedCall.returnType;
            JSType actualCallReturnType = actualCall.returnType;
            // com.google.javascript.rhino.jstype.JSType has overridden equals method
            assertEquals(expectedCallReturnType, actualCallReturnType);
            
            boolean actualCallReturnTypeInferred = actualCall.returnTypeInferred;
            assertFalse(actualCallReturnTypeInferred);
            
            boolean actualCallResolved = ((Boolean) getFieldValue(actualCall, "com.google.javascript.rhino.jstype.JSType", "resolved"));
            assertFalse(actualCallResolved);
            
            JSType actualCallResolveResult = ((JSType) getFieldValue(actualCall, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
            assertNull(actualCallResolveResult);
            
            JSTypeRegistry expectedCallRegistry = expectedCall.registry;
            JSTypeRegistry actualCallRegistry = actualCall.registry;
            ErrorReporter actualCallRegistryReporter = ((ErrorReporter) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
            assertNull(actualCallRegistryReporter);
            
            com.google.javascript.rhino.jstype.JSType[] expectedCallRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(expectedCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            com.google.javascript.rhino.jstype.JSType[] actualCallRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            int expectedCallRegistryNativeTypesSize = expectedCallRegistryNativeTypes.length;
            assertEquals(expectedCallRegistryNativeTypesSize, actualCallRegistryNativeTypes.length);
            assertTrue(deepEquals(expectedCallRegistryNativeTypes, actualCallRegistryNativeTypes));
            
            Map actualCallRegistryNamesToTypes = ((Map) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
            assertNull(actualCallRegistryNamesToTypes);
            
            Set actualCallRegistryNamespaces = ((Set) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
            assertNull(actualCallRegistryNamespaces);
            
            Set actualCallRegistryEnumTypeNames = ((Set) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "enumTypeNames"));
            assertNull(actualCallRegistryEnumTypeNames);
            
            Set actualCallRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
            assertNull(actualCallRegistryForwardDeclaredTypes);
            
            Map actualCallRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
            assertNull(actualCallRegistryTypesIndexedByProperty);
            
            Map actualCallRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
            assertNull(actualCallRegistryGreatestSubtypeByProperty);
            
            Multimap actualCallRegistryInterfaceToImplementors = ((Multimap) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
            assertNull(actualCallRegistryInterfaceToImplementors);
            
            Multimap actualCallRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
            assertNull(actualCallRegistryUnresolvedNamedTypes);
            
            Multimap actualCallRegistryResolvedNamedTypes = ((Multimap) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
            assertNull(actualCallRegistryResolvedNamedTypes);
            
            boolean actualCallRegistryLastGeneration = ((Boolean) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "lastGeneration"));
            assertFalse(actualCallRegistryLastGeneration);
            
            String actualCallRegistryTemplateTypeName = ((String) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypeName"));
            assertNull(actualCallRegistryTemplateTypeName);
            
            TemplateType actualCallRegistryTemplateType = ((TemplateType) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
            assertNull(actualCallRegistryTemplateType);
            
            boolean actualCallRegistryTolerateUndefinedValues = ((Boolean) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "tolerateUndefinedValues"));
            assertFalse(actualCallRegistryTolerateUndefinedValues);
            
            JSTypeRegistry.ResolveMode actualCallRegistryResolveMode = actualCallRegistry.getResolveMode();
            assertNull(actualCallRegistryResolveMode);
            
            FunctionPrototypeType actualPrototype = actual.getPrototype();
            assertNull(actualPrototype);
            
            Object expectedKind = getFieldValue(expected, "com.google.javascript.rhino.jstype.FunctionType", "kind");
            Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
            assertEquals(expectedKind, actualKind);
            
            ObjectType expectedTypeOfThis = expected.getTypeOfThis();
            ObjectType actualTypeOfThis = actual.getTypeOfThis();
            FunctionType expectedTypeOfThisConstructor = (((InstanceObjectType) expectedTypeOfThis)).getConstructor();
            FunctionType actualTypeOfThisConstructor = (((InstanceObjectType) actualTypeOfThis)).getConstructor();
            assertTrue(deepEquals(expectedTypeOfThisConstructor, actualTypeOfThisConstructor));
            assertTrue(deepEquals(expectedTypeOfThisConstructor, actualTypeOfThisConstructor));
            assertTrue(deepEquals(expectedTypeOfThisConstructor, actualTypeOfThisConstructor));
            assertTrue(deepEquals(expectedTypeOfThisConstructor, actualTypeOfThisConstructor));
            Node expectedTypeOfThisConstructorSource = expectedTypeOfThisConstructor.getSource();
            Node actualTypeOfThisConstructorSource = actualTypeOfThisConstructor.getSource();
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            int expectedTypeOfThisConstructorSourceType = expectedTypeOfThisConstructorSource.getType();
            int actualTypeOfThisConstructorSourceType = actualTypeOfThisConstructorSource.getType();
            assertEquals(expectedTypeOfThisConstructorSourceType, actualTypeOfThisConstructorSourceType);
            
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            
            List expectedTypeOfThisConstructorImplementedInterfaces = ((List) getFieldValue(expectedTypeOfThisConstructor, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
            List actualTypeOfThisConstructorImplementedInterfaces = ((List) getFieldValue(actualTypeOfThisConstructor, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
            assertTrue(deepEquals(expectedTypeOfThisConstructorImplementedInterfaces, actualTypeOfThisConstructorImplementedInterfaces));
            
            List actualTypeOfThisConstructorSubTypes = actualTypeOfThisConstructor.getSubTypes();
            assertNull(actualTypeOfThisConstructorSubTypes);
            
            String actualTypeOfThisConstructorTemplateTypeName = actualTypeOfThisConstructor.getTemplateTypeName();
            assertNull(actualTypeOfThisConstructorTemplateTypeName);
            
            String actualTypeOfThisConstructorClassName = ((String) getFieldValue(actualTypeOfThisConstructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
            assertNull(actualTypeOfThisConstructorClassName);
            
            Map expectedTypeOfThisConstructorProperties = ((Map) getFieldValue(expectedTypeOfThisConstructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
            Map actualTypeOfThisConstructorProperties = ((Map) getFieldValue(actualTypeOfThisConstructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
            assertTrue(deepEquals(expectedTypeOfThisConstructorProperties, actualTypeOfThisConstructorProperties));
            
            ObjectType actualTypeOfThisConstructorImplicitPrototype = actualTypeOfThisConstructor.getImplicitPrototype();
            assertNull(actualTypeOfThisConstructorImplicitPrototype);
            
            boolean actualTypeOfThisConstructorNativeType = ((Boolean) getFieldValue(actualTypeOfThisConstructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
            assertTrue(actualTypeOfThisConstructorNativeType);
            
            boolean actualTypeOfThisConstructorPrettyPrint = ((Boolean) getFieldValue(actualTypeOfThisConstructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
            assertFalse(actualTypeOfThisConstructorPrettyPrint);
            
            boolean actualTypeOfThisConstructorVisited = ((Boolean) getFieldValue(actualTypeOfThisConstructor, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
            assertFalse(actualTypeOfThisConstructorVisited);
            
            JSDocInfo actualTypeOfThisConstructorDocInfo = ((JSDocInfo) getFieldValue(actualTypeOfThisConstructor, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
            assertNull(actualTypeOfThisConstructorDocInfo);
            
            boolean actualTypeOfThisConstructorUnknown = ((Boolean) getFieldValue(actualTypeOfThisConstructor, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
            assertTrue(actualTypeOfThisConstructorUnknown);
            
            assertTrue(deepEquals(expectedTypeOfThisConstructor, actualTypeOfThisConstructor));
            assertTrue(deepEquals(expectedTypeOfThisConstructor, actualTypeOfThisConstructor));
            assertTrue(deepEquals(expectedTypeOfThisConstructor, actualTypeOfThisConstructor));
            
            assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
            Map expectedTypeOfThisProperties = ((Map) getFieldValue(expectedTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
            Map actualTypeOfThisProperties = ((Map) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
            assertTrue(deepEquals(expectedTypeOfThisProperties, actualTypeOfThisProperties));
            
            assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
            assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
            assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
            assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
            assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
            assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
            assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
            assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
            assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
            
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            
            JSTypeRegistry functionBuilderRegistry = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes0 = ((JSType) get(functionBuilderRegistryRegistryNativeTypes, 0));
            JSTypeRegistry functionBuilderRegistry1 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes1 = ((JSType) get(functionBuilderRegistry1RegistryNativeTypes, 1));
            JSTypeRegistry functionBuilderRegistry2 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes2 = ((JSType) get(functionBuilderRegistry2RegistryNativeTypes, 2));
            JSTypeRegistry functionBuilderRegistry3 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes3 = ((JSType) get(functionBuilderRegistry3RegistryNativeTypes, 3));
            JSTypeRegistry functionBuilderRegistry4 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes4 = ((JSType) get(functionBuilderRegistry4RegistryNativeTypes, 4));
            JSTypeRegistry functionBuilderRegistry5 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes5 = ((JSType) get(functionBuilderRegistry5RegistryNativeTypes, 5));
            JSTypeRegistry functionBuilderRegistry6 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes6 = ((JSType) get(functionBuilderRegistry6RegistryNativeTypes, 6));
            JSTypeRegistry functionBuilderRegistry7 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes7 = ((JSType) get(functionBuilderRegistry7RegistryNativeTypes, 7));
            JSTypeRegistry functionBuilderRegistry8 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes8 = ((JSType) get(functionBuilderRegistry8RegistryNativeTypes, 8));
            JSTypeRegistry functionBuilderRegistry9 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes9 = ((JSType) get(functionBuilderRegistry9RegistryNativeTypes, 9));
            JSTypeRegistry functionBuilderRegistry10 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes10 = ((JSType) get(functionBuilderRegistry10RegistryNativeTypes, 10));
            JSTypeRegistry functionBuilderRegistry11 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes11 = ((JSType) get(functionBuilderRegistry11RegistryNativeTypes, 11));
            JSTypeRegistry functionBuilderRegistry12 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes12 = ((JSType) get(functionBuilderRegistry12RegistryNativeTypes, 12));
            JSTypeRegistry functionBuilderRegistry13 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes13 = ((JSType) get(functionBuilderRegistry13RegistryNativeTypes, 13));
            
            assertNull(finalFunctionBuilderRegistryNativeTypes0);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes1);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes2);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes3);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes4);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes5);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes6);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes7);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes8);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes9);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes10);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes11);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes12);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes13);
        } finally {
            setStaticField(emptyImmutableListClazz, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#build()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return new FunctionType(registry, name, sourceNode, new ArrowType(registry, parametersNode, returnType, inferredReturnType), typeOfThis, templateTypeName, isConstructor, isNativeType);}
 *  */
    @Test
    public void testBuild_Return_3() throws Exception  {
        Class emptyImmutableListClazz = Class.forName("com.google.common.collect.EmptyImmutableList");
        Object prevINSTANCE = getStaticFieldValue(emptyImmutableListClazz, "INSTANCE");
        try {
            Object instance = createInstance("com.google.common.collect.EmptyImmutableList");
            setStaticField(emptyImmutableListClazz, "INSTANCE", instance);
            FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
            JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
            com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
            setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry", registry);
            FunctionNode sourceNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
            sourceNode.setType(105);
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode", sourceNode);
            FunctionNode parametersNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "parametersNode", parametersNode);
            TemplateType returnType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "returnType", returnType);
            String templateTypeName = "";
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "templateTypeName", templateTypeName);
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "isConstructor", true);
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "isNativeType", true);
            
            FunctionType actual = functionBuilder.build();
            
            FunctionType expected = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
            ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
            setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parametersNode);
            setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
            setField(call, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
            setField(expected, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
            Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
            Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
            setField(expected, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            InstanceObjectType typeOfThis = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(typeOfThis, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", expected);
            HashMap properties = new HashMap();
            setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
            setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(typeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(typeOfThis, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
            setField(expected, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
            expected.setSource(sourceNode);
            List implementedInterfaces = new ArrayList();
            expected.setImplementedInterfaces(implementedInterfaces);
            setField(expected, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeName", templateTypeName);
            HashMap properties1 = new HashMap();
            setField(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties1);
            setField(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(expected, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(expected, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
            
            ArrowType expectedCall = ((ArrowType) getFieldValue(expected, "com.google.javascript.rhino.jstype.FunctionType", "call"));
            ArrowType actualCall = ((ArrowType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call"));
            Node expectedCallParameters = expectedCall.parameters;
            Node actualCallParameters = actualCall.parameters;
            String actualCallParametersFunctionName = (((FunctionNode) actualCallParameters)).getFunctionName();
            assertNull(actualCallParametersFunctionName);
            
            boolean actualCallParametersItsNeedsActivation = ((Boolean) getFieldValue(actualCallParameters, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
            assertFalse(actualCallParametersItsNeedsActivation);
            
            int expectedCallParametersItsFunctionType = ((Integer) getFieldValue(expectedCallParameters, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
            int actualCallParametersItsFunctionType = ((Integer) getFieldValue(actualCallParameters, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
            assertEquals(expectedCallParametersItsFunctionType, actualCallParametersItsFunctionType);
            
            boolean actualCallParametersItsIgnoreDynamicScope = ((Boolean) getFieldValue(actualCallParameters, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
            assertFalse(actualCallParametersItsIgnoreDynamicScope);
            
            int expectedCallParametersEncodedSourceStart = (((ScriptOrFnNode) expectedCallParameters)).getEncodedSourceStart();
            int actualCallParametersEncodedSourceStart = (((ScriptOrFnNode) actualCallParameters)).getEncodedSourceStart();
            assertEquals(expectedCallParametersEncodedSourceStart, actualCallParametersEncodedSourceStart);
            
            int expectedCallParametersEncodedSourceEnd = (((ScriptOrFnNode) expectedCallParameters)).getEncodedSourceEnd();
            int actualCallParametersEncodedSourceEnd = (((ScriptOrFnNode) actualCallParameters)).getEncodedSourceEnd();
            assertEquals(expectedCallParametersEncodedSourceEnd, actualCallParametersEncodedSourceEnd);
            
            String actualCallParametersSourceName = (((ScriptOrFnNode) actualCallParameters)).getSourceName();
            assertNull(actualCallParametersSourceName);
            
            int expectedCallParametersBaseLineno = (((ScriptOrFnNode) expectedCallParameters)).getBaseLineno();
            int actualCallParametersBaseLineno = (((ScriptOrFnNode) actualCallParameters)).getBaseLineno();
            assertEquals(expectedCallParametersBaseLineno, actualCallParametersBaseLineno);
            
            int expectedCallParametersEndLineno = (((ScriptOrFnNode) expectedCallParameters)).getEndLineno();
            int actualCallParametersEndLineno = (((ScriptOrFnNode) actualCallParameters)).getEndLineno();
            assertEquals(expectedCallParametersEndLineno, actualCallParametersEndLineno);
            
            ObjArray actualCallParametersFunctions = ((ObjArray) getFieldValue(actualCallParameters, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
            assertNull(actualCallParametersFunctions);
            
            ObjArray actualCallParametersRegexps = ((ObjArray) getFieldValue(actualCallParameters, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
            assertNull(actualCallParametersRegexps);
            
            ObjArray actualCallParametersItsVariables = ((ObjArray) getFieldValue(actualCallParameters, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
            assertNull(actualCallParametersItsVariables);
            
            ObjArray actualCallParametersItsConst = ((ObjArray) getFieldValue(actualCallParameters, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
            assertNull(actualCallParametersItsConst);
            
            ObjToIntMap actualCallParametersItsVariableNames = ((ObjToIntMap) getFieldValue(actualCallParameters, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
            assertNull(actualCallParametersItsVariableNames);
            
            int expectedCallParametersVarStart = ((Integer) getFieldValue(expectedCallParameters, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
            int actualCallParametersVarStart = ((Integer) getFieldValue(actualCallParameters, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
            assertEquals(expectedCallParametersVarStart, actualCallParametersVarStart);
            
            Object actualCallParametersCompilerData = (((ScriptOrFnNode) actualCallParameters)).getCompilerData();
            assertNull(actualCallParametersCompilerData);
            
            int expectedCallParametersType = expectedCallParameters.getType();
            int actualCallParametersType = actualCallParameters.getType();
            assertEquals(expectedCallParametersType, actualCallParametersType);
            
            Node actualCallParametersNext = actualCallParameters.getNext();
            assertNull(actualCallParametersNext);
            
            Node actualCallParametersFirst = ((Node) getFieldValue(actualCallParameters, "com.google.javascript.rhino.Node", "first"));
            assertNull(actualCallParametersFirst);
            
            Node actualCallParametersLast = ((Node) getFieldValue(actualCallParameters, "com.google.javascript.rhino.Node", "last"));
            assertNull(actualCallParametersLast);
            
            Object actualCallParametersPropListHead = getFieldValue(actualCallParameters, "com.google.javascript.rhino.Node", "propListHead");
            assertNull(actualCallParametersPropListHead);
            
            int expectedCallParametersSourcePosition = ((Integer) getFieldValue(expectedCallParameters, "com.google.javascript.rhino.Node", "sourcePosition"));
            int actualCallParametersSourcePosition = ((Integer) getFieldValue(actualCallParameters, "com.google.javascript.rhino.Node", "sourcePosition"));
            assertEquals(expectedCallParametersSourcePosition, actualCallParametersSourcePosition);
            
            JSType actualCallParametersJsType = ((JSType) getFieldValue(actualCallParameters, "com.google.javascript.rhino.Node", "jsType"));
            assertNull(actualCallParametersJsType);
            
            Node actualCallParametersParent = actualCallParameters.getParent();
            assertNull(actualCallParametersParent);
            
            JSType expectedCallReturnType = expectedCall.returnType;
            JSType actualCallReturnType = actualCall.returnType;
            // com.google.javascript.rhino.jstype.JSType has overridden equals method
            assertEquals(expectedCallReturnType, actualCallReturnType);
            
            boolean actualCallReturnTypeInferred = actualCall.returnTypeInferred;
            assertFalse(actualCallReturnTypeInferred);
            
            boolean actualCallResolved = ((Boolean) getFieldValue(actualCall, "com.google.javascript.rhino.jstype.JSType", "resolved"));
            assertFalse(actualCallResolved);
            
            JSType actualCallResolveResult = ((JSType) getFieldValue(actualCall, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
            assertNull(actualCallResolveResult);
            
            JSTypeRegistry expectedCallRegistry = expectedCall.registry;
            JSTypeRegistry actualCallRegistry = actualCall.registry;
            ErrorReporter actualCallRegistryReporter = ((ErrorReporter) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
            assertNull(actualCallRegistryReporter);
            
            com.google.javascript.rhino.jstype.JSType[] expectedCallRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(expectedCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            com.google.javascript.rhino.jstype.JSType[] actualCallRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            int expectedCallRegistryNativeTypesSize = expectedCallRegistryNativeTypes.length;
            assertEquals(expectedCallRegistryNativeTypesSize, actualCallRegistryNativeTypes.length);
            assertTrue(deepEquals(expectedCallRegistryNativeTypes, actualCallRegistryNativeTypes));
            
            Map actualCallRegistryNamesToTypes = ((Map) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
            assertNull(actualCallRegistryNamesToTypes);
            
            Set actualCallRegistryNamespaces = ((Set) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
            assertNull(actualCallRegistryNamespaces);
            
            Set actualCallRegistryEnumTypeNames = ((Set) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "enumTypeNames"));
            assertNull(actualCallRegistryEnumTypeNames);
            
            Set actualCallRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
            assertNull(actualCallRegistryForwardDeclaredTypes);
            
            Map actualCallRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
            assertNull(actualCallRegistryTypesIndexedByProperty);
            
            Map actualCallRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
            assertNull(actualCallRegistryGreatestSubtypeByProperty);
            
            Multimap actualCallRegistryInterfaceToImplementors = ((Multimap) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
            assertNull(actualCallRegistryInterfaceToImplementors);
            
            Multimap actualCallRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
            assertNull(actualCallRegistryUnresolvedNamedTypes);
            
            Multimap actualCallRegistryResolvedNamedTypes = ((Multimap) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
            assertNull(actualCallRegistryResolvedNamedTypes);
            
            boolean actualCallRegistryLastGeneration = ((Boolean) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "lastGeneration"));
            assertFalse(actualCallRegistryLastGeneration);
            
            String actualCallRegistryTemplateTypeName = ((String) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypeName"));
            assertNull(actualCallRegistryTemplateTypeName);
            
            TemplateType actualCallRegistryTemplateType = ((TemplateType) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
            assertNull(actualCallRegistryTemplateType);
            
            boolean actualCallRegistryTolerateUndefinedValues = ((Boolean) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "tolerateUndefinedValues"));
            assertFalse(actualCallRegistryTolerateUndefinedValues);
            
            JSTypeRegistry.ResolveMode actualCallRegistryResolveMode = actualCallRegistry.getResolveMode();
            assertNull(actualCallRegistryResolveMode);
            
            FunctionPrototypeType actualPrototype = actual.getPrototype();
            assertNull(actualPrototype);
            
            Object expectedKind = getFieldValue(expected, "com.google.javascript.rhino.jstype.FunctionType", "kind");
            Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
            assertEquals(expectedKind, actualKind);
            
            ObjectType expectedTypeOfThis = expected.getTypeOfThis();
            ObjectType actualTypeOfThis = actual.getTypeOfThis();
            FunctionType expectedTypeOfThisConstructor = (((InstanceObjectType) expectedTypeOfThis)).getConstructor();
            FunctionType actualTypeOfThisConstructor = (((InstanceObjectType) actualTypeOfThis)).getConstructor();
            assertTrue(deepEquals(expectedTypeOfThisConstructor, actualTypeOfThisConstructor));
            assertTrue(deepEquals(expectedTypeOfThisConstructor, actualTypeOfThisConstructor));
            assertTrue(deepEquals(expectedTypeOfThisConstructor, actualTypeOfThisConstructor));
            assertTrue(deepEquals(expectedTypeOfThisConstructor, actualTypeOfThisConstructor));
            Node expectedTypeOfThisConstructorSource = expectedTypeOfThisConstructor.getSource();
            Node actualTypeOfThisConstructorSource = actualTypeOfThisConstructor.getSource();
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            int expectedTypeOfThisConstructorSourceType = expectedTypeOfThisConstructorSource.getType();
            int actualTypeOfThisConstructorSourceType = actualTypeOfThisConstructorSource.getType();
            assertEquals(expectedTypeOfThisConstructorSourceType, actualTypeOfThisConstructorSourceType);
            
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            
            List expectedTypeOfThisConstructorImplementedInterfaces = ((List) getFieldValue(expectedTypeOfThisConstructor, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
            List actualTypeOfThisConstructorImplementedInterfaces = ((List) getFieldValue(actualTypeOfThisConstructor, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
            assertTrue(deepEquals(expectedTypeOfThisConstructorImplementedInterfaces, actualTypeOfThisConstructorImplementedInterfaces));
            
            List actualTypeOfThisConstructorSubTypes = actualTypeOfThisConstructor.getSubTypes();
            assertNull(actualTypeOfThisConstructorSubTypes);
            
            String expectedTypeOfThisConstructorTemplateTypeName = expectedTypeOfThisConstructor.getTemplateTypeName();
            String actualTypeOfThisConstructorTemplateTypeName = actualTypeOfThisConstructor.getTemplateTypeName();
            assertEquals(expectedTypeOfThisConstructorTemplateTypeName, actualTypeOfThisConstructorTemplateTypeName);
            
            String actualTypeOfThisConstructorClassName = ((String) getFieldValue(actualTypeOfThisConstructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
            assertNull(actualTypeOfThisConstructorClassName);
            
            Map expectedTypeOfThisConstructorProperties = ((Map) getFieldValue(expectedTypeOfThisConstructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
            Map actualTypeOfThisConstructorProperties = ((Map) getFieldValue(actualTypeOfThisConstructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
            assertTrue(deepEquals(expectedTypeOfThisConstructorProperties, actualTypeOfThisConstructorProperties));
            
            ObjectType actualTypeOfThisConstructorImplicitPrototype = actualTypeOfThisConstructor.getImplicitPrototype();
            assertNull(actualTypeOfThisConstructorImplicitPrototype);
            
            boolean actualTypeOfThisConstructorNativeType = ((Boolean) getFieldValue(actualTypeOfThisConstructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
            assertTrue(actualTypeOfThisConstructorNativeType);
            
            boolean actualTypeOfThisConstructorPrettyPrint = ((Boolean) getFieldValue(actualTypeOfThisConstructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
            assertFalse(actualTypeOfThisConstructorPrettyPrint);
            
            boolean actualTypeOfThisConstructorVisited = ((Boolean) getFieldValue(actualTypeOfThisConstructor, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
            assertFalse(actualTypeOfThisConstructorVisited);
            
            JSDocInfo actualTypeOfThisConstructorDocInfo = ((JSDocInfo) getFieldValue(actualTypeOfThisConstructor, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
            assertNull(actualTypeOfThisConstructorDocInfo);
            
            boolean actualTypeOfThisConstructorUnknown = ((Boolean) getFieldValue(actualTypeOfThisConstructor, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
            assertTrue(actualTypeOfThisConstructorUnknown);
            
            assertTrue(deepEquals(expectedTypeOfThisConstructor, actualTypeOfThisConstructor));
            assertTrue(deepEquals(expectedTypeOfThisConstructor, actualTypeOfThisConstructor));
            assertTrue(deepEquals(expectedTypeOfThisConstructor, actualTypeOfThisConstructor));
            
            assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
            Map expectedTypeOfThisProperties = ((Map) getFieldValue(expectedTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
            Map actualTypeOfThisProperties = ((Map) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
            assertTrue(deepEquals(expectedTypeOfThisProperties, actualTypeOfThisProperties));
            
            assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
            assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
            assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
            assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
            assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
            assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
            assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
            assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
            assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
            
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            
            JSTypeRegistry functionBuilderRegistry = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes0 = ((JSType) get(functionBuilderRegistryRegistryNativeTypes, 0));
            JSTypeRegistry functionBuilderRegistry1 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes1 = ((JSType) get(functionBuilderRegistry1RegistryNativeTypes, 1));
            JSTypeRegistry functionBuilderRegistry2 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes2 = ((JSType) get(functionBuilderRegistry2RegistryNativeTypes, 2));
            JSTypeRegistry functionBuilderRegistry3 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes3 = ((JSType) get(functionBuilderRegistry3RegistryNativeTypes, 3));
            JSTypeRegistry functionBuilderRegistry4 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes4 = ((JSType) get(functionBuilderRegistry4RegistryNativeTypes, 4));
            JSTypeRegistry functionBuilderRegistry5 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes5 = ((JSType) get(functionBuilderRegistry5RegistryNativeTypes, 5));
            JSTypeRegistry functionBuilderRegistry6 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes6 = ((JSType) get(functionBuilderRegistry6RegistryNativeTypes, 6));
            JSTypeRegistry functionBuilderRegistry7 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes7 = ((JSType) get(functionBuilderRegistry7RegistryNativeTypes, 7));
            JSTypeRegistry functionBuilderRegistry8 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes8 = ((JSType) get(functionBuilderRegistry8RegistryNativeTypes, 8));
            JSTypeRegistry functionBuilderRegistry9 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes9 = ((JSType) get(functionBuilderRegistry9RegistryNativeTypes, 9));
            JSTypeRegistry functionBuilderRegistry10 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes10 = ((JSType) get(functionBuilderRegistry10RegistryNativeTypes, 10));
            JSTypeRegistry functionBuilderRegistry11 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes11 = ((JSType) get(functionBuilderRegistry11RegistryNativeTypes, 11));
            JSTypeRegistry functionBuilderRegistry12 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes12 = ((JSType) get(functionBuilderRegistry12RegistryNativeTypes, 12));
            JSTypeRegistry functionBuilderRegistry13 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes13 = ((JSType) get(functionBuilderRegistry13RegistryNativeTypes, 13));
            
            assertNull(finalFunctionBuilderRegistryNativeTypes0);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes1);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes2);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes3);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes4);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes5);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes6);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes7);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes8);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes9);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes10);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes11);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes12);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes13);
        } finally {
            setStaticField(emptyImmutableListClazz, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#build()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.returnsFrom {@code return new FunctionType(registry, name, sourceNode, new ArrowType(registry, parametersNode, returnType, inferredReturnType), typeOfThis, templateTypeName, isConstructor, isNativeType);}
 *  */
    @Test
    public void testBuild_Return() throws Exception  {
        Class emptyImmutableListClazz = Class.forName("com.google.common.collect.EmptyImmutableList");
        Object prevINSTANCE = getStaticFieldValue(emptyImmutableListClazz, "INSTANCE");
        try {
            Object instance = createInstance("com.google.common.collect.EmptyImmutableList");
            setStaticField(emptyImmutableListClazz, "INSTANCE", instance);
            FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
            JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
            com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
            setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry", registry);
            Node parametersNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "parametersNode", parametersNode);
            NoObjectType returnType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "returnType", returnType);
            NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "typeOfThis", typeOfThis);
            String templateTypeName = "";
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "templateTypeName", templateTypeName);
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "isNativeType", true);
            
            FunctionType actual = functionBuilder.build();
            
            FunctionType expected = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
            ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
            setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parametersNode);
            setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
            setField(call, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
            setField(expected, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
            Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
            Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
            setField(expected, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            setField(expected, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
            List implementedInterfaces = new ArrayList();
            expected.setImplementedInterfaces(implementedInterfaces);
            setField(expected, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeName", templateTypeName);
            HashMap properties = new HashMap();
            setField(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
            setField(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(expected, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(expected, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
            
            ArrowType expectedCall = ((ArrowType) getFieldValue(expected, "com.google.javascript.rhino.jstype.FunctionType", "call"));
            ArrowType actualCall = ((ArrowType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call"));
            Node expectedCallParameters = expectedCall.parameters;
            Node actualCallParameters = actualCall.parameters;
            int expectedCallParametersType = expectedCallParameters.getType();
            int actualCallParametersType = actualCallParameters.getType();
            assertEquals(expectedCallParametersType, actualCallParametersType);
            
            Node actualCallParametersNext = actualCallParameters.getNext();
            assertNull(actualCallParametersNext);
            
            Node actualCallParametersFirst = ((Node) getFieldValue(actualCallParameters, "com.google.javascript.rhino.Node", "first"));
            assertNull(actualCallParametersFirst);
            
            Node actualCallParametersLast = ((Node) getFieldValue(actualCallParameters, "com.google.javascript.rhino.Node", "last"));
            assertNull(actualCallParametersLast);
            
            Object actualCallParametersPropListHead = getFieldValue(actualCallParameters, "com.google.javascript.rhino.Node", "propListHead");
            assertNull(actualCallParametersPropListHead);
            
            int expectedCallParametersSourcePosition = ((Integer) getFieldValue(expectedCallParameters, "com.google.javascript.rhino.Node", "sourcePosition"));
            int actualCallParametersSourcePosition = ((Integer) getFieldValue(actualCallParameters, "com.google.javascript.rhino.Node", "sourcePosition"));
            assertEquals(expectedCallParametersSourcePosition, actualCallParametersSourcePosition);
            
            JSType actualCallParametersJsType = ((JSType) getFieldValue(actualCallParameters, "com.google.javascript.rhino.Node", "jsType"));
            assertNull(actualCallParametersJsType);
            
            Node actualCallParametersParent = actualCallParameters.getParent();
            assertNull(actualCallParametersParent);
            
            JSType expectedCallReturnType = expectedCall.returnType;
            JSType actualCallReturnType = actualCall.returnType;
            // com.google.javascript.rhino.jstype.JSType has overridden equals method
            assertEquals(expectedCallReturnType, actualCallReturnType);
            
            boolean actualCallReturnTypeInferred = actualCall.returnTypeInferred;
            assertFalse(actualCallReturnTypeInferred);
            
            boolean actualCallResolved = ((Boolean) getFieldValue(actualCall, "com.google.javascript.rhino.jstype.JSType", "resolved"));
            assertFalse(actualCallResolved);
            
            JSType actualCallResolveResult = ((JSType) getFieldValue(actualCall, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
            assertNull(actualCallResolveResult);
            
            JSTypeRegistry expectedCallRegistry = expectedCall.registry;
            JSTypeRegistry actualCallRegistry = actualCall.registry;
            ErrorReporter actualCallRegistryReporter = ((ErrorReporter) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
            assertNull(actualCallRegistryReporter);
            
            com.google.javascript.rhino.jstype.JSType[] expectedCallRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(expectedCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            com.google.javascript.rhino.jstype.JSType[] actualCallRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            int expectedCallRegistryNativeTypesSize = expectedCallRegistryNativeTypes.length;
            assertEquals(expectedCallRegistryNativeTypesSize, actualCallRegistryNativeTypes.length);
            assertTrue(deepEquals(expectedCallRegistryNativeTypes, actualCallRegistryNativeTypes));
            
            Map actualCallRegistryNamesToTypes = ((Map) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
            assertNull(actualCallRegistryNamesToTypes);
            
            Set actualCallRegistryNamespaces = ((Set) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
            assertNull(actualCallRegistryNamespaces);
            
            Set actualCallRegistryEnumTypeNames = ((Set) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "enumTypeNames"));
            assertNull(actualCallRegistryEnumTypeNames);
            
            Set actualCallRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
            assertNull(actualCallRegistryForwardDeclaredTypes);
            
            Map actualCallRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
            assertNull(actualCallRegistryTypesIndexedByProperty);
            
            Map actualCallRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
            assertNull(actualCallRegistryGreatestSubtypeByProperty);
            
            Multimap actualCallRegistryInterfaceToImplementors = ((Multimap) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
            assertNull(actualCallRegistryInterfaceToImplementors);
            
            Multimap actualCallRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
            assertNull(actualCallRegistryUnresolvedNamedTypes);
            
            Multimap actualCallRegistryResolvedNamedTypes = ((Multimap) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
            assertNull(actualCallRegistryResolvedNamedTypes);
            
            boolean actualCallRegistryLastGeneration = ((Boolean) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "lastGeneration"));
            assertFalse(actualCallRegistryLastGeneration);
            
            String actualCallRegistryTemplateTypeName = ((String) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypeName"));
            assertNull(actualCallRegistryTemplateTypeName);
            
            TemplateType actualCallRegistryTemplateType = ((TemplateType) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
            assertNull(actualCallRegistryTemplateType);
            
            boolean actualCallRegistryTolerateUndefinedValues = ((Boolean) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "tolerateUndefinedValues"));
            assertFalse(actualCallRegistryTolerateUndefinedValues);
            
            JSTypeRegistry.ResolveMode actualCallRegistryResolveMode = actualCallRegistry.getResolveMode();
            assertNull(actualCallRegistryResolveMode);
            
            FunctionPrototypeType actualPrototype = actual.getPrototype();
            assertNull(actualPrototype);
            
            Object expectedKind = getFieldValue(expected, "com.google.javascript.rhino.jstype.FunctionType", "kind");
            Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
            assertEquals(expectedKind, actualKind);
            
            ObjectType expectedTypeOfThis = expected.getTypeOfThis();
            ObjectType actualTypeOfThis = actual.getTypeOfThis();
            Visitor actualTypeOfThisLeastSupertypeVisitor = ((Visitor) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.NoObjectType", "leastSupertypeVisitor"));
            assertNull(actualTypeOfThisLeastSupertypeVisitor);
            
            Visitor actualTypeOfThisGreatestSubtypeVisitor = ((Visitor) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.NoObjectType", "greatestSubtypeVisitor"));
            assertNull(actualTypeOfThisGreatestSubtypeVisitor);
            
            ArrowType actualTypeOfThisCall = ((ArrowType) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "call"));
            assertNull(actualTypeOfThisCall);
            
            assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
            Object actualTypeOfThisKind = getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "kind");
            assertNull(actualTypeOfThisKind);
            
            ObjectType actualTypeOfThisTypeOfThis = (((FunctionType) actualTypeOfThis)).getTypeOfThis();
            assertNull(actualTypeOfThisTypeOfThis);
            
            Node actualTypeOfThisSource = (((FunctionType) actualTypeOfThis)).getSource();
            assertNull(actualTypeOfThisSource);
            
            List actualTypeOfThisImplementedInterfaces = ((List) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
            assertNull(actualTypeOfThisImplementedInterfaces);
            
            List actualTypeOfThisSubTypes = (((FunctionType) actualTypeOfThis)).getSubTypes();
            assertNull(actualTypeOfThisSubTypes);
            
            String actualTypeOfThisTemplateTypeName = (((FunctionType) actualTypeOfThis)).getTemplateTypeName();
            assertNull(actualTypeOfThisTemplateTypeName);
            
            String actualTypeOfThisClassName = ((String) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
            assertNull(actualTypeOfThisClassName);
            
            Map actualTypeOfThisProperties = ((Map) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
            assertNull(actualTypeOfThisProperties);
            
            ObjectType actualTypeOfThisImplicitPrototype = (((PrototypeObjectType) actualTypeOfThis)).getImplicitPrototype();
            assertNull(actualTypeOfThisImplicitPrototype);
            
            boolean actualTypeOfThisNativeType = ((Boolean) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
            assertFalse(actualTypeOfThisNativeType);
            
            boolean actualTypeOfThisPrettyPrint = ((Boolean) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
            assertFalse(actualTypeOfThisPrettyPrint);
            
            boolean actualTypeOfThisVisited = ((Boolean) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
            assertFalse(actualTypeOfThisVisited);
            
            JSDocInfo actualTypeOfThisDocInfo = ((JSDocInfo) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
            assertNull(actualTypeOfThisDocInfo);
            
            boolean actualTypeOfThisUnknown = ((Boolean) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
            assertFalse(actualTypeOfThisUnknown);
            
            assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
            assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
            JSTypeRegistry actualTypeOfThisRegistry = actualTypeOfThis.registry;
            assertNull(actualTypeOfThisRegistry);
            
            assertTrue(deepEquals(expected, actual));
            List expectedImplementedInterfaces = ((List) getFieldValue(expected, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
            List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
            assertTrue(deepEquals(expectedImplementedInterfaces, actualImplementedInterfaces));
            
            assertTrue(deepEquals(expected, actual));
            String expectedTemplateTypeName = expected.getTemplateTypeName();
            String actualTemplateTypeName = actual.getTemplateTypeName();
            assertEquals(expectedTemplateTypeName, actualTemplateTypeName);
            
            assertTrue(deepEquals(expected, actual));
            Map expectedProperties = ((Map) getFieldValue(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
            Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
            assertTrue(deepEquals(expectedProperties, actualProperties));
            
            assertTrue(deepEquals(expected, actual));
            boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
            assertTrue(actualNativeType);
            
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
            assertTrue(actualUnknown);
            
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            
            JSTypeRegistry functionBuilderRegistry = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes0 = ((JSType) get(functionBuilderRegistryRegistryNativeTypes, 0));
            JSTypeRegistry functionBuilderRegistry1 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes1 = ((JSType) get(functionBuilderRegistry1RegistryNativeTypes, 1));
            JSTypeRegistry functionBuilderRegistry2 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes2 = ((JSType) get(functionBuilderRegistry2RegistryNativeTypes, 2));
            JSTypeRegistry functionBuilderRegistry3 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes3 = ((JSType) get(functionBuilderRegistry3RegistryNativeTypes, 3));
            JSTypeRegistry functionBuilderRegistry4 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes4 = ((JSType) get(functionBuilderRegistry4RegistryNativeTypes, 4));
            JSTypeRegistry functionBuilderRegistry5 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes5 = ((JSType) get(functionBuilderRegistry5RegistryNativeTypes, 5));
            JSTypeRegistry functionBuilderRegistry6 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes6 = ((JSType) get(functionBuilderRegistry6RegistryNativeTypes, 6));
            JSTypeRegistry functionBuilderRegistry7 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes7 = ((JSType) get(functionBuilderRegistry7RegistryNativeTypes, 7));
            JSTypeRegistry functionBuilderRegistry8 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes8 = ((JSType) get(functionBuilderRegistry8RegistryNativeTypes, 8));
            JSTypeRegistry functionBuilderRegistry9 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes9 = ((JSType) get(functionBuilderRegistry9RegistryNativeTypes, 9));
            JSTypeRegistry functionBuilderRegistry10 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes10 = ((JSType) get(functionBuilderRegistry10RegistryNativeTypes, 10));
            JSTypeRegistry functionBuilderRegistry11 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes11 = ((JSType) get(functionBuilderRegistry11RegistryNativeTypes, 11));
            JSTypeRegistry functionBuilderRegistry12 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes12 = ((JSType) get(functionBuilderRegistry12RegistryNativeTypes, 12));
            JSTypeRegistry functionBuilderRegistry13 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes13 = ((JSType) get(functionBuilderRegistry13RegistryNativeTypes, 13));
            
            assertNull(finalFunctionBuilderRegistryNativeTypes0);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes1);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes2);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes3);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes4);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes5);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes6);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes7);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes8);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes9);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes10);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes11);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes12);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes13);
        } finally {
            setStaticField(emptyImmutableListClazz, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#build()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.returnsFrom {@code return new FunctionType(registry, name, sourceNode, new ArrowType(registry, parametersNode, returnType, inferredReturnType), typeOfThis, templateTypeName, isConstructor, isNativeType);}
 *  */
    @Test
    public void testBuild_Return_5() throws Exception  {
        Class emptyImmutableListClazz = Class.forName("com.google.common.collect.EmptyImmutableList");
        Object prevINSTANCE = getStaticFieldValue(emptyImmutableListClazz, "INSTANCE");
        try {
            Object instance = createInstance("com.google.common.collect.EmptyImmutableList");
            setStaticField(emptyImmutableListClazz, "INSTANCE", instance);
            FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
            JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
            com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
            setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry", registry);
            ScriptOrFnNode sourceNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
            sourceNode.setType(105);
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode", sourceNode);
            FunctionNode parametersNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "parametersNode", parametersNode);
            NoObjectType returnType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "returnType", returnType);
            TemplateType typeOfThis = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "typeOfThis", typeOfThis);
            String templateTypeName = "";
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "templateTypeName", templateTypeName);
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "isConstructor", true);
            
            FunctionType actual = functionBuilder.build();
            
            FunctionType expected = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
            ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
            setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parametersNode);
            setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
            setField(call, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
            setField(expected, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
            Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
            Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
            setField(expected, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            InstanceObjectType typeOfThis1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
            setField(typeOfThis1, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", expected);
            HashMap properties = new HashMap();
            setField(typeOfThis1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
            setField(typeOfThis1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(typeOfThis1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
            setField(expected, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
            expected.setSource(sourceNode);
            List implementedInterfaces = new ArrayList();
            expected.setImplementedInterfaces(implementedInterfaces);
            setField(expected, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeName", templateTypeName);
            HashMap properties1 = new HashMap();
            setField(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties1);
            setField(expected, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(expected, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
            
            ArrowType expectedCall = ((ArrowType) getFieldValue(expected, "com.google.javascript.rhino.jstype.FunctionType", "call"));
            ArrowType actualCall = ((ArrowType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call"));
            Node expectedCallParameters = expectedCall.parameters;
            Node actualCallParameters = actualCall.parameters;
            String actualCallParametersFunctionName = (((FunctionNode) actualCallParameters)).getFunctionName();
            assertNull(actualCallParametersFunctionName);
            
            boolean actualCallParametersItsNeedsActivation = ((Boolean) getFieldValue(actualCallParameters, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
            assertFalse(actualCallParametersItsNeedsActivation);
            
            int expectedCallParametersItsFunctionType = ((Integer) getFieldValue(expectedCallParameters, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
            int actualCallParametersItsFunctionType = ((Integer) getFieldValue(actualCallParameters, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
            assertEquals(expectedCallParametersItsFunctionType, actualCallParametersItsFunctionType);
            
            boolean actualCallParametersItsIgnoreDynamicScope = ((Boolean) getFieldValue(actualCallParameters, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
            assertFalse(actualCallParametersItsIgnoreDynamicScope);
            
            int expectedCallParametersEncodedSourceStart = (((ScriptOrFnNode) expectedCallParameters)).getEncodedSourceStart();
            int actualCallParametersEncodedSourceStart = (((ScriptOrFnNode) actualCallParameters)).getEncodedSourceStart();
            assertEquals(expectedCallParametersEncodedSourceStart, actualCallParametersEncodedSourceStart);
            
            int expectedCallParametersEncodedSourceEnd = (((ScriptOrFnNode) expectedCallParameters)).getEncodedSourceEnd();
            int actualCallParametersEncodedSourceEnd = (((ScriptOrFnNode) actualCallParameters)).getEncodedSourceEnd();
            assertEquals(expectedCallParametersEncodedSourceEnd, actualCallParametersEncodedSourceEnd);
            
            String actualCallParametersSourceName = (((ScriptOrFnNode) actualCallParameters)).getSourceName();
            assertNull(actualCallParametersSourceName);
            
            int expectedCallParametersBaseLineno = (((ScriptOrFnNode) expectedCallParameters)).getBaseLineno();
            int actualCallParametersBaseLineno = (((ScriptOrFnNode) actualCallParameters)).getBaseLineno();
            assertEquals(expectedCallParametersBaseLineno, actualCallParametersBaseLineno);
            
            int expectedCallParametersEndLineno = (((ScriptOrFnNode) expectedCallParameters)).getEndLineno();
            int actualCallParametersEndLineno = (((ScriptOrFnNode) actualCallParameters)).getEndLineno();
            assertEquals(expectedCallParametersEndLineno, actualCallParametersEndLineno);
            
            ObjArray actualCallParametersFunctions = ((ObjArray) getFieldValue(actualCallParameters, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
            assertNull(actualCallParametersFunctions);
            
            ObjArray actualCallParametersRegexps = ((ObjArray) getFieldValue(actualCallParameters, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
            assertNull(actualCallParametersRegexps);
            
            ObjArray actualCallParametersItsVariables = ((ObjArray) getFieldValue(actualCallParameters, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
            assertNull(actualCallParametersItsVariables);
            
            ObjArray actualCallParametersItsConst = ((ObjArray) getFieldValue(actualCallParameters, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
            assertNull(actualCallParametersItsConst);
            
            ObjToIntMap actualCallParametersItsVariableNames = ((ObjToIntMap) getFieldValue(actualCallParameters, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
            assertNull(actualCallParametersItsVariableNames);
            
            int expectedCallParametersVarStart = ((Integer) getFieldValue(expectedCallParameters, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
            int actualCallParametersVarStart = ((Integer) getFieldValue(actualCallParameters, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
            assertEquals(expectedCallParametersVarStart, actualCallParametersVarStart);
            
            Object actualCallParametersCompilerData = (((ScriptOrFnNode) actualCallParameters)).getCompilerData();
            assertNull(actualCallParametersCompilerData);
            
            int expectedCallParametersType = expectedCallParameters.getType();
            int actualCallParametersType = actualCallParameters.getType();
            assertEquals(expectedCallParametersType, actualCallParametersType);
            
            Node actualCallParametersNext = actualCallParameters.getNext();
            assertNull(actualCallParametersNext);
            
            Node actualCallParametersFirst = ((Node) getFieldValue(actualCallParameters, "com.google.javascript.rhino.Node", "first"));
            assertNull(actualCallParametersFirst);
            
            Node actualCallParametersLast = ((Node) getFieldValue(actualCallParameters, "com.google.javascript.rhino.Node", "last"));
            assertNull(actualCallParametersLast);
            
            Object actualCallParametersPropListHead = getFieldValue(actualCallParameters, "com.google.javascript.rhino.Node", "propListHead");
            assertNull(actualCallParametersPropListHead);
            
            int expectedCallParametersSourcePosition = ((Integer) getFieldValue(expectedCallParameters, "com.google.javascript.rhino.Node", "sourcePosition"));
            int actualCallParametersSourcePosition = ((Integer) getFieldValue(actualCallParameters, "com.google.javascript.rhino.Node", "sourcePosition"));
            assertEquals(expectedCallParametersSourcePosition, actualCallParametersSourcePosition);
            
            JSType actualCallParametersJsType = ((JSType) getFieldValue(actualCallParameters, "com.google.javascript.rhino.Node", "jsType"));
            assertNull(actualCallParametersJsType);
            
            Node actualCallParametersParent = actualCallParameters.getParent();
            assertNull(actualCallParametersParent);
            
            JSType expectedCallReturnType = expectedCall.returnType;
            JSType actualCallReturnType = actualCall.returnType;
            // com.google.javascript.rhino.jstype.JSType has overridden equals method
            assertEquals(expectedCallReturnType, actualCallReturnType);
            
            boolean actualCallReturnTypeInferred = actualCall.returnTypeInferred;
            assertFalse(actualCallReturnTypeInferred);
            
            boolean actualCallResolved = ((Boolean) getFieldValue(actualCall, "com.google.javascript.rhino.jstype.JSType", "resolved"));
            assertFalse(actualCallResolved);
            
            JSType actualCallResolveResult = ((JSType) getFieldValue(actualCall, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
            assertNull(actualCallResolveResult);
            
            JSTypeRegistry expectedCallRegistry = expectedCall.registry;
            JSTypeRegistry actualCallRegistry = actualCall.registry;
            ErrorReporter actualCallRegistryReporter = ((ErrorReporter) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
            assertNull(actualCallRegistryReporter);
            
            com.google.javascript.rhino.jstype.JSType[] expectedCallRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(expectedCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            com.google.javascript.rhino.jstype.JSType[] actualCallRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            int expectedCallRegistryNativeTypesSize = expectedCallRegistryNativeTypes.length;
            assertEquals(expectedCallRegistryNativeTypesSize, actualCallRegistryNativeTypes.length);
            assertTrue(deepEquals(expectedCallRegistryNativeTypes, actualCallRegistryNativeTypes));
            
            Map actualCallRegistryNamesToTypes = ((Map) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
            assertNull(actualCallRegistryNamesToTypes);
            
            Set actualCallRegistryNamespaces = ((Set) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
            assertNull(actualCallRegistryNamespaces);
            
            Set actualCallRegistryEnumTypeNames = ((Set) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "enumTypeNames"));
            assertNull(actualCallRegistryEnumTypeNames);
            
            Set actualCallRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
            assertNull(actualCallRegistryForwardDeclaredTypes);
            
            Map actualCallRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
            assertNull(actualCallRegistryTypesIndexedByProperty);
            
            Map actualCallRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
            assertNull(actualCallRegistryGreatestSubtypeByProperty);
            
            Multimap actualCallRegistryInterfaceToImplementors = ((Multimap) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
            assertNull(actualCallRegistryInterfaceToImplementors);
            
            Multimap actualCallRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
            assertNull(actualCallRegistryUnresolvedNamedTypes);
            
            Multimap actualCallRegistryResolvedNamedTypes = ((Multimap) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
            assertNull(actualCallRegistryResolvedNamedTypes);
            
            boolean actualCallRegistryLastGeneration = ((Boolean) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "lastGeneration"));
            assertFalse(actualCallRegistryLastGeneration);
            
            String actualCallRegistryTemplateTypeName = ((String) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypeName"));
            assertNull(actualCallRegistryTemplateTypeName);
            
            TemplateType actualCallRegistryTemplateType = ((TemplateType) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
            assertNull(actualCallRegistryTemplateType);
            
            boolean actualCallRegistryTolerateUndefinedValues = ((Boolean) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "tolerateUndefinedValues"));
            assertFalse(actualCallRegistryTolerateUndefinedValues);
            
            JSTypeRegistry.ResolveMode actualCallRegistryResolveMode = actualCallRegistry.getResolveMode();
            assertNull(actualCallRegistryResolveMode);
            
            FunctionPrototypeType actualPrototype = actual.getPrototype();
            assertNull(actualPrototype);
            
            Object expectedKind = getFieldValue(expected, "com.google.javascript.rhino.jstype.FunctionType", "kind");
            Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
            assertEquals(expectedKind, actualKind);
            
            ObjectType expectedTypeOfThis = expected.getTypeOfThis();
            ObjectType actualTypeOfThis = actual.getTypeOfThis();
            FunctionType expectedTypeOfThisConstructor = (((InstanceObjectType) expectedTypeOfThis)).getConstructor();
            FunctionType actualTypeOfThisConstructor = (((InstanceObjectType) actualTypeOfThis)).getConstructor();
            assertTrue(deepEquals(expectedTypeOfThisConstructor, actualTypeOfThisConstructor));
            assertTrue(deepEquals(expectedTypeOfThisConstructor, actualTypeOfThisConstructor));
            assertTrue(deepEquals(expectedTypeOfThisConstructor, actualTypeOfThisConstructor));
            assertTrue(deepEquals(expectedTypeOfThisConstructor, actualTypeOfThisConstructor));
            Node expectedTypeOfThisConstructorSource = expectedTypeOfThisConstructor.getSource();
            Node actualTypeOfThisConstructorSource = actualTypeOfThisConstructor.getSource();
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            int expectedTypeOfThisConstructorSourceType = expectedTypeOfThisConstructorSource.getType();
            int actualTypeOfThisConstructorSourceType = actualTypeOfThisConstructorSource.getType();
            assertEquals(expectedTypeOfThisConstructorSourceType, actualTypeOfThisConstructorSourceType);
            
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            assertTrue(deepEquals(expectedTypeOfThisConstructorSource, actualTypeOfThisConstructorSource));
            
            List expectedTypeOfThisConstructorImplementedInterfaces = ((List) getFieldValue(expectedTypeOfThisConstructor, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
            List actualTypeOfThisConstructorImplementedInterfaces = ((List) getFieldValue(actualTypeOfThisConstructor, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
            assertTrue(deepEquals(expectedTypeOfThisConstructorImplementedInterfaces, actualTypeOfThisConstructorImplementedInterfaces));
            
            List actualTypeOfThisConstructorSubTypes = actualTypeOfThisConstructor.getSubTypes();
            assertNull(actualTypeOfThisConstructorSubTypes);
            
            String expectedTypeOfThisConstructorTemplateTypeName = expectedTypeOfThisConstructor.getTemplateTypeName();
            String actualTypeOfThisConstructorTemplateTypeName = actualTypeOfThisConstructor.getTemplateTypeName();
            assertEquals(expectedTypeOfThisConstructorTemplateTypeName, actualTypeOfThisConstructorTemplateTypeName);
            
            String actualTypeOfThisConstructorClassName = ((String) getFieldValue(actualTypeOfThisConstructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
            assertNull(actualTypeOfThisConstructorClassName);
            
            Map expectedTypeOfThisConstructorProperties = ((Map) getFieldValue(expectedTypeOfThisConstructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
            Map actualTypeOfThisConstructorProperties = ((Map) getFieldValue(actualTypeOfThisConstructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
            assertTrue(deepEquals(expectedTypeOfThisConstructorProperties, actualTypeOfThisConstructorProperties));
            
            ObjectType actualTypeOfThisConstructorImplicitPrototype = actualTypeOfThisConstructor.getImplicitPrototype();
            assertNull(actualTypeOfThisConstructorImplicitPrototype);
            
            boolean actualTypeOfThisConstructorNativeType = ((Boolean) getFieldValue(actualTypeOfThisConstructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
            assertFalse(actualTypeOfThisConstructorNativeType);
            
            boolean actualTypeOfThisConstructorPrettyPrint = ((Boolean) getFieldValue(actualTypeOfThisConstructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
            assertFalse(actualTypeOfThisConstructorPrettyPrint);
            
            boolean actualTypeOfThisConstructorVisited = ((Boolean) getFieldValue(actualTypeOfThisConstructor, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
            assertFalse(actualTypeOfThisConstructorVisited);
            
            JSDocInfo actualTypeOfThisConstructorDocInfo = ((JSDocInfo) getFieldValue(actualTypeOfThisConstructor, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
            assertNull(actualTypeOfThisConstructorDocInfo);
            
            boolean actualTypeOfThisConstructorUnknown = ((Boolean) getFieldValue(actualTypeOfThisConstructor, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
            assertTrue(actualTypeOfThisConstructorUnknown);
            
            assertTrue(deepEquals(expectedTypeOfThisConstructor, actualTypeOfThisConstructor));
            assertTrue(deepEquals(expectedTypeOfThisConstructor, actualTypeOfThisConstructor));
            assertTrue(deepEquals(expectedTypeOfThisConstructor, actualTypeOfThisConstructor));
            
            assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
            Map expectedTypeOfThisProperties = ((Map) getFieldValue(expectedTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
            Map actualTypeOfThisProperties = ((Map) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
            assertTrue(deepEquals(expectedTypeOfThisProperties, actualTypeOfThisProperties));
            
            assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
            assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
            assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
            assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
            assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
            assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
            assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
            assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
            assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
            
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            
            JSTypeRegistry functionBuilderRegistry = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes0 = ((JSType) get(functionBuilderRegistryRegistryNativeTypes, 0));
            JSTypeRegistry functionBuilderRegistry1 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes1 = ((JSType) get(functionBuilderRegistry1RegistryNativeTypes, 1));
            JSTypeRegistry functionBuilderRegistry2 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes2 = ((JSType) get(functionBuilderRegistry2RegistryNativeTypes, 2));
            JSTypeRegistry functionBuilderRegistry3 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes3 = ((JSType) get(functionBuilderRegistry3RegistryNativeTypes, 3));
            JSTypeRegistry functionBuilderRegistry4 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes4 = ((JSType) get(functionBuilderRegistry4RegistryNativeTypes, 4));
            JSTypeRegistry functionBuilderRegistry5 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes5 = ((JSType) get(functionBuilderRegistry5RegistryNativeTypes, 5));
            JSTypeRegistry functionBuilderRegistry6 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes6 = ((JSType) get(functionBuilderRegistry6RegistryNativeTypes, 6));
            JSTypeRegistry functionBuilderRegistry7 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes7 = ((JSType) get(functionBuilderRegistry7RegistryNativeTypes, 7));
            JSTypeRegistry functionBuilderRegistry8 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes8 = ((JSType) get(functionBuilderRegistry8RegistryNativeTypes, 8));
            JSTypeRegistry functionBuilderRegistry9 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes9 = ((JSType) get(functionBuilderRegistry9RegistryNativeTypes, 9));
            JSTypeRegistry functionBuilderRegistry10 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes10 = ((JSType) get(functionBuilderRegistry10RegistryNativeTypes, 10));
            JSTypeRegistry functionBuilderRegistry11 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes11 = ((JSType) get(functionBuilderRegistry11RegistryNativeTypes, 11));
            JSTypeRegistry functionBuilderRegistry12 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes12 = ((JSType) get(functionBuilderRegistry12RegistryNativeTypes, 12));
            JSTypeRegistry functionBuilderRegistry13 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes13 = ((JSType) get(functionBuilderRegistry13RegistryNativeTypes, 13));
            JSTypeRegistry functionBuilderRegistry14 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes14 = ((JSType) get(functionBuilderRegistry14RegistryNativeTypes, 14));
            JSTypeRegistry functionBuilderRegistry15 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry15RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes15 = ((JSType) get(functionBuilderRegistry15RegistryNativeTypes, 15));
            JSTypeRegistry functionBuilderRegistry16 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry16RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes16 = ((JSType) get(functionBuilderRegistry16RegistryNativeTypes, 16));
            JSTypeRegistry functionBuilderRegistry17 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry17RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes17 = ((JSType) get(functionBuilderRegistry17RegistryNativeTypes, 17));
            JSTypeRegistry functionBuilderRegistry18 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry18RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes18 = ((JSType) get(functionBuilderRegistry18RegistryNativeTypes, 18));
            JSTypeRegistry functionBuilderRegistry19 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry19RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes19 = ((JSType) get(functionBuilderRegistry19RegistryNativeTypes, 19));
            JSTypeRegistry functionBuilderRegistry20 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry20RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes20 = ((JSType) get(functionBuilderRegistry20RegistryNativeTypes, 20));
            JSTypeRegistry functionBuilderRegistry21 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry21RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes21 = ((JSType) get(functionBuilderRegistry21RegistryNativeTypes, 21));
            JSTypeRegistry functionBuilderRegistry22 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry22RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes22 = ((JSType) get(functionBuilderRegistry22RegistryNativeTypes, 22));
            JSTypeRegistry functionBuilderRegistry23 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry23RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes23 = ((JSType) get(functionBuilderRegistry23RegistryNativeTypes, 23));
            JSTypeRegistry functionBuilderRegistry24 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry24RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes24 = ((JSType) get(functionBuilderRegistry24RegistryNativeTypes, 24));
            
            assertNull(finalFunctionBuilderRegistryNativeTypes0);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes1);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes2);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes3);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes4);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes5);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes6);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes7);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes8);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes9);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes10);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes11);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes12);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes13);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes14);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes15);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes16);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes17);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes18);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes19);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes20);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes21);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes22);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes23);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes24);
        } finally {
            setStaticField(emptyImmutableListClazz, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#build()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.returnsFrom {@code return new FunctionType(registry, name, sourceNode, new ArrowType(registry, parametersNode, returnType, inferredReturnType), typeOfThis, templateTypeName, isConstructor, isNativeType);}
 *  */
    @Test
    public void testBuild_Return_1() throws Exception  {
        Class emptyImmutableListClazz = Class.forName("com.google.common.collect.EmptyImmutableList");
        Object prevINSTANCE = getStaticFieldValue(emptyImmutableListClazz, "INSTANCE");
        try {
            Object instance = createInstance("com.google.common.collect.EmptyImmutableList");
            setStaticField(emptyImmutableListClazz, "INSTANCE", instance);
            FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
            JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
            com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
            TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
            nativeTypes[13] = ((JSType) templateType);
            setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry", registry);
            FunctionNode sourceNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
            sourceNode.setType(105);
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode", sourceNode);
            FunctionNode parametersNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "parametersNode", parametersNode);
            NoObjectType returnType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "returnType", returnType);
            NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "typeOfThis", typeOfThis);
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "isConstructor", true);
            
            FunctionType actual = functionBuilder.build();
            
            FunctionType expected = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
            ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
            setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parametersNode);
            setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
            setField(call, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
            setField(expected, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
            Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
            Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
            setField(expected, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
            setField(expected, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
            expected.setSource(sourceNode);
            List implementedInterfaces = new ArrayList();
            expected.setImplementedInterfaces(implementedInterfaces);
            HashMap properties = new HashMap();
            setField(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
            expected.setImplicitPrototype(templateType);
            setField(expected, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            setField(expected, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
            
            ArrowType expectedCall = ((ArrowType) getFieldValue(expected, "com.google.javascript.rhino.jstype.FunctionType", "call"));
            ArrowType actualCall = ((ArrowType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call"));
            Node expectedCallParameters = expectedCall.parameters;
            Node actualCallParameters = actualCall.parameters;
            String actualCallParametersFunctionName = (((FunctionNode) actualCallParameters)).getFunctionName();
            assertNull(actualCallParametersFunctionName);
            
            boolean actualCallParametersItsNeedsActivation = ((Boolean) getFieldValue(actualCallParameters, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
            assertFalse(actualCallParametersItsNeedsActivation);
            
            int expectedCallParametersItsFunctionType = ((Integer) getFieldValue(expectedCallParameters, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
            int actualCallParametersItsFunctionType = ((Integer) getFieldValue(actualCallParameters, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
            assertEquals(expectedCallParametersItsFunctionType, actualCallParametersItsFunctionType);
            
            boolean actualCallParametersItsIgnoreDynamicScope = ((Boolean) getFieldValue(actualCallParameters, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
            assertFalse(actualCallParametersItsIgnoreDynamicScope);
            
            int expectedCallParametersEncodedSourceStart = (((ScriptOrFnNode) expectedCallParameters)).getEncodedSourceStart();
            int actualCallParametersEncodedSourceStart = (((ScriptOrFnNode) actualCallParameters)).getEncodedSourceStart();
            assertEquals(expectedCallParametersEncodedSourceStart, actualCallParametersEncodedSourceStart);
            
            int expectedCallParametersEncodedSourceEnd = (((ScriptOrFnNode) expectedCallParameters)).getEncodedSourceEnd();
            int actualCallParametersEncodedSourceEnd = (((ScriptOrFnNode) actualCallParameters)).getEncodedSourceEnd();
            assertEquals(expectedCallParametersEncodedSourceEnd, actualCallParametersEncodedSourceEnd);
            
            String actualCallParametersSourceName = (((ScriptOrFnNode) actualCallParameters)).getSourceName();
            assertNull(actualCallParametersSourceName);
            
            int expectedCallParametersBaseLineno = (((ScriptOrFnNode) expectedCallParameters)).getBaseLineno();
            int actualCallParametersBaseLineno = (((ScriptOrFnNode) actualCallParameters)).getBaseLineno();
            assertEquals(expectedCallParametersBaseLineno, actualCallParametersBaseLineno);
            
            int expectedCallParametersEndLineno = (((ScriptOrFnNode) expectedCallParameters)).getEndLineno();
            int actualCallParametersEndLineno = (((ScriptOrFnNode) actualCallParameters)).getEndLineno();
            assertEquals(expectedCallParametersEndLineno, actualCallParametersEndLineno);
            
            ObjArray actualCallParametersFunctions = ((ObjArray) getFieldValue(actualCallParameters, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
            assertNull(actualCallParametersFunctions);
            
            ObjArray actualCallParametersRegexps = ((ObjArray) getFieldValue(actualCallParameters, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
            assertNull(actualCallParametersRegexps);
            
            ObjArray actualCallParametersItsVariables = ((ObjArray) getFieldValue(actualCallParameters, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
            assertNull(actualCallParametersItsVariables);
            
            ObjArray actualCallParametersItsConst = ((ObjArray) getFieldValue(actualCallParameters, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
            assertNull(actualCallParametersItsConst);
            
            ObjToIntMap actualCallParametersItsVariableNames = ((ObjToIntMap) getFieldValue(actualCallParameters, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
            assertNull(actualCallParametersItsVariableNames);
            
            int expectedCallParametersVarStart = ((Integer) getFieldValue(expectedCallParameters, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
            int actualCallParametersVarStart = ((Integer) getFieldValue(actualCallParameters, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
            assertEquals(expectedCallParametersVarStart, actualCallParametersVarStart);
            
            Object actualCallParametersCompilerData = (((ScriptOrFnNode) actualCallParameters)).getCompilerData();
            assertNull(actualCallParametersCompilerData);
            
            int expectedCallParametersType = expectedCallParameters.getType();
            int actualCallParametersType = actualCallParameters.getType();
            assertEquals(expectedCallParametersType, actualCallParametersType);
            
            Node actualCallParametersNext = actualCallParameters.getNext();
            assertNull(actualCallParametersNext);
            
            Node actualCallParametersFirst = ((Node) getFieldValue(actualCallParameters, "com.google.javascript.rhino.Node", "first"));
            assertNull(actualCallParametersFirst);
            
            Node actualCallParametersLast = ((Node) getFieldValue(actualCallParameters, "com.google.javascript.rhino.Node", "last"));
            assertNull(actualCallParametersLast);
            
            Object actualCallParametersPropListHead = getFieldValue(actualCallParameters, "com.google.javascript.rhino.Node", "propListHead");
            assertNull(actualCallParametersPropListHead);
            
            int expectedCallParametersSourcePosition = ((Integer) getFieldValue(expectedCallParameters, "com.google.javascript.rhino.Node", "sourcePosition"));
            int actualCallParametersSourcePosition = ((Integer) getFieldValue(actualCallParameters, "com.google.javascript.rhino.Node", "sourcePosition"));
            assertEquals(expectedCallParametersSourcePosition, actualCallParametersSourcePosition);
            
            JSType actualCallParametersJsType = ((JSType) getFieldValue(actualCallParameters, "com.google.javascript.rhino.Node", "jsType"));
            assertNull(actualCallParametersJsType);
            
            Node actualCallParametersParent = actualCallParameters.getParent();
            assertNull(actualCallParametersParent);
            
            JSType expectedCallReturnType = expectedCall.returnType;
            JSType actualCallReturnType = actualCall.returnType;
            // com.google.javascript.rhino.jstype.JSType has overridden equals method
            assertEquals(expectedCallReturnType, actualCallReturnType);
            
            boolean actualCallReturnTypeInferred = actualCall.returnTypeInferred;
            assertFalse(actualCallReturnTypeInferred);
            
            boolean actualCallResolved = ((Boolean) getFieldValue(actualCall, "com.google.javascript.rhino.jstype.JSType", "resolved"));
            assertFalse(actualCallResolved);
            
            JSType actualCallResolveResult = ((JSType) getFieldValue(actualCall, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
            assertNull(actualCallResolveResult);
            
            JSTypeRegistry expectedCallRegistry = expectedCall.registry;
            JSTypeRegistry actualCallRegistry = actualCall.registry;
            ErrorReporter actualCallRegistryReporter = ((ErrorReporter) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
            assertNull(actualCallRegistryReporter);
            
            com.google.javascript.rhino.jstype.JSType[] expectedCallRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(expectedCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            com.google.javascript.rhino.jstype.JSType[] actualCallRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            int expectedCallRegistryNativeTypesSize = expectedCallRegistryNativeTypes.length;
            assertEquals(expectedCallRegistryNativeTypesSize, actualCallRegistryNativeTypes.length);
            assertTrue(deepEquals(expectedCallRegistryNativeTypes, actualCallRegistryNativeTypes));
            
            Map actualCallRegistryNamesToTypes = ((Map) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
            assertNull(actualCallRegistryNamesToTypes);
            
            Set actualCallRegistryNamespaces = ((Set) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
            assertNull(actualCallRegistryNamespaces);
            
            Set actualCallRegistryEnumTypeNames = ((Set) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "enumTypeNames"));
            assertNull(actualCallRegistryEnumTypeNames);
            
            Set actualCallRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
            assertNull(actualCallRegistryForwardDeclaredTypes);
            
            Map actualCallRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
            assertNull(actualCallRegistryTypesIndexedByProperty);
            
            Map actualCallRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
            assertNull(actualCallRegistryGreatestSubtypeByProperty);
            
            Multimap actualCallRegistryInterfaceToImplementors = ((Multimap) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
            assertNull(actualCallRegistryInterfaceToImplementors);
            
            Multimap actualCallRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
            assertNull(actualCallRegistryUnresolvedNamedTypes);
            
            Multimap actualCallRegistryResolvedNamedTypes = ((Multimap) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
            assertNull(actualCallRegistryResolvedNamedTypes);
            
            boolean actualCallRegistryLastGeneration = ((Boolean) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "lastGeneration"));
            assertFalse(actualCallRegistryLastGeneration);
            
            String actualCallRegistryTemplateTypeName = ((String) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypeName"));
            assertNull(actualCallRegistryTemplateTypeName);
            
            TemplateType actualCallRegistryTemplateType = ((TemplateType) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
            assertNull(actualCallRegistryTemplateType);
            
            boolean actualCallRegistryTolerateUndefinedValues = ((Boolean) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "tolerateUndefinedValues"));
            assertFalse(actualCallRegistryTolerateUndefinedValues);
            
            JSTypeRegistry.ResolveMode actualCallRegistryResolveMode = actualCallRegistry.getResolveMode();
            assertNull(actualCallRegistryResolveMode);
            
            FunctionPrototypeType actualPrototype = actual.getPrototype();
            assertNull(actualPrototype);
            
            Object expectedKind = getFieldValue(expected, "com.google.javascript.rhino.jstype.FunctionType", "kind");
            Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
            assertEquals(expectedKind, actualKind);
            
            ObjectType expectedTypeOfThis = expected.getTypeOfThis();
            ObjectType actualTypeOfThis = actual.getTypeOfThis();
            Visitor actualTypeOfThisLeastSupertypeVisitor = ((Visitor) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.NoObjectType", "leastSupertypeVisitor"));
            assertNull(actualTypeOfThisLeastSupertypeVisitor);
            
            Visitor actualTypeOfThisGreatestSubtypeVisitor = ((Visitor) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.NoObjectType", "greatestSubtypeVisitor"));
            assertNull(actualTypeOfThisGreatestSubtypeVisitor);
            
            ArrowType actualTypeOfThisCall = ((ArrowType) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "call"));
            assertNull(actualTypeOfThisCall);
            
            assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
            Object actualTypeOfThisKind = getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "kind");
            assertNull(actualTypeOfThisKind);
            
            ObjectType actualTypeOfThisTypeOfThis = (((FunctionType) actualTypeOfThis)).getTypeOfThis();
            assertNull(actualTypeOfThisTypeOfThis);
            
            Node actualTypeOfThisSource = (((FunctionType) actualTypeOfThis)).getSource();
            assertNull(actualTypeOfThisSource);
            
            List actualTypeOfThisImplementedInterfaces = ((List) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
            assertNull(actualTypeOfThisImplementedInterfaces);
            
            List actualTypeOfThisSubTypes = (((FunctionType) actualTypeOfThis)).getSubTypes();
            assertNull(actualTypeOfThisSubTypes);
            
            String actualTypeOfThisTemplateTypeName = (((FunctionType) actualTypeOfThis)).getTemplateTypeName();
            assertNull(actualTypeOfThisTemplateTypeName);
            
            String actualTypeOfThisClassName = ((String) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
            assertNull(actualTypeOfThisClassName);
            
            Map actualTypeOfThisProperties = ((Map) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
            assertNull(actualTypeOfThisProperties);
            
            ObjectType actualTypeOfThisImplicitPrototype = (((PrototypeObjectType) actualTypeOfThis)).getImplicitPrototype();
            assertNull(actualTypeOfThisImplicitPrototype);
            
            boolean actualTypeOfThisNativeType = ((Boolean) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
            assertFalse(actualTypeOfThisNativeType);
            
            boolean actualTypeOfThisPrettyPrint = ((Boolean) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
            assertFalse(actualTypeOfThisPrettyPrint);
            
            boolean actualTypeOfThisVisited = ((Boolean) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
            assertFalse(actualTypeOfThisVisited);
            
            JSDocInfo actualTypeOfThisDocInfo = ((JSDocInfo) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
            assertNull(actualTypeOfThisDocInfo);
            
            boolean actualTypeOfThisUnknown = ((Boolean) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
            assertFalse(actualTypeOfThisUnknown);
            
            assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
            assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
            JSTypeRegistry actualTypeOfThisRegistry = actualTypeOfThis.registry;
            assertNull(actualTypeOfThisRegistry);
            
            Node expectedSource = expected.getSource();
            Node actualSource = actual.getSource();
            assertTrue(deepEquals(expectedSource, actualSource));
            assertTrue(deepEquals(expectedSource, actualSource));
            assertTrue(deepEquals(expectedSource, actualSource));
            assertTrue(deepEquals(expectedSource, actualSource));
            assertTrue(deepEquals(expectedSource, actualSource));
            assertTrue(deepEquals(expectedSource, actualSource));
            assertTrue(deepEquals(expectedSource, actualSource));
            assertTrue(deepEquals(expectedSource, actualSource));
            assertTrue(deepEquals(expectedSource, actualSource));
            assertTrue(deepEquals(expectedSource, actualSource));
            assertTrue(deepEquals(expectedSource, actualSource));
            assertTrue(deepEquals(expectedSource, actualSource));
            assertTrue(deepEquals(expectedSource, actualSource));
            assertTrue(deepEquals(expectedSource, actualSource));
            assertTrue(deepEquals(expectedSource, actualSource));
            assertTrue(deepEquals(expectedSource, actualSource));
            int expectedSourceType = expectedSource.getType();
            int actualSourceType = actualSource.getType();
            assertEquals(expectedSourceType, actualSourceType);
            
            assertTrue(deepEquals(expectedSource, actualSource));
            assertTrue(deepEquals(expectedSource, actualSource));
            assertTrue(deepEquals(expectedSource, actualSource));
            assertTrue(deepEquals(expectedSource, actualSource));
            assertTrue(deepEquals(expectedSource, actualSource));
            assertTrue(deepEquals(expectedSource, actualSource));
            assertTrue(deepEquals(expectedSource, actualSource));
            
            List expectedImplementedInterfaces = ((List) getFieldValue(expected, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
            List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
            assertTrue(deepEquals(expectedImplementedInterfaces, actualImplementedInterfaces));
            
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            Map expectedProperties = ((Map) getFieldValue(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
            Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
            assertTrue(deepEquals(expectedProperties, actualProperties));
            
            ObjectType expectedImplicitPrototype = expected.getImplicitPrototype();
            ObjectType actualImplicitPrototype = actual.getImplicitPrototype();
            String actualImplicitPrototypeName = ((String) getFieldValue(actualImplicitPrototype, "com.google.javascript.rhino.jstype.TemplateType", "name"));
            assertNull(actualImplicitPrototypeName);
            
            ObjectType actualImplicitPrototypeReferencedType = ((ObjectType) getFieldValue(actualImplicitPrototype, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
            assertNull(actualImplicitPrototypeReferencedType);
            
            assertTrue(deepEquals(expectedImplicitPrototype, actualImplicitPrototype));
            assertTrue(deepEquals(expectedImplicitPrototype, actualImplicitPrototype));
            assertTrue(deepEquals(expectedImplicitPrototype, actualImplicitPrototype));
            assertTrue(deepEquals(expectedImplicitPrototype, actualImplicitPrototype));
            assertTrue(deepEquals(expectedImplicitPrototype, actualImplicitPrototype));
            assertTrue(deepEquals(expectedImplicitPrototype, actualImplicitPrototype));
            
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
            assertTrue(actualUnknown);
            
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            assertTrue(deepEquals(expected, actual));
            
            JSTypeRegistry functionBuilderRegistry = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes0 = ((JSType) get(functionBuilderRegistryRegistryNativeTypes, 0));
            JSTypeRegistry functionBuilderRegistry1 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes1 = ((JSType) get(functionBuilderRegistry1RegistryNativeTypes, 1));
            JSTypeRegistry functionBuilderRegistry2 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes2 = ((JSType) get(functionBuilderRegistry2RegistryNativeTypes, 2));
            JSTypeRegistry functionBuilderRegistry3 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes3 = ((JSType) get(functionBuilderRegistry3RegistryNativeTypes, 3));
            JSTypeRegistry functionBuilderRegistry4 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes4 = ((JSType) get(functionBuilderRegistry4RegistryNativeTypes, 4));
            JSTypeRegistry functionBuilderRegistry5 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes5 = ((JSType) get(functionBuilderRegistry5RegistryNativeTypes, 5));
            JSTypeRegistry functionBuilderRegistry6 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes6 = ((JSType) get(functionBuilderRegistry6RegistryNativeTypes, 6));
            JSTypeRegistry functionBuilderRegistry7 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes7 = ((JSType) get(functionBuilderRegistry7RegistryNativeTypes, 7));
            JSTypeRegistry functionBuilderRegistry8 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes8 = ((JSType) get(functionBuilderRegistry8RegistryNativeTypes, 8));
            JSTypeRegistry functionBuilderRegistry9 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes9 = ((JSType) get(functionBuilderRegistry9RegistryNativeTypes, 9));
            JSTypeRegistry functionBuilderRegistry10 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes10 = ((JSType) get(functionBuilderRegistry10RegistryNativeTypes, 10));
            JSTypeRegistry functionBuilderRegistry11 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes11 = ((JSType) get(functionBuilderRegistry11RegistryNativeTypes, 11));
            JSTypeRegistry functionBuilderRegistry12 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
            com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
            JSType finalFunctionBuilderRegistryNativeTypes12 = ((JSType) get(functionBuilderRegistry12RegistryNativeTypes, 12));
            
            assertNull(finalFunctionBuilderRegistryNativeTypes0);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes1);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes2);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes3);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes4);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes5);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes6);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes7);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes8);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes9);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes10);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes11);
            
            assertNull(finalFunctionBuilderRegistryNativeTypes12);
        } finally {
            setStaticField(emptyImmutableListClazz, "INSTANCE", prevINSTANCE);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method build()
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#build()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new FunctionType(registry, name, sourceNode, new ArrowType(registry, parametersNode, returnType, inferredReturnType), typeOfThis, templateTypeName, isConstructor, isNativeType);
 *  */
    @Test
    public void testBuild_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry", registry);
        Object sourceNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode", sourceNode);
        FunctionNode parametersNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "parametersNode", parametersNode);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionBuilder.build] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:111)
            com.google.javascript.rhino.jstype.ArrowType.<init>(ArrowType.java:77)
            com.google.javascript.rhino.jstype.FunctionBuilder.build(FunctionBuilder.java:148) */
        functionBuilder.build();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#build()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new FunctionType(registry, name, sourceNode, new ArrowType(registry, parametersNode, returnType, inferredReturnType), typeOfThis, templateTypeName, isConstructor, isNativeType);
 *  */
    @Test
    public void testBuild_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry", registry);
        TemplateType returnType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionBuilder.build] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:111)
            com.google.javascript.rhino.jstype.ArrowType.<init>(ArrowType.java:74)
            com.google.javascript.rhino.jstype.FunctionBuilder.build(FunctionBuilder.java:148) */
        functionBuilder.build();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#build()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testBuild_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[40];
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        nativeTypes[35] = ((JSType) unionType);
        AllType allType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        nativeTypes[38] = ((JSType) allType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry", registry);
        String name = "";
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "name", name);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionBuilder.build] produces [java.lang.ArrayIndexOutOfBoundsException: Index 42 out of bounds for length 40]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.build(UnionTypeBuilder.java:152)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createUnionType(JSTypeRegistry.java:857)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createOptionalType(JSTypeRegistry.java:818)
            com.google.javascript.rhino.jstype.FunctionParamBuilder.addVarArgs(FunctionParamBuilder.java:105)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createParameters(JSTypeRegistry.java:1079)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createParametersWithVarArgs(JSTypeRegistry.java:1051)
            com.google.javascript.rhino.jstype.ArrowType.<init>(ArrowType.java:74)
            com.google.javascript.rhino.jstype.FunctionBuilder.build(FunctionBuilder.java:148) */
        functionBuilder.build();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#build()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new FunctionType(registry, name, sourceNode, new ArrowType(registry, parametersNode, returnType, inferredReturnType), typeOfThis, templateTypeName, isConstructor, isNativeType);
 *  */
    @Test
    public void testBuild_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry", registry);
        FunctionNode parametersNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "parametersNode", parametersNode);
        NoObjectType returnType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "returnType", returnType);
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "typeOfThis", typeOfThis);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionBuilder.build] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:128)
            com.google.javascript.rhino.jstype.FunctionBuilder.build(FunctionBuilder.java:148) */
        functionBuilder.build();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#build()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return new FunctionType(registry, name, sourceNode, new ArrowType(registry, parametersNode, returnType, inferredReturnType), typeOfThis, templateTypeName, isConstructor, isNativeType);
 *  */
    @Test
    public void testBuild_ThrowClassCastException() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        NumberType numberType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        nativeTypes[19] = ((JSType) numberType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry", registry);
        Node sourceNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode", sourceNode);
        Node parametersNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "parametersNode", parametersNode);
        NoObjectType returnType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionBuilder.build] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.NumberType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.NumberType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @2fff965e)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:113)
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:127)
            com.google.javascript.rhino.jstype.FunctionBuilder.build(FunctionBuilder.java:148) */
        functionBuilder.build();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#build()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return new FunctionType(registry, name, sourceNode, new ArrowType(registry, parametersNode, returnType, inferredReturnType), typeOfThis, templateTypeName, isConstructor, isNativeType);
 *  */
    @Test
    public void testBuild_ThrowClassCastException_3() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[38];
        AllType allType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        nativeTypes[13] = ((JSType) allType);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        nativeTypes[35] = ((JSType) noObjectType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry", registry);
        String name = "";
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "name", name);
        FunctionNode sourceNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode", sourceNode);
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionBuilder.build] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.AllType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.AllType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @2fff965e)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:128)
            com.google.javascript.rhino.jstype.FunctionBuilder.build(FunctionBuilder.java:148) */
        functionBuilder.build();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#build()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return new FunctionType(registry, name, sourceNode, new ArrowType(registry, parametersNode, returnType, inferredReturnType), typeOfThis, templateTypeName, isConstructor, isNativeType);
 *  */
    @Test
    public void testBuild_ThrowClassCastException_5() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[38];
        AllType allType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        nativeTypes[13] = ((JSType) allType);
        UnresolvedTypeExpression unresolvedTypeExpression = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        nativeTypes[35] = ((JSType) unresolvedTypeExpression);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry", registry);
        String name = "";
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "name", name);
        FunctionNode sourceNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode", sourceNode);
        TemplateType returnType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "returnType", returnType);
        String templateTypeName = "";
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "templateTypeName", templateTypeName);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionBuilder.build] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.AllType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.AllType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @2fff965e)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:128)
            com.google.javascript.rhino.jstype.FunctionBuilder.build(FunctionBuilder.java:148) */
        functionBuilder.build();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#build()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkArgument(boolean)}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkNotNull(java.lang.Object)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new FunctionType(registry, name, sourceNode, new ArrowType(registry, parametersNode, returnType, inferredReturnType), typeOfThis, templateTypeName, isConstructor, isNativeType);
 *  */
    @Test
    public void testBuild_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Class emptyImmutableListClazz = Class.forName("com.google.common.collect.EmptyImmutableList");
        Object prevINSTANCE = getStaticFieldValue(emptyImmutableListClazz, "INSTANCE");
        try {
            Object instance = createInstance("com.google.common.collect.EmptyImmutableList");
            setStaticField(emptyImmutableListClazz, "INSTANCE", instance);
            FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
            JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
            com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
            setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry", registry);
            Node parametersNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "parametersNode", parametersNode);
            TemplateType returnType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "returnType", returnType);
            String templateTypeName = "";
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "templateTypeName", templateTypeName);
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "isNativeType", true);
            
            /* This test fails because method [com.google.javascript.rhino.jstype.FunctionBuilder.build] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 14]
                com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
                com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
                com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:141)
                com.google.javascript.rhino.jstype.FunctionBuilder.build(FunctionBuilder.java:148) */
            functionBuilder.build();
        } finally {
            setStaticField(emptyImmutableListClazz, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#build()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return new FunctionType(registry, name, sourceNode, new ArrowType(registry, parametersNode, returnType, inferredReturnType), typeOfThis, templateTypeName, isConstructor, isNativeType);
 *  */
    @Test
    public void testBuild_ThrowClassCastException_1() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[40];
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[13] = ((JSType) unionType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry", registry);
        String name = "";
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "name", name);
        FunctionNode parametersNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "parametersNode", parametersNode);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionBuilder.build] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.UnionType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.UnionType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @2fff965e)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:128)
            com.google.javascript.rhino.jstype.FunctionBuilder.build(FunctionBuilder.java:148) */
        functionBuilder.build();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#build()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return new FunctionType(registry, name, sourceNode, new ArrowType(registry, parametersNode, returnType, inferredReturnType), typeOfThis, templateTypeName, isConstructor, isNativeType);
 *  */
    @Test
    public void testBuild_ThrowClassCastException_2() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[38];
        AllType allType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        nativeTypes[13] = ((JSType) allType);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        nativeTypes[35] = ((JSType) noType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry", registry);
        String name = "";
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "name", name);
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionBuilder.build] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.AllType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.AllType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @2fff965e)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:128)
            com.google.javascript.rhino.jstype.FunctionBuilder.build(FunctionBuilder.java:148) */
        functionBuilder.build();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#build()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return new FunctionType(registry, name, sourceNode, new ArrowType(registry, parametersNode, returnType, inferredReturnType), typeOfThis, templateTypeName, isConstructor, isNativeType);
 *  */
    @Test
    public void testBuild_ThrowClassCastException_4() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[38];
        AllType allType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        nativeTypes[13] = ((JSType) allType);
        AllType allType1 = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        nativeTypes[35] = ((JSType) allType1);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry", registry);
        String name = "";
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "name", name);
        NoObjectType returnType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionBuilder.build] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.AllType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.AllType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @2fff965e)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:128)
            com.google.javascript.rhino.jstype.FunctionBuilder.build(FunctionBuilder.java:148) */
        functionBuilder.build();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method build()
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#build()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new FunctionType(registry, name, sourceNode, new ArrowType(registry, parametersNode, returnType, inferredReturnType), typeOfThis, templateTypeName, isConstructor, isNativeType);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testBuild_ThrowIllegalArgumentException() throws Exception  {
        Class emptyImmutableListClazz = Class.forName("com.google.common.collect.EmptyImmutableList");
        Object prevINSTANCE = getStaticFieldValue(emptyImmutableListClazz, "INSTANCE");
        try {
            Object instance = createInstance("com.google.common.collect.EmptyImmutableList");
            setStaticField(emptyImmutableListClazz, "INSTANCE", instance);
            FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
            JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
            com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
            setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry", registry);
            FunctionNode sourceNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
            sourceNode.setType(1);
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode", sourceNode);
            ScriptOrFnNode parametersNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "parametersNode", parametersNode);
            NoObjectType returnType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "returnType", returnType);
            NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "typeOfThis", typeOfThis);
            String templateTypeName = "";
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "templateTypeName", templateTypeName);
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "isNativeType", true);
            
            functionBuilder.build();
        } finally {
            setStaticField(emptyImmutableListClazz, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#build()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new FunctionType(registry, name, sourceNode, new ArrowType(registry, parametersNode, returnType, inferredReturnType), typeOfThis, templateTypeName, isConstructor, isNativeType);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testBuild_ThrowIllegalArgumentException_1() throws Exception  {
        Class emptyImmutableListClazz = Class.forName("com.google.common.collect.EmptyImmutableList");
        Object prevINSTANCE = getStaticFieldValue(emptyImmutableListClazz, "INSTANCE");
        try {
            Object instance = createInstance("com.google.common.collect.EmptyImmutableList");
            setStaticField(emptyImmutableListClazz, "INSTANCE", instance);
            FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
            JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
            com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
            TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
            nativeTypes[13] = ((JSType) templateType);
            setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry", registry);
            ScriptOrFnNode sourceNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode", sourceNode);
            FunctionNode parametersNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "parametersNode", parametersNode);
            NoObjectType returnType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "returnType", returnType);
            NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "typeOfThis", typeOfThis);
            String templateTypeName = "";
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "templateTypeName", templateTypeName);
            
            functionBuilder.build();
        } finally {
            setStaticField(emptyImmutableListClazz, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#build()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new FunctionType(registry, name, sourceNode, new ArrowType(registry, parametersNode, returnType, inferredReturnType), typeOfThis, templateTypeName, isConstructor, isNativeType);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testBuild_ThrowIllegalArgumentException_2() throws Exception  {
        Class emptyImmutableListClazz = Class.forName("com.google.common.collect.EmptyImmutableList");
        Object prevINSTANCE = getStaticFieldValue(emptyImmutableListClazz, "INSTANCE");
        try {
            Object instance = createInstance("com.google.common.collect.EmptyImmutableList");
            setStaticField(emptyImmutableListClazz, "INSTANCE", instance);
            FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
            JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
            com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[33];
            setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry", registry);
            ScriptOrFnNode sourceNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode", sourceNode);
            FunctionNode parametersNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "parametersNode", parametersNode);
            NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "returnType", returnType);
            String templateTypeName = "";
            setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "templateTypeName", templateTypeName);
            
            functionBuilder.build();
        } finally {
            setStaticField(emptyImmutableListClazz, "INSTANCE", prevINSTANCE);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method build()
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#build()}
     */
    @Test
    public void testBuild() throws Exception  {
    /* This block of code is 1051 lines long and could lead to compilation error
        java.lang.String[] stringArray = {};
        java.lang.String[] stringArray1 = {};
        TestErrorReporter testErrorReporter = new TestErrorReporter(stringArray, stringArray1);
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(testErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        FunctionBuilder functionBuilder = new FunctionBuilder(jSTypeRegistry);
        
        FunctionType actual = functionBuilder.build();
        
        FunctionType expected = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters.setType(83);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "intValue", 1);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        UnknownType jsType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(jsType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        TestErrorReporter reporter = ((TestErrorReporter) createInstance("com.google.javascript.rhino.testing.TestErrorReporter"));
        reporter.setErrors(stringArray);
        reporter.setWarnings(stringArray1);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter", reporter);
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[54];
        InstanceObjectType instanceObjectType = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        nativeTypes[0] = ((JSType) instanceObjectType);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        nativeTypes[1] = ((JSType) functionType);
        BooleanType booleanType = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        nativeTypes[2] = ((JSType) booleanType);
        InstanceObjectType instanceObjectType1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        nativeTypes[3] = ((JSType) instanceObjectType1);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        nativeTypes[4] = ((JSType) functionType1);
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        nativeTypes[5] = ((JSType) unknownType);
        InstanceObjectType instanceObjectType2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        nativeTypes[6] = ((JSType) instanceObjectType2);
        FunctionType functionType2 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        nativeTypes[7] = ((JSType) functionType2);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        nativeTypes[8] = ((JSType) errorFunctionType);
        InstanceObjectType instanceObjectType3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        nativeTypes[9] = ((JSType) instanceObjectType3);
        ErrorFunctionType errorFunctionType1 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        nativeTypes[10] = ((JSType) errorFunctionType1);
        InstanceObjectType instanceObjectType4 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        nativeTypes[11] = ((JSType) instanceObjectType4);
        FunctionType functionType3 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        nativeTypes[12] = ((JSType) functionType3);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        nativeTypes[13] = ((JSType) anonymousFunctionType);
        FunctionPrototypeType functionPrototypeType = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        nativeTypes[14] = ((JSType) functionPrototypeType);
        NullType nullType = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        nativeTypes[15] = ((JSType) nullType);
        NumberType numberType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        nativeTypes[16] = ((JSType) numberType);
        InstanceObjectType instanceObjectType5 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        nativeTypes[17] = ((JSType) instanceObjectType5);
        FunctionType functionType4 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        nativeTypes[18] = ((JSType) functionType4);
        InstanceObjectType instanceObjectType6 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        nativeTypes[19] = ((JSType) instanceObjectType6);
        FunctionType functionType5 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        nativeTypes[20] = ((JSType) functionType5);
        FunctionPrototypeType functionPrototypeType1 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        nativeTypes[21] = ((JSType) functionPrototypeType1);
        ErrorFunctionType errorFunctionType2 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        nativeTypes[22] = ((JSType) errorFunctionType2);
        InstanceObjectType instanceObjectType7 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        nativeTypes[23] = ((JSType) instanceObjectType7);
        ErrorFunctionType errorFunctionType3 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        nativeTypes[24] = ((JSType) errorFunctionType3);
        InstanceObjectType instanceObjectType8 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        nativeTypes[25] = ((JSType) instanceObjectType8);
        InstanceObjectType instanceObjectType9 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        nativeTypes[26] = ((JSType) instanceObjectType9);
        FunctionType functionType6 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        nativeTypes[27] = ((JSType) functionType6);
        InstanceObjectType instanceObjectType10 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        nativeTypes[28] = ((JSType) instanceObjectType10);
        FunctionType functionType7 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        nativeTypes[29] = ((JSType) functionType7);
        StringType stringType = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        nativeTypes[30] = ((JSType) stringType);
        ErrorFunctionType errorFunctionType4 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        nativeTypes[31] = ((JSType) errorFunctionType4);
        InstanceObjectType instanceObjectType11 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        nativeTypes[32] = ((JSType) instanceObjectType11);
        ErrorFunctionType errorFunctionType5 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        nativeTypes[33] = ((JSType) errorFunctionType5);
        InstanceObjectType instanceObjectType12 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        nativeTypes[34] = ((JSType) instanceObjectType12);
        nativeTypes[35] = ((JSType) jsType);
        ErrorFunctionType errorFunctionType6 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        nativeTypes[36] = ((JSType) errorFunctionType6);
        InstanceObjectType instanceObjectType13 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        nativeTypes[37] = ((JSType) instanceObjectType13);
        VoidType voidType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        nativeTypes[38] = ((JSType) voidType);
        FunctionPrototypeType functionPrototypeType2 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        nativeTypes[39] = ((JSType) functionPrototypeType2);
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[40] = ((JSType) unionType);
        UnionType unionType1 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[41] = ((JSType) unionType1);
        AllType allType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        nativeTypes[42] = ((JSType) allType);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        nativeTypes[43] = ((JSType) noType);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        nativeTypes[44] = ((JSType) noObjectType);
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        nativeTypes[45] = ((JSType) prototypeObjectType);
        FunctionType anonymousFunctionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        nativeTypes[46] = ((JSType) anonymousFunctionType1);
        FunctionType functionType8 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        nativeTypes[47] = ((JSType) functionType8);
        FunctionType functionType9 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        nativeTypes[48] = ((JSType) functionType9);
        FunctionType functionType10 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        nativeTypes[49] = ((JSType) functionType10);
        UnionType unionType2 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[50] = ((JSType) unionType2);
        UnionType unionType3 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[51] = ((JSType) unionType3);
        UnionType unionType4 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[52] = ((JSType) unionType4);
        UnionType unionType5 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[53] = ((JSType) unionType5);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        HashMap namesToTypes = new HashMap();
        String string = "Undefined";
        VoidType voidType1 = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        namesToTypes.put(string, voidType1);
        String string1 = "Null";
        NullType nullType1 = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        namesToTypes.put(string1, nullType1);
        String string2 = "void";
        VoidType voidType2 = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        namesToTypes.put(string2, voidType2);
        String string3 = "string";
        StringType stringType1 = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        namesToTypes.put(string3, stringType1);
        String string4 = "ReferenceError";
        InstanceObjectType instanceObjectType14 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string4, instanceObjectType14);
        String string5 = "RegExp";
        InstanceObjectType instanceObjectType15 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string5, instanceObjectType15);
        String string6 = "Error";
        InstanceObjectType instanceObjectType16 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string6, instanceObjectType16);
        String string7 = "URIError";
        InstanceObjectType instanceObjectType17 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string7, instanceObjectType17);
        String string8 = "EvalError";
        InstanceObjectType instanceObjectType18 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string8, instanceObjectType18);
        String string9 = "String";
        InstanceObjectType instanceObjectType19 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string9, instanceObjectType19);
        String string10 = "Date";
        InstanceObjectType instanceObjectType20 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string10, instanceObjectType20);
        String string11 = "undefined";
        VoidType voidType3 = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        namesToTypes.put(string11, voidType3);
        String string12 = "Array";
        InstanceObjectType instanceObjectType21 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string12, instanceObjectType21);
        String string13 = "number";
        NumberType numberType1 = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        namesToTypes.put(string13, numberType1);
        String string14 = "Function";
        FunctionType anonymousFunctionType2 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        namesToTypes.put(string14, anonymousFunctionType2);
        String string15 = "boolean";
        BooleanType booleanType1 = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        namesToTypes.put(string15, booleanType1);
        String string16 = "null";
        NullType nullType2 = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        namesToTypes.put(string16, nullType2);
        String string17 = "Number";
        InstanceObjectType instanceObjectType22 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string17, instanceObjectType22);
        String string18 = "SyntaxError";
        InstanceObjectType instanceObjectType23 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string18, instanceObjectType23);
        String string19 = "TypeError";
        InstanceObjectType instanceObjectType24 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string19, instanceObjectType24);
        String string20 = "RangeError";
        InstanceObjectType instanceObjectType25 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string20, instanceObjectType25);
        String string21 = "Object";
        InstanceObjectType instanceObjectType26 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string21, instanceObjectType26);
        String string22 = "Boolean";
        InstanceObjectType instanceObjectType27 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string22, instanceObjectType27);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes", namesToTypes);
        HashSet namespaces = new HashSet();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces", namespaces);
        HashSet enumTypeNames = new HashSet();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "enumTypeNames", enumTypeNames);
        HashSet forwardDeclaredTypes = new HashSet();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes", forwardDeclaredTypes);
        HashMap typesIndexedByProperty = new HashMap();
        String string23 = "prototype";
        HashSet hashSet = new HashSet();
        FunctionType functionType11 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        hashSet.add(functionType11);
        typesIndexedByProperty.put(string23, hashSet);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty", typesIndexedByProperty);
        HashMap greatestSubtypeByProperty = new HashMap();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty", greatestSubtypeByProperty);
        HashMultimap interfaceToImplementors = ((HashMultimap) createInstance("com.google.common.collect.HashMultimap"));
        setField(interfaceToImplementors, "com.google.common.collect.HashMultimap", "expectedValuesPerKey", 8);
        HashMap map = new HashMap();
        setField(interfaceToImplementors, "com.google.common.collect.AbstractMultimap", "map", map);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors", interfaceToImplementors);
        ArrayListMultimap unresolvedNamedTypes = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
        setField(unresolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey", 10);
        HashMap map1 = new HashMap();
        setField(unresolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map", map1);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes", unresolvedNamedTypes);
        ArrayListMultimap resolvedNamedTypes = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
        setField(resolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey", 10);
        HashMap map2 = new HashMap();
        setField(resolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map", map2);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes", resolvedNamedTypes);
        registry.setLastGeneration(true);
        registry.setResolveMode(resolveMode);
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "parent", parameters);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(parameters, "com.google.javascript.rhino.Node", "last", first);
        setField(parameters, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", jsType);
        setField(call, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(expected, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(expected, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(expected, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", jsType);
        List implementedInterfaces = new ArrayList();
        expected.setImplementedInterfaces(implementedInterfaces);
        HashMap properties = new HashMap();
        setField(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        FunctionType implicitPrototype = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(implicitPrototype, "com.google.javascript.rhino.jstype.JSTypeRegistry$1", "this$0", registry);
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters1.setType(83);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first1, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first1)).setType(38);
        Object propListHead1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead1, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(propListHead1, "com.google.javascript.rhino.Node$PropListItem", "intValue", 1);
        setField(first1, "com.google.javascript.rhino.Node", "propListHead", propListHead1);
        setField(first1, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first1, "com.google.javascript.rhino.Node", "parent", parameters1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(parameters1, "com.google.javascript.rhino.Node", "last", first1);
        setField(parameters1, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", jsType);
        setField(call1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(implicitPrototype, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        Object kind1 = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(implicitPrototype, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Object leastSupertypeVisitor = createInstance("com.google.javascript.rhino.jstype.NoObjectType$LeastSupertypeVisitor");
        setField(leastSupertypeVisitor, "com.google.javascript.rhino.jstype.NoObjectType$LeastSupertypeVisitor", "this$0", typeOfThis);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.NoObjectType", "leastSupertypeVisitor", leastSupertypeVisitor);
        Object greatestSubtypeVisitor = createInstance("com.google.javascript.rhino.jstype.NoObjectType$GreatestSupertypeVisitor");
        setField(greatestSubtypeVisitor, "com.google.javascript.rhino.jstype.NoObjectType$GreatestSupertypeVisitor", "this$0", typeOfThis);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.NoObjectType", "greatestSubtypeVisitor", greatestSubtypeVisitor);
        ArrowType call2 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters2.setType(83);
        Object first2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first2, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first2)).setType(38);
        Object propListHead2 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead2, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(propListHead2, "com.google.javascript.rhino.Node$PropListItem", "intValue", 1);
        setField(first2, "com.google.javascript.rhino.Node", "propListHead", propListHead2);
        setField(first2, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first2, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first2, "com.google.javascript.rhino.Node", "parent", parameters2);
        setField(parameters2, "com.google.javascript.rhino.Node", "first", first2);
        setField(parameters2, "com.google.javascript.rhino.Node", "last", first2);
        setField(parameters2, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call2, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters2);
        setField(call2, "com.google.javascript.rhino.jstype.ArrowType", "returnType", typeOfThis);
        setField(call2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "call", call2);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        List implementedInterfaces1 = new ArrayList();
        typeOfThis.setImplementedInterfaces(implementedInterfaces1);
        HashMap properties1 = new HashMap();
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties1);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(implicitPrototype, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        List implementedInterfaces2 = new ArrayList();
        implicitPrototype.setImplementedInterfaces(implementedInterfaces2);
        setField(implicitPrototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", string14);
        HashMap properties2 = new HashMap();
        setField(implicitPrototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties2);
        FunctionPrototypeType implicitPrototype1 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        FunctionType ownerFunction = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call3 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters3 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters3.setType(83);
        Object first3 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first3, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first3)).setType(38);
        Object propListHead3 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(first3, "com.google.javascript.rhino.Node", "propListHead", propListHead3);
        setField(first3, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        AllType jsType1 = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        setField(first3, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(first3, "com.google.javascript.rhino.Node", "parent", parameters3);
        setField(parameters3, "com.google.javascript.rhino.Node", "first", first3);
        setField(parameters3, "com.google.javascript.rhino.Node", "last", first3);
        setField(parameters3, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call3, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters3);
        setField(call3, "com.google.javascript.rhino.jstype.ArrowType", "returnType", jsType);
        setField(call3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(ownerFunction, "com.google.javascript.rhino.jstype.FunctionType", "call", call3);
        setField(ownerFunction, "com.google.javascript.rhino.jstype.FunctionType", "prototype", implicitPrototype1);
        setField(ownerFunction, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(ownerFunction, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", implicitPrototype);
        List implementedInterfaces3 = new ArrayList();
        ownerFunction.setImplementedInterfaces(implementedInterfaces3);
        setField(ownerFunction, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", string14);
        HashMap properties3 = new HashMap();
        setField(ownerFunction, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties3);
        setField(ownerFunction, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(ownerFunction, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(ownerFunction, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(implicitPrototype1, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", ownerFunction);
        HashMap properties4 = new HashMap();
        setField(implicitPrototype1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties4);
        InstanceObjectType implicitPrototype2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call4 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters4 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters4.setType(83);
        Object first4 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters4, "com.google.javascript.rhino.Node", "first", first4);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters4, "com.google.javascript.rhino.Node", "last", last);
        setField(parameters4, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call4, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters4);
        setField(call4, "com.google.javascript.rhino.jstype.ArrowType", "returnType", jsType);
        setField(call4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "call", call4);
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(prototype, "com.google.javascript.rhino.jstype.FunctionPrototypeType", "ownerFunction", constructor);
        HashMap properties5 = new HashMap();
        setField(prototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties5);
        FunctionPrototypeType implicitPrototype3 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        HashMap properties6 = new HashMap();
        setField(implicitPrototype3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties6);
        setField(implicitPrototype3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(implicitPrototype3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototype.setImplicitPrototype(implicitPrototype3);
        setField(prototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(prototype, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", implicitPrototype2);
        List implementedInterfaces4 = new ArrayList();
        constructor.setImplementedInterfaces(implementedInterfaces4);
        ArrayList subTypes = new ArrayList();
        subTypes.add(ownerFunction);
        FunctionType functionType12 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call5 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType12, "com.google.javascript.rhino.jstype.FunctionType", "call", call5);
        FunctionPrototypeType prototype1 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(functionType12, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype1);
        setField(functionType12, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        InstanceObjectType typeOfThis1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(functionType12, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        List implementedInterfaces5 = new ArrayList();
        functionType12.setImplementedInterfaces(implementedInterfaces5);
        setField(functionType12, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", string12);
        HashMap properties7 = new HashMap();
        setField(functionType12, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties7);
        setField(functionType12, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(functionType12, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType12, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(functionType12);
        FunctionType functionType13 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call6 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType13, "com.google.javascript.rhino.jstype.FunctionType", "call", call6);
        FunctionPrototypeType prototype2 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(functionType13, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype2);
        setField(functionType13, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        InstanceObjectType typeOfThis2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(functionType13, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis2);
        List implementedInterfaces6 = new ArrayList();
        functionType13.setImplementedInterfaces(implementedInterfaces6);
        setField(functionType13, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", string22);
        HashMap properties8 = new HashMap();
        setField(functionType13, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties8);
        setField(functionType13, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(functionType13, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType13, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(functionType13);
        FunctionType functionType14 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call7 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType14, "com.google.javascript.rhino.jstype.FunctionType", "call", call7);
        FunctionPrototypeType prototype3 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(functionType14, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype3);
        setField(functionType14, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        InstanceObjectType typeOfThis3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(functionType14, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis3);
        List implementedInterfaces7 = new ArrayList();
        functionType14.setImplementedInterfaces(implementedInterfaces7);
        setField(functionType14, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", string10);
        HashMap properties9 = new HashMap();
        setField(functionType14, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties9);
        setField(functionType14, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(functionType14, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType14, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(functionType14);
        FunctionType functionType15 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call8 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType15, "com.google.javascript.rhino.jstype.FunctionType", "call", call8);
        FunctionPrototypeType prototype4 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(functionType15, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype4);
        setField(functionType15, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        InstanceObjectType typeOfThis4 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(functionType15, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis4);
        List implementedInterfaces8 = new ArrayList();
        functionType15.setImplementedInterfaces(implementedInterfaces8);
        setField(functionType15, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", string17);
        HashMap properties10 = new HashMap();
        setField(functionType15, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties10);
        setField(functionType15, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(functionType15, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType15, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(functionType15);
        FunctionType functionType16 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call9 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType16, "com.google.javascript.rhino.jstype.FunctionType", "call", call9);
        FunctionPrototypeType prototype5 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(functionType16, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype5);
        setField(functionType16, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        InstanceObjectType typeOfThis5 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(functionType16, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis5);
        List implementedInterfaces9 = new ArrayList();
        functionType16.setImplementedInterfaces(implementedInterfaces9);
        setField(functionType16, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", string5);
        HashMap properties11 = new HashMap();
        setField(functionType16, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties11);
        setField(functionType16, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(functionType16, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType16, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(functionType16);
        FunctionType functionType17 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call10 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType17, "com.google.javascript.rhino.jstype.FunctionType", "call", call10);
        FunctionPrototypeType prototype6 = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(functionType17, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype6);
        setField(functionType17, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        InstanceObjectType typeOfThis6 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(functionType17, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis6);
        List implementedInterfaces10 = new ArrayList();
        functionType17.setImplementedInterfaces(implementedInterfaces10);
        setField(functionType17, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", string9);
        HashMap properties12 = new HashMap();
        setField(functionType17, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties12);
        setField(functionType17, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(functionType17, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType17, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(functionType17);
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "subTypes", subTypes);
        setField(constructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", string21);
        HashMap properties13 = new HashMap();
        setField(constructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties13);
        setField(constructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(constructor, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(implicitPrototype2, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor);
        HashMap properties14 = new HashMap();
        setField(implicitPrototype2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties14);
        setField(implicitPrototype2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(implicitPrototype2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        implicitPrototype1.setImplicitPrototype(implicitPrototype2);
        setField(implicitPrototype1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(implicitPrototype1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(implicitPrototype1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        implicitPrototype.setImplicitPrototype(implicitPrototype1);
        setField(implicitPrototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(implicitPrototype, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(implicitPrototype, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        expected.setImplicitPrototype(implicitPrototype);
        setField(expected, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(expected, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        ArrowType expectedCall = ((ArrowType) getFieldValue(expected, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        ArrowType actualCall = ((ArrowType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        Node expectedCallParameters = expectedCall.parameters;
        Node actualCallParameters = actualCall.parameters;
        int expectedCallParametersType = expectedCallParameters.getType();
        int actualCallParametersType = actualCallParameters.getType();
        assertEquals(expectedCallParametersType, actualCallParametersType);
        
        Node actualCallParametersNext = actualCallParameters.getNext();
        assertNull(actualCallParametersNext);
        
        Node expectedCallParametersFirst = ((Node) getFieldValue(expectedCallParameters, "com.google.javascript.rhino.Node", "first"));
        Node actualCallParametersFirst = ((Node) getFieldValue(actualCallParameters, "com.google.javascript.rhino.Node", "first"));
        String expectedCallParametersFirstStr = ((String) getFieldValue(expectedCallParametersFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualCallParametersFirstStr = ((String) getFieldValue(actualCallParametersFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertEquals(expectedCallParametersFirstStr, actualCallParametersFirstStr);
        
        int expectedCallParametersFirstType = expectedCallParametersFirst.getType();
        int actualCallParametersFirstType = actualCallParametersFirst.getType();
        assertEquals(expectedCallParametersFirstType, actualCallParametersFirstType);
        
        assertTrue(deepEquals(expectedCallParametersFirst, actualCallParametersFirst));
        Node actualCallParametersFirstFirst = ((Node) getFieldValue(actualCallParametersFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualCallParametersFirstFirst);
        
        Node actualCallParametersFirstLast = ((Node) getFieldValue(actualCallParametersFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualCallParametersFirstLast);
        
        Object expectedCallParametersFirstPropListHead = getFieldValue(expectedCallParametersFirst, "com.google.javascript.rhino.Node", "propListHead");
        Object actualCallParametersFirstPropListHead = getFieldValue(actualCallParametersFirst, "com.google.javascript.rhino.Node", "propListHead");
        Object actualCallParametersFirstPropListHeadNext = getFieldValue(actualCallParametersFirstPropListHead, "com.google.javascript.rhino.Node$PropListItem", "next");
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualCallParametersFirstPropListHeadNext, actualCallParametersFirstPropListHeadNext));
        
        int expectedCallParametersFirstPropListHeadType = ((Integer) getFieldValue(expectedCallParametersFirstPropListHead, "com.google.javascript.rhino.Node$PropListItem", "type"));
        int actualCallParametersFirstPropListHeadType = ((Integer) getFieldValue(actualCallParametersFirstPropListHead, "com.google.javascript.rhino.Node$PropListItem", "type"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedCallParametersFirstPropListHeadType, actualCallParametersFirstPropListHeadType));
        
        int expectedCallParametersFirstPropListHeadIntValue = ((Integer) getFieldValue(expectedCallParametersFirstPropListHead, "com.google.javascript.rhino.Node$PropListItem", "intValue"));
        int actualCallParametersFirstPropListHeadIntValue = ((Integer) getFieldValue(actualCallParametersFirstPropListHead, "com.google.javascript.rhino.Node$PropListItem", "intValue"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedCallParametersFirstPropListHeadIntValue, actualCallParametersFirstPropListHeadIntValue));
        
        Object actualCallParametersFirstPropListHeadObjectValue = getFieldValue(actualCallParametersFirstPropListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue");
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualCallParametersFirstPropListHeadObjectValue, actualCallParametersFirstPropListHeadObjectValue));
        
        int expectedCallParametersFirstSourcePosition = ((Integer) getFieldValue(expectedCallParametersFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualCallParametersFirstSourcePosition = ((Integer) getFieldValue(actualCallParametersFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(expectedCallParametersFirstSourcePosition, actualCallParametersFirstSourcePosition);
        
        JSType expectedCallParametersFirstJsType = ((JSType) getFieldValue(expectedCallParametersFirst, "com.google.javascript.rhino.Node", "jsType"));
        JSType actualCallParametersFirstJsType = ((JSType) getFieldValue(actualCallParametersFirst, "com.google.javascript.rhino.Node", "jsType"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(expectedCallParametersFirstJsType, actualCallParametersFirstJsType);
        
        Node expectedCallParametersFirstParent = expectedCallParametersFirst.getParent();
        Node actualCallParametersFirstParent = actualCallParametersFirst.getParent();
        assertTrue(deepEquals(expectedCallParametersFirstParent, actualCallParametersFirstParent));
        assertTrue(deepEquals(expectedCallParametersFirstParent, actualCallParametersFirstParent));
        assertTrue(deepEquals(expectedCallParametersFirstParent, actualCallParametersFirstParent));
        Node expectedCallParametersFirstParentLast = ((Node) getFieldValue(expectedCallParametersFirstParent, "com.google.javascript.rhino.Node", "last"));
        Node actualCallParametersFirstParentLast = ((Node) getFieldValue(actualCallParametersFirstParent, "com.google.javascript.rhino.Node", "last"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedCallParametersFirstParentLast, actualCallParametersFirstParentLast));
        
        Object actualCallParametersFirstParentPropListHead = getFieldValue(actualCallParametersFirstParent, "com.google.javascript.rhino.Node", "propListHead");
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualCallParametersFirstParentPropListHead, actualCallParametersFirstParentPropListHead));
        
        assertTrue(deepEquals(expectedCallParametersFirstParent, actualCallParametersFirstParent));
        JSType actualCallParametersFirstParentJsType = ((JSType) getFieldValue(actualCallParametersFirstParent, "com.google.javascript.rhino.Node", "jsType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualCallParametersFirstParentJsType, actualCallParametersFirstParentJsType));
        
        Node actualCallParametersFirstParentParent = actualCallParametersFirstParent.getParent();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualCallParametersFirstParentParent, actualCallParametersFirstParentParent));
        
        assertTrue(deepEquals(expectedCallParameters, actualCallParameters));
        assertTrue(deepEquals(expectedCallParameters, actualCallParameters));
        assertTrue(deepEquals(expectedCallParameters, actualCallParameters));
        assertTrue(deepEquals(expectedCallParameters, actualCallParameters));
        assertTrue(deepEquals(expectedCallParameters, actualCallParameters));
        
        JSType expectedCallReturnType = expectedCall.returnType;
        JSType actualCallReturnType = actualCall.returnType;
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(expectedCallReturnType, actualCallReturnType);
        
        boolean actualCallReturnTypeInferred = actualCall.returnTypeInferred;
        assertFalse(actualCallReturnTypeInferred);
        
        boolean actualCallResolved = ((Boolean) getFieldValue(actualCall, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualCallResolved);
        
        JSType actualCallResolveResult = ((JSType) getFieldValue(actualCall, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualCallResolveResult);
        
        JSTypeRegistry expectedCallRegistry = expectedCall.registry;
        JSTypeRegistry actualCallRegistry = actualCall.registry;
        ErrorReporter expectedCallRegistryReporter = ((ErrorReporter) getFieldValue(expectedCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        ErrorReporter actualCallRegistryReporter = ((ErrorReporter) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        java.lang.String[] expectedCallRegistryReporterErrors = ((java.lang.String[]) getFieldValue(expectedCallRegistryReporter, "com.google.javascript.rhino.testing.TestErrorReporter", "errors"));
        java.lang.String[] actualCallRegistryReporterErrors = ((java.lang.String[]) getFieldValue(actualCallRegistryReporter, "com.google.javascript.rhino.testing.TestErrorReporter", "errors"));
        int expectedCallRegistryReporterErrorsSize = expectedCallRegistryReporterErrors.length;
        assertEquals(expectedCallRegistryReporterErrorsSize, actualCallRegistryReporterErrors.length);
        assertTrue(deepEquals(expectedCallRegistryReporterErrors, actualCallRegistryReporterErrors));
        
        java.lang.String[] expectedCallRegistryReporterWarnings = ((java.lang.String[]) getFieldValue(expectedCallRegistryReporter, "com.google.javascript.rhino.testing.TestErrorReporter", "warnings"));
        java.lang.String[] actualCallRegistryReporterWarnings = ((java.lang.String[]) getFieldValue(actualCallRegistryReporter, "com.google.javascript.rhino.testing.TestErrorReporter", "warnings"));
        int expectedCallRegistryReporterWarningsSize = expectedCallRegistryReporterWarnings.length;
        assertEquals(expectedCallRegistryReporterWarningsSize, actualCallRegistryReporterWarnings.length);
        assertTrue(deepEquals(expectedCallRegistryReporterWarnings, actualCallRegistryReporterWarnings));
        
        int expectedCallRegistryReporterErrorsIndex = ((Integer) getFieldValue(expectedCallRegistryReporter, "com.google.javascript.rhino.testing.TestErrorReporter", "errorsIndex"));
        int actualCallRegistryReporterErrorsIndex = ((Integer) getFieldValue(actualCallRegistryReporter, "com.google.javascript.rhino.testing.TestErrorReporter", "errorsIndex"));
        assertEquals(expectedCallRegistryReporterErrorsIndex, actualCallRegistryReporterErrorsIndex);
        
        int expectedCallRegistryReporterWarningsIndex = ((Integer) getFieldValue(expectedCallRegistryReporter, "com.google.javascript.rhino.testing.TestErrorReporter", "warningsIndex"));
        int actualCallRegistryReporterWarningsIndex = ((Integer) getFieldValue(actualCallRegistryReporter, "com.google.javascript.rhino.testing.TestErrorReporter", "warningsIndex"));
        assertEquals(expectedCallRegistryReporterWarningsIndex, actualCallRegistryReporterWarningsIndex);
        
        com.google.javascript.rhino.jstype.JSType[] expectedCallRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(expectedCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        com.google.javascript.rhino.jstype.JSType[] actualCallRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        int expectedCallRegistryNativeTypesSize = expectedCallRegistryNativeTypes.length;
        assertEquals(expectedCallRegistryNativeTypesSize, actualCallRegistryNativeTypes.length);
        assertTrue(deepEquals(expectedCallRegistryNativeTypes, actualCallRegistryNativeTypes));
        
        Map expectedCallRegistryNamesToTypes = ((Map) getFieldValue(expectedCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        Map actualCallRegistryNamesToTypes = ((Map) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        assertTrue(deepEquals(expectedCallRegistryNamesToTypes, actualCallRegistryNamesToTypes));
        
        Set expectedCallRegistryNamespaces = ((Set) getFieldValue(expectedCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        Set actualCallRegistryNamespaces = ((Set) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        assertTrue(deepEquals(expectedCallRegistryNamespaces, actualCallRegistryNamespaces));
        
        Set expectedCallRegistryEnumTypeNames = ((Set) getFieldValue(expectedCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "enumTypeNames"));
        Set actualCallRegistryEnumTypeNames = ((Set) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "enumTypeNames"));
        assertTrue(deepEquals(expectedCallRegistryEnumTypeNames, actualCallRegistryEnumTypeNames));
        
        Set expectedCallRegistryForwardDeclaredTypes = ((Set) getFieldValue(expectedCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        Set actualCallRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertTrue(deepEquals(expectedCallRegistryForwardDeclaredTypes, actualCallRegistryForwardDeclaredTypes));
        
        Map expectedCallRegistryTypesIndexedByProperty = ((Map) getFieldValue(expectedCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        Map actualCallRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertTrue(deepEquals(expectedCallRegistryTypesIndexedByProperty, actualCallRegistryTypesIndexedByProperty));
        
        Map expectedCallRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(expectedCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        Map actualCallRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        assertTrue(deepEquals(expectedCallRegistryGreatestSubtypeByProperty, actualCallRegistryGreatestSubtypeByProperty));
        
        Multimap expectedCallRegistryInterfaceToImplementors = ((Multimap) getFieldValue(expectedCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        Multimap actualCallRegistryInterfaceToImplementors = ((Multimap) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        int expectedCallRegistryInterfaceToImplementorsExpectedValuesPerKey = ((Integer) getFieldValue(expectedCallRegistryInterfaceToImplementors, "com.google.common.collect.HashMultimap", "expectedValuesPerKey"));
        int actualCallRegistryInterfaceToImplementorsExpectedValuesPerKey = ((Integer) getFieldValue(actualCallRegistryInterfaceToImplementors, "com.google.common.collect.HashMultimap", "expectedValuesPerKey"));
        assertEquals(expectedCallRegistryInterfaceToImplementorsExpectedValuesPerKey, actualCallRegistryInterfaceToImplementorsExpectedValuesPerKey);
        
        Map expectedCallRegistryInterfaceToImplementorsMap = ((Map) getFieldValue(expectedCallRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "map"));
        Map actualCallRegistryInterfaceToImplementorsMap = ((Map) getFieldValue(actualCallRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "map"));
        assertTrue(deepEquals(expectedCallRegistryInterfaceToImplementorsMap, actualCallRegistryInterfaceToImplementorsMap));
        
        int expectedCallRegistryInterfaceToImplementorsTotalSize = ((Integer) getFieldValue(expectedCallRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "totalSize"));
        int actualCallRegistryInterfaceToImplementorsTotalSize = ((Integer) getFieldValue(actualCallRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "totalSize"));
        assertEquals(expectedCallRegistryInterfaceToImplementorsTotalSize, actualCallRegistryInterfaceToImplementorsTotalSize);
        
        Set actualCallRegistryInterfaceToImplementorsKeySet = ((Set) getFieldValue(actualCallRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "keySet"));
        assertNull(actualCallRegistryInterfaceToImplementorsKeySet);
        
        Multiset actualCallRegistryInterfaceToImplementorsMultiset = ((Multiset) getFieldValue(actualCallRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "multiset"));
        assertNull(actualCallRegistryInterfaceToImplementorsMultiset);
        
        Collection actualCallRegistryInterfaceToImplementorsValuesCollection = ((Collection) getFieldValue(actualCallRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "valuesCollection"));
        assertNull(actualCallRegistryInterfaceToImplementorsValuesCollection);
        
        Collection actualCallRegistryInterfaceToImplementorsEntries = ((Collection) getFieldValue(actualCallRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "entries"));
        assertNull(actualCallRegistryInterfaceToImplementorsEntries);
        
        Map actualCallRegistryInterfaceToImplementorsAsMap = ((Map) getFieldValue(actualCallRegistryInterfaceToImplementors, "com.google.common.collect.AbstractMultimap", "asMap"));
        assertNull(actualCallRegistryInterfaceToImplementorsAsMap);
        
        Multimap expectedCallRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(expectedCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
        Multimap actualCallRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
        int expectedCallRegistryUnresolvedNamedTypesExpectedValuesPerKey = ((Integer) getFieldValue(expectedCallRegistryUnresolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey"));
        int actualCallRegistryUnresolvedNamedTypesExpectedValuesPerKey = ((Integer) getFieldValue(actualCallRegistryUnresolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey"));
        assertEquals(expectedCallRegistryUnresolvedNamedTypesExpectedValuesPerKey, actualCallRegistryUnresolvedNamedTypesExpectedValuesPerKey);
        
        Map expectedCallRegistryUnresolvedNamedTypesMap = ((Map) getFieldValue(expectedCallRegistryUnresolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
        Map actualCallRegistryUnresolvedNamedTypesMap = ((Map) getFieldValue(actualCallRegistryUnresolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
        assertTrue(deepEquals(expectedCallRegistryUnresolvedNamedTypesMap, actualCallRegistryUnresolvedNamedTypesMap));
        
        assertTrue(deepEquals(expectedCallRegistryUnresolvedNamedTypes, actualCallRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedCallRegistryUnresolvedNamedTypes, actualCallRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedCallRegistryUnresolvedNamedTypes, actualCallRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedCallRegistryUnresolvedNamedTypes, actualCallRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedCallRegistryUnresolvedNamedTypes, actualCallRegistryUnresolvedNamedTypes));
        assertTrue(deepEquals(expectedCallRegistryUnresolvedNamedTypes, actualCallRegistryUnresolvedNamedTypes));
        
        Multimap expectedCallRegistryResolvedNamedTypes = ((Multimap) getFieldValue(expectedCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
        Multimap actualCallRegistryResolvedNamedTypes = ((Multimap) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
        assertTrue(deepEquals(expectedCallRegistryResolvedNamedTypes, actualCallRegistryResolvedNamedTypes));
        Map expectedCallRegistryResolvedNamedTypesMap = ((Map) getFieldValue(expectedCallRegistryResolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
        Map actualCallRegistryResolvedNamedTypesMap = ((Map) getFieldValue(actualCallRegistryResolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map"));
        assertTrue(deepEquals(expectedCallRegistryResolvedNamedTypesMap, actualCallRegistryResolvedNamedTypesMap));
        
        assertTrue(deepEquals(expectedCallRegistryResolvedNamedTypes, actualCallRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedCallRegistryResolvedNamedTypes, actualCallRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedCallRegistryResolvedNamedTypes, actualCallRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedCallRegistryResolvedNamedTypes, actualCallRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedCallRegistryResolvedNamedTypes, actualCallRegistryResolvedNamedTypes));
        assertTrue(deepEquals(expectedCallRegistryResolvedNamedTypes, actualCallRegistryResolvedNamedTypes));
        
        boolean actualCallRegistryLastGeneration = ((Boolean) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "lastGeneration"));
        assertTrue(actualCallRegistryLastGeneration);
        
        String actualCallRegistryTemplateTypeName = ((String) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypeName"));
        assertNull(actualCallRegistryTemplateTypeName);
        
        TemplateType actualCallRegistryTemplateType = ((TemplateType) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
        assertNull(actualCallRegistryTemplateType);
        
        boolean actualCallRegistryTolerateUndefinedValues = ((Boolean) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "tolerateUndefinedValues"));
        assertFalse(actualCallRegistryTolerateUndefinedValues);
        
        JSTypeRegistry.ResolveMode expectedCallRegistryResolveMode = expectedCallRegistry.getResolveMode();
        JSTypeRegistry.ResolveMode actualCallRegistryResolveMode = actualCallRegistry.getResolveMode();
        assertEquals(expectedCallRegistryResolveMode, actualCallRegistryResolveMode);
        
        FunctionPrototypeType actualPrototype = actual.getPrototype();
        assertNull(actualPrototype);
        
        Object expectedKind = getFieldValue(expected, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertEquals(expectedKind, actualKind);
        
        ObjectType expectedTypeOfThis = expected.getTypeOfThis();
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        boolean actualTypeOfThisIsChecked = ((Boolean) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.UnknownType", "isChecked"));
        assertFalse(actualTypeOfThisIsChecked);
        
        boolean actualTypeOfThisVisited = ((Boolean) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualTypeOfThisVisited);
        
        JSDocInfo actualTypeOfThisDocInfo = ((JSDocInfo) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualTypeOfThisDocInfo);
        
        boolean actualTypeOfThisUnknown = ((Boolean) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertTrue(actualTypeOfThisUnknown);
        
        assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
        assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
        assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List expectedImplementedInterfaces = ((List) getFieldValue(expected, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertTrue(deepEquals(expectedImplementedInterfaces, actualImplementedInterfaces));
        
        List actualSubTypes = actual.getSubTypes();
        assertNull(actualSubTypes);
        
        String actualTemplateTypeName = actual.getTemplateTypeName();
        assertNull(actualTemplateTypeName);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map expectedProperties = ((Map) getFieldValue(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertTrue(deepEquals(expectedProperties, actualProperties));
        
        ObjectType expectedImplicitPrototype = expected.getImplicitPrototype();
        ObjectType actualImplicitPrototype = actual.getImplicitPrototype();
        ArrowType expectedImplicitPrototypeCall = ((ArrowType) getFieldValue(expectedImplicitPrototype, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        ArrowType actualImplicitPrototypeCall = ((ArrowType) getFieldValue(actualImplicitPrototype, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        Node expectedImplicitPrototypeCallParameters = expectedImplicitPrototypeCall.parameters;
        Node actualImplicitPrototypeCallParameters = actualImplicitPrototypeCall.parameters;
        assertTrue(deepEquals(expectedImplicitPrototypeCallParameters, actualImplicitPrototypeCallParameters));
        assertTrue(deepEquals(expectedImplicitPrototypeCallParameters, actualImplicitPrototypeCallParameters));
        Node expectedImplicitPrototypeCallParametersFirst = ((Node) getFieldValue(expectedImplicitPrototypeCallParameters, "com.google.javascript.rhino.Node", "first"));
        Node actualImplicitPrototypeCallParametersFirst = ((Node) getFieldValue(actualImplicitPrototypeCallParameters, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(expectedImplicitPrototypeCallParametersFirst, actualImplicitPrototypeCallParametersFirst));
        assertTrue(deepEquals(expectedImplicitPrototypeCallParametersFirst, actualImplicitPrototypeCallParametersFirst));
        assertTrue(deepEquals(expectedImplicitPrototypeCallParametersFirst, actualImplicitPrototypeCallParametersFirst));
        assertTrue(deepEquals(expectedImplicitPrototypeCallParametersFirst, actualImplicitPrototypeCallParametersFirst));
        assertTrue(deepEquals(expectedImplicitPrototypeCallParametersFirst, actualImplicitPrototypeCallParametersFirst));
        Object expectedImplicitPrototypeCallParametersFirstPropListHead = getFieldValue(expectedImplicitPrototypeCallParametersFirst, "com.google.javascript.rhino.Node", "propListHead");
        Object actualImplicitPrototypeCallParametersFirstPropListHead = getFieldValue(actualImplicitPrototypeCallParametersFirst, "com.google.javascript.rhino.Node", "propListHead");
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedImplicitPrototypeCallParametersFirstPropListHead, actualImplicitPrototypeCallParametersFirstPropListHead));
        
        assertTrue(deepEquals(expectedImplicitPrototypeCallParametersFirst, actualImplicitPrototypeCallParametersFirst));
        assertTrue(deepEquals(expectedImplicitPrototypeCallParametersFirst, actualImplicitPrototypeCallParametersFirst));
        Node expectedImplicitPrototypeCallParametersFirstParent = expectedImplicitPrototypeCallParametersFirst.getParent();
        Node actualImplicitPrototypeCallParametersFirstParent = actualImplicitPrototypeCallParametersFirst.getParent();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedImplicitPrototypeCallParametersFirstParent, actualImplicitPrototypeCallParametersFirstParent));
        
        Node expectedImplicitPrototypeCallParametersLast = ((Node) getFieldValue(expectedImplicitPrototypeCallParameters, "com.google.javascript.rhino.Node", "last"));
        Node actualImplicitPrototypeCallParametersLast = ((Node) getFieldValue(actualImplicitPrototypeCallParameters, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(expectedImplicitPrototypeCallParametersLast, actualImplicitPrototypeCallParametersLast));
        assertTrue(deepEquals(expectedImplicitPrototypeCallParametersLast, actualImplicitPrototypeCallParametersLast));
        assertTrue(deepEquals(expectedImplicitPrototypeCallParametersLast, actualImplicitPrototypeCallParametersLast));
        assertTrue(deepEquals(expectedImplicitPrototypeCallParametersLast, actualImplicitPrototypeCallParametersLast));
        assertTrue(deepEquals(expectedImplicitPrototypeCallParametersLast, actualImplicitPrototypeCallParametersLast));
        assertTrue(deepEquals(expectedImplicitPrototypeCallParametersLast, actualImplicitPrototypeCallParametersLast));
        assertTrue(deepEquals(expectedImplicitPrototypeCallParametersLast, actualImplicitPrototypeCallParametersLast));
        assertTrue(deepEquals(expectedImplicitPrototypeCallParametersLast, actualImplicitPrototypeCallParametersLast));
        assertTrue(deepEquals(expectedImplicitPrototypeCallParametersLast, actualImplicitPrototypeCallParametersLast));
        
        assertTrue(deepEquals(expectedImplicitPrototypeCallParameters, actualImplicitPrototypeCallParameters));
        assertTrue(deepEquals(expectedImplicitPrototypeCallParameters, actualImplicitPrototypeCallParameters));
        assertTrue(deepEquals(expectedImplicitPrototypeCallParameters, actualImplicitPrototypeCallParameters));
        assertTrue(deepEquals(expectedImplicitPrototypeCallParameters, actualImplicitPrototypeCallParameters));
        
        assertTrue(deepEquals(expectedImplicitPrototypeCall, actualImplicitPrototypeCall));
        assertTrue(deepEquals(expectedImplicitPrototypeCall, actualImplicitPrototypeCall));
        assertTrue(deepEquals(expectedImplicitPrototypeCall, actualImplicitPrototypeCall));
        assertTrue(deepEquals(expectedImplicitPrototypeCall, actualImplicitPrototypeCall));
        assertTrue(deepEquals(expectedImplicitPrototypeCall, actualImplicitPrototypeCall));
        
        assertTrue(deepEquals(expectedImplicitPrototype, actualImplicitPrototype));
        Object expectedImplicitPrototypeKind = getFieldValue(expectedImplicitPrototype, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        Object actualImplicitPrototypeKind = getFieldValue(actualImplicitPrototype, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertEquals(expectedImplicitPrototypeKind, actualImplicitPrototypeKind);
        
        ObjectType expectedImplicitPrototypeTypeOfThis = (((FunctionType) expectedImplicitPrototype)).getTypeOfThis();
        ObjectType actualImplicitPrototypeTypeOfThis = (((FunctionType) actualImplicitPrototype)).getTypeOfThis();
        Visitor expectedImplicitPrototypeTypeOfThisLeastSupertypeVisitor = ((Visitor) getFieldValue(expectedImplicitPrototypeTypeOfThis, "com.google.javascript.rhino.jstype.NoObjectType", "leastSupertypeVisitor"));
        Visitor actualImplicitPrototypeTypeOfThisLeastSupertypeVisitor = ((Visitor) getFieldValue(actualImplicitPrototypeTypeOfThis, "com.google.javascript.rhino.jstype.NoObjectType", "leastSupertypeVisitor"));
        
        Visitor expectedImplicitPrototypeTypeOfThisGreatestSubtypeVisitor = ((Visitor) getFieldValue(expectedImplicitPrototypeTypeOfThis, "com.google.javascript.rhino.jstype.NoObjectType", "greatestSubtypeVisitor"));
        Visitor actualImplicitPrototypeTypeOfThisGreatestSubtypeVisitor = ((Visitor) getFieldValue(actualImplicitPrototypeTypeOfThis, "com.google.javascript.rhino.jstype.NoObjectType", "greatestSubtypeVisitor"));
        
        ArrowType expectedImplicitPrototypeTypeOfThisCall = ((ArrowType) getFieldValue(expectedImplicitPrototypeTypeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        ArrowType actualImplicitPrototypeTypeOfThisCall = ((ArrowType) getFieldValue(actualImplicitPrototypeTypeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        Node expectedImplicitPrototypeTypeOfThisCallParameters = expectedImplicitPrototypeTypeOfThisCall.parameters;
        Node actualImplicitPrototypeTypeOfThisCallParameters = actualImplicitPrototypeTypeOfThisCall.parameters;
        assertTrue(deepEquals(expectedImplicitPrototypeTypeOfThisCallParameters, actualImplicitPrototypeTypeOfThisCallParameters));
        assertTrue(deepEquals(expectedImplicitPrototypeTypeOfThisCallParameters, actualImplicitPrototypeTypeOfThisCallParameters));
        Node expectedImplicitPrototypeTypeOfThisCallParametersFirst = ((Node) getFieldValue(expectedImplicitPrototypeTypeOfThisCallParameters, "com.google.javascript.rhino.Node", "first"));
        Node actualImplicitPrototypeTypeOfThisCallParametersFirst = ((Node) getFieldValue(actualImplicitPrototypeTypeOfThisCallParameters, "com.google.javascript.rhino.Node", "first"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedImplicitPrototypeTypeOfThisCallParametersFirst, actualImplicitPrototypeTypeOfThisCallParametersFirst));
        
        Node expectedImplicitPrototypeTypeOfThisCallParametersLast = ((Node) getFieldValue(expectedImplicitPrototypeTypeOfThisCallParameters, "com.google.javascript.rhino.Node", "last"));
        Node actualImplicitPrototypeTypeOfThisCallParametersLast = ((Node) getFieldValue(actualImplicitPrototypeTypeOfThisCallParameters, "com.google.javascript.rhino.Node", "last"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedImplicitPrototypeTypeOfThisCallParametersLast, actualImplicitPrototypeTypeOfThisCallParametersLast));
        
        assertTrue(deepEquals(expectedImplicitPrototypeTypeOfThisCallParameters, actualImplicitPrototypeTypeOfThisCallParameters));
        assertTrue(deepEquals(expectedImplicitPrototypeTypeOfThisCallParameters, actualImplicitPrototypeTypeOfThisCallParameters));
        assertTrue(deepEquals(expectedImplicitPrototypeTypeOfThisCallParameters, actualImplicitPrototypeTypeOfThisCallParameters));
        assertTrue(deepEquals(expectedImplicitPrototypeTypeOfThisCallParameters, actualImplicitPrototypeTypeOfThisCallParameters));
        
        JSType expectedImplicitPrototypeTypeOfThisCallReturnType = expectedImplicitPrototypeTypeOfThisCall.returnType;
        JSType actualImplicitPrototypeTypeOfThisCallReturnType = actualImplicitPrototypeTypeOfThisCall.returnType;
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(expectedImplicitPrototypeTypeOfThisCallReturnType, actualImplicitPrototypeTypeOfThisCallReturnType);
        
        assertTrue(deepEquals(expectedImplicitPrototypeTypeOfThisCall, actualImplicitPrototypeTypeOfThisCall));
        assertTrue(deepEquals(expectedImplicitPrototypeTypeOfThisCall, actualImplicitPrototypeTypeOfThisCall));
        assertTrue(deepEquals(expectedImplicitPrototypeTypeOfThisCall, actualImplicitPrototypeTypeOfThisCall));
        assertTrue(deepEquals(expectedImplicitPrototypeTypeOfThisCall, actualImplicitPrototypeTypeOfThisCall));
        
        assertTrue(deepEquals(expectedImplicitPrototypeTypeOfThis, actualImplicitPrototypeTypeOfThis));
        assertTrue(deepEquals(expectedImplicitPrototypeTypeOfThis, actualImplicitPrototypeTypeOfThis));
        assertTrue(deepEquals(expectedImplicitPrototypeTypeOfThis, actualImplicitPrototypeTypeOfThis));
        assertTrue(deepEquals(expectedImplicitPrototypeTypeOfThis, actualImplicitPrototypeTypeOfThis));
        List expectedImplicitPrototypeTypeOfThisImplementedInterfaces = ((List) getFieldValue(expectedImplicitPrototypeTypeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        List actualImplicitPrototypeTypeOfThisImplementedInterfaces = ((List) getFieldValue(actualImplicitPrototypeTypeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertTrue(deepEquals(expectedImplicitPrototypeTypeOfThisImplementedInterfaces, actualImplicitPrototypeTypeOfThisImplementedInterfaces));
        
        assertTrue(deepEquals(expectedImplicitPrototypeTypeOfThis, actualImplicitPrototypeTypeOfThis));
        assertTrue(deepEquals(expectedImplicitPrototypeTypeOfThis, actualImplicitPrototypeTypeOfThis));
        assertTrue(deepEquals(expectedImplicitPrototypeTypeOfThis, actualImplicitPrototypeTypeOfThis));
        Map expectedImplicitPrototypeTypeOfThisProperties = ((Map) getFieldValue(expectedImplicitPrototypeTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        Map actualImplicitPrototypeTypeOfThisProperties = ((Map) getFieldValue(actualImplicitPrototypeTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertTrue(deepEquals(expectedImplicitPrototypeTypeOfThisProperties, actualImplicitPrototypeTypeOfThisProperties));
        
        ObjectType actualImplicitPrototypeTypeOfThisImplicitPrototype = (((PrototypeObjectType) actualImplicitPrototypeTypeOfThis)).getImplicitPrototype();
        assertNull(actualImplicitPrototypeTypeOfThisImplicitPrototype);
        
        boolean actualImplicitPrototypeTypeOfThisNativeType = ((Boolean) getFieldValue(actualImplicitPrototypeTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertTrue(actualImplicitPrototypeTypeOfThisNativeType);
        
        boolean actualImplicitPrototypeTypeOfThisPrettyPrint = ((Boolean) getFieldValue(actualImplicitPrototypeTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualImplicitPrototypeTypeOfThisPrettyPrint);
        
        assertTrue(deepEquals(expectedImplicitPrototypeTypeOfThis, actualImplicitPrototypeTypeOfThis));
        assertTrue(deepEquals(expectedImplicitPrototypeTypeOfThis, actualImplicitPrototypeTypeOfThis));
        assertTrue(deepEquals(expectedImplicitPrototypeTypeOfThis, actualImplicitPrototypeTypeOfThis));
        assertTrue(deepEquals(expectedImplicitPrototypeTypeOfThis, actualImplicitPrototypeTypeOfThis));
        assertTrue(deepEquals(expectedImplicitPrototypeTypeOfThis, actualImplicitPrototypeTypeOfThis));
        assertTrue(deepEquals(expectedImplicitPrototypeTypeOfThis, actualImplicitPrototypeTypeOfThis));
        
        assertTrue(deepEquals(expectedImplicitPrototype, actualImplicitPrototype));
        List expectedImplicitPrototypeImplementedInterfaces = ((List) getFieldValue(expectedImplicitPrototype, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        List actualImplicitPrototypeImplementedInterfaces = ((List) getFieldValue(actualImplicitPrototype, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertTrue(deepEquals(expectedImplicitPrototypeImplementedInterfaces, actualImplicitPrototypeImplementedInterfaces));
        
        assertTrue(deepEquals(expectedImplicitPrototype, actualImplicitPrototype));
        assertTrue(deepEquals(expectedImplicitPrototype, actualImplicitPrototype));
        String expectedImplicitPrototypeClassName = ((String) getFieldValue(expectedImplicitPrototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        String actualImplicitPrototypeClassName = ((String) getFieldValue(actualImplicitPrototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertEquals(expectedImplicitPrototypeClassName, actualImplicitPrototypeClassName);
        
        Map expectedImplicitPrototypeProperties = ((Map) getFieldValue(expectedImplicitPrototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        Map actualImplicitPrototypeProperties = ((Map) getFieldValue(actualImplicitPrototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertTrue(deepEquals(expectedImplicitPrototypeProperties, actualImplicitPrototypeProperties));
        
        ObjectType expectedImplicitPrototypeImplicitPrototype = (((PrototypeObjectType) expectedImplicitPrototype)).getImplicitPrototype();
        ObjectType actualImplicitPrototypeImplicitPrototype = (((PrototypeObjectType) actualImplicitPrototype)).getImplicitPrototype();
        FunctionType expectedImplicitPrototypeImplicitPrototypeOwnerFunction = (((FunctionPrototypeType) expectedImplicitPrototypeImplicitPrototype)).getOwnerFunction();
        FunctionType actualImplicitPrototypeImplicitPrototypeOwnerFunction = (((FunctionPrototypeType) actualImplicitPrototypeImplicitPrototype)).getOwnerFunction();
        ArrowType expectedImplicitPrototypeImplicitPrototypeOwnerFunctionCall = ((ArrowType) getFieldValue(expectedImplicitPrototypeImplicitPrototypeOwnerFunction, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        ArrowType actualImplicitPrototypeImplicitPrototypeOwnerFunctionCall = ((ArrowType) getFieldValue(actualImplicitPrototypeImplicitPrototypeOwnerFunction, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        Node expectedImplicitPrototypeImplicitPrototypeOwnerFunctionCallParameters = expectedImplicitPrototypeImplicitPrototypeOwnerFunctionCall.parameters;
        Node actualImplicitPrototypeImplicitPrototypeOwnerFunctionCallParameters = actualImplicitPrototypeImplicitPrototypeOwnerFunctionCall.parameters;
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionCallParameters, actualImplicitPrototypeImplicitPrototypeOwnerFunctionCallParameters));
        
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionCall, actualImplicitPrototypeImplicitPrototypeOwnerFunctionCall));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionCall, actualImplicitPrototypeImplicitPrototypeOwnerFunctionCall));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionCall, actualImplicitPrototypeImplicitPrototypeOwnerFunctionCall));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionCall, actualImplicitPrototypeImplicitPrototypeOwnerFunctionCall));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionCall, actualImplicitPrototypeImplicitPrototypeOwnerFunctionCall));
        
        FunctionPrototypeType expectedImplicitPrototypeImplicitPrototypeOwnerFunctionPrototype = expectedImplicitPrototypeImplicitPrototypeOwnerFunction.getPrototype();
        FunctionPrototypeType actualImplicitPrototypeImplicitPrototypeOwnerFunctionPrototype = actualImplicitPrototypeImplicitPrototypeOwnerFunction.getPrototype();
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionPrototype, actualImplicitPrototypeImplicitPrototypeOwnerFunctionPrototype));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionPrototype, actualImplicitPrototypeImplicitPrototypeOwnerFunctionPrototype));
        Map expectedImplicitPrototypeImplicitPrototypeOwnerFunctionPrototypeProperties = ((Map) getFieldValue(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionPrototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        Map actualImplicitPrototypeImplicitPrototypeOwnerFunctionPrototypeProperties = ((Map) getFieldValue(actualImplicitPrototypeImplicitPrototypeOwnerFunctionPrototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionPrototypeProperties, actualImplicitPrototypeImplicitPrototypeOwnerFunctionPrototypeProperties));
        
        ObjectType expectedImplicitPrototypeImplicitPrototypeOwnerFunctionPrototypeImplicitPrototype = expectedImplicitPrototypeImplicitPrototypeOwnerFunctionPrototype.getImplicitPrototype();
        ObjectType actualImplicitPrototypeImplicitPrototypeOwnerFunctionPrototypeImplicitPrototype = actualImplicitPrototypeImplicitPrototypeOwnerFunctionPrototype.getImplicitPrototype();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionPrototypeImplicitPrototype, actualImplicitPrototypeImplicitPrototypeOwnerFunctionPrototypeImplicitPrototype));
        
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionPrototype, actualImplicitPrototypeImplicitPrototypeOwnerFunctionPrototype));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionPrototype, actualImplicitPrototypeImplicitPrototypeOwnerFunctionPrototype));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionPrototype, actualImplicitPrototypeImplicitPrototypeOwnerFunctionPrototype));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionPrototype, actualImplicitPrototypeImplicitPrototypeOwnerFunctionPrototype));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionPrototype, actualImplicitPrototypeImplicitPrototypeOwnerFunctionPrototype));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionPrototype, actualImplicitPrototypeImplicitPrototypeOwnerFunctionPrototype));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionPrototype, actualImplicitPrototypeImplicitPrototypeOwnerFunctionPrototype));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionPrototype, actualImplicitPrototypeImplicitPrototypeOwnerFunctionPrototype));
        
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunction, actualImplicitPrototypeImplicitPrototypeOwnerFunction));
        ObjectType expectedImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis = expectedImplicitPrototypeImplicitPrototypeOwnerFunction.getTypeOfThis();
        ObjectType actualImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis = actualImplicitPrototypeImplicitPrototypeOwnerFunction.getTypeOfThis();
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis, actualImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis, actualImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis, actualImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis, actualImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis, actualImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis, actualImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis, actualImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis, actualImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis, actualImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis, actualImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis, actualImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis, actualImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis, actualImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis, actualImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis, actualImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis, actualImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis, actualImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis, actualImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis, actualImplicitPrototypeImplicitPrototypeOwnerFunctionTypeOfThis));
        
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunction, actualImplicitPrototypeImplicitPrototypeOwnerFunction));
        List expectedImplicitPrototypeImplicitPrototypeOwnerFunctionImplementedInterfaces = ((List) getFieldValue(expectedImplicitPrototypeImplicitPrototypeOwnerFunction, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        List actualImplicitPrototypeImplicitPrototypeOwnerFunctionImplementedInterfaces = ((List) getFieldValue(actualImplicitPrototypeImplicitPrototypeOwnerFunction, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionImplementedInterfaces, actualImplicitPrototypeImplicitPrototypeOwnerFunctionImplementedInterfaces));
        
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunction, actualImplicitPrototypeImplicitPrototypeOwnerFunction));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunction, actualImplicitPrototypeImplicitPrototypeOwnerFunction));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunction, actualImplicitPrototypeImplicitPrototypeOwnerFunction));
        Map expectedImplicitPrototypeImplicitPrototypeOwnerFunctionProperties = ((Map) getFieldValue(expectedImplicitPrototypeImplicitPrototypeOwnerFunction, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        Map actualImplicitPrototypeImplicitPrototypeOwnerFunctionProperties = ((Map) getFieldValue(actualImplicitPrototypeImplicitPrototypeOwnerFunction, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunctionProperties, actualImplicitPrototypeImplicitPrototypeOwnerFunctionProperties));
        
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunction, actualImplicitPrototypeImplicitPrototypeOwnerFunction));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunction, actualImplicitPrototypeImplicitPrototypeOwnerFunction));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunction, actualImplicitPrototypeImplicitPrototypeOwnerFunction));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunction, actualImplicitPrototypeImplicitPrototypeOwnerFunction));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunction, actualImplicitPrototypeImplicitPrototypeOwnerFunction));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunction, actualImplicitPrototypeImplicitPrototypeOwnerFunction));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunction, actualImplicitPrototypeImplicitPrototypeOwnerFunction));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunction, actualImplicitPrototypeImplicitPrototypeOwnerFunction));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototypeOwnerFunction, actualImplicitPrototypeImplicitPrototypeOwnerFunction));
        
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototype, actualImplicitPrototypeImplicitPrototype));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototype, actualImplicitPrototypeImplicitPrototype));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototype, actualImplicitPrototypeImplicitPrototype));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototype, actualImplicitPrototypeImplicitPrototype));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototype, actualImplicitPrototypeImplicitPrototype));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototype, actualImplicitPrototypeImplicitPrototype));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototype, actualImplicitPrototypeImplicitPrototype));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototype, actualImplicitPrototypeImplicitPrototype));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototype, actualImplicitPrototypeImplicitPrototype));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototype, actualImplicitPrototypeImplicitPrototype));
        assertTrue(deepEquals(expectedImplicitPrototypeImplicitPrototype, actualImplicitPrototypeImplicitPrototype));
        
        assertTrue(deepEquals(expectedImplicitPrototype, actualImplicitPrototype));
        assertTrue(deepEquals(expectedImplicitPrototype, actualImplicitPrototype));
        assertTrue(deepEquals(expectedImplicitPrototype, actualImplicitPrototype));
        assertTrue(deepEquals(expectedImplicitPrototype, actualImplicitPrototype));
        assertTrue(deepEquals(expectedImplicitPrototype, actualImplicitPrototype));
        assertTrue(deepEquals(expectedImplicitPrototype, actualImplicitPrototype));
        assertTrue(deepEquals(expectedImplicitPrototype, actualImplicitPrototype));
        assertTrue(deepEquals(expectedImplicitPrototype, actualImplicitPrototype));
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
    */
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method build()
    
    @Test
    public void testBuild1() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[39];
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        nativeTypes[35] = ((JSType) namedType);
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(unknownType, "com.google.javascript.rhino.jstype.UnknownType", "isChecked", true);
        nativeTypes[38] = ((JSType) unknownType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry", registry);
        
        FunctionType actual = functionBuilder.build();
        
        FunctionType expected = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters.setType(83);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "intValue", 1);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first, "com.google.javascript.rhino.Node", "parent", parameters);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(parameters, "com.google.javascript.rhino.Node", "last", first);
        setField(parameters, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", namedType);
        setField(call, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(expected, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(expected, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(expected, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", namedType);
        List implementedInterfaces = new ArrayList();
        expected.setImplementedInterfaces(implementedInterfaces);
        HashMap properties = new HashMap();
        setField(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        setField(expected, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(expected, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        ArrowType expectedCall = ((ArrowType) getFieldValue(expected, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        ArrowType actualCall = ((ArrowType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        Node expectedCallParameters = expectedCall.parameters;
        Node actualCallParameters = actualCall.parameters;
        int expectedCallParametersType = expectedCallParameters.getType();
        int actualCallParametersType = actualCallParameters.getType();
        assertEquals(expectedCallParametersType, actualCallParametersType);
        
        Node actualCallParametersNext = actualCallParameters.getNext();
        assertNull(actualCallParametersNext);
        
        Node expectedCallParametersFirst = ((Node) getFieldValue(expectedCallParameters, "com.google.javascript.rhino.Node", "first"));
        Node actualCallParametersFirst = ((Node) getFieldValue(actualCallParameters, "com.google.javascript.rhino.Node", "first"));
        String expectedCallParametersFirstStr = ((String) getFieldValue(expectedCallParametersFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualCallParametersFirstStr = ((String) getFieldValue(actualCallParametersFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertEquals(expectedCallParametersFirstStr, actualCallParametersFirstStr);
        
        int expectedCallParametersFirstType = expectedCallParametersFirst.getType();
        int actualCallParametersFirstType = actualCallParametersFirst.getType();
        assertEquals(expectedCallParametersFirstType, actualCallParametersFirstType);
        
        assertTrue(deepEquals(expectedCallParametersFirst, actualCallParametersFirst));
        Node actualCallParametersFirstFirst = ((Node) getFieldValue(actualCallParametersFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualCallParametersFirstFirst);
        
        Node actualCallParametersFirstLast = ((Node) getFieldValue(actualCallParametersFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualCallParametersFirstLast);
        
        Object expectedCallParametersFirstPropListHead = getFieldValue(expectedCallParametersFirst, "com.google.javascript.rhino.Node", "propListHead");
        Object actualCallParametersFirstPropListHead = getFieldValue(actualCallParametersFirst, "com.google.javascript.rhino.Node", "propListHead");
        Object actualCallParametersFirstPropListHeadNext = getFieldValue(actualCallParametersFirstPropListHead, "com.google.javascript.rhino.Node$PropListItem", "next");
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualCallParametersFirstPropListHeadNext, actualCallParametersFirstPropListHeadNext));
        
        int expectedCallParametersFirstPropListHeadType = ((Integer) getFieldValue(expectedCallParametersFirstPropListHead, "com.google.javascript.rhino.Node$PropListItem", "type"));
        int actualCallParametersFirstPropListHeadType = ((Integer) getFieldValue(actualCallParametersFirstPropListHead, "com.google.javascript.rhino.Node$PropListItem", "type"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedCallParametersFirstPropListHeadType, actualCallParametersFirstPropListHeadType));
        
        int expectedCallParametersFirstPropListHeadIntValue = ((Integer) getFieldValue(expectedCallParametersFirstPropListHead, "com.google.javascript.rhino.Node$PropListItem", "intValue"));
        int actualCallParametersFirstPropListHeadIntValue = ((Integer) getFieldValue(actualCallParametersFirstPropListHead, "com.google.javascript.rhino.Node$PropListItem", "intValue"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedCallParametersFirstPropListHeadIntValue, actualCallParametersFirstPropListHeadIntValue));
        
        Object actualCallParametersFirstPropListHeadObjectValue = getFieldValue(actualCallParametersFirstPropListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue");
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualCallParametersFirstPropListHeadObjectValue, actualCallParametersFirstPropListHeadObjectValue));
        
        int expectedCallParametersFirstSourcePosition = ((Integer) getFieldValue(expectedCallParametersFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualCallParametersFirstSourcePosition = ((Integer) getFieldValue(actualCallParametersFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(expectedCallParametersFirstSourcePosition, actualCallParametersFirstSourcePosition);
        
        JSType actualCallParametersFirstJsType = ((JSType) getFieldValue(actualCallParametersFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualCallParametersFirstJsType);
        
        Node expectedCallParametersFirstParent = expectedCallParametersFirst.getParent();
        Node actualCallParametersFirstParent = actualCallParametersFirst.getParent();
        assertTrue(deepEquals(expectedCallParametersFirstParent, actualCallParametersFirstParent));
        assertTrue(deepEquals(expectedCallParametersFirstParent, actualCallParametersFirstParent));
        assertTrue(deepEquals(expectedCallParametersFirstParent, actualCallParametersFirstParent));
        Node expectedCallParametersFirstParentLast = ((Node) getFieldValue(expectedCallParametersFirstParent, "com.google.javascript.rhino.Node", "last"));
        Node actualCallParametersFirstParentLast = ((Node) getFieldValue(actualCallParametersFirstParent, "com.google.javascript.rhino.Node", "last"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedCallParametersFirstParentLast, actualCallParametersFirstParentLast));
        
        Object actualCallParametersFirstParentPropListHead = getFieldValue(actualCallParametersFirstParent, "com.google.javascript.rhino.Node", "propListHead");
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualCallParametersFirstParentPropListHead, actualCallParametersFirstParentPropListHead));
        
        assertTrue(deepEquals(expectedCallParametersFirstParent, actualCallParametersFirstParent));
        assertTrue(deepEquals(expectedCallParametersFirstParent, actualCallParametersFirstParent));
        Node actualCallParametersFirstParentParent = actualCallParametersFirstParent.getParent();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualCallParametersFirstParentParent, actualCallParametersFirstParentParent));
        
        assertTrue(deepEquals(expectedCallParameters, actualCallParameters));
        assertTrue(deepEquals(expectedCallParameters, actualCallParameters));
        assertTrue(deepEquals(expectedCallParameters, actualCallParameters));
        assertTrue(deepEquals(expectedCallParameters, actualCallParameters));
        assertTrue(deepEquals(expectedCallParameters, actualCallParameters));
        
        JSType expectedCallReturnType = expectedCall.returnType;
        JSType actualCallReturnType = actualCall.returnType;
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(expectedCallReturnType, actualCallReturnType);
        
        boolean actualCallReturnTypeInferred = actualCall.returnTypeInferred;
        assertFalse(actualCallReturnTypeInferred);
        
        boolean actualCallResolved = ((Boolean) getFieldValue(actualCall, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualCallResolved);
        
        JSType actualCallResolveResult = ((JSType) getFieldValue(actualCall, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualCallResolveResult);
        
        JSTypeRegistry expectedCallRegistry = expectedCall.registry;
        JSTypeRegistry actualCallRegistry = actualCall.registry;
        ErrorReporter actualCallRegistryReporter = ((ErrorReporter) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        assertNull(actualCallRegistryReporter);
        
        com.google.javascript.rhino.jstype.JSType[] expectedCallRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(expectedCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        com.google.javascript.rhino.jstype.JSType[] actualCallRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        int expectedCallRegistryNativeTypesSize = expectedCallRegistryNativeTypes.length;
        assertEquals(expectedCallRegistryNativeTypesSize, actualCallRegistryNativeTypes.length);
        assertTrue(deepEquals(expectedCallRegistryNativeTypes, actualCallRegistryNativeTypes));
        
        Map actualCallRegistryNamesToTypes = ((Map) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        assertNull(actualCallRegistryNamesToTypes);
        
        Set actualCallRegistryNamespaces = ((Set) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        assertNull(actualCallRegistryNamespaces);
        
        Set actualCallRegistryEnumTypeNames = ((Set) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "enumTypeNames"));
        assertNull(actualCallRegistryEnumTypeNames);
        
        Set actualCallRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertNull(actualCallRegistryForwardDeclaredTypes);
        
        Map actualCallRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertNull(actualCallRegistryTypesIndexedByProperty);
        
        Map actualCallRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        assertNull(actualCallRegistryGreatestSubtypeByProperty);
        
        Multimap actualCallRegistryInterfaceToImplementors = ((Multimap) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        assertNull(actualCallRegistryInterfaceToImplementors);
        
        Multimap actualCallRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
        assertNull(actualCallRegistryUnresolvedNamedTypes);
        
        Multimap actualCallRegistryResolvedNamedTypes = ((Multimap) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
        assertNull(actualCallRegistryResolvedNamedTypes);
        
        boolean actualCallRegistryLastGeneration = ((Boolean) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "lastGeneration"));
        assertFalse(actualCallRegistryLastGeneration);
        
        String actualCallRegistryTemplateTypeName = ((String) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypeName"));
        assertNull(actualCallRegistryTemplateTypeName);
        
        TemplateType actualCallRegistryTemplateType = ((TemplateType) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
        assertNull(actualCallRegistryTemplateType);
        
        boolean actualCallRegistryTolerateUndefinedValues = ((Boolean) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "tolerateUndefinedValues"));
        assertFalse(actualCallRegistryTolerateUndefinedValues);
        
        JSTypeRegistry.ResolveMode actualCallRegistryResolveMode = actualCallRegistry.getResolveMode();
        assertNull(actualCallRegistryResolveMode);
        
        FunctionPrototypeType actualPrototype = actual.getPrototype();
        assertNull(actualPrototype);
        
        Object expectedKind = getFieldValue(expected, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertEquals(expectedKind, actualKind);
        
        ObjectType expectedTypeOfThis = expected.getTypeOfThis();
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        String actualTypeOfThisReference = ((String) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.NamedType", "reference"));
        assertNull(actualTypeOfThisReference);
        
        String actualTypeOfThisSourceName = ((String) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.NamedType", "sourceName"));
        assertNull(actualTypeOfThisSourceName);
        
        int expectedTypeOfThisLineno = ((Integer) getFieldValue(expectedTypeOfThis, "com.google.javascript.rhino.jstype.NamedType", "lineno"));
        int actualTypeOfThisLineno = ((Integer) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.NamedType", "lineno"));
        assertEquals(expectedTypeOfThisLineno, actualTypeOfThisLineno);
        
        int expectedTypeOfThisCharno = ((Integer) getFieldValue(expectedTypeOfThis, "com.google.javascript.rhino.jstype.NamedType", "charno"));
        int actualTypeOfThisCharno = ((Integer) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.NamedType", "charno"));
        assertEquals(expectedTypeOfThisCharno, actualTypeOfThisCharno);
        
        boolean actualTypeOfThisForgiving = ((Boolean) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.NamedType", "forgiving"));
        assertFalse(actualTypeOfThisForgiving);
        
        ObjectType actualTypeOfThisReferencedType = ((ObjectType) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        assertNull(actualTypeOfThisReferencedType);
        
        boolean actualTypeOfThisVisited = ((Boolean) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualTypeOfThisVisited);
        
        JSDocInfo actualTypeOfThisDocInfo = ((JSDocInfo) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualTypeOfThisDocInfo);
        
        boolean actualTypeOfThisUnknown = ((Boolean) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualTypeOfThisUnknown);
        
        assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
        assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
        JSTypeRegistry actualTypeOfThisRegistry = actualTypeOfThis.registry;
        assertNull(actualTypeOfThisRegistry);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List expectedImplementedInterfaces = ((List) getFieldValue(expected, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertTrue(deepEquals(expectedImplementedInterfaces, actualImplementedInterfaces));
        
        List actualSubTypes = actual.getSubTypes();
        assertNull(actualSubTypes);
        
        String actualTemplateTypeName = actual.getTemplateTypeName();
        assertNull(actualTemplateTypeName);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map expectedProperties = ((Map) getFieldValue(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertTrue(deepEquals(expectedProperties, actualProperties));
        
        ObjectType actualImplicitPrototype = actual.getImplicitPrototype();
        assertNull(actualImplicitPrototype);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualPrettyPrint);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertTrue(actualUnknown);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        
        JSTypeRegistry functionBuilderRegistry = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes0 = ((JSType) get(functionBuilderRegistryRegistryNativeTypes, 0));
        JSTypeRegistry functionBuilderRegistry1 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes1 = ((JSType) get(functionBuilderRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry functionBuilderRegistry2 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes2 = ((JSType) get(functionBuilderRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry functionBuilderRegistry3 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes3 = ((JSType) get(functionBuilderRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry functionBuilderRegistry4 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes4 = ((JSType) get(functionBuilderRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry functionBuilderRegistry5 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes5 = ((JSType) get(functionBuilderRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry functionBuilderRegistry6 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes6 = ((JSType) get(functionBuilderRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry functionBuilderRegistry7 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes7 = ((JSType) get(functionBuilderRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry functionBuilderRegistry8 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes8 = ((JSType) get(functionBuilderRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry functionBuilderRegistry9 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes9 = ((JSType) get(functionBuilderRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry functionBuilderRegistry10 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes10 = ((JSType) get(functionBuilderRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry functionBuilderRegistry11 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes11 = ((JSType) get(functionBuilderRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry functionBuilderRegistry12 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes12 = ((JSType) get(functionBuilderRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry functionBuilderRegistry13 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes13 = ((JSType) get(functionBuilderRegistry13RegistryNativeTypes, 13));
        JSTypeRegistry functionBuilderRegistry14 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes14 = ((JSType) get(functionBuilderRegistry14RegistryNativeTypes, 14));
        JSTypeRegistry functionBuilderRegistry15 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry15RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes15 = ((JSType) get(functionBuilderRegistry15RegistryNativeTypes, 15));
        JSTypeRegistry functionBuilderRegistry16 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry16RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes16 = ((JSType) get(functionBuilderRegistry16RegistryNativeTypes, 16));
        JSTypeRegistry functionBuilderRegistry17 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry17RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes17 = ((JSType) get(functionBuilderRegistry17RegistryNativeTypes, 17));
        JSTypeRegistry functionBuilderRegistry18 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry18RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes18 = ((JSType) get(functionBuilderRegistry18RegistryNativeTypes, 18));
        JSTypeRegistry functionBuilderRegistry19 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry19RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes19 = ((JSType) get(functionBuilderRegistry19RegistryNativeTypes, 19));
        JSTypeRegistry functionBuilderRegistry20 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry20RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes20 = ((JSType) get(functionBuilderRegistry20RegistryNativeTypes, 20));
        JSTypeRegistry functionBuilderRegistry21 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry21RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes21 = ((JSType) get(functionBuilderRegistry21RegistryNativeTypes, 21));
        JSTypeRegistry functionBuilderRegistry22 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry22RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes22 = ((JSType) get(functionBuilderRegistry22RegistryNativeTypes, 22));
        JSTypeRegistry functionBuilderRegistry23 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry23RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes23 = ((JSType) get(functionBuilderRegistry23RegistryNativeTypes, 23));
        JSTypeRegistry functionBuilderRegistry24 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry24RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes24 = ((JSType) get(functionBuilderRegistry24RegistryNativeTypes, 24));
        JSTypeRegistry functionBuilderRegistry25 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry25RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes25 = ((JSType) get(functionBuilderRegistry25RegistryNativeTypes, 25));
        JSTypeRegistry functionBuilderRegistry26 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry26RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes26 = ((JSType) get(functionBuilderRegistry26RegistryNativeTypes, 26));
        JSTypeRegistry functionBuilderRegistry27 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry27RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes27 = ((JSType) get(functionBuilderRegistry27RegistryNativeTypes, 27));
        JSTypeRegistry functionBuilderRegistry28 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry28RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes28 = ((JSType) get(functionBuilderRegistry28RegistryNativeTypes, 28));
        JSTypeRegistry functionBuilderRegistry29 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry29RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes29 = ((JSType) get(functionBuilderRegistry29RegistryNativeTypes, 29));
        JSTypeRegistry functionBuilderRegistry30 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry30RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes30 = ((JSType) get(functionBuilderRegistry30RegistryNativeTypes, 30));
        JSTypeRegistry functionBuilderRegistry31 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry31RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry31, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes31 = ((JSType) get(functionBuilderRegistry31RegistryNativeTypes, 31));
        JSTypeRegistry functionBuilderRegistry32 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry32RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry32, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes32 = ((JSType) get(functionBuilderRegistry32RegistryNativeTypes, 32));
        JSTypeRegistry functionBuilderRegistry33 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry33RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry33, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes33 = ((JSType) get(functionBuilderRegistry33RegistryNativeTypes, 33));
        JSTypeRegistry functionBuilderRegistry34 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry34RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry34, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes34 = ((JSType) get(functionBuilderRegistry34RegistryNativeTypes, 34));
        JSTypeRegistry functionBuilderRegistry35 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry35RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry35, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes36 = ((JSType) get(functionBuilderRegistry35RegistryNativeTypes, 36));
        JSTypeRegistry functionBuilderRegistry36 = ((JSTypeRegistry) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] functionBuilderRegistry36RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionBuilderRegistry36, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionBuilderRegistryNativeTypes37 = ((JSType) get(functionBuilderRegistry36RegistryNativeTypes, 37));
        
        assertNull(finalFunctionBuilderRegistryNativeTypes0);
        
        assertNull(finalFunctionBuilderRegistryNativeTypes1);
        
        assertNull(finalFunctionBuilderRegistryNativeTypes2);
        
        assertNull(finalFunctionBuilderRegistryNativeTypes3);
        
        assertNull(finalFunctionBuilderRegistryNativeTypes4);
        
        assertNull(finalFunctionBuilderRegistryNativeTypes5);
        
        assertNull(finalFunctionBuilderRegistryNativeTypes6);
        
        assertNull(finalFunctionBuilderRegistryNativeTypes7);
        
        assertNull(finalFunctionBuilderRegistryNativeTypes8);
        
        assertNull(finalFunctionBuilderRegistryNativeTypes9);
        
        assertNull(finalFunctionBuilderRegistryNativeTypes10);
        
        assertNull(finalFunctionBuilderRegistryNativeTypes11);
        
        assertNull(finalFunctionBuilderRegistryNativeTypes12);
        
        assertNull(finalFunctionBuilderRegistryNativeTypes13);
        
        assertNull(finalFunctionBuilderRegistryNativeTypes14);
        
        assertNull(finalFunctionBuilderRegistryNativeTypes15);
        
        assertNull(finalFunctionBuilderRegistryNativeTypes16);
        
        assertNull(finalFunctionBuilderRegistryNativeTypes17);
        
        assertNull(finalFunctionBuilderRegistryNativeTypes18);
        
        assertNull(finalFunctionBuilderRegistryNativeTypes19);
        
        assertNull(finalFunctionBuilderRegistryNativeTypes20);
        
        assertNull(finalFunctionBuilderRegistryNativeTypes21);
        
        assertNull(finalFunctionBuilderRegistryNativeTypes22);
        
        assertNull(finalFunctionBuilderRegistryNativeTypes23);
        
        assertNull(finalFunctionBuilderRegistryNativeTypes24);
        
        assertNull(finalFunctionBuilderRegistryNativeTypes25);
        
        assertNull(finalFunctionBuilderRegistryNativeTypes26);
        
        assertNull(finalFunctionBuilderRegistryNativeTypes27);
        
        assertNull(finalFunctionBuilderRegistryNativeTypes28);
        
        assertNull(finalFunctionBuilderRegistryNativeTypes29);
        
        assertNull(finalFunctionBuilderRegistryNativeTypes30);
        
        assertNull(finalFunctionBuilderRegistryNativeTypes31);
        
        assertNull(finalFunctionBuilderRegistryNativeTypes32);
        
        assertNull(finalFunctionBuilderRegistryNativeTypes33);
        
        assertNull(finalFunctionBuilderRegistryNativeTypes34);
        
        assertNull(finalFunctionBuilderRegistryNativeTypes36);
        
        assertNull(finalFunctionBuilderRegistryNativeTypes37);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method build()
    
    @Test
    public void testBuild2() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[39];
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        alternates.add(noType);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        nativeTypes[35] = ((JSType) unionType);
        NoType noType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        nativeTypes[38] = ((JSType) noType1);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry", registry);
        Node sourceNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode", sourceNode);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionBuilder.build] produces [java.lang.ArrayIndexOutOfBoundsException: Index 43 out of bounds for length 39]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.build(UnionTypeBuilder.java:169)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createUnionType(JSTypeRegistry.java:857)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createOptionalType(JSTypeRegistry.java:818)
            com.google.javascript.rhino.jstype.FunctionParamBuilder.addVarArgs(FunctionParamBuilder.java:105)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createParameters(JSTypeRegistry.java:1079)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createParametersWithVarArgs(JSTypeRegistry.java:1051)
            com.google.javascript.rhino.jstype.ArrowType.<init>(ArrowType.java:74)
            com.google.javascript.rhino.jstype.FunctionBuilder.build(FunctionBuilder.java:148) */
        functionBuilder.build();
    }
    
    @Test
    public void testBuild3() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[39];
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        nativeTypes[35] = ((JSType) unionType);
        UnresolvedTypeExpression unresolvedTypeExpression = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(unresolvedTypeExpression, "com.google.javascript.rhino.jstype.UnknownType", "isChecked", true);
        nativeTypes[38] = ((JSType) unresolvedTypeExpression);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry", registry);
        String name = "";
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "name", name);
        StringType returnType = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionBuilder.build] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.UnionType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.UnionType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @2fff965e)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:141)
            com.google.javascript.rhino.jstype.FunctionBuilder.build(FunctionBuilder.java:148) */
        functionBuilder.build();
    }
    
    @Test
    public void testBuild4() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[39];
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        nativeTypes[35] = ((JSType) unionType);
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        nativeTypes[38] = ((JSType) namedType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionBuilder.build] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.UnionType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.UnionType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @2fff965e)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:141)
            com.google.javascript.rhino.jstype.FunctionBuilder.build(FunctionBuilder.java:148) */
        functionBuilder.build();
    }
    
    @Test
    public void testBuild5() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[39];
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        nativeTypes[0] = ((JSType) noType);
        nativeTypes[1] = ((JSType) noType);
        nativeTypes[2] = ((JSType) noType);
        nativeTypes[3] = ((JSType) noType);
        nativeTypes[4] = ((JSType) noType);
        nativeTypes[5] = ((JSType) noType);
        nativeTypes[6] = ((JSType) noType);
        nativeTypes[7] = ((JSType) noType);
        nativeTypes[8] = ((JSType) noType);
        nativeTypes[9] = ((JSType) noType);
        nativeTypes[10] = ((JSType) noType);
        nativeTypes[11] = ((JSType) noType);
        nativeTypes[12] = ((JSType) noType);
        nativeTypes[13] = ((JSType) noType);
        nativeTypes[14] = ((JSType) noType);
        nativeTypes[15] = ((JSType) noType);
        nativeTypes[16] = ((JSType) noType);
        nativeTypes[17] = ((JSType) noType);
        nativeTypes[18] = ((JSType) noType);
        nativeTypes[19] = ((JSType) noType);
        nativeTypes[20] = ((JSType) noType);
        nativeTypes[21] = ((JSType) noType);
        nativeTypes[22] = ((JSType) noType);
        nativeTypes[23] = ((JSType) noType);
        nativeTypes[24] = ((JSType) noType);
        nativeTypes[25] = ((JSType) noType);
        nativeTypes[26] = ((JSType) noType);
        nativeTypes[27] = ((JSType) noType);
        nativeTypes[28] = ((JSType) noType);
        nativeTypes[29] = ((JSType) noType);
        nativeTypes[30] = ((JSType) noType);
        nativeTypes[31] = ((JSType) noType);
        nativeTypes[32] = ((JSType) noType);
        nativeTypes[33] = ((JSType) noType);
        nativeTypes[34] = ((JSType) noType);
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        nativeTypes[35] = ((JSType) namedType);
        nativeTypes[36] = ((JSType) noType);
        nativeTypes[37] = ((JSType) noType);
        VoidType voidType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        nativeTypes[38] = ((JSType) voidType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry", registry);
        FunctionNode sourceNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode", sourceNode);
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "returnType", noType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionBuilder.build] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:95)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.addAlternate(UnionTypeBuilder.java:120)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createUnionType(JSTypeRegistry.java:855)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createOptionalType(JSTypeRegistry.java:818)
            com.google.javascript.rhino.jstype.FunctionParamBuilder.addVarArgs(FunctionParamBuilder.java:105)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createParameters(JSTypeRegistry.java:1079)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createParametersWithVarArgs(JSTypeRegistry.java:1051)
            com.google.javascript.rhino.jstype.ArrowType.<init>(ArrowType.java:74)
            com.google.javascript.rhino.jstype.FunctionBuilder.build(FunctionBuilder.java:148) */
        functionBuilder.build();
    }
    
    @Test
    public void testBuild6() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[39];
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        UnresolvedTypeExpression unresolvedTypeExpression = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        alternates.add(unresolvedTypeExpression);
        alternates.add(null);
        alternates.add(null);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        nativeTypes[35] = ((JSType) unionType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry", registry);
        String name = "";
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "name", name);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionBuilder.build] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionTypeBuilder.addAlternate(UnionTypeBuilder.java:90)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.addAlternate(UnionTypeBuilder.java:106)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createUnionType(JSTypeRegistry.java:855)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createOptionalType(JSTypeRegistry.java:818)
            com.google.javascript.rhino.jstype.FunctionParamBuilder.addVarArgs(FunctionParamBuilder.java:105)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createParameters(JSTypeRegistry.java:1079)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createParametersWithVarArgs(JSTypeRegistry.java:1051)
            com.google.javascript.rhino.jstype.ArrowType.<init>(ArrowType.java:74)
            com.google.javascript.rhino.jstype.FunctionBuilder.build(FunctionBuilder.java:148) */
        functionBuilder.build();
    }
    
    @Test
    public void testBuild7() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[39];
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        UnionType unionType1 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        alternates.add(unionType1);
        alternates.add(null);
        alternates.add(null);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        nativeTypes[35] = ((JSType) unionType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry", registry);
        String name = "";
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "name", name);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionBuilder.build] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionTypeBuilder.addAlternate(UnionTypeBuilder.java:105)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.addAlternate(UnionTypeBuilder.java:106)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createUnionType(JSTypeRegistry.java:855)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createOptionalType(JSTypeRegistry.java:818)
            com.google.javascript.rhino.jstype.FunctionParamBuilder.addVarArgs(FunctionParamBuilder.java:105)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createParameters(JSTypeRegistry.java:1079)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createParametersWithVarArgs(JSTypeRegistry.java:1051)
            com.google.javascript.rhino.jstype.ArrowType.<init>(ArrowType.java:74)
            com.google.javascript.rhino.jstype.FunctionBuilder.build(FunctionBuilder.java:148) */
        functionBuilder.build();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method build()
    
    @Test(expected = IllegalArgumentException.class)
    public void testBuild8() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[39];
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        nativeTypes[35] = ((JSType) unionType);
        UnresolvedTypeExpression unresolvedTypeExpression = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(unresolvedTypeExpression, "com.google.javascript.rhino.jstype.UnknownType", "isChecked", true);
        nativeTypes[38] = ((JSType) unresolvedTypeExpression);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry", registry);
        Object sourceNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode", sourceNode);
        
        functionBuilder.build();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testBuild9() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[39];
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        nativeTypes[35] = ((JSType) errorFunctionType);
        UnresolvedTypeExpression unresolvedTypeExpression = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        nativeTypes[38] = ((JSType) unresolvedTypeExpression);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry", registry);
        Object sourceNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode", sourceNode);
        
        functionBuilder.build();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testBuild10() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[39];
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
        nativeTypes[26] = ((JSType) templateType);
        nativeTypes[27] = ((JSType) templateType);
        nativeTypes[28] = ((JSType) templateType);
        nativeTypes[29] = ((JSType) templateType);
        nativeTypes[30] = ((JSType) templateType);
        nativeTypes[31] = ((JSType) templateType);
        nativeTypes[32] = ((JSType) templateType);
        nativeTypes[33] = ((JSType) templateType);
        nativeTypes[34] = ((JSType) templateType);
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        nativeTypes[35] = ((JSType) namedType);
        nativeTypes[36] = ((JSType) templateType);
        nativeTypes[37] = ((JSType) templateType);
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        nativeTypes[38] = ((JSType) unionType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry", registry);
        String name = "";
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "name", name);
        Node sourceNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode", sourceNode);
        
        functionBuilder.build();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionBuilder.withName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#withName(java.lang.String)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithName_Return() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        
        FunctionBuilder actual = functionBuilder.withName(null);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        assertNull(actualRegistry);
        
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "name"));
        assertNull(actualName);
        
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode"));
        assertNull(actualSourceNode);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "returnType"));
        assertNull(actualReturnType);
        
        ObjectType actualTypeOfThis = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "typeOfThis"));
        assertNull(actualTypeOfThis);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
        boolean actualInferredReturnType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "inferredReturnType"));
        assertFalse(actualInferredReturnType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "isNativeType"));
        assertFalse(actualIsNativeType);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionBuilder.withInferredReturnType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withInferredReturnType(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#withInferredReturnType(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithInferredReturnType_Return() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        
        FunctionBuilder actual = functionBuilder.withInferredReturnType(null);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        assertNull(actualRegistry);
        
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "name"));
        assertNull(actualName);
        
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode"));
        assertNull(actualSourceNode);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "returnType"));
        assertNull(actualReturnType);
        
        ObjectType actualTypeOfThis = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "typeOfThis"));
        assertNull(actualTypeOfThis);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
        boolean actualInferredReturnType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "inferredReturnType"));
        assertTrue(actualInferredReturnType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "isNativeType"));
        assertFalse(actualIsNativeType);
        
        boolean finalFunctionBuilderInferredReturnType = ((Boolean) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "inferredReturnType"));
        
        assertTrue(finalFunctionBuilderInferredReturnType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionBuilder.copyFromOtherFunction
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method copyFromOtherFunction(com.google.javascript.rhino.jstype.FunctionType)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getReferenceName()} twice
    /// execute conditions:
    ///     {@code (null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#copyFromOtherFunction(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testCopyFromOtherFunction_Return_2() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        TemplateType typeOfThis = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        ObjectType initialFunctionBuilderTypeOfThis = ((ObjectType) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "typeOfThis"));
        
        FunctionBuilder actual = functionBuilder.copyFromOtherFunction(functionType);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        assertNull(actualRegistry);
        
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "name"));
        assertNull(actualName);
        
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode"));
        assertNull(actualSourceNode);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "returnType"));
        assertNull(actualReturnType);
        
        ObjectType functionBuilderTypeOfThis = ((ObjectType) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "typeOfThis"));
        ObjectType actualTypeOfThis = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "typeOfThis"));
        String actualTypeOfThisName = ((String) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.TemplateType", "name"));
        assertNull(actualTypeOfThisName);
        
        ObjectType actualTypeOfThisReferencedType = ((ObjectType) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        assertNull(actualTypeOfThisReferencedType);
        
        boolean actualTypeOfThisVisited = ((Boolean) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualTypeOfThisVisited);
        
        JSDocInfo actualTypeOfThisDocInfo = ((JSDocInfo) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualTypeOfThisDocInfo);
        
        boolean actualTypeOfThisUnknown = ((Boolean) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualTypeOfThisUnknown);
        
        boolean actualTypeOfThisResolved = ((Boolean) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualTypeOfThisResolved);
        
        JSType actualTypeOfThisResolveResult = ((JSType) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualTypeOfThisResolveResult);
        
        JSTypeRegistry actualTypeOfThisRegistry = actualTypeOfThis.registry;
        assertNull(actualTypeOfThisRegistry);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
        boolean actualInferredReturnType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "inferredReturnType"));
        assertFalse(actualInferredReturnType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "isNativeType"));
        assertFalse(actualIsNativeType);
        
        ObjectType finalFunctionBuilderTypeOfThis = ((ObjectType) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "typeOfThis"));
        
        assertFalse(initialFunctionBuilderTypeOfThis == finalFunctionBuilderTypeOfThis);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#copyFromOtherFunction(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testCopyFromOtherFunction_Return() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        String className = "";
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        
        ObjectType initialFunctionBuilderTypeOfThis = ((ObjectType) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "typeOfThis"));
        
        FunctionBuilder actual = functionBuilder.copyFromOtherFunction(functionType);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        assertNull(actualRegistry);
        
        String functionBuilderName = ((String) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "name"));
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "name"));
        assertEquals(functionBuilderName, actualName);
        
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode"));
        assertNull(actualSourceNode);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "returnType"));
        assertNull(actualReturnType);
        
        ObjectType functionBuilderTypeOfThis = ((ObjectType) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "typeOfThis"));
        ObjectType actualTypeOfThis = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "typeOfThis"));
        Visitor actualTypeOfThisLeastSupertypeVisitor = ((Visitor) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.NoObjectType", "leastSupertypeVisitor"));
        assertNull(actualTypeOfThisLeastSupertypeVisitor);
        
        Visitor actualTypeOfThisGreatestSubtypeVisitor = ((Visitor) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.NoObjectType", "greatestSubtypeVisitor"));
        assertNull(actualTypeOfThisGreatestSubtypeVisitor);
        
        ArrowType actualTypeOfThisCall = ((ArrowType) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        assertNull(actualTypeOfThisCall);
        
        FunctionPrototypeType actualTypeOfThisPrototype = (((FunctionType) actualTypeOfThis)).getPrototype();
        assertNull(actualTypeOfThisPrototype);
        
        Object actualTypeOfThisKind = getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualTypeOfThisKind);
        
        ObjectType actualTypeOfThisTypeOfThis = (((FunctionType) actualTypeOfThis)).getTypeOfThis();
        assertNull(actualTypeOfThisTypeOfThis);
        
        Node actualTypeOfThisSource = (((FunctionType) actualTypeOfThis)).getSource();
        assertNull(actualTypeOfThisSource);
        
        List actualTypeOfThisImplementedInterfaces = ((List) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualTypeOfThisImplementedInterfaces);
        
        List actualTypeOfThisSubTypes = (((FunctionType) actualTypeOfThis)).getSubTypes();
        assertNull(actualTypeOfThisSubTypes);
        
        String actualTypeOfThisTemplateTypeName = (((FunctionType) actualTypeOfThis)).getTemplateTypeName();
        assertNull(actualTypeOfThisTemplateTypeName);
        
        String actualTypeOfThisClassName = ((String) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualTypeOfThisClassName);
        
        Map actualTypeOfThisProperties = ((Map) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualTypeOfThisProperties);
        
        ObjectType actualTypeOfThisImplicitPrototype = (((PrototypeObjectType) actualTypeOfThis)).getImplicitPrototype();
        assertNull(actualTypeOfThisImplicitPrototype);
        
        boolean actualTypeOfThisNativeType = ((Boolean) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualTypeOfThisNativeType);
        
        boolean actualTypeOfThisPrettyPrint = ((Boolean) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualTypeOfThisPrettyPrint);
        
        boolean actualTypeOfThisVisited = ((Boolean) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualTypeOfThisVisited);
        
        JSDocInfo actualTypeOfThisDocInfo = ((JSDocInfo) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualTypeOfThisDocInfo);
        
        boolean actualTypeOfThisUnknown = ((Boolean) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualTypeOfThisUnknown);
        
        boolean actualTypeOfThisResolved = ((Boolean) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualTypeOfThisResolved);
        
        JSType actualTypeOfThisResolveResult = ((JSType) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualTypeOfThisResolveResult);
        
        JSTypeRegistry actualTypeOfThisRegistry = actualTypeOfThis.registry;
        assertNull(actualTypeOfThisRegistry);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
        boolean actualInferredReturnType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "inferredReturnType"));
        assertFalse(actualInferredReturnType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "isConstructor"));
        assertTrue(actualIsConstructor);
        
        boolean actualIsNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "isNativeType"));
        assertFalse(actualIsNativeType);
        
        ObjectType finalFunctionBuilderTypeOfThis = ((ObjectType) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "typeOfThis"));
        boolean finalFunctionBuilderIsConstructor = ((Boolean) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "isConstructor"));
        
        assertFalse(initialFunctionBuilderTypeOfThis == finalFunctionBuilderTypeOfThis);
        
        assertTrue(finalFunctionBuilderIsConstructor);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#copyFromOtherFunction(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testCopyFromOtherFunction_Return_1() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        ObjectType initialFunctionBuilderTypeOfThis = ((ObjectType) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "typeOfThis"));
        
        FunctionBuilder actual = functionBuilder.copyFromOtherFunction(functionType);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        assertNull(actualRegistry);
        
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "name"));
        assertNull(actualName);
        
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode"));
        assertNull(actualSourceNode);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "returnType"));
        assertNull(actualReturnType);
        
        ObjectType functionBuilderTypeOfThis = ((ObjectType) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "typeOfThis"));
        ObjectType actualTypeOfThis = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "typeOfThis"));
        Visitor actualTypeOfThisLeastSupertypeVisitor = ((Visitor) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.NoObjectType", "leastSupertypeVisitor"));
        assertNull(actualTypeOfThisLeastSupertypeVisitor);
        
        Visitor actualTypeOfThisGreatestSubtypeVisitor = ((Visitor) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.NoObjectType", "greatestSubtypeVisitor"));
        assertNull(actualTypeOfThisGreatestSubtypeVisitor);
        
        ArrowType actualTypeOfThisCall = ((ArrowType) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        assertNull(actualTypeOfThisCall);
        
        FunctionPrototypeType actualTypeOfThisPrototype = (((FunctionType) actualTypeOfThis)).getPrototype();
        assertNull(actualTypeOfThisPrototype);
        
        Object actualTypeOfThisKind = getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualTypeOfThisKind);
        
        ObjectType actualTypeOfThisTypeOfThis = (((FunctionType) actualTypeOfThis)).getTypeOfThis();
        assertNull(actualTypeOfThisTypeOfThis);
        
        Node actualTypeOfThisSource = (((FunctionType) actualTypeOfThis)).getSource();
        assertNull(actualTypeOfThisSource);
        
        List actualTypeOfThisImplementedInterfaces = ((List) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualTypeOfThisImplementedInterfaces);
        
        List actualTypeOfThisSubTypes = (((FunctionType) actualTypeOfThis)).getSubTypes();
        assertNull(actualTypeOfThisSubTypes);
        
        String actualTypeOfThisTemplateTypeName = (((FunctionType) actualTypeOfThis)).getTemplateTypeName();
        assertNull(actualTypeOfThisTemplateTypeName);
        
        String actualTypeOfThisClassName = ((String) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualTypeOfThisClassName);
        
        Map actualTypeOfThisProperties = ((Map) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualTypeOfThisProperties);
        
        ObjectType actualTypeOfThisImplicitPrototype = (((PrototypeObjectType) actualTypeOfThis)).getImplicitPrototype();
        assertNull(actualTypeOfThisImplicitPrototype);
        
        boolean actualTypeOfThisNativeType = ((Boolean) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualTypeOfThisNativeType);
        
        boolean actualTypeOfThisPrettyPrint = ((Boolean) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualTypeOfThisPrettyPrint);
        
        boolean actualTypeOfThisVisited = ((Boolean) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualTypeOfThisVisited);
        
        JSDocInfo actualTypeOfThisDocInfo = ((JSDocInfo) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualTypeOfThisDocInfo);
        
        boolean actualTypeOfThisUnknown = ((Boolean) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualTypeOfThisUnknown);
        
        boolean actualTypeOfThisResolved = ((Boolean) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualTypeOfThisResolved);
        
        JSType actualTypeOfThisResolveResult = ((JSType) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualTypeOfThisResolveResult);
        
        JSTypeRegistry actualTypeOfThisRegistry = actualTypeOfThis.registry;
        assertNull(actualTypeOfThisRegistry);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
        boolean actualInferredReturnType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "inferredReturnType"));
        assertFalse(actualInferredReturnType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "isConstructor"));
        assertTrue(actualIsConstructor);
        
        boolean actualIsNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "isNativeType"));
        assertFalse(actualIsNativeType);
        
        ObjectType finalFunctionBuilderTypeOfThis = ((ObjectType) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "typeOfThis"));
        boolean finalFunctionBuilderIsConstructor = ((Boolean) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "isConstructor"));
        
        assertFalse(initialFunctionBuilderTypeOfThis == finalFunctionBuilderTypeOfThis);
        
        assertTrue(finalFunctionBuilderIsConstructor);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method copyFromOtherFunction(com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#copyFromOtherFunction(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testCopyFromOtherFunction_Return_4() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        ScriptOrFnNode sourceNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode", sourceNode);
        Object parametersNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "parametersNode", parametersNode);
        UnresolvedTypeExpression returnType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "returnType", returnType);
        PrototypeObjectType typeOfThis = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "typeOfThis", typeOfThis);
        String templateTypeName = "";
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "templateTypeName", templateTypeName);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoObjectType typeOfThis1 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        FunctionNode source = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        noObjectType.setSource(source);
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeName", templateTypeName);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(noObjectType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        Node initialFunctionBuilderSourceNode = ((Node) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode"));
        
        FunctionBuilder actual = functionBuilder.copyFromOtherFunction(noObjectType);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        assertNull(actualRegistry);
        
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "name"));
        assertNull(actualName);
        
        Node functionBuilderSourceNode = ((Node) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode"));
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode"));
        String actualSourceNodeFunctionName = (((FunctionNode) actualSourceNode)).getFunctionName();
        assertNull(actualSourceNodeFunctionName);
        
        boolean actualSourceNodeItsNeedsActivation = ((Boolean) getFieldValue(actualSourceNode, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
        assertFalse(actualSourceNodeItsNeedsActivation);
        
        int functionBuilderSourceNodeItsFunctionType = ((Integer) getFieldValue(functionBuilderSourceNode, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        int actualSourceNodeItsFunctionType = ((Integer) getFieldValue(actualSourceNode, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        assertEquals(functionBuilderSourceNodeItsFunctionType, actualSourceNodeItsFunctionType);
        
        boolean actualSourceNodeItsIgnoreDynamicScope = ((Boolean) getFieldValue(actualSourceNode, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
        assertFalse(actualSourceNodeItsIgnoreDynamicScope);
        
        int functionBuilderSourceNodeEncodedSourceStart = (((ScriptOrFnNode) functionBuilderSourceNode)).getEncodedSourceStart();
        int actualSourceNodeEncodedSourceStart = (((ScriptOrFnNode) actualSourceNode)).getEncodedSourceStart();
        assertEquals(functionBuilderSourceNodeEncodedSourceStart, actualSourceNodeEncodedSourceStart);
        
        int functionBuilderSourceNodeEncodedSourceEnd = (((ScriptOrFnNode) functionBuilderSourceNode)).getEncodedSourceEnd();
        int actualSourceNodeEncodedSourceEnd = (((ScriptOrFnNode) actualSourceNode)).getEncodedSourceEnd();
        assertEquals(functionBuilderSourceNodeEncodedSourceEnd, actualSourceNodeEncodedSourceEnd);
        
        String actualSourceNodeSourceName = (((ScriptOrFnNode) actualSourceNode)).getSourceName();
        assertNull(actualSourceNodeSourceName);
        
        int functionBuilderSourceNodeBaseLineno = (((ScriptOrFnNode) functionBuilderSourceNode)).getBaseLineno();
        int actualSourceNodeBaseLineno = (((ScriptOrFnNode) actualSourceNode)).getBaseLineno();
        assertEquals(functionBuilderSourceNodeBaseLineno, actualSourceNodeBaseLineno);
        
        int functionBuilderSourceNodeEndLineno = (((ScriptOrFnNode) functionBuilderSourceNode)).getEndLineno();
        int actualSourceNodeEndLineno = (((ScriptOrFnNode) actualSourceNode)).getEndLineno();
        assertEquals(functionBuilderSourceNodeEndLineno, actualSourceNodeEndLineno);
        
        ObjArray actualSourceNodeFunctions = ((ObjArray) getFieldValue(actualSourceNode, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualSourceNodeFunctions);
        
        ObjArray actualSourceNodeRegexps = ((ObjArray) getFieldValue(actualSourceNode, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualSourceNodeRegexps);
        
        ObjArray actualSourceNodeItsVariables = ((ObjArray) getFieldValue(actualSourceNode, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualSourceNodeItsVariables);
        
        ObjArray actualSourceNodeItsConst = ((ObjArray) getFieldValue(actualSourceNode, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualSourceNodeItsConst);
        
        ObjToIntMap actualSourceNodeItsVariableNames = ((ObjToIntMap) getFieldValue(actualSourceNode, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualSourceNodeItsVariableNames);
        
        int functionBuilderSourceNodeVarStart = ((Integer) getFieldValue(functionBuilderSourceNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualSourceNodeVarStart = ((Integer) getFieldValue(actualSourceNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(functionBuilderSourceNodeVarStart, actualSourceNodeVarStart);
        
        Object actualSourceNodeCompilerData = (((ScriptOrFnNode) actualSourceNode)).getCompilerData();
        assertNull(actualSourceNodeCompilerData);
        
        int functionBuilderSourceNodeType = functionBuilderSourceNode.getType();
        int actualSourceNodeType = actualSourceNode.getType();
        assertEquals(functionBuilderSourceNodeType, actualSourceNodeType);
        
        Node actualSourceNodeNext = actualSourceNode.getNext();
        assertNull(actualSourceNodeNext);
        
        Node actualSourceNodeFirst = ((Node) getFieldValue(actualSourceNode, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualSourceNodeFirst);
        
        Node actualSourceNodeLast = ((Node) getFieldValue(actualSourceNode, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualSourceNodeLast);
        
        Object actualSourceNodePropListHead = getFieldValue(actualSourceNode, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualSourceNodePropListHead);
        
        int functionBuilderSourceNodeSourcePosition = ((Integer) getFieldValue(functionBuilderSourceNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourceNodeSourcePosition = ((Integer) getFieldValue(actualSourceNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(functionBuilderSourceNodeSourcePosition, actualSourceNodeSourcePosition);
        
        JSType actualSourceNodeJsType = ((JSType) getFieldValue(actualSourceNode, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualSourceNodeJsType);
        
        Node actualSourceNodeParent = actualSourceNode.getParent();
        assertNull(actualSourceNodeParent);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "returnType"));
        assertNull(actualReturnType);
        
        ObjectType actualTypeOfThis = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "typeOfThis"));
        assertNull(actualTypeOfThis);
        
        String functionBuilderTemplateTypeName = ((String) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "templateTypeName"));
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "templateTypeName"));
        assertEquals(functionBuilderTemplateTypeName, actualTemplateTypeName);
        
        boolean actualInferredReturnType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "inferredReturnType"));
        assertFalse(actualInferredReturnType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "isNativeType"));
        assertFalse(actualIsNativeType);
        
        Node finalFunctionBuilderSourceNode = ((Node) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode"));
        Node finalFunctionBuilderParametersNode = ((Node) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "parametersNode"));
        JSType finalFunctionBuilderReturnType = ((JSType) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "returnType"));
        ObjectType finalFunctionBuilderTypeOfThis = ((ObjectType) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "typeOfThis"));
        
        JSTypeRegistry jSTypeRegistry = noObjectType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNoObjectTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = noObjectType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNoObjectTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = noObjectType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNoObjectTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = noObjectType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNoObjectTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = noObjectType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNoObjectTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = noObjectType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNoObjectTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = noObjectType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNoObjectTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = noObjectType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNoObjectTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = noObjectType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNoObjectTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = noObjectType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNoObjectTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = noObjectType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNoObjectTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = noObjectType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNoObjectTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = noObjectType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNoObjectTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = noObjectType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNoObjectTypeRegistryNativeTypes13 = ((JSType) get(jSTypeRegistry13RegistryNativeTypes, 13));
        JSTypeRegistry jSTypeRegistry14 = noObjectType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNoObjectTypeRegistryNativeTypes14 = ((JSType) get(jSTypeRegistry14RegistryNativeTypes, 14));
        JSTypeRegistry jSTypeRegistry15 = noObjectType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry15RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNoObjectTypeRegistryNativeTypes15 = ((JSType) get(jSTypeRegistry15RegistryNativeTypes, 15));
        JSTypeRegistry jSTypeRegistry16 = noObjectType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry16RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNoObjectTypeRegistryNativeTypes16 = ((JSType) get(jSTypeRegistry16RegistryNativeTypes, 16));
        JSTypeRegistry jSTypeRegistry17 = noObjectType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry17RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNoObjectTypeRegistryNativeTypes17 = ((JSType) get(jSTypeRegistry17RegistryNativeTypes, 17));
        JSTypeRegistry jSTypeRegistry18 = noObjectType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry18RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNoObjectTypeRegistryNativeTypes18 = ((JSType) get(jSTypeRegistry18RegistryNativeTypes, 18));
        JSTypeRegistry jSTypeRegistry19 = noObjectType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry19RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNoObjectTypeRegistryNativeTypes19 = ((JSType) get(jSTypeRegistry19RegistryNativeTypes, 19));
        JSTypeRegistry jSTypeRegistry20 = noObjectType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry20RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNoObjectTypeRegistryNativeTypes20 = ((JSType) get(jSTypeRegistry20RegistryNativeTypes, 20));
        JSTypeRegistry jSTypeRegistry21 = noObjectType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry21RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNoObjectTypeRegistryNativeTypes21 = ((JSType) get(jSTypeRegistry21RegistryNativeTypes, 21));
        JSTypeRegistry jSTypeRegistry22 = noObjectType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry22RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNoObjectTypeRegistryNativeTypes22 = ((JSType) get(jSTypeRegistry22RegistryNativeTypes, 22));
        JSTypeRegistry jSTypeRegistry23 = noObjectType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry23RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNoObjectTypeRegistryNativeTypes23 = ((JSType) get(jSTypeRegistry23RegistryNativeTypes, 23));
        JSTypeRegistry jSTypeRegistry24 = noObjectType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry24RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalNoObjectTypeRegistryNativeTypes24 = ((JSType) get(jSTypeRegistry24RegistryNativeTypes, 24));
        
        assertFalse(initialFunctionBuilderSourceNode == finalFunctionBuilderSourceNode);
        
        assertNull(finalFunctionBuilderParametersNode);
        
        assertNull(finalFunctionBuilderReturnType);
        
        assertNull(finalFunctionBuilderTypeOfThis);
        
        assertNull(finalNoObjectTypeRegistryNativeTypes0);
        
        assertNull(finalNoObjectTypeRegistryNativeTypes1);
        
        assertNull(finalNoObjectTypeRegistryNativeTypes2);
        
        assertNull(finalNoObjectTypeRegistryNativeTypes3);
        
        assertNull(finalNoObjectTypeRegistryNativeTypes4);
        
        assertNull(finalNoObjectTypeRegistryNativeTypes5);
        
        assertNull(finalNoObjectTypeRegistryNativeTypes6);
        
        assertNull(finalNoObjectTypeRegistryNativeTypes7);
        
        assertNull(finalNoObjectTypeRegistryNativeTypes8);
        
        assertNull(finalNoObjectTypeRegistryNativeTypes9);
        
        assertNull(finalNoObjectTypeRegistryNativeTypes10);
        
        assertNull(finalNoObjectTypeRegistryNativeTypes11);
        
        assertNull(finalNoObjectTypeRegistryNativeTypes12);
        
        assertNull(finalNoObjectTypeRegistryNativeTypes13);
        
        assertNull(finalNoObjectTypeRegistryNativeTypes14);
        
        assertNull(finalNoObjectTypeRegistryNativeTypes15);
        
        assertNull(finalNoObjectTypeRegistryNativeTypes16);
        
        assertNull(finalNoObjectTypeRegistryNativeTypes17);
        
        assertNull(finalNoObjectTypeRegistryNativeTypes18);
        
        assertNull(finalNoObjectTypeRegistryNativeTypes19);
        
        assertNull(finalNoObjectTypeRegistryNativeTypes20);
        
        assertNull(finalNoObjectTypeRegistryNativeTypes21);
        
        assertNull(finalNoObjectTypeRegistryNativeTypes22);
        
        assertNull(finalNoObjectTypeRegistryNativeTypes23);
        
        assertNull(finalNoObjectTypeRegistryNativeTypes24);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#copyFromOtherFunction(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testCopyFromOtherFunction_Return_3() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        String name = "";
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "name", name);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionNode source = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        noObjectType.setSource(source);
        
        Node initialFunctionBuilderSourceNode = ((Node) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode"));
        ObjectType initialFunctionBuilderTypeOfThis = ((ObjectType) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "typeOfThis"));
        
        FunctionBuilder actual = functionBuilder.copyFromOtherFunction(noObjectType);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        assertNull(actualRegistry);
        
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "name"));
        assertNull(actualName);
        
        Node functionBuilderSourceNode = ((Node) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode"));
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode"));
        String actualSourceNodeFunctionName = (((FunctionNode) actualSourceNode)).getFunctionName();
        assertNull(actualSourceNodeFunctionName);
        
        boolean actualSourceNodeItsNeedsActivation = ((Boolean) getFieldValue(actualSourceNode, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
        assertFalse(actualSourceNodeItsNeedsActivation);
        
        int functionBuilderSourceNodeItsFunctionType = ((Integer) getFieldValue(functionBuilderSourceNode, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        int actualSourceNodeItsFunctionType = ((Integer) getFieldValue(actualSourceNode, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        assertEquals(functionBuilderSourceNodeItsFunctionType, actualSourceNodeItsFunctionType);
        
        boolean actualSourceNodeItsIgnoreDynamicScope = ((Boolean) getFieldValue(actualSourceNode, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
        assertFalse(actualSourceNodeItsIgnoreDynamicScope);
        
        int functionBuilderSourceNodeEncodedSourceStart = (((ScriptOrFnNode) functionBuilderSourceNode)).getEncodedSourceStart();
        int actualSourceNodeEncodedSourceStart = (((ScriptOrFnNode) actualSourceNode)).getEncodedSourceStart();
        assertEquals(functionBuilderSourceNodeEncodedSourceStart, actualSourceNodeEncodedSourceStart);
        
        int functionBuilderSourceNodeEncodedSourceEnd = (((ScriptOrFnNode) functionBuilderSourceNode)).getEncodedSourceEnd();
        int actualSourceNodeEncodedSourceEnd = (((ScriptOrFnNode) actualSourceNode)).getEncodedSourceEnd();
        assertEquals(functionBuilderSourceNodeEncodedSourceEnd, actualSourceNodeEncodedSourceEnd);
        
        String actualSourceNodeSourceName = (((ScriptOrFnNode) actualSourceNode)).getSourceName();
        assertNull(actualSourceNodeSourceName);
        
        int functionBuilderSourceNodeBaseLineno = (((ScriptOrFnNode) functionBuilderSourceNode)).getBaseLineno();
        int actualSourceNodeBaseLineno = (((ScriptOrFnNode) actualSourceNode)).getBaseLineno();
        assertEquals(functionBuilderSourceNodeBaseLineno, actualSourceNodeBaseLineno);
        
        int functionBuilderSourceNodeEndLineno = (((ScriptOrFnNode) functionBuilderSourceNode)).getEndLineno();
        int actualSourceNodeEndLineno = (((ScriptOrFnNode) actualSourceNode)).getEndLineno();
        assertEquals(functionBuilderSourceNodeEndLineno, actualSourceNodeEndLineno);
        
        ObjArray actualSourceNodeFunctions = ((ObjArray) getFieldValue(actualSourceNode, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualSourceNodeFunctions);
        
        ObjArray actualSourceNodeRegexps = ((ObjArray) getFieldValue(actualSourceNode, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualSourceNodeRegexps);
        
        ObjArray actualSourceNodeItsVariables = ((ObjArray) getFieldValue(actualSourceNode, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualSourceNodeItsVariables);
        
        ObjArray actualSourceNodeItsConst = ((ObjArray) getFieldValue(actualSourceNode, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualSourceNodeItsConst);
        
        ObjToIntMap actualSourceNodeItsVariableNames = ((ObjToIntMap) getFieldValue(actualSourceNode, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualSourceNodeItsVariableNames);
        
        int functionBuilderSourceNodeVarStart = ((Integer) getFieldValue(functionBuilderSourceNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualSourceNodeVarStart = ((Integer) getFieldValue(actualSourceNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(functionBuilderSourceNodeVarStart, actualSourceNodeVarStart);
        
        Object actualSourceNodeCompilerData = (((ScriptOrFnNode) actualSourceNode)).getCompilerData();
        assertNull(actualSourceNodeCompilerData);
        
        int functionBuilderSourceNodeType = functionBuilderSourceNode.getType();
        int actualSourceNodeType = actualSourceNode.getType();
        assertEquals(functionBuilderSourceNodeType, actualSourceNodeType);
        
        Node actualSourceNodeNext = actualSourceNode.getNext();
        assertNull(actualSourceNodeNext);
        
        Node actualSourceNodeFirst = ((Node) getFieldValue(actualSourceNode, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualSourceNodeFirst);
        
        Node actualSourceNodeLast = ((Node) getFieldValue(actualSourceNode, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualSourceNodeLast);
        
        Object actualSourceNodePropListHead = getFieldValue(actualSourceNode, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualSourceNodePropListHead);
        
        int functionBuilderSourceNodeSourcePosition = ((Integer) getFieldValue(functionBuilderSourceNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourceNodeSourcePosition = ((Integer) getFieldValue(actualSourceNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(functionBuilderSourceNodeSourcePosition, actualSourceNodeSourcePosition);
        
        JSType actualSourceNodeJsType = ((JSType) getFieldValue(actualSourceNode, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualSourceNodeJsType);
        
        Node actualSourceNodeParent = actualSourceNode.getParent();
        assertNull(actualSourceNodeParent);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "returnType"));
        assertNull(actualReturnType);
        
        ObjectType functionBuilderTypeOfThis = ((ObjectType) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "typeOfThis"));
        ObjectType actualTypeOfThis = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "typeOfThis"));
        Visitor actualTypeOfThisLeastSupertypeVisitor = ((Visitor) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.NoObjectType", "leastSupertypeVisitor"));
        assertNull(actualTypeOfThisLeastSupertypeVisitor);
        
        Visitor actualTypeOfThisGreatestSubtypeVisitor = ((Visitor) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.NoObjectType", "greatestSubtypeVisitor"));
        assertNull(actualTypeOfThisGreatestSubtypeVisitor);
        
        ArrowType actualTypeOfThisCall = ((ArrowType) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        assertNull(actualTypeOfThisCall);
        
        FunctionPrototypeType actualTypeOfThisPrototype = (((FunctionType) actualTypeOfThis)).getPrototype();
        assertNull(actualTypeOfThisPrototype);
        
        Object actualTypeOfThisKind = getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualTypeOfThisKind);
        
        ObjectType actualTypeOfThisTypeOfThis = (((FunctionType) actualTypeOfThis)).getTypeOfThis();
        assertNull(actualTypeOfThisTypeOfThis);
        
        Node actualTypeOfThisSource = (((FunctionType) actualTypeOfThis)).getSource();
        assertNull(actualTypeOfThisSource);
        
        List actualTypeOfThisImplementedInterfaces = ((List) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualTypeOfThisImplementedInterfaces);
        
        List actualTypeOfThisSubTypes = (((FunctionType) actualTypeOfThis)).getSubTypes();
        assertNull(actualTypeOfThisSubTypes);
        
        String actualTypeOfThisTemplateTypeName = (((FunctionType) actualTypeOfThis)).getTemplateTypeName();
        assertNull(actualTypeOfThisTemplateTypeName);
        
        String actualTypeOfThisClassName = ((String) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualTypeOfThisClassName);
        
        Map actualTypeOfThisProperties = ((Map) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualTypeOfThisProperties);
        
        ObjectType actualTypeOfThisImplicitPrototype = (((PrototypeObjectType) actualTypeOfThis)).getImplicitPrototype();
        assertNull(actualTypeOfThisImplicitPrototype);
        
        boolean actualTypeOfThisNativeType = ((Boolean) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualTypeOfThisNativeType);
        
        boolean actualTypeOfThisPrettyPrint = ((Boolean) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualTypeOfThisPrettyPrint);
        
        boolean actualTypeOfThisVisited = ((Boolean) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualTypeOfThisVisited);
        
        JSDocInfo actualTypeOfThisDocInfo = ((JSDocInfo) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualTypeOfThisDocInfo);
        
        boolean actualTypeOfThisUnknown = ((Boolean) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualTypeOfThisUnknown);
        
        boolean actualTypeOfThisResolved = ((Boolean) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualTypeOfThisResolved);
        
        JSType actualTypeOfThisResolveResult = ((JSType) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualTypeOfThisResolveResult);
        
        JSTypeRegistry actualTypeOfThisRegistry = actualTypeOfThis.registry;
        assertNull(actualTypeOfThisRegistry);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
        boolean actualInferredReturnType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "inferredReturnType"));
        assertFalse(actualInferredReturnType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "isConstructor"));
        assertTrue(actualIsConstructor);
        
        boolean actualIsNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "isNativeType"));
        assertFalse(actualIsNativeType);
        
        Node finalFunctionBuilderSourceNode = ((Node) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode"));
        ObjectType finalFunctionBuilderTypeOfThis = ((ObjectType) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "typeOfThis"));
        boolean finalFunctionBuilderIsConstructor = ((Boolean) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "isConstructor"));
        
        assertFalse(initialFunctionBuilderSourceNode == finalFunctionBuilderSourceNode);
        
        assertFalse(initialFunctionBuilderTypeOfThis == finalFunctionBuilderTypeOfThis);
        
        assertTrue(finalFunctionBuilderIsConstructor);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method copyFromOtherFunction(com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#copyFromOtherFunction(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testCopyFromOtherFunction_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object parametersNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "parametersNode", parametersNode);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NoObjectType returnType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        ScriptOrFnNode source = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        noType.setSource(source);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(noType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionBuilder.copyFromOtherFunction] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis(FunctionType.java:752)
            com.google.javascript.rhino.jstype.FunctionBuilder.copyFromOtherFunction(FunctionBuilder.java:139) */
        functionBuilder.copyFromOtherFunction(noType);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#copyFromOtherFunction(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: this.typeOfThis = otherType.getTypeOfThis();
 *  */
    @Test
    public void testCopyFromOtherFunction_ThrowClassCastException() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[19] = ((JSType) unionType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(noType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionBuilder.copyFromOtherFunction] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.UnionType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.UnionType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @2fff965e)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis(FunctionType.java:752)
            com.google.javascript.rhino.jstype.FunctionBuilder.copyFromOtherFunction(FunctionBuilder.java:139) */
        functionBuilder.copyFromOtherFunction(noType);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#copyFromOtherFunction(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.name = otherType.getReferenceName();
 *  */
    @Test
    public void testCopyFromOtherFunction_ThrowNullPointerException() {
        FunctionBuilder functionBuilder = new FunctionBuilder(null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionBuilder.copyFromOtherFunction] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionBuilder.copyFromOtherFunction(FunctionBuilder.java:135) */
        functionBuilder.copyFromOtherFunction(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionBuilder.forNativeType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method forNativeType()
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#forNativeType()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testForNativeType_Return() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        
        FunctionBuilder actual = functionBuilder.forNativeType();
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        assertNull(actualRegistry);
        
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "name"));
        assertNull(actualName);
        
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode"));
        assertNull(actualSourceNode);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "returnType"));
        assertNull(actualReturnType);
        
        ObjectType actualTypeOfThis = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "typeOfThis"));
        assertNull(actualTypeOfThis);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
        boolean actualInferredReturnType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "inferredReturnType"));
        assertFalse(actualInferredReturnType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "isNativeType"));
        assertTrue(actualIsNativeType);
        
        boolean finalFunctionBuilderIsNativeType = ((Boolean) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "isNativeType"));
        
        assertTrue(finalFunctionBuilderIsNativeType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionBuilder.withParams
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withParams(com.google.javascript.rhino.jstype.FunctionParamBuilder)
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#withParams(com.google.javascript.rhino.jstype.FunctionParamBuilder)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionParamBuilder#build()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithParams_FunctionParamBuilderBuild() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        
        FunctionBuilder actual = functionBuilder.withParams(functionParamBuilder);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        assertNull(actualRegistry);
        
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "name"));
        assertNull(actualName);
        
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode"));
        assertNull(actualSourceNode);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "returnType"));
        assertNull(actualReturnType);
        
        ObjectType actualTypeOfThis = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "typeOfThis"));
        assertNull(actualTypeOfThis);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
        boolean actualInferredReturnType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "inferredReturnType"));
        assertFalse(actualInferredReturnType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "isNativeType"));
        assertFalse(actualIsNativeType);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withParams(com.google.javascript.rhino.jstype.FunctionParamBuilder)
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#withParams(com.google.javascript.rhino.jstype.FunctionParamBuilder)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionParamBuilder#build()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.parametersNode = params.build();
 *  */
    @Test
    public void testWithParams_ThrowNullPointerException() {
        FunctionBuilder functionBuilder = new FunctionBuilder(null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionBuilder.withParams] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionBuilder.withParams(FunctionBuilder.java:82) */
        functionBuilder.withParams(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionBuilder.withReturnType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withReturnType(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#withReturnType(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithReturnType_Return() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        
        FunctionBuilder actual = functionBuilder.withReturnType(null);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        assertNull(actualRegistry);
        
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "name"));
        assertNull(actualName);
        
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode"));
        assertNull(actualSourceNode);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "returnType"));
        assertNull(actualReturnType);
        
        ObjectType actualTypeOfThis = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "typeOfThis"));
        assertNull(actualTypeOfThis);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
        boolean actualInferredReturnType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "inferredReturnType"));
        assertFalse(actualInferredReturnType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "isNativeType"));
        assertFalse(actualIsNativeType);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionBuilder.withParamsNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withParamsNode(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#withParamsNode(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithParamsNode_Return() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        
        FunctionBuilder actual = functionBuilder.withParamsNode(null);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        assertNull(actualRegistry);
        
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "name"));
        assertNull(actualName);
        
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode"));
        assertNull(actualSourceNode);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "returnType"));
        assertNull(actualReturnType);
        
        ObjectType actualTypeOfThis = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "typeOfThis"));
        assertNull(actualTypeOfThis);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
        boolean actualInferredReturnType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "inferredReturnType"));
        assertFalse(actualInferredReturnType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "isNativeType"));
        assertFalse(actualIsNativeType);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionBuilder.withTemplateName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withTemplateName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#withTemplateName(java.lang.String)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithTemplateName_Return() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        
        FunctionBuilder actual = functionBuilder.withTemplateName(null);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        assertNull(actualRegistry);
        
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "name"));
        assertNull(actualName);
        
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode"));
        assertNull(actualSourceNode);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "returnType"));
        assertNull(actualReturnType);
        
        ObjectType actualTypeOfThis = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "typeOfThis"));
        assertNull(actualTypeOfThis);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
        boolean actualInferredReturnType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "inferredReturnType"));
        assertFalse(actualInferredReturnType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "isNativeType"));
        assertFalse(actualIsNativeType);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionBuilder.forConstructor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method forConstructor()
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#forConstructor()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testForConstructor_Return() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        
        FunctionBuilder actual = functionBuilder.forConstructor();
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        assertNull(actualRegistry);
        
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "name"));
        assertNull(actualName);
        
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode"));
        assertNull(actualSourceNode);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "returnType"));
        assertNull(actualReturnType);
        
        ObjectType actualTypeOfThis = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "typeOfThis"));
        assertNull(actualTypeOfThis);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
        boolean actualInferredReturnType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "inferredReturnType"));
        assertFalse(actualInferredReturnType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "isConstructor"));
        assertTrue(actualIsConstructor);
        
        boolean actualIsNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "isNativeType"));
        assertFalse(actualIsNativeType);
        
        boolean finalFunctionBuilderIsConstructor = ((Boolean) getFieldValue(functionBuilder, "com.google.javascript.rhino.jstype.FunctionBuilder", "isConstructor"));
        
        assertTrue(finalFunctionBuilderIsConstructor);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionBuilder.withSourceNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withSourceNode(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#withSourceNode(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithSourceNode_Return() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        
        FunctionBuilder actual = functionBuilder.withSourceNode(null);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        assertNull(actualRegistry);
        
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "name"));
        assertNull(actualName);
        
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode"));
        assertNull(actualSourceNode);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "returnType"));
        assertNull(actualReturnType);
        
        ObjectType actualTypeOfThis = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "typeOfThis"));
        assertNull(actualTypeOfThis);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
        boolean actualInferredReturnType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "inferredReturnType"));
        assertFalse(actualInferredReturnType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "isNativeType"));
        assertFalse(actualIsNativeType);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionBuilder.withTypeOfThis
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withTypeOfThis(com.google.javascript.rhino.jstype.ObjectType)
    
    /**
    @utbot.classUnderTest {@link FunctionBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionBuilder#withTypeOfThis(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithTypeOfThis_Return() throws Exception  {
        FunctionBuilder functionBuilder = ((FunctionBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionBuilder"));
        
        FunctionBuilder actual = functionBuilder.withTypeOfThis(null);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "registry"));
        assertNull(actualRegistry);
        
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "name"));
        assertNull(actualName);
        
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "sourceNode"));
        assertNull(actualSourceNode);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "returnType"));
        assertNull(actualReturnType);
        
        ObjectType actualTypeOfThis = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "typeOfThis"));
        assertNull(actualTypeOfThis);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
        boolean actualInferredReturnType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "inferredReturnType"));
        assertFalse(actualInferredReturnType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionBuilder", "isNativeType"));
        assertFalse(actualIsNativeType);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields911090619296700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields911090619296700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass911090619304100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields911090619296700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass911090619304100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields911090621664800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields911090621664800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass911090621669200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields911090621664800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass911090621669200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields911090622647500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields911090622647500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass911090622649800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields911090622647500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass911090622649800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields911090623877700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields911090623877700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass911090623880700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields911090623877700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass911090623880700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

