package com.google.javascript.rhino.jstype;

import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.rhino.ScriptOrFnNode;
import java.util.Set;
import java.util.LinkedHashSet;
import com.google.javascript.rhino.ObjArray;
import com.google.javascript.rhino.ObjToIntMap;
import java.util.LinkedHashMap;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import com.google.javascript.rhino.JSDocInfo;
import java.util.ArrayList;
import com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode;
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
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[22];
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
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:843)
            com.google.javascript.rhino.jstype.FunctionType.toString(FunctionType.java:808) */
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
            com.google.javascript.rhino.jstype.FunctionType.toString(FunctionType.java:808) */
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
            com.google.javascript.rhino.jstype.FunctionType.toString(FunctionType.java:814) */
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
            com.google.javascript.rhino.jstype.FunctionType.toString(FunctionType.java:814) */
        functionType.toString();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toString()
    
    @Test
    public void testToString1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[16];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.toString] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.toString(FunctionType.java:815) */
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
    public void testHashCode_NotIsInterface_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnTypeInferred", true);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
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
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hashCode()
    
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
            com.google.javascript.rhino.jstype.FunctionType.hashCode(FunctionType.java:793) */
        functionType.hashCode();
    }
    
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
            com.google.javascript.rhino.jstype.FunctionType.hashCode(FunctionType.java:793) */
        functionType.hashCode();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hashCode()
    
    @Test
    public void testHashCode1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NoResolvedType returnType = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnTypeInferred", true);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        int actual = functionType.hashCode();
        
        assertEquals(796364241, actual);
    }
    
    @Test
    public void testHashCode2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        BooleanType returnType = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        int actual = functionType.hashCode();
        
        assertEquals(1178799544, actual);
    }
    
    @Test
    public void testHashCode3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoResolvedType returnType = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        int actual = functionType.hashCode();
        
        assertEquals(1636973924, actual);
    }
    
    @Test
    public void testHashCode4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnTypeInferred", true);
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        int actual = functionType.hashCode();
        
        assertEquals(1, actual);
    }
    
    @Test
    public void testHashCode5() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType ownerFunction = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        FunctionType ownerFunction1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ownerFunction.setOwnerFunction(ownerFunction1);
        functionType.setOwnerFunction(ownerFunction);
        
        int actual = functionType.hashCode();
        
        assertEquals(2091080815, actual);
    }
    
    @Test
    public void testHashCode6() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        EnumType returnType1 = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        int actual = functionType.hashCode();
        
        assertEquals(1324479536, actual);
    }
    
    @Test
    public void testHashCode7() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType ownerFunction = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        returnType.setOwnerFunction(ownerFunction);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Object kind1 = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        int actual = functionType.hashCode();
        
        assertEquals(-534953605, actual);
    }
    
    @Test
    public void testHashCode8() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", parameters);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(jsType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        int actual = functionType.hashCode();
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testHashCode9() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnTypeInferred", true);
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        int actual = functionType.hashCode();
        
        assertEquals(1, actual);
    }
    
    @Test
    public void testHashCode10() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", parameters);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoResolvedType ownerFunction = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        jsType.setOwnerFunction(ownerFunction);
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        int actual = functionType.hashCode();
        
        assertEquals(-534953605, actual);
    }
    
    @Test
    public void testHashCode11() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType ownerFunction = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        jsType.setOwnerFunction(ownerFunction);
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        int actual = functionType.hashCode();
        
        assertEquals(-534953605, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hashCode()
    
    @Test
    public void testHashCode12() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnTypeInferred", true);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hashCode] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.hashCode(FunctionType.java:793)
            com.google.javascript.rhino.jstype.ArrowType.hashCode(ArrowType.java:198)
            com.google.javascript.rhino.jstype.FunctionType.hashCode(FunctionType.java:793) */
        functionType.hashCode();
    }
    
    @Test
    public void testHashCode13() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hashCode] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.hashCode(FunctionType.java:793)
            com.google.javascript.rhino.jstype.ArrowType.hashCode(ArrowType.java:188)
            com.google.javascript.rhino.jstype.FunctionType.hashCode(FunctionType.java:793)
            com.google.javascript.rhino.jstype.ArrowType.hashCode(ArrowType.java:198)
            com.google.javascript.rhino.jstype.FunctionType.hashCode(FunctionType.java:793) */
        functionType.hashCode();
    }
    
    @Test
    public void testHashCode14() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", parameters);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hashCode] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.hashCode(FunctionType.java:793)
            com.google.javascript.rhino.jstype.ArrowType.hashCode(ArrowType.java:198)
            com.google.javascript.rhino.jstype.FunctionType.hashCode(FunctionType.java:793) */
        functionType.hashCode();
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method hashCode()
    
    @Test(timeout = 1000L)
    public void testHashCode15() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters, "com.google.javascript.rhino.Node", "next", parameters);
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnTypeInferred", true);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
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
            com.google.javascript.rhino.jstype.FunctionType.getReturnType(FunctionType.java:263) */
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
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        Object actual = functionType.getParameters();
        
        Object expected = createInstance("com.google.javascript.rhino.Node$SiblingNodeIterable");
        setField(expected, "com.google.javascript.rhino.Node$SiblingNodeIterable", "start", parameters);
        setField(expected, "com.google.javascript.rhino.Node$SiblingNodeIterable", "current", parameters);
        
        Node expectedStart = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node$SiblingNodeIterable", "start"));
        Node actualStart = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node$SiblingNodeIterable", "start"));
        String actualStartFunctionName = (((FunctionNode) actualStart)).getFunctionName();
        assertNull(actualStartFunctionName);
        
        boolean actualStartItsNeedsActivation = ((Boolean) getFieldValue(actualStart, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
        assertFalse(actualStartItsNeedsActivation);
        
        int expectedStartItsFunctionType = ((Integer) getFieldValue(expectedStart, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        int actualStartItsFunctionType = ((Integer) getFieldValue(actualStart, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        assertEquals(expectedStartItsFunctionType, actualStartItsFunctionType);
        
        boolean actualStartItsIgnoreDynamicScope = ((Boolean) getFieldValue(actualStart, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
        assertFalse(actualStartItsIgnoreDynamicScope);
        
        int expectedStartEncodedSourceStart = (((ScriptOrFnNode) expectedStart)).getEncodedSourceStart();
        int actualStartEncodedSourceStart = (((ScriptOrFnNode) actualStart)).getEncodedSourceStart();
        assertEquals(expectedStartEncodedSourceStart, actualStartEncodedSourceStart);
        
        int expectedStartEncodedSourceEnd = (((ScriptOrFnNode) expectedStart)).getEncodedSourceEnd();
        int actualStartEncodedSourceEnd = (((ScriptOrFnNode) actualStart)).getEncodedSourceEnd();
        assertEquals(expectedStartEncodedSourceEnd, actualStartEncodedSourceEnd);
        
        String actualStartSourceName = (((ScriptOrFnNode) actualStart)).getSourceName();
        assertNull(actualStartSourceName);
        
        int expectedStartBaseLineno = (((ScriptOrFnNode) expectedStart)).getBaseLineno();
        int actualStartBaseLineno = (((ScriptOrFnNode) actualStart)).getBaseLineno();
        assertEquals(expectedStartBaseLineno, actualStartBaseLineno);
        
        int expectedStartEndLineno = (((ScriptOrFnNode) expectedStart)).getEndLineno();
        int actualStartEndLineno = (((ScriptOrFnNode) actualStart)).getEndLineno();
        assertEquals(expectedStartEndLineno, actualStartEndLineno);
        
        ObjArray actualStartFunctions = ((ObjArray) getFieldValue(actualStart, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualStartFunctions);
        
        ObjArray actualStartRegexps = ((ObjArray) getFieldValue(actualStart, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualStartRegexps);
        
        ObjArray actualStartItsVariables = ((ObjArray) getFieldValue(actualStart, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualStartItsVariables);
        
        ObjArray actualStartItsConst = ((ObjArray) getFieldValue(actualStart, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualStartItsConst);
        
        ObjToIntMap actualStartItsVariableNames = ((ObjToIntMap) getFieldValue(actualStart, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualStartItsVariableNames);
        
        int expectedStartVarStart = ((Integer) getFieldValue(expectedStart, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualStartVarStart = ((Integer) getFieldValue(actualStart, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(expectedStartVarStart, actualStartVarStart);
        
        Object actualStartCompilerData = (((ScriptOrFnNode) actualStart)).getCompilerData();
        assertNull(actualStartCompilerData);
        
        int expectedStartType = expectedStart.getType();
        int actualStartType = actualStart.getType();
        assertEquals(expectedStartType, actualStartType);
        
        Node actualStartNext = actualStart.getNext();
        assertNull(actualStartNext);
        
        Node expectedStartFirst = ((Node) getFieldValue(expectedStart, "com.google.javascript.rhino.Node", "first"));
        Node actualStartFirst = ((Node) getFieldValue(actualStart, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        assertTrue(deepEquals(expectedStartFirst, actualStartFirst));
        Node actualStartFirstLast = ((Node) getFieldValue(actualStartFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualStartFirstLast);
        
        Object actualStartFirstPropListHead = getFieldValue(actualStartFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualStartFirstPropListHead);
        
        int expectedStartFirstSourcePosition = expectedStartFirst.getSourcePosition();
        int actualStartFirstSourcePosition = actualStartFirst.getSourcePosition();
        assertEquals(expectedStartFirstSourcePosition, actualStartFirstSourcePosition);
        
        JSType actualStartFirstJsType = ((JSType) getFieldValue(actualStartFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualStartFirstJsType);
        
        Node actualStartFirstParent = actualStartFirst.getParent();
        assertNull(actualStartFirstParent);
        
        assertTrue(deepEquals(expectedStart, actualStart));
        assertTrue(deepEquals(expectedStart, actualStart));
        assertTrue(deepEquals(expectedStart, actualStart));
        assertTrue(deepEquals(expectedStart, actualStart));
        assertTrue(deepEquals(expectedStart, actualStart));
        
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
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
        assertTrue(deepEquals(expectedCurrent, actualCurrent));
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
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getSlot
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getSlot(java.lang.String)
    
    @Test
    public void testGetSlot1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        StaticSlot actual = functionType.getSlot(string);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetSlot2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        LinkedHashMap properties = new LinkedHashMap();
        properties.put(null, null);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        
        StaticSlot actual = functionType.getSlot(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getSlot(java.lang.String)
    
    @Test
    public void testGetSlot3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getSlot] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.getSlot(PrototypeObjectType.java:131)
            com.google.javascript.rhino.jstype.FunctionType.getSlot(FunctionType.java:282) */
        functionType.getSlot(string);
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
        UnresolvedTypeExpression target = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
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
        
        PrototypeObjectType actualPrototype = ((PrototypeObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        assertNull(actualPrototype);
        
        SimpleSlot actualPrototypeSlot = ((SimpleSlot) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        assertNull(actualPrototypeSlot);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        FunctionType actualOwnerFunction = actual.getOwnerFunction();
        assertNull(actualOwnerFunction);
        
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
        
        PrototypeObjectType actualPrototype = ((PrototypeObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        assertNull(actualPrototype);
        
        SimpleSlot actualPrototypeSlot = ((SimpleSlot) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        assertNull(actualPrototypeSlot);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        FunctionType actualOwnerFunction = actual.getOwnerFunction();
        assertNull(actualOwnerFunction);
        
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
        
        PrototypeObjectType actualPrototype = ((PrototypeObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        assertNull(actualPrototype);
        
        SimpleSlot actualPrototypeSlot = ((SimpleSlot) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        assertNull(actualPrototypeSlot);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        FunctionType actualOwnerFunction = actual.getOwnerFunction();
        assertNull(actualOwnerFunction);
        
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
        UnresolvedTypeExpression referencedType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
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
        
        PrototypeObjectType actualPrototype = ((PrototypeObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        assertNull(actualPrototype);
        
        SimpleSlot actualPrototypeSlot = ((SimpleSlot) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        assertNull(actualPrototypeSlot);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        FunctionType actualOwnerFunction = actual.getOwnerFunction();
        assertNull(actualOwnerFunction);
        
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
        
        PrototypeObjectType actualPrototype = ((PrototypeObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        assertNull(actualPrototype);
        
        SimpleSlot actualPrototypeSlot = ((SimpleSlot) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        assertNull(actualPrototypeSlot);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        FunctionType actualOwnerFunction = actual.getOwnerFunction();
        assertNull(actualOwnerFunction);
        
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
        IndexedType target = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
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
        
        PrototypeObjectType actualPrototype = ((PrototypeObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        assertNull(actualPrototype);
        
        SimpleSlot actualPrototypeSlot = ((SimpleSlot) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        assertNull(actualPrototypeSlot);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        FunctionType actualOwnerFunction = actual.getOwnerFunction();
        assertNull(actualOwnerFunction);
        
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
        UnresolvedTypeExpression referencedType1 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
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
        
        PrototypeObjectType actualPrototype = ((PrototypeObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        assertNull(actualPrototype);
        
        SimpleSlot actualPrototypeSlot = ((SimpleSlot) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        assertNull(actualPrototypeSlot);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        FunctionType actualOwnerFunction = actual.getOwnerFunction();
        assertNull(actualOwnerFunction);
        
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
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
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
        
        PrototypeObjectType actualPrototype = ((PrototypeObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        assertNull(actualPrototype);
        
        SimpleSlot actualPrototypeSlot = ((SimpleSlot) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        assertNull(actualPrototypeSlot);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        FunctionType actualOwnerFunction = actual.getOwnerFunction();
        assertNull(actualOwnerFunction);
        
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
            com.google.javascript.rhino.jstype.FunctionType.visit(FunctionType.java:911) */
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
            com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor.applyCommonRestriction(SemanticReverseAbstractInterpreter.java:515)
            com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor.caseObjectType(SemanticReverseAbstractInterpreter.java:501)
            com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor.caseFunctionType(SemanticReverseAbstractInterpreter.java:511)
            com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor.caseFunctionType(SemanticReverseAbstractInterpreter.java:477)
            com.google.javascript.rhino.jstype.FunctionType.visit(FunctionType.java:911) */
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method visit(com.google.javascript.rhino.jstype.Visitor)
    
    @Test
    public void testVisit1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object restrictByFalseInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByFalseInstanceOfResultVisitor");
        ProxyObjectType target = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnresolvedTypeExpression referencedType1 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        referencedType.setReferencedType(referencedType1);
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
        
        PrototypeObjectType actualPrototype = ((PrototypeObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        assertNull(actualPrototype);
        
        SimpleSlot actualPrototypeSlot = ((SimpleSlot) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        assertNull(actualPrototypeSlot);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        FunctionType actualOwnerFunction = actual.getOwnerFunction();
        assertNull(actualOwnerFunction);
        
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
    
    @Test
    public void testVisit2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object restrictByFalseInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByFalseInstanceOfResultVisitor");
        TemplateType target = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType6 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
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
        
        PrototypeObjectType actualPrototype = ((PrototypeObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        assertNull(actualPrototype);
        
        SimpleSlot actualPrototypeSlot = ((SimpleSlot) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        assertNull(actualPrototypeSlot);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        FunctionType actualOwnerFunction = actual.getOwnerFunction();
        assertNull(actualOwnerFunction);
        
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
    
    ///region OTHER: ERROR SUITE for method visit(com.google.javascript.rhino.jstype.Visitor)
    
    @Test(expected = StackOverflowError.class)
    public void testVisit3() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object restrictByFalseInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByFalseInstanceOfResultVisitor");
        TemplateType target = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        target.setReferencedType(target);
        setField(restrictByFalseInstanceOfResultVisitor, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByFalseInstanceOfResultVisitor", "target", target);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class restrictByFalseInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = functionTypeClazz.getDeclaredMethod("visit", restrictByFalseInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByFalseInstanceOfResultVisitor;
        try {
            visitMethod.invoke(functionType, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testVisit4() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object restrictByFalseInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByFalseInstanceOfResultVisitor");
        ProxyObjectType target = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        referencedType.setReferencedType(referencedType);
        target.setReferencedType(referencedType);
        setField(restrictByFalseInstanceOfResultVisitor, "com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByFalseInstanceOfResultVisitor", "target", target);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class restrictByFalseInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = functionTypeClazz.getDeclaredMethod("visit", restrictByFalseInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByFalseInstanceOfResultVisitor;
        try {
            visitMethod.invoke(functionType, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testVisit5() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        TemplateType target = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        referencedType4.setReferencedType(referencedType4);
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
        try {
            visitMethod.invoke(functionType, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testVisit6() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        TemplateType target = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType5 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        ParameterizedType referencedType6 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        referencedType6.setReferencedType(referencedType4);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
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
        try {
            visitMethod.invoke(functionType, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testVisit7() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        TemplateType target = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ProxyObjectType referencedType7 = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        TemplateType referencedType8 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        referencedType8.setReferencedType(referencedType8);
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
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
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[13] = ((JSType) unionType);
        setField(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.forInterface] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.UnionType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.UnionType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @20b23a18)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:847)
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:157)
            com.google.javascript.rhino.jstype.FunctionType.forInterface(FunctionType.java:170) */
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
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:843)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:847)
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:157)
            com.google.javascript.rhino.jstype.FunctionType.forInterface(FunctionType.java:170) */
        FunctionType.forInterface(jSTypeRegistry, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method forInterface(com.google.javascript.rhino.jstype.JSTypeRegistry, java.lang.String, com.google.javascript.rhino.Node)
    
    @Test
    public void testForInterface1() throws Exception  {
        JSTypeRegistry jSTypeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
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
        nativeTypes[8] = ((JSType) enumElementType);
        nativeTypes[9] = ((JSType) enumElementType);
        nativeTypes[10] = ((JSType) enumElementType);
        nativeTypes[11] = ((JSType) enumElementType);
        nativeTypes[12] = ((JSType) enumElementType);
        EnumElementType enumElementType1 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        nativeTypes[13] = ((JSType) enumElementType1);
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
        setField(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        String string = "";
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.forInterface] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 32]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:843)
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:111)
            com.google.javascript.rhino.jstype.ArrowType.<init>(ArrowType.java:75)
            com.google.javascript.rhino.jstype.ArrowType.<init>(ArrowType.java:64)
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:162)
            com.google.javascript.rhino.jstype.FunctionType.forInterface(FunctionType.java:170) */
        FunctionType.forInterface(jSTypeRegistry, string, null);
    }
    
    @Test
    public void testForInterface2() throws Exception  {
        String string = "";
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.forInterface] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:157)
            com.google.javascript.rhino.jstype.FunctionType.forInterface(FunctionType.java:170) */
        FunctionType.forInterface(null, string, functionNode);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method forInterface(com.google.javascript.rhino.jstype.JSTypeRegistry, java.lang.String, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalArgumentException.class)
    public void testForInterface3() throws Exception  {
        JSTypeRegistry jSTypeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[32];
        setField(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        FunctionType.forInterface(jSTypeRegistry, null, scriptOrFnNode);
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
        FunctionType prototype = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        
        FunctionType actual = ((FunctionType) functionType.getPrototype());
        
        ArrowType actualCall = ((ArrowType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        assertNull(actualCall);
        
        PrototypeObjectType actualPrototype = ((PrototypeObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        assertNull(actualPrototype);
        
        SimpleSlot actualPrototypeSlot = ((SimpleSlot) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        assertNull(actualPrototypeSlot);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        FunctionType actualOwnerFunction = actual.getOwnerFunction();
        assertNull(actualOwnerFunction);
        
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
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: registry.getNativeObjectType(OBJECT_TYPE)
 *  */
    @Test
    public void testGetPrototype_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getPrototype] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:843)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:847)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:311) */
        functionType.getPrototype();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getPrototype()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: registry.getNativeObjectType(OBJECT_TYPE)
 *  */
    @Test
    public void testGetPrototype_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getPrototype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:311) */
        functionType.getPrototype();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getPrototype()
    
    @Test
    public void testGetPrototype1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[19] = ((JSType) unionType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getPrototype] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.UnionType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.UnionType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @20b23a18)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:847)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:311) */
        functionType.getPrototype();
    }
    
    @Test
    public void testGetPrototype2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoObjectType ownerFunction = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        functionType.setOwnerFunction(ownerFunction);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getPrototype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:311) */
        functionType.getPrototype();
    }
    
    @Test
    public void testGetPrototype3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType ownerFunction = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        NoObjectType ownerFunction1 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ownerFunction.setOwnerFunction(ownerFunction1);
        functionType.setOwnerFunction(ownerFunction);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getPrototype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:311) */
        functionType.getPrototype();
    }
    
    @Test
    public void testGetPrototype4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType ownerFunction = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        FunctionType ownerFunction1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        String className = "";
        setField(ownerFunction1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        ownerFunction.setOwnerFunction(ownerFunction1);
        functionType.setOwnerFunction(ownerFunction);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getPrototype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:311) */
        functionType.getPrototype();
    }
    
    @Test
    public void testGetPrototype5() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType ownerFunction = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        FunctionType ownerFunction1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ownerFunction.setOwnerFunction(ownerFunction1);
        functionType.setOwnerFunction(ownerFunction);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getPrototype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:311) */
        functionType.getPrototype();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.setPrototype
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setPrototype(com.google.javascript.rhino.jstype.PrototypeObjectType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototype(com.google.javascript.rhino.jstype.PrototypeObjectType)}
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
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototype(com.google.javascript.rhino.jstype.PrototypeObjectType)}
 * @utbot.executesCondition {@code (prototype == null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getInstanceType()}
 *  */
    @Test
    public void testSetPrototype_FunctionTypeGetInstanceType() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        boolean actual = functionType.setPrototype(typeOfThis);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototype(com.google.javascript.rhino.jstype.PrototypeObjectType)}
 * @utbot.executesCondition {@code (prototype == null): False}
 * @utbot.executesCondition {@code (replacedPrototype): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#setOwnerFunction(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isConstructor()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isInterface()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#clearCachedValues()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testSetPrototype_ReplacedPrototype() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        PrototypeObjectType initialFunctionTypePrototype = ((PrototypeObjectType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        SimpleSlot initialFunctionTypePrototypeSlot = ((SimpleSlot) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        
        FunctionType initialFunctionType1OwnerFunction = ((FunctionType) getFieldValue(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction"));
        
        boolean actual = functionType.setPrototype(functionType1);
        
        assertTrue(actual);
        
        PrototypeObjectType finalFunctionTypePrototype = ((PrototypeObjectType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        SimpleSlot finalFunctionTypePrototypeSlot = ((SimpleSlot) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        List finalFunctionTypeSubTypes = ((List) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "subTypes"));
        boolean finalFunctionTypeUnknown = ((Boolean) getFieldValue(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        
        FunctionType finalFunctionType1OwnerFunction = ((FunctionType) getFieldValue(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction"));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
        
        assertFalse(initialFunctionTypePrototypeSlot == finalFunctionTypePrototypeSlot);
        
        assertNull(finalFunctionTypeSubTypes);
        
        assertTrue(finalFunctionTypeUnknown);
        
        assertFalse(initialFunctionType1OwnerFunction == finalFunctionType1OwnerFunction);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setPrototype(com.google.javascript.rhino.jstype.PrototypeObjectType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototype(com.google.javascript.rhino.jstype.PrototypeObjectType)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: this.prototype.setOwnerFunction(this);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testSetPrototype_ThrowIllegalStateException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoObjectType ownerFunction = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        functionType1.setOwnerFunction(ownerFunction);
        
        functionType.setPrototype(functionType1);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototype(com.google.javascript.rhino.jstype.PrototypeObjectType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getInstanceType()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: this.prototype.setOwnerFunction(this);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testSetPrototype_ThrowIllegalStateException_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType ownerFunction = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        functionType1.setOwnerFunction(ownerFunction);
        
        functionType.setPrototype(functionType1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setPrototype(com.google.javascript.rhino.jstype.PrototypeObjectType)
    
    @Test
    public void testSetPrototype1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        SimpleSlot prototypeSlot = ((SimpleSlot) createInstance("com.google.javascript.rhino.jstype.SimpleSlot"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoResolvedType noResolvedType = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        ArrayList subTypes = new ArrayList();
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "subTypes", subTypes);
        
        PrototypeObjectType initialFunctionTypePrototype = ((PrototypeObjectType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        SimpleSlot initialFunctionTypePrototypeSlot = ((SimpleSlot) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        
        FunctionType initialNoResolvedTypeOwnerFunction = ((FunctionType) getFieldValue(noResolvedType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction"));
        
        boolean actual = functionType.setPrototype(noResolvedType);
        
        assertTrue(actual);
        
        PrototypeObjectType finalFunctionTypePrototype = ((PrototypeObjectType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        SimpleSlot finalFunctionTypePrototypeSlot = ((SimpleSlot) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        List finalFunctionTypeSubTypes = ((List) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "subTypes"));
        boolean finalFunctionTypeUnknown = ((Boolean) getFieldValue(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        
        FunctionType finalNoResolvedTypeOwnerFunction = ((FunctionType) getFieldValue(noResolvedType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction"));
        boolean finalNoResolvedTypeUnknown = ((Boolean) getFieldValue(noResolvedType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
        
        assertFalse(initialFunctionTypePrototypeSlot == finalFunctionTypePrototypeSlot);
        
        assertNull(finalFunctionTypeSubTypes);
        
        assertTrue(finalFunctionTypeUnknown);
        
        assertFalse(initialNoResolvedTypeOwnerFunction == finalNoResolvedTypeOwnerFunction);
        
        assertTrue(finalNoResolvedTypeUnknown);
    }
    
    @Test
    public void testSetPrototype2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        
        PrototypeObjectType initialFunctionTypePrototype = ((PrototypeObjectType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        SimpleSlot initialFunctionTypePrototypeSlot = ((SimpleSlot) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        
        FunctionType initialRecordTypeOwnerFunction = ((FunctionType) getFieldValue(recordType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction"));
        
        boolean actual = functionType.setPrototype(recordType);
        
        assertTrue(actual);
        
        PrototypeObjectType finalFunctionTypePrototype = ((PrototypeObjectType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        SimpleSlot finalFunctionTypePrototypeSlot = ((SimpleSlot) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        List finalFunctionTypeSubTypes = ((List) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "subTypes"));
        boolean finalFunctionTypeUnknown = ((Boolean) getFieldValue(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        
        FunctionType finalRecordTypeOwnerFunction = ((FunctionType) getFieldValue(recordType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction"));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
        
        assertFalse(initialFunctionTypePrototypeSlot == finalFunctionTypePrototypeSlot);
        
        assertNull(finalFunctionTypeSubTypes);
        
        assertTrue(finalFunctionTypeUnknown);
        
        assertFalse(initialRecordTypeOwnerFunction == finalRecordTypeOwnerFunction);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setPrototype(com.google.javascript.rhino.jstype.PrototypeObjectType)
    
    @Test
    public void testSetPrototype3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.setPrototype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.setPrototype(FunctionType.java:382) */
        functionType.setPrototype(noObjectType);
    }
    
    @Test
    public void testSetPrototype4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        NoType implicitPrototypeFallback = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.setPrototype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.setPrototype(FunctionType.java:382) */
        functionType.setPrototype(anonymousFunctionType);
    }
    
    @Test
    public void testSetPrototype5() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.setPrototype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.setPrototype(FunctionType.java:382) */
        functionType.setPrototype(errorFunctionType);
    }
    
    @Test
    public void testSetPrototype6() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        UnresolvedTypeExpression implicitPrototypeFallback = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.setPrototype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.setPrototype(FunctionType.java:382) */
        functionType.setPrototype(anonymousFunctionType);
    }
    
    @Test
    public void testSetPrototype7() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.setPrototype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.getImplicitPrototype(RecordType.java:117)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:711)
            com.google.javascript.rhino.jstype.FunctionType.setPrototype(FunctionType.java:376) */
        functionType.setPrototype(recordType);
    }
    
    @Test
    public void testSetPrototype8() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        ArrayList subTypes = new ArrayList();
        subTypes.add(null);
        subTypes.add(null);
        subTypes.add(null);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "subTypes", subTypes);
        NoResolvedType noResolvedType = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.setPrototype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.clearCachedValues(FunctionType.java:976)
            com.google.javascript.rhino.jstype.FunctionType.setPrototype(FunctionType.java:391) */
        functionType.setPrototype(noResolvedType);
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
            com.google.javascript.rhino.jstype.FunctionType.getParametersNode(FunctionType.java:227) */
        functionType.getParametersNode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getMinArguments
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getMinArguments()
    
    @Test
    public void testGetMinArguments1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        int actual = functionType.getMinArguments();
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testGetMinArguments2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        int actual = functionType.getMinArguments();
        
        assertEquals(1, actual);
    }
    
    @Test
    public void testGetMinArguments3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        int actual = functionType.getMinArguments();
        
        assertEquals(0, actual);
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
        FunctionNode last = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$IntPropListItem", "intValue", 1);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
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
    public void testGetMaxArguments_ReturnParamsGetChildCount_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
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
    public void testGetMaxArguments_ReturnParamsGetChildCount_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "last", parameters);
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
    public void testGetMaxArguments_ReturnParamsGetChildCount_3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode last = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(last, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(parameters, "com.google.javascript.rhino.Node", "last", last);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        int actual = functionType.getMaxArguments();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getMaxArguments()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getMaxArguments()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getParametersNode()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isVarArgs()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetMaxArguments_ThrowUnsupportedOperationException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "last", parameters);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(parameters, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        functionType.getMaxArguments();
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
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.isInstanceType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 47 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:843)
            com.google.javascript.rhino.jstype.FunctionType.isInstanceType(FunctionType.java:176) */
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
            com.google.javascript.rhino.jstype.FunctionType.isInstanceType(FunctionType.java:176) */
        functionType.isInstanceType();
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
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method supAndInfHelper(com.google.javascript.rhino.jstype.JSType, boolean)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#supAndInfHelper(com.google.javascript.rhino.jstype.JSType,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isFunctionType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isFunctionType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSupAndInfHelper_FunctionTypeIsEquivalentTo() throws Exception  {
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
        
        PrototypeObjectType actualPrototype = ((PrototypeObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        assertNull(actualPrototype);
        
        SimpleSlot actualPrototypeSlot = ((SimpleSlot) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        assertNull(actualPrototypeSlot);
        
        Object functionTypeKind = getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertEquals(functionTypeKind, actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        FunctionType actualOwnerFunction = actual.getOwnerFunction();
        assertNull(actualOwnerFunction);
        
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
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isFunctionType() && that.isFunctionType()
 *  */
    @Test
    public void testSupAndInfHelper_ThrowNullPointerException() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:599) */
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
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isFunctionType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#toMaybeFunctionType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isOrdinaryFunction()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType functionInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
 *  */
    @Test
    public void testSupAndInfHelper_ThrowNullPointerException_1() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:634) */
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
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method supAndInfHelper(com.google.javascript.rhino.jstype.JSType, boolean)
    
    @Test
    public void testSupAndInfHelper1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class functionType1Type = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class booleanType = boolean.class;
        Method supAndInfHelperMethod = functionTypeClazz.getDeclaredMethod("supAndInfHelper", functionType1Type, booleanType);
        supAndInfHelperMethod.setAccessible(true);
        java.lang.Object[] supAndInfHelperMethodArguments = new java.lang.Object[2];
        supAndInfHelperMethodArguments[0] = functionType1;
        supAndInfHelperMethodArguments[1] = false;
        FunctionType actual = ((FunctionType) supAndInfHelperMethod.invoke(functionType, supAndInfHelperMethodArguments));
        
        ArrowType actualCall = ((ArrowType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        assertNull(actualCall);
        
        PrototypeObjectType actualPrototype = ((PrototypeObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        assertNull(actualPrototype);
        
        SimpleSlot actualPrototypeSlot = ((SimpleSlot) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        assertNull(actualPrototypeSlot);
        
        Object functionTypeKind = getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertEquals(functionTypeKind, actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
        List actualSubTypes = actual.getSubTypes();
        assertNull(actualSubTypes);
        
        String actualTemplateTypeName = actual.getTemplateTypeName();
        assertNull(actualTemplateTypeName);
        
        String functionTypeClassName = ((String) getFieldValue(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertEquals(functionTypeClassName, actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        FunctionType actualOwnerFunction = actual.getOwnerFunction();
        assertNull(actualOwnerFunction);
        
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
    
    ///region OTHER: ERROR SUITE for method supAndInfHelper(com.google.javascript.rhino.jstype.JSType, boolean)
    
    @Test
    public void testSupAndInfHelper2() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null, null, null, null, null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 6]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:843)
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:634) */
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
    
    @Test
    public void testSupAndInfHelper3() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:111)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:906)
            com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(JSType.java:683)
            com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(JSType.java:668)
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:657) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class booleanType = boolean.class;
        Method supAndInfHelperMethod = functionTypeClazz.getDeclaredMethod("supAndInfHelper", noTypeType, booleanType);
        supAndInfHelperMethod.setAccessible(true);
        java.lang.Object[] supAndInfHelperMethodArguments = new java.lang.Object[2];
        supAndInfHelperMethodArguments[0] = noType;
        supAndInfHelperMethodArguments[1] = false;
        try {
            supAndInfHelperMethod.invoke(functionType, supAndInfHelperMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSupAndInfHelper4() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getLeastSupertype(JSType.java:648)
            com.google.javascript.rhino.jstype.JSType.getLeastSupertype(JSType.java:637)
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:656) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class booleanType = boolean.class;
        Method supAndInfHelperMethod = functionTypeClazz.getDeclaredMethod("supAndInfHelper", noTypeType, booleanType);
        supAndInfHelperMethod.setAccessible(true);
        java.lang.Object[] supAndInfHelperMethodArguments = new java.lang.Object[2];
        supAndInfHelperMethodArguments[0] = noType;
        supAndInfHelperMethodArguments[1] = true;
        try {
            supAndInfHelperMethod.invoke(functionType, supAndInfHelperMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSupAndInfHelper5() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.toMaybeFunctionType(ProxyObjectType.java:198)
            com.google.javascript.rhino.jstype.JSType.isFunctionType(JSType.java:260)
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:599) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class namedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class booleanType = boolean.class;
        Method supAndInfHelperMethod = functionTypeClazz.getDeclaredMethod("supAndInfHelper", namedTypeType, booleanType);
        supAndInfHelperMethod.setAccessible(true);
        java.lang.Object[] supAndInfHelperMethodArguments = new java.lang.Object[2];
        supAndInfHelperMethodArguments[0] = namedType;
        supAndInfHelperMethodArguments[1] = false;
        try {
            supAndInfHelperMethod.invoke(functionType, supAndInfHelperMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSupAndInfHelper6() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:634) */
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
    
    @Test
    public void testSupAndInfHelper7() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:843)
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:634) */
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
    
    @Test
    public void testSupAndInfHelper8() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        FunctionType typeOfThis1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo(FunctionType.java:787)
            com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo(FunctionType.java:787)
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:600) */
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
    
    @Test
    public void testSupAndInfHelper9() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        ErrorFunctionType ownerFunction = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        String className = "";
        setField(ownerFunction, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        functionType.setOwnerFunction(ownerFunction);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:634) */
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
    
    @Test
    public void testSupAndInfHelper10() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:634) */
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
    
    @Test
    public void testSupAndInfHelper11() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoResolvedType ownerFunction = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        functionType1.setOwnerFunction(ownerFunction);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo(FunctionType.java:780)
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:600) */
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
        
        PrototypeObjectType actualPrototype = ((PrototypeObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        assertNull(actualPrototype);
        
        SimpleSlot actualPrototypeSlot = ((SimpleSlot) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        assertNull(actualPrototypeSlot);
        
        Object functionTypeKind = getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertEquals(functionTypeKind, actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        FunctionType actualOwnerFunction = actual.getOwnerFunction();
        assertNull(actualOwnerFunction);
        
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
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:843)
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:634)
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:569) */
        functionType.getLeastSupertype(anonymousFunctionType);
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
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:599)
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:569) */
        functionType.getLeastSupertype(null);
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
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo(FunctionType.java:780)
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:600)
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:569) */
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
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:636)
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:569) */
        functionType.getLeastSupertype(functionType1);
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
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:634)
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:569) */
        functionType.getLeastSupertype(anonymousFunctionType);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getLeastSupertype(com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testGetLeastSupertype1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.toMaybeFunctionType(ProxyObjectType.java:198)
            com.google.javascript.rhino.jstype.TemplateType.toMaybeFunctionType(TemplateType.java:48)
            com.google.javascript.rhino.jstype.JSType.isFunctionType(JSType.java:260)
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:599)
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:569) */
        functionType.getLeastSupertype(templateType);
    }
    
    @Test
    public void testGetLeastSupertype2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoResolvedType noResolvedType = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getLeastSupertype(JSType.java:648)
            com.google.javascript.rhino.jstype.JSType.getLeastSupertype(JSType.java:637)
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:656)
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:569) */
        functionType.getLeastSupertype(noResolvedType);
    }
    
    @Test
    public void testGetLeastSupertype3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:634)
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:569) */
        functionType.getLeastSupertype(functionType1);
    }
    
    @Test
    public void testGetLeastSupertype4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:634)
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:569) */
        functionType.getLeastSupertype(functionType1);
    }
    
    @Test
    public void testGetLeastSupertype5() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        nativeTypes[13] = ((JSType) functionType1);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo(FunctionType.java:787)
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:638)
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:569) */
        functionType.getLeastSupertype(anonymousFunctionType);
    }
    
    @Test
    public void testGetLeastSupertype6() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType ownerFunction = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        functionType.setOwnerFunction(ownerFunction);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:634)
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:569) */
        functionType.getLeastSupertype(functionType1);
    }
    
    @Test
    public void testGetLeastSupertype7() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:843)
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:634)
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:569) */
        functionType.getLeastSupertype(errorFunctionType);
    }
    
    @Test
    public void testGetLeastSupertype8() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        InstanceObjectType typeOfThis1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:634)
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:569) */
        functionType.getLeastSupertype(errorFunctionType);
    }
    
    @Test
    public void testGetLeastSupertype9() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoResolvedType typeOfThis = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:634)
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:569) */
        functionType.getLeastSupertype(errorFunctionType);
    }
    
    @Test
    public void testGetLeastSupertype10() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoResolvedType typeOfThis = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:634)
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:569) */
        functionType.getLeastSupertype(functionType1);
    }
    
    @Test
    public void testGetLeastSupertype11() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoResolvedType typeOfThis = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:634)
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:569) */
        functionType.getLeastSupertype(errorFunctionType);
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
        
        PrototypeObjectType actualPrototype = ((PrototypeObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        assertNull(actualPrototype);
        
        SimpleSlot actualPrototypeSlot = ((SimpleSlot) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        assertNull(actualPrototypeSlot);
        
        Object functionTypeKind = getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertEquals(functionTypeKind, actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        FunctionType actualOwnerFunction = actual.getOwnerFunction();
        assertNull(actualOwnerFunction);
        
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
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:843)
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:634)
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:574) */
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
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:599)
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:574) */
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
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:634)
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:574) */
        functionType.getGreatestSubtype(functionType1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getGreatestSubtype(com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testGetGreatestSubtype1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoResolvedType noResolvedType = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:111)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:906)
            com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(JSType.java:683)
            com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(JSType.java:668)
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:657)
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:574) */
        functionType.getGreatestSubtype(noResolvedType);
    }
    
    @Test
    public void testGetGreatestSubtype2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.toMaybeFunctionType(ProxyObjectType.java:198)
            com.google.javascript.rhino.jstype.TemplateType.toMaybeFunctionType(TemplateType.java:48)
            com.google.javascript.rhino.jstype.JSType.isFunctionType(JSType.java:260)
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:599)
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:574) */
        functionType.getGreatestSubtype(templateType);
    }
    
    @Test
    public void testGetGreatestSubtype3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:634)
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:574) */
        functionType.getGreatestSubtype(functionType1);
    }
    
    @Test
    public void testGetGreatestSubtype4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:634)
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:574) */
        functionType.getGreatestSubtype(functionType1);
    }
    
    @Test
    public void testGetGreatestSubtype5() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:843)
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:634)
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:574) */
        functionType.getGreatestSubtype(errorFunctionType);
    }
    
    @Test
    public void testGetGreatestSubtype6() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo(FunctionType.java:780)
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:600)
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:574) */
        functionType.getGreatestSubtype(functionType1);
    }
    
    @Test
    public void testGetGreatestSubtype7() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        UnknownType typeOfThis1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:634)
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:574) */
        functionType.getGreatestSubtype(errorFunctionType);
    }
    
    @Test
    public void testGetGreatestSubtype8() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType ownerFunction = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        functionType.setOwnerFunction(ownerFunction);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:634)
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:574) */
        functionType.getGreatestSubtype(functionType1);
    }
    
    @Test
    public void testGetGreatestSubtype9() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoResolvedType typeOfThis = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:634)
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:574) */
        functionType.getGreatestSubtype(errorFunctionType);
    }
    
    @Test
    public void testGetGreatestSubtype10() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:634)
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:574) */
        functionType.getGreatestSubtype(functionType1);
    }
    
    @Test
    public void testGetGreatestSubtype11() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoResolvedType typeOfThis = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ErrorFunctionType returnType1 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo(FunctionType.java:787)
            com.google.javascript.rhino.jstype.ArrowType.isEquivalentTo(ArrowType.java:178)
            com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo(FunctionType.java:788)
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:600)
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:574) */
        functionType.getGreatestSubtype(errorFunctionType);
    }
    
    @Test
    public void testGetGreatestSubtype12() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoResolvedType typeOfThis = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        TemplateType returnType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.toMaybeFunctionType(ProxyObjectType.java:198)
            com.google.javascript.rhino.jstype.TemplateType.toMaybeFunctionType(TemplateType.java:48)
            com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType(JSType.java:283)
            com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo(FunctionType.java:768)
            com.google.javascript.rhino.jstype.ArrowType.isEquivalentTo(ArrowType.java:178)
            com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo(FunctionType.java:788)
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:600)
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:574) */
        functionType.getGreatestSubtype(errorFunctionType);
    }
    
    @Test
    public void testGetGreatestSubtype13() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoResolvedType typeOfThis = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:634)
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:574) */
        functionType.getGreatestSubtype(errorFunctionType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.defineProperty
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method defineProperty(java.lang.String, com.google.javascript.rhino.jstype.JSType, boolean, com.google.javascript.rhino.Node)
    
    @Test
    public void testDefineProperty1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        boolean actual = functionType.defineProperty(null, null, false, functionNode);
        
        assertTrue(actual);
    }
    
    @Test
    public void testDefineProperty2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        LinkedHashMap properties = new LinkedHashMap();
        Object property = createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType$Property");
        properties.put(null, property);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        UnresolvedTypeExpression unresolvedTypeExpression = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        boolean actual = functionType.defineProperty(null, unresolvedTypeExpression, false, scriptOrFnNode);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method defineProperty(java.lang.String, com.google.javascript.rhino.jstype.JSType, boolean, com.google.javascript.rhino.Node)
    
    @Test
    public void testDefineProperty3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.defineProperty] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.hasOwnProperty(PrototypeObjectType.java:176)
            com.google.javascript.rhino.jstype.FunctionType.hasOwnProperty(FunctionType.java:66)
            com.google.javascript.rhino.jstype.ObjectType.hasOwnDeclaredProperty(ObjectType.java:423)
            com.google.javascript.rhino.jstype.PrototypeObjectType.defineProperty(PrototypeObjectType.java:238)
            com.google.javascript.rhino.jstype.FunctionType.defineProperty(FunctionType.java:564) */
        functionType.defineProperty(string, null, false, null);
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
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.clearCachedValues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clearCachedValues()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#clearCachedValues()}
 * @utbot.executesCondition {@code (subTypes != null): False}
 * @utbot.executesCondition {@code (!isNativeObjectType()): False}
 *  */
    @Test
    public void testClearCachedValues_IsNativeObjectType() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        functionType.clearCachedValues();
        
        List finalFunctionTypeSubTypes = ((List) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "subTypes"));
        boolean finalFunctionTypeUnknown = ((Boolean) getFieldValue(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        
        assertNull(finalFunctionTypeSubTypes);
        
        assertTrue(finalFunctionTypeUnknown);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#clearCachedValues()}
 * @utbot.executesCondition {@code (subTypes != null): True}
 * @utbot.executesCondition {@code (!isNativeObjectType()): False}
 * @utbot.invokes {@link java.util.List#iterator()}
 *  */
    @Test
    public void testClearCachedValues_SubTypesNotEqualsNull() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrayList subTypes = new ArrayList();
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "subTypes", subTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        functionType.clearCachedValues();
        
        boolean finalFunctionTypeUnknown = ((Boolean) getFieldValue(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        
        assertTrue(finalFunctionTypeUnknown);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#clearCachedValues()}
 * @utbot.executesCondition {@code (subTypes != null): False}
 * @utbot.executesCondition {@code (!isNativeObjectType()): True}
 * @utbot.executesCondition {@code (hasInstanceType()): False}
 * @utbot.executesCondition {@code (prototype != null): True}
 *  */
    @Test
    public void testClearCachedValues_PrototypeNotEqualsNull() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        RecordType prototype = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        functionType.clearCachedValues();
        
        PrototypeObjectType functionTypePrototype = ((PrototypeObjectType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        boolean finalFunctionTypePrototypeUnknown = ((Boolean) getFieldValue(functionTypePrototype, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        List finalFunctionTypeSubTypes = ((List) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "subTypes"));
        boolean finalFunctionTypeUnknown = ((Boolean) getFieldValue(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        
        assertTrue(finalFunctionTypePrototypeUnknown);
        
        assertNull(finalFunctionTypeSubTypes);
        
        assertTrue(finalFunctionTypeUnknown);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#clearCachedValues()}
 * @utbot.executesCondition {@code (subTypes != null): False}
 * @utbot.executesCondition {@code (!isNativeObjectType()): True}
 * @utbot.executesCondition {@code (hasInstanceType()): False}
 * @utbot.executesCondition {@code (prototype != null): False}
 *  */
    @Test
    public void testClearCachedValues_PrototypeEqualsNull() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        functionType.clearCachedValues();
        
        List finalFunctionTypeSubTypes = ((List) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "subTypes"));
        boolean finalFunctionTypeUnknown = ((Boolean) getFieldValue(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        
        assertNull(finalFunctionTypeSubTypes);
        
        assertTrue(finalFunctionTypeUnknown);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#clearCachedValues()}
 * @utbot.executesCondition {@code (!isNativeObjectType()): True}
 * @utbot.executesCondition {@code (hasInstanceType()): False}
 * @utbot.executesCondition {@code (prototype != null): True}
 *  */
    @Test
    public void testClearCachedValues_PrototypeNotEqualsNull_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoObjectType prototype = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(prototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        functionType.clearCachedValues();
        
        PrototypeObjectType functionTypePrototype = ((PrototypeObjectType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        List finalFunctionTypePrototypeSubTypes = ((List) getFieldValue(functionTypePrototype, "com.google.javascript.rhino.jstype.FunctionType", "subTypes"));
        PrototypeObjectType functionTypePrototype1 = ((PrototypeObjectType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        boolean finalFunctionTypePrototypeUnknown = ((Boolean) getFieldValue(functionTypePrototype1, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        List finalFunctionTypeSubTypes = ((List) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "subTypes"));
        boolean finalFunctionTypeUnknown = ((Boolean) getFieldValue(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        
        assertNull(finalFunctionTypePrototypeSubTypes);
        
        assertTrue(finalFunctionTypePrototypeUnknown);
        
        assertNull(finalFunctionTypeSubTypes);
        
        assertTrue(finalFunctionTypeUnknown);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clearCachedValues()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#clearCachedValues()}
 * @utbot.executesCondition {@code (subTypes != null): False}
 * @utbot.executesCondition {@code (!isNativeObjectType()): True}
 * @utbot.executesCondition {@code (hasInstanceType()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#clearCachedValues()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isNativeObjectType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#hasInstanceType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getInstanceType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getInstanceType().clearCachedValues();
 *  */
    @Test
    public void testClearCachedValues_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.clearCachedValues] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.clearCachedValues(FunctionType.java:982) */
        functionType.clearCachedValues();
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
        TemplateType typeOfThis = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoObjectType referencedType1 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        referencedType.setReferencedType(referencedType1);
        typeOfThis.setReferencedType(referencedType);
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
    public void testGetTypeOfThis_ReturnTypeOfThisIsNoObjectType() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        NoType actual = ((NoType) functionType.getTypeOfThis());
        
        ArrowType actualCall = ((ArrowType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        assertNull(actualCall);
        
        PrototypeObjectType actualPrototype = ((PrototypeObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        assertNull(actualPrototype);
        
        SimpleSlot actualPrototypeSlot = ((SimpleSlot) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        assertNull(actualPrototypeSlot);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        FunctionType actualOwnerFunction = actual.getOwnerFunction();
        assertNull(actualOwnerFunction);
        
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
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getTypeOfThis()}
 * @utbot.returnsFrom {@code return typeOfThis.isNoObjectType() ? registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE) : typeOfThis;}
 *  */
    @Test
    public void testGetTypeOfThis_ReturnTypeOfThisIsNoObjectType_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType typeOfThis = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoType referencedType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        typeOfThis.setReferencedType(referencedType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        TemplateType actual = ((TemplateType) functionType.getTypeOfThis());
        
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.TemplateType", "name"));
        assertNull(actualName);
        
        JSType typeOfThisReferencedType = ((JSType) getFieldValue(typeOfThis, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        JSType actualReferencedType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(typeOfThisReferencedType, actualReferencedType);
        
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
    public void testGetTypeOfThis_ReturnTypeOfThisIsNoObjectType_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType typeOfThis = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoType referencedType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        referencedType.setReferencedType(referencedType1);
        typeOfThis.setReferencedType(referencedType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        TemplateType actual = ((TemplateType) functionType.getTypeOfThis());
        
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.TemplateType", "name"));
        assertNull(actualName);
        
        JSType typeOfThisReferencedType = ((JSType) getFieldValue(typeOfThis, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        JSType actualReferencedType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(typeOfThisReferencedType, actualReferencedType);
        
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
        TemplateType typeOfThis = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoObjectType referencedType1 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        referencedType.setReferencedType(referencedType1);
        typeOfThis.setReferencedType(referencedType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        AllType allType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        nativeTypes[19] = ((JSType) allType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.AllType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.AllType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @20b23a18)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:847)
            com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis(FunctionType.java:945) */
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
        TemplateType typeOfThis = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoObjectType referencedType1 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        referencedType.setReferencedType(referencedType1);
        typeOfThis.setReferencedType(referencedType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:843)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:847)
            com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis(FunctionType.java:945) */
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
            com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis(FunctionType.java:944) */
        functionType.getTypeOfThis();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getTypeOfThis()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE)
 *  */
    @Test
    public void testGetTypeOfThis_ThrowNullPointerException_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis(FunctionType.java:945) */
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
        TemplateType typeOfThis = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoObjectType referencedType1 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        referencedType.setReferencedType(referencedType1);
        typeOfThis.setReferencedType(referencedType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis(FunctionType.java:945) */
        functionType.getTypeOfThis();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEquivalentTo(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (that == null): True}
 *  */
    @Test
    public void testIsEquivalentTo_ThatEqualsNull_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        boolean actual = functionType.isEquivalentTo(noType);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (that == null): True}
 *  */
    @Test
    public void testIsEquivalentTo_ThatEqualsNull() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        boolean actual = functionType.isEquivalentTo(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (that == null): False}
 * @utbot.executesCondition {@code (this.isConstructor()): False}
 * @utbot.executesCondition {@code (this.isInterface()): False}
 * @utbot.executesCondition {@code (that.isInterface()): True}
 *  */
    @Test
    public void testIsEquivalentTo_ThatIsInterface() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        boolean actual = functionType.isEquivalentTo(functionType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (that == null): False}
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
 * @utbot.executesCondition {@code (that == null): False}
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
 * @utbot.executesCondition {@code (that == null): False}
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
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        boolean actual = functionType.isEquivalentTo(functionType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (that == null): False}
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
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.isEquivalentTo(functionType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (that == null): False}
 * @utbot.executesCondition {@code (this.isConstructor()): False}
 * @utbot.executesCondition {@code (this.isInterface()): False}
 * @utbot.executesCondition {@code (that.isInterface()): False}
 * @utbot.executesCondition {@code (this.call.isEquivalentTo(that.call)): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ArrowType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return this.typeOfThis.isEquivalentTo(that.typeOfThis) && this.call.isEquivalentTo(that.call);}
 *  */
    @Test
    public void testIsEquivalentTo_NotThisCallIsEquivalentTo() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        boolean actual = functionType.isEquivalentTo(anonymousFunctionType);
        
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
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo(FunctionType.java:787) */
        functionType.isEquivalentTo(functionType);
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
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo(FunctionType.java:780) */
        functionType.isEquivalentTo(functionType1);
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
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        
        boolean actual = functionType.hasEqualCallType(noObjectType);
        
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
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NoType returnType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
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
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
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
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NoObjectType returnType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
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
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(returnType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
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
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(returnType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
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
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_5() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ErrorFunctionType returnType1 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(returnType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
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
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_6() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ErrorFunctionType returnType1 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(returnType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
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
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_14() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
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
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_10() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        boolean actual = functionType.hasEqualCallType(functionType1);
        
        assertTrue(actual);
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
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType);
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
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
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
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_7() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call2 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(returnType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(call2, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call2);
        
        boolean actual = functionType.hasEqualCallType(functionType1);
        
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
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
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
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_9() throws Exception  {
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
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(returnType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
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
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_15() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parameters1, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
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
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parameters1, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
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
            com.google.javascript.rhino.jstype.FunctionType.hasEqualCallType(FunctionType.java:797) */
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
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hasEqualCallType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.hasEqualCallType(FunctionType.java:797) */
        functionType.hasEqualCallType(noObjectType);
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
        FunctionType prototype = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
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
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.isSubtype
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSubtype(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsSubtype_ReturnTrue() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        UnresolvedTypeExpression unresolvedTypeExpression = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        
        boolean actual = functionType.isSubtype(unresolvedTypeExpression);
        
        assertTrue(actual);
    }
    
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
    public void testIsSubtype_ReturnTrue_4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        IndexedType indexedType = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NamedType referencedType3 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        UnknownType referencedType4 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        indexedType.setReferencedType(referencedType);
        
        boolean actual = functionType.isSubtype(indexedType);
        
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
        FunctionType resolveResult1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.resolveInternal] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.TemplateType cannot be cast to class com.google.javascript.rhino.jstype.ArrowType (com.google.javascript.rhino.jstype.TemplateType and com.google.javascript.rhino.jstype.ArrowType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @20b23a18)]
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:1016) */
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
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[38];
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        nativeTypes[35] = ((JSType) templateType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(call, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        RecordType resolveResult = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.resolveInternal] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.TemplateType cannot be cast to class com.google.javascript.rhino.jstype.ArrowType (com.google.javascript.rhino.jstype.TemplateType and com.google.javascript.rhino.jstype.ArrowType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @20b23a18)]
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:1016) */
        functionType.resolveInternal(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#safeResolve(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: prototype = (PrototypeObjectType) safeResolve(prototype, t, scope);
 *  */
    @Test
    public void testResolveInternal_ThrowClassCastException_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoType prototype = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(prototype, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        TemplateType resolveResult = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(prototype, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.resolveInternal] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.TemplateType cannot be cast to class com.google.javascript.rhino.jstype.PrototypeObjectType (com.google.javascript.rhino.jstype.TemplateType and com.google.javascript.rhino.jstype.PrototypeObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @20b23a18)]
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:1017) */
        functionType.resolveInternal(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: call = (ArrowType) safeResolve(call, t, scope);
 *  */
    @Test
    public void testResolveInternal_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(call, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NamedType resolveResult = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.resolveInternal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:843)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:1021)
            com.google.javascript.rhino.jstype.JSType.safeResolve(JSType.java:1058)
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:1016) */
        functionType.resolveInternal(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTopDefiningInterface(com.google.javascript.rhino.jstype.ObjectType, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getTopDefiningInterface(com.google.javascript.rhino.jstype.ObjectType,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#hasProperty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: type.hasProperty(propertyName)
 *  */
    @Test
    public void testGetTopDefiningInterface_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(FunctionType.java:725) */
        FunctionType.getTopDefiningInterface(null, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getTopDefiningInterface(com.google.javascript.rhino.jstype.ObjectType, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.FunctionType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getTopDefiningInterface(com.google.javascript.rhino.jstype.ObjectType,java.lang.String)}
     */
    @Test
    public void testGetTopDefiningInterfaceThrowsNPEWithNonEmptyString() {
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(null);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        ProxyObjectType proxyObjectType = new ProxyObjectType(null, null);
        PrototypeObjectType prototypeObjectType = new PrototypeObjectType(jSTypeRegistry, "10", proxyObjectType, false);
        JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(null, true);
        JSTypeRegistry.ResolveMode resolveMode1 = JSTypeRegistry.ResolveMode.IMMEDIATE;
        jSTypeRegistry1.setResolveMode(resolveMode1);
        Node node = new Node(-1, ((Node) null), ((Node) null));
        node.setType(Integer.MAX_VALUE);
        ArrowType arrowType = new ArrowType(null, null, null);
        arrowType.returnType = null;
        FunctionType functionType = new FunctionType(jSTypeRegistry1, "#$\\\"'", node, arrowType, null, "#$\\\"'", false, true);
        Node node1 = new Node(Integer.MAX_VALUE, ((Node) null), ((Node) null), -1, 1);
        node1.setType(1);
        functionType.setSource(node1);
        FunctionType functionType1 = new FunctionType(null, "10", null, null, null, "", true, false);
        functionType1.setSource(null);
        functionType1.setOwnerFunction(null);
        functionType.setOwnerFunction(functionType1);
        prototypeObjectType.setOwnerFunction(functionType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ObjectType.isUnknownType(ObjectType.java:502)
            com.google.javascript.rhino.jstype.PrototypeObjectType.hasProperty(PrototypeObjectType.java:171)
            com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(FunctionType.java:725) */
        FunctionType.getTopDefiningInterface(prototypeObjectType, "abc");
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getTopMostDefiningType
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getTopMostDefiningType(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getTopMostDefiningType(java.lang.String)}
 * @utbot.executesCondition {@code (Preconditions.checkState(isConstructor() || isInterface());): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(isConstructor() || isInterface());): False}
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
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces
    
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
            com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces(FunctionType.java:407) */
        functionType.getAllImplementedInterfaces();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getAllImplementedInterfaces()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(ObjectType type: getImplementedInterfaces())
 *  */
    @Test
    public void testGetAllImplementedInterfaces_ThrowNullPointerException_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoType prototype = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces(FunctionType.java:407) */
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
        FunctionType prototype = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoType implicitPrototypeFallback = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(prototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces(FunctionType.java:407) */
        functionType.getAllImplementedInterfaces();
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
    public void testGetImplementedInterfaces_ReturnImplementedInterfaces_3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoType prototype = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
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
    public void testGetImplementedInterfaces_ReturnImplementedInterfaces_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType prototype = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
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
        FunctionType prototype = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ErrorFunctionType implicitPrototypeFallback = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
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
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isConstructor()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getSuperClassConstructor()}
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
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[19] = ((JSType) unionType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getImplementedInterfaces] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.UnionType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.UnionType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @20b23a18)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:847)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:311)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:711)
            com.google.javascript.rhino.jstype.FunctionType.getImplementedInterfaces(FunctionType.java:431) */
        functionType.getImplementedInterfaces();
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
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(ObjectType type: implementedInterfaces)
 *  */
    @Test
    public void testSetImplementedInterfaces_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces(FunctionType.java:442) */
        functionType.setImplementedInterfaces(null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setImplementedInterfaces(java.util.List)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.iterates iterate the loop {@code for(ObjectType type: implementedInterfaces)} once
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
            com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces(FunctionType.java:443) */
        functionType.setImplementedInterfaces(arrayList);
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
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getExtendedInterfaces
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getExtendedInterfaces()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getExtendedInterfaces()}
 * @utbot.returnsFrom {@code return extendedInterfaces;}
 *  */
    @Test
    public void testGetExtendedInterfaces_ReturnExtendedInterfaces() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        Iterable actual = functionType.getExtendedInterfaces();
        
        assertNull(actual);
        
        List finalFunctionTypeExtendedInterfaces = ((List) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        
        assertNull(finalFunctionTypeExtendedInterfaces);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.hasImplementedInterfaces
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasImplementedInterfaces()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasImplementedInterfaces()}
 * @utbot.executesCondition {@code (!implementedInterfaces.isEmpty()): False}
 * @utbot.executesCondition {@code (isConstructor()): False}
 * @utbot.executesCondition {@code (superCtor != null): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasImplementedInterfaces_NotIsConstructor() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        ArrayList implementedInterfaces = new ArrayList();
        functionType.setImplementedInterfaces(implementedInterfaces);
        
        boolean actual = functionType.hasImplementedInterfaces();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasImplementedInterfaces()}
 * @utbot.executesCondition {@code (!implementedInterfaces.isEmpty()): False}
 * @utbot.executesCondition {@code (isConstructor()): True}
 * @utbot.executesCondition {@code (superCtor != null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getSuperClassConstructor()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasImplementedInterfaces_IsConstructor() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType prototype = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        ArrayList implementedInterfaces = new ArrayList();
        functionType.setImplementedInterfaces(implementedInterfaces);
        
        boolean actual = functionType.hasImplementedInterfaces();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasImplementedInterfaces()}
 * @utbot.executesCondition {@code (!implementedInterfaces.isEmpty()): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testHasImplementedInterfaces_NotImplementedInterfacesIsEmpty() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrayList implementedInterfaces = new ArrayList();
        implementedInterfaces.add(null);
        implementedInterfaces.add(null);
        implementedInterfaces.add(null);
        implementedInterfaces.add(null);
        implementedInterfaces.add(null);
        implementedInterfaces.add(null);
        implementedInterfaces.add(null);
        implementedInterfaces.add(null);
        implementedInterfaces.add(null);
        implementedInterfaces.add(null);
        functionType.setImplementedInterfaces(implementedInterfaces);
        
        boolean actual = functionType.hasImplementedInterfaces();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasImplementedInterfaces()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasImplementedInterfaces()}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !implementedInterfaces.isEmpty()
 *  */
    @Test
    public void testHasImplementedInterfaces_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hasImplementedInterfaces] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.hasImplementedInterfaces(FunctionType.java:205) */
        functionType.hasImplementedInterfaces();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getOwnPropertyNames
    
    ///region OTHER: ERROR SUITE for method getOwnPropertyNames()
    
    @Test
    public void testGetOwnPropertyNames1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType prototype = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getOwnPropertyNames] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.getOwnPropertyNames(PrototypeObjectType.java:181)
            com.google.javascript.rhino.jstype.FunctionType.getOwnPropertyNames(FunctionType.java:295) */
        functionType.getOwnPropertyNames();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getAllExtendedInterfaces
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAllExtendedInterfaces()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getAllExtendedInterfaces()}
 * @utbot.invokes {@link com.google.common.collect.Sets#newLinkedHashSet()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getExtendedInterfaces()}
 * @utbot.invokes {@link java.lang.Iterable#iterator()}
 * @utbot.returnsFrom {@code return extendedInterfaces;}
 *  */
    @Test
    public void testGetAllExtendedInterfaces_IterableIterator() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrayList extendedInterfaces = new ArrayList();
        functionType.setExtendedInterfaces(extendedInterfaces);
        
        LinkedHashSet actual = ((LinkedHashSet) functionType.getAllExtendedInterfaces());
        
        LinkedHashSet expected = new LinkedHashSet();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getAllExtendedInterfaces()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getAllExtendedInterfaces()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(ObjectType interfaceType: getExtendedInterfaces())
 *  */
    @Test
    public void testGetAllExtendedInterfaces_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getAllExtendedInterfaces] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getAllExtendedInterfaces(FunctionType.java:458) */
        functionType.getAllExtendedInterfaces();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getAllExtendedInterfaces()}
 * @utbot.invokes {@link java.lang.Iterable#iterator()}
 * @utbot.iterates iterate the loop {@code for(ObjectType interfaceType: getExtendedInterfaces())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: addRelatedExtendedInterfaces(interfaceType, extendedInterfaces);
 *  */
    @Test
    public void testGetAllExtendedInterfaces_ThrowNullPointerException_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrayList extendedInterfaces = new ArrayList();
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        functionType.setExtendedInterfaces(extendedInterfaces);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getAllExtendedInterfaces] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.addRelatedExtendedInterfaces(FunctionType.java:466)
            com.google.javascript.rhino.jstype.FunctionType.getAllExtendedInterfaces(FunctionType.java:459) */
        functionType.getAllExtendedInterfaces();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.setExtendedInterfaces
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setExtendedInterfaces(java.util.List)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setExtendedInterfaces(java.util.List)}
 * @utbot.executesCondition {@code (isInterface()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isInterface()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isInterface()
 *  */
    @Test
    public void testSetExtendedInterfaces_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.setExtendedInterfaces] produces [java.lang.NullPointerException]
            com.google.common.collect.ImmutableList.copyFromCollection(ImmutableList.java:291)
            com.google.common.collect.ImmutableList.copyOf(ImmutableList.java:260)
            com.google.javascript.rhino.jstype.FunctionType.setExtendedInterfaces(FunctionType.java:489) */
        functionType.setExtendedInterfaces(null);
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
            com.google.javascript.rhino.jstype.FunctionType.isReturnTypeInferred(FunctionType.java:267) */
        functionType.isReturnTypeInferred();
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
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getExtendedInterfacesCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getExtendedInterfacesCount()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getExtendedInterfacesCount()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.returnsFrom {@code return extendedInterfaces.size();}
 *  */
    @Test
    public void testGetExtendedInterfacesCount_ListSize() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrayList extendedInterfaces = new ArrayList();
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        functionType.setExtendedInterfaces(extendedInterfaces);
        
        int actual = functionType.getExtendedInterfacesCount();
        
        assertEquals(3, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getExtendedInterfacesCount()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getExtendedInterfacesCount()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return extendedInterfaces.size();
 *  */
    @Test
    public void testGetExtendedInterfacesCount_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getExtendedInterfacesCount] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getExtendedInterfacesCount(FunctionType.java:483) */
        functionType.getExtendedInterfacesCount();
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
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(noType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getDebugHashCodeStringOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:843)
            com.google.javascript.rhino.jstype.FunctionType.toDebugHashCodeString(FunctionType.java:1062)
            com.google.javascript.rhino.jstype.FunctionType.getDebugHashCodeStringOf(FunctionType.java:1097) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method getDebugHashCodeStringOfMethod = functionTypeClazz.getDeclaredMethod("getDebugHashCodeStringOf", noTypeType);
        getDebugHashCodeStringOfMethod.setAccessible(true);
        java.lang.Object[] getDebugHashCodeStringOfMethodArguments = new java.lang.Object[1];
        getDebugHashCodeStringOfMethodArguments[0] = noType;
        try {
            getDebugHashCodeStringOfMethod.invoke(functionType, getDebugHashCodeStringOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getDebugHashCodeStringOf(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#toDebugHashCodeString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return type.toDebugHashCodeString();
 *  */
    @Test
    public void testGetDebugHashCodeStringOf_ThrowNullPointerException() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getDebugHashCodeStringOf] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getDebugHashCodeStringOf(FunctionType.java:1097) */
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
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
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
    public void testTryMergeFunctionPiecewise_ReturnNull_3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        EnumElementType jsType1 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
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
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
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
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType);
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
    public void testTryMergeFunctionPiecewise_ReturnNull_4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType);
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
            com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(FunctionType.java:667) */
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
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ArrowType#hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: call.hasEqualParameters(other.call)
 *  */
    @Test
    public void testTryMergeFunctionPiecewise_ThrowNullPointerException_1() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(FunctionType.java:667) */
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
 * @utbot.executesCondition {@code (call.hasEqualParameters(other.call)): True}
 * @utbot.executesCondition {@code (leastSuper): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#getLeastSupertype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: call.returnType.getLeastSupertype(other.call.returnType)
 *  */
    @Test
    public void testTryMergeFunctionPiecewise_ThrowNullPointerException_2() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:599)
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:569)
            com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(FunctionType.java:676) */
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
 * @utbot.executesCondition {@code (call.hasEqualParameters(other.call)): True}
 * @utbot.executesCondition {@code (leastSuper): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#getGreatestSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: call.returnType.getGreatestSubtype(other.call.returnType)
 *  */
    @Test
    public void testTryMergeFunctionPiecewise_ThrowNullPointerException_3() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:599)
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:574)
            com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(FunctionType.java:677) */
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
 * @utbot.executesCondition {@code (call.hasEqualParameters(other.call)): True}
 * @utbot.executesCondition {@code (leastSuper): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#getGreatestSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: call.returnType.getGreatestSubtype(other.call.returnType)
 *  */
    @Test
    public void testTryMergeFunctionPiecewise_ThrowNullPointerException_4() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(FunctionType.java:677) */
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
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#tryMergeFunctionPiecewise(com.google.javascript.rhino.jstype.FunctionType,boolean)}
 * @utbot.executesCondition {@code (call.hasEqualParameters(other.call)): True}
 * @utbot.executesCondition {@code (leastSuper): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#getLeastSupertype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: call.returnType.getLeastSupertype(other.call.returnType)
 *  */
    @Test
    public void testTryMergeFunctionPiecewise_ThrowNullPointerException_5() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.tryMergeFunctionPiecewise(FunctionType.java:676) */
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
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.toMaybeFunctionType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toMaybeFunctionType()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#toMaybeFunctionType()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testToMaybeFunctionType_Return() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        FunctionType actual = functionType.toMaybeFunctionType();
        
        ArrowType actualCall = ((ArrowType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        assertNull(actualCall);
        
        PrototypeObjectType actualPrototype = ((PrototypeObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        assertNull(actualPrototype);
        
        SimpleSlot actualPrototypeSlot = ((SimpleSlot) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        assertNull(actualPrototypeSlot);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        FunctionType actualOwnerFunction = actual.getOwnerFunction();
        assertNull(actualOwnerFunction);
        
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
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:843)
            com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString(FunctionType.java:855) */
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
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isUnionType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: paramType.isUnionType()
 *  */
    @Test
    public void testAppendVarArgsString_ThrowNullPointerException() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString(FunctionType.java:852) */
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
            com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString(FunctionType.java:855) */
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
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:843)
            com.google.javascript.rhino.jstype.FunctionType.toDebugHashCodeString(FunctionType.java:1062) */
        functionType.toDebugHashCodeString();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#toDebugHashCodeString()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: this == registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE)
 *  */
    @Test
    public void testToDebugHashCodeString_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.toDebugHashCodeString] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.toDebugHashCodeString(FunctionType.java:1062) */
        functionType.toDebugHashCodeString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.setPrototypeBasedOn
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setPrototypeBasedOn(com.google.javascript.rhino.jstype.ObjectType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototypeBasedOn(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#hasReferenceName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: baseType.hasReferenceName() || baseType.isUnknownType() || isNativeObjectType() || baseType.isFunctionPrototypeType() || !(baseType instanceof PrototypeObjectType)
 *  */
    @Test
    public void testSetPrototypeBasedOn_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.setPrototypeBasedOn] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.setPrototypeBasedOn(FunctionType.java:340) */
        functionType.setPrototypeBasedOn(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.addRelatedExtendedInterfaces
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addRelatedExtendedInterfaces(com.google.javascript.rhino.jstype.ObjectType, java.util.Set)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#addRelatedExtendedInterfaces(com.google.javascript.rhino.jstype.ObjectType,java.util.Set)}
 *  */
    @Test
    public void testAddRelatedExtendedInterfaces() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class setType = Class.forName("java.util.Set");
        Method addRelatedExtendedInterfacesMethod = functionTypeClazz.getDeclaredMethod("addRelatedExtendedInterfaces", noTypeType, setType);
        addRelatedExtendedInterfacesMethod.setAccessible(true);
        java.lang.Object[] addRelatedExtendedInterfacesMethodArguments = new java.lang.Object[2];
        addRelatedExtendedInterfacesMethodArguments[0] = noType;
        addRelatedExtendedInterfacesMethodArguments[1] = ((Object) null);
        addRelatedExtendedInterfacesMethod.invoke(functionType, addRelatedExtendedInterfacesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#addRelatedExtendedInterfaces(com.google.javascript.rhino.jstype.ObjectType,java.util.Set)}
 *  */
    @Test
    public void testAddRelatedExtendedInterfaces_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class functionType1Type = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class setType = Class.forName("java.util.Set");
        Method addRelatedExtendedInterfacesMethod = functionTypeClazz.getDeclaredMethod("addRelatedExtendedInterfaces", functionType1Type, setType);
        addRelatedExtendedInterfacesMethod.setAccessible(true);
        java.lang.Object[] addRelatedExtendedInterfacesMethodArguments = new java.lang.Object[2];
        addRelatedExtendedInterfacesMethodArguments[0] = functionType1;
        addRelatedExtendedInterfacesMethodArguments[1] = ((Object) null);
        addRelatedExtendedInterfacesMethod.invoke(functionType, addRelatedExtendedInterfacesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#addRelatedExtendedInterfaces(com.google.javascript.rhino.jstype.ObjectType,java.util.Set)}
 *  */
    @Test
    public void testAddRelatedExtendedInterfaces_4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        NoObjectType primitiveObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(enumElementType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveObjectType", primitiveObjectType);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class setType = Class.forName("java.util.Set");
        Method addRelatedExtendedInterfacesMethod = functionTypeClazz.getDeclaredMethod("addRelatedExtendedInterfaces", enumElementTypeType, setType);
        addRelatedExtendedInterfacesMethod.setAccessible(true);
        java.lang.Object[] addRelatedExtendedInterfacesMethodArguments = new java.lang.Object[2];
        addRelatedExtendedInterfacesMethodArguments[0] = enumElementType;
        addRelatedExtendedInterfacesMethodArguments[1] = ((Object) null);
        addRelatedExtendedInterfacesMethod.invoke(functionType, addRelatedExtendedInterfacesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#addRelatedExtendedInterfaces(com.google.javascript.rhino.jstype.ObjectType,java.util.Set)}
 *  */
    @Test
    public void testAddRelatedExtendedInterfaces_5() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        FunctionType primitiveObjectType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(enumElementType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveObjectType", primitiveObjectType);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class setType = Class.forName("java.util.Set");
        Method addRelatedExtendedInterfacesMethod = functionTypeClazz.getDeclaredMethod("addRelatedExtendedInterfaces", enumElementTypeType, setType);
        addRelatedExtendedInterfacesMethod.setAccessible(true);
        java.lang.Object[] addRelatedExtendedInterfacesMethodArguments = new java.lang.Object[2];
        addRelatedExtendedInterfacesMethodArguments[0] = enumElementType;
        addRelatedExtendedInterfacesMethodArguments[1] = ((Object) null);
        addRelatedExtendedInterfacesMethod.invoke(functionType, addRelatedExtendedInterfacesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#addRelatedExtendedInterfaces(com.google.javascript.rhino.jstype.ObjectType,java.util.Set)}
 *  */
    @Test
    public void testAddRelatedExtendedInterfaces_6() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        UnknownType primitiveObjectType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(enumElementType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveObjectType", primitiveObjectType);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class setType = Class.forName("java.util.Set");
        Method addRelatedExtendedInterfacesMethod = functionTypeClazz.getDeclaredMethod("addRelatedExtendedInterfaces", enumElementTypeType, setType);
        addRelatedExtendedInterfacesMethod.setAccessible(true);
        java.lang.Object[] addRelatedExtendedInterfacesMethodArguments = new java.lang.Object[2];
        addRelatedExtendedInterfacesMethodArguments[0] = enumElementType;
        addRelatedExtendedInterfacesMethodArguments[1] = ((Object) null);
        addRelatedExtendedInterfacesMethod.invoke(functionType, addRelatedExtendedInterfacesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#addRelatedExtendedInterfaces(com.google.javascript.rhino.jstype.ObjectType,java.util.Set)}
 *  */
    @Test
    public void testAddRelatedExtendedInterfaces_3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class setType = Class.forName("java.util.Set");
        Method addRelatedExtendedInterfacesMethod = functionTypeClazz.getDeclaredMethod("addRelatedExtendedInterfaces", enumElementTypeType, setType);
        addRelatedExtendedInterfacesMethod.setAccessible(true);
        java.lang.Object[] addRelatedExtendedInterfacesMethodArguments = new java.lang.Object[2];
        addRelatedExtendedInterfacesMethodArguments[0] = enumElementType;
        addRelatedExtendedInterfacesMethodArguments[1] = ((Object) null);
        addRelatedExtendedInterfacesMethod.invoke(functionType, addRelatedExtendedInterfacesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#addRelatedExtendedInterfaces(com.google.javascript.rhino.jstype.ObjectType,java.util.Set)}
 *  */
    @Test
    public void testAddRelatedExtendedInterfaces_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        UnknownType unknownType = new UnknownType(null, false);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class unknownTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class setType = Class.forName("java.util.Set");
        Method addRelatedExtendedInterfacesMethod = functionTypeClazz.getDeclaredMethod("addRelatedExtendedInterfaces", unknownTypeType, setType);
        addRelatedExtendedInterfacesMethod.setAccessible(true);
        java.lang.Object[] addRelatedExtendedInterfacesMethodArguments = new java.lang.Object[2];
        addRelatedExtendedInterfacesMethodArguments[0] = unknownType;
        addRelatedExtendedInterfacesMethodArguments[1] = ((Object) null);
        addRelatedExtendedInterfacesMethod.invoke(functionType, addRelatedExtendedInterfacesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#addRelatedExtendedInterfaces(com.google.javascript.rhino.jstype.ObjectType,java.util.Set)}
 *  */
    @Test
    public void testAddRelatedExtendedInterfaces_7() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveObjectType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(enumElementType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveObjectType", primitiveObjectType);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class setType = Class.forName("java.util.Set");
        Method addRelatedExtendedInterfacesMethod = functionTypeClazz.getDeclaredMethod("addRelatedExtendedInterfaces", enumElementTypeType, setType);
        addRelatedExtendedInterfacesMethod.setAccessible(true);
        java.lang.Object[] addRelatedExtendedInterfacesMethodArguments = new java.lang.Object[2];
        addRelatedExtendedInterfacesMethodArguments[0] = enumElementType;
        addRelatedExtendedInterfacesMethodArguments[1] = ((Object) null);
        addRelatedExtendedInterfacesMethod.invoke(functionType, addRelatedExtendedInterfacesMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addRelatedExtendedInterfaces(com.google.javascript.rhino.jstype.ObjectType, java.util.Set)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#addRelatedExtendedInterfaces(com.google.javascript.rhino.jstype.ObjectType,java.util.Set)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#getConstructor()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FunctionType constructor = instance.getConstructor();
 *  */
    @Test
    public void testAddRelatedExtendedInterfaces_ThrowNullPointerException() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.addRelatedExtendedInterfaces] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.addRelatedExtendedInterfaces(FunctionType.java:466) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class setType = Class.forName("java.util.Set");
        Method addRelatedExtendedInterfacesMethod = functionTypeClazz.getDeclaredMethod("addRelatedExtendedInterfaces", objectTypeType, setType);
        addRelatedExtendedInterfacesMethod.setAccessible(true);
        java.lang.Object[] addRelatedExtendedInterfacesMethodArguments = new java.lang.Object[2];
        addRelatedExtendedInterfacesMethodArguments[0] = ((Object) null);
        addRelatedExtendedInterfacesMethodArguments[1] = ((Object) null);
        try {
            addRelatedExtendedInterfacesMethod.invoke(functionType, addRelatedExtendedInterfacesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSuperClassConstructor()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getSuperClassConstructor()}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(isConstructor() || isInterface());): False}
 * @utbot.executesCondition {@code (maybeSuperInstanceType == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetSuperClassConstructor_MaybeSuperInstanceTypeEqualsNull_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoType prototype = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
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
 * @utbot.executesCondition {@code (Preconditions.checkArgument(isConstructor() || isInterface());): False}
 * @utbot.executesCondition {@code (maybeSuperInstanceType == null): False}
 * @utbot.returnsFrom {@code return maybeSuperInstanceType.getConstructor();}
 *  */
    @Test
    public void testGetSuperClassConstructor_MaybeSuperInstanceTypeNotEqualsNull_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType prototype = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(prototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", prototype);
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
 * @utbot.executesCondition {@code (Preconditions.checkArgument(isConstructor() || isInterface());): True}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(isConstructor() || isInterface());): True}
 * @utbot.executesCondition {@code (maybeSuperInstanceType == null): False}
 * @utbot.returnsFrom {@code return maybeSuperInstanceType.getConstructor();}
 *  */
    @Test
    public void testGetSuperClassConstructor_MaybeSuperInstanceTypeNotEqualsNull() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType prototype = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoType implicitPrototypeFallback = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
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
 * @utbot.executesCondition {@code (Preconditions.checkArgument(isConstructor() || isInterface());): True}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(isConstructor() || isInterface());): True}
 * @utbot.executesCondition {@code (maybeSuperInstanceType == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetSuperClassConstructor_MaybeSuperInstanceTypeEqualsNull() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType prototype = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
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
 * @utbot.executesCondition {@code (Preconditions.checkArgument(isConstructor() || isInterface());): False}
 * @utbot.executesCondition {@code (maybeSuperInstanceType == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetSuperClassConstructor_MaybeSuperInstanceTypeEqualsNull_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType prototype = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
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
 * @utbot.executesCondition {@code (Preconditions.checkArgument(isConstructor() || isInterface());): True}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(isConstructor() || isInterface());): False}
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
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class setType = Class.forName("java.util.Set");
        Method addRelatedInterfacesMethod = functionTypeClazz.getDeclaredMethod("addRelatedInterfaces", noTypeType, setType);
        addRelatedInterfacesMethod.setAccessible(true);
        java.lang.Object[] addRelatedInterfacesMethodArguments = new java.lang.Object[2];
        addRelatedInterfacesMethodArguments[0] = noType;
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
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        NoObjectType primitiveObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(enumElementType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveObjectType", primitiveObjectType);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class setType = Class.forName("java.util.Set");
        Method addRelatedInterfacesMethod = functionTypeClazz.getDeclaredMethod("addRelatedInterfaces", enumElementTypeType, setType);
        addRelatedInterfacesMethod.setAccessible(true);
        java.lang.Object[] addRelatedInterfacesMethodArguments = new java.lang.Object[2];
        addRelatedInterfacesMethodArguments[0] = enumElementType;
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
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        FunctionType primitiveObjectType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(enumElementType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveObjectType", primitiveObjectType);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class setType = Class.forName("java.util.Set");
        Method addRelatedInterfacesMethod = functionTypeClazz.getDeclaredMethod("addRelatedInterfaces", enumElementTypeType, setType);
        addRelatedInterfacesMethod.setAccessible(true);
        java.lang.Object[] addRelatedInterfacesMethodArguments = new java.lang.Object[2];
        addRelatedInterfacesMethodArguments[0] = enumElementType;
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
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        UnknownType primitiveObjectType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(enumElementType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveObjectType", primitiveObjectType);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class setType = Class.forName("java.util.Set");
        Method addRelatedInterfacesMethod = functionTypeClazz.getDeclaredMethod("addRelatedInterfaces", enumElementTypeType, setType);
        addRelatedInterfacesMethod.setAccessible(true);
        java.lang.Object[] addRelatedInterfacesMethodArguments = new java.lang.Object[2];
        addRelatedInterfacesMethodArguments[0] = enumElementType;
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
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class setType = Class.forName("java.util.Set");
        Method addRelatedInterfacesMethod = functionTypeClazz.getDeclaredMethod("addRelatedInterfaces", enumElementTypeType, setType);
        addRelatedInterfacesMethod.setAccessible(true);
        java.lang.Object[] addRelatedInterfacesMethodArguments = new java.lang.Object[2];
        addRelatedInterfacesMethodArguments[0] = enumElementType;
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
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveObjectType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(enumElementType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveObjectType", primitiveObjectType);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class setType = Class.forName("java.util.Set");
        Method addRelatedInterfacesMethod = functionTypeClazz.getDeclaredMethod("addRelatedInterfaces", enumElementTypeType, setType);
        addRelatedInterfacesMethod.setAccessible(true);
        java.lang.Object[] addRelatedInterfacesMethodArguments = new java.lang.Object[2];
        addRelatedInterfacesMethodArguments[0] = enumElementType;
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
            com.google.javascript.rhino.jstype.FunctionType.addRelatedInterfaces(FunctionType.java:414) */
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
        
                java.lang.reflect.Method methodForGetDeclaredFields892702248475500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields892702248475500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass892702248491600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields892702248475500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass892702248491600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields892702249643300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields892702249643300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass892702249645500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields892702249643300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass892702249645500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields892702254134500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields892702254134500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass892702254136800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields892702254134500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass892702254136800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields892702255053200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields892702255053200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass892702255055000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields892702255053200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass892702255055000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

