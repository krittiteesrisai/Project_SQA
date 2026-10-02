package com.google.javascript.rhino.jstype;

import org.junit.Test;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListMap;
import sun.security.util.ByteArrayLexOrder;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode;
import java.util.Map;
import com.google.javascript.rhino.Node;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.SortedMap;
import com.google.javascript.rhino.JSDocInfo;
import java.util.Collection;
import com.google.javascript.rhino.jstype.ObjectType.Property;
import java.util.List;
import com.google.javascript.rhino.ErrorReporter;
import java.util.Set;
import com.google.common.collect.Multimap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static java.lang.reflect.Array.get;
import static java.util.Collections.emptyMap;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static java.util.Collections.emptyList;
import static org.junit.Assert.assertEquals;

public final class com_google_javascript_rhino_jstype_RecordTypeTest {
    ///region Test suites for executable com.google.javascript.rhino.jstype.RecordType.getImplicitPrototype
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getImplicitPrototype()
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#getImplicitPrototype()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.returnsFrom {@code return registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);}
 *  */
    @Test
    public void testGetImplicitPrototype_JSTypeRegistryGetNativeObjectType() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[36];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(recordType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        ObjectType actual = recordType.getImplicitPrototype();
        
        assertNull(actual);
        
        JSTypeRegistry jSTypeRegistry = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes0 = ((JSType) get(jSTypeRegistryRegistryNativeTypes, 0));
        JSTypeRegistry jSTypeRegistry1 = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes1 = ((JSType) get(jSTypeRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry jSTypeRegistry2 = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes2 = ((JSType) get(jSTypeRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry jSTypeRegistry3 = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes3 = ((JSType) get(jSTypeRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry jSTypeRegistry4 = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes4 = ((JSType) get(jSTypeRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry jSTypeRegistry5 = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes5 = ((JSType) get(jSTypeRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry jSTypeRegistry6 = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes6 = ((JSType) get(jSTypeRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry jSTypeRegistry7 = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes7 = ((JSType) get(jSTypeRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry jSTypeRegistry8 = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes8 = ((JSType) get(jSTypeRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry jSTypeRegistry9 = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes9 = ((JSType) get(jSTypeRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry jSTypeRegistry10 = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes10 = ((JSType) get(jSTypeRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry jSTypeRegistry11 = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes11 = ((JSType) get(jSTypeRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry jSTypeRegistry12 = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes12 = ((JSType) get(jSTypeRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry jSTypeRegistry13 = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes13 = ((JSType) get(jSTypeRegistry13RegistryNativeTypes, 13));
        JSTypeRegistry jSTypeRegistry14 = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes14 = ((JSType) get(jSTypeRegistry14RegistryNativeTypes, 14));
        JSTypeRegistry jSTypeRegistry15 = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry15RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes15 = ((JSType) get(jSTypeRegistry15RegistryNativeTypes, 15));
        JSTypeRegistry jSTypeRegistry16 = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry16RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes16 = ((JSType) get(jSTypeRegistry16RegistryNativeTypes, 16));
        JSTypeRegistry jSTypeRegistry17 = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry17RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes17 = ((JSType) get(jSTypeRegistry17RegistryNativeTypes, 17));
        JSTypeRegistry jSTypeRegistry18 = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry18RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes18 = ((JSType) get(jSTypeRegistry18RegistryNativeTypes, 18));
        JSTypeRegistry jSTypeRegistry19 = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry19RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes19 = ((JSType) get(jSTypeRegistry19RegistryNativeTypes, 19));
        JSTypeRegistry jSTypeRegistry20 = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry20RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes20 = ((JSType) get(jSTypeRegistry20RegistryNativeTypes, 20));
        JSTypeRegistry jSTypeRegistry21 = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry21RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes21 = ((JSType) get(jSTypeRegistry21RegistryNativeTypes, 21));
        JSTypeRegistry jSTypeRegistry22 = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry22RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes22 = ((JSType) get(jSTypeRegistry22RegistryNativeTypes, 22));
        JSTypeRegistry jSTypeRegistry23 = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry23RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes23 = ((JSType) get(jSTypeRegistry23RegistryNativeTypes, 23));
        JSTypeRegistry jSTypeRegistry24 = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry24RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes24 = ((JSType) get(jSTypeRegistry24RegistryNativeTypes, 24));
        JSTypeRegistry jSTypeRegistry25 = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry25RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes25 = ((JSType) get(jSTypeRegistry25RegistryNativeTypes, 25));
        JSTypeRegistry jSTypeRegistry26 = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry26RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes26 = ((JSType) get(jSTypeRegistry26RegistryNativeTypes, 26));
        JSTypeRegistry jSTypeRegistry27 = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry27RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes27 = ((JSType) get(jSTypeRegistry27RegistryNativeTypes, 27));
        JSTypeRegistry jSTypeRegistry28 = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry28RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes28 = ((JSType) get(jSTypeRegistry28RegistryNativeTypes, 28));
        JSTypeRegistry jSTypeRegistry29 = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry29RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes29 = ((JSType) get(jSTypeRegistry29RegistryNativeTypes, 29));
        JSTypeRegistry jSTypeRegistry30 = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry30RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes30 = ((JSType) get(jSTypeRegistry30RegistryNativeTypes, 30));
        JSTypeRegistry jSTypeRegistry31 = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry31RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry31, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes31 = ((JSType) get(jSTypeRegistry31RegistryNativeTypes, 31));
        JSTypeRegistry jSTypeRegistry32 = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry32RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry32, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes32 = ((JSType) get(jSTypeRegistry32RegistryNativeTypes, 32));
        JSTypeRegistry jSTypeRegistry33 = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry33RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry33, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes33 = ((JSType) get(jSTypeRegistry33RegistryNativeTypes, 33));
        JSTypeRegistry jSTypeRegistry34 = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry34RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry34, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes34 = ((JSType) get(jSTypeRegistry34RegistryNativeTypes, 34));
        JSTypeRegistry jSTypeRegistry35 = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry35RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry35, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes35 = ((JSType) get(jSTypeRegistry35RegistryNativeTypes, 35));
        
        assertNull(finalRecordTypeRegistryNativeTypes0);
        
        assertNull(finalRecordTypeRegistryNativeTypes1);
        
        assertNull(finalRecordTypeRegistryNativeTypes2);
        
        assertNull(finalRecordTypeRegistryNativeTypes3);
        
        assertNull(finalRecordTypeRegistryNativeTypes4);
        
        assertNull(finalRecordTypeRegistryNativeTypes5);
        
        assertNull(finalRecordTypeRegistryNativeTypes6);
        
        assertNull(finalRecordTypeRegistryNativeTypes7);
        
        assertNull(finalRecordTypeRegistryNativeTypes8);
        
        assertNull(finalRecordTypeRegistryNativeTypes9);
        
        assertNull(finalRecordTypeRegistryNativeTypes10);
        
        assertNull(finalRecordTypeRegistryNativeTypes11);
        
        assertNull(finalRecordTypeRegistryNativeTypes12);
        
        assertNull(finalRecordTypeRegistryNativeTypes13);
        
        assertNull(finalRecordTypeRegistryNativeTypes14);
        
        assertNull(finalRecordTypeRegistryNativeTypes15);
        
        assertNull(finalRecordTypeRegistryNativeTypes16);
        
        assertNull(finalRecordTypeRegistryNativeTypes17);
        
        assertNull(finalRecordTypeRegistryNativeTypes18);
        
        assertNull(finalRecordTypeRegistryNativeTypes19);
        
        assertNull(finalRecordTypeRegistryNativeTypes20);
        
        assertNull(finalRecordTypeRegistryNativeTypes21);
        
        assertNull(finalRecordTypeRegistryNativeTypes22);
        
        assertNull(finalRecordTypeRegistryNativeTypes23);
        
        assertNull(finalRecordTypeRegistryNativeTypes24);
        
        assertNull(finalRecordTypeRegistryNativeTypes25);
        
        assertNull(finalRecordTypeRegistryNativeTypes26);
        
        assertNull(finalRecordTypeRegistryNativeTypes27);
        
        assertNull(finalRecordTypeRegistryNativeTypes28);
        
        assertNull(finalRecordTypeRegistryNativeTypes29);
        
        assertNull(finalRecordTypeRegistryNativeTypes30);
        
        assertNull(finalRecordTypeRegistryNativeTypes31);
        
        assertNull(finalRecordTypeRegistryNativeTypes32);
        
        assertNull(finalRecordTypeRegistryNativeTypes33);
        
        assertNull(finalRecordTypeRegistryNativeTypes34);
        
        assertNull(finalRecordTypeRegistryNativeTypes35);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getImplicitPrototype()
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#getImplicitPrototype()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
 *  */
    @Test
    public void testGetImplicitPrototype_ThrowClassCastException() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[19] = ((JSType) unionType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(recordType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.getImplicitPrototype] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.UnionType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.UnionType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @9daa28e)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:883)
            com.google.javascript.rhino.jstype.RecordType.getImplicitPrototype(RecordType.java:130) */
        recordType.getImplicitPrototype();
    }
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#getImplicitPrototype()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
 *  */
    @Test
    public void testGetImplicitPrototype_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(recordType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.getImplicitPrototype] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:879)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:883)
            com.google.javascript.rhino.jstype.RecordType.getImplicitPrototype(RecordType.java:130) */
        recordType.getImplicitPrototype();
    }
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#getImplicitPrototype()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
 *  */
    @Test
    public void testGetImplicitPrototype_ThrowNullPointerException() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.getImplicitPrototype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.getImplicitPrototype(RecordType.java:130) */
        recordType.getImplicitPrototype();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.RecordType.getGreatestSubtypeHelper
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getGreatestSubtypeHelper(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#getGreatestSubtypeHelper(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: for(String property: properties.keySet())
 *  */
    @Test
    public void testGetGreatestSubtypeHelper_ThrowClassCastException() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        TreeMap properties = ((TreeMap) createInstance("java.util.TreeMap"));
        Object navigableKeySet = createInstance("java.util.TreeMap$KeySet");
        ConcurrentSkipListMap m = ((ConcurrentSkipListMap) createInstance("java.util.concurrent.ConcurrentSkipListMap"));
        setField(navigableKeySet, "java.util.TreeMap$KeySet", "m", m);
        setField(properties, "java.util.TreeMap", "navigableKeySet", navigableKeySet);
        setField(recordType, "com.google.javascript.rhino.jstype.RecordType", "properties", properties);
        RecordType recordType1 = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.getGreatestSubtypeHelper] produces [java.lang.ClassCastException: class java.util.concurrent.ConcurrentSkipListMap cannot be cast to class java.util.TreeMap$NavigableSubMap (java.util.concurrent.ConcurrentSkipListMap and java.util.TreeMap$NavigableSubMap are in module java.base of loader 'bootstrap')]
            java.base/java.util.TreeMap$KeySet.iterator(TreeMap.java:1400)
            com.google.javascript.rhino.jstype.RecordType.getGreatestSubtypeHelper(RecordType.java:156) */
        recordType.getGreatestSubtypeHelper(recordType1);
    }
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#getGreatestSubtypeHelper(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testGetGreatestSubtypeHelper_ThrowClassCastException_1() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        TreeMap properties = ((TreeMap) createInstance("java.util.TreeMap"));
        ByteArrayLexOrder comparator = ((ByteArrayLexOrder) createInstance("sun.security.util.ByteArrayLexOrder"));
        setField(properties, "java.util.TreeMap", "comparator", comparator);
        Object root = createInstance("java.util.TreeMap$Entry");
        byte[][] key = {};
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(properties, "java.util.TreeMap", "root", root);
        Object navigableKeySet = createInstance("java.util.TreeMap$KeySet");
        Object m = createInstance("java.util.TreeMap$AscendingSubMap");
        setField(m, "java.util.TreeMap$NavigableSubMap", "m", properties);
        byte[] lo = {(byte) 0};
        setField(m, "java.util.TreeMap$NavigableSubMap", "lo", lo);
        setField(navigableKeySet, "java.util.TreeMap$KeySet", "m", m);
        setField(properties, "java.util.TreeMap", "navigableKeySet", navigableKeySet);
        setField(recordType, "com.google.javascript.rhino.jstype.RecordType", "properties", properties);
        RecordType recordType1 = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.getGreatestSubtypeHelper] produces [java.lang.ClassCastException: class [[B cannot be cast to class [B ([[B and [B are in module java.base of loader 'bootstrap')]
            java.base/sun.security.util.ByteArrayLexOrder.compare(ByteArrayLexOrder.java:36)
            java.base/java.util.TreeMap.compare(TreeMap.java:1570)
            java.base/java.util.TreeMap.getHigherEntry(TreeMap.java:461)
            java.base/java.util.TreeMap$NavigableSubMap.absLowest(TreeMap.java:1707)
            java.base/java.util.TreeMap$AscendingSubMap.keyIterator(TreeMap.java:2213)
            java.base/java.util.TreeMap$KeySet.iterator(TreeMap.java:1400)
            com.google.javascript.rhino.jstype.RecordType.getGreatestSubtypeHelper(RecordType.java:156) */
        recordType.getGreatestSubtypeHelper(recordType1);
    }
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#getGreatestSubtypeHelper(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: that.isRecordType()
 *  */
    @Test
    public void testGetGreatestSubtypeHelper_ThrowNullPointerException() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.getGreatestSubtypeHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.getGreatestSubtypeHelper(RecordType.java:149) */
        recordType.getGreatestSubtypeHelper(null);
    }
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#getGreatestSubtypeHelper(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(String property: properties.keySet())
 *  */
    @Test
    public void testGetGreatestSubtypeHelper_ThrowNullPointerException_2() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        RecordType referencedType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        templateType.setReferencedType(referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.getGreatestSubtypeHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.getGreatestSubtypeHelper(RecordType.java:156) */
        recordType.getGreatestSubtypeHelper(templateType);
    }
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#getGreatestSubtypeHelper(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(String property: properties.keySet())
 *  */
    @Test
    public void testGetGreatestSubtypeHelper_ThrowNullPointerException_1() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.getGreatestSubtypeHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.getGreatestSubtypeHelper(RecordType.java:156) */
        recordType.getGreatestSubtypeHelper(recordType);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getGreatestSubtypeHelper(com.google.javascript.rhino.jstype.JSType)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.RecordType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#getGreatestSubtypeHelper(com.google.javascript.rhino.jstype.JSType)}
     */
    @Test
    public void testGetGreatestSubtypeHelperThrowsNPE() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        Map map = emptyMap();
        RecordType recordType = new RecordType(jSTypeRegistry, map);
        JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(null);
        JSTypeRegistry.ResolveMode resolveMode1 = JSTypeRegistry.ResolveMode.IMMEDIATE;
        jSTypeRegistry1.setResolveMode(resolveMode1);
        com.google.javascript.rhino.Node[] nodeArray = {null, null, null, null, null};
        Node node = new Node(-1, nodeArray, Integer.MIN_VALUE, Integer.MIN_VALUE);
        node.setType(-1);
        JSTypeRegistry jSTypeRegistry2 = new JSTypeRegistry(null);
        jSTypeRegistry2.setResolveMode(resolveMode);
        Node node1 = new Node(Integer.MAX_VALUE, null, null, null, Integer.MAX_VALUE, -1);
        node1.setType(Integer.MIN_VALUE);
        ArrowType arrowType = new ArrowType(jSTypeRegistry2, node1, null);
        arrowType.returnType = null;
        PrototypeObjectType prototypeObjectType = new PrototypeObjectType(null, "", null);
        prototypeObjectType.setOwnerFunction(null);
        FunctionType functionType = new FunctionType(jSTypeRegistry1, "10", node, arrowType, prototypeObjectType, "", false, true);
        JSTypeRegistry jSTypeRegistry3 = new JSTypeRegistry(null, true);
        jSTypeRegistry3.setResolveMode(resolveMode);
        Node node2 = new Node(-1, ((Node) null), ((Node) null), ((Node) null));
        node2.setType(Integer.MIN_VALUE);
        ArrowType arrowType1 = new ArrowType(null, null, null, true);
        arrowType1.returnType = null;
        FunctionType functionType1 = new FunctionType(jSTypeRegistry3, "#$\\\"'", node2, arrowType1, null, "XZ", false, false);
        FunctionType functionType2 = new FunctionType(null, "10", null, null, null, "#$\\\"'", false, false);
        functionType2.setOwnerFunction(null);
        functionType2.setSource(null);
        functionType1.setOwnerFunction(functionType2);
        com.google.javascript.rhino.Node[] nodeArray1 = {};
        Node node3 = new Node(Integer.MIN_VALUE, nodeArray1, Integer.MIN_VALUE, -1);
        node3.setType(Integer.MAX_VALUE);
        functionType1.setSource(node3);
        functionType.setOwnerFunction(functionType1);
        Node node4 = new Node(Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
        node4.setType(-1);
        functionType.setSource(node4);
        recordType.setOwnerFunction(functionType);
        JSTypeRegistry jSTypeRegistry4 = new JSTypeRegistry(null);
        JSTypeRegistry.ResolveMode resolveMode2 = JSTypeRegistry.ResolveMode.LAZY_NAMES;
        jSTypeRegistry4.setResolveMode(resolveMode2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        UnionType unionType = new UnionType(jSTypeRegistry4, arrayList);
        HashSet alternates = new HashSet();
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        unionType.alternates = alternates;
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.getGreatestSubtypeHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.isUnknownType(UnionType.java:262)
            com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(JSType.java:733)
            com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(JSType.java:715)
            com.google.javascript.rhino.jstype.RecordType.getGreatestSubtypeHelper(RecordType.java:181) */
        recordType.getGreatestSubtypeHelper(unionType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.RecordType.isEquivalentTo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEquivalentTo(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (otherRecord): True}
 *  */
    @Test
    public void testIsEquivalentTo_OtherRecord() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        
        boolean actual = recordType.isEquivalentTo(recordType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (otherRecord): False}
 * @utbot.invokes {@link java.util.SortedMap#keySet()}
 * @utbot.invokes {@link java.util.Map#keySet()}
 * @utbot.invokes {@link java.util.Set#equals(java.lang.Object)}
 *  */
    @Test
    public void testIsEquivalentTo_NotOtherRecord() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        TreeMap properties = ((TreeMap) createInstance("java.util.TreeMap"));
        Object navigableKeySet = createInstance("java.util.TreeMap$KeySet");
        ConcurrentSkipListMap m = ((ConcurrentSkipListMap) createInstance("java.util.concurrent.ConcurrentSkipListMap"));
        Object keySet = createInstance("java.util.concurrent.ConcurrentSkipListMap$KeySet");
        setField(m, "java.util.concurrent.ConcurrentSkipListMap", "keySet", keySet);
        setField(navigableKeySet, "java.util.TreeMap$KeySet", "m", m);
        setField(properties, "java.util.TreeMap", "navigableKeySet", navigableKeySet);
        setField(recordType, "com.google.javascript.rhino.jstype.RecordType", "properties", properties);
        RecordType recordType1 = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        setField(recordType1, "com.google.javascript.rhino.jstype.RecordType", "properties", m);
        
        boolean actual = recordType.isEquivalentTo(recordType1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isEquivalentTo(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isRecordType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !other.isRecordType()
 *  */
    @Test
    public void testIsEquivalentTo_ThrowNullPointerException() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isEquivalentTo] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.isEquivalentTo(RecordType.java:105) */
        recordType.isEquivalentTo(null);
    }
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (!other.isRecordType()): False}
 * @utbot.executesCondition {@code (otherRecord): False}
 * @utbot.invokes {@link java.util.SortedMap#keySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Set<String> keySet = properties.keySet();
 *  */
    @Test
    public void testIsEquivalentTo_ThrowNullPointerException_1() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        RecordType recordType1 = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isEquivalentTo] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.isEquivalentTo(RecordType.java:115) */
        recordType.isEquivalentTo(recordType1);
    }
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (!other.isRecordType()): False}
 * @utbot.executesCondition {@code (otherRecord): False}
 * @utbot.invokes {@link java.util.SortedMap#keySet()}
 * @utbot.invokes {@link java.util.Map#keySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !otherProps.keySet().equals(keySet)
 *  */
    @Test
    public void testIsEquivalentTo_ThrowNullPointerException_2() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        TreeMap properties = ((TreeMap) createInstance("java.util.TreeMap"));
        Object navigableKeySet = createInstance("java.util.TreeMap$KeySet");
        setField(properties, "java.util.TreeMap", "navigableKeySet", navigableKeySet);
        setField(recordType, "com.google.javascript.rhino.jstype.RecordType", "properties", properties);
        RecordType recordType1 = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isEquivalentTo] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.isEquivalentTo(RecordType.java:117) */
        recordType.isEquivalentTo(recordType1);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isEquivalentTo(com.google.javascript.rhino.jstype.JSType)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.RecordType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
     */
    @Test
    public void testIsEquivalentToReturnsFalse() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        Map map = emptyMap();
        RecordType recordType = new RecordType(jSTypeRegistry, map);
        JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(null);
        JSTypeRegistry.ResolveMode resolveMode1 = JSTypeRegistry.ResolveMode.IMMEDIATE;
        jSTypeRegistry1.setResolveMode(resolveMode1);
        com.google.javascript.rhino.Node[] nodeArray = {null, null, null, null, null};
        Node node = new Node(-1, nodeArray, Integer.MIN_VALUE, Integer.MIN_VALUE);
        node.setType(-1);
        JSTypeRegistry jSTypeRegistry2 = new JSTypeRegistry(null);
        jSTypeRegistry2.setResolveMode(resolveMode);
        Node node1 = new Node(Integer.MAX_VALUE, null, null, null, Integer.MAX_VALUE, -1);
        node1.setType(Integer.MIN_VALUE);
        ArrowType arrowType = new ArrowType(jSTypeRegistry2, node1, null);
        arrowType.returnType = null;
        PrototypeObjectType prototypeObjectType = new PrototypeObjectType(null, "", null);
        prototypeObjectType.setOwnerFunction(null);
        FunctionType functionType = new FunctionType(jSTypeRegistry1, "10", node, arrowType, prototypeObjectType, "", false, true);
        JSTypeRegistry jSTypeRegistry3 = new JSTypeRegistry(null, true);
        jSTypeRegistry3.setResolveMode(resolveMode);
        Node node2 = new Node(-1, ((Node) null), ((Node) null), ((Node) null));
        node2.setType(Integer.MIN_VALUE);
        ArrowType arrowType1 = new ArrowType(null, null, null, true);
        arrowType1.returnType = null;
        FunctionType functionType1 = new FunctionType(jSTypeRegistry3, "#$\\\"'", node2, arrowType1, null, "XZ", false, false);
        FunctionType functionType2 = new FunctionType(null, "10", null, null, null, "#$\\\"'", false, false);
        functionType2.setOwnerFunction(null);
        functionType2.setSource(null);
        functionType1.setOwnerFunction(functionType2);
        com.google.javascript.rhino.Node[] nodeArray1 = {};
        Node node3 = new Node(Integer.MIN_VALUE, nodeArray1, Integer.MIN_VALUE, -1);
        node3.setType(Integer.MAX_VALUE);
        functionType1.setSource(node3);
        functionType.setOwnerFunction(functionType1);
        Node node4 = new Node(Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
        node4.setType(-1);
        functionType.setSource(node4);
        recordType.setOwnerFunction(functionType);
        JSTypeRegistry jSTypeRegistry4 = new JSTypeRegistry(null);
        JSTypeRegistry.ResolveMode resolveMode2 = JSTypeRegistry.ResolveMode.LAZY_NAMES;
        jSTypeRegistry4.setResolveMode(resolveMode2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        UnionType unionType = new UnionType(jSTypeRegistry4, arrayList);
        HashSet alternates = new HashSet();
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        unionType.alternates = alternates;
        
        boolean actual = recordType.isEquivalentTo(unionType);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.RecordType.defineProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method defineProperty(java.lang.String, com.google.javascript.rhino.jstype.JSType, boolean, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#defineProperty(java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (isFrozen): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testDefineProperty_IsFrozen() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        setField(recordType, "com.google.javascript.rhino.jstype.RecordType", "isFrozen", true);
        
        boolean actual = recordType.defineProperty(null, null, false, null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#defineProperty(java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (isFrozen): False}
 * @utbot.executesCondition {@code (!inferred): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#defineProperty(java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return super.defineProperty(propertyName, type, inferred, propertyNode);}
 *  */
    @Test
    public void testDefineProperty_Inferred() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(recordType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        String string = "";
        
        boolean actual = recordType.defineProperty(string, null, true, null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method defineProperty(java.lang.String, com.google.javascript.rhino.jstype.JSType, boolean, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#defineProperty(java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link java.util.SortedMap#put(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: properties.put(propertyName, type);
 *  */
    @Test
    public void testDefineProperty_ThrowUnsupportedOperationException() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        Object properties = createInstance("java.util.Collections$UnmodifiableSortedMap");
        setField(recordType, "com.google.javascript.rhino.jstype.RecordType", "properties", properties);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.defineProperty] produces [java.lang.UnsupportedOperationException]
            java.base/java.util.Collections$UnmodifiableMap.put(Collections.java:1505)
            com.google.javascript.rhino.jstype.RecordType.defineProperty(RecordType.java:141) */
        recordType.defineProperty(null, null, false, null);
    }
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#defineProperty(java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link java.util.SortedMap#put(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: properties.put(propertyName, type);
 *  */
    @Test
    public void testDefineProperty_ThrowNullPointerException() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.defineProperty] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.defineProperty(RecordType.java:141) */
        recordType.defineProperty(null, null, false, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.RecordType.toMaybeRecordType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toMaybeRecordType()
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#toMaybeRecordType()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testToMaybeRecordType_Return() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        
        RecordType actual = recordType.toMaybeRecordType();
        
        SortedMap actualProperties = ((SortedMap) getFieldValue(actual, "com.google.javascript.rhino.jstype.RecordType", "properties"));
        assertNull(actualProperties);
        
        boolean actualIsFrozen = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.RecordType", "isFrozen"));
        assertFalse(actualIsFrozen);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties1 = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties1);
        
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
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.RecordType.isSubtype
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isSubtype(com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.RecordType)
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#isSubtype(com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.RecordType)}
 * @utbot.invokes {@link java.util.SortedMap#keySet()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: for(String property: typeB.properties.keySet())
 *  */
    @Test
    public void testIsSubtype_ThrowClassCastException() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        TreeMap properties = ((TreeMap) createInstance("java.util.TreeMap"));
        Object navigableKeySet = createInstance("java.util.TreeMap$KeySet");
        ConcurrentSkipListMap m = ((ConcurrentSkipListMap) createInstance("java.util.concurrent.ConcurrentSkipListMap"));
        setField(navigableKeySet, "java.util.TreeMap$KeySet", "m", m);
        setField(properties, "java.util.TreeMap", "navigableKeySet", navigableKeySet);
        setField(recordType, "com.google.javascript.rhino.jstype.RecordType", "properties", properties);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isSubtype] produces [java.lang.ClassCastException: class java.util.concurrent.ConcurrentSkipListMap cannot be cast to class java.util.TreeMap$NavigableSubMap (java.util.concurrent.ConcurrentSkipListMap and java.util.TreeMap$NavigableSubMap are in module java.base of loader 'bootstrap')]
            java.base/java.util.TreeMap$KeySet.iterator(TreeMap.java:1400)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:255) */
        RecordType.isSubtype(null, recordType);
    }
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#isSubtype(com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.RecordType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(String property: typeB.properties.keySet())
 *  */
    @Test
    public void testIsSubtype_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:255) */
        RecordType.isSubtype(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#isSubtype(com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.RecordType)}
 * @utbot.invokes {@link java.util.SortedMap#keySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(String property: typeB.properties.keySet())
 *  */
    @Test
    public void testIsSubtype_ThrowNullPointerException_1() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:255) */
        RecordType.isSubtype(null, recordType);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isSubtype(com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.RecordType)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.RecordType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#isSubtype(com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.RecordType)}
     */
    @Test
    public void testIsSubtypeReturnsTrue() {
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(null);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        Collection collection = emptyList();
        UnionType unionType = new UnionType(null, collection);
        HashSet alternates = new HashSet();
        unionType.alternates = alternates;
        EnumElementType enumElementType = new EnumElementType(jSTypeRegistry, unionType, "XZ");
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode1 = JSTypeRegistry.ResolveMode.LAZY_NAMES;
        jSTypeRegistry1.setResolveMode(resolveMode1);
        Map map = emptyMap();
        RecordType recordType = new RecordType(jSTypeRegistry1, map);
        JSTypeRegistry jSTypeRegistry2 = new JSTypeRegistry(null);
        jSTypeRegistry2.setResolveMode(resolveMode);
        com.google.javascript.rhino.Node[] nodeArray = {null, null, null, null, null};
        Node node = new Node(Integer.MAX_VALUE, nodeArray);
        node.setType(Integer.MAX_VALUE);
        JSTypeRegistry jSTypeRegistry3 = new JSTypeRegistry(null);
        jSTypeRegistry3.setResolveMode(resolveMode1);
        Node node1 = new Node(Integer.MAX_VALUE, null, null, null, 1, Integer.MIN_VALUE);
        node1.setType(Integer.MAX_VALUE);
        ArrowType arrowType = new ArrowType(jSTypeRegistry3, node1, null, true);
        arrowType.returnType = null;
        PrototypeObjectType prototypeObjectType = new PrototypeObjectType(null, "10", null, true);
        prototypeObjectType.setOwnerFunction(null);
        FunctionType functionType = new FunctionType(jSTypeRegistry2, "-3", node, arrowType, prototypeObjectType, "#$\\\"'", false, true);
        JSTypeRegistry jSTypeRegistry4 = new JSTypeRegistry(null, false);
        jSTypeRegistry4.setResolveMode(resolveMode);
        Node node2 = new Node(0, ((Node) null), ((Node) null), ((Node) null), ((Node) null));
        node2.setType(0);
        ArrowType arrowType1 = new ArrowType(null, null, null, false);
        arrowType1.returnType = null;
        FunctionType functionType1 = new FunctionType(jSTypeRegistry4, "XZ", node2, arrowType1, null, "#$\\\"'", true, true);
        Node node3 = new Node(-1, null, null, null, Integer.MAX_VALUE, Integer.MAX_VALUE);
        node3.setType(-1);
        functionType1.setSource(node3);
        FunctionType functionType2 = new FunctionType(null, "10", null, null, null, "abc", false, true);
        functionType2.setOwnerFunction(null);
        functionType2.setSource(null);
        functionType1.setOwnerFunction(functionType2);
        functionType.setOwnerFunction(functionType1);
        Node node4 = new Node(-1, ((Node) null), 0, 0);
        node4.setType(0);
        Node node5 = new Node(-1);
        node5.setType(1);
        Node node6 = new Node(0, ((Node) null), ((Node) null));
        node6.setType(Integer.MAX_VALUE);
        Node node7 = new Node(1, node4, node5, node6, -1, -1);
        node7.setType(Integer.MAX_VALUE);
        functionType.setSource(node7);
        recordType.setOwnerFunction(functionType);
        
        boolean actual = RecordType.isSubtype(enumElementType, recordType);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.RecordType.isSubtype
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSubtype(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsSubtype_ReturnTrue_1() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        templateType.setReferencedType(referencedType);
        
        boolean actual = recordType.isSubtype(templateType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsSubtype_ReturnTrue_3() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        ProxyObjectType proxyObjectType = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        proxyObjectType.setReferencedType(referencedType);
        
        boolean actual = recordType.isSubtype(proxyObjectType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsSubtype_ReturnTrue_2() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType.setReferencedType(referencedType1);
        templateType.setReferencedType(referencedType);
        
        boolean actual = recordType.isSubtype(templateType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsSubtype_ReturnTrue() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        UnknownType unknownType = new UnknownType(null, false);
        
        boolean actual = recordType.isSubtype(unknownType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsSubtype_ReturnTrue_4() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
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
        
        boolean actual = recordType.isSubtype(proxyObjectType);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method isSubtype(com.google.javascript.rhino.jstype.JSType)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.RecordType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
     */
    @Test
    public void testIsSubtypeThrowsNPE() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        Map map = emptyMap();
        RecordType recordType = new RecordType(jSTypeRegistry, map);
        JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(null);
        JSTypeRegistry.ResolveMode resolveMode1 = JSTypeRegistry.ResolveMode.IMMEDIATE;
        jSTypeRegistry1.setResolveMode(resolveMode1);
        com.google.javascript.rhino.Node[] nodeArray = {null, null, null, null, null};
        Node node = new Node(-1, nodeArray, Integer.MIN_VALUE, Integer.MIN_VALUE);
        node.setType(-1);
        JSTypeRegistry jSTypeRegistry2 = new JSTypeRegistry(null);
        jSTypeRegistry2.setResolveMode(resolveMode);
        Node node1 = new Node(Integer.MAX_VALUE, null, null, null, Integer.MAX_VALUE, -1);
        node1.setType(Integer.MIN_VALUE);
        ArrowType arrowType = new ArrowType(jSTypeRegistry2, node1, null);
        arrowType.returnType = null;
        PrototypeObjectType prototypeObjectType = new PrototypeObjectType(null, "", null);
        prototypeObjectType.setOwnerFunction(null);
        FunctionType functionType = new FunctionType(jSTypeRegistry1, "10", node, arrowType, prototypeObjectType, "", false, true);
        JSTypeRegistry jSTypeRegistry3 = new JSTypeRegistry(null, true);
        jSTypeRegistry3.setResolveMode(resolveMode);
        Node node2 = new Node(-1, ((Node) null), ((Node) null), ((Node) null));
        node2.setType(Integer.MIN_VALUE);
        ArrowType arrowType1 = new ArrowType(null, null, null, true);
        arrowType1.returnType = null;
        FunctionType functionType1 = new FunctionType(jSTypeRegistry3, "#$\\\"'", node2, arrowType1, null, "XZ", false, false);
        FunctionType functionType2 = new FunctionType(null, "10", null, null, null, "#$\\\"'", false, false);
        functionType2.setOwnerFunction(null);
        functionType2.setSource(null);
        functionType1.setOwnerFunction(functionType2);
        com.google.javascript.rhino.Node[] nodeArray1 = {};
        Node node3 = new Node(Integer.MIN_VALUE, nodeArray1, Integer.MIN_VALUE, -1);
        node3.setType(Integer.MAX_VALUE);
        functionType1.setSource(node3);
        functionType.setOwnerFunction(functionType1);
        Node node4 = new Node(Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
        node4.setType(-1);
        functionType.setSource(node4);
        recordType.setOwnerFunction(functionType);
        JSTypeRegistry jSTypeRegistry4 = new JSTypeRegistry(null);
        JSTypeRegistry.ResolveMode resolveMode2 = JSTypeRegistry.ResolveMode.LAZY_NAMES;
        jSTypeRegistry4.setResolveMode(resolveMode2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        UnionType unionType = new UnionType(jSTypeRegistry4, arrayList);
        HashSet alternates = new HashSet();
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        unionType.alternates = alternates;
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.isUnknownType(UnionType.java:262)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1016)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216) */
        recordType.isSubtype(unionType);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isSubtype(com.google.javascript.rhino.jstype.JSType)
    
    @Test(expected = StackOverflowError.class)
    public void testIsSubtype1() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        IndexedType indexedType = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType4 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        referencedType4.setReferencedType(referencedType3);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        indexedType.setReferencedType(referencedType);
        
        recordType.isSubtype(indexedType);
    }
    
    @Test
    public void testIsSubtype2() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        ArrowType arrowType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:221) */
        recordType.isSubtype(arrowType);
    }
    
    @Test
    public void testIsSubtype3() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ArrowType referencedType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        parameterizedType.setReferencedType(referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:221)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216) */
        recordType.isSubtype(parameterizedType);
    }
    
    @Test
    public void testIsSubtype4() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ArrowType referencedType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        templateType.setReferencedType(referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:221)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216) */
        recordType.isSubtype(templateType);
    }
    
    @Test
    public void testIsSubtype5() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        IndexedType indexedType = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ArrowType referencedType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        referencedType.setReferencedType(referencedType1);
        indexedType.setReferencedType(referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:221)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216) */
        recordType.isSubtype(indexedType);
    }
    
    @Test
    public void testIsSubtype6() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ArrowType referencedType1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        referencedType.setReferencedType(referencedType1);
        templateType.setReferencedType(referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:221)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216) */
        recordType.isSubtype(templateType);
    }
    
    @Test
    public void testIsSubtype7() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ArrowType referencedType2 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        templateType.setReferencedType(referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:221)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216) */
        recordType.isSubtype(templateType);
    }
    
    @Test
    public void testIsSubtype8() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        IndexedType indexedType = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ArrowType referencedType2 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        indexedType.setReferencedType(referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:221)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216) */
        recordType.isSubtype(indexedType);
    }
    
    @Test
    public void testIsSubtype9() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType2 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType7 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType8 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ArrowType referencedType9 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        referencedType8.setReferencedType(referencedType9);
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        parameterizedType.setReferencedType(referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:221)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216) */
        recordType.isSubtype(parameterizedType);
    }
    
    @Test
    public void testIsSubtype10() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType2 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType7 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType8 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoResolvedType referencedType9 = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        referencedType8.setReferencedType(referencedType9);
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        parameterizedType.setReferencedType(referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:221)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216) */
        recordType.isSubtype(parameterizedType);
    }
    
    @Test
    public void testIsSubtype11() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType7 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType8 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType referencedType9 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType10 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ArrowType referencedType11 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        referencedType10.setReferencedType(referencedType11);
        referencedType9.setReferencedType(referencedType10);
        referencedType8.setReferencedType(referencedType9);
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        templateType.setReferencedType(referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:221)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216) */
        recordType.isSubtype(templateType);
    }
    
    @Test
    public void testIsSubtype12() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
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
        IndexedType referencedType9 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType referencedType10 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType11 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoResolvedType referencedType12 = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        referencedType11.setReferencedType(referencedType12);
        referencedType10.setReferencedType(referencedType11);
        referencedType9.setReferencedType(referencedType10);
        referencedType8.setReferencedType(referencedType9);
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        templateType.setReferencedType(referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:221)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216) */
        recordType.isSubtype(templateType);
    }
    
    @Test
    public void testIsSubtype13() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        IndexedType indexedType = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType3 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType7 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType8 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType9 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType10 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType11 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        ArrowType referencedType12 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        referencedType11.setReferencedType(referencedType12);
        referencedType10.setReferencedType(referencedType11);
        referencedType9.setReferencedType(referencedType10);
        referencedType8.setReferencedType(referencedType9);
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        indexedType.setReferencedType(referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:221)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216) */
        recordType.isSubtype(indexedType);
    }
    
    @Test
    public void testIsSubtype14() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType3 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType6 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType referencedType7 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType8 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType9 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType10 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType11 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoResolvedType referencedType12 = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        referencedType11.setReferencedType(referencedType12);
        referencedType10.setReferencedType(referencedType11);
        referencedType9.setReferencedType(referencedType10);
        referencedType8.setReferencedType(referencedType9);
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        parameterizedType.setReferencedType(referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:221)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1038)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:216) */
        recordType.isSubtype(parameterizedType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.RecordType.resolveInternal
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testResolveInternal_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        TreeMap properties = ((TreeMap) createInstance("java.util.TreeMap"));
        Object entrySet = createInstance("java.util.TreeMap$EntrySet");
        TreeMap this$0 = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(entrySet, "java.util.TreeMap$EntrySet", "this$0", this$0);
        setField(properties, "java.util.TreeMap", "entrySet", entrySet);
        setField(recordType, "com.google.javascript.rhino.jstype.RecordType", "properties", properties);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(recordType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.resolveInternal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:879)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:883)
            com.google.javascript.rhino.jstype.RecordType.getImplicitPrototype(RecordType.java:130)
            com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal(PrototypeObjectType.java:544)
            com.google.javascript.rhino.jstype.RecordType.resolveInternal(RecordType.java:287) */
        recordType.resolveInternal(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testResolveInternal_ThrowClassCastException_1() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        TreeMap properties = ((TreeMap) createInstance("java.util.TreeMap"));
        Object entrySet = createInstance("java.util.TreeMap$EntrySet");
        TreeMap this$0 = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(entrySet, "java.util.TreeMap$EntrySet", "this$0", this$0);
        setField(properties, "java.util.TreeMap", "entrySet", entrySet);
        setField(recordType, "com.google.javascript.rhino.jstype.RecordType", "properties", properties);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        AllType allType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        nativeTypes[19] = ((JSType) allType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(recordType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.resolveInternal] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.AllType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.AllType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @9daa28e)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:883)
            com.google.javascript.rhino.jstype.RecordType.getImplicitPrototype(RecordType.java:130)
            com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal(PrototypeObjectType.java:544)
            com.google.javascript.rhino.jstype.RecordType.resolveInternal(RecordType.java:287) */
        recordType.resolveInternal(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return super.resolveInternal(t, scope);
 *  */
    @Test
    public void testResolveInternal_ThrowClassCastException_2() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        TreeMap properties = ((TreeMap) createInstance("java.util.TreeMap"));
        Object entrySet = createInstance("java.util.TreeMap$EntrySet");
        TreeMap this$0 = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(entrySet, "java.util.TreeMap$EntrySet", "this$0", this$0);
        setField(properties, "java.util.TreeMap", "entrySet", entrySet);
        setField(recordType, "com.google.javascript.rhino.jstype.RecordType", "properties", properties);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(enumElementType, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        NumberType resolveResult = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        setField(enumElementType, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult);
        nativeTypes[19] = ((JSType) enumElementType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(recordType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.resolveInternal] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.NumberType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.NumberType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @9daa28e)]
            com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal(PrototypeObjectType.java:547)
            com.google.javascript.rhino.jstype.RecordType.resolveInternal(RecordType.java:287) */
        recordType.resolveInternal(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: JSType type = entry.getValue();
 *  */
    @Test
    public void testResolveInternal_ThrowClassCastException() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        TreeMap properties = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        byte[] value = {};
        setField(root, "java.util.TreeMap$Entry", "value", value);
        setField(properties, "java.util.TreeMap", "root", root);
        setField(recordType, "com.google.javascript.rhino.jstype.RecordType", "properties", properties);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.resolveInternal] produces [java.lang.ClassCastException: class [B cannot be cast to class com.google.javascript.rhino.jstype.JSType ([B is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.jstype.JSType is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @9daa28e)]
            com.google.javascript.rhino.jstype.RecordType.resolveInternal(RecordType.java:281) */
        recordType.resolveInternal(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JSType resolvedType = type.resolve(t, scope);
 *  */
    @Test
    public void testResolveInternal_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        TreeMap properties = ((TreeMap) createInstance("java.util.TreeMap"));
        Object entrySet = createInstance("java.util.TreeMap$EntrySet");
        TreeMap this$0 = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        EnumType value = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        setField(value, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(value, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(root, "java.util.TreeMap$Entry", "value", value);
        Object right = createInstance("java.util.TreeMap$Entry");
        setField(root, "java.util.TreeMap$Entry", "right", right);
        setField(this$0, "java.util.TreeMap", "root", root);
        setField(entrySet, "java.util.TreeMap$EntrySet", "this$0", this$0);
        setField(properties, "java.util.TreeMap", "entrySet", entrySet);
        setField(recordType, "com.google.javascript.rhino.jstype.RecordType", "properties", properties);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.resolveInternal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:879)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:1083)
            com.google.javascript.rhino.jstype.RecordType.resolveInternal(RecordType.java:282) */
        recordType.resolveInternal(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Map.Entry<String, JSType> entry: properties.entrySet())
 *  */
    @Test
    public void testResolveInternal_ThrowNullPointerException() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.resolveInternal(RecordType.java:280) */
        recordType.resolveInternal(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: TIMEOUTS for method resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.detectsSuspiciousBehavior in: JSType type = entry.getValue();
 *  */
    @Test(timeout = 1000L)
    public void testResolveInternal_TimeoutExceeded() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        TreeMap properties = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        short[] value = {};
        setField(root, "java.util.TreeMap$Entry", "value", value);
        setField(root, "java.util.TreeMap$Entry", "right", root);
        setField(properties, "java.util.TreeMap", "root", root);
        Object entrySet = createInstance("java.util.TreeMap$EntrySet");
        setField(entrySet, "java.util.TreeMap$EntrySet", "this$0", properties);
        setField(properties, "java.util.TreeMap", "entrySet", entrySet);
        setField(recordType, "com.google.javascript.rhino.jstype.RecordType", "properties", properties);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        recordType.resolveInternal(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.detectsSuspiciousBehavior in: JSType resolvedType = type.resolve(t, scope);
 *  */
    @Test(timeout = 1000L)
    public void testResolveInternal_TimeoutExceeded_1() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        TreeMap properties = ((TreeMap) createInstance("java.util.TreeMap"));
        Object entrySet = createInstance("java.util.TreeMap$EntrySet");
        TreeMap this$0 = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        FunctionType value = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        EnumElementType resolveResult = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(call, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult);
        setField(value, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        setField(root, "java.util.TreeMap$Entry", "value", value);
        setField(root, "java.util.TreeMap$Entry", "right", root);
        setField(this$0, "java.util.TreeMap", "root", root);
        setField(entrySet, "java.util.TreeMap$EntrySet", "this$0", this$0);
        setField(properties, "java.util.TreeMap", "entrySet", entrySet);
        setField(recordType, "com.google.javascript.rhino.jstype.RecordType", "properties", properties);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        recordType.resolveInternal(null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.RecordType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
     */
    @Test
    public void testResolveInternal() throws Exception  {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        Map map = emptyMap();
        RecordType recordType = new RecordType(jSTypeRegistry, map);
        JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(null);
        JSTypeRegistry.ResolveMode resolveMode1 = JSTypeRegistry.ResolveMode.IMMEDIATE;
        jSTypeRegistry1.setResolveMode(resolveMode1);
        com.google.javascript.rhino.Node[] nodeArray = {null, null, null, null, null};
        Node node = new Node(-1, nodeArray, Integer.MIN_VALUE, Integer.MIN_VALUE);
        node.setType(-1);
        JSTypeRegistry jSTypeRegistry2 = new JSTypeRegistry(null);
        jSTypeRegistry2.setResolveMode(resolveMode);
        Node node1 = new Node(Integer.MAX_VALUE, null, null, null, Integer.MAX_VALUE, -1);
        node1.setType(Integer.MIN_VALUE);
        ArrowType arrowType = new ArrowType(jSTypeRegistry2, node1, null);
        arrowType.returnType = null;
        PrototypeObjectType prototypeObjectType = new PrototypeObjectType(null, "", null);
        prototypeObjectType.setOwnerFunction(null);
        FunctionType functionType = new FunctionType(jSTypeRegistry1, "10", node, arrowType, prototypeObjectType, "", false, true);
        JSTypeRegistry jSTypeRegistry3 = new JSTypeRegistry(null, true);
        jSTypeRegistry3.setResolveMode(resolveMode);
        Node node2 = new Node(-1, ((Node) null), ((Node) null), ((Node) null));
        node2.setType(Integer.MIN_VALUE);
        ArrowType arrowType1 = new ArrowType(null, null, null, false);
        arrowType1.returnType = null;
        FunctionType functionType1 = new FunctionType(jSTypeRegistry3, "#$\\\"'", node2, arrowType1, null, "XZ", false, false);
        FunctionType functionType2 = new FunctionType(null, "10", null, null, null, "#$\\\"'", false, false);
        functionType2.setOwnerFunction(null);
        functionType2.setSource(null);
        functionType1.setOwnerFunction(functionType2);
        com.google.javascript.rhino.Node[] nodeArray1 = {};
        Node node3 = new Node(Integer.MIN_VALUE, nodeArray1, Integer.MIN_VALUE, -1);
        node3.setType(Integer.MAX_VALUE);
        functionType1.setSource(node3);
        functionType.setOwnerFunction(functionType1);
        Node node4 = new Node(Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
        node4.setType(-1);
        functionType.setSource(node4);
        recordType.setOwnerFunction(functionType);
        SimpleErrorReporter simpleErrorReporter1 = new SimpleErrorReporter();
        
        RecordType actual = ((RecordType) recordType.resolveInternal(simpleErrorReporter1, null));
        
        RecordType expected = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        TreeMap properties = new TreeMap();
        setField(expected, "com.google.javascript.rhino.jstype.RecordType", "properties", properties);
        setField(expected, "com.google.javascript.rhino.jstype.RecordType", "isFrozen", true);
        TreeMap properties1 = new TreeMap();
        setField(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties1);
        InstanceObjectType implicitPrototypeFallback = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        FunctionType constructor = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters.setType(83);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$IntPropListItem", "intValue", 1);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 37);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        AllType jsType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "parent", parameters);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(parameters, "com.google.javascript.rhino.Node", "last", first);
        setField(parameters, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        UnknownType returnType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(returnType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(call, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        ObjectType.Property prototypeSlot = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        String name = "prototype";
        setField(prototypeSlot, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        TreeMap properties2 = new TreeMap();
        setField(type, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties2);
        setField(type, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        type.setOwnerFunction(constructor);
        setField(type, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        setField(type, "com.google.javascript.rhino.jstype.JSType", "resolveResult", type);
        setField(type, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot.setType(type);
        setField(prototypeSlot, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", implicitPrototypeFallback);
        List implementedInterfaces = new ArrayList();
        constructor.setImplementedInterfaces(implementedInterfaces);
        List extendedInterfaces = new ArrayList();
        constructor.setExtendedInterfaces(extendedInterfaces);
        ArrayList subTypes = new ArrayList();
        FunctionType functionType3 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters1.setType(83);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", first1);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "last", last);
        setField(parameters1, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(call1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        ObjectType.Property prototypeSlot1 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot1, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type1 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className = "Function.prototype";
        setField(type1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        TreeMap properties3 = new TreeMap();
        setField(type1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties3);
        setField(type1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        type1.setOwnerFunction(functionType3);
        setField(type1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot1.setType(type1);
        setField(prototypeSlot1, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot1);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(typeOfThis, "com.google.javascript.rhino.jstype.JSTypeRegistry$1", "this$0", registry);
        ArrowType call2 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call2, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters2);
        setField(call2, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(call2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "call", call2);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoObjectType typeOfThis1 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call3 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.FunctionType", "call", call3);
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        List implementedInterfaces1 = new ArrayList();
        typeOfThis1.setImplementedInterfaces(implementedInterfaces1);
        List extendedInterfaces1 = new ArrayList();
        typeOfThis1.setExtendedInterfaces(extendedInterfaces1);
        TreeMap properties4 = new TreeMap();
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties4);
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        typeOfThis1.setPrettyPrint(true);
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        List implementedInterfaces2 = new ArrayList();
        typeOfThis.setImplementedInterfaces(implementedInterfaces2);
        List extendedInterfaces2 = new ArrayList();
        typeOfThis.setExtendedInterfaces(extendedInterfaces2);
        String className1 = "Function";
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className1);
        TreeMap properties5 = new TreeMap();
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties5);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", type1);
        typeOfThis.setPrettyPrint(true);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        List implementedInterfaces3 = new ArrayList();
        functionType3.setImplementedInterfaces(implementedInterfaces3);
        List extendedInterfaces3 = new ArrayList();
        functionType3.setExtendedInterfaces(extendedInterfaces3);
        setField(functionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className1);
        TreeMap properties6 = new TreeMap();
        setField(functionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties6);
        setField(functionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType3.setPrettyPrint(true);
        setField(functionType3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(functionType3);
        FunctionType functionType4 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call4 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters3 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters3.setType(83);
        Object first2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters3, "com.google.javascript.rhino.Node", "first", first2);
        Object last1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters3, "com.google.javascript.rhino.Node", "last", last1);
        setField(parameters3, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call4, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters3);
        InstanceObjectType returnType1 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(returnType1, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", functionType4);
        TreeMap properties7 = new TreeMap();
        setField(returnType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties7);
        setField(returnType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(returnType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(returnType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(call4, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(call4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "call", call4);
        ObjectType.Property prototypeSlot2 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot2, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type2 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className2 = "Array.prototype";
        setField(type2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className2);
        TreeMap properties8 = new TreeMap();
        setField(type2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties8);
        setField(type2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(type2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        type2.setOwnerFunction(functionType4);
        setField(type2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot2.setType(type2);
        setField(prototypeSlot2, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot2);
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType1);
        List implementedInterfaces4 = new ArrayList();
        functionType4.setImplementedInterfaces(implementedInterfaces4);
        List extendedInterfaces4 = new ArrayList();
        functionType4.setExtendedInterfaces(extendedInterfaces4);
        String className3 = "Array";
        setField(functionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className3);
        TreeMap properties9 = new TreeMap();
        setField(functionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties9);
        setField(functionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType4.setPrettyPrint(true);
        setField(functionType4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(functionType4);
        FunctionType functionType5 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call5 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters4 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters4.setType(83);
        Object first3 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters4, "com.google.javascript.rhino.Node", "first", first3);
        Object last2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters4, "com.google.javascript.rhino.Node", "last", last2);
        setField(parameters4, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call5, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters4);
        BooleanType returnType2 = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        setField(returnType2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(call5, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType2);
        setField(call5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "call", call5);
        ObjectType.Property prototypeSlot3 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot3, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type3 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className4 = "Boolean.prototype";
        setField(type3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className4);
        TreeMap properties10 = new TreeMap();
        setField(type3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties10);
        setField(type3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(type3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        type3.setOwnerFunction(functionType5);
        setField(type3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot3.setType(type3);
        setField(prototypeSlot3, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot3);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        InstanceObjectType typeOfThis2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", functionType5);
        TreeMap properties11 = new TreeMap();
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties11);
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis2);
        List implementedInterfaces5 = new ArrayList();
        functionType5.setImplementedInterfaces(implementedInterfaces5);
        List extendedInterfaces5 = new ArrayList();
        functionType5.setExtendedInterfaces(extendedInterfaces5);
        String className5 = "Boolean";
        setField(functionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className5);
        TreeMap properties12 = new TreeMap();
        setField(functionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties12);
        setField(functionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType5.setPrettyPrint(true);
        setField(functionType5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(functionType5);
        FunctionType functionType6 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call6 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters5 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters5.setType(83);
        Object first4 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters5, "com.google.javascript.rhino.Node", "first", first4);
        Object last3 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters5, "com.google.javascript.rhino.Node", "last", last3);
        setField(parameters5, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call6, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters5);
        StringType returnType3 = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        setField(returnType3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(call6, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType3);
        setField(call6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType6, "com.google.javascript.rhino.jstype.FunctionType", "call", call6);
        ObjectType.Property prototypeSlot4 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot4, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type4 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className6 = "Date.prototype";
        setField(type4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className6);
        TreeMap properties13 = new TreeMap();
        setField(type4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties13);
        setField(type4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(type4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        type4.setOwnerFunction(functionType6);
        setField(type4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot4.setType(type4);
        setField(prototypeSlot4, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType6, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot4);
        setField(functionType6, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        InstanceObjectType typeOfThis3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", functionType6);
        TreeMap properties14 = new TreeMap();
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties14);
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType6, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis3);
        List implementedInterfaces6 = new ArrayList();
        functionType6.setImplementedInterfaces(implementedInterfaces6);
        List extendedInterfaces6 = new ArrayList();
        functionType6.setExtendedInterfaces(extendedInterfaces6);
        String className7 = "Date";
        setField(functionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className7);
        TreeMap properties15 = new TreeMap();
        setField(functionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties15);
        setField(functionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType6.setPrettyPrint(true);
        setField(functionType6, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(functionType6);
        FunctionType functionType7 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call7 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters6 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters6.setType(83);
        Object first5 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters6, "com.google.javascript.rhino.Node", "first", first5);
        Object last4 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters6, "com.google.javascript.rhino.Node", "last", last4);
        setField(parameters6, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call7, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters6);
        NumberType returnType4 = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        setField(returnType4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(call7, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType4);
        setField(call7, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType7, "com.google.javascript.rhino.jstype.FunctionType", "call", call7);
        ObjectType.Property prototypeSlot5 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot5, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type5 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className8 = "Number.prototype";
        setField(type5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className8);
        TreeMap properties16 = new TreeMap();
        setField(type5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties16);
        setField(type5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(type5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        type5.setOwnerFunction(functionType7);
        setField(type5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot5.setType(type5);
        setField(prototypeSlot5, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType7, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot5);
        setField(functionType7, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        InstanceObjectType typeOfThis4 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", functionType7);
        TreeMap properties17 = new TreeMap();
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties17);
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType7, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis4);
        List implementedInterfaces7 = new ArrayList();
        functionType7.setImplementedInterfaces(implementedInterfaces7);
        List extendedInterfaces7 = new ArrayList();
        functionType7.setExtendedInterfaces(extendedInterfaces7);
        String className9 = "Number";
        setField(functionType7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className9);
        TreeMap properties18 = new TreeMap();
        setField(functionType7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties18);
        setField(functionType7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType7.setPrettyPrint(true);
        setField(functionType7, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType7, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(functionType7);
        FunctionType functionType8 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call8 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters7 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters7.setType(83);
        Object first6 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters7, "com.google.javascript.rhino.Node", "first", first6);
        Object last5 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters7, "com.google.javascript.rhino.Node", "last", last5);
        setField(parameters7, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call8, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters7);
        InstanceObjectType returnType5 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(returnType5, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", functionType8);
        TreeMap properties19 = new TreeMap();
        setField(returnType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties19);
        setField(returnType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(returnType5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(returnType5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(call8, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType5);
        setField(call8, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType8, "com.google.javascript.rhino.jstype.FunctionType", "call", call8);
        ObjectType.Property prototypeSlot6 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot6, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type6 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className10 = "RegExp.prototype";
        setField(type6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className10);
        TreeMap properties20 = new TreeMap();
        setField(type6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties20);
        setField(type6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(type6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        type6.setOwnerFunction(functionType8);
        setField(type6, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot6.setType(type6);
        setField(prototypeSlot6, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType8, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot6);
        setField(functionType8, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType8, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType5);
        List implementedInterfaces8 = new ArrayList();
        functionType8.setImplementedInterfaces(implementedInterfaces8);
        List extendedInterfaces8 = new ArrayList();
        functionType8.setExtendedInterfaces(extendedInterfaces8);
        String className11 = "RegExp";
        setField(functionType8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className11);
        TreeMap properties21 = new TreeMap();
        setField(functionType8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties21);
        setField(functionType8, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType8.setPrettyPrint(true);
        setField(functionType8, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType8, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(functionType8);
        FunctionType functionType9 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call9 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters8 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters8.setType(83);
        Object first7 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters8, "com.google.javascript.rhino.Node", "first", first7);
        Object last6 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters8, "com.google.javascript.rhino.Node", "last", last6);
        setField(parameters8, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call9, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters8);
        setField(call9, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType3);
        setField(call9, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType9, "com.google.javascript.rhino.jstype.FunctionType", "call", call9);
        ObjectType.Property prototypeSlot7 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot7, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type7 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className12 = "String.prototype";
        setField(type7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className12);
        TreeMap properties22 = new TreeMap();
        setField(type7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties22);
        setField(type7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(type7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        type7.setOwnerFunction(functionType9);
        setField(type7, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot7.setType(type7);
        setField(prototypeSlot7, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType9, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot7);
        setField(functionType9, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        InstanceObjectType typeOfThis5 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", functionType9);
        TreeMap properties23 = new TreeMap();
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties23);
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType9, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis5);
        List implementedInterfaces9 = new ArrayList();
        functionType9.setImplementedInterfaces(implementedInterfaces9);
        List extendedInterfaces9 = new ArrayList();
        functionType9.setExtendedInterfaces(extendedInterfaces9);
        String className13 = "String";
        setField(functionType9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className13);
        TreeMap properties24 = new TreeMap();
        setField(functionType9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties24);
        setField(functionType9, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType9.setPrettyPrint(true);
        setField(functionType9, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType9, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(functionType9);
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "subTypes", subTypes);
        String className14 = "Object";
        setField(constructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className14);
        TreeMap properties25 = new TreeMap();
        setField(constructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties25);
        setField(constructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        constructor.setPrettyPrint(true);
        setField(constructor, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(constructor, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", constructor);
        TreeMap properties26 = new TreeMap();
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties26);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", type);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.JSType", "resolveResult", implicitPrototypeFallback);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        expected.setPrettyPrint(true);
        setField(expected, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(expected, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        setField(expected, "com.google.javascript.rhino.jstype.JSType", "resolveResult", expected);
        setField(expected, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        SortedMap expectedProperties = ((SortedMap) getFieldValue(expected, "com.google.javascript.rhino.jstype.RecordType", "properties"));
        SortedMap actualProperties = ((SortedMap) getFieldValue(actual, "com.google.javascript.rhino.jstype.RecordType", "properties"));
        assertTrue(deepEquals(expectedProperties, actualProperties));
        
        boolean actualIsFrozen = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.RecordType", "isFrozen"));
        assertTrue(actualIsFrozen);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map expectedProperties1 = ((Map) getFieldValue(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        Map actualProperties1 = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertTrue(deepEquals(expectedProperties1, actualProperties1));
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        ObjectType expectedImplicitPrototypeFallback = ((ObjectType) getFieldValue(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        FunctionType expectedImplicitPrototypeFallbackConstructor = (((InstanceObjectType) expectedImplicitPrototypeFallback)).getConstructor();
        FunctionType actualImplicitPrototypeFallbackConstructor = (((InstanceObjectType) actualImplicitPrototypeFallback)).getConstructor();
        ArrowType expectedImplicitPrototypeFallbackConstructorCall = ((ArrowType) getFieldValue(expectedImplicitPrototypeFallbackConstructor, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        ArrowType actualImplicitPrototypeFallbackConstructorCall = ((ArrowType) getFieldValue(actualImplicitPrototypeFallbackConstructor, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        Node expectedImplicitPrototypeFallbackConstructorCallParameters = expectedImplicitPrototypeFallbackConstructorCall.parameters;
        Node actualImplicitPrototypeFallbackConstructorCallParameters = actualImplicitPrototypeFallbackConstructorCall.parameters;
        int expectedImplicitPrototypeFallbackConstructorCallParametersType = expectedImplicitPrototypeFallbackConstructorCallParameters.getType();
        int actualImplicitPrototypeFallbackConstructorCallParametersType = actualImplicitPrototypeFallbackConstructorCallParameters.getType();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorCallParametersType, actualImplicitPrototypeFallbackConstructorCallParametersType));
        
        Node actualImplicitPrototypeFallbackConstructorCallParametersNext = actualImplicitPrototypeFallbackConstructorCallParameters.getNext();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualImplicitPrototypeFallbackConstructorCallParametersNext, actualImplicitPrototypeFallbackConstructorCallParametersNext));
        
        Node expectedImplicitPrototypeFallbackConstructorCallParametersFirst = ((Node) getFieldValue(expectedImplicitPrototypeFallbackConstructorCallParameters, "com.google.javascript.rhino.Node", "first"));
        Node actualImplicitPrototypeFallbackConstructorCallParametersFirst = ((Node) getFieldValue(actualImplicitPrototypeFallbackConstructorCallParameters, "com.google.javascript.rhino.Node", "first"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorCallParametersFirst, actualImplicitPrototypeFallbackConstructorCallParametersFirst));
        
        Node expectedImplicitPrototypeFallbackConstructorCallParametersLast = ((Node) getFieldValue(expectedImplicitPrototypeFallbackConstructorCallParameters, "com.google.javascript.rhino.Node", "last"));
        Node actualImplicitPrototypeFallbackConstructorCallParametersLast = ((Node) getFieldValue(actualImplicitPrototypeFallbackConstructorCallParameters, "com.google.javascript.rhino.Node", "last"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorCallParametersLast, actualImplicitPrototypeFallbackConstructorCallParametersLast));
        
        Object actualImplicitPrototypeFallbackConstructorCallParametersPropListHead = getFieldValue(actualImplicitPrototypeFallbackConstructorCallParameters, "com.google.javascript.rhino.Node", "propListHead");
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualImplicitPrototypeFallbackConstructorCallParametersPropListHead, actualImplicitPrototypeFallbackConstructorCallParametersPropListHead));
        
        int expectedImplicitPrototypeFallbackConstructorCallParametersSourcePosition = expectedImplicitPrototypeFallbackConstructorCallParameters.getSourcePosition();
        int actualImplicitPrototypeFallbackConstructorCallParametersSourcePosition = actualImplicitPrototypeFallbackConstructorCallParameters.getSourcePosition();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorCallParametersSourcePosition, actualImplicitPrototypeFallbackConstructorCallParametersSourcePosition));
        
        JSType actualImplicitPrototypeFallbackConstructorCallParametersJsType = ((JSType) getFieldValue(actualImplicitPrototypeFallbackConstructorCallParameters, "com.google.javascript.rhino.Node", "jsType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualImplicitPrototypeFallbackConstructorCallParametersJsType, actualImplicitPrototypeFallbackConstructorCallParametersJsType));
        
        Node actualImplicitPrototypeFallbackConstructorCallParametersParent = actualImplicitPrototypeFallbackConstructorCallParameters.getParent();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualImplicitPrototypeFallbackConstructorCallParametersParent, actualImplicitPrototypeFallbackConstructorCallParametersParent));
        
        JSType expectedImplicitPrototypeFallbackConstructorCallReturnType = expectedImplicitPrototypeFallbackConstructorCall.returnType;
        JSType actualImplicitPrototypeFallbackConstructorCallReturnType = actualImplicitPrototypeFallbackConstructorCall.returnType;
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(expectedImplicitPrototypeFallbackConstructorCallReturnType, actualImplicitPrototypeFallbackConstructorCallReturnType);
        
        boolean actualImplicitPrototypeFallbackConstructorCallReturnTypeInferred = actualImplicitPrototypeFallbackConstructorCall.returnTypeInferred;
        assertFalse(actualImplicitPrototypeFallbackConstructorCallReturnTypeInferred);
        
        boolean actualImplicitPrototypeFallbackConstructorCallResolved = ((Boolean) getFieldValue(actualImplicitPrototypeFallbackConstructorCall, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualImplicitPrototypeFallbackConstructorCallResolved);
        
        JSType actualImplicitPrototypeFallbackConstructorCallResolveResult = ((JSType) getFieldValue(actualImplicitPrototypeFallbackConstructorCall, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualImplicitPrototypeFallbackConstructorCallResolveResult);
        
        JSTypeRegistry expectedImplicitPrototypeFallbackConstructorCallRegistry = expectedImplicitPrototypeFallbackConstructorCall.registry;
        JSTypeRegistry actualImplicitPrototypeFallbackConstructorCallRegistry = actualImplicitPrototypeFallbackConstructorCall.registry;
        ErrorReporter expectedImplicitPrototypeFallbackConstructorCallRegistryReporter = ((ErrorReporter) getFieldValue(expectedImplicitPrototypeFallbackConstructorCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        ErrorReporter actualImplicitPrototypeFallbackConstructorCallRegistryReporter = ((ErrorReporter) getFieldValue(actualImplicitPrototypeFallbackConstructorCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorCallRegistryReporter, actualImplicitPrototypeFallbackConstructorCallRegistryReporter));
        
        com.google.javascript.rhino.jstype.JSType[] expectedImplicitPrototypeFallbackConstructorCallRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(expectedImplicitPrototypeFallbackConstructorCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        com.google.javascript.rhino.jstype.JSType[] actualImplicitPrototypeFallbackConstructorCallRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualImplicitPrototypeFallbackConstructorCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorCallRegistryNativeTypes, actualImplicitPrototypeFallbackConstructorCallRegistryNativeTypes));
        
        Map expectedImplicitPrototypeFallbackConstructorCallRegistryNamesToTypes = ((Map) getFieldValue(expectedImplicitPrototypeFallbackConstructorCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        Map actualImplicitPrototypeFallbackConstructorCallRegistryNamesToTypes = ((Map) getFieldValue(actualImplicitPrototypeFallbackConstructorCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorCallRegistryNamesToTypes, actualImplicitPrototypeFallbackConstructorCallRegistryNamesToTypes));
        
        Set expectedImplicitPrototypeFallbackConstructorCallRegistryNamespaces = ((Set) getFieldValue(expectedImplicitPrototypeFallbackConstructorCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        Set actualImplicitPrototypeFallbackConstructorCallRegistryNamespaces = ((Set) getFieldValue(actualImplicitPrototypeFallbackConstructorCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorCallRegistryNamespaces, actualImplicitPrototypeFallbackConstructorCallRegistryNamespaces));
        
        Set expectedImplicitPrototypeFallbackConstructorCallRegistryNonNullableTypeNames = ((Set) getFieldValue(expectedImplicitPrototypeFallbackConstructorCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames"));
        Set actualImplicitPrototypeFallbackConstructorCallRegistryNonNullableTypeNames = ((Set) getFieldValue(actualImplicitPrototypeFallbackConstructorCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorCallRegistryNonNullableTypeNames, actualImplicitPrototypeFallbackConstructorCallRegistryNonNullableTypeNames));
        
        Set expectedImplicitPrototypeFallbackConstructorCallRegistryForwardDeclaredTypes = ((Set) getFieldValue(expectedImplicitPrototypeFallbackConstructorCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        Set actualImplicitPrototypeFallbackConstructorCallRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualImplicitPrototypeFallbackConstructorCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorCallRegistryForwardDeclaredTypes, actualImplicitPrototypeFallbackConstructorCallRegistryForwardDeclaredTypes));
        
        Map expectedImplicitPrototypeFallbackConstructorCallRegistryTypesIndexedByProperty = ((Map) getFieldValue(expectedImplicitPrototypeFallbackConstructorCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        Map actualImplicitPrototypeFallbackConstructorCallRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualImplicitPrototypeFallbackConstructorCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorCallRegistryTypesIndexedByProperty, actualImplicitPrototypeFallbackConstructorCallRegistryTypesIndexedByProperty));
        
        Map expectedImplicitPrototypeFallbackConstructorCallRegistryEachRefTypeIndexedByProperty = ((Map) getFieldValue(expectedImplicitPrototypeFallbackConstructorCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty"));
        Map actualImplicitPrototypeFallbackConstructorCallRegistryEachRefTypeIndexedByProperty = ((Map) getFieldValue(actualImplicitPrototypeFallbackConstructorCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorCallRegistryEachRefTypeIndexedByProperty, actualImplicitPrototypeFallbackConstructorCallRegistryEachRefTypeIndexedByProperty));
        
        Map expectedImplicitPrototypeFallbackConstructorCallRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(expectedImplicitPrototypeFallbackConstructorCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        Map actualImplicitPrototypeFallbackConstructorCallRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(actualImplicitPrototypeFallbackConstructorCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorCallRegistryGreatestSubtypeByProperty, actualImplicitPrototypeFallbackConstructorCallRegistryGreatestSubtypeByProperty));
        
        Multimap expectedImplicitPrototypeFallbackConstructorCallRegistryInterfaceToImplementors = ((Multimap) getFieldValue(expectedImplicitPrototypeFallbackConstructorCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        Multimap actualImplicitPrototypeFallbackConstructorCallRegistryInterfaceToImplementors = ((Multimap) getFieldValue(actualImplicitPrototypeFallbackConstructorCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorCallRegistryInterfaceToImplementors, actualImplicitPrototypeFallbackConstructorCallRegistryInterfaceToImplementors));
        
        Multimap expectedImplicitPrototypeFallbackConstructorCallRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(expectedImplicitPrototypeFallbackConstructorCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
        Multimap actualImplicitPrototypeFallbackConstructorCallRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(actualImplicitPrototypeFallbackConstructorCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorCallRegistryUnresolvedNamedTypes, actualImplicitPrototypeFallbackConstructorCallRegistryUnresolvedNamedTypes));
        
        Multimap expectedImplicitPrototypeFallbackConstructorCallRegistryResolvedNamedTypes = ((Multimap) getFieldValue(expectedImplicitPrototypeFallbackConstructorCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
        Multimap actualImplicitPrototypeFallbackConstructorCallRegistryResolvedNamedTypes = ((Multimap) getFieldValue(actualImplicitPrototypeFallbackConstructorCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorCallRegistryResolvedNamedTypes, actualImplicitPrototypeFallbackConstructorCallRegistryResolvedNamedTypes));
        
        boolean actualImplicitPrototypeFallbackConstructorCallRegistryLastGeneration = ((Boolean) getFieldValue(actualImplicitPrototypeFallbackConstructorCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "lastGeneration"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualImplicitPrototypeFallbackConstructorCallRegistryLastGeneration, actualImplicitPrototypeFallbackConstructorCallRegistryLastGeneration));
        
        String actualImplicitPrototypeFallbackConstructorCallRegistryTemplateTypeName = ((String) getFieldValue(actualImplicitPrototypeFallbackConstructorCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypeName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualImplicitPrototypeFallbackConstructorCallRegistryTemplateTypeName, actualImplicitPrototypeFallbackConstructorCallRegistryTemplateTypeName));
        
        TemplateType actualImplicitPrototypeFallbackConstructorCallRegistryTemplateType = ((TemplateType) getFieldValue(actualImplicitPrototypeFallbackConstructorCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualImplicitPrototypeFallbackConstructorCallRegistryTemplateType, actualImplicitPrototypeFallbackConstructorCallRegistryTemplateType));
        
        boolean actualImplicitPrototypeFallbackConstructorCallRegistryTolerateUndefinedValues = ((Boolean) getFieldValue(actualImplicitPrototypeFallbackConstructorCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "tolerateUndefinedValues"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualImplicitPrototypeFallbackConstructorCallRegistryTolerateUndefinedValues, actualImplicitPrototypeFallbackConstructorCallRegistryTolerateUndefinedValues));
        
        JSTypeRegistry.ResolveMode expectedImplicitPrototypeFallbackConstructorCallRegistryResolveMode = expectedImplicitPrototypeFallbackConstructorCallRegistry.getResolveMode();
        JSTypeRegistry.ResolveMode actualImplicitPrototypeFallbackConstructorCallRegistryResolveMode = actualImplicitPrototypeFallbackConstructorCallRegistry.getResolveMode();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorCallRegistryResolveMode, actualImplicitPrototypeFallbackConstructorCallRegistryResolveMode));
        
        ObjectType.Property expectedImplicitPrototypeFallbackConstructorPrototypeSlot = ((ObjectType.Property) getFieldValue(expectedImplicitPrototypeFallbackConstructor, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        ObjectType.Property actualImplicitPrototypeFallbackConstructorPrototypeSlot = ((ObjectType.Property) getFieldValue(actualImplicitPrototypeFallbackConstructor, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        String expectedImplicitPrototypeFallbackConstructorPrototypeSlotName = expectedImplicitPrototypeFallbackConstructorPrototypeSlot.getName();
        String actualImplicitPrototypeFallbackConstructorPrototypeSlotName = actualImplicitPrototypeFallbackConstructorPrototypeSlot.getName();
        assertEquals(expectedImplicitPrototypeFallbackConstructorPrototypeSlotName, actualImplicitPrototypeFallbackConstructorPrototypeSlotName);
        
        JSType expectedImplicitPrototypeFallbackConstructorPrototypeSlotType = expectedImplicitPrototypeFallbackConstructorPrototypeSlot.getType();
        JSType actualImplicitPrototypeFallbackConstructorPrototypeSlotType = actualImplicitPrototypeFallbackConstructorPrototypeSlot.getType();
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(expectedImplicitPrototypeFallbackConstructorPrototypeSlotType, actualImplicitPrototypeFallbackConstructorPrototypeSlotType);
        
        boolean actualImplicitPrototypeFallbackConstructorPrototypeSlotInferred = ((Boolean) getFieldValue(actualImplicitPrototypeFallbackConstructorPrototypeSlot, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred"));
        assertTrue(actualImplicitPrototypeFallbackConstructorPrototypeSlotInferred);
        
        Node actualImplicitPrototypeFallbackConstructorPrototypeSlotPropertyNode = ((Node) getFieldValue(actualImplicitPrototypeFallbackConstructorPrototypeSlot, "com.google.javascript.rhino.jstype.ObjectType$Property", "propertyNode"));
        assertNull(actualImplicitPrototypeFallbackConstructorPrototypeSlotPropertyNode);
        
        JSDocInfo actualImplicitPrototypeFallbackConstructorPrototypeSlotDocInfo = ((JSDocInfo) getFieldValue(actualImplicitPrototypeFallbackConstructorPrototypeSlot, "com.google.javascript.rhino.jstype.ObjectType$Property", "docInfo"));
        assertNull(actualImplicitPrototypeFallbackConstructorPrototypeSlotDocInfo);
        
        Object expectedImplicitPrototypeFallbackConstructorKind = getFieldValue(expectedImplicitPrototypeFallbackConstructor, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        Object actualImplicitPrototypeFallbackConstructorKind = getFieldValue(actualImplicitPrototypeFallbackConstructor, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertEquals(expectedImplicitPrototypeFallbackConstructorKind, actualImplicitPrototypeFallbackConstructorKind);
        
        ObjectType expectedImplicitPrototypeFallbackConstructorTypeOfThis = expectedImplicitPrototypeFallbackConstructor.getTypeOfThis();
        ObjectType actualImplicitPrototypeFallbackConstructorTypeOfThis = actualImplicitPrototypeFallbackConstructor.getTypeOfThis();
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorTypeOfThis, actualImplicitPrototypeFallbackConstructorTypeOfThis));
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorTypeOfThis, actualImplicitPrototypeFallbackConstructorTypeOfThis));
        Map expectedImplicitPrototypeFallbackConstructorTypeOfThisProperties = ((Map) getFieldValue(expectedImplicitPrototypeFallbackConstructorTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        Map actualImplicitPrototypeFallbackConstructorTypeOfThisProperties = ((Map) getFieldValue(actualImplicitPrototypeFallbackConstructorTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorTypeOfThisProperties, actualImplicitPrototypeFallbackConstructorTypeOfThisProperties));
        
        boolean actualImplicitPrototypeFallbackConstructorTypeOfThisNativeType = ((Boolean) getFieldValue(actualImplicitPrototypeFallbackConstructorTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertTrue(actualImplicitPrototypeFallbackConstructorTypeOfThisNativeType);
        
        ObjectType expectedImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallback = ((ObjectType) getFieldValue(expectedImplicitPrototypeFallbackConstructorTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        ObjectType actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallback = ((ObjectType) getFieldValue(actualImplicitPrototypeFallbackConstructorTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallback, actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallback));
        Map expectedImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallbackProperties = ((Map) getFieldValue(expectedImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        Map actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallbackProperties = ((Map) getFieldValue(actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallbackProperties, actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallbackProperties));
        
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallback, actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallback));
        ObjectType actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallbackImplicitPrototypeFallback = ((ObjectType) getFieldValue(actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallbackImplicitPrototypeFallback, actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallbackImplicitPrototypeFallback));
        
        FunctionType expectedImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallbackOwnerFunction = (((PrototypeObjectType) expectedImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallback)).getOwnerFunction();
        FunctionType actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallbackOwnerFunction = (((PrototypeObjectType) actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallback)).getOwnerFunction();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallbackOwnerFunction, actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallbackOwnerFunction));
        
        boolean actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallbackPrettyPrint = ((Boolean) getFieldValue(actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallbackPrettyPrint, actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallbackPrettyPrint));
        
        boolean actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallbackVisited = ((Boolean) getFieldValue(actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallback, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallbackVisited, actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallbackVisited));
        
        JSDocInfo actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallbackDocInfo = ((JSDocInfo) getFieldValue(actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallback, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallbackDocInfo, actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallbackDocInfo));
        
        boolean actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallbackUnknown = ((Boolean) getFieldValue(actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallback, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallbackUnknown, actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallbackUnknown));
        
        boolean actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallbackResolved = ((Boolean) getFieldValue(actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallback, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallbackResolved, actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallbackResolved));
        
        JSType expectedImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallbackResolveResult = ((JSType) getFieldValue(expectedImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallback, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        JSType actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallbackResolveResult = ((JSType) getFieldValue(actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallback, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallbackResolveResult, actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallbackResolveResult));
        
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallback, actualImplicitPrototypeFallbackConstructorTypeOfThisImplicitPrototypeFallback));
        
        FunctionType actualImplicitPrototypeFallbackConstructorTypeOfThisOwnerFunction = (((PrototypeObjectType) actualImplicitPrototypeFallbackConstructorTypeOfThis)).getOwnerFunction();
        assertNull(actualImplicitPrototypeFallbackConstructorTypeOfThisOwnerFunction);
        
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorTypeOfThis, actualImplicitPrototypeFallbackConstructorTypeOfThis));
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorTypeOfThis, actualImplicitPrototypeFallbackConstructorTypeOfThis));
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorTypeOfThis, actualImplicitPrototypeFallbackConstructorTypeOfThis));
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorTypeOfThis, actualImplicitPrototypeFallbackConstructorTypeOfThis));
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorTypeOfThis, actualImplicitPrototypeFallbackConstructorTypeOfThis));
        JSType expectedImplicitPrototypeFallbackConstructorTypeOfThisResolveResult = ((JSType) getFieldValue(expectedImplicitPrototypeFallbackConstructorTypeOfThis, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        JSType actualImplicitPrototypeFallbackConstructorTypeOfThisResolveResult = ((JSType) getFieldValue(actualImplicitPrototypeFallbackConstructorTypeOfThis, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(expectedImplicitPrototypeFallbackConstructorTypeOfThisResolveResult, actualImplicitPrototypeFallbackConstructorTypeOfThisResolveResult);
        
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorTypeOfThis, actualImplicitPrototypeFallbackConstructorTypeOfThis));
        
        Node actualImplicitPrototypeFallbackConstructorSource = actualImplicitPrototypeFallbackConstructor.getSource();
        assertNull(actualImplicitPrototypeFallbackConstructorSource);
        
        List expectedImplicitPrototypeFallbackConstructorImplementedInterfaces = ((List) getFieldValue(expectedImplicitPrototypeFallbackConstructor, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        List actualImplicitPrototypeFallbackConstructorImplementedInterfaces = ((List) getFieldValue(actualImplicitPrototypeFallbackConstructor, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorImplementedInterfaces, actualImplicitPrototypeFallbackConstructorImplementedInterfaces));
        
        List expectedImplicitPrototypeFallbackConstructorExtendedInterfaces = ((List) getFieldValue(expectedImplicitPrototypeFallbackConstructor, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        List actualImplicitPrototypeFallbackConstructorExtendedInterfaces = ((List) getFieldValue(actualImplicitPrototypeFallbackConstructor, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorExtendedInterfaces, actualImplicitPrototypeFallbackConstructorExtendedInterfaces));
        
        List expectedImplicitPrototypeFallbackConstructorSubTypes = expectedImplicitPrototypeFallbackConstructor.getSubTypes();
        List actualImplicitPrototypeFallbackConstructorSubTypes = actualImplicitPrototypeFallbackConstructor.getSubTypes();
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorSubTypes, actualImplicitPrototypeFallbackConstructorSubTypes));
        
        String actualImplicitPrototypeFallbackConstructorTemplateTypeName = actualImplicitPrototypeFallbackConstructor.getTemplateTypeName();
        assertNull(actualImplicitPrototypeFallbackConstructorTemplateTypeName);
        
        String expectedImplicitPrototypeFallbackConstructorClassName = ((String) getFieldValue(expectedImplicitPrototypeFallbackConstructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        String actualImplicitPrototypeFallbackConstructorClassName = ((String) getFieldValue(actualImplicitPrototypeFallbackConstructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertEquals(expectedImplicitPrototypeFallbackConstructorClassName, actualImplicitPrototypeFallbackConstructorClassName);
        
        Map expectedImplicitPrototypeFallbackConstructorProperties = ((Map) getFieldValue(expectedImplicitPrototypeFallbackConstructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        Map actualImplicitPrototypeFallbackConstructorProperties = ((Map) getFieldValue(actualImplicitPrototypeFallbackConstructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorProperties, actualImplicitPrototypeFallbackConstructorProperties));
        
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructor, actualImplicitPrototypeFallbackConstructor));
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructor, actualImplicitPrototypeFallbackConstructor));
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructor, actualImplicitPrototypeFallbackConstructor));
        boolean actualImplicitPrototypeFallbackConstructorPrettyPrint = ((Boolean) getFieldValue(actualImplicitPrototypeFallbackConstructor, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertTrue(actualImplicitPrototypeFallbackConstructorPrettyPrint);
        
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructor, actualImplicitPrototypeFallbackConstructor));
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructor, actualImplicitPrototypeFallbackConstructor));
        boolean actualImplicitPrototypeFallbackConstructorUnknown = ((Boolean) getFieldValue(actualImplicitPrototypeFallbackConstructor, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertTrue(actualImplicitPrototypeFallbackConstructorUnknown);
        
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructor, actualImplicitPrototypeFallbackConstructor));
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructor, actualImplicitPrototypeFallbackConstructor));
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructor, actualImplicitPrototypeFallbackConstructor));
        
        assertTrue(deepEquals(expectedImplicitPrototypeFallback, actualImplicitPrototypeFallback));
        assertTrue(deepEquals(expectedImplicitPrototypeFallback, actualImplicitPrototypeFallback));
        assertTrue(deepEquals(expectedImplicitPrototypeFallback, actualImplicitPrototypeFallback));
        assertTrue(deepEquals(expectedImplicitPrototypeFallback, actualImplicitPrototypeFallback));
        assertTrue(deepEquals(expectedImplicitPrototypeFallback, actualImplicitPrototypeFallback));
        assertTrue(deepEquals(expectedImplicitPrototypeFallback, actualImplicitPrototypeFallback));
        assertTrue(deepEquals(expectedImplicitPrototypeFallback, actualImplicitPrototypeFallback));
        assertTrue(deepEquals(expectedImplicitPrototypeFallback, actualImplicitPrototypeFallback));
        assertTrue(deepEquals(expectedImplicitPrototypeFallback, actualImplicitPrototypeFallback));
        assertTrue(deepEquals(expectedImplicitPrototypeFallback, actualImplicitPrototypeFallback));
        assertTrue(deepEquals(expectedImplicitPrototypeFallback, actualImplicitPrototypeFallback));
        assertTrue(deepEquals(expectedImplicitPrototypeFallback, actualImplicitPrototypeFallback));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        JSType expectedResolveResult = ((JSType) getFieldValue(expected, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(expectedResolveResult, actualResolveResult);
        
        assertTrue(deepEquals(expected, actual));
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
        
                java.lang.reflect.Method methodForGetDeclaredFields916977654842600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields916977654842600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass916977654851300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields916977654842600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass916977654851300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields916977655412600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields916977655412600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass916977655414500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields916977655412600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass916977655414500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

