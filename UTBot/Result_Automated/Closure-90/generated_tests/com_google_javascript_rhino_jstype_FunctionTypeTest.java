package com.google.javascript.rhino.jstype;

import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.FunctionNode;
import java.util.Set;
import java.util.LinkedHashSet;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.ScriptOrFnNode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import com.google.common.collect.LinkedListMultimap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class com_google_javascript_rhino_jstype_FunctionTypeTest {
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.setSource
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSource(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setSource(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testSetSource() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        functionType.setSource(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#toString()}
 * @utbot.executesCondition {@code (registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE)): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.returnsFrom {@code return "Function";}
 *  */
    @Test
    public void testToString_RegistryGetNativeType() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
        nativeTypes[13] = ((JSType) functionType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        String actual = functionType.toString();
        
        String expected = "Function";
        
        assertEquals(expected, actual);
        
        JSTypeRegistry jSTypeRegistry = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12RegistryNativeTypes, 12));
        
        assertNull(finalFunctionTypeRegistryNativeTypes0);
        
        assertNull(finalFunctionTypeRegistryNativeTypes1);
        
        assertNull(finalFunctionTypeRegistryNativeTypes2);
        
        assertNull(finalFunctionTypeRegistryNativeTypes3);
        
        assertNull(finalFunctionTypeRegistryNativeTypes4);
        
        assertNull(finalFunctionTypeRegistryNativeTypes5);
        
        assertNull(finalFunctionTypeRegistryNativeTypes6);
        
        assertNull(finalFunctionTypeRegistryNativeTypes7);
        
        assertNull(finalFunctionTypeRegistryNativeTypes8);
        
        assertNull(finalFunctionTypeRegistryNativeTypes9);
        
        assertNull(finalFunctionTypeRegistryNativeTypes10);
        
        assertNull(finalFunctionTypeRegistryNativeTypes11);
        
        assertNull(finalFunctionTypeRegistryNativeTypes12);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#toString()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: this == registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE)
 *  */
    @Test
    public void testToString_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.toString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:774)
            com.google.javascript.rhino.jstype.FunctionType.toString(FunctionType.java:698) */
        functionType.toString();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#toString()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: this == registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE)
 *  */
    @Test
    public void testToString_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.toString] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.toString(FunctionType.java:698) */
        functionType.toString();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#toString()}
 * @utbot.executesCondition {@code (registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int paramNum = call.parameters.getChildCount();
 *  */
    @Test
    public void testToString_ThrowNullPointerException_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.toString] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.toString(FunctionType.java:704) */
        functionType.toString();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#toString()}
 * @utbot.executesCondition {@code (registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE)): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getChildCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int paramNum = call.parameters.getChildCount();
 *  */
    @Test
    public void testToString_ThrowNullPointerException_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.toString] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.toString(FunctionType.java:704) */
        functionType.toString();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#toString()}
 * @utbot.executesCondition {@code (registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE)): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getChildCount()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#isUnknownType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean hasKnownTypeOfThis = !typeOfThis.isUnknownType();
 *  */
    @Test
    public void testToString_ThrowNullPointerException_3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.toString] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.toString(FunctionType.java:705) */
        functionType.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hashCode()}
 * @utbot.executesCondition {@code (isInterface()): True}
 * @utbot.returnsFrom {@code return isInterface() ? getReferenceName().hashCode() : call.hashCode();}
 *  */
    @Test
    public void testHashCode_IsInterface() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        
        int actual = functionType.hashCode();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hashCode()}
 * @utbot.executesCondition {@code (isInterface()): False}
 * @utbot.returnsFrom {@code return isInterface() ? getReferenceName().hashCode() : call.hashCode();}
 *  */
    @Test
    public void testHashCode_NotIsInterface_4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        int actual = functionType.hashCode();
        
        assertEquals(159380651, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hashCode()}
 * @utbot.executesCondition {@code (isInterface()): False}
 * @utbot.returnsFrom {@code return isInterface() ? getReferenceName().hashCode() : call.hashCode();}
 *  */
    @Test
    public void testHashCode_NotIsInterface() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnTypeInferred", true);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        int actual = functionType.hashCode();
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hashCode()}
 * @utbot.executesCondition {@code (isInterface()): False}
 * @utbot.returnsFrom {@code return isInterface() ? getReferenceName().hashCode() : call.hashCode();}
 *  */
    @Test
    public void testHashCode_NotIsInterface_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        int actual = functionType.hashCode();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hashCode()}
 * @utbot.executesCondition {@code (isInterface()): False}
 * @utbot.returnsFrom {@code return isInterface() ? getReferenceName().hashCode() : call.hashCode();}
 *  */
    @Test
    public void testHashCode_NotIsInterface_3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(returnType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Object kind1 = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        int actual = functionType.hashCode();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hashCode()}
 * @utbot.executesCondition {@code (isInterface()): False}
 * @utbot.returnsFrom {@code return isInterface() ? getReferenceName().hashCode() : call.hashCode();}
 *  */
    @Test
    public void testHashCode_NotIsInterface_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnTypeInferred", true);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        int actual = functionType.hashCode();
        
        assertEquals(2110053828, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hashCode()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hashCode()}
 * @utbot.executesCondition {@code (isInterface()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getReferenceName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getReferenceName().hashCode()
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hashCode] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.hashCode(FunctionType.java:683) */
        functionType.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hashCode()}
 * @utbot.executesCondition {@code (isInterface()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ArrowType#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: call.hashCode()
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hashCode] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.hashCode(FunctionType.java:683) */
        functionType.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.isInterface
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isInterface()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isInterface()}
 * @utbot.returnsFrom {@code return kind == Kind.INTERFACE;}
 *  */
    @Test
    public void testIsInterface_KindEqualsKindINTERFACE() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.isInterface();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isInterface()}
 * @utbot.returnsFrom {@code return kind == Kind.INTERFACE;}
 *  */
    @Test
    public void testIsInterface_KindNotEqualsKindINTERFACE() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        boolean actual = functionType.isInterface();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getReturnType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getReturnType()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getReturnType()}
 * @utbot.returnsFrom {@code return call.returnType;}
 *  */
    @Test
    public void testGetReturnType_ReturnCallReturnType() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        JSType actual = functionType.getReturnType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getReturnType()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getReturnType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return call.returnType;
 *  */
    @Test
    public void testGetReturnType_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getReturnType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getReturnType(FunctionType.java:242) */
        functionType.getReturnType();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.isConstructor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isConstructor()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isConstructor()}
 * @utbot.returnsFrom {@code return kind == Kind.CONSTRUCTOR;}
 *  */
    @Test
    public void testIsConstructor_KindEqualsKindCONSTRUCTOR() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.isConstructor();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isConstructor()}
 * @utbot.returnsFrom {@code return kind == Kind.CONSTRUCTOR;}
 *  */
    @Test
    public void testIsConstructor_KindNotEqualsKindCONSTRUCTOR() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        boolean actual = functionType.isConstructor();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getParameters
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getParameters()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getParameters()}
 * @utbot.executesCondition {@code (n != null): False}
 * @utbot.invokes {@link java.util.Collections#emptySet()}
 * @utbot.returnsFrom {@code return Collections.emptySet();}
 *  */
    @Test
    public void testGetParameters_NEqualsNull() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        Set actual = ((Set) functionType.getParameters());
        
        Set expected = new LinkedHashSet();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getParameters()}
 * @utbot.executesCondition {@code (n != null): True}
 * @utbot.returnsFrom {@code return n.children();}
 *  */
    @Test
    public void testGetParameters_NNotEqualsNull_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        Set actual = ((Set) functionType.getParameters());
        
        Set expected = new LinkedHashSet();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getParameters()}
 * @utbot.executesCondition {@code (n != null): True}
 * @utbot.returnsFrom {@code return n.children();}
 *  */
    @Test
    public void testGetParameters_NNotEqualsNull() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        Object actual = functionType.getParameters();
        
        Object expected = createInstance("com.google.javascript.rhino.Node$SiblingNodeIterable");
        setField(expected, "com.google.javascript.rhino.Node$SiblingNodeIterable", "start", first);
        setField(expected, "com.google.javascript.rhino.Node$SiblingNodeIterable", "current", first);
        
        Node expectedStart = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node$SiblingNodeIterable", "start"));
        Node actualStart = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node$SiblingNodeIterable", "start"));
        int expectedStartType = expectedStart.getType();
        int actualStartType = actualStart.getType();
        assertEquals(expectedStartType, actualStartType);
        
        Node actualStartNext = actualStart.getNext();
        assertNull(actualStartNext);
        
        Node actualStartFirst = ((Node) getFieldValue(actualStart, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualStartFirst);
        
        Node actualStartLast = ((Node) getFieldValue(actualStart, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualStartLast);
        
        Object actualStartPropListHead = getFieldValue(actualStart, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualStartPropListHead);
        
        int expectedStartSourcePosition = ((Integer) getFieldValue(expectedStart, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualStartSourcePosition = ((Integer) getFieldValue(actualStart, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(expectedStartSourcePosition, actualStartSourcePosition);
        
        JSType actualStartJsType = ((JSType) getFieldValue(actualStart, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualStartJsType);
        
        Node actualStartParent = actualStart.getParent();
        assertNull(actualStartParent);
        
        Node expectedCurrent = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node$SiblingNodeIterable", "current"));
        Node actualCurrent = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node$SiblingNodeIterable", "current"));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        
        boolean actualUsed = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.Node$SiblingNodeIterable", "used"));
        assertFalse(actualUsed);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.visit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method visit(com.google.javascript.rhino.jstype.Visitor)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#visit(com.google.javascript.rhino.jstype.Visitor)}
 * @utbot.returnsFrom {@code return visitor.caseFunctionType(this);}
 *  */
    @Test
    public void testVisit_ReturnVisitorCaseFunctionType_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object restrictByOneTypeOfResultVisitor = createInstance("com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByOneTypeOfResultVisitor");
        String value = "";
        setField(restrictByOneTypeOfResultVisitor, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByOneTypeOfResultVisitor", "value", value);
        setField(restrictByOneTypeOfResultVisitor, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByOneTypeOfResultVisitor", "resultEqualsValue", true);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class restrictByOneTypeOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = functionTypeClazz.getDeclaredMethod("visit", restrictByOneTypeOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByOneTypeOfResultVisitor;
        Object actual = visitMethod.invoke(functionType, visitMethodArguments);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#visit(com.google.javascript.rhino.jstype.Visitor)}
 * @utbot.returnsFrom {@code return visitor.caseFunctionType(this);}
 *  */
    @Test
    public void testVisit_ReturnVisitorCaseFunctionType() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        UnknownType target = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = functionTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        FunctionType actual = ((FunctionType) visitMethod.invoke(functionType, visitMethodArguments));
        
        ArrowType actualCall = ((ArrowType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        assertNull(actualCall);
        
        FunctionPrototypeType actualPrototype = actual.getPrototype();
        assertNull(actualPrototype);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualSubTypes = actual.getSubTypes();
        assertNull(actualSubTypes);
        
        String actualTemplateTypeName = actual.getTemplateTypeName();
        assertNull(actualTemplateTypeName);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualPrettyPrint);
        
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
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#visit(com.google.javascript.rhino.jstype.Visitor)}
 * @utbot.returnsFrom {@code return visitor.caseFunctionType(this);}
 *  */
    @Test
    public void testVisit_ReturnVisitorCaseFunctionType_5() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object restrictByFalseInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByFalseInstanceOfResultVisitor");
        UnknownType target = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(restrictByFalseInstanceOfResultVisitor, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByFalseInstanceOfResultVisitor", "target", target);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class restrictByFalseInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = functionTypeClazz.getDeclaredMethod("visit", restrictByFalseInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByFalseInstanceOfResultVisitor;
        FunctionType actual = ((FunctionType) visitMethod.invoke(functionType, visitMethodArguments));
        
        ArrowType actualCall = ((ArrowType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        assertNull(actualCall);
        
        FunctionPrototypeType actualPrototype = actual.getPrototype();
        assertNull(actualPrototype);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualSubTypes = actual.getSubTypes();
        assertNull(actualSubTypes);
        
        String actualTemplateTypeName = actual.getTemplateTypeName();
        assertNull(actualTemplateTypeName);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualPrettyPrint);
        
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
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#visit(com.google.javascript.rhino.jstype.Visitor)}
 * @utbot.returnsFrom {@code return visitor.caseFunctionType(this);}
 *  */
    @Test
    public void testVisit_ReturnVisitorCaseFunctionType_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object restrictByOneTypeOfResultVisitor = createInstance("com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByOneTypeOfResultVisitor");
        String value = "";
        setField(restrictByOneTypeOfResultVisitor, "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$RestrictByOneTypeOfResultVisitor", "value", value);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class restrictByOneTypeOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = functionTypeClazz.getDeclaredMethod("visit", restrictByOneTypeOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByOneTypeOfResultVisitor;
        FunctionType actual = ((FunctionType) visitMethod.invoke(functionType, visitMethodArguments));
        
        ArrowType actualCall = ((ArrowType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        assertNull(actualCall);
        
        FunctionPrototypeType actualPrototype = actual.getPrototype();
        assertNull(actualPrototype);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualSubTypes = actual.getSubTypes();
        assertNull(actualSubTypes);
        
        String actualTemplateTypeName = actual.getTemplateTypeName();
        assertNull(actualTemplateTypeName);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualPrettyPrint);
        
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
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#visit(com.google.javascript.rhino.jstype.Visitor)}
 * @utbot.returnsFrom {@code return visitor.caseFunctionType(this);}
 *  */
    @Test
    public void testVisit_ReturnVisitorCaseFunctionType_3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        TemplateType target = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        target.setReferencedType(referencedType);
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = functionTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        FunctionType actual = ((FunctionType) visitMethod.invoke(functionType, visitMethodArguments));
        
        ArrowType actualCall = ((ArrowType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        assertNull(actualCall);
        
        FunctionPrototypeType actualPrototype = actual.getPrototype();
        assertNull(actualPrototype);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualSubTypes = actual.getSubTypes();
        assertNull(actualSubTypes);
        
        String actualTemplateTypeName = actual.getTemplateTypeName();
        assertNull(actualTemplateTypeName);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualPrettyPrint);
        
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
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#visit(com.google.javascript.rhino.jstype.Visitor)}
 * @utbot.returnsFrom {@code return visitor.caseFunctionType(this);}
 *  */
    @Test
    public void testVisit_ReturnVisitorCaseFunctionType_6() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object restrictByFalseInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByFalseInstanceOfResultVisitor");
        TemplateType target = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        target.setReferencedType(referencedType);
        setField(restrictByFalseInstanceOfResultVisitor, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByFalseInstanceOfResultVisitor", "target", target);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class restrictByFalseInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = functionTypeClazz.getDeclaredMethod("visit", restrictByFalseInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByFalseInstanceOfResultVisitor;
        FunctionType actual = ((FunctionType) visitMethod.invoke(functionType, visitMethodArguments));
        
        ArrowType actualCall = ((ArrowType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        assertNull(actualCall);
        
        FunctionPrototypeType actualPrototype = actual.getPrototype();
        assertNull(actualPrototype);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualSubTypes = actual.getSubTypes();
        assertNull(actualSubTypes);
        
        String actualTemplateTypeName = actual.getTemplateTypeName();
        assertNull(actualTemplateTypeName);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualPrettyPrint);
        
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
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#visit(com.google.javascript.rhino.jstype.Visitor)}
 * @utbot.returnsFrom {@code return visitor.caseFunctionType(this);}
 *  */
    @Test
    public void testVisit_ReturnVisitorCaseFunctionType_8() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object restrictByFalseInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByFalseInstanceOfResultVisitor");
        NamedType target = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        target.setReferencedType(referencedType);
        setField(restrictByFalseInstanceOfResultVisitor, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByFalseInstanceOfResultVisitor", "target", target);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class restrictByFalseInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = functionTypeClazz.getDeclaredMethod("visit", restrictByFalseInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByFalseInstanceOfResultVisitor;
        FunctionType actual = ((FunctionType) visitMethod.invoke(functionType, visitMethodArguments));
        
        ArrowType actualCall = ((ArrowType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        assertNull(actualCall);
        
        FunctionPrototypeType actualPrototype = actual.getPrototype();
        assertNull(actualPrototype);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualSubTypes = actual.getSubTypes();
        assertNull(actualSubTypes);
        
        String actualTemplateTypeName = actual.getTemplateTypeName();
        assertNull(actualTemplateTypeName);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualPrettyPrint);
        
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
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#visit(com.google.javascript.rhino.jstype.Visitor)}
 * @utbot.returnsFrom {@code return visitor.caseFunctionType(this);}
 *  */
    @Test
    public void testVisit_ReturnVisitorCaseFunctionType_4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        TemplateType target = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType.setReferencedType(referencedType1);
        target.setReferencedType(referencedType);
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = functionTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        FunctionType actual = ((FunctionType) visitMethod.invoke(functionType, visitMethodArguments));
        
        ArrowType actualCall = ((ArrowType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        assertNull(actualCall);
        
        FunctionPrototypeType actualPrototype = actual.getPrototype();
        assertNull(actualPrototype);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualSubTypes = actual.getSubTypes();
        assertNull(actualSubTypes);
        
        String actualTemplateTypeName = actual.getTemplateTypeName();
        assertNull(actualTemplateTypeName);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualPrettyPrint);
        
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
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#visit(com.google.javascript.rhino.jstype.Visitor)}
 * @utbot.returnsFrom {@code return visitor.caseFunctionType(this);}
 *  */
    @Test
    public void testVisit_ReturnVisitorCaseFunctionType_7() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        TemplateType target = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NamedType referencedType3 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        UnknownType referencedType4 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        target.setReferencedType(referencedType);
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = functionTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        FunctionType actual = ((FunctionType) visitMethod.invoke(functionType, visitMethodArguments));
        
        ArrowType actualCall = ((ArrowType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        assertNull(actualCall);
        
        FunctionPrototypeType actualPrototype = actual.getPrototype();
        assertNull(actualPrototype);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualSubTypes = actual.getSubTypes();
        assertNull(actualSubTypes);
        
        String actualTemplateTypeName = actual.getTemplateTypeName();
        assertNull(actualTemplateTypeName);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualPrettyPrint);
        
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
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visit(com.google.javascript.rhino.jstype.Visitor)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#visit(com.google.javascript.rhino.jstype.Visitor)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return visitor.caseFunctionType(this);
 *  */
    @Test
    public void testVisit_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.visit] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.visit(FunctionType.java:785) */
        functionType.visit(null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#visit(com.google.javascript.rhino.jstype.Visitor)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.Visitor#caseFunctionType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return visitor.caseFunctionType(this);
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_1() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor.applyCommonRestriction(SemanticReverseAbstractInterpreter.java:511)
            com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor.caseObjectType(SemanticReverseAbstractInterpreter.java:497)
            com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor.caseFunctionType(SemanticReverseAbstractInterpreter.java:507)
            com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor.caseFunctionType(SemanticReverseAbstractInterpreter.java:471)
            com.google.javascript.rhino.jstype.FunctionType.visit(FunctionType.java:785) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = functionTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        try {
            visitMethod.invoke(functionType, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getSource
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSource()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getSource()}
 * @utbot.returnsFrom {@code return source;}
 *  */
    @Test
    public void testGetSource_ReturnSource() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        Node actual = functionType.getSource();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.toDebugHashCodeString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toDebugHashCodeString()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#toDebugHashCodeString()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: this == registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE)
 *  */
    @Test
    public void testToDebugHashCodeString_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.toDebugHashCodeString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:774)
            com.google.javascript.rhino.jstype.FunctionType.toDebugHashCodeString(FunctionType.java:907) */
        functionType.toDebugHashCodeString();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#toDebugHashCodeString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: this == registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE)
 *  */
    @Test
    public void testToDebugHashCodeString_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.toDebugHashCodeString] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.toDebugHashCodeString(FunctionType.java:907) */
        functionType.toDebugHashCodeString();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toDebugHashCodeString()
    
    @Test
    public void testToDebugHashCodeString1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[32];
        nativeTypes[13] = ((JSType) functionType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        String actual = functionType.toDebugHashCodeString();
        
        String expected = "{1431605186}";
        
        assertEquals(expected, actual);
        
        JSTypeRegistry jSTypeRegistry = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes14 = ((JSType) get(jSTypeRegistry13RegistryNativeTypes, 14));
        JSTypeRegistry jSTypeRegistry14 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes15 = ((JSType) get(jSTypeRegistry14RegistryNativeTypes, 15));
        JSTypeRegistry jSTypeRegistry15 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry15RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes16 = ((JSType) get(jSTypeRegistry15RegistryNativeTypes, 16));
        JSTypeRegistry jSTypeRegistry16 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry16RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes17 = ((JSType) get(jSTypeRegistry16RegistryNativeTypes, 17));
        JSTypeRegistry jSTypeRegistry17 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry17RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes18 = ((JSType) get(jSTypeRegistry17RegistryNativeTypes, 18));
        JSTypeRegistry jSTypeRegistry18 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry18RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes19 = ((JSType) get(jSTypeRegistry18RegistryNativeTypes, 19));
        JSTypeRegistry jSTypeRegistry19 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry19RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes20 = ((JSType) get(jSTypeRegistry19RegistryNativeTypes, 20));
        JSTypeRegistry jSTypeRegistry20 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry20RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes21 = ((JSType) get(jSTypeRegistry20RegistryNativeTypes, 21));
        JSTypeRegistry jSTypeRegistry21 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry21RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes22 = ((JSType) get(jSTypeRegistry21RegistryNativeTypes, 22));
        JSTypeRegistry jSTypeRegistry22 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry22RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes23 = ((JSType) get(jSTypeRegistry22RegistryNativeTypes, 23));
        JSTypeRegistry jSTypeRegistry23 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry23RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes24 = ((JSType) get(jSTypeRegistry23RegistryNativeTypes, 24));
        JSTypeRegistry jSTypeRegistry24 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry24RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes25 = ((JSType) get(jSTypeRegistry24RegistryNativeTypes, 25));
        JSTypeRegistry jSTypeRegistry25 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry25RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes26 = ((JSType) get(jSTypeRegistry25RegistryNativeTypes, 26));
        JSTypeRegistry jSTypeRegistry26 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry26RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes27 = ((JSType) get(jSTypeRegistry26RegistryNativeTypes, 27));
        JSTypeRegistry jSTypeRegistry27 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry27RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes28 = ((JSType) get(jSTypeRegistry27RegistryNativeTypes, 28));
        JSTypeRegistry jSTypeRegistry28 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry28RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes29 = ((JSType) get(jSTypeRegistry28RegistryNativeTypes, 29));
        JSTypeRegistry jSTypeRegistry29 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry29RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes30 = ((JSType) get(jSTypeRegistry29RegistryNativeTypes, 30));
        JSTypeRegistry jSTypeRegistry30 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry30RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes31 = ((JSType) get(jSTypeRegistry30RegistryNativeTypes, 31));
        
        assertNull(finalFunctionTypeRegistryNativeTypes0);
        
        assertNull(finalFunctionTypeRegistryNativeTypes1);
        
        assertNull(finalFunctionTypeRegistryNativeTypes2);
        
        assertNull(finalFunctionTypeRegistryNativeTypes3);
        
        assertNull(finalFunctionTypeRegistryNativeTypes4);
        
        assertNull(finalFunctionTypeRegistryNativeTypes5);
        
        assertNull(finalFunctionTypeRegistryNativeTypes6);
        
        assertNull(finalFunctionTypeRegistryNativeTypes7);
        
        assertNull(finalFunctionTypeRegistryNativeTypes8);
        
        assertNull(finalFunctionTypeRegistryNativeTypes9);
        
        assertNull(finalFunctionTypeRegistryNativeTypes10);
        
        assertNull(finalFunctionTypeRegistryNativeTypes11);
        
        assertNull(finalFunctionTypeRegistryNativeTypes12);
        
        assertNull(finalFunctionTypeRegistryNativeTypes14);
        
        assertNull(finalFunctionTypeRegistryNativeTypes15);
        
        assertNull(finalFunctionTypeRegistryNativeTypes16);
        
        assertNull(finalFunctionTypeRegistryNativeTypes17);
        
        assertNull(finalFunctionTypeRegistryNativeTypes18);
        
        assertNull(finalFunctionTypeRegistryNativeTypes19);
        
        assertNull(finalFunctionTypeRegistryNativeTypes20);
        
        assertNull(finalFunctionTypeRegistryNativeTypes21);
        
        assertNull(finalFunctionTypeRegistryNativeTypes22);
        
        assertNull(finalFunctionTypeRegistryNativeTypes23);
        
        assertNull(finalFunctionTypeRegistryNativeTypes24);
        
        assertNull(finalFunctionTypeRegistryNativeTypes25);
        
        assertNull(finalFunctionTypeRegistryNativeTypes26);
        
        assertNull(finalFunctionTypeRegistryNativeTypes27);
        
        assertNull(finalFunctionTypeRegistryNativeTypes28);
        
        assertNull(finalFunctionTypeRegistryNativeTypes29);
        
        assertNull(finalFunctionTypeRegistryNativeTypes30);
        
        assertNull(finalFunctionTypeRegistryNativeTypes31);
    }
    
    @Test
    public void testToDebugHashCodeString2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[16];
        nativeTypes[13] = ((JSType) functionType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        String actual = functionType.toDebugHashCodeString();
        
        String expected = "{0}";
        
        assertEquals(expected, actual);
        
        JSTypeRegistry jSTypeRegistry = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes14 = ((JSType) get(jSTypeRegistry13RegistryNativeTypes, 14));
        JSTypeRegistry jSTypeRegistry14 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes15 = ((JSType) get(jSTypeRegistry14RegistryNativeTypes, 15));
        
        assertNull(finalFunctionTypeRegistryNativeTypes0);
        
        assertNull(finalFunctionTypeRegistryNativeTypes1);
        
        assertNull(finalFunctionTypeRegistryNativeTypes2);
        
        assertNull(finalFunctionTypeRegistryNativeTypes3);
        
        assertNull(finalFunctionTypeRegistryNativeTypes4);
        
        assertNull(finalFunctionTypeRegistryNativeTypes5);
        
        assertNull(finalFunctionTypeRegistryNativeTypes6);
        
        assertNull(finalFunctionTypeRegistryNativeTypes7);
        
        assertNull(finalFunctionTypeRegistryNativeTypes8);
        
        assertNull(finalFunctionTypeRegistryNativeTypes9);
        
        assertNull(finalFunctionTypeRegistryNativeTypes10);
        
        assertNull(finalFunctionTypeRegistryNativeTypes11);
        
        assertNull(finalFunctionTypeRegistryNativeTypes12);
        
        assertNull(finalFunctionTypeRegistryNativeTypes14);
        
        assertNull(finalFunctionTypeRegistryNativeTypes15);
    }
    
    @Test
    public void testToDebugHashCodeString3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        PrototypeObjectType returnType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[32];
        nativeTypes[13] = ((JSType) functionType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        String actual = functionType.toDebugHashCodeString();
        
        String expected = "{1940655472}";
        
        assertEquals(expected, actual);
        
        JSTypeRegistry jSTypeRegistry = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes14 = ((JSType) get(jSTypeRegistry13RegistryNativeTypes, 14));
        JSTypeRegistry jSTypeRegistry14 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes15 = ((JSType) get(jSTypeRegistry14RegistryNativeTypes, 15));
        JSTypeRegistry jSTypeRegistry15 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry15RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes16 = ((JSType) get(jSTypeRegistry15RegistryNativeTypes, 16));
        JSTypeRegistry jSTypeRegistry16 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry16RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes17 = ((JSType) get(jSTypeRegistry16RegistryNativeTypes, 17));
        JSTypeRegistry jSTypeRegistry17 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry17RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes18 = ((JSType) get(jSTypeRegistry17RegistryNativeTypes, 18));
        JSTypeRegistry jSTypeRegistry18 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry18RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes19 = ((JSType) get(jSTypeRegistry18RegistryNativeTypes, 19));
        JSTypeRegistry jSTypeRegistry19 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry19RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes20 = ((JSType) get(jSTypeRegistry19RegistryNativeTypes, 20));
        JSTypeRegistry jSTypeRegistry20 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry20RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes21 = ((JSType) get(jSTypeRegistry20RegistryNativeTypes, 21));
        JSTypeRegistry jSTypeRegistry21 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry21RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes22 = ((JSType) get(jSTypeRegistry21RegistryNativeTypes, 22));
        JSTypeRegistry jSTypeRegistry22 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry22RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes23 = ((JSType) get(jSTypeRegistry22RegistryNativeTypes, 23));
        JSTypeRegistry jSTypeRegistry23 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry23RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes24 = ((JSType) get(jSTypeRegistry23RegistryNativeTypes, 24));
        JSTypeRegistry jSTypeRegistry24 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry24RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes25 = ((JSType) get(jSTypeRegistry24RegistryNativeTypes, 25));
        JSTypeRegistry jSTypeRegistry25 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry25RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes26 = ((JSType) get(jSTypeRegistry25RegistryNativeTypes, 26));
        JSTypeRegistry jSTypeRegistry26 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry26RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes27 = ((JSType) get(jSTypeRegistry26RegistryNativeTypes, 27));
        JSTypeRegistry jSTypeRegistry27 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry27RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes28 = ((JSType) get(jSTypeRegistry27RegistryNativeTypes, 28));
        JSTypeRegistry jSTypeRegistry28 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry28RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes29 = ((JSType) get(jSTypeRegistry28RegistryNativeTypes, 29));
        JSTypeRegistry jSTypeRegistry29 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry29RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes30 = ((JSType) get(jSTypeRegistry29RegistryNativeTypes, 30));
        JSTypeRegistry jSTypeRegistry30 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry30RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes31 = ((JSType) get(jSTypeRegistry30RegistryNativeTypes, 31));
        
        assertNull(finalFunctionTypeRegistryNativeTypes0);
        
        assertNull(finalFunctionTypeRegistryNativeTypes1);
        
        assertNull(finalFunctionTypeRegistryNativeTypes2);
        
        assertNull(finalFunctionTypeRegistryNativeTypes3);
        
        assertNull(finalFunctionTypeRegistryNativeTypes4);
        
        assertNull(finalFunctionTypeRegistryNativeTypes5);
        
        assertNull(finalFunctionTypeRegistryNativeTypes6);
        
        assertNull(finalFunctionTypeRegistryNativeTypes7);
        
        assertNull(finalFunctionTypeRegistryNativeTypes8);
        
        assertNull(finalFunctionTypeRegistryNativeTypes9);
        
        assertNull(finalFunctionTypeRegistryNativeTypes10);
        
        assertNull(finalFunctionTypeRegistryNativeTypes11);
        
        assertNull(finalFunctionTypeRegistryNativeTypes12);
        
        assertNull(finalFunctionTypeRegistryNativeTypes14);
        
        assertNull(finalFunctionTypeRegistryNativeTypes15);
        
        assertNull(finalFunctionTypeRegistryNativeTypes16);
        
        assertNull(finalFunctionTypeRegistryNativeTypes17);
        
        assertNull(finalFunctionTypeRegistryNativeTypes18);
        
        assertNull(finalFunctionTypeRegistryNativeTypes19);
        
        assertNull(finalFunctionTypeRegistryNativeTypes20);
        
        assertNull(finalFunctionTypeRegistryNativeTypes21);
        
        assertNull(finalFunctionTypeRegistryNativeTypes22);
        
        assertNull(finalFunctionTypeRegistryNativeTypes23);
        
        assertNull(finalFunctionTypeRegistryNativeTypes24);
        
        assertNull(finalFunctionTypeRegistryNativeTypes25);
        
        assertNull(finalFunctionTypeRegistryNativeTypes26);
        
        assertNull(finalFunctionTypeRegistryNativeTypes27);
        
        assertNull(finalFunctionTypeRegistryNativeTypes28);
        
        assertNull(finalFunctionTypeRegistryNativeTypes29);
        
        assertNull(finalFunctionTypeRegistryNativeTypes30);
        
        assertNull(finalFunctionTypeRegistryNativeTypes31);
    }
    
    @Test
    public void testToDebugHashCodeString4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnTypeInferred", true);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[16];
        nativeTypes[13] = ((JSType) functionType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        String actual = functionType.toDebugHashCodeString();
        
        String expected = "{1}";
        
        assertEquals(expected, actual);
        
        JSTypeRegistry jSTypeRegistry = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes14 = ((JSType) get(jSTypeRegistry13RegistryNativeTypes, 14));
        JSTypeRegistry jSTypeRegistry14 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes15 = ((JSType) get(jSTypeRegistry14RegistryNativeTypes, 15));
        
        assertNull(finalFunctionTypeRegistryNativeTypes0);
        
        assertNull(finalFunctionTypeRegistryNativeTypes1);
        
        assertNull(finalFunctionTypeRegistryNativeTypes2);
        
        assertNull(finalFunctionTypeRegistryNativeTypes3);
        
        assertNull(finalFunctionTypeRegistryNativeTypes4);
        
        assertNull(finalFunctionTypeRegistryNativeTypes5);
        
        assertNull(finalFunctionTypeRegistryNativeTypes6);
        
        assertNull(finalFunctionTypeRegistryNativeTypes7);
        
        assertNull(finalFunctionTypeRegistryNativeTypes8);
        
        assertNull(finalFunctionTypeRegistryNativeTypes9);
        
        assertNull(finalFunctionTypeRegistryNativeTypes10);
        
        assertNull(finalFunctionTypeRegistryNativeTypes11);
        
        assertNull(finalFunctionTypeRegistryNativeTypes12);
        
        assertNull(finalFunctionTypeRegistryNativeTypes14);
        
        assertNull(finalFunctionTypeRegistryNativeTypes15);
    }
    
    @Test
    public void testToDebugHashCodeString5() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[32];
        nativeTypes[13] = ((JSType) functionType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        String actual = functionType.toDebugHashCodeString();
        
        String expected = "{0}";
        
        assertEquals(expected, actual);
        
        JSTypeRegistry jSTypeRegistry = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes14 = ((JSType) get(jSTypeRegistry13RegistryNativeTypes, 14));
        JSTypeRegistry jSTypeRegistry14 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes15 = ((JSType) get(jSTypeRegistry14RegistryNativeTypes, 15));
        JSTypeRegistry jSTypeRegistry15 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry15RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes16 = ((JSType) get(jSTypeRegistry15RegistryNativeTypes, 16));
        JSTypeRegistry jSTypeRegistry16 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry16RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes17 = ((JSType) get(jSTypeRegistry16RegistryNativeTypes, 17));
        JSTypeRegistry jSTypeRegistry17 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry17RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes18 = ((JSType) get(jSTypeRegistry17RegistryNativeTypes, 18));
        JSTypeRegistry jSTypeRegistry18 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry18RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes19 = ((JSType) get(jSTypeRegistry18RegistryNativeTypes, 19));
        JSTypeRegistry jSTypeRegistry19 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry19RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes20 = ((JSType) get(jSTypeRegistry19RegistryNativeTypes, 20));
        JSTypeRegistry jSTypeRegistry20 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry20RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes21 = ((JSType) get(jSTypeRegistry20RegistryNativeTypes, 21));
        JSTypeRegistry jSTypeRegistry21 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry21RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes22 = ((JSType) get(jSTypeRegistry21RegistryNativeTypes, 22));
        JSTypeRegistry jSTypeRegistry22 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry22RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes23 = ((JSType) get(jSTypeRegistry22RegistryNativeTypes, 23));
        JSTypeRegistry jSTypeRegistry23 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry23RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes24 = ((JSType) get(jSTypeRegistry23RegistryNativeTypes, 24));
        JSTypeRegistry jSTypeRegistry24 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry24RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes25 = ((JSType) get(jSTypeRegistry24RegistryNativeTypes, 25));
        JSTypeRegistry jSTypeRegistry25 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry25RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes26 = ((JSType) get(jSTypeRegistry25RegistryNativeTypes, 26));
        JSTypeRegistry jSTypeRegistry26 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry26RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes27 = ((JSType) get(jSTypeRegistry26RegistryNativeTypes, 27));
        JSTypeRegistry jSTypeRegistry27 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry27RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes28 = ((JSType) get(jSTypeRegistry27RegistryNativeTypes, 28));
        JSTypeRegistry jSTypeRegistry28 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry28RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes29 = ((JSType) get(jSTypeRegistry28RegistryNativeTypes, 29));
        JSTypeRegistry jSTypeRegistry29 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry29RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes30 = ((JSType) get(jSTypeRegistry29RegistryNativeTypes, 30));
        JSTypeRegistry jSTypeRegistry30 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry30RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes31 = ((JSType) get(jSTypeRegistry30RegistryNativeTypes, 31));
        
        assertNull(finalFunctionTypeRegistryNativeTypes0);
        
        assertNull(finalFunctionTypeRegistryNativeTypes1);
        
        assertNull(finalFunctionTypeRegistryNativeTypes2);
        
        assertNull(finalFunctionTypeRegistryNativeTypes3);
        
        assertNull(finalFunctionTypeRegistryNativeTypes4);
        
        assertNull(finalFunctionTypeRegistryNativeTypes5);
        
        assertNull(finalFunctionTypeRegistryNativeTypes6);
        
        assertNull(finalFunctionTypeRegistryNativeTypes7);
        
        assertNull(finalFunctionTypeRegistryNativeTypes8);
        
        assertNull(finalFunctionTypeRegistryNativeTypes9);
        
        assertNull(finalFunctionTypeRegistryNativeTypes10);
        
        assertNull(finalFunctionTypeRegistryNativeTypes11);
        
        assertNull(finalFunctionTypeRegistryNativeTypes12);
        
        assertNull(finalFunctionTypeRegistryNativeTypes14);
        
        assertNull(finalFunctionTypeRegistryNativeTypes15);
        
        assertNull(finalFunctionTypeRegistryNativeTypes16);
        
        assertNull(finalFunctionTypeRegistryNativeTypes17);
        
        assertNull(finalFunctionTypeRegistryNativeTypes18);
        
        assertNull(finalFunctionTypeRegistryNativeTypes19);
        
        assertNull(finalFunctionTypeRegistryNativeTypes20);
        
        assertNull(finalFunctionTypeRegistryNativeTypes21);
        
        assertNull(finalFunctionTypeRegistryNativeTypes22);
        
        assertNull(finalFunctionTypeRegistryNativeTypes23);
        
        assertNull(finalFunctionTypeRegistryNativeTypes24);
        
        assertNull(finalFunctionTypeRegistryNativeTypes25);
        
        assertNull(finalFunctionTypeRegistryNativeTypes26);
        
        assertNull(finalFunctionTypeRegistryNativeTypes27);
        
        assertNull(finalFunctionTypeRegistryNativeTypes28);
        
        assertNull(finalFunctionTypeRegistryNativeTypes29);
        
        assertNull(finalFunctionTypeRegistryNativeTypes30);
        
        assertNull(finalFunctionTypeRegistryNativeTypes31);
    }
    
    @Test
    public void testToDebugHashCodeString6() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnTypeInferred", true);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[16];
        nativeTypes[13] = ((JSType) functionType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        String actual = functionType.toDebugHashCodeString();
        
        String expected = "{1}";
        
        assertEquals(expected, actual);
        
        JSTypeRegistry jSTypeRegistry = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes14 = ((JSType) get(jSTypeRegistry13RegistryNativeTypes, 14));
        JSTypeRegistry jSTypeRegistry14 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes15 = ((JSType) get(jSTypeRegistry14RegistryNativeTypes, 15));
        
        assertNull(finalFunctionTypeRegistryNativeTypes0);
        
        assertNull(finalFunctionTypeRegistryNativeTypes1);
        
        assertNull(finalFunctionTypeRegistryNativeTypes2);
        
        assertNull(finalFunctionTypeRegistryNativeTypes3);
        
        assertNull(finalFunctionTypeRegistryNativeTypes4);
        
        assertNull(finalFunctionTypeRegistryNativeTypes5);
        
        assertNull(finalFunctionTypeRegistryNativeTypes6);
        
        assertNull(finalFunctionTypeRegistryNativeTypes7);
        
        assertNull(finalFunctionTypeRegistryNativeTypes8);
        
        assertNull(finalFunctionTypeRegistryNativeTypes9);
        
        assertNull(finalFunctionTypeRegistryNativeTypes10);
        
        assertNull(finalFunctionTypeRegistryNativeTypes11);
        
        assertNull(finalFunctionTypeRegistryNativeTypes12);
        
        assertNull(finalFunctionTypeRegistryNativeTypes14);
        
        assertNull(finalFunctionTypeRegistryNativeTypes15);
    }
    
    @Test
    public void testToDebugHashCodeString7() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[17];
        nativeTypes[13] = ((JSType) functionType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        String actual = functionType.toDebugHashCodeString();
        
        String expected = "{0}";
        
        assertEquals(expected, actual);
        
        JSTypeRegistry jSTypeRegistry = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes14 = ((JSType) get(jSTypeRegistry13RegistryNativeTypes, 14));
        JSTypeRegistry jSTypeRegistry14 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes15 = ((JSType) get(jSTypeRegistry14RegistryNativeTypes, 15));
        JSTypeRegistry jSTypeRegistry15 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry15RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes16 = ((JSType) get(jSTypeRegistry15RegistryNativeTypes, 16));
        
        assertNull(finalFunctionTypeRegistryNativeTypes0);
        
        assertNull(finalFunctionTypeRegistryNativeTypes1);
        
        assertNull(finalFunctionTypeRegistryNativeTypes2);
        
        assertNull(finalFunctionTypeRegistryNativeTypes3);
        
        assertNull(finalFunctionTypeRegistryNativeTypes4);
        
        assertNull(finalFunctionTypeRegistryNativeTypes5);
        
        assertNull(finalFunctionTypeRegistryNativeTypes6);
        
        assertNull(finalFunctionTypeRegistryNativeTypes7);
        
        assertNull(finalFunctionTypeRegistryNativeTypes8);
        
        assertNull(finalFunctionTypeRegistryNativeTypes9);
        
        assertNull(finalFunctionTypeRegistryNativeTypes10);
        
        assertNull(finalFunctionTypeRegistryNativeTypes11);
        
        assertNull(finalFunctionTypeRegistryNativeTypes12);
        
        assertNull(finalFunctionTypeRegistryNativeTypes14);
        
        assertNull(finalFunctionTypeRegistryNativeTypes15);
        
        assertNull(finalFunctionTypeRegistryNativeTypes16);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toDebugHashCodeString()
    
    @Test
    public void testToDebugHashCodeString8() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[16];
        nativeTypes[13] = ((JSType) functionType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.toDebugHashCodeString] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.hashCode(FunctionType.java:683)
            com.google.javascript.rhino.jstype.JSType.toDebugHashCodeString(JSType.java:954)
            com.google.javascript.rhino.jstype.FunctionType.toDebugHashCodeString(FunctionType.java:908) */
        functionType.toDebugHashCodeString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.isReturnTypeInferred
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isReturnTypeInferred()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isReturnTypeInferred()}
 * @utbot.returnsFrom {@code return call.returnTypeInferred;}
 *  */
    @Test
    public void testIsReturnTypeInferred_ReturnCallReturnTypeInferred() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        boolean actual = functionType.isReturnTypeInferred();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isReturnTypeInferred()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isReturnTypeInferred()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return call.returnTypeInferred;
 *  */
    @Test
    public void testIsReturnTypeInferred_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.isReturnTypeInferred] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.isReturnTypeInferred(FunctionType.java:246) */
        functionType.isReturnTypeInferred();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendVarArgsString(java.lang.StringBuilder, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#appendVarArgsString(java.lang.StringBuilder,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (paramType.isUnionType()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: registry.getNativeType(JSTypeNative.VOID_TYPE)
 *  */
    @Test
    public void testAppendVarArgsString_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 38 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:774)
            com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString(FunctionType.java:741) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class unionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method appendVarArgsStringMethod = functionTypeClazz.getDeclaredMethod("appendVarArgsString", stringBuilderType, unionTypeType);
        appendVarArgsStringMethod.setAccessible(true);
        java.lang.Object[] appendVarArgsStringMethodArguments = new java.lang.Object[2];
        appendVarArgsStringMethodArguments[0] = ((Object) null);
        appendVarArgsStringMethodArguments[1] = unionType;
        try {
            appendVarArgsStringMethod.invoke(functionType, appendVarArgsStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#appendVarArgsString(java.lang.StringBuilder,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (paramType.isUnionType()): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: builder.append("...[").append(paramType.toString()).append("]");
 *  */
    @Test
    public void testAppendVarArgsString_ThrowNullPointerException_2() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString(FunctionType.java:743) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method appendVarArgsStringMethod = functionTypeClazz.getDeclaredMethod("appendVarArgsString", stringBuilderType, templateTypeType);
        appendVarArgsStringMethod.setAccessible(true);
        java.lang.Object[] appendVarArgsStringMethodArguments = new java.lang.Object[2];
        appendVarArgsStringMethodArguments[0] = ((Object) null);
        appendVarArgsStringMethodArguments[1] = templateType;
        try {
            appendVarArgsStringMethod.invoke(functionType, appendVarArgsStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#appendVarArgsString(java.lang.StringBuilder,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isUnionType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: paramType.isUnionType()
 *  */
    @Test
    public void testAppendVarArgsString_ThrowNullPointerException() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString(FunctionType.java:738) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method appendVarArgsStringMethod = functionTypeClazz.getDeclaredMethod("appendVarArgsString", stringBuilderType, jSTypeType);
        appendVarArgsStringMethod.setAccessible(true);
        java.lang.Object[] appendVarArgsStringMethodArguments = new java.lang.Object[2];
        appendVarArgsStringMethodArguments[0] = ((Object) null);
        appendVarArgsStringMethodArguments[1] = ((Object) null);
        try {
            appendVarArgsStringMethod.invoke(functionType, appendVarArgsStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#appendVarArgsString(java.lang.StringBuilder,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (paramType.isUnionType()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: registry.getNativeType(JSTypeNative.VOID_TYPE)
 *  */
    @Test
    public void testAppendVarArgsString_ThrowNullPointerException_1() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString(FunctionType.java:741) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class unionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method appendVarArgsStringMethod = functionTypeClazz.getDeclaredMethod("appendVarArgsString", stringBuilderType, unionTypeType);
        appendVarArgsStringMethod.setAccessible(true);
        java.lang.Object[] appendVarArgsStringMethodArguments = new java.lang.Object[2];
        appendVarArgsStringMethodArguments[0] = ((Object) null);
        appendVarArgsStringMethodArguments[1] = unionType;
        try {
            appendVarArgsStringMethod.invoke(functionType, appendVarArgsStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method appendVarArgsString(java.lang.StringBuilder, com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testAppendVarArgsString1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        NumberType numberType = new NumberType(null);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class numberTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method appendVarArgsStringMethod = functionTypeClazz.getDeclaredMethod("appendVarArgsString", stringBuilderType, numberTypeType);
        appendVarArgsStringMethod.setAccessible(true);
        java.lang.Object[] appendVarArgsStringMethodArguments = new java.lang.Object[2];
        appendVarArgsStringMethodArguments[0] = stringBuilder;
        appendVarArgsStringMethodArguments[1] = numberType;
        appendVarArgsStringMethod.invoke(functionType, appendVarArgsStringMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method appendVarArgsString(java.lang.StringBuilder, com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testAppendVarArgsString2() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[40];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionTypeBuilder.build(UnionTypeBuilder.java:169)
            com.google.javascript.rhino.jstype.UnionType.getRestrictedUnion(UnionType.java:392)
            com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString(FunctionType.java:740) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class unionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method appendVarArgsStringMethod = functionTypeClazz.getDeclaredMethod("appendVarArgsString", stringBuilderType, unionTypeType);
        appendVarArgsStringMethod.setAccessible(true);
        java.lang.Object[] appendVarArgsStringMethodArguments = new java.lang.Object[2];
        appendVarArgsStringMethodArguments[0] = ((Object) null);
        appendVarArgsStringMethodArguments[1] = unionType;
        try {
            appendVarArgsStringMethod.invoke(functionType, appendVarArgsStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.setPrototypeBasedOn
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setPrototypeBasedOn(com.google.javascript.rhino.jstype.ObjectType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototypeBasedOn(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.executesCondition {@code (prototype == null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionPrototypeType#setImplicitPrototype(com.google.javascript.rhino.jstype.ObjectType)}
 *  */
    @Test
    public void testSetPrototypeBasedOn_PrototypeNotEqualsNull() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(prototype, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        
        functionType.setPrototypeBasedOn(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setPrototypeBasedOn(com.google.javascript.rhino.jstype.ObjectType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototypeBasedOn(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.executesCondition {@code (prototype == null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionPrototypeType#setImplicitPrototype(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: prototype.setImplicitPrototype(baseType);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testSetPrototypeBasedOn_ThrowIllegalStateException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        
        functionType.setPrototypeBasedOn(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setPrototypeBasedOn(com.google.javascript.rhino.jstype.ObjectType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototypeBasedOn(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: registry
 *  */
    @Test
    public void testSetPrototypeBasedOn_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.setPrototypeBasedOn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:774)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:778)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:117)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionType.setPrototypeBasedOn(FunctionType.java:275) */
        functionType.setPrototypeBasedOn(null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototypeBasedOn(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: registry
 *  */
    @Test
    public void testSetPrototypeBasedOn_ThrowClassCastException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        NumberType numberType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        nativeTypes[19] = ((JSType) numberType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.setPrototypeBasedOn] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.NumberType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.NumberType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:778)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:117)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionType.setPrototypeBasedOn(FunctionType.java:275) */
        functionType.setPrototypeBasedOn(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setPrototypeBasedOn(com.google.javascript.rhino.jstype.ObjectType)
    
    @Test
    public void testSetPrototypeBasedOn1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        UnresolvedTypeExpression unresolvedTypeExpression = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        functionType.setPrototypeBasedOn(unresolvedTypeExpression);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
    }
    
    @Test
    public void testSetPrototypeBasedOn2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        functionType.setPrototypeBasedOn(null);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
    }
    
    @Test
    public void testSetPrototypeBasedOn3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        functionType.setPrototypeBasedOn(null);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
    }
    
    @Test
    public void testSetPrototypeBasedOn4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        UnknownType unknownType = new UnknownType(null, false);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        functionType.setPrototypeBasedOn(unknownType);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getTopMostDefiningType
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getTopMostDefiningType(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getTopMostDefiningType(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isConstructor()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isInterface()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(isConstructor() || isInterface());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetTopMostDefiningType_ThrowIllegalStateException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        functionType.getTopMostDefiningType(null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getTopMostDefiningType(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetTopMostDefiningType1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(prototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        functionType.getTopMostDefiningType(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getTopMostDefiningType(java.lang.String)
    
    @Test
    public void testGetTopMostDefiningType2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getTopMostDefiningType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:117)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:261)
            com.google.javascript.rhino.jstype.FunctionType.getTopMostDefiningType(FunctionType.java:639) */
        functionType.getTopMostDefiningType(null);
    }
    
    @Test
    public void testGetTopMostDefiningType3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getTopMostDefiningType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:117)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:261)
            com.google.javascript.rhino.jstype.FunctionType.getTopMostDefiningType(FunctionType.java:639) */
        functionType.getTopMostDefiningType(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasUnknownSupertype()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasUnknownSupertype()}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testHasUnknownSupertype_ReturnTrue() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        UnknownType implicitPrototypeFallback = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(prototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.hasUnknownSupertype();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasUnknownSupertype()}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testHasUnknownSupertype_ReturnTrue_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        TemplateType implicitPrototypeFallback = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        implicitPrototypeFallback.setReferencedType(referencedType);
        setField(prototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoType implicitPrototypeFallback1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(implicitPrototypeFallback1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        boolean actual = functionType.hasUnknownSupertype();
        
        assertTrue(actual);
        
        boolean finalFunctionTypeUnknown = ((Boolean) getFieldValue(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        
        assertFalse(finalFunctionTypeUnknown);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasUnknownSupertype()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isInterface()}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testHasUnknownSupertype_FunctionTypeIsInterface() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        boolean actual = functionType.hasUnknownSupertype();
        
        assertFalse(actual);
        
        boolean finalFunctionTypeUnknown = ((Boolean) getFieldValue(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        
        assertFalse(finalFunctionTypeUnknown);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method hasUnknownSupertype()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasUnknownSupertype()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isConstructor()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isInterface()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkArgument(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(isConstructor() || isInterface());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHasUnknownSupertype_ThrowIllegalArgumentException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        functionType.hasUnknownSupertype();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hasUnknownSupertype()
    
    @Test
    public void testHasUnknownSupertype1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(prototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        TemplateType implicitPrototypeFallback = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        implicitPrototypeFallback.setReferencedType(referencedType);
        setField(prototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", prototype);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        boolean actual = functionType.hasUnknownSupertype();
        
        assertTrue(actual);
        
        boolean finalFunctionTypeUnknown = ((Boolean) getFieldValue(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        
        assertFalse(finalFunctionTypeUnknown);
    }
    
    @Test
    public void testHasUnknownSupertype2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        EnumElementType implicitPrototypeFallback = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(prototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoType implicitPrototypeFallback1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(implicitPrototypeFallback1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        boolean actual = functionType.hasUnknownSupertype();
        
        assertFalse(actual);
        
        boolean finalFunctionTypeUnknown = ((Boolean) getFieldValue(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        
        assertFalse(finalFunctionTypeUnknown);
    }
    
    @Test
    public void testHasUnknownSupertype3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        EnumElementType implicitPrototypeFallback = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(prototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoType implicitPrototypeFallback1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(implicitPrototypeFallback1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        boolean actual = functionType.hasUnknownSupertype();
        
        assertFalse(actual);
        
        boolean finalFunctionTypeUnknown = ((Boolean) getFieldValue(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        
        assertFalse(finalFunctionTypeUnknown);
    }
    
    @Test
    public void testHasUnknownSupertype4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        boolean actual = functionType.hasUnknownSupertype();
        
        assertFalse(actual);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        JSTypeRegistry jSTypeRegistry = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes13 = ((JSType) get(jSTypeRegistry13RegistryNativeTypes, 13));
        JSTypeRegistry jSTypeRegistry14 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes14 = ((JSType) get(jSTypeRegistry14RegistryNativeTypes, 14));
        JSTypeRegistry jSTypeRegistry15 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry15RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes15 = ((JSType) get(jSTypeRegistry15RegistryNativeTypes, 15));
        JSTypeRegistry jSTypeRegistry16 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry16RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes16 = ((JSType) get(jSTypeRegistry16RegistryNativeTypes, 16));
        JSTypeRegistry jSTypeRegistry17 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry17RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes17 = ((JSType) get(jSTypeRegistry17RegistryNativeTypes, 17));
        JSTypeRegistry jSTypeRegistry18 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry18RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes18 = ((JSType) get(jSTypeRegistry18RegistryNativeTypes, 18));
        JSTypeRegistry jSTypeRegistry19 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry19RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes19 = ((JSType) get(jSTypeRegistry19RegistryNativeTypes, 19));
        JSTypeRegistry jSTypeRegistry20 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry20RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes20 = ((JSType) get(jSTypeRegistry20RegistryNativeTypes, 20));
        JSTypeRegistry jSTypeRegistry21 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry21RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes21 = ((JSType) get(jSTypeRegistry21RegistryNativeTypes, 21));
        JSTypeRegistry jSTypeRegistry22 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry22RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes22 = ((JSType) get(jSTypeRegistry22RegistryNativeTypes, 22));
        JSTypeRegistry jSTypeRegistry23 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry23RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes23 = ((JSType) get(jSTypeRegistry23RegistryNativeTypes, 23));
        JSTypeRegistry jSTypeRegistry24 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry24RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes24 = ((JSType) get(jSTypeRegistry24RegistryNativeTypes, 24));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
        
        assertNull(finalFunctionTypeRegistryNativeTypes0);
        
        assertNull(finalFunctionTypeRegistryNativeTypes1);
        
        assertNull(finalFunctionTypeRegistryNativeTypes2);
        
        assertNull(finalFunctionTypeRegistryNativeTypes3);
        
        assertNull(finalFunctionTypeRegistryNativeTypes4);
        
        assertNull(finalFunctionTypeRegistryNativeTypes5);
        
        assertNull(finalFunctionTypeRegistryNativeTypes6);
        
        assertNull(finalFunctionTypeRegistryNativeTypes7);
        
        assertNull(finalFunctionTypeRegistryNativeTypes8);
        
        assertNull(finalFunctionTypeRegistryNativeTypes9);
        
        assertNull(finalFunctionTypeRegistryNativeTypes10);
        
        assertNull(finalFunctionTypeRegistryNativeTypes11);
        
        assertNull(finalFunctionTypeRegistryNativeTypes12);
        
        assertNull(finalFunctionTypeRegistryNativeTypes13);
        
        assertNull(finalFunctionTypeRegistryNativeTypes14);
        
        assertNull(finalFunctionTypeRegistryNativeTypes15);
        
        assertNull(finalFunctionTypeRegistryNativeTypes16);
        
        assertNull(finalFunctionTypeRegistryNativeTypes17);
        
        assertNull(finalFunctionTypeRegistryNativeTypes18);
        
        assertNull(finalFunctionTypeRegistryNativeTypes19);
        
        assertNull(finalFunctionTypeRegistryNativeTypes20);
        
        assertNull(finalFunctionTypeRegistryNativeTypes21);
        
        assertNull(finalFunctionTypeRegistryNativeTypes22);
        
        assertNull(finalFunctionTypeRegistryNativeTypes23);
        
        assertNull(finalFunctionTypeRegistryNativeTypes24);
    }
    
    @Test
    public void testHasUnknownSupertype5() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        boolean actual = functionType.hasUnknownSupertype();
        
        assertFalse(actual);
        
        boolean finalFunctionTypeUnknown = ((Boolean) getFieldValue(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        
        assertFalse(finalFunctionTypeUnknown);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method hasUnknownSupertype()
    
    @Test(expected = IllegalArgumentException.class)
    public void testHasUnknownSupertype6() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        UnresolvedTypeExpression implicitPrototypeFallback = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        functionType.hasUnknownSupertype();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testHasUnknownSupertype7() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        UnresolvedTypeExpression implicitPrototypeFallback = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        functionType.hasUnknownSupertype();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hasUnknownSupertype()
    
    @Test
    public void testHasUnknownSupertype8() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        VoidType voidType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        nativeTypes[19] = ((JSType) voidType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.VoidType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.VoidType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:778)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:117)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:261)
            com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype(FunctionType.java:617) */
        functionType.hasUnknownSupertype();
    }
    
    @Test
    public void testHasUnknownSupertype9() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null, null, null, null, null, null, null, null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 9]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:774)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:778)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:117)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:261)
            com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype(FunctionType.java:617) */
        functionType.hasUnknownSupertype();
    }
    
    @Test
    public void testHasUnknownSupertype10() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionPrototypeType implicitPrototypeFallback = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:117)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:261)
            com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype(FunctionType.java:617) */
        functionType.hasUnknownSupertype();
    }
    
    @Test
    public void testHasUnknownSupertype11() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:117)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:261)
            com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype(FunctionType.java:617) */
        functionType.hasUnknownSupertype();
    }
    
    @Test
    public void testHasUnknownSupertype12() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionPrototypeType implicitPrototypeFallback = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:117)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:261)
            com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype(FunctionType.java:617) */
        functionType.hasUnknownSupertype();
    }
    
    @Test
    public void testHasUnknownSupertype13() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:774)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:778)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:117)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:261)
            com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype(FunctionType.java:617) */
        functionType.hasUnknownSupertype();
    }
    
    @Test
    public void testHasUnknownSupertype14() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoType implicitPrototypeFallback = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:117)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:261)
            com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype(FunctionType.java:617) */
        functionType.hasUnknownSupertype();
    }
    
    @Test
    public void testHasUnknownSupertype15() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:117)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:261)
            com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype(FunctionType.java:617) */
        functionType.hasUnknownSupertype();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.addRelatedInterfaces
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addRelatedInterfaces(com.google.javascript.rhino.jstype.ObjectType, java.util.Set)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#addRelatedInterfaces(com.google.javascript.rhino.jstype.ObjectType,java.util.Set)}
 *  */
    @Test
    public void testAddRelatedInterfaces() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class setType = Class.forName("java.util.Set");
        Method addRelatedInterfacesMethod = functionTypeClazz.getDeclaredMethod("addRelatedInterfaces", noObjectTypeType, setType);
        addRelatedInterfacesMethod.setAccessible(true);
        java.lang.Object[] addRelatedInterfacesMethodArguments = new java.lang.Object[2];
        addRelatedInterfacesMethodArguments[0] = noObjectType;
        addRelatedInterfacesMethodArguments[1] = ((Object) null);
        addRelatedInterfacesMethod.invoke(functionType, addRelatedInterfacesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#addRelatedInterfaces(com.google.javascript.rhino.jstype.ObjectType,java.util.Set)}
 *  */
    @Test
    public void testAddRelatedInterfaces_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class functionType1Type = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class setType = Class.forName("java.util.Set");
        Method addRelatedInterfacesMethod = functionTypeClazz.getDeclaredMethod("addRelatedInterfaces", functionType1Type, setType);
        addRelatedInterfacesMethod.setAccessible(true);
        java.lang.Object[] addRelatedInterfacesMethodArguments = new java.lang.Object[2];
        addRelatedInterfacesMethodArguments[0] = functionType1;
        addRelatedInterfacesMethodArguments[1] = ((Object) null);
        addRelatedInterfacesMethod.invoke(functionType, addRelatedInterfacesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#addRelatedInterfaces(com.google.javascript.rhino.jstype.ObjectType,java.util.Set)}
 *  */
    @Test
    public void testAddRelatedInterfaces_4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoType referencedObjType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class setType = Class.forName("java.util.Set");
        Method addRelatedInterfacesMethod = functionTypeClazz.getDeclaredMethod("addRelatedInterfaces", templateTypeType, setType);
        addRelatedInterfacesMethod.setAccessible(true);
        java.lang.Object[] addRelatedInterfacesMethodArguments = new java.lang.Object[2];
        addRelatedInterfacesMethodArguments[0] = templateType;
        addRelatedInterfacesMethodArguments[1] = ((Object) null);
        addRelatedInterfacesMethod.invoke(functionType, addRelatedInterfacesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#addRelatedInterfaces(com.google.javascript.rhino.jstype.ObjectType,java.util.Set)}
 *  */
    @Test
    public void testAddRelatedInterfaces_5() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        FunctionType referencedObjType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class setType = Class.forName("java.util.Set");
        Method addRelatedInterfacesMethod = functionTypeClazz.getDeclaredMethod("addRelatedInterfaces", templateTypeType, setType);
        addRelatedInterfacesMethod.setAccessible(true);
        java.lang.Object[] addRelatedInterfacesMethodArguments = new java.lang.Object[2];
        addRelatedInterfacesMethodArguments[0] = templateType;
        addRelatedInterfacesMethodArguments[1] = ((Object) null);
        addRelatedInterfacesMethod.invoke(functionType, addRelatedInterfacesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#addRelatedInterfaces(com.google.javascript.rhino.jstype.ObjectType,java.util.Set)}
 *  */
    @Test
    public void testAddRelatedInterfaces_6() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedObjType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class setType = Class.forName("java.util.Set");
        Method addRelatedInterfacesMethod = functionTypeClazz.getDeclaredMethod("addRelatedInterfaces", templateTypeType, setType);
        addRelatedInterfacesMethod.setAccessible(true);
        java.lang.Object[] addRelatedInterfacesMethodArguments = new java.lang.Object[2];
        addRelatedInterfacesMethodArguments[0] = templateType;
        addRelatedInterfacesMethodArguments[1] = ((Object) null);
        addRelatedInterfacesMethod.invoke(functionType, addRelatedInterfacesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#addRelatedInterfaces(com.google.javascript.rhino.jstype.ObjectType,java.util.Set)}
 *  */
    @Test
    public void testAddRelatedInterfaces_3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class setType = Class.forName("java.util.Set");
        Method addRelatedInterfacesMethod = functionTypeClazz.getDeclaredMethod("addRelatedInterfaces", templateTypeType, setType);
        addRelatedInterfacesMethod.setAccessible(true);
        java.lang.Object[] addRelatedInterfacesMethodArguments = new java.lang.Object[2];
        addRelatedInterfacesMethodArguments[0] = templateType;
        addRelatedInterfacesMethodArguments[1] = ((Object) null);
        addRelatedInterfacesMethod.invoke(functionType, addRelatedInterfacesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#addRelatedInterfaces(com.google.javascript.rhino.jstype.ObjectType,java.util.Set)}
 *  */
    @Test
    public void testAddRelatedInterfaces_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        UnknownType unknownType = new UnknownType(null, false);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class unknownTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class setType = Class.forName("java.util.Set");
        Method addRelatedInterfacesMethod = functionTypeClazz.getDeclaredMethod("addRelatedInterfaces", unknownTypeType, setType);
        addRelatedInterfacesMethod.setAccessible(true);
        java.lang.Object[] addRelatedInterfacesMethodArguments = new java.lang.Object[2];
        addRelatedInterfacesMethodArguments[0] = unknownType;
        addRelatedInterfacesMethodArguments[1] = ((Object) null);
        addRelatedInterfacesMethod.invoke(functionType, addRelatedInterfacesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#addRelatedInterfaces(com.google.javascript.rhino.jstype.ObjectType,java.util.Set)}
 *  */
    @Test
    public void testAddRelatedInterfaces_7() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class setType = Class.forName("java.util.Set");
        Method addRelatedInterfacesMethod = functionTypeClazz.getDeclaredMethod("addRelatedInterfaces", templateTypeType, setType);
        addRelatedInterfacesMethod.setAccessible(true);
        java.lang.Object[] addRelatedInterfacesMethodArguments = new java.lang.Object[2];
        addRelatedInterfacesMethodArguments[0] = templateType;
        addRelatedInterfacesMethodArguments[1] = ((Object) null);
        addRelatedInterfacesMethod.invoke(functionType, addRelatedInterfacesMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addRelatedInterfaces(com.google.javascript.rhino.jstype.ObjectType, java.util.Set)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#addRelatedInterfaces(com.google.javascript.rhino.jstype.ObjectType,java.util.Set)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#getConstructor()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FunctionType constructor = instance.getConstructor();
 *  */
    @Test
    public void testAddRelatedInterfaces_ThrowNullPointerException() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.addRelatedInterfaces] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.addRelatedInterfaces(FunctionType.java:323) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class setType = Class.forName("java.util.Set");
        Method addRelatedInterfacesMethod = functionTypeClazz.getDeclaredMethod("addRelatedInterfaces", objectTypeType, setType);
        addRelatedInterfacesMethod.setAccessible(true);
        java.lang.Object[] addRelatedInterfacesMethodArguments = new java.lang.Object[2];
        addRelatedInterfacesMethodArguments[0] = ((Object) null);
        addRelatedInterfacesMethodArguments[1] = ((Object) null);
        try {
            addRelatedInterfacesMethod.invoke(functionType, addRelatedInterfacesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addRelatedInterfaces(com.google.javascript.rhino.jstype.ObjectType, java.util.Set)
    
    @Test
    public void testAddRelatedInterfaces1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NamedType referencedObjType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class setType = Class.forName("java.util.Set");
        Method addRelatedInterfacesMethod = functionTypeClazz.getDeclaredMethod("addRelatedInterfaces", templateTypeType, setType);
        addRelatedInterfacesMethod.setAccessible(true);
        java.lang.Object[] addRelatedInterfacesMethodArguments = new java.lang.Object[2];
        addRelatedInterfacesMethodArguments[0] = templateType;
        addRelatedInterfacesMethodArguments[1] = ((Object) null);
        addRelatedInterfacesMethod.invoke(functionType, addRelatedInterfacesMethodArguments);
    }
    
    @Test
    public void testAddRelatedInterfaces2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedObjType5, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType6);
        setField(referencedObjType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType5);
        setField(referencedObjType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType4);
        setField(referencedObjType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType3);
        setField(referencedObjType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType2);
        setField(referencedObjType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class setType = Class.forName("java.util.Set");
        Method addRelatedInterfacesMethod = functionTypeClazz.getDeclaredMethod("addRelatedInterfaces", templateTypeType, setType);
        addRelatedInterfacesMethod.setAccessible(true);
        java.lang.Object[] addRelatedInterfacesMethodArguments = new java.lang.Object[2];
        addRelatedInterfacesMethodArguments[0] = templateType;
        addRelatedInterfacesMethodArguments[1] = ((Object) null);
        addRelatedInterfacesMethod.invoke(functionType, addRelatedInterfacesMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addRelatedInterfaces(com.google.javascript.rhino.jstype.ObjectType, java.util.Set)
    
    @Test(expected = StackOverflowError.class)
    public void testAddRelatedInterfaces3() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedObjType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class setType = Class.forName("java.util.Set");
        Method addRelatedInterfacesMethod = functionTypeClazz.getDeclaredMethod("addRelatedInterfaces", templateTypeType, setType);
        addRelatedInterfacesMethod.setAccessible(true);
        java.lang.Object[] addRelatedInterfacesMethodArguments = new java.lang.Object[2];
        addRelatedInterfacesMethodArguments[0] = templateType;
        addRelatedInterfacesMethodArguments[1] = ((Object) null);
        try {
            addRelatedInterfacesMethod.invoke(functionType, addRelatedInterfacesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAllImplementedInterfaces()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getAllImplementedInterfaces()}
 * @utbot.invokes {@link com.google.common.collect.Sets#newLinkedHashSet()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getImplementedInterfaces()}
 * @utbot.invokes {@link java.lang.Iterable#iterator()}
 * @utbot.returnsFrom {@code return interfaces;}
 *  */
    @Test
    public void testGetAllImplementedInterfaces_IterableIterator() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        ArrayList implementedInterfaces = new ArrayList();
        functionType.setImplementedInterfaces(implementedInterfaces);
        
        LinkedHashSet actual = ((LinkedHashSet) functionType.getAllImplementedInterfaces());
        
        LinkedHashSet expected = new LinkedHashSet();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getAllImplementedInterfaces()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getAllImplementedInterfaces()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(ObjectType type: getImplementedInterfaces())
 *  */
    @Test
    public void testGetAllImplementedInterfaces_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces(FunctionType.java:316) */
        functionType.getAllImplementedInterfaces();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getAllImplementedInterfaces()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(ObjectType type: getImplementedInterfaces())
 *  */
    @Test
    public void testGetAllImplementedInterfaces_ThrowNullPointerException_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        NoType implicitPrototypeFallback = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(prototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces(FunctionType.java:316) */
        functionType.getAllImplementedInterfaces();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getAllImplementedInterfaces()
    
    @Test
    public void testGetAllImplementedInterfaces1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        NumberType numberType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        nativeTypes[19] = ((JSType) numberType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.NumberType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.NumberType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:778)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:117)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:261)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:598)
            com.google.javascript.rhino.jstype.FunctionType.getImplementedInterfaces(FunctionType.java:341)
            com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces(FunctionType.java:316) */
        functionType.getAllImplementedInterfaces();
    }
    
    @Test
    public void testGetAllImplementedInterfaces2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null, null, null, null, null, null, null, null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 9]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:774)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:778)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:117)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:261)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:598)
            com.google.javascript.rhino.jstype.FunctionType.getImplementedInterfaces(FunctionType.java:341)
            com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces(FunctionType.java:316) */
        functionType.getAllImplementedInterfaces();
    }
    
    @Test
    public void testGetAllImplementedInterfaces3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        NamedType implicitPrototypeFallback = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        setField(prototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces(FunctionType.java:316) */
        functionType.getAllImplementedInterfaces();
    }
    
    @Test
    public void testGetAllImplementedInterfaces4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces(FunctionType.java:316) */
        functionType.getAllImplementedInterfaces();
    }
    
    @Test
    public void testGetAllImplementedInterfaces5() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        ArrayList implementedInterfaces = new ArrayList();
        implementedInterfaces.add(null);
        implementedInterfaces.add(null);
        implementedInterfaces.add(null);
        functionType.setImplementedInterfaces(implementedInterfaces);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:117)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:261)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:598)
            com.google.javascript.rhino.jstype.FunctionType.getImplementedInterfaces(FunctionType.java:341)
            com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces(FunctionType.java:316) */
        functionType.getAllImplementedInterfaces();
    }
    
    @Test
    public void testGetAllImplementedInterfaces6() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(prototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        ArrayList implementedInterfaces = new ArrayList();
        implementedInterfaces.add(null);
        implementedInterfaces.add(null);
        implementedInterfaces.add(null);
        functionType.setImplementedInterfaces(implementedInterfaces);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.addRelatedInterfaces(FunctionType.java:323)
            com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces(FunctionType.java:317) */
        functionType.getAllImplementedInterfaces();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSuperClassConstructor()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getSuperClassConstructor()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isInterface()}
 * @utbot.returnsFrom {@code return maybeSuperInstanceType.getConstructor();}
 *  */
    @Test
    public void testGetSuperClassConstructor_FunctionTypeIsInterface() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        NoObjectType implicitPrototypeFallback = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(prototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        FunctionType actual = functionType.getSuperClassConstructor();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getSuperClassConstructor()}
 * @utbot.returnsFrom {@code return maybeSuperInstanceType.getConstructor();}
 *  */
    @Test
    public void testGetSuperClassConstructor_ReturnMaybeSuperInstanceTypeGetConstructor() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(prototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        FunctionType actual = functionType.getSuperClassConstructor();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getSuperClassConstructor()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetSuperClassConstructor_ReturnNull() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        FunctionType actual = functionType.getSuperClassConstructor();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getSuperClassConstructor()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getSuperClassConstructor()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isConstructor()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isInterface()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkArgument(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(isConstructor() || isInterface());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetSuperClassConstructor_ThrowIllegalArgumentException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        functionType.getSuperClassConstructor();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getSuperClassConstructor()
    
    @Test
    public void testGetSuperClassConstructor1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
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
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        FunctionType actual = functionType.getSuperClassConstructor();
        
        assertNull(actual);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        JSTypeRegistry jSTypeRegistry = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes19 = ((JSType) get(jSTypeRegistryRegistryNativeTypes, 19));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
        
        assertNull(finalFunctionTypeRegistryNativeTypes19);
    }
    
    @Test
    public void testGetSuperClassConstructor2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
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
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        FunctionType actual = functionType.getSuperClassConstructor();
        
        assertNull(actual);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        JSTypeRegistry jSTypeRegistry = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes19 = ((JSType) get(jSTypeRegistryRegistryNativeTypes, 19));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
        
        assertNull(finalFunctionTypeRegistryNativeTypes19);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getSuperClassConstructor()
    
    @Test
    public void testGetSuperClassConstructor3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
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
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        nativeTypes[19] = ((JSType) arrowType);
        nativeTypes[20] = ((JSType) templateType);
        nativeTypes[21] = ((JSType) templateType);
        nativeTypes[22] = ((JSType) templateType);
        nativeTypes[23] = ((JSType) templateType);
        nativeTypes[24] = ((JSType) templateType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.ArrowType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.ArrowType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:778)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:117)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:261)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:598) */
        functionType.getSuperClassConstructor();
    }
    
    @Test
    public void testGetSuperClassConstructor4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null, null, null, null, null, null, null, null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 9]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:774)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:778)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:117)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:261)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:598) */
        functionType.getSuperClassConstructor();
    }
    
    @Test
    public void testGetSuperClassConstructor5() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null, null, null, null, null, null, null, null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 9]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:774)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:778)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:117)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:261)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:598) */
        functionType.getSuperClassConstructor();
    }
    
    @Test
    public void testGetSuperClassConstructor6() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        AllType allType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        nativeTypes[19] = ((JSType) allType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.AllType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.AllType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:778)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:117)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:261)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:598) */
        functionType.getSuperClassConstructor();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getDebugHashCodeStringOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDebugHashCodeStringOf(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getDebugHashCodeStringOf(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type): True}
 * @utbot.returnsFrom {@code return "me";}
 *  */
    @Test
    public void testGetDebugHashCodeStringOf_Type() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method getDebugHashCodeStringOfMethod = functionTypeClazz.getDeclaredMethod("getDebugHashCodeStringOf", functionTypeType);
        getDebugHashCodeStringOfMethod.setAccessible(true);
        java.lang.Object[] getDebugHashCodeStringOfMethodArguments = new java.lang.Object[1];
        getDebugHashCodeStringOfMethodArguments[0] = functionType;
        String actual = ((String) getDebugHashCodeStringOfMethod.invoke(functionType, getDebugHashCodeStringOfMethodArguments));
        
        String expected = "me";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDebugHashCodeStringOf(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getDebugHashCodeStringOf(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#toDebugHashCodeString()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return type.toDebugHashCodeString();
 *  */
    @Test
    public void testGetDebugHashCodeStringOf_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(noObjectType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getDebugHashCodeStringOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:774)
            com.google.javascript.rhino.jstype.FunctionType.toDebugHashCodeString(FunctionType.java:907)
            com.google.javascript.rhino.jstype.FunctionType.getDebugHashCodeStringOf(FunctionType.java:942) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method getDebugHashCodeStringOfMethod = functionTypeClazz.getDeclaredMethod("getDebugHashCodeStringOf", noObjectTypeType);
        getDebugHashCodeStringOfMethod.setAccessible(true);
        java.lang.Object[] getDebugHashCodeStringOfMethodArguments = new java.lang.Object[1];
        getDebugHashCodeStringOfMethodArguments[0] = noObjectType;
        try {
            getDebugHashCodeStringOfMethod.invoke(functionType, getDebugHashCodeStringOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getDebugHashCodeStringOf(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return type.toDebugHashCodeString();
 *  */
    @Test
    public void testGetDebugHashCodeStringOf_ThrowNullPointerException() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getDebugHashCodeStringOf] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getDebugHashCodeStringOf(FunctionType.java:942) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method getDebugHashCodeStringOfMethod = functionTypeClazz.getDeclaredMethod("getDebugHashCodeStringOf", jSTypeType);
        getDebugHashCodeStringOfMethod.setAccessible(true);
        java.lang.Object[] getDebugHashCodeStringOfMethodArguments = new java.lang.Object[1];
        getDebugHashCodeStringOfMethodArguments[0] = ((Object) null);
        try {
            getDebugHashCodeStringOfMethod.invoke(functionType, getDebugHashCodeStringOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDebugHashCodeStringOf(com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testGetDebugHashCodeStringOf1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        BooleanType booleanType = new BooleanType(null);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method getDebugHashCodeStringOfMethod = functionTypeClazz.getDeclaredMethod("getDebugHashCodeStringOf", booleanTypeType);
        getDebugHashCodeStringOfMethod.setAccessible(true);
        java.lang.Object[] getDebugHashCodeStringOfMethodArguments = new java.lang.Object[1];
        getDebugHashCodeStringOfMethodArguments[0] = booleanType;
        String actual = ((String) getDebugHashCodeStringOfMethod.invoke(functionType, getDebugHashCodeStringOfMethodArguments));
        
        String expected = "{1673782281}";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDebugHashCodeStringOf(com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testGetDebugHashCodeStringOf2() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoObjectType referencedType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null, null, null, null, null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(referencedType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        templateType.setReferencedType(referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getDebugHashCodeStringOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 6]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:774)
            com.google.javascript.rhino.jstype.FunctionType.toDebugHashCodeString(FunctionType.java:907)
            com.google.javascript.rhino.jstype.ProxyObjectType.toDebugHashCodeString(ProxyObjectType.java:336)
            com.google.javascript.rhino.jstype.TemplateType.toDebugHashCodeString(TemplateType.java:48)
            com.google.javascript.rhino.jstype.FunctionType.getDebugHashCodeStringOf(FunctionType.java:942) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method getDebugHashCodeStringOfMethod = functionTypeClazz.getDeclaredMethod("getDebugHashCodeStringOf", templateTypeType);
        getDebugHashCodeStringOfMethod.setAccessible(true);
        java.lang.Object[] getDebugHashCodeStringOfMethodArguments = new java.lang.Object[1];
        getDebugHashCodeStringOfMethodArguments[0] = templateType;
        try {
            getDebugHashCodeStringOfMethod.invoke(functionType, getDebugHashCodeStringOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetDebugHashCodeStringOf3() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        templateType.setReferencedType(referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getDebugHashCodeStringOf] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.toDebugHashCodeString(ProxyObjectType.java:336)
            com.google.javascript.rhino.jstype.TemplateType.toDebugHashCodeString(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.toDebugHashCodeString(ProxyObjectType.java:336)
            com.google.javascript.rhino.jstype.TemplateType.toDebugHashCodeString(TemplateType.java:48)
            com.google.javascript.rhino.jstype.FunctionType.getDebugHashCodeStringOf(FunctionType.java:942) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method getDebugHashCodeStringOfMethod = functionTypeClazz.getDeclaredMethod("getDebugHashCodeStringOf", templateTypeType);
        getDebugHashCodeStringOfMethod.setAccessible(true);
        java.lang.Object[] getDebugHashCodeStringOfMethodArguments = new java.lang.Object[1];
        getDebugHashCodeStringOfMethodArguments[0] = templateType;
        try {
            getDebugHashCodeStringOfMethod.invoke(functionType, getDebugHashCodeStringOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetDebugHashCodeStringOf4() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[22];
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
        IndexedType indexedType = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        nativeTypes[13] = ((JSType) indexedType);
        nativeTypes[14] = ((JSType) templateType);
        nativeTypes[15] = ((JSType) templateType);
        nativeTypes[16] = ((JSType) templateType);
        nativeTypes[17] = ((JSType) templateType);
        nativeTypes[18] = ((JSType) templateType);
        nativeTypes[19] = ((JSType) templateType);
        nativeTypes[20] = ((JSType) templateType);
        nativeTypes[21] = ((JSType) templateType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getDebugHashCodeStringOf] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.toDebugHashCodeString(FunctionType.java:913)
            com.google.javascript.rhino.jstype.FunctionType.getDebugHashCodeStringOf(FunctionType.java:942) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class errorFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method getDebugHashCodeStringOfMethod = functionTypeClazz.getDeclaredMethod("getDebugHashCodeStringOf", errorFunctionTypeType);
        getDebugHashCodeStringOfMethod.setAccessible(true);
        java.lang.Object[] getDebugHashCodeStringOfMethodArguments = new java.lang.Object[1];
        getDebugHashCodeStringOfMethodArguments[0] = errorFunctionType;
        try {
            getDebugHashCodeStringOfMethod.invoke(functionType, getDebugHashCodeStringOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetDebugHashCodeStringOf5() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ErrorFunctionType referencedType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(referencedType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        templateType.setReferencedType(referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getDebugHashCodeStringOf] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.toDebugHashCodeString(FunctionType.java:913)
            com.google.javascript.rhino.jstype.ProxyObjectType.toDebugHashCodeString(ProxyObjectType.java:336)
            com.google.javascript.rhino.jstype.TemplateType.toDebugHashCodeString(TemplateType.java:48)
            com.google.javascript.rhino.jstype.FunctionType.getDebugHashCodeStringOf(FunctionType.java:942) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method getDebugHashCodeStringOfMethod = functionTypeClazz.getDeclaredMethod("getDebugHashCodeStringOf", templateTypeType);
        getDebugHashCodeStringOfMethod.setAccessible(true);
        java.lang.Object[] getDebugHashCodeStringOfMethodArguments = new java.lang.Object[1];
        getDebugHashCodeStringOfMethodArguments[0] = templateType;
        try {
            getDebugHashCodeStringOfMethod.invoke(functionType, getDebugHashCodeStringOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getTemplateTypeName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTemplateTypeName()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getTemplateTypeName()}
 * @utbot.returnsFrom {@code return templateTypeName;}
 *  */
    @Test
    public void testGetTemplateTypeName_ReturnTemplateTypeName() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        String actual = functionType.getTemplateTypeName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getInternalArrowType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInternalArrowType()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getInternalArrowType()}
 * @utbot.returnsFrom {@code return call;}
 *  */
    @Test
    public void testGetInternalArrowType_ReturnCall() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        ArrowType actual = functionType.getInternalArrowType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryMergeFunctionPiecewise(com.google.javascript.rhino.jstype.FunctionType, boolean)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#tryMergeFunctionPiecewise(com.google.javascript.rhino.jstype.FunctionType,boolean)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testTryMergeFunctionPiecewise_ReturnNull() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = noType;
        tryMergeFunctionPiecewiseMethodArguments[1] = false;
        FunctionType actual = ((FunctionType) tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#tryMergeFunctionPiecewise(com.google.javascript.rhino.jstype.FunctionType,boolean)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testTryMergeFunctionPiecewise_ReturnNull_3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ErrorFunctionType jsType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        EnumType jsType1 = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = functionType1;
        tryMergeFunctionPiecewiseMethodArguments[1] = false;
        FunctionType actual = ((FunctionType) tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#tryMergeFunctionPiecewise(com.google.javascript.rhino.jstype.FunctionType,boolean)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testTryMergeFunctionPiecewise_ReturnNull_5() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ErrorFunctionType jsType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        NoType jsType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = noObjectType;
        tryMergeFunctionPiecewiseMethodArguments[1] = false;
        FunctionType actual = ((FunctionType) tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#tryMergeFunctionPiecewise(com.google.javascript.rhino.jstype.FunctionType,boolean)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testTryMergeFunctionPiecewise_ReturnNull_8() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        NoObjectType jsType1 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = noObjectType;
        tryMergeFunctionPiecewiseMethodArguments[1] = false;
        FunctionType actual = ((FunctionType) tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#tryMergeFunctionPiecewise(com.google.javascript.rhino.jstype.FunctionType,boolean)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testTryMergeFunctionPiecewise_ReturnNull_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", first);
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = noObjectType;
        tryMergeFunctionPiecewiseMethodArguments[1] = false;
        FunctionType actual = ((FunctionType) tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#tryMergeFunctionPiecewise(com.google.javascript.rhino.jstype.FunctionType,boolean)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testTryMergeFunctionPiecewise_ReturnNull_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        NoObjectType jsType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = noObjectType;
        tryMergeFunctionPiecewiseMethodArguments[1] = false;
        FunctionType actual = ((FunctionType) tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#tryMergeFunctionPiecewise(com.google.javascript.rhino.jstype.FunctionType,boolean)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testTryMergeFunctionPiecewise_ReturnNull_6() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionType jsType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object kind1 = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(jsType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = noType;
        tryMergeFunctionPiecewiseMethodArguments[1] = false;
        FunctionType actual = ((FunctionType) tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#tryMergeFunctionPiecewise(com.google.javascript.rhino.jstype.FunctionType,boolean)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testTryMergeFunctionPiecewise_ReturnNull_7() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ErrorFunctionType jsType1 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(jsType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = noObjectType;
        tryMergeFunctionPiecewiseMethodArguments[1] = false;
        FunctionType actual = ((FunctionType) tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#tryMergeFunctionPiecewise(com.google.javascript.rhino.jstype.FunctionType,boolean)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testTryMergeFunctionPiecewise_ReturnNull_4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        NoObjectType jsType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first1, "com.google.javascript.rhino.Node", "next", first1);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = noObjectType;
        tryMergeFunctionPiecewiseMethodArguments[1] = false;
        FunctionType actual = ((FunctionType) tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryMergeFunctionPiecewise(com.google.javascript.rhino.jstype.FunctionType, boolean)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#tryMergeFunctionPiecewise(com.google.javascript.rhino.jstype.FunctionType,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: call.hasEqualParameters(other.call)
 *  */
    @Test
    public void testTryMergeFunctionPiecewise_ThrowNullPointerException() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(FunctionType.java:554) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = ((Object) null);
        tryMergeFunctionPiecewiseMethodArguments[1] = false;
        try {
            tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#tryMergeFunctionPiecewise(com.google.javascript.rhino.jstype.FunctionType,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: call.hasEqualParameters(other.call)
 *  */
    @Test
    public void testTryMergeFunctionPiecewise_ThrowNullPointerException_1() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(FunctionType.java:554) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = noType;
        tryMergeFunctionPiecewiseMethodArguments[1] = false;
        try {
            tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#tryMergeFunctionPiecewise(com.google.javascript.rhino.jstype.FunctionType,boolean)}
 * @utbot.executesCondition {@code (leastSuper): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: call.returnType.getLeastSupertype(other.call.returnType)
 *  */
    @Test
    public void testTryMergeFunctionPiecewise_ThrowNullPointerException_2() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(FunctionType.java:563) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = noType;
        tryMergeFunctionPiecewiseMethodArguments[1] = true;
        try {
            tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#tryMergeFunctionPiecewise(com.google.javascript.rhino.jstype.FunctionType,boolean)}
 * @utbot.executesCondition {@code (leastSuper): True}
 * @utbot.executesCondition {@code (leastSuper): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: typeOfThis.getLeastSupertype(other.typeOfThis)
 *  */
    @Test
    public void testTryMergeFunctionPiecewise_ThrowNullPointerException_3() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnresolvedTypeExpression returnType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(FunctionType.java:571) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = noType;
        tryMergeFunctionPiecewiseMethodArguments[1] = true;
        try {
            tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#tryMergeFunctionPiecewise(com.google.javascript.rhino.jstype.FunctionType,boolean)}
 * @utbot.executesCondition {@code (leastSuper): True}
 * @utbot.executesCondition {@code (leastSuper): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#getLeastSupertype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: typeOfThis.getLeastSupertype(other.typeOfThis)
 *  */
    @Test
    public void testTryMergeFunctionPiecewise_ThrowNullPointerException_4() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnresolvedTypeExpression returnType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        ErrorFunctionType typeOfThis = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:483)
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:453)
            com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(FunctionType.java:571) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = noObjectType;
        tryMergeFunctionPiecewiseMethodArguments[1] = true;
        try {
            tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tryMergeFunctionPiecewise(com.google.javascript.rhino.jstype.FunctionType, boolean)
    
    @Test
    public void testTryMergeFunctionPiecewise1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        FunctionType jsType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = errorFunctionType;
        tryMergeFunctionPiecewiseMethodArguments[1] = false;
        FunctionType actual = ((FunctionType) tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testTryMergeFunctionPiecewise2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(next, "com.google.javascript.rhino.Node", "first", next);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", next);
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = noObjectType;
        tryMergeFunctionPiecewiseMethodArguments[1] = false;
        FunctionType actual = ((FunctionType) tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tryMergeFunctionPiecewise(com.google.javascript.rhino.jstype.FunctionType, boolean)
    
    @Test
    public void testTryMergeFunctionPiecewise3() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        RecordType jsType1 = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isEquivalentTo(ProxyObjectType.java:191)
            com.google.javascript.rhino.jstype.TemplateType.isEquivalentTo(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ArrowType.hasEqualParameters(ArrowType.java:155)
            com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(FunctionType.java:554) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = errorFunctionType;
        tryMergeFunctionPiecewiseMethodArguments[1] = false;
        try {
            tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMergeFunctionPiecewise4() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(FunctionType.java:564) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = functionType1;
        tryMergeFunctionPiecewiseMethodArguments[1] = false;
        try {
            tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMergeFunctionPiecewise5() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        NoObjectType returnType1 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.visit(FunctionType.java:785)
            com.google.javascript.rhino.jstype.NoObjectType.getGreatestSubtype(NoObjectType.java:247)
            com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(JSType.java:595)
            com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(JSType.java:584)
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:544)
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:458)
            com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(FunctionType.java:564) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = errorFunctionType;
        tryMergeFunctionPiecewiseMethodArguments[1] = false;
        try {
            tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMergeFunctionPiecewise6() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        NoType returnType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:126)
            com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(FunctionType.java:585) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = noType;
        tryMergeFunctionPiecewiseMethodArguments[1] = true;
        try {
            tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMergeFunctionPiecewise7() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        NoType returnType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:126)
            com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(FunctionType.java:585) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = errorFunctionType;
        tryMergeFunctionPiecewiseMethodArguments[1] = false;
        try {
            tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMergeFunctionPiecewise8() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(FunctionType.java:564) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = errorFunctionType;
        tryMergeFunctionPiecewiseMethodArguments[1] = false;
        try {
            tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMergeFunctionPiecewise9() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        FunctionType returnType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(returnType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:521)
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:458)
            com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(FunctionType.java:564) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = errorFunctionType;
        tryMergeFunctionPiecewiseMethodArguments[1] = false;
        try {
            tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMergeFunctionPiecewise10() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:126)
            com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(FunctionType.java:585) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = noObjectType;
        tryMergeFunctionPiecewiseMethodArguments[1] = true;
        try {
            tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMergeFunctionPiecewise11() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:126)
            com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(FunctionType.java:585) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = anonymousFunctionType;
        tryMergeFunctionPiecewiseMethodArguments[1] = false;
        try {
            tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMergeFunctionPiecewise12() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        FunctionType returnType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:521)
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:453)
            com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(FunctionType.java:563) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = errorFunctionType;
        tryMergeFunctionPiecewiseMethodArguments[1] = true;
        try {
            tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMergeFunctionPiecewise13() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnresolvedTypeExpression returnType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        NoObjectType typeOfThis1 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.visit(FunctionType.java:785)
            com.google.javascript.rhino.jstype.NoObjectType.getLeastSupertype(NoObjectType.java:242)
            com.google.javascript.rhino.jstype.JSType.getLeastSupertype(JSType.java:561)
            com.google.javascript.rhino.jstype.JSType.getLeastSupertype(JSType.java:550)
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:543)
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:453)
            com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(FunctionType.java:571) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = noType;
        tryMergeFunctionPiecewiseMethodArguments[1] = true;
        try {
            tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMergeFunctionPiecewise14() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnresolvedTypeExpression returnType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        EnumType typeOfThis1 = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getLeastSupertype(JSType.java:564)
            com.google.javascript.rhino.jstype.JSType.getLeastSupertype(JSType.java:550)
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:543)
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:453)
            com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(FunctionType.java:571) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = noType;
        tryMergeFunctionPiecewiseMethodArguments[1] = true;
        try {
            tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMergeFunctionPiecewise15() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnresolvedTypeExpression returnType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        UnknownType typeOfThis1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:126)
            com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(FunctionType.java:585) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = noType;
        tryMergeFunctionPiecewiseMethodArguments[1] = true;
        try {
            tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMergeFunctionPiecewise16() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnresolvedTypeExpression returnType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        UnknownType typeOfThis = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        EnumType typeOfThis1 = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:126)
            com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(FunctionType.java:585) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = noType;
        tryMergeFunctionPiecewiseMethodArguments[1] = true;
        try {
            tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMergeFunctionPiecewise17() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        FunctionType returnType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(returnType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo(FunctionType.java:670)
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:484)
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:453)
            com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(FunctionType.java:563) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = errorFunctionType;
        tryMergeFunctionPiecewiseMethodArguments[1] = true;
        try {
            tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMergeFunctionPiecewise18() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(returnType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        FunctionType returnType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(returnType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:521)
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:453)
            com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(FunctionType.java:563) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = functionType1;
        tryMergeFunctionPiecewiseMethodArguments[1] = true;
        try {
            tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMergeFunctionPiecewise19() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnresolvedTypeExpression returnType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        ErrorFunctionType typeOfThis = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(typeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:126)
            com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(FunctionType.java:585) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = errorFunctionType;
        tryMergeFunctionPiecewiseMethodArguments[1] = true;
        try {
            tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMergeFunctionPiecewise20() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        FunctionType returnType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object kind1 = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(returnType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:521)
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:453)
            com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(FunctionType.java:563) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = functionType1;
        tryMergeFunctionPiecewiseMethodArguments[1] = true;
        try {
            tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMergeFunctionPiecewise21() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnresolvedTypeExpression returnType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        FunctionType typeOfThis1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:521)
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:453)
            com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(FunctionType.java:571) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = functionType1;
        tryMergeFunctionPiecewiseMethodArguments[1] = true;
        try {
            tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMergeFunctionPiecewise22() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        ErrorFunctionType returnType1 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:774)
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:521)
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:453)
            com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(FunctionType.java:563) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = functionType1;
        tryMergeFunctionPiecewiseMethodArguments[1] = true;
        try {
            tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMergeFunctionPiecewise23() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        ErrorFunctionType returnType1 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        NoObjectType typeOfThis1 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(returnType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:521)
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:458)
            com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(FunctionType.java:564) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = noType;
        tryMergeFunctionPiecewiseMethodArguments[1] = false;
        try {
            tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMergeFunctionPiecewise24() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnresolvedTypeExpression returnType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnTypeInferred", true);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:126)
            com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(FunctionType.java:585) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = anonymousFunctionType;
        tryMergeFunctionPiecewiseMethodArguments[1] = true;
        try {
            tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMergeFunctionPiecewise25() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call2 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(call2, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        ErrorFunctionType returnType1 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(returnType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(returnType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(call2, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "call", call2);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:521)
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:458)
            com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(FunctionType.java:564) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = noObjectType;
        tryMergeFunctionPiecewiseMethodArguments[1] = false;
        try {
            tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMergeFunctionPiecewise26() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnresolvedTypeExpression returnType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo(FunctionType.java:677)
            com.google.javascript.rhino.jstype.JSType.isEquivalent(JSType.java:315)
            com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(FunctionType.java:567) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = noObjectType;
        tryMergeFunctionPiecewiseMethodArguments[1] = true;
        try {
            tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMergeFunctionPiecewise27() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnresolvedTypeExpression returnType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:126)
            com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(FunctionType.java:585) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class booleanType = boolean.class;
        Method tryMergeFunctionPiecewiseMethod = functionTypeClazz.getDeclaredMethod("tryMergeFunctionPiecewise", functionTypeClazz, booleanType);
        tryMergeFunctionPiecewiseMethod.setAccessible(true);
        java.lang.Object[] tryMergeFunctionPiecewiseMethodArguments = new java.lang.Object[2];
        tryMergeFunctionPiecewiseMethodArguments[0] = functionType1;
        tryMergeFunctionPiecewiseMethodArguments[1] = true;
        try {
            tryMergeFunctionPiecewiseMethod.invoke(functionType, tryMergeFunctionPiecewiseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getImplementedInterfaces
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getImplementedInterfaces()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getImplementedInterfaces()}
 * @utbot.returnsFrom {@code return implementedInterfaces;}
 *  */
    @Test
    public void testGetImplementedInterfaces_ReturnImplementedInterfaces() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        Iterable actual = functionType.getImplementedInterfaces();
        
        assertNull(actual);
        
        List finalFunctionTypeImplementedInterfaces = ((List) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        
        assertNull(finalFunctionTypeImplementedInterfaces);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getImplementedInterfaces()}
 * @utbot.returnsFrom {@code return implementedInterfaces;}
 *  */
    @Test
    public void testGetImplementedInterfaces_ReturnImplementedInterfaces_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        NoType implicitPrototypeFallback = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(prototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        Iterable actual = functionType.getImplementedInterfaces();
        
        assertNull(actual);
        
        List finalFunctionTypeImplementedInterfaces = ((List) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        
        assertNull(finalFunctionTypeImplementedInterfaces);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getImplementedInterfaces()}
 * @utbot.returnsFrom {@code return implementedInterfaces;}
 *  */
    @Test
    public void testGetImplementedInterfaces_ReturnImplementedInterfaces_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(prototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        Iterable actual = functionType.getImplementedInterfaces();
        
        assertNull(actual);
        
        List finalFunctionTypeImplementedInterfaces = ((List) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        
        assertNull(finalFunctionTypeImplementedInterfaces);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getImplementedInterfaces()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getImplementedInterfaces()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testGetImplementedInterfaces_ThrowClassCastException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        NumberType numberType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        nativeTypes[19] = ((JSType) numberType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getImplementedInterfaces] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.NumberType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.NumberType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:778)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:117)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:261)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:598)
            com.google.javascript.rhino.jstype.FunctionType.getImplementedInterfaces(FunctionType.java:341) */
        functionType.getImplementedInterfaces();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getImplementedInterfaces()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetImplementedInterfaces_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getImplementedInterfaces] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:774)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:778)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:117)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:261)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:598)
            com.google.javascript.rhino.jstype.FunctionType.getImplementedInterfaces(FunctionType.java:341) */
        functionType.getImplementedInterfaces();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getImplementedInterfaces()
    
    @Test
    public void testGetImplementedInterfaces1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        Iterable actual = functionType.getImplementedInterfaces();
        
        assertNull(actual);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        JSTypeRegistry jSTypeRegistry = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes13 = ((JSType) get(jSTypeRegistry13RegistryNativeTypes, 13));
        JSTypeRegistry jSTypeRegistry14 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes14 = ((JSType) get(jSTypeRegistry14RegistryNativeTypes, 14));
        JSTypeRegistry jSTypeRegistry15 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry15RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes15 = ((JSType) get(jSTypeRegistry15RegistryNativeTypes, 15));
        JSTypeRegistry jSTypeRegistry16 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry16RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes16 = ((JSType) get(jSTypeRegistry16RegistryNativeTypes, 16));
        JSTypeRegistry jSTypeRegistry17 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry17RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes17 = ((JSType) get(jSTypeRegistry17RegistryNativeTypes, 17));
        JSTypeRegistry jSTypeRegistry18 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry18RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes18 = ((JSType) get(jSTypeRegistry18RegistryNativeTypes, 18));
        JSTypeRegistry jSTypeRegistry19 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry19RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes19 = ((JSType) get(jSTypeRegistry19RegistryNativeTypes, 19));
        JSTypeRegistry jSTypeRegistry20 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry20RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes20 = ((JSType) get(jSTypeRegistry20RegistryNativeTypes, 20));
        JSTypeRegistry jSTypeRegistry21 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry21RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes21 = ((JSType) get(jSTypeRegistry21RegistryNativeTypes, 21));
        JSTypeRegistry jSTypeRegistry22 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry22RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes22 = ((JSType) get(jSTypeRegistry22RegistryNativeTypes, 22));
        JSTypeRegistry jSTypeRegistry23 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry23RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes23 = ((JSType) get(jSTypeRegistry23RegistryNativeTypes, 23));
        JSTypeRegistry jSTypeRegistry24 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry24RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes24 = ((JSType) get(jSTypeRegistry24RegistryNativeTypes, 24));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
        
        assertNull(finalFunctionTypeRegistryNativeTypes0);
        
        assertNull(finalFunctionTypeRegistryNativeTypes1);
        
        assertNull(finalFunctionTypeRegistryNativeTypes2);
        
        assertNull(finalFunctionTypeRegistryNativeTypes3);
        
        assertNull(finalFunctionTypeRegistryNativeTypes4);
        
        assertNull(finalFunctionTypeRegistryNativeTypes5);
        
        assertNull(finalFunctionTypeRegistryNativeTypes6);
        
        assertNull(finalFunctionTypeRegistryNativeTypes7);
        
        assertNull(finalFunctionTypeRegistryNativeTypes8);
        
        assertNull(finalFunctionTypeRegistryNativeTypes9);
        
        assertNull(finalFunctionTypeRegistryNativeTypes10);
        
        assertNull(finalFunctionTypeRegistryNativeTypes11);
        
        assertNull(finalFunctionTypeRegistryNativeTypes12);
        
        assertNull(finalFunctionTypeRegistryNativeTypes13);
        
        assertNull(finalFunctionTypeRegistryNativeTypes14);
        
        assertNull(finalFunctionTypeRegistryNativeTypes15);
        
        assertNull(finalFunctionTypeRegistryNativeTypes16);
        
        assertNull(finalFunctionTypeRegistryNativeTypes17);
        
        assertNull(finalFunctionTypeRegistryNativeTypes18);
        
        assertNull(finalFunctionTypeRegistryNativeTypes19);
        
        assertNull(finalFunctionTypeRegistryNativeTypes20);
        
        assertNull(finalFunctionTypeRegistryNativeTypes21);
        
        assertNull(finalFunctionTypeRegistryNativeTypes22);
        
        assertNull(finalFunctionTypeRegistryNativeTypes23);
        
        assertNull(finalFunctionTypeRegistryNativeTypes24);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setImplementedInterfaces(java.util.List)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setImplementedInterfaces(java.util.List)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.invokes {@link com.google.common.collect.ImmutableList#copyOf(java.util.Collection)}
 * @utbot.invokes {@link com.google.common.collect.ImmutableList#copyOf(java.util.Collection)}
 *  */
    @Test
    public void testSetImplementedInterfaces_ImmutableListCopyOf() throws Exception  {
        Class emptyImmutableListClazz = Class.forName("com.google.common.collect.EmptyImmutableList");
        Object prevINSTANCE = getStaticFieldValue(emptyImmutableListClazz, "INSTANCE");
        try {
            Object instance = createInstance("com.google.common.collect.EmptyImmutableList");
            setStaticField(emptyImmutableListClazz, "INSTANCE", instance);
            FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
            ArrayList arrayList = new ArrayList();
            
            functionType.setImplementedInterfaces(arrayList);
        } finally {
            setStaticField(emptyImmutableListClazz, "INSTANCE", prevINSTANCE);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setImplementedInterfaces(java.util.List)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setImplementedInterfaces(java.util.List)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(ObjectType type: implementedInterfaces)
 *  */
    @Test
    public void testSetImplementedInterfaces_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces(FunctionType.java:352) */
        functionType.setImplementedInterfaces(null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setImplementedInterfaces(java.util.List)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: registry.registerTypeImplementingInterface(this, type);
 *  */
    @Test
    public void testSetImplementedInterfaces_ThrowNullPointerException_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces(FunctionType.java:353) */
        functionType.setImplementedInterfaces(arrayList);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setImplementedInterfaces(java.util.List)
    
    @Test
    public void testSetImplementedInterfaces1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        LinkedListMultimap interfaceToImplementors = ((LinkedListMultimap) createInstance("com.google.common.collect.LinkedListMultimap"));
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors", interfaceToImplementors);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        ArrayList arrayList = new ArrayList();
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        arrayList.add(noType);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces] produces [java.lang.NullPointerException]
            com.google.common.collect.LinkedListMultimap.addNode(LinkedListMultimap.java:190)
            com.google.common.collect.LinkedListMultimap.put(LinkedListMultimap.java:461)
            com.google.javascript.rhino.jstype.JSTypeRegistry.registerTypeImplementingInterface(JSTypeRegistry.java:699)
            com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces(FunctionType.java:353) */
        functionType.setImplementedInterfaces(arrayList);
    }
    
    @Test
    public void testSetImplementedInterfaces2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        LinkedListMultimap interfaceToImplementors = ((LinkedListMultimap) createInstance("com.google.common.collect.LinkedListMultimap"));
        Object head = createInstance("com.google.common.collect.LinkedListMultimap$Node");
        setField(interfaceToImplementors, "com.google.common.collect.LinkedListMultimap", "head", head);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors", interfaceToImplementors);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        ArrayList arrayList = new ArrayList();
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        arrayList.add(functionType1);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces] produces [java.lang.NullPointerException]
            com.google.common.collect.LinkedListMultimap.addNode(LinkedListMultimap.java:193)
            com.google.common.collect.LinkedListMultimap.put(LinkedListMultimap.java:461)
            com.google.javascript.rhino.jstype.JSTypeRegistry.registerTypeImplementingInterface(JSTypeRegistry.java:699)
            com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces(FunctionType.java:353) */
        functionType.setImplementedInterfaces(arrayList);
    }
    
    @Test
    public void testSetImplementedInterfaces3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        LinkedListMultimap interfaceToImplementors = ((LinkedListMultimap) createInstance("com.google.common.collect.LinkedListMultimap"));
        Object head = createInstance("com.google.common.collect.LinkedListMultimap$Node");
        setField(interfaceToImplementors, "com.google.common.collect.LinkedListMultimap", "head", head);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors", interfaceToImplementors);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        ArrayList arrayList = new ArrayList();
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        String className = "";
        setField(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        arrayList.add(functionType1);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces] produces [java.lang.NullPointerException]
            com.google.common.collect.LinkedListMultimap.addNode(LinkedListMultimap.java:193)
            com.google.common.collect.LinkedListMultimap.put(LinkedListMultimap.java:461)
            com.google.javascript.rhino.jstype.JSTypeRegistry.registerTypeImplementingInterface(JSTypeRegistry.java:699)
            com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces(FunctionType.java:353) */
        functionType.setImplementedInterfaces(arrayList);
    }
    
    @Test
    public void testSetImplementedInterfaces4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        LinkedListMultimap interfaceToImplementors = ((LinkedListMultimap) createInstance("com.google.common.collect.LinkedListMultimap"));
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors", interfaceToImplementors);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        ArrayList arrayList = new ArrayList();
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        String className = "";
        setField(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        arrayList.add(functionType1);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces] produces [java.lang.NullPointerException]
            com.google.common.collect.LinkedListMultimap.addNode(LinkedListMultimap.java:190)
            com.google.common.collect.LinkedListMultimap.put(LinkedListMultimap.java:461)
            com.google.javascript.rhino.jstype.JSTypeRegistry.registerTypeImplementingInterface(JSTypeRegistry.java:699)
            com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces(FunctionType.java:353) */
        functionType.setImplementedInterfaces(arrayList);
    }
    
    @Test
    public void testSetImplementedInterfaces5() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        LinkedListMultimap interfaceToImplementors = ((LinkedListMultimap) createInstance("com.google.common.collect.LinkedListMultimap"));
        LinkedHashMap keyToKeyHead = new LinkedHashMap();
        setField(interfaceToImplementors, "com.google.common.collect.LinkedListMultimap", "keyToKeyHead", keyToKeyHead);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors", interfaceToImplementors);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        ArrayList arrayList = new ArrayList();
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        String className = "";
        setField(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        arrayList.add(functionType1);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces] produces [java.lang.NullPointerException]
            com.google.common.collect.LinkedListMultimap.addNode(LinkedListMultimap.java:191)
            com.google.common.collect.LinkedListMultimap.put(LinkedListMultimap.java:461)
            com.google.javascript.rhino.jstype.JSTypeRegistry.registerTypeImplementingInterface(JSTypeRegistry.java:699)
            com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces(FunctionType.java:353) */
        functionType.setImplementedInterfaces(arrayList);
    }
    
    @Test
    public void testSetImplementedInterfaces6() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        String className = "";
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        LinkedListMultimap interfaceToImplementors = ((LinkedListMultimap) createInstance("com.google.common.collect.LinkedListMultimap"));
        Object head = createInstance("com.google.common.collect.LinkedListMultimap$Node");
        setField(interfaceToImplementors, "com.google.common.collect.LinkedListMultimap", "head", head);
        setField(interfaceToImplementors, "com.google.common.collect.LinkedListMultimap", "tail", head);
        LinkedHashMap keyToKeyTail = new LinkedHashMap();
        setField(interfaceToImplementors, "com.google.common.collect.LinkedListMultimap", "keyToKeyTail", keyToKeyTail);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors", interfaceToImplementors);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        ArrayList arrayList = new ArrayList();
        arrayList.add(functionType);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        arrayList.add(templateType);
        arrayList.add(templateType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces] produces [java.lang.NullPointerException]
            com.google.common.collect.LinkedListMultimap.addNode(LinkedListMultimap.java:197)
            com.google.common.collect.LinkedListMultimap.put(LinkedListMultimap.java:461)
            com.google.javascript.rhino.jstype.JSTypeRegistry.registerTypeImplementingInterface(JSTypeRegistry.java:699)
            com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces(FunctionType.java:353) */
        functionType.setImplementedInterfaces(arrayList);
    }
    
    @Test
    public void testSetImplementedInterfaces7() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        LinkedListMultimap interfaceToImplementors = ((LinkedListMultimap) createInstance("com.google.common.collect.LinkedListMultimap"));
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors", interfaceToImplementors);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        ArrayList arrayList = new ArrayList();
        arrayList.add(functionType);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces] produces [java.lang.NullPointerException]
            com.google.common.collect.LinkedListMultimap.addNode(LinkedListMultimap.java:190)
            com.google.common.collect.LinkedListMultimap.put(LinkedListMultimap.java:461)
            com.google.javascript.rhino.jstype.JSTypeRegistry.registerTypeImplementingInterface(JSTypeRegistry.java:699)
            com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces(FunctionType.java:353) */
        functionType.setImplementedInterfaces(arrayList);
    }
    
    @Test
    public void testSetImplementedInterfaces8() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        LinkedListMultimap interfaceToImplementors = ((LinkedListMultimap) createInstance("com.google.common.collect.LinkedListMultimap"));
        LinkedHashMap keyToKeyHead = new LinkedHashMap();
        setField(interfaceToImplementors, "com.google.common.collect.LinkedListMultimap", "keyToKeyHead", keyToKeyHead);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors", interfaceToImplementors);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        ArrayList arrayList = new ArrayList();
        arrayList.add(functionType);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces] produces [java.lang.NullPointerException]
            com.google.common.collect.LinkedListMultimap.addNode(LinkedListMultimap.java:191)
            com.google.common.collect.LinkedListMultimap.put(LinkedListMultimap.java:461)
            com.google.javascript.rhino.jstype.JSTypeRegistry.registerTypeImplementingInterface(JSTypeRegistry.java:699)
            com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces(FunctionType.java:353) */
        functionType.setImplementedInterfaces(arrayList);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.isInstanceType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isInstanceType()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isInstanceType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return isEquivalentTo(registry.getNativeType(U2U_CONSTRUCTOR_TYPE));
 *  */
    @Test
    public void testIsInstanceType_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.isInstanceType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 46 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:774)
            com.google.javascript.rhino.jstype.FunctionType.isInstanceType(FunctionType.java:167) */
        functionType.isInstanceType();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isInstanceType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return isEquivalentTo(registry.getNativeType(U2U_CONSTRUCTOR_TYPE));
 *  */
    @Test
    public void testIsInstanceType_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.isInstanceType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.isInstanceType(FunctionType.java:167) */
        functionType.isInstanceType();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.forInterface
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method forInterface(com.google.javascript.rhino.jstype.JSTypeRegistry, java.lang.String, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#forInterface(com.google.javascript.rhino.jstype.JSTypeRegistry,java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return new FunctionType(registry, name, source);
 *  */
    @Test
    public void testForInterface_ThrowClassCastException() throws Exception  {
        JSTypeRegistry jSTypeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[32];
        NumberType numberType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        nativeTypes[13] = ((JSType) numberType);
        setField(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.forInterface] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.NumberType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.NumberType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:778)
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:148)
            com.google.javascript.rhino.jstype.FunctionType.forInterface(FunctionType.java:161) */
        FunctionType.forInterface(jSTypeRegistry, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#forInterface(com.google.javascript.rhino.jstype.JSTypeRegistry,java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new FunctionType(registry, name, source);
 *  */
    @Test
    public void testForInterface_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JSTypeRegistry jSTypeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.forInterface] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:774)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:778)
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:148)
            com.google.javascript.rhino.jstype.FunctionType.forInterface(FunctionType.java:161) */
        FunctionType.forInterface(jSTypeRegistry, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method forInterface(com.google.javascript.rhino.jstype.JSTypeRegistry, java.lang.String, com.google.javascript.rhino.Node)
    
    @Test
    public void testForInterface1() throws Throwable  {
        JSTypeRegistry jSTypeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
        setField(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        String string = "";
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.forInterface] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 14]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:774)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:778)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:117)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:100)
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:147)
            com.google.javascript.rhino.jstype.FunctionType.forInterface(FunctionType.java:161) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class jSTypeRegistryType = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class stringType = Class.forName("java.lang.String");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method forInterfaceMethod = functionTypeClazz.getDeclaredMethod("forInterface", jSTypeRegistryType, stringType, numberNodeType);
        forInterfaceMethod.setAccessible(true);
        java.lang.Object[] forInterfaceMethodArguments = new java.lang.Object[3];
        forInterfaceMethodArguments[0] = jSTypeRegistry;
        forInterfaceMethodArguments[1] = string;
        forInterfaceMethodArguments[2] = numberNode;
        try {
            forInterfaceMethod.invoke(null, forInterfaceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testForInterface2() {
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.forInterface] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:148)
            com.google.javascript.rhino.jstype.FunctionType.forInterface(FunctionType.java:161) */
        FunctionType.forInterface(null, null, node);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method forInterface(com.google.javascript.rhino.jstype.JSTypeRegistry, java.lang.String, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalArgumentException.class)
    public void testForInterface3() throws Exception  {
        JSTypeRegistry jSTypeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        nativeTypes[13] = ((JSType) templateType);
        setField(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        
        FunctionType.forInterface(jSTypeRegistry, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.isOrdinaryFunction
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isOrdinaryFunction()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isOrdinaryFunction()}
 * @utbot.returnsFrom {@code return kind == Kind.ORDINARY;}
 *  */
    @Test
    public void testIsOrdinaryFunction_KindEqualsKindORDINARY() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.isOrdinaryFunction();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isOrdinaryFunction()}
 * @utbot.returnsFrom {@code return kind == Kind.ORDINARY;}
 *  */
    @Test
    public void testIsOrdinaryFunction_KindNotEqualsKindORDINARY() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        boolean actual = functionType.isOrdinaryFunction();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.isFunctionType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isFunctionType()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isFunctionType()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsFunctionType_ReturnTrue() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        boolean actual = functionType.isFunctionType();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.canBeCalled
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canBeCalled()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#canBeCalled()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testCanBeCalled_ReturnTrue() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        boolean actual = functionType.canBeCalled();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.hasOwnProperty
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hasOwnProperty(java.lang.String)
    
    @Test
    public void testHasOwnProperty1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        LinkedHashMap properties = new LinkedHashMap();
        Object property = createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType$Property");
        properties.put(null, property);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        
        boolean actual = functionType.hasOwnProperty(null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLeastSupertype(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getLeastSupertype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes com.google.javascript.rhino.jstype.FunctionType#supAndInfHelper(com.google.javascript.rhino.jstype.JSType,boolean)
 * @utbot.returnsFrom {@code return supAndInfHelper(that, true);}
 *  */
    @Test
    public void testGetLeastSupertype_FunctionTypeSupAndInfHelper() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        FunctionType actual = ((FunctionType) functionType.getLeastSupertype(functionType));
        
        ArrowType actualCall = ((ArrowType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        assertNull(actualCall);
        
        FunctionPrototypeType actualPrototype = actual.getPrototype();
        assertNull(actualPrototype);
        
        Object functionTypeKind = getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertEquals(functionTypeKind, actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualSubTypes = actual.getSubTypes();
        assertNull(actualSubTypes);
        
        String actualTemplateTypeName = actual.getTemplateTypeName();
        assertNull(actualTemplateTypeName);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualPrettyPrint);
        
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
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLeastSupertype(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getLeastSupertype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return supAndInfHelper(that, true);
 *  */
    @Test
    public void testGetLeastSupertype_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:774)
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:521)
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:453) */
        functionType.getLeastSupertype(errorFunctionType);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getLeastSupertype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return supAndInfHelper(that, true);
 *  */
    @Test
    public void testGetLeastSupertype_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:483)
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:453) */
        functionType.getLeastSupertype(null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getLeastSupertype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return supAndInfHelper(that, true);
 *  */
    @Test
    public void testGetLeastSupertype_ThrowNullPointerException_3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:521)
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:453) */
        functionType.getLeastSupertype(anonymousFunctionType);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getLeastSupertype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return supAndInfHelper(that, true);
 *  */
    @Test
    public void testGetLeastSupertype_ThrowNullPointerException_4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object kind1 = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:521)
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:453) */
        functionType.getLeastSupertype(anonymousFunctionType);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getLeastSupertype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return supAndInfHelper(that, true);
 *  */
    @Test
    public void testGetLeastSupertype_ThrowNullPointerException_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[32];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:523)
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:453) */
        functionType.getLeastSupertype(errorFunctionType);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getLeastSupertype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return supAndInfHelper(that, true);
 *  */
    @Test
    public void testGetLeastSupertype_ThrowNullPointerException_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:521)
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:453) */
        functionType.getLeastSupertype(anonymousFunctionType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method supAndInfHelper(com.google.javascript.rhino.jstype.JSType, boolean)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#supAndInfHelper(com.google.javascript.rhino.jstype.JSType,boolean)}
 * @utbot.executesCondition {@code (isFunctionType() && that.isFunctionType()): True}
 * @utbot.executesCondition {@code (isEquivalentTo(that)): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isFunctionType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isFunctionType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSupAndInfHelper_IsEquivalentTo() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class booleanType = boolean.class;
        Method supAndInfHelperMethod = functionTypeClazz.getDeclaredMethod("supAndInfHelper", functionTypeType, booleanType);
        supAndInfHelperMethod.setAccessible(true);
        java.lang.Object[] supAndInfHelperMethodArguments = new java.lang.Object[2];
        supAndInfHelperMethodArguments[0] = functionType;
        supAndInfHelperMethodArguments[1] = false;
        FunctionType actual = ((FunctionType) supAndInfHelperMethod.invoke(functionType, supAndInfHelperMethodArguments));
        
        ArrowType actualCall = ((ArrowType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        assertNull(actualCall);
        
        FunctionPrototypeType actualPrototype = actual.getPrototype();
        assertNull(actualPrototype);
        
        Object functionTypeKind = getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertEquals(functionTypeKind, actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualSubTypes = actual.getSubTypes();
        assertNull(actualSubTypes);
        
        String actualTemplateTypeName = actual.getTemplateTypeName();
        assertNull(actualTemplateTypeName);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualPrettyPrint);
        
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
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method supAndInfHelper(com.google.javascript.rhino.jstype.JSType, boolean)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#supAndInfHelper(com.google.javascript.rhino.jstype.JSType,boolean)}
 * @utbot.executesCondition {@code (isEquivalentTo(that)): False}
 * @utbot.executesCondition {@code (that instanceof FunctionType): True}
 * @utbot.executesCondition {@code (other != null): True}
 * @utbot.executesCondition {@code (isOrdinaryFunction()): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JSType functionInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
 *  */
    @Test
    public void testSupAndInfHelper_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:774)
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:521) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class errorFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class booleanType = boolean.class;
        Method supAndInfHelperMethod = functionTypeClazz.getDeclaredMethod("supAndInfHelper", errorFunctionTypeType, booleanType);
        supAndInfHelperMethod.setAccessible(true);
        java.lang.Object[] supAndInfHelperMethodArguments = new java.lang.Object[2];
        supAndInfHelperMethodArguments[0] = errorFunctionType;
        supAndInfHelperMethodArguments[1] = false;
        try {
            supAndInfHelperMethod.invoke(functionType, supAndInfHelperMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#supAndInfHelper(com.google.javascript.rhino.jstype.JSType,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isFunctionType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isFunctionType() && that.isFunctionType()
 *  */
    @Test
    public void testSupAndInfHelper_ThrowNullPointerException() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:483) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class booleanType = boolean.class;
        Method supAndInfHelperMethod = functionTypeClazz.getDeclaredMethod("supAndInfHelper", jSTypeType, booleanType);
        supAndInfHelperMethod.setAccessible(true);
        java.lang.Object[] supAndInfHelperMethodArguments = new java.lang.Object[2];
        supAndInfHelperMethodArguments[0] = ((Object) null);
        supAndInfHelperMethodArguments[1] = false;
        try {
            supAndInfHelperMethod.invoke(functionType, supAndInfHelperMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#supAndInfHelper(com.google.javascript.rhino.jstype.JSType,boolean)}
 * @utbot.executesCondition {@code (isEquivalentTo(that)): False}
 * @utbot.executesCondition {@code (that instanceof FunctionType): True}
 * @utbot.executesCondition {@code (other != null): True}
 * @utbot.executesCondition {@code (isOrdinaryFunction()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType functionInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
 *  */
    @Test
    public void testSupAndInfHelper_ThrowNullPointerException_2() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object kind1 = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo(FunctionType.java:670)
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:484) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class booleanType = boolean.class;
        Method supAndInfHelperMethod = functionTypeClazz.getDeclaredMethod("supAndInfHelper", anonymousFunctionTypeType, booleanType);
        supAndInfHelperMethod.setAccessible(true);
        java.lang.Object[] supAndInfHelperMethodArguments = new java.lang.Object[2];
        supAndInfHelperMethodArguments[0] = anonymousFunctionType;
        supAndInfHelperMethodArguments[1] = false;
        try {
            supAndInfHelperMethod.invoke(functionType, supAndInfHelperMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#supAndInfHelper(com.google.javascript.rhino.jstype.JSType,boolean)}
 * @utbot.executesCondition {@code (isEquivalentTo(that)): False}
 * @utbot.executesCondition {@code (that instanceof FunctionType): True}
 * @utbot.executesCondition {@code (other != null): True}
 * @utbot.executesCondition {@code (isOrdinaryFunction()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType functionInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
 *  */
    @Test
    public void testSupAndInfHelper_ThrowNullPointerException_3() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:521) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class functionType1Type = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class booleanType = boolean.class;
        Method supAndInfHelperMethod = functionTypeClazz.getDeclaredMethod("supAndInfHelper", functionType1Type, booleanType);
        supAndInfHelperMethod.setAccessible(true);
        java.lang.Object[] supAndInfHelperMethodArguments = new java.lang.Object[2];
        supAndInfHelperMethodArguments[0] = functionType1;
        supAndInfHelperMethodArguments[1] = false;
        try {
            supAndInfHelperMethod.invoke(functionType, supAndInfHelperMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#supAndInfHelper(com.google.javascript.rhino.jstype.JSType,boolean)}
 * @utbot.executesCondition {@code (isEquivalentTo(that)): False}
 * @utbot.executesCondition {@code (that instanceof FunctionType): True}
 * @utbot.executesCondition {@code (other != null): True}
 * @utbot.executesCondition {@code (isOrdinaryFunction()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType functionInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
 *  */
    @Test
    public void testSupAndInfHelper_ThrowNullPointerException_5() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:521) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class booleanType = boolean.class;
        Method supAndInfHelperMethod = functionTypeClazz.getDeclaredMethod("supAndInfHelper", anonymousFunctionTypeType, booleanType);
        supAndInfHelperMethod.setAccessible(true);
        java.lang.Object[] supAndInfHelperMethodArguments = new java.lang.Object[2];
        supAndInfHelperMethodArguments[0] = anonymousFunctionType;
        supAndInfHelperMethodArguments[1] = false;
        try {
            supAndInfHelperMethod.invoke(functionType, supAndInfHelperMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#supAndInfHelper(com.google.javascript.rhino.jstype.JSType,boolean)}
 * @utbot.executesCondition {@code (isEquivalentTo(that)): False}
 * @utbot.executesCondition {@code (that instanceof FunctionType): True}
 * @utbot.executesCondition {@code (other != null): True}
 * @utbot.executesCondition {@code (isOrdinaryFunction()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: functionInstance.isEquivalentTo(that)
 *  */
    @Test
    public void testSupAndInfHelper_ThrowNullPointerException_1() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:523) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class errorFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class booleanType = boolean.class;
        Method supAndInfHelperMethod = functionTypeClazz.getDeclaredMethod("supAndInfHelper", errorFunctionTypeType, booleanType);
        supAndInfHelperMethod.setAccessible(true);
        java.lang.Object[] supAndInfHelperMethodArguments = new java.lang.Object[2];
        supAndInfHelperMethodArguments[0] = errorFunctionType;
        supAndInfHelperMethodArguments[1] = false;
        try {
            supAndInfHelperMethod.invoke(functionType, supAndInfHelperMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#supAndInfHelper(com.google.javascript.rhino.jstype.JSType,boolean)}
 * @utbot.executesCondition {@code (isEquivalentTo(that)): False}
 * @utbot.executesCondition {@code (that instanceof FunctionType): True}
 * @utbot.executesCondition {@code (other != null): True}
 * @utbot.executesCondition {@code (isOrdinaryFunction()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType functionInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
 *  */
    @Test
    public void testSupAndInfHelper_ThrowNullPointerException_4() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        TemplateType typeOfThis1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:521) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class booleanType = boolean.class;
        Method supAndInfHelperMethod = functionTypeClazz.getDeclaredMethod("supAndInfHelper", anonymousFunctionTypeType, booleanType);
        supAndInfHelperMethod.setAccessible(true);
        java.lang.Object[] supAndInfHelperMethodArguments = new java.lang.Object[2];
        supAndInfHelperMethodArguments[0] = anonymousFunctionType;
        supAndInfHelperMethodArguments[1] = false;
        try {
            supAndInfHelperMethod.invoke(functionType, supAndInfHelperMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.setPrototype
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setPrototype(com.google.javascript.rhino.jstype.FunctionPrototypeType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototype(com.google.javascript.rhino.jstype.FunctionPrototypeType)}
 * @utbot.executesCondition {@code (prototype == null): True}
 *  */
    @Test
    public void testSetPrototype_PrototypeEqualsNull() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        boolean actual = functionType.setPrototype(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototype(com.google.javascript.rhino.jstype.FunctionPrototypeType)}
 * @utbot.executesCondition {@code (prototype == null): False}
 *  */
    @Test
    public void testSetPrototype_ReturnFalse() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionPrototypeType typeOfThis = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        boolean actual = functionType.setPrototype(typeOfThis);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototype(com.google.javascript.rhino.jstype.FunctionPrototypeType)}
 * @utbot.executesCondition {@code (prototype == null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testSetPrototype_PrototypeNotEqualsNull() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType functionPrototypeType = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        boolean actual = functionType.setPrototype(functionPrototypeType);
        
        assertTrue(actual);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototype(com.google.javascript.rhino.jstype.FunctionPrototypeType)}
 * @utbot.executesCondition {@code (prototype == null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testSetPrototype_PrototypeNotEqualsNull_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionPrototypeType functionPrototypeType = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        NoObjectType implicitPrototypeFallback = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(functionPrototypeType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        boolean actual = functionType.setPrototype(functionPrototypeType);
        
        assertTrue(actual);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototype(com.google.javascript.rhino.jstype.FunctionPrototypeType)}
 * @utbot.executesCondition {@code (prototype == null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testSetPrototype_PrototypeNotEqualsNull_3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionPrototypeType functionPrototypeType = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionPrototypeType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        boolean actual = functionType.setPrototype(functionPrototypeType);
        
        assertTrue(actual);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototype(com.google.javascript.rhino.jstype.FunctionPrototypeType)}
 * @utbot.executesCondition {@code (prototype == null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testSetPrototype_PrototypeNotEqualsNull_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionPrototypeType functionPrototypeType = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        boolean actual = functionType.setPrototype(functionPrototypeType);
        
        assertTrue(actual);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototype(com.google.javascript.rhino.jstype.FunctionPrototypeType)}
 * @utbot.executesCondition {@code (prototype == null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testSetPrototype_PrototypeNotEqualsNull_5() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionPrototypeType functionPrototypeType = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        TemplateType implicitPrototypeFallback = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        FunctionType referencedObjType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        setField(functionPrototypeType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        boolean actual = functionType.setPrototype(functionPrototypeType);
        
        assertTrue(actual);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototype(com.google.javascript.rhino.jstype.FunctionPrototypeType)}
 * @utbot.executesCondition {@code (prototype == null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testSetPrototype_PrototypeNotEqualsNull_6() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionPrototypeType functionPrototypeType = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        TemplateType implicitPrototypeFallback = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnresolvedTypeExpression referencedObjType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        setField(functionPrototypeType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        boolean actual = functionType.setPrototype(functionPrototypeType);
        
        assertTrue(actual);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototype(com.google.javascript.rhino.jstype.FunctionPrototypeType)}
 * @utbot.executesCondition {@code (prototype == null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testSetPrototype_PrototypeNotEqualsNull_4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionPrototypeType functionPrototypeType = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        TemplateType implicitPrototypeFallback = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(functionPrototypeType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        boolean actual = functionType.setPrototype(functionPrototypeType);
        
        assertTrue(actual);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototype(com.google.javascript.rhino.jstype.FunctionPrototypeType)}
 * @utbot.executesCondition {@code (prototype == null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testSetPrototype_PrototypeNotEqualsNull_7() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionPrototypeType functionPrototypeType = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        TemplateType implicitPrototypeFallback = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoObjectType referencedObjType1 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(referencedObjType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType1);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        setField(functionPrototypeType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        boolean actual = functionType.setPrototype(functionPrototypeType);
        
        assertTrue(actual);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototype(com.google.javascript.rhino.jstype.FunctionPrototypeType)}
 * @utbot.executesCondition {@code (prototype == null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testSetPrototype_PrototypeNotEqualsNull_8() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionPrototypeType functionPrototypeType = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        NoObjectType implicitPrototypeFallback = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(functionPrototypeType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        boolean actual = functionType.setPrototype(functionPrototypeType);
        
        assertTrue(actual);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototype(com.google.javascript.rhino.jstype.FunctionPrototypeType)}
 * @utbot.executesCondition {@code (prototype == null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testSetPrototype_PrototypeNotEqualsNull_9() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionPrototypeType functionPrototypeType = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        UnknownType implicitPrototypeFallback = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(functionPrototypeType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        boolean actual = functionType.setPrototype(functionPrototypeType);
        
        assertTrue(actual);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getMaxArguments
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMaxArguments()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getMaxArguments()}
 * @utbot.returnsFrom {@code return Integer.MAX_VALUE;}
 *  */
    @Test
    public void testGetMaxArguments_ReturnIntegerMAX_VALUE() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        int actual = functionType.getMaxArguments();
        
        assertEquals(Integer.MAX_VALUE, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getMaxArguments()}
 * @utbot.returnsFrom {@code return Integer.MAX_VALUE;}
 *  */
    @Test
    public void testGetMaxArguments_ReturnIntegerMAX_VALUE_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "intValue", -255);
        setField(last, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(parameters, "com.google.javascript.rhino.Node", "last", last);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        int actual = functionType.getMaxArguments();
        
        assertEquals(Integer.MAX_VALUE, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getMaxArguments()}
 * @utbot.returnsFrom {@code return Integer.MAX_VALUE;}
 *  */
    @Test
    public void testGetMaxArguments_ReturnIntegerMAX_VALUE_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "intValue", -255);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(last, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(parameters, "com.google.javascript.rhino.Node", "last", last);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        int actual = functionType.getMaxArguments();
        
        assertEquals(Integer.MAX_VALUE, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getMaxArguments()}
 * @utbot.returnsFrom {@code return params.getChildCount();}
 *  */
    @Test
    public void testGetMaxArguments_ReturnParamsGetChildCount() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        int actual = functionType.getMaxArguments();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getMaxArguments()}
 * @utbot.returnsFrom {@code return params.getChildCount();}
 *  */
    @Test
    public void testGetMaxArguments_ReturnParamsGetChildCount_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(last, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(parameters, "com.google.javascript.rhino.Node", "last", last);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        int actual = functionType.getMaxArguments();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getMaxArguments()}
 * @utbot.returnsFrom {@code return params.getChildCount();}
 *  */
    @Test
    public void testGetMaxArguments_ReturnParamsGetChildCount_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        int actual = functionType.getMaxArguments();
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getMaxArguments()}
 * @utbot.returnsFrom {@code return params.getChildCount();}
 *  */
    @Test
    public void testGetMaxArguments_ReturnParamsGetChildCount_3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "last", last);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        int actual = functionType.getMaxArguments();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getParametersNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getParametersNode()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getParametersNode()}
 * @utbot.returnsFrom {@code return call.parameters;}
 *  */
    @Test
    public void testGetParametersNode_ReturnCallParameters() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        Node actual = functionType.getParametersNode();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getParametersNode()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getParametersNode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return call.parameters;
 *  */
    @Test
    public void testGetParametersNode_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getParametersNode] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getParametersNode(FunctionType.java:206) */
        functionType.getParametersNode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getGreatestSubtype(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getGreatestSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes com.google.javascript.rhino.jstype.FunctionType#supAndInfHelper(com.google.javascript.rhino.jstype.JSType,boolean)
 * @utbot.returnsFrom {@code return supAndInfHelper(that, false);}
 *  */
    @Test
    public void testGetGreatestSubtype_FunctionTypeSupAndInfHelper() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        FunctionType actual = ((FunctionType) functionType.getGreatestSubtype(functionType));
        
        ArrowType actualCall = ((ArrowType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        assertNull(actualCall);
        
        FunctionPrototypeType actualPrototype = actual.getPrototype();
        assertNull(actualPrototype);
        
        Object functionTypeKind = getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertEquals(functionTypeKind, actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualSubTypes = actual.getSubTypes();
        assertNull(actualSubTypes);
        
        String actualTemplateTypeName = actual.getTemplateTypeName();
        assertNull(actualTemplateTypeName);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualPrettyPrint);
        
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
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getGreatestSubtype(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getGreatestSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return supAndInfHelper(that, false);
 *  */
    @Test
    public void testGetGreatestSubtype_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:774)
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:521)
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:458) */
        functionType.getGreatestSubtype(errorFunctionType);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getGreatestSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return supAndInfHelper(that, false);
 *  */
    @Test
    public void testGetGreatestSubtype_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:483)
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:458) */
        functionType.getGreatestSubtype(null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getGreatestSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return supAndInfHelper(that, false);
 *  */
    @Test
    public void testGetGreatestSubtype_ThrowNullPointerException_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object kind1 = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:521)
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:458) */
        functionType.getGreatestSubtype(anonymousFunctionType);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getGreatestSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return supAndInfHelper(that, false);
 *  */
    @Test
    public void testGetGreatestSubtype_ThrowNullPointerException_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[32];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:523)
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:458) */
        functionType.getGreatestSubtype(errorFunctionType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getPrototype
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPrototype()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getPrototype()}
 * @utbot.executesCondition {@code (prototype == null): False}
 * @utbot.returnsFrom {@code return prototype;}
 *  */
    @Test
    public void testGetPrototype_PrototypeNotEqualsNull() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        
        FunctionPrototypeType actual = functionType.getPrototype();
        
        FunctionType actualOwnerFunction = actual.getOwnerFunction();
        assertNull(actualOwnerFunction);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualPrettyPrint);
        
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
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPrototype()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getPrototype()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: setPrototype(new FunctionPrototypeType(registry, this, null));
 *  */
    @Test
    public void testGetPrototype_ThrowClassCastException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        AllType allType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        nativeTypes[19] = ((JSType) allType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getPrototype] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.AllType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.AllType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:778)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:117)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:261) */
        functionType.getPrototype();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getPrototype()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetPrototype_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getPrototype] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:774)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:778)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:117)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:261) */
        functionType.getPrototype();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.isSubtype
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSubtype(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsSubtype_ReturnTrue_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        templateType.setReferencedType(referencedType);
        
        boolean actual = functionType.isSubtype(templateType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsSubtype_ReturnTrue_3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ProxyObjectType proxyObjectType = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        proxyObjectType.setReferencedType(referencedType);
        
        boolean actual = functionType.isSubtype(proxyObjectType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsSubtype_ReturnTrue_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType.setReferencedType(referencedType1);
        templateType.setReferencedType(referencedType);
        
        boolean actual = functionType.isSubtype(templateType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsSubtype_ReturnTrue() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        UnknownType unknownType = new UnknownType(null, false);
        
        boolean actual = functionType.isSubtype(unknownType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsSubtype_ReturnTrue_4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ProxyObjectType proxyObjectType = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType4 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        proxyObjectType.setReferencedType(referencedType);
        
        boolean actual = functionType.isSubtype(proxyObjectType);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.setInstanceType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setInstanceType(com.google.javascript.rhino.jstype.ObjectType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setInstanceType(com.google.javascript.rhino.jstype.ObjectType)}
 *  */
    @Test
    public void testSetInstanceType() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        functionType.setInstanceType(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEquivalentTo(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (!(otherType instanceof FunctionType)): False}
 * @utbot.executesCondition {@code (!that.isFunctionType()): True}
 *  */
    @Test
    public void testIsEquivalentTo_NotThatIsFunctionType() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        
        boolean actual = functionType.isEquivalentTo(noObjectType);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (!(otherType instanceof FunctionType)): True}
 *  */
    @Test
    public void testIsEquivalentTo_ReturnFalse() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        boolean actual = functionType.isEquivalentTo(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (!(otherType instanceof FunctionType)): False}
 * @utbot.executesCondition {@code (!that.isFunctionType()): False}
 * @utbot.executesCondition {@code (this.isConstructor()): True}
 * @utbot.executesCondition {@code (that.isConstructor()): True}
 * @utbot.returnsFrom {@code return this == that;}
 *  */
    @Test
    public void testIsEquivalentTo_EqualsThat() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.isEquivalentTo(functionType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (!(otherType instanceof FunctionType)): False}
 * @utbot.executesCondition {@code (!that.isFunctionType()): False}
 * @utbot.executesCondition {@code (this.isConstructor()): True}
 * @utbot.executesCondition {@code (that.isConstructor()): True}
 * @utbot.returnsFrom {@code return this == that;}
 *  */
    @Test
    public void testIsEquivalentTo_NotEqualsThat() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.isEquivalentTo(errorFunctionType);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (!(otherType instanceof FunctionType)): False}
 * @utbot.executesCondition {@code (!that.isFunctionType()): False}
 * @utbot.executesCondition {@code (this.isConstructor()): False}
 * @utbot.executesCondition {@code (this.isInterface()): False}
 * @utbot.executesCondition {@code (that.isInterface()): True}
 *  */
    @Test
    public void testIsEquivalentTo_ThatIsInterface() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        boolean actual = functionType.isEquivalentTo(errorFunctionType);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (!(otherType instanceof FunctionType)): False}
 * @utbot.executesCondition {@code (!that.isFunctionType()): False}
 * @utbot.executesCondition {@code (this.isConstructor()): False}
 * @utbot.executesCondition {@code (this.isInterface()): True}
 * @utbot.executesCondition {@code (that.isInterface()): False}
 *  */
    @Test
    public void testIsEquivalentTo_NotThatIsInterface() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        boolean actual = functionType.isEquivalentTo(errorFunctionType);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (!(otherType instanceof FunctionType)): False}
 * @utbot.executesCondition {@code (!that.isFunctionType()): False}
 * @utbot.executesCondition {@code (this.isConstructor()): True}
 * @utbot.executesCondition {@code (that.isConstructor()): False}
 *  */
    @Test
    public void testIsEquivalentTo_NotThatIsConstructor() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        
        boolean actual = functionType.isEquivalentTo(errorFunctionType);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (!(otherType instanceof FunctionType)): False}
 * @utbot.executesCondition {@code (!that.isFunctionType()): False}
 * @utbot.executesCondition {@code (this.isConstructor()): False}
 * @utbot.executesCondition {@code (this.isInterface()): False}
 * @utbot.executesCondition {@code (that.isInterface()): False}
 * @utbot.returnsFrom {@code return this.typeOfThis.isEquivalentTo(that.typeOfThis) && this.call.isEquivalentTo(that.call);}
 *  */
    @Test
    public void testIsEquivalentTo_NotThatIsInterface_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        TemplateType typeOfThis1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        
        boolean actual = functionType.isEquivalentTo(anonymousFunctionType);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (!(otherType instanceof FunctionType)): False}
 * @utbot.executesCondition {@code (!that.isFunctionType()): False}
 * @utbot.executesCondition {@code (this.isConstructor()): False}
 * @utbot.executesCondition {@code (this.isInterface()): True}
 * @utbot.executesCondition {@code (that.isInterface()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getReferenceName()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getReferenceName()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return this.getReferenceName().equals(that.getReferenceName());}
 *  */
    @Test
    public void testIsEquivalentTo_ThatIsInterface_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        
        boolean actual = functionType.isEquivalentTo(errorFunctionType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (!(otherType instanceof FunctionType)): False}
 * @utbot.executesCondition {@code (!that.isFunctionType()): False}
 * @utbot.executesCondition {@code (this.isConstructor()): False}
 * @utbot.executesCondition {@code (this.isInterface()): False}
 * @utbot.executesCondition {@code (that.isInterface()): False}
 * @utbot.executesCondition {@code (this.call.isEquivalentTo(that.call)): False}
 * @utbot.returnsFrom {@code return this.typeOfThis.isEquivalentTo(that.typeOfThis) && this.call.isEquivalentTo(that.call);}
 *  */
    @Test
    public void testIsEquivalentTo_NotThisCallIsEquivalentTo_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NoObjectType returnType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnTypeInferred", true);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        Object kind1 = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType);
        
        Object initialFunctionType1Kind = getFieldValue(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        
        boolean actual = functionType.isEquivalentTo(functionType1);
        
        assertFalse(actual);
        
        Object finalFunctionType1Kind = getFieldValue(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        
        assertFalse(initialFunctionType1Kind == finalFunctionType1Kind);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (!(otherType instanceof FunctionType)): False}
 * @utbot.executesCondition {@code (!that.isFunctionType()): False}
 * @utbot.executesCondition {@code (this.isConstructor()): False}
 * @utbot.executesCondition {@code (this.isInterface()): False}
 * @utbot.executesCondition {@code (that.isInterface()): False}
 * @utbot.executesCondition {@code (this.call.isEquivalentTo(that.call)): False}
 * @utbot.returnsFrom {@code return this.typeOfThis.isEquivalentTo(that.typeOfThis) && this.call.isEquivalentTo(that.call);}
 *  */
    @Test
    public void testIsEquivalentTo_NotThisCallIsEquivalentTo() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NoObjectType returnType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        Object kind1 = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        boolean actual = functionType.isEquivalentTo(functionType1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isEquivalentTo(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (this.isInterface()): False}
 * @utbot.executesCondition {@code (that.isInterface()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isInterface()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.typeOfThis.isEquivalentTo(that.typeOfThis) && this.call.isEquivalentTo(that.call);
 *  */
    @Test
    public void testIsEquivalentTo_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo(FunctionType.java:677) */
        functionType.isEquivalentTo(errorFunctionType);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (this.isInterface()): True}
 * @utbot.executesCondition {@code (that.isInterface()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isInterface()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getReferenceName()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getReferenceName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.getReferenceName().equals(that.getReferenceName());
 *  */
    @Test
    public void testIsEquivalentTo_ThrowNullPointerException_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo(FunctionType.java:670) */
        functionType.isEquivalentTo(errorFunctionType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.addSubType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addSubType(com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#addSubType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.executesCondition {@code (subTypes == null): True}
 * @utbot.invokes {@link com.google.common.collect.Lists#newArrayList()}
 *  */
    @Test
    public void testAddSubType_SubTypesEqualsNull() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method addSubTypeMethod = functionTypeClazz.getDeclaredMethod("addSubType", functionTypeClazz);
        addSubTypeMethod.setAccessible(true);
        java.lang.Object[] addSubTypeMethodArguments = new java.lang.Object[1];
        addSubTypeMethodArguments[0] = ((Object) null);
        addSubTypeMethod.invoke(functionType, addSubTypeMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#addSubType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.executesCondition {@code (subTypes == null): False}
 *  */
    @Test
    public void testAddSubType_SubTypesNotEqualsNull() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrayList subTypes = new ArrayList();
        subTypes.add(null);
        subTypes.add(null);
        subTypes.add(null);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "subTypes", subTypes);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method addSubTypeMethod = functionTypeClazz.getDeclaredMethod("addSubType", functionTypeClazz);
        addSubTypeMethod.setAccessible(true);
        java.lang.Object[] addSubTypeMethodArguments = new java.lang.Object[1];
        addSubTypeMethodArguments[0] = ((Object) null);
        addSubTypeMethod.invoke(functionType, addSubTypeMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getInstanceType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInstanceType()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getInstanceType()}
 * @utbot.returnsFrom {@code return typeOfThis;}
 *  */
    @Test
    public void testGetInstanceType_ReturnTypeOfThis() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        ObjectType actual = functionType.getInstanceType();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getInstanceType()}
 * @utbot.returnsFrom {@code return typeOfThis;}
 *  */
    @Test
    public void testGetInstanceType_ReturnTypeOfThis_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        ObjectType actual = functionType.getInstanceType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getInstanceType()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getInstanceType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#hasInstanceType()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(hasInstanceType());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetInstanceType_ThrowIllegalStateException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        functionType.getInstanceType();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.hasEqualCallType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.isEquivalentTo(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        boolean actual = functionType.hasEqualCallType(functionType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.isEquivalentTo(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_9() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NoObjectType returnType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnTypeInferred", true);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(functionType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.isEquivalentTo(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_20() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NoObjectType returnType1 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(noObjectType);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.isEquivalentTo(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(functionType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.isEquivalentTo(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_19() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NoObjectType returnType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(functionType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.isEquivalentTo(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object kind1 = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(returnType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(functionType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.isEquivalentTo(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnTypeInferred", true);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(functionType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.isEquivalentTo(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_5() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object kind1 = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(returnType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(functionType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.isEquivalentTo(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_6() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(returnType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(functionType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.isEquivalentTo(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(noObjectType);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.isEquivalentTo(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_12() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoObjectType returnType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        PrototypeObjectType jsType1 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(functionType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.isEquivalentTo(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_15() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        NoObjectType jsType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoObjectType returnType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        NoType jsType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(functionType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.isEquivalentTo(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_7() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(noType);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.isEquivalentTo(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_8() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(returnType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(returnType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(functionType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.isEquivalentTo(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_10() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoObjectType returnType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(functionType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.isEquivalentTo(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_16() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        FunctionType referencedType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        jsType.setReferencedType(referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoObjectType returnType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        TemplateType jsType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(functionType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.isEquivalentTo(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_17() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoType referencedType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        jsType.setReferencedType(referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoObjectType returnType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        NoType jsType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(noType);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.isEquivalentTo(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_11() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", first);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(noObjectType);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.isEquivalentTo(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_13() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoObjectType returnType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(noObjectType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.isEquivalentTo(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_14() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", first);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(noType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return this.call.isEquivalentTo(otherType.call);}
 *  */
    @Test
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_18() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoObjectType returnType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parameters1, "com.google.javascript.rhino.Node", "next", parameters);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(functionType1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.call.isEquivalentTo(otherType.call);
 *  */
    @Test
    public void testHasEqualCallType_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hasEqualCallType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.hasEqualCallType(FunctionType.java:687) */
        functionType.hasEqualCallType(null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ArrowType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.call.isEquivalentTo(otherType.call);
 *  */
    @Test
    public void testHasEqualCallType_ThrowNullPointerException_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hasEqualCallType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.hasEqualCallType(FunctionType.java:687) */
        functionType.hasEqualCallType(functionType1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.hasInstanceType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasInstanceType()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasInstanceType()}
 * @utbot.returnsFrom {@code return isConstructor() || isInterface();}
 *  */
    @Test
    public void testHasInstanceType_IsConstructorOrIsInterface() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.hasInstanceType();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasInstanceType()}
 * @utbot.returnsFrom {@code return isConstructor() || isInterface();}
 *  */
    @Test
    public void testHasInstanceType_IsConstructorOrIsInterface_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.hasInstanceType();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasInstanceType()}
 * @utbot.returnsFrom {@code return isConstructor() || isInterface();}
 *  */
    @Test
    public void testHasInstanceType_IsConstructorOrIsInterface_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        boolean actual = functionType.hasInstanceType();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getSubTypes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSubTypes()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getSubTypes()}
 * @utbot.returnsFrom {@code return subTypes;}
 *  */
    @Test
    public void testGetSubTypes_ReturnSubTypes() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        List actual = functionType.getSubTypes();
        
        assertNull(actual);
        
        List finalFunctionTypeSubTypes = ((List) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "subTypes"));
        
        assertNull(finalFunctionTypeSubTypes);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.hasCachedValues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasCachedValues()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasCachedValues()}
 * @utbot.returnsFrom {@code return prototype != null || super.hasCachedValues();}
 *  */
    @Test
    public void testHasCachedValues_PrototypeNotEqualsNullOrSuperHasCachedValues() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        
        boolean actual = functionType.hasCachedValues();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasCachedValues()}
 * @utbot.returnsFrom {@code return prototype != null || super.hasCachedValues();}
 *  */
    @Test
    public void testHasCachedValues_PrototypeNotEqualsNullOrSuperHasCachedValues_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        boolean actual = functionType.hasCachedValues();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasCachedValues()}
 * @utbot.returnsFrom {@code return prototype != null || super.hasCachedValues();}
 *  */
    @Test
    public void testHasCachedValues_PrototypeEqualsNullOrSuperHasCachedValues() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        boolean actual = functionType.hasCachedValues();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.resolveInternal
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: call = (ArrowType) safeResolve(call, t, scope);
 *  */
    @Test
    public void testResolveInternal_ThrowClassCastException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        TemplateType resolveResult = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(call, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.resolveInternal] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.TemplateType cannot be cast to class com.google.javascript.rhino.jstype.ArrowType (com.google.javascript.rhino.jstype.TemplateType and com.google.javascript.rhino.jstype.ArrowType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:865) */
        functionType.resolveInternal(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: prototype = (FunctionPrototypeType) safeResolve(prototype, t, scope);
 *  */
    @Test
    public void testResolveInternal_ThrowClassCastException_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(prototype, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        NoObjectType resolveResult = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(prototype, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        ErrorFunctionType resolveResult1 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.resolveInternal] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.NoObjectType cannot be cast to class com.google.javascript.rhino.jstype.FunctionPrototypeType (com.google.javascript.rhino.jstype.NoObjectType and com.google.javascript.rhino.jstype.FunctionPrototypeType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:866) */
        functionType.resolveInternal(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: call = (ArrowType) safeResolve(call, t, scope);
 *  */
    @Test
    public void testResolveInternal_ThrowClassCastException_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        nativeTypes[35] = ((JSType) noObjectType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(call, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.resolveInternal] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.NoObjectType cannot be cast to class com.google.javascript.rhino.jstype.ArrowType (com.google.javascript.rhino.jstype.NoObjectType and com.google.javascript.rhino.jstype.ArrowType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:865) */
        functionType.resolveInternal(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: prototype = (FunctionPrototypeType) safeResolve(prototype, t, scope);
 *  */
    @Test
    public void testResolveInternal_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(prototype, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(prototype, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.resolveInternal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:774)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:889)
            com.google.javascript.rhino.jstype.JSType.safeResolve(JSType.java:926)
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:866) */
        functionType.resolveInternal(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTypeOfThis()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getTypeOfThis()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.returnsFrom {@code return typeOfThis.isNoObjectType() ? registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE) : typeOfThis;}
 *  */
    @Test
    public void testGetTypeOfThis_JSTypeRegistryGetNativeObjectType() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        ObjectType actual = functionType.getTypeOfThis();
        
        assertNull(actual);
        
        JSTypeRegistry jSTypeRegistry = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes13 = ((JSType) get(jSTypeRegistry13RegistryNativeTypes, 13));
        JSTypeRegistry jSTypeRegistry14 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes14 = ((JSType) get(jSTypeRegistry14RegistryNativeTypes, 14));
        JSTypeRegistry jSTypeRegistry15 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry15RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes15 = ((JSType) get(jSTypeRegistry15RegistryNativeTypes, 15));
        JSTypeRegistry jSTypeRegistry16 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry16RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes16 = ((JSType) get(jSTypeRegistry16RegistryNativeTypes, 16));
        JSTypeRegistry jSTypeRegistry17 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry17RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes17 = ((JSType) get(jSTypeRegistry17RegistryNativeTypes, 17));
        JSTypeRegistry jSTypeRegistry18 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry18RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes18 = ((JSType) get(jSTypeRegistry18RegistryNativeTypes, 18));
        JSTypeRegistry jSTypeRegistry19 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry19RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes19 = ((JSType) get(jSTypeRegistry19RegistryNativeTypes, 19));
        JSTypeRegistry jSTypeRegistry20 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry20RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes20 = ((JSType) get(jSTypeRegistry20RegistryNativeTypes, 20));
        JSTypeRegistry jSTypeRegistry21 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry21RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes21 = ((JSType) get(jSTypeRegistry21RegistryNativeTypes, 21));
        JSTypeRegistry jSTypeRegistry22 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry22RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes22 = ((JSType) get(jSTypeRegistry22RegistryNativeTypes, 22));
        JSTypeRegistry jSTypeRegistry23 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry23RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes23 = ((JSType) get(jSTypeRegistry23RegistryNativeTypes, 23));
        JSTypeRegistry jSTypeRegistry24 = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry24RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes24 = ((JSType) get(jSTypeRegistry24RegistryNativeTypes, 24));
        
        assertNull(finalFunctionTypeRegistryNativeTypes0);
        
        assertNull(finalFunctionTypeRegistryNativeTypes1);
        
        assertNull(finalFunctionTypeRegistryNativeTypes2);
        
        assertNull(finalFunctionTypeRegistryNativeTypes3);
        
        assertNull(finalFunctionTypeRegistryNativeTypes4);
        
        assertNull(finalFunctionTypeRegistryNativeTypes5);
        
        assertNull(finalFunctionTypeRegistryNativeTypes6);
        
        assertNull(finalFunctionTypeRegistryNativeTypes7);
        
        assertNull(finalFunctionTypeRegistryNativeTypes8);
        
        assertNull(finalFunctionTypeRegistryNativeTypes9);
        
        assertNull(finalFunctionTypeRegistryNativeTypes10);
        
        assertNull(finalFunctionTypeRegistryNativeTypes11);
        
        assertNull(finalFunctionTypeRegistryNativeTypes12);
        
        assertNull(finalFunctionTypeRegistryNativeTypes13);
        
        assertNull(finalFunctionTypeRegistryNativeTypes14);
        
        assertNull(finalFunctionTypeRegistryNativeTypes15);
        
        assertNull(finalFunctionTypeRegistryNativeTypes16);
        
        assertNull(finalFunctionTypeRegistryNativeTypes17);
        
        assertNull(finalFunctionTypeRegistryNativeTypes18);
        
        assertNull(finalFunctionTypeRegistryNativeTypes19);
        
        assertNull(finalFunctionTypeRegistryNativeTypes20);
        
        assertNull(finalFunctionTypeRegistryNativeTypes21);
        
        assertNull(finalFunctionTypeRegistryNativeTypes22);
        
        assertNull(finalFunctionTypeRegistryNativeTypes23);
        
        assertNull(finalFunctionTypeRegistryNativeTypes24);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getTypeOfThis()}
 * @utbot.returnsFrom {@code return typeOfThis.isNoObjectType() ? registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE) : typeOfThis;}
 *  */
    @Test
    public void testGetTypeOfThis_ReturnTypeOfThisIsNoObjectType_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType typeOfThis = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        TemplateType actual = ((TemplateType) functionType.getTypeOfThis());
        
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
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getTypeOfThis()}
 * @utbot.returnsFrom {@code return typeOfThis.isNoObjectType() ? registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE) : typeOfThis;}
 *  */
    @Test
    public void testGetTypeOfThis_ReturnTypeOfThisIsNoObjectType() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        NoType actual = ((NoType) functionType.getTypeOfThis());
        
        Visitor actualLeastSupertypeVisitor = ((Visitor) getFieldValue(actual, "com.google.javascript.rhino.jstype.NoObjectType", "leastSupertypeVisitor"));
        assertNull(actualLeastSupertypeVisitor);
        
        Visitor actualGreatestSubtypeVisitor = ((Visitor) getFieldValue(actual, "com.google.javascript.rhino.jstype.NoObjectType", "greatestSubtypeVisitor"));
        assertNull(actualGreatestSubtypeVisitor);
        
        ArrowType actualCall = ((ArrowType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        assertNull(actualCall);
        
        FunctionPrototypeType actualPrototype = actual.getPrototype();
        assertNull(actualPrototype);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualSubTypes = actual.getSubTypes();
        assertNull(actualSubTypes);
        
        String actualTemplateTypeName = actual.getTemplateTypeName();
        assertNull(actualTemplateTypeName);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualPrettyPrint);
        
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
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTypeOfThis()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getTypeOfThis()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE)
 *  */
    @Test
    public void testGetTypeOfThis_ThrowClassCastException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        NumberType numberType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        nativeTypes[19] = ((JSType) numberType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.NumberType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.NumberType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4805e08c)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:778)
            com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis(FunctionType.java:815) */
        functionType.getTypeOfThis();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getTypeOfThis()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE)
 *  */
    @Test
    public void testGetTypeOfThis_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:774)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:778)
            com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis(FunctionType.java:815) */
        functionType.getTypeOfThis();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getTypeOfThis()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: typeOfThis.isNoObjectType()
 *  */
    @Test
    public void testGetTypeOfThis_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis(FunctionType.java:814) */
        functionType.getTypeOfThis();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getTypeOfThis()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE)
 *  */
    @Test
    public void testGetTypeOfThis_ThrowNullPointerException_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis(FunctionType.java:815) */
        functionType.getTypeOfThis();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields900875028242200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields900875028242200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass900875028250500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields900875028242200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass900875028250500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields900875028720700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields900875028720700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass900875028722200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields900875028720700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass900875028722200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields900875032790800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields900875032790800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass900875032792700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields900875032790800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass900875032792700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields900875033308700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields900875033308700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass900875033309800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields900875033308700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass900875033309800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

