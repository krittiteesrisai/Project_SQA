package com.google.javascript.rhino.jstype;

import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.FunctionNode;
import java.util.Set;
import java.util.LinkedHashSet;
import com.google.javascript.rhino.ScriptOrFnNode;
import com.google.javascript.rhino.ObjArray;
import com.google.javascript.rhino.ObjToIntMap;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import com.google.javascript.rhino.JSDocInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
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
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.FunctionType.toString(FunctionType.java:629) */
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
            com.google.javascript.rhino.jstype.FunctionType.toString(FunctionType.java:629) */
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
            com.google.javascript.rhino.jstype.FunctionType.toString(FunctionType.java:635) */
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
            com.google.javascript.rhino.jstype.FunctionType.toString(FunctionType.java:635) */
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
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.toString] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.toString(FunctionType.java:636) */
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
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getReferenceName()}
 * @utbot.invokes {@link java.lang.String#hashCode()}
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
    public void testHashCode_NotIsInterface_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        int actual = functionType.hashCode();
        
        assertEquals(0, actual);
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
            com.google.javascript.rhino.jstype.FunctionType.hashCode(FunctionType.java:614) */
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
            com.google.javascript.rhino.jstype.FunctionType.hashCode(FunctionType.java:614) */
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
            com.google.javascript.rhino.jstype.FunctionType.getReturnType(FunctionType.java:244) */
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
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        Object actual = functionType.getParameters();
        
        Object expected = createInstance("com.google.javascript.rhino.Node$SiblingNodeIterable");
        setField(expected, "com.google.javascript.rhino.Node$SiblingNodeIterable", "start", first);
        setField(expected, "com.google.javascript.rhino.Node$SiblingNodeIterable", "current", first);
        
        Node expectedStart = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node$SiblingNodeIterable", "start"));
        Node actualStart = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node$SiblingNodeIterable", "start"));
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
        
        ObjectType actualImplicitPrototype = actual.getImplicitPrototype();
        assertNull(actualImplicitPrototype);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
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
        
        ObjectType actualImplicitPrototype = actual.getImplicitPrototype();
        assertNull(actualImplicitPrototype);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
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
        
        ObjectType actualImplicitPrototype = actual.getImplicitPrototype();
        assertNull(actualImplicitPrototype);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
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
        setField(target, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
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
        
        ObjectType actualImplicitPrototype = actual.getImplicitPrototype();
        assertNull(actualImplicitPrototype);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
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
        setField(target, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
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
        
        ObjectType actualImplicitPrototype = actual.getImplicitPrototype();
        assertNull(actualImplicitPrototype);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
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
        ParameterizedType target = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(target, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
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
        
        ObjectType actualImplicitPrototype = actual.getImplicitPrototype();
        assertNull(actualImplicitPrototype);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
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
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(target, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
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
        
        ObjectType actualImplicitPrototype = actual.getImplicitPrototype();
        assertNull(actualImplicitPrototype);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
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
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(target, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
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
        
        ObjectType actualImplicitPrototype = actual.getImplicitPrototype();
        assertNull(actualImplicitPrototype);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
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
            com.google.javascript.rhino.jstype.FunctionType.visit(FunctionType.java:722) */
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
            com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor.applyCommonRestriction(SemanticReverseAbstractInterpreter.java:512)
            com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor.caseObjectType(SemanticReverseAbstractInterpreter.java:498)
            com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor.caseFunctionType(SemanticReverseAbstractInterpreter.java:508)
            com.google.javascript.jscomp.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor.caseFunctionType(SemanticReverseAbstractInterpreter.java:472)
            com.google.javascript.rhino.jstype.FunctionType.visit(FunctionType.java:722) */
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
            com.google.javascript.rhino.jstype.FunctionType.isReturnTypeInferred(FunctionType.java:248) */
        functionType.isReturnTypeInferred();
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
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototypeBasedOn(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.executesCondition {@code (prototype == null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isNativeObjectType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#setPrototype(com.google.javascript.rhino.jstype.FunctionPrototypeType)}
 *  */
    @Test
    public void testSetPrototypeBasedOn_PrototypeEqualsNull() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        functionType.setPrototypeBasedOn(null);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
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
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:113)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionType.setPrototypeBasedOn(FunctionType.java:277) */
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
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.setPrototypeBasedOn] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.NumberType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.NumberType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:113)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionType.setPrototypeBasedOn(FunctionType.java:277) */
        functionType.setPrototypeBasedOn(null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#setPrototypeBasedOn(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#setPrototype(com.google.javascript.rhino.jstype.FunctionPrototypeType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testSetPrototypeBasedOn_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.setPrototypeBasedOn] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.getConstructor(ProxyObjectType.java:271)
            com.google.javascript.rhino.jstype.TemplateType.getConstructor(TemplateType.java:49)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:533)
            com.google.javascript.rhino.jstype.FunctionType.setPrototype(FunctionType.java:300)
            com.google.javascript.rhino.jstype.FunctionType.setPrototypeBasedOn(FunctionType.java:275) */
        functionType.setPrototypeBasedOn(templateType);
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
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getSuperClassConstructor()}
 * @utbot.returnsFrom {@code return implementedInterfaces;}
 *  */
    @Test
    public void testGetImplementedInterfaces_FunctionTypeGetSuperClassConstructor() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        NoObjectType implicitPrototype = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        prototype.setImplicitPrototype(implicitPrototype);
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
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:113)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:263)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:529)
            com.google.javascript.rhino.jstype.FunctionType.getImplementedInterfaces(FunctionType.java:341) */
        functionType.getImplementedInterfaces();
    }
    
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
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[19] = ((JSType) unionType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getImplementedInterfaces] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.UnionType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.UnionType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:113)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:263)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:529)
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
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[32];
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
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        Iterable actual = functionType.getImplementedInterfaces();
        
        assertNull(actual);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        JSTypeRegistry jSTypeRegistry = functionType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeRegistryNativeTypes19 = ((JSType) get(jSTypeRegistryRegistryNativeTypes, 19));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
        
        assertNull(finalFunctionTypeRegistryNativeTypes19);
    }
    
    @Test
    public void testGetImplementedInterfaces2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[32];
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        nativeTypes[19] = ((JSType) errorFunctionType);
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
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getImplementedInterfaces()
    
    @Test
    public void testGetImplementedInterfaces3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        ParameterizedType implicitPrototype = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        prototype.setImplicitPrototype(implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getImplementedInterfaces] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.getConstructor(ProxyObjectType.java:271)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:533)
            com.google.javascript.rhino.jstype.FunctionType.getImplementedInterfaces(FunctionType.java:341) */
        functionType.getImplementedInterfaces();
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
    public void testAddRelatedInterfaces_3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoType referencedType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
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
    public void testAddRelatedInterfaces_4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ErrorFunctionType referencedType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
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
        UnresolvedTypeExpression referencedType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
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
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoObjectType referencedType1 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
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
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType7 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoObjectType referencedType8 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(referencedType7, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType8);
        setField(referencedType6, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType7);
        setField(referencedType5, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType6);
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
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
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType7 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        FunctionType referencedType8 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(referencedType7, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType8);
        setField(referencedType6, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType7);
        setField(referencedType5, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType6);
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
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
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
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
 * @utbot.invokes {@link com.google.common.collect.Sets#newHashSet()}
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
        
        HashSet actual = ((HashSet) functionType.getAllImplementedInterfaces());
        
        HashSet expected = new HashSet();
        
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
    public void testGetAllImplementedInterfaces_ThrowNullPointerException_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        NoObjectType implicitPrototype = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        prototype.setImplicitPrototype(implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
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
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        nativeTypes[19] = ((JSType) arrowType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.ArrowType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.ArrowType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:113)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:263)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:529)
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
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:113)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:263)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:529)
            com.google.javascript.rhino.jstype.FunctionType.getImplementedInterfaces(FunctionType.java:341)
            com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces(FunctionType.java:316) */
        functionType.getAllImplementedInterfaces();
    }
    
    @Test
    public void testGetAllImplementedInterfaces3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        nativeTypes[19] = ((JSType) namedType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.getConstructor(ProxyObjectType.java:271)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:533)
            com.google.javascript.rhino.jstype.FunctionType.setPrototype(FunctionType.java:300)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:263)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:529)
            com.google.javascript.rhino.jstype.FunctionType.getImplementedInterfaces(FunctionType.java:341)
            com.google.javascript.rhino.jstype.FunctionType.getAllImplementedInterfaces(FunctionType.java:316) */
        functionType.getAllImplementedInterfaces();
    }
    
    @Test
    public void testGetAllImplementedInterfaces4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        FunctionType implicitPrototype = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        prototype.setImplicitPrototype(implicitPrototype);
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
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.FunctionType.toDebugHashCodeString(FunctionType.java:829) */
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
            com.google.javascript.rhino.jstype.FunctionType.toDebugHashCodeString(FunctionType.java:829) */
        functionType.toDebugHashCodeString();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toDebugHashCodeString()
    
    @Test
    public void testToDebugHashCodeString1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.toDebugHashCodeString] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.toDebugHashCodeString(FunctionType.java:835) */
        functionType.toDebugHashCodeString();
    }
    
    @Test
    public void testToDebugHashCodeString2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[32];
        nativeTypes[13] = ((JSType) functionType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.toDebugHashCodeString] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.hashCode(FunctionType.java:614)
            com.google.javascript.rhino.jstype.JSType.toDebugHashCodeString(JSType.java:938)
            com.google.javascript.rhino.jstype.FunctionType.toDebugHashCodeString(FunctionType.java:830) */
        functionType.toDebugHashCodeString();
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
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString(FunctionType.java:672) */
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
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString(FunctionType.java:674) */
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class stringBuilderType = Class.forName("java.lang.StringBuilder");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method appendVarArgsStringMethod = functionTypeClazz.getDeclaredMethod("appendVarArgsString", stringBuilderType, noTypeType);
        appendVarArgsStringMethod.setAccessible(true);
        java.lang.Object[] appendVarArgsStringMethodArguments = new java.lang.Object[2];
        appendVarArgsStringMethodArguments[0] = ((Object) null);
        appendVarArgsStringMethodArguments[1] = noType;
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
            com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString(FunctionType.java:669) */
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
            com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString(FunctionType.java:672) */
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
        NumberType numberType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        nativeTypes[38] = ((JSType) numberType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionTypeBuilder.build(UnionTypeBuilder.java:169)
            com.google.javascript.rhino.jstype.UnionType.getRestrictedUnion(UnionType.java:392)
            com.google.javascript.rhino.jstype.FunctionType.appendVarArgsString(FunctionType.java:671) */
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
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getTopMostDefiningType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTopMostDefiningType(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#getTopMostDefiningType(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isConstructor()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isInterface()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(isConstructor() || isInterface());
 *  */
    @Test
    public void testGetTopMostDefiningType_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getTopMostDefiningType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:113)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:263)
            com.google.javascript.rhino.jstype.FunctionType.getTopMostDefiningType(FunctionType.java:570) */
        functionType.getTopMostDefiningType(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getTopMostDefiningType(java.lang.String)
    
    @Test
    public void testGetTopMostDefiningType1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        LinkedHashMap properties = new LinkedHashMap();
        Object property = createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType$Property");
        properties.put(null, property);
        setField(prototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        JSType actual = functionType.getTopMostDefiningType(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getTopMostDefiningType(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetTopMostDefiningType2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(prototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String string = "";
        
        functionType.getTopMostDefiningType(string);
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
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.FunctionType.toDebugHashCodeString(FunctionType.java:829)
            com.google.javascript.rhino.jstype.FunctionType.getDebugHashCodeStringOf(FunctionType.java:864) */
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
            com.google.javascript.rhino.jstype.FunctionType.getDebugHashCodeStringOf(FunctionType.java:864) */
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
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
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
        nativeTypes[13] = ((JSType) noType);
        nativeTypes[14] = ((JSType) templateType);
        nativeTypes[15] = ((JSType) templateType);
        nativeTypes[16] = ((JSType) templateType);
        nativeTypes[17] = ((JSType) templateType);
        nativeTypes[18] = ((JSType) templateType);
        nativeTypes[19] = ((JSType) templateType);
        nativeTypes[20] = ((JSType) templateType);
        nativeTypes[21] = ((JSType) templateType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(noType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method getDebugHashCodeStringOfMethod = functionTypeClazz.getDeclaredMethod("getDebugHashCodeStringOf", noTypeType);
        getDebugHashCodeStringOfMethod.setAccessible(true);
        java.lang.Object[] getDebugHashCodeStringOfMethodArguments = new java.lang.Object[1];
        getDebugHashCodeStringOfMethodArguments[0] = noType;
        String actual = ((String) getDebugHashCodeStringOfMethod.invoke(functionType, getDebugHashCodeStringOfMethodArguments));
        
        String expected = "{1671402289}";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetDebugHashCodeStringOf2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoType referencedType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[33];
        nativeTypes[13] = ((JSType) referencedType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(referencedType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method getDebugHashCodeStringOfMethod = functionTypeClazz.getDeclaredMethod("getDebugHashCodeStringOf", templateTypeType);
        getDebugHashCodeStringOfMethod.setAccessible(true);
        java.lang.Object[] getDebugHashCodeStringOfMethodArguments = new java.lang.Object[1];
        getDebugHashCodeStringOfMethodArguments[0] = templateType;
        String actual = ((String) getDebugHashCodeStringOfMethod.invoke(functionType, getDebugHashCodeStringOfMethodArguments));
        
        String expected = "{proxy:{1512721893}}";
        
        assertEquals(expected, actual);
        
        JSTypeRegistry jSTypeRegistry = templateType.referencedType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryReferencedTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTemplateTypeReferencedTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryReferencedTypeRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = templateType.referencedType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1ReferencedTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTemplateTypeReferencedTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1ReferencedTypeRegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = templateType.referencedType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2ReferencedTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTemplateTypeReferencedTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2ReferencedTypeRegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = templateType.referencedType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3ReferencedTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTemplateTypeReferencedTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3ReferencedTypeRegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = templateType.referencedType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4ReferencedTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTemplateTypeReferencedTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4ReferencedTypeRegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = templateType.referencedType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5ReferencedTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTemplateTypeReferencedTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5ReferencedTypeRegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = templateType.referencedType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6ReferencedTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTemplateTypeReferencedTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6ReferencedTypeRegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = templateType.referencedType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7ReferencedTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTemplateTypeReferencedTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7ReferencedTypeRegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = templateType.referencedType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8ReferencedTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTemplateTypeReferencedTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8ReferencedTypeRegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = templateType.referencedType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9ReferencedTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTemplateTypeReferencedTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9ReferencedTypeRegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = templateType.referencedType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10ReferencedTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTemplateTypeReferencedTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10ReferencedTypeRegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = templateType.referencedType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11ReferencedTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTemplateTypeReferencedTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11ReferencedTypeRegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = templateType.referencedType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12ReferencedTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTemplateTypeReferencedTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12ReferencedTypeRegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = templateType.referencedType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13ReferencedTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTemplateTypeReferencedTypeRegistryNativeTypes14 = ((JSType) get(jSTypeRegistry13ReferencedTypeRegistryNativeTypes, 14));
        JSTypeRegistry jSTypeRegistry14 = templateType.referencedType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry14ReferencedTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTemplateTypeReferencedTypeRegistryNativeTypes15 = ((JSType) get(jSTypeRegistry14ReferencedTypeRegistryNativeTypes, 15));
        JSTypeRegistry jSTypeRegistry15 = templateType.referencedType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry15ReferencedTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTemplateTypeReferencedTypeRegistryNativeTypes16 = ((JSType) get(jSTypeRegistry15ReferencedTypeRegistryNativeTypes, 16));
        JSTypeRegistry jSTypeRegistry16 = templateType.referencedType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry16ReferencedTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTemplateTypeReferencedTypeRegistryNativeTypes17 = ((JSType) get(jSTypeRegistry16ReferencedTypeRegistryNativeTypes, 17));
        JSTypeRegistry jSTypeRegistry17 = templateType.referencedType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry17ReferencedTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTemplateTypeReferencedTypeRegistryNativeTypes18 = ((JSType) get(jSTypeRegistry17ReferencedTypeRegistryNativeTypes, 18));
        JSTypeRegistry jSTypeRegistry18 = templateType.referencedType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry18ReferencedTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTemplateTypeReferencedTypeRegistryNativeTypes19 = ((JSType) get(jSTypeRegistry18ReferencedTypeRegistryNativeTypes, 19));
        JSTypeRegistry jSTypeRegistry19 = templateType.referencedType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry19ReferencedTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTemplateTypeReferencedTypeRegistryNativeTypes20 = ((JSType) get(jSTypeRegistry19ReferencedTypeRegistryNativeTypes, 20));
        JSTypeRegistry jSTypeRegistry20 = templateType.referencedType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry20ReferencedTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTemplateTypeReferencedTypeRegistryNativeTypes21 = ((JSType) get(jSTypeRegistry20ReferencedTypeRegistryNativeTypes, 21));
        JSTypeRegistry jSTypeRegistry21 = templateType.referencedType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry21ReferencedTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTemplateTypeReferencedTypeRegistryNativeTypes22 = ((JSType) get(jSTypeRegistry21ReferencedTypeRegistryNativeTypes, 22));
        JSTypeRegistry jSTypeRegistry22 = templateType.referencedType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry22ReferencedTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTemplateTypeReferencedTypeRegistryNativeTypes23 = ((JSType) get(jSTypeRegistry22ReferencedTypeRegistryNativeTypes, 23));
        JSTypeRegistry jSTypeRegistry23 = templateType.referencedType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry23ReferencedTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTemplateTypeReferencedTypeRegistryNativeTypes24 = ((JSType) get(jSTypeRegistry23ReferencedTypeRegistryNativeTypes, 24));
        JSTypeRegistry jSTypeRegistry24 = templateType.referencedType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry24ReferencedTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTemplateTypeReferencedTypeRegistryNativeTypes25 = ((JSType) get(jSTypeRegistry24ReferencedTypeRegistryNativeTypes, 25));
        JSTypeRegistry jSTypeRegistry25 = templateType.referencedType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry25ReferencedTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTemplateTypeReferencedTypeRegistryNativeTypes26 = ((JSType) get(jSTypeRegistry25ReferencedTypeRegistryNativeTypes, 26));
        JSTypeRegistry jSTypeRegistry26 = templateType.referencedType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry26ReferencedTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTemplateTypeReferencedTypeRegistryNativeTypes27 = ((JSType) get(jSTypeRegistry26ReferencedTypeRegistryNativeTypes, 27));
        JSTypeRegistry jSTypeRegistry27 = templateType.referencedType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry27ReferencedTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTemplateTypeReferencedTypeRegistryNativeTypes28 = ((JSType) get(jSTypeRegistry27ReferencedTypeRegistryNativeTypes, 28));
        JSTypeRegistry jSTypeRegistry28 = templateType.referencedType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry28ReferencedTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTemplateTypeReferencedTypeRegistryNativeTypes29 = ((JSType) get(jSTypeRegistry28ReferencedTypeRegistryNativeTypes, 29));
        JSTypeRegistry jSTypeRegistry29 = templateType.referencedType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry29ReferencedTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTemplateTypeReferencedTypeRegistryNativeTypes30 = ((JSType) get(jSTypeRegistry29ReferencedTypeRegistryNativeTypes, 30));
        JSTypeRegistry jSTypeRegistry30 = templateType.referencedType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry30ReferencedTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTemplateTypeReferencedTypeRegistryNativeTypes31 = ((JSType) get(jSTypeRegistry30ReferencedTypeRegistryNativeTypes, 31));
        JSTypeRegistry jSTypeRegistry31 = templateType.referencedType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry31ReferencedTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry31, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTemplateTypeReferencedTypeRegistryNativeTypes32 = ((JSType) get(jSTypeRegistry31ReferencedTypeRegistryNativeTypes, 32));
        
        assertNull(finalTemplateTypeReferencedTypeRegistryNativeTypes0);
        
        assertNull(finalTemplateTypeReferencedTypeRegistryNativeTypes1);
        
        assertNull(finalTemplateTypeReferencedTypeRegistryNativeTypes2);
        
        assertNull(finalTemplateTypeReferencedTypeRegistryNativeTypes3);
        
        assertNull(finalTemplateTypeReferencedTypeRegistryNativeTypes4);
        
        assertNull(finalTemplateTypeReferencedTypeRegistryNativeTypes5);
        
        assertNull(finalTemplateTypeReferencedTypeRegistryNativeTypes6);
        
        assertNull(finalTemplateTypeReferencedTypeRegistryNativeTypes7);
        
        assertNull(finalTemplateTypeReferencedTypeRegistryNativeTypes8);
        
        assertNull(finalTemplateTypeReferencedTypeRegistryNativeTypes9);
        
        assertNull(finalTemplateTypeReferencedTypeRegistryNativeTypes10);
        
        assertNull(finalTemplateTypeReferencedTypeRegistryNativeTypes11);
        
        assertNull(finalTemplateTypeReferencedTypeRegistryNativeTypes12);
        
        assertNull(finalTemplateTypeReferencedTypeRegistryNativeTypes14);
        
        assertNull(finalTemplateTypeReferencedTypeRegistryNativeTypes15);
        
        assertNull(finalTemplateTypeReferencedTypeRegistryNativeTypes16);
        
        assertNull(finalTemplateTypeReferencedTypeRegistryNativeTypes17);
        
        assertNull(finalTemplateTypeReferencedTypeRegistryNativeTypes18);
        
        assertNull(finalTemplateTypeReferencedTypeRegistryNativeTypes19);
        
        assertNull(finalTemplateTypeReferencedTypeRegistryNativeTypes20);
        
        assertNull(finalTemplateTypeReferencedTypeRegistryNativeTypes21);
        
        assertNull(finalTemplateTypeReferencedTypeRegistryNativeTypes22);
        
        assertNull(finalTemplateTypeReferencedTypeRegistryNativeTypes23);
        
        assertNull(finalTemplateTypeReferencedTypeRegistryNativeTypes24);
        
        assertNull(finalTemplateTypeReferencedTypeRegistryNativeTypes25);
        
        assertNull(finalTemplateTypeReferencedTypeRegistryNativeTypes26);
        
        assertNull(finalTemplateTypeReferencedTypeRegistryNativeTypes27);
        
        assertNull(finalTemplateTypeReferencedTypeRegistryNativeTypes28);
        
        assertNull(finalTemplateTypeReferencedTypeRegistryNativeTypes29);
        
        assertNull(finalTemplateTypeReferencedTypeRegistryNativeTypes30);
        
        assertNull(finalTemplateTypeReferencedTypeRegistryNativeTypes31);
        
        assertNull(finalTemplateTypeReferencedTypeRegistryNativeTypes32);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDebugHashCodeStringOf(com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testGetDebugHashCodeStringOf3() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoObjectType referencedType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null, null, null, null, null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(referencedType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getDebugHashCodeStringOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 6]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.FunctionType.toDebugHashCodeString(FunctionType.java:829)
            com.google.javascript.rhino.jstype.ProxyObjectType.toDebugHashCodeString(ProxyObjectType.java:297)
            com.google.javascript.rhino.jstype.TemplateType.toDebugHashCodeString(TemplateType.java:49)
            com.google.javascript.rhino.jstype.FunctionType.getDebugHashCodeStringOf(FunctionType.java:864) */
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
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getDebugHashCodeStringOf] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.toDebugHashCodeString(ProxyObjectType.java:297)
            com.google.javascript.rhino.jstype.TemplateType.toDebugHashCodeString(TemplateType.java:49)
            com.google.javascript.rhino.jstype.ProxyObjectType.toDebugHashCodeString(ProxyObjectType.java:297)
            com.google.javascript.rhino.jstype.TemplateType.toDebugHashCodeString(TemplateType.java:49)
            com.google.javascript.rhino.jstype.FunctionType.getDebugHashCodeStringOf(FunctionType.java:864) */
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
    public void testGetDebugHashCodeStringOf5() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        nativeTypes[13] = ((JSType) noObjectType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(noType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getDebugHashCodeStringOf] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.toDebugHashCodeString(FunctionType.java:835)
            com.google.javascript.rhino.jstype.FunctionType.getDebugHashCodeStringOf(FunctionType.java:864) */
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
    
    @Test
    public void testGetDebugHashCodeStringOf6() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoObjectType referencedType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[18];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(referencedType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getDebugHashCodeStringOf] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.toDebugHashCodeString(FunctionType.java:835)
            com.google.javascript.rhino.jstype.ProxyObjectType.toDebugHashCodeString(ProxyObjectType.java:297)
            com.google.javascript.rhino.jstype.TemplateType.toDebugHashCodeString(TemplateType.java:49)
            com.google.javascript.rhino.jstype.FunctionType.getDebugHashCodeStringOf(FunctionType.java:864) */
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
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasUnknownSupertype()
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasUnknownSupertype()}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testHasUnknownSupertype_ReturnFalse() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.hasUnknownSupertype();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasUnknownSupertype()}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testHasUnknownSupertype_ReturnFalse_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.hasUnknownSupertype();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasUnknownSupertype()}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testHasUnknownSupertype_ObjectTypeIsUnknownType() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        UnknownType implicitPrototype = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        prototype.setImplicitPrototype(implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        boolean actual = functionType.hasUnknownSupertype();
        
        assertTrue(actual);
        
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
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        functionType.setImplicitPrototype(prototype);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        boolean actual = functionType.hasUnknownSupertype();
        
        assertFalse(actual);
        
        boolean finalFunctionTypeUnknown = ((Boolean) getFieldValue(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        
        assertFalse(finalFunctionTypeUnknown);
    }
    
    @Test
    public void testHasUnknownSupertype2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        InstanceObjectType implicitPrototype = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        prototype.setImplicitPrototype(implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.hasUnknownSupertype();
        
        assertFalse(actual);
    }
    
    @Test
    public void testHasUnknownSupertype3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        TemplateType implicitPrototype = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(implicitPrototype, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        prototype.setImplicitPrototype(implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.hasUnknownSupertype();
        
        assertTrue(actual);
    }
    
    @Test
    public void testHasUnknownSupertype4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        InstanceObjectType implicitPrototype = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        prototype.setImplicitPrototype(implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoObjectType implicitPrototype1 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(implicitPrototype1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType.setImplicitPrototype(implicitPrototype1);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        boolean actual = functionType.hasUnknownSupertype();
        
        assertFalse(actual);
        
        boolean finalFunctionTypeUnknown = ((Boolean) getFieldValue(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        
        assertFalse(finalFunctionTypeUnknown);
    }
    
    @Test
    public void testHasUnknownSupertype5() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        TemplateType implicitPrototype = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnresolvedTypeExpression referencedType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(implicitPrototype, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        prototype.setImplicitPrototype(implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoObjectType implicitPrototype1 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(implicitPrototype1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType.setImplicitPrototype(implicitPrototype1);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        boolean actual = functionType.hasUnknownSupertype();
        
        assertTrue(actual);
        
        boolean finalFunctionTypeUnknown = ((Boolean) getFieldValue(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        
        assertFalse(finalFunctionTypeUnknown);
    }
    
    @Test
    public void testHasUnknownSupertype6() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        InstanceObjectType implicitPrototype = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        prototype.setImplicitPrototype(implicitPrototype);
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
    
    ///region OTHER: ERROR SUITE for method hasUnknownSupertype()
    
    @Test
    public void testHasUnknownSupertype7() throws Exception  {
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
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.AllType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.AllType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:113)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:263)
            com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype(FunctionType.java:548) */
        functionType.hasUnknownSupertype();
    }
    
    @Test
    public void testHasUnknownSupertype8() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null, null, null, null, null, null, null, null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 9]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:113)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:263)
            com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype(FunctionType.java:548) */
        functionType.hasUnknownSupertype();
    }
    
    @Test
    public void testHasUnknownSupertype9() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionPrototypeType implicitPrototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        functionType.setImplicitPrototype(implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:113)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:263)
            com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype(FunctionType.java:548) */
        functionType.hasUnknownSupertype();
    }
    
    @Test
    public void testHasUnknownSupertype10() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType implicitPrototype = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        functionType.setImplicitPrototype(implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:113)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:263)
            com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype(FunctionType.java:548) */
        functionType.hasUnknownSupertype();
    }
    
    @Test
    public void testHasUnknownSupertype11() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        NamedType implicitPrototype = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        prototype.setImplicitPrototype(implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:95)
            com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype(FunctionType.java:552) */
        functionType.hasUnknownSupertype();
    }
    
    @Test
    public void testHasUnknownSupertype12() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoObjectType implicitPrototype = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(implicitPrototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType.setImplicitPrototype(implicitPrototype);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:113)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:263)
            com.google.javascript.rhino.jstype.FunctionType.hasUnknownSupertype(FunctionType.java:548) */
        functionType.hasUnknownSupertype();
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
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.cloneWithNewReturnType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method cloneWithNewReturnType(com.google.javascript.rhino.jstype.JSType, boolean)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#cloneWithNewReturnType(com.google.javascript.rhino.jstype.JSType,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testCloneWithNewReturnType_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.cloneWithNewReturnType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:111)
            com.google.javascript.rhino.jstype.ArrowType.<init>(ArrowType.java:77)
            com.google.javascript.rhino.jstype.FunctionType.cloneWithNewReturnType(FunctionType.java:516) */
        functionType.cloneWithNewReturnType(null, false);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#cloneWithNewReturnType(com.google.javascript.rhino.jstype.JSType,boolean)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return new FunctionType(registry, null, null, new ArrowType(registry, call.parameters, newReturnType, inferred), typeOfThis, null, false, false);
 *  */
    @Test
    public void testCloneWithNewReturnType_ThrowClassCastException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
        AllType allType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        nativeTypes[13] = ((JSType) allType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.cloneWithNewReturnType] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.AllType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.AllType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:128)
            com.google.javascript.rhino.jstype.FunctionType.cloneWithNewReturnType(FunctionType.java:516) */
        functionType.cloneWithNewReturnType(templateType, false);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#cloneWithNewReturnType(com.google.javascript.rhino.jstype.JSType,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testCloneWithNewReturnType_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.cloneWithNewReturnType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:111)
            com.google.javascript.rhino.jstype.ArrowType.<init>(ArrowType.java:74)
            com.google.javascript.rhino.jstype.FunctionType.cloneWithNewReturnType(FunctionType.java:516) */
        functionType.cloneWithNewReturnType(null, false);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#cloneWithNewReturnType(com.google.javascript.rhino.jstype.JSType,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testCloneWithNewReturnType_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.cloneWithNewReturnType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:128)
            com.google.javascript.rhino.jstype.FunctionType.cloneWithNewReturnType(FunctionType.java:516) */
        functionType.cloneWithNewReturnType(templateType, false);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#cloneWithNewReturnType(com.google.javascript.rhino.jstype.JSType,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new FunctionType(registry, null, null, new ArrowType(registry, call.parameters, newReturnType, inferred), typeOfThis, null, false, false);
 *  */
    @Test
    public void testCloneWithNewReturnType_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.cloneWithNewReturnType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.cloneWithNewReturnType(FunctionType.java:516) */
        functionType.cloneWithNewReturnType(null, false);
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
            com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces(FunctionType.java:352) */
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
            com.google.javascript.rhino.jstype.FunctionType.setImplementedInterfaces(FunctionType.java:353) */
        functionType.setImplementedInterfaces(arrayList);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSuperClassConstructor()
    
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
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        NoObjectType implicitPrototype = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        prototype.setImplicitPrototype(implicitPrototype);
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
 * @utbot.executesCondition {@code (maybeSuperInstanceType == null): False}
 * @utbot.returnsFrom {@code return maybeSuperInstanceType.getConstructor();}
 *  */
    @Test
    public void testGetSuperClassConstructor_MaybeSuperInstanceTypeNotEqualsNull_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        FunctionType implicitPrototype = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        prototype.setImplicitPrototype(implicitPrototype);
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
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
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
    public void testGetSuperClassConstructor_PreconditionsCheckArgument() throws Exception  {
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
        AllType allType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        nativeTypes[13] = ((JSType) allType);
        setField(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.forInterface] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.AllType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.AllType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:150)
            com.google.javascript.rhino.jstype.FunctionType.forInterface(FunctionType.java:163) */
        FunctionType.forInterface(jSTypeRegistry, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#forInterface(com.google.javascript.rhino.jstype.JSTypeRegistry,java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testForInterface_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        JSTypeRegistry jSTypeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.forInterface] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:150)
            com.google.javascript.rhino.jstype.FunctionType.forInterface(FunctionType.java:163) */
        FunctionType.forInterface(jSTypeRegistry, null, null);
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
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.isInstanceType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 46 out of bounds for length 2]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.FunctionType.isInstanceType(FunctionType.java:169) */
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
            com.google.javascript.rhino.jstype.FunctionType.isInstanceType(FunctionType.java:169) */
        functionType.isInstanceType();
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
            com.google.javascript.rhino.jstype.FunctionType.getParametersNode(FunctionType.java:208) */
        functionType.getParametersNode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.hasOwnProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasOwnProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasOwnProperty(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#hasOwnProperty(java.lang.String)}
 * @utbot.returnsFrom {@code return super.hasOwnProperty(name) || "prototype".equals(name);}
 *  */
    @Test
    public void testHasOwnProperty_SuperHasOwnPropertyOrPrototypeEquals() throws Exception  {
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
        
        ObjectType actualImplicitPrototype = actual.getImplicitPrototype();
        assertNull(actualImplicitPrototype);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
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
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:497)
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
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:475)
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
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:497)
            com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype(FunctionType.java:453) */
        functionType.getLeastSupertype(errorFunctionType);
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
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:499)
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
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object kind1 = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getLeastSupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:497)
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
        
        ObjectType actualImplicitPrototype = actual.getImplicitPrototype();
        assertNull(actualImplicitPrototype);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
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
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:497) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isFunctionType() && that.isFunctionType()
 *  */
    @Test
    public void testSupAndInfHelper_ThrowNullPointerException() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:475) */
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
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: functionInstance.isEquivalentTo(that)
 *  */
    @Test
    public void testSupAndInfHelper_ThrowNullPointerException_1() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object kind1 = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:499) */
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
            com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo(FunctionType.java:601)
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:476) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType functionInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
 *  */
    @Test
    public void testSupAndInfHelper_ThrowNullPointerException_3() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:497) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType functionInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
 *  */
    @Test
    public void testSupAndInfHelper_ThrowNullPointerException_4() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:497) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType functionInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
 *  */
    @Test
    public void testSupAndInfHelper_ThrowNullPointerException_5() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ErrorFunctionType typeOfThis = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:497) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType functionInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
 *  */
    @Test
    public void testSupAndInfHelper_ThrowNullPointerException_7() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:497) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType functionInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
 *  */
    @Test
    public void testSupAndInfHelper_ThrowNullPointerException_6() throws Throwable  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ArrowType.hasEqualParameters(ArrowType.java:149)
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:486) */
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
        NoObjectType implicitPrototype = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        functionPrototypeType.setImplicitPrototype(implicitPrototype);
        
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
        FunctionType implicitPrototype = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        functionPrototypeType.setImplicitPrototype(implicitPrototype);
        
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
    public void testSetPrototype_PrototypeNotEqualsNull_4() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionPrototypeType functionPrototypeType = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        TemplateType implicitPrototype = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoObjectType referencedType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(implicitPrototype, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        functionPrototypeType.setImplicitPrototype(implicitPrototype);
        
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
        TemplateType implicitPrototype = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        FunctionType referencedType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(implicitPrototype, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        functionPrototypeType.setImplicitPrototype(implicitPrototype);
        
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
        TemplateType implicitPrototype = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(implicitPrototype, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        functionPrototypeType.setImplicitPrototype(implicitPrototype);
        
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
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionPrototypeType functionPrototypeType = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        NoObjectType implicitPrototype = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        functionPrototypeType.setImplicitPrototype(implicitPrototype);
        
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
        UnknownType implicitPrototype = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        functionPrototypeType.setImplicitPrototype(implicitPrototype);
        
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
        TemplateType implicitPrototype = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoObjectType referencedType1 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(implicitPrototype, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        functionPrototypeType.setImplicitPrototype(implicitPrototype);
        
        FunctionPrototypeType initialFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        boolean actual = functionType.setPrototype(functionPrototypeType);
        
        assertTrue(actual);
        
        FunctionPrototypeType finalFunctionTypePrototype = ((FunctionPrototypeType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialFunctionTypePrototype == finalFunctionTypePrototype);
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
        
        ObjectType actualImplicitPrototype = actual.getImplicitPrototype();
        assertNull(actualImplicitPrototype);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
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
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:497)
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
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:475)
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:458) */
        functionType.getGreatestSubtype(null);
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
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object kind1 = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:497)
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:458) */
        functionType.getGreatestSubtype(anonymousFunctionType);
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
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.supAndInfHelper(FunctionType.java:499)
            com.google.javascript.rhino.jstype.FunctionType.getGreatestSubtype(FunctionType.java:458) */
        functionType.getGreatestSubtype(anonymousFunctionType);
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
        
        ObjectType actualImplicitPrototype = actual.getImplicitPrototype();
        assertNull(actualImplicitPrototype);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
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
 * @utbot.executesCondition {@code (prototype == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: setPrototype(new FunctionPrototypeType(registry, this, null));
 *  */
    @Test
    public void testGetPrototype_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getPrototype] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:113)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:55)
            com.google.javascript.rhino.jstype.FunctionPrototypeType.<init>(FunctionPrototypeType.java:62)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:263) */
        functionType.getPrototype();
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
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
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
        setField(parameters, "com.google.javascript.rhino.Node", "last", parameters);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "intValue", -255);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(parameters, "com.google.javascript.rhino.Node", "propListHead", propListHead);
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
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
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
    public void testGetMaxArguments_ReturnParamsGetChildCount_3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters, "com.google.javascript.rhino.Node", "last", last);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        int actual = functionType.getMaxArguments();
        
        assertEquals(1, actual);
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
    public void testIsEquivalentTo_ThisTypeOfThisIsEquivalentToAndThisCallIsEquivalentTo() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
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
 * @utbot.executesCondition {@code (this.isInterface()): False}
 * @utbot.executesCondition {@code (that.isInterface()): False}
 * @utbot.returnsFrom {@code return this.typeOfThis.isEquivalentTo(that.typeOfThis) && this.call.isEquivalentTo(that.call);}
 *  */
    @Test
    public void testIsEquivalentTo_ThisTypeOfThisIsEquivalentToAndThisCallIsEquivalentTo_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        TemplateType typeOfThis = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoObjectType referencedType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(typeOfThis, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        TemplateType typeOfThis1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        
        Object initialFunctionTypeKind = getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        
        boolean actual = functionType.isEquivalentTo(errorFunctionType);
        
        assertFalse(actual);
        
        Object finalFunctionTypeKind = getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        
        assertFalse(initialFunctionTypeKind == finalFunctionTypeKind);
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
    public void testIsEquivalentTo_ThatIsInterface() throws Exception  {
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
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        boolean actual = functionType.isEquivalentTo(anonymousFunctionType);
        
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
    public void testIsEquivalentTo_ThisTypeOfThisIsEquivalentToAndThisCallIsEquivalentTo_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoObjectType returnType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        UnresolvedTypeExpression jsType1 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
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
 * @utbot.executesCondition {@code (this.call.isEquivalentTo(that.call)): False}
 * @utbot.returnsFrom {@code return this.typeOfThis.isEquivalentTo(that.typeOfThis) && this.call.isEquivalentTo(that.call);}
 *  */
    @Test
    public void testIsEquivalentTo_NotThisCallIsEquivalentTo_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters, "com.google.javascript.rhino.Node", "next", next);
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        Object kind1 = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType);
        
        Object initialErrorFunctionTypeKind = getFieldValue(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        
        boolean actual = functionType.isEquivalentTo(errorFunctionType);
        
        assertFalse(actual);
        
        Object finalErrorFunctionTypeKind = getFieldValue(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        
        assertFalse(initialErrorFunctionTypeKind == finalErrorFunctionTypeKind);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isEquivalentTo(com.google.javascript.rhino.jstype.JSType)
    
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
    public void testIsEquivalentTo_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo(FunctionType.java:601) */
        functionType.isEquivalentTo(errorFunctionType);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (this.isInterface()): False}
 * @utbot.executesCondition {@code (that.isInterface()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isInterface()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ArrowType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.call.isEquivalentTo(that.call)
 *  */
    @Test
    public void testIsEquivalentTo_ThrowNullPointerException_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        TemplateType typeOfThis = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo(FunctionType.java:609) */
        functionType.isEquivalentTo(errorFunctionType);
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
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_8() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnTypeInferred", true);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
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
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_18() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NoType returnType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
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
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
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
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_17() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
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
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "INTERFACE");
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
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
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
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_6() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
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
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_11() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
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
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_14() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        NoObjectType jsType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        TemplateType jsType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
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
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_16() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        FunctionType referencedType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoObjectType returnType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        TemplateType jsType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType1);
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
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_5() throws Exception  {
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
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_7() throws Exception  {
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
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_9() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoObjectType returnType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(parameters1, "com.google.javascript.rhino.Node", "jsType", jsType);
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
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_10() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", first);
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
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_12() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ScriptOrFnNode parameters1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
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
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_13() throws Exception  {
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
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", first);
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
    public void testHasEqualCallType_ReturnThisCallIsEquivalentTo_15() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        NoObjectType jsType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
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
            com.google.javascript.rhino.jstype.FunctionType.hasEqualCallType(FunctionType.java:618) */
        functionType.hasEqualCallType(null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.call.isEquivalentTo(otherType.call);
 *  */
    @Test
    public void testHasEqualCallType_ThrowNullPointerException_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hasEqualCallType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.hasEqualCallType(FunctionType.java:618) */
        functionType.hasEqualCallType(functionType1);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#hasEqualCallType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ArrowType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return this.call.isEquivalentTo(otherType.call);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.call.isEquivalentTo(otherType.call);
 *  */
    @Test
    public void testHasEqualCallType_ThrowNullPointerException_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionType returnType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(returnType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(returnType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.hasEqualCallType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo(FunctionType.java:601)
            com.google.javascript.rhino.jstype.ArrowType.isEquivalentTo(ArrowType.java:180)
            com.google.javascript.rhino.jstype.FunctionType.hasEqualCallType(FunctionType.java:618) */
        functionType.hasEqualCallType(noObjectType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.FunctionType.isSubtype
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSubtype(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (this.isEquivalentTo(that)): True}
 *  */
    @Test
    public void testIsSubtype_ThisIsEquivalentTo() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.isSubtype(functionType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (this.isEquivalentTo(that)): False}
 * @utbot.executesCondition {@code (that.isFunctionType()): True}
 * @utbot.executesCondition {@code (((FunctionType) that).isInterface()): True}
 *  */
    @Test
    public void testIsSubtype_FunctionTypethatIsInterface() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object kind1 = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        boolean actual = functionType.isSubtype(anonymousFunctionType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (this.isEquivalentTo(that)): False}
 * @utbot.executesCondition {@code (that.isFunctionType()): True}
 * @utbot.executesCondition {@code (((FunctionType) that).isInterface()): False}
 * @utbot.executesCondition {@code (this.isInterface()): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsSubtype_ThisIsInterface() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object kind1 = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        boolean actual = functionType.isSubtype(anonymousFunctionType);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (this.isEquivalentTo(that)): False}
 * @utbot.executesCondition {@code (that.isFunctionType()): True}
 * @utbot.executesCondition {@code (((FunctionType) that).isInterface()): False}
 * @utbot.executesCondition {@code (this.isInterface()): False}
 * @utbot.executesCondition {@code (this.call.isSubtype(other.call)): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isConstructor()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ArrowType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return (this.isConstructor() || other.isConstructor() || other.typeOfThis.isSubtype(this.typeOfThis) || this.typeOfThis.isSubtype(other.typeOfThis)) && this.call.isSubtype(other.call);}
 *  */
    @Test
    public void testIsSubtype_NotThisCallIsSubtype() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.isSubtype(anonymousFunctionType);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (this.isEquivalentTo(that)): True}
 *  */
    @Test
    public void testIsSubtype_ThisIsEquivalentTo_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        
        boolean actual = functionType.isSubtype(anonymousFunctionType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (this.isEquivalentTo(that)): False}
 * @utbot.executesCondition {@code (that.isFunctionType()): True}
 * @utbot.executesCondition {@code (((FunctionType) that).isInterface()): True}
 *  */
    @Test
    public void testIsSubtype_FunctionTypethatIsInterface_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.isSubtype(anonymousFunctionType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (this.isEquivalentTo(that)): True}
 *  */
    @Test
    public void testIsSubtype_ThisIsEquivalentTo_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        FunctionNode parameters1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        Object kind1 = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType);
        
        Object initialFunctionTypeKind = getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        
        boolean actual = functionType.isSubtype(errorFunctionType);
        
        assertFalse(actual);
        
        Object finalFunctionTypeKind = getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        
        assertFalse(initialFunctionTypeKind == finalFunctionTypeKind);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isSubtype(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (that.isFunctionType()): False}
 * @utbot.executesCondition {@code (that instanceof UnionType): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getNativeType(JSTypeNative.FUNCTION_PROTOTYPE).isSubtype(that);
 *  */
    @Test
    public void testIsSubtype_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.isSubtype] produces [java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:111)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:717) */
        functionType.isSubtype(noType);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isFunctionType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: that.isFunctionType()
 *  */
    @Test
    public void testIsSubtype_ThrowNullPointerException() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:687) */
        functionType.isSubtype(null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (that.isFunctionType()): True}
 * @utbot.executesCondition {@code (((FunctionType) that).isInterface()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return true;
 *  */
    @Test
    public void testIsSubtype_ThrowNullPointerException_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo(FunctionType.java:601)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:684) */
        functionType.isSubtype(errorFunctionType);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (that.isFunctionType()): False}
 * @utbot.executesCondition {@code (that instanceof UnionType): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getNativeType(JSTypeNative.FUNCTION_PROTOTYPE).isSubtype(that);
 *  */
    @Test
    public void testIsSubtype_ThrowNullPointerException_3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[15];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:717) */
        functionType.isSubtype(noObjectType);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.FunctionType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (that.isFunctionType()): True}
 * @utbot.executesCondition {@code (((FunctionType) that).isInterface()): False}
 * @utbot.executesCondition {@code (this.isInterface()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isInterface()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isConstructor()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ArrowType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.call.isSubtype(other.call)
 *  */
    @Test
    public void testIsSubtype_ThrowNullPointerException_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:707) */
        functionType.isSubtype(anonymousFunctionType);
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
        
        ObjectType actualReferencedType = actual.referencedType;
        assertNull(actualReferencedType);
        
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
        
        ObjectType actualImplicitPrototype = actual.getImplicitPrototype();
        assertNull(actualImplicitPrototype);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
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
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.NumberType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.NumberType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis(FunctionType.java:752) */
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
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis(FunctionType.java:752) */
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
            com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis(FunctionType.java:751) */
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
            com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis(FunctionType.java:752) */
        functionType.getTypeOfThis();
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
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.resolveInternal] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.TemplateType cannot be cast to class com.google.javascript.rhino.jstype.ArrowType (com.google.javascript.rhino.jstype.TemplateType and com.google.javascript.rhino.jstype.ArrowType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:802) */
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
        TemplateType resolveResult = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(prototype, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        EnumType resolveResult1 = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult1);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.resolveInternal] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.TemplateType cannot be cast to class com.google.javascript.rhino.jstype.FunctionPrototypeType (com.google.javascript.rhino.jstype.TemplateType and com.google.javascript.rhino.jstype.FunctionPrototypeType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:803) */
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
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[40];
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        nativeTypes[35] = ((JSType) noObjectType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(call, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        IndexedType resolveResult = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.resolveInternal] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.NoObjectType cannot be cast to class com.google.javascript.rhino.jstype.ArrowType (com.google.javascript.rhino.jstype.NoObjectType and com.google.javascript.rhino.jstype.ArrowType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:802) */
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
        NoType resolveResult = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.FunctionType.resolveInternal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:883)
            com.google.javascript.rhino.jstype.JSType.safeResolve(JSType.java:920)
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:803) */
        functionType.resolveInternal(null, null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields911234191019500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields911234191019500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass911234191024800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields911234191019500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass911234191024800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields911234192331300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields911234192331300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass911234192333900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields911234192331300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass911234192333900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields911234195449800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields911234195449800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass911234195452600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields911234195449800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass911234195452600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields911234195896100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields911234195896100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass911234195898100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields911234195896100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass911234195898100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

