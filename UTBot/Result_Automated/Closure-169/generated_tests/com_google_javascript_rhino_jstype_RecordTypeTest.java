package com.google.javascript.rhino.jstype;

import org.junit.Test;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListMap;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode;
import java.util.Map;
import java.util.HashSet;
import java.util.Collection;
import com.google.javascript.rhino.Node;
import java.util.HashMap;
import com.google.common.collect.LinkedHashMultimap;
import java.util.LinkedHashMap;
import com.google.common.collect.ArrayListMultimap;
import java.util.ArrayList;
import java.util.List;
import com.google.javascript.rhino.ErrorReporter;
import java.util.Set;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multiset;
import com.google.javascript.rhino.jstype.ObjectType.Property;
import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.JSDocInfo;
import java.util.SortedMap;
import sun.security.util.ByteArrayLexOrder;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static java.lang.reflect.Array.get;
import static java.util.Collections.emptyMap;
import static java.util.Collections.emptyList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public final class com_google_javascript_rhino_jstype_RecordTypeTest {
    ///region Test suites for executable com.google.javascript.rhino.jstype.RecordType.checkRecordEquivalenceHelper
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkRecordEquivalenceHelper(com.google.javascript.rhino.jstype.RecordType, boolean)
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#checkRecordEquivalenceHelper(com.google.javascript.rhino.jstype.RecordType,boolean)}
 * @utbot.invokes {@link java.util.SortedMap#keySet()}
 * @utbot.invokes {@link java.util.Map#keySet()}
 * @utbot.invokes {@link java.util.Set#equals(java.lang.Object)}
 *  */
    @Test
    public void testCheckRecordEquivalenceHelper_SetEquals() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        TreeMap properties = ((TreeMap) createInstance("java.util.TreeMap"));
        Object navigableKeySet = createInstance("java.util.TreeMap$KeySet");
        Object m = createInstance("com.google.common.collect.RegularImmutableSortedMap");
        setField(navigableKeySet, "java.util.TreeMap$KeySet", "m", m);
        setField(properties, "java.util.TreeMap", "navigableKeySet", navigableKeySet);
        setField(recordType, "com.google.javascript.rhino.jstype.RecordType", "properties", properties);
        RecordType recordType1 = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        ConcurrentSkipListMap properties1 = ((ConcurrentSkipListMap) createInstance("java.util.concurrent.ConcurrentSkipListMap"));
        Object keySet = createInstance("java.util.concurrent.ConcurrentSkipListMap$KeySet");
        setField(properties1, "java.util.concurrent.ConcurrentSkipListMap", "keySet", keySet);
        setField(recordType1, "com.google.javascript.rhino.jstype.RecordType", "properties", properties1);
        
        boolean actual = recordType.checkRecordEquivalenceHelper(recordType1, false);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkRecordEquivalenceHelper(com.google.javascript.rhino.jstype.RecordType, boolean)
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#checkRecordEquivalenceHelper(com.google.javascript.rhino.jstype.RecordType,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Map<String, JSType> otherProps = otherRecord.properties;
 *  */
    @Test
    public void testCheckRecordEquivalenceHelper_ThrowNullPointerException() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        TreeMap properties = ((TreeMap) createInstance("java.util.TreeMap"));
        Object navigableKeySet = createInstance("java.util.TreeMap$KeySet");
        setField(properties, "java.util.TreeMap", "navigableKeySet", navigableKeySet);
        setField(recordType, "com.google.javascript.rhino.jstype.RecordType", "properties", properties);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.checkRecordEquivalenceHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.checkRecordEquivalenceHelper(RecordType.java:120) */
        recordType.checkRecordEquivalenceHelper(null, false);
    }
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#checkRecordEquivalenceHelper(com.google.javascript.rhino.jstype.RecordType,boolean)}
 * @utbot.invokes {@link java.util.SortedMap#keySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Set<String> keySet = properties.keySet();
 *  */
    @Test
    public void testCheckRecordEquivalenceHelper_ThrowNullPointerException_1() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.checkRecordEquivalenceHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.checkRecordEquivalenceHelper(RecordType.java:119) */
        recordType.checkRecordEquivalenceHelper(null, false);
    }
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#checkRecordEquivalenceHelper(com.google.javascript.rhino.jstype.RecordType,boolean)}
 * @utbot.invokes {@link java.util.Map#keySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !otherProps.keySet().equals(keySet)
 *  */
    @Test
    public void testCheckRecordEquivalenceHelper_ThrowNullPointerException_2() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        TreeMap properties = ((TreeMap) createInstance("java.util.TreeMap"));
        Object navigableKeySet = createInstance("java.util.TreeMap$KeySet");
        setField(properties, "java.util.TreeMap", "navigableKeySet", navigableKeySet);
        setField(recordType, "com.google.javascript.rhino.jstype.RecordType", "properties", properties);
        RecordType recordType1 = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.checkRecordEquivalenceHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.checkRecordEquivalenceHelper(RecordType.java:121) */
        recordType.checkRecordEquivalenceHelper(recordType1, false);
    }
    ///endregion
    
    ///endregion
    
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
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
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
        JSTypeRegistry jSTypeRegistry36 = recordType.registry;
        com.google.javascript.rhino.jstype.JSType[] jSTypeRegistry36RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(jSTypeRegistry36, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeRegistryNativeTypes36 = ((JSType) get(jSTypeRegistry36RegistryNativeTypes, 36));
        
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
        
        assertNull(finalRecordTypeRegistryNativeTypes36);
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
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[21];
        NumberType numberType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        nativeTypes[19] = ((JSType) numberType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(recordType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.getImplicitPrototype] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.NumberType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.NumberType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:890)
            com.google.javascript.rhino.jstype.RecordType.getImplicitPrototype(RecordType.java:135) */
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
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:886)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:890)
            com.google.javascript.rhino.jstype.RecordType.getImplicitPrototype(RecordType.java:135) */
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
            com.google.javascript.rhino.jstype.RecordType.getImplicitPrototype(RecordType.java:135) */
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
        Object m = createInstance("com.google.common.collect.RegularImmutableSortedMap");
        setField(navigableKeySet, "java.util.TreeMap$KeySet", "m", m);
        setField(properties, "java.util.TreeMap", "navigableKeySet", navigableKeySet);
        setField(recordType, "com.google.javascript.rhino.jstype.RecordType", "properties", properties);
        RecordType recordType1 = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.getGreatestSubtypeHelper] produces [java.lang.ClassCastException: class com.google.common.collect.RegularImmutableSortedMap cannot be cast to class java.util.TreeMap$NavigableSubMap (com.google.common.collect.RegularImmutableSortedMap is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db; java.util.TreeMap$NavigableSubMap is in module java.base of loader 'bootstrap')]
            java.base/java.util.TreeMap$KeySet.iterator(TreeMap.java:1400)
            com.google.javascript.rhino.jstype.RecordType.getGreatestSubtypeHelper(RecordType.java:162) */
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
        Object root = createInstance("java.util.TreeMap$Entry");
        byte[] key = {};
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(properties, "java.util.TreeMap", "root", root);
        Object navigableKeySet = createInstance("java.util.TreeMap$KeySet");
        Object m = createInstance("java.util.TreeMap$AscendingSubMap");
        setField(m, "java.util.TreeMap$NavigableSubMap", "m", properties);
        Integer lo = 0;
        setField(m, "java.util.TreeMap$NavigableSubMap", "lo", lo);
        setField(m, "java.util.TreeMap$NavigableSubMap", "loInclusive", true);
        setField(navigableKeySet, "java.util.TreeMap$KeySet", "m", m);
        setField(properties, "java.util.TreeMap", "navigableKeySet", navigableKeySet);
        setField(recordType, "com.google.javascript.rhino.jstype.RecordType", "properties", properties);
        RecordType recordType1 = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.getGreatestSubtypeHelper] produces [java.lang.ClassCastException: class [B cannot be cast to class java.lang.Integer ([B and java.lang.Integer are in module java.base of loader 'bootstrap')]
            java.base/java.lang.Integer.compareTo(Integer.java:71)
            java.base/java.util.TreeMap.compare(TreeMap.java:1569)
            java.base/java.util.TreeMap.getCeilingEntry(TreeMap.java:395)
            java.base/java.util.TreeMap$NavigableSubMap.absLowest(TreeMap.java:1706)
            java.base/java.util.TreeMap$AscendingSubMap.keyIterator(TreeMap.java:2213)
            java.base/java.util.TreeMap$KeySet.iterator(TreeMap.java:1400)
            com.google.javascript.rhino.jstype.RecordType.getGreatestSubtypeHelper(RecordType.java:162) */
        recordType.getGreatestSubtypeHelper(recordType1);
    }
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#getGreatestSubtypeHelper(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testGetGreatestSubtypeHelper_ThrowClassCastException_2() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        TreeMap properties = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        byte[] key = {};
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(properties, "java.util.TreeMap", "root", root);
        Object navigableKeySet = createInstance("java.util.TreeMap$KeySet");
        Object m = createInstance("java.util.TreeMap$AscendingSubMap");
        setField(m, "java.util.TreeMap$NavigableSubMap", "m", properties);
        Character lo = '\u0000';
        setField(m, "java.util.TreeMap$NavigableSubMap", "lo", lo);
        setField(m, "java.util.TreeMap$NavigableSubMap", "loInclusive", true);
        setField(navigableKeySet, "java.util.TreeMap$KeySet", "m", m);
        setField(properties, "java.util.TreeMap", "navigableKeySet", navigableKeySet);
        setField(recordType, "com.google.javascript.rhino.jstype.RecordType", "properties", properties);
        RecordType recordType1 = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.getGreatestSubtypeHelper] produces [java.lang.ClassCastException: class [B cannot be cast to class java.lang.Character ([B and java.lang.Character are in module java.base of loader 'bootstrap')]
            java.base/java.lang.Character.compareTo(Character.java:174)
            java.base/java.util.TreeMap.compare(TreeMap.java:1569)
            java.base/java.util.TreeMap.getCeilingEntry(TreeMap.java:395)
            java.base/java.util.TreeMap$NavigableSubMap.absLowest(TreeMap.java:1706)
            java.base/java.util.TreeMap$AscendingSubMap.keyIterator(TreeMap.java:2213)
            java.base/java.util.TreeMap$KeySet.iterator(TreeMap.java:1400)
            com.google.javascript.rhino.jstype.RecordType.getGreatestSubtypeHelper(RecordType.java:162) */
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
            com.google.javascript.rhino.jstype.RecordType.getGreatestSubtypeHelper(RecordType.java:154) */
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
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        RecordType referencedType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        parameterizedType.setReferencedType(referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.getGreatestSubtypeHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.getGreatestSubtypeHelper(RecordType.java:162) */
        recordType.getGreatestSubtypeHelper(parameterizedType);
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
            com.google.javascript.rhino.jstype.RecordType.getGreatestSubtypeHelper(RecordType.java:162) */
        recordType.getGreatestSubtypeHelper(recordType);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getGreatestSubtypeHelper(com.google.javascript.rhino.jstype.JSType)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.RecordType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#getGreatestSubtypeHelper(com.google.javascript.rhino.jstype.JSType)}
     */
    @Test
    public void testGetGreatestSubtypeHelper() throws Exception  {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        Map map = emptyMap();
        RecordType recordType = new RecordType(jSTypeRegistry, map, true);
        recordType.setOwnerFunction(null);
        JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(null);
        JSTypeRegistry.ResolveMode resolveMode1 = JSTypeRegistry.ResolveMode.IMMEDIATE;
        jSTypeRegistry1.setResolveMode(resolveMode1);
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        hashSet.add(null);
        hashSet.add(null);
        UnionType unionType = new UnionType(jSTypeRegistry1, hashSet);
        Collection alternates = emptyList();
        unionType.alternates = alternates;
        
        NoObjectType actual = ((NoObjectType) recordType.getGreatestSubtypeHelper(unionType));
        
        NoObjectType expected = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parameters.setType(83);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$IntPropListItem", "intValue", 1);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        UnknownType jsType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(jsType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        SimpleErrorReporter reporter = ((SimpleErrorReporter) createInstance("com.google.javascript.rhino.SimpleErrorReporter"));
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter", reporter);
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[56];
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
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        nativeTypes[14] = ((JSType) prototypeObjectType);
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
        PrototypeObjectType prototypeObjectType1 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        nativeTypes[21] = ((JSType) prototypeObjectType1);
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
        PrototypeObjectType prototypeObjectType2 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        nativeTypes[39] = ((JSType) prototypeObjectType2);
        UnionType unionType1 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[40] = ((JSType) unionType1);
        UnionType unionType2 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[41] = ((JSType) unionType2);
        AllType allType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        nativeTypes[42] = ((JSType) allType);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        nativeTypes[43] = ((JSType) noType);
        nativeTypes[44] = ((JSType) expected);
        NoResolvedType noResolvedType = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        nativeTypes[45] = ((JSType) noResolvedType);
        InstanceObjectType instanceObjectType14 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        nativeTypes[46] = ((JSType) instanceObjectType14);
        FunctionType anonymousFunctionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        nativeTypes[47] = ((JSType) anonymousFunctionType1);
        FunctionType functionType8 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        nativeTypes[48] = ((JSType) functionType8);
        FunctionType functionType9 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        nativeTypes[49] = ((JSType) functionType9);
        FunctionType functionType10 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        nativeTypes[50] = ((JSType) functionType10);
        UnionType unionType3 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[51] = ((JSType) unionType3);
        UnionType unionType4 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[52] = ((JSType) unionType4);
        UnionType unionType5 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[53] = ((JSType) unionType5);
        UnionType unionType6 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[54] = ((JSType) unionType6);
        UnionType unionType7 = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[55] = ((JSType) unionType7);
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
        InstanceObjectType instanceObjectType15 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string4, instanceObjectType15);
        String string5 = "RegExp";
        InstanceObjectType instanceObjectType16 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string5, instanceObjectType16);
        String string6 = "Error";
        InstanceObjectType instanceObjectType17 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string6, instanceObjectType17);
        String string7 = "URIError";
        InstanceObjectType instanceObjectType18 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string7, instanceObjectType18);
        String string8 = "EvalError";
        InstanceObjectType instanceObjectType19 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string8, instanceObjectType19);
        String string9 = "String";
        InstanceObjectType instanceObjectType20 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string9, instanceObjectType20);
        String string10 = "Date";
        InstanceObjectType instanceObjectType21 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string10, instanceObjectType21);
        String string11 = "undefined";
        VoidType voidType3 = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        namesToTypes.put(string11, voidType3);
        String string12 = "Array";
        InstanceObjectType instanceObjectType22 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string12, instanceObjectType22);
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
        InstanceObjectType instanceObjectType23 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string17, instanceObjectType23);
        String string18 = "SyntaxError";
        InstanceObjectType instanceObjectType24 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string18, instanceObjectType24);
        String string19 = "TypeError";
        InstanceObjectType instanceObjectType25 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string19, instanceObjectType25);
        String string20 = "RangeError";
        InstanceObjectType instanceObjectType26 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string20, instanceObjectType26);
        String string21 = "Object";
        InstanceObjectType instanceObjectType27 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string21, instanceObjectType27);
        String string22 = "Boolean";
        InstanceObjectType instanceObjectType28 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        namesToTypes.put(string22, instanceObjectType28);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes", namesToTypes);
        HashSet namespaces = new HashSet();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces", namespaces);
        HashSet nonNullableTypeNames = new HashSet();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames", nonNullableTypeNames);
        HashSet forwardDeclaredTypes = new HashSet();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes", forwardDeclaredTypes);
        HashMap typesIndexedByProperty = new HashMap();
        String string23 = "prototype";
        UnionTypeBuilder unionTypeBuilder = ((UnionTypeBuilder) createInstance("com.google.javascript.rhino.jstype.UnionTypeBuilder"));
        typesIndexedByProperty.put(string23, unionTypeBuilder);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty", typesIndexedByProperty);
        HashMap eachRefTypeIndexedByProperty = new HashMap();
        HashMap hashMap = new HashMap();
        FunctionType functionType11 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        hashMap.put(string21, functionType11);
        eachRefTypeIndexedByProperty.put(string23, hashMap);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty", eachRefTypeIndexedByProperty);
        HashMap greatestSubtypeByProperty = new HashMap();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty", greatestSubtypeByProperty);
        LinkedHashMultimap interfaceToImplementors = ((LinkedHashMultimap) createInstance("com.google.common.collect.LinkedHashMultimap"));
        setField(interfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "valueSetCapacity", 2);
        Object multimapHeaderEntry = createInstance("com.google.common.collect.LinkedHashMultimap$ValueEntry");
        setField(interfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "multimapHeaderEntry", multimapHeaderEntry);
        LinkedHashMap map1 = new LinkedHashMap();
        setField(interfaceToImplementors, "com.google.common.collect.AbstractMultimap", "map", map1);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors", interfaceToImplementors);
        ArrayListMultimap unresolvedNamedTypes = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
        setField(unresolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey", 3);
        HashMap map2 = new HashMap();
        setField(unresolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map", map2);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes", unresolvedNamedTypes);
        ArrayListMultimap resolvedNamedTypes = ((ArrayListMultimap) createInstance("com.google.common.collect.ArrayListMultimap"));
        setField(resolvedNamedTypes, "com.google.common.collect.ArrayListMultimap", "expectedValuesPerKey", 3);
        HashMap map3 = new HashMap();
        setField(resolvedNamedTypes, "com.google.common.collect.AbstractMultimap", "map", map3);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes", resolvedNamedTypes);
        registry.setLastGeneration(true);
        HashMap templateTypes = new HashMap();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypes", templateTypes);
        registry.setResolveMode(resolveMode);
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "parent", parameters);
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(parameters, "com.google.javascript.rhino.Node", "last", first);
        setField(parameters, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", expected);
        setField(call, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(expected, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(expected, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        Class propAccessClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Object propAccess = getEnumConstantByName(propAccessClazz, "ANY");
        setField(expected, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(expected, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", expected);
        List implementedInterfaces = new ArrayList();
        expected.setImplementedInterfaces(implementedInterfaces);
        List extendedInterfaces = new ArrayList();
        expected.setExtendedInterfaces(extendedInterfaces);
        Object templateTypeNames = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(expected, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
        TreeMap properties = new TreeMap();
        setField(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        setField(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        expected.setPrettyPrint(true);
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
        int expectedCallParametersFirstPropListHeadIntValue = ((Integer) getFieldValue(expectedCallParametersFirstPropListHead, "com.google.javascript.rhino.Node$IntPropListItem", "intValue"));
        int actualCallParametersFirstPropListHeadIntValue = ((Integer) getFieldValue(actualCallParametersFirstPropListHead, "com.google.javascript.rhino.Node$IntPropListItem", "intValue"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedCallParametersFirstPropListHeadIntValue, actualCallParametersFirstPropListHeadIntValue));
        
        Object actualCallParametersFirstPropListHeadNext = getFieldValue(actualCallParametersFirstPropListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next");
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualCallParametersFirstPropListHeadNext, actualCallParametersFirstPropListHeadNext));
        
        int expectedCallParametersFirstPropListHeadPropType = ((Integer) getFieldValue(expectedCallParametersFirstPropListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType"));
        int actualCallParametersFirstPropListHeadPropType = ((Integer) getFieldValue(actualCallParametersFirstPropListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedCallParametersFirstPropListHeadPropType, actualCallParametersFirstPropListHeadPropType));
        
        int expectedCallParametersFirstSourcePosition = expectedCallParametersFirst.getSourcePosition();
        int actualCallParametersFirstSourcePosition = actualCallParametersFirst.getSourcePosition();
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
        
        boolean actualCallInTemplatedCheckVisit = ((Boolean) getFieldValue(actualCall, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualCallInTemplatedCheckVisit);
        
        JSTypeRegistry expectedCallRegistry = expectedCall.registry;
        JSTypeRegistry actualCallRegistry = actualCall.registry;
        ErrorReporter expectedCallRegistryReporter = ((ErrorReporter) getFieldValue(expectedCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        ErrorReporter actualCallRegistryReporter = ((ErrorReporter) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        List actualCallRegistryReporterWarnings = ((List) getFieldValue(actualCallRegistryReporter, "com.google.javascript.rhino.SimpleErrorReporter", "warnings"));
        assertNull(actualCallRegistryReporterWarnings);
        
        List actualCallRegistryReporterErrors = ((List) getFieldValue(actualCallRegistryReporter, "com.google.javascript.rhino.SimpleErrorReporter", "errors"));
        assertNull(actualCallRegistryReporterErrors);
        
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
        
        Set expectedCallRegistryNonNullableTypeNames = ((Set) getFieldValue(expectedCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames"));
        Set actualCallRegistryNonNullableTypeNames = ((Set) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames"));
        assertTrue(deepEquals(expectedCallRegistryNonNullableTypeNames, actualCallRegistryNonNullableTypeNames));
        
        Set expectedCallRegistryForwardDeclaredTypes = ((Set) getFieldValue(expectedCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        Set actualCallRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertTrue(deepEquals(expectedCallRegistryForwardDeclaredTypes, actualCallRegistryForwardDeclaredTypes));
        
        Map expectedCallRegistryTypesIndexedByProperty = ((Map) getFieldValue(expectedCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        Map actualCallRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertTrue(deepEquals(expectedCallRegistryTypesIndexedByProperty, actualCallRegistryTypesIndexedByProperty));
        
        Map expectedCallRegistryEachRefTypeIndexedByProperty = ((Map) getFieldValue(expectedCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty"));
        Map actualCallRegistryEachRefTypeIndexedByProperty = ((Map) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty"));
        assertTrue(deepEquals(expectedCallRegistryEachRefTypeIndexedByProperty, actualCallRegistryEachRefTypeIndexedByProperty));
        
        Map expectedCallRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(expectedCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        Map actualCallRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        assertTrue(deepEquals(expectedCallRegistryGreatestSubtypeByProperty, actualCallRegistryGreatestSubtypeByProperty));
        
        Multimap expectedCallRegistryInterfaceToImplementors = ((Multimap) getFieldValue(expectedCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        Multimap actualCallRegistryInterfaceToImplementors = ((Multimap) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        int expectedCallRegistryInterfaceToImplementorsValueSetCapacity = ((Integer) getFieldValue(expectedCallRegistryInterfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "valueSetCapacity"));
        int actualCallRegistryInterfaceToImplementorsValueSetCapacity = ((Integer) getFieldValue(actualCallRegistryInterfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "valueSetCapacity"));
        assertEquals(expectedCallRegistryInterfaceToImplementorsValueSetCapacity, actualCallRegistryInterfaceToImplementorsValueSetCapacity);
        
        Object expectedCallRegistryInterfaceToImplementorsMultimapHeaderEntry = getFieldValue(expectedCallRegistryInterfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "multimapHeaderEntry");
        Object actualCallRegistryInterfaceToImplementorsMultimapHeaderEntry = getFieldValue(actualCallRegistryInterfaceToImplementors, "com.google.common.collect.LinkedHashMultimap", "multimapHeaderEntry");
        
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
        
        Map expectedCallRegistryTemplateTypes = ((Map) getFieldValue(expectedCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypes"));
        Map actualCallRegistryTemplateTypes = ((Map) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypes"));
        assertTrue(deepEquals(expectedCallRegistryTemplateTypes, actualCallRegistryTemplateTypes));
        
        boolean actualCallRegistryTolerateUndefinedValues = ((Boolean) getFieldValue(actualCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "tolerateUndefinedValues"));
        assertFalse(actualCallRegistryTolerateUndefinedValues);
        
        JSTypeRegistry.ResolveMode expectedCallRegistryResolveMode = expectedCallRegistry.getResolveMode();
        JSTypeRegistry.ResolveMode actualCallRegistryResolveMode = actualCallRegistry.getResolveMode();
        assertEquals(expectedCallRegistryResolveMode, actualCallRegistryResolveMode);
        
        ObjectType.Property actualPrototypeSlot = ((ObjectType.Property) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        assertNull(actualPrototypeSlot);
        
        Object expectedKind = getFieldValue(expected, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertEquals(expectedKind, actualKind);
        
        Object expectedPropAccess = getFieldValue(expected, "com.google.javascript.rhino.jstype.FunctionType", "propAccess");
        Object actualPropAccess = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "propAccess");
        assertEquals(expectedPropAccess, actualPropAccess);
        
        ObjectType expectedTypeOfThis = expected.getTypeOfThis();
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
        assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
        assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
        assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
        assertTrue(deepEquals(expectedTypeOfThis, actualTypeOfThis));
        Node actualTypeOfThisSource = (((FunctionType) actualTypeOfThis)).getSource();
        assertNull(actualTypeOfThisSource);
        
        List expectedTypeOfThisImplementedInterfaces = ((List) getFieldValue(expectedTypeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        List actualTypeOfThisImplementedInterfaces = ((List) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertTrue(deepEquals(expectedTypeOfThisImplementedInterfaces, actualTypeOfThisImplementedInterfaces));
        
        List expectedTypeOfThisExtendedInterfaces = ((List) getFieldValue(expectedTypeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        List actualTypeOfThisExtendedInterfaces = ((List) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        assertTrue(deepEquals(expectedTypeOfThisExtendedInterfaces, actualTypeOfThisExtendedInterfaces));
        
        List actualTypeOfThisSubTypes = (((FunctionType) actualTypeOfThis)).getSubTypes();
        assertNull(actualTypeOfThisSubTypes);
        
        ImmutableList expectedTypeOfThisTemplateTypeNames = (((FunctionType) expectedTypeOfThis)).getTemplateTypeNames();
        ImmutableList actualTypeOfThisTemplateTypeNames = (((FunctionType) actualTypeOfThis)).getTemplateTypeNames();
        // com.google.common.collect.ImmutableList is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expectedTypeOfThisTemplateTypeNames, actualTypeOfThisTemplateTypeNames));
        
        String actualTypeOfThisClassName = ((String) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualTypeOfThisClassName);
        
        Map expectedTypeOfThisProperties = ((Map) getFieldValue(expectedTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        Map actualTypeOfThisProperties = ((Map) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertTrue(deepEquals(expectedTypeOfThisProperties, actualTypeOfThisProperties));
        
        boolean actualTypeOfThisNativeType = ((Boolean) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertTrue(actualTypeOfThisNativeType);
        
        ObjectType actualTypeOfThisImplicitPrototypeFallback = ((ObjectType) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualTypeOfThisImplicitPrototypeFallback);
        
        FunctionType actualTypeOfThisOwnerFunction = (((PrototypeObjectType) actualTypeOfThis)).getOwnerFunction();
        assertNull(actualTypeOfThisOwnerFunction);
        
        boolean actualTypeOfThisPrettyPrint = ((Boolean) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertTrue(actualTypeOfThisPrettyPrint);
        
        boolean actualTypeOfThisVisited = ((Boolean) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualTypeOfThisVisited);
        
        JSDocInfo actualTypeOfThisDocInfo = ((JSDocInfo) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualTypeOfThisDocInfo);
        
        boolean actualTypeOfThisUnknown = ((Boolean) getFieldValue(actualTypeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertTrue(actualTypeOfThisUnknown);
        
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
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
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
        
        boolean actualDeclared = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.RecordType", "declared"));
        assertFalse(actualDeclared);
        
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
        
        boolean actualInTemplatedCheckVisit = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualInTemplatedCheckVisit);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
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
        Object properties = createInstance("java.util.Collections$UnmodifiableNavigableMap");
        setField(recordType, "com.google.javascript.rhino.jstype.RecordType", "properties", properties);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.defineProperty] produces [java.lang.UnsupportedOperationException]
            java.base/java.util.Collections$UnmodifiableMap.put(Collections.java:1505)
            com.google.javascript.rhino.jstype.RecordType.defineProperty(RecordType.java:146) */
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
            com.google.javascript.rhino.jstype.RecordType.defineProperty(RecordType.java:146) */
        recordType.defineProperty(null, null, false, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.RecordType.isSubtype
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isSubtype(com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.RecordType)
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#isSubtype(com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.RecordType)}
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
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:261) */
        RecordType.isSubtype(null, recordType);
    }
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#isSubtype(com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.RecordType)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testIsSubtype_ThrowClassCastException_2() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        TreeMap properties = ((TreeMap) createInstance("java.util.TreeMap"));
        Object navigableKeySet = createInstance("java.util.TreeMap$KeySet");
        Object m = createInstance("java.util.TreeMap$AscendingSubMap");
        TreeMap m1 = ((TreeMap) createInstance("java.util.TreeMap"));
        ByteArrayLexOrder comparator = ((ByteArrayLexOrder) createInstance("sun.security.util.ByteArrayLexOrder"));
        setField(m1, "java.util.TreeMap", "comparator", comparator);
        Object root = createInstance("java.util.TreeMap$Entry");
        byte[][] key = {};
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(m1, "java.util.TreeMap", "root", root);
        setField(m, "java.util.TreeMap$NavigableSubMap", "m", m1);
        byte[] lo = {(byte) 0};
        setField(m, "java.util.TreeMap$NavigableSubMap", "lo", lo);
        setField(m, "java.util.TreeMap$NavigableSubMap", "loInclusive", true);
        setField(navigableKeySet, "java.util.TreeMap$KeySet", "m", m);
        setField(properties, "java.util.TreeMap", "navigableKeySet", navigableKeySet);
        setField(recordType, "com.google.javascript.rhino.jstype.RecordType", "properties", properties);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isSubtype] produces [java.lang.ClassCastException: class [[B cannot be cast to class [B ([[B and [B are in module java.base of loader 'bootstrap')]
            java.base/sun.security.util.ByteArrayLexOrder.compare(ByteArrayLexOrder.java:36)
            java.base/java.util.TreeMap.compare(TreeMap.java:1570)
            java.base/java.util.TreeMap.getCeilingEntry(TreeMap.java:395)
            java.base/java.util.TreeMap$NavigableSubMap.absLowest(TreeMap.java:1706)
            java.base/java.util.TreeMap$AscendingSubMap.keyIterator(TreeMap.java:2213)
            java.base/java.util.TreeMap$KeySet.iterator(TreeMap.java:1400)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:261) */
        RecordType.isSubtype(null, recordType);
    }
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#isSubtype(com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.RecordType)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testIsSubtype_ThrowClassCastException_1() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        TreeMap properties = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 0;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(properties, "java.util.TreeMap", "root", root);
        Object navigableKeySet = createInstance("java.util.TreeMap$KeySet");
        Object m = createInstance("java.util.TreeMap$AscendingSubMap");
        setField(m, "java.util.TreeMap$NavigableSubMap", "m", properties);
        byte[] hi = {};
        setField(m, "java.util.TreeMap$NavigableSubMap", "hi", hi);
        setField(m, "java.util.TreeMap$NavigableSubMap", "fromStart", true);
        setField(navigableKeySet, "java.util.TreeMap$KeySet", "m", m);
        setField(properties, "java.util.TreeMap", "navigableKeySet", navigableKeySet);
        setField(recordType, "com.google.javascript.rhino.jstype.RecordType", "properties", properties);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isSubtype] produces [java.lang.ClassCastException: class [B cannot be cast to class java.lang.Integer ([B and java.lang.Integer are in module java.base of loader 'bootstrap')]
            java.base/java.lang.Integer.compareTo(Integer.java:71)
            java.base/java.util.TreeMap.compare(TreeMap.java:1569)
            java.base/java.util.TreeMap$NavigableSubMap.tooHigh(TreeMap.java:1677)
            java.base/java.util.TreeMap$NavigableSubMap.absLowest(TreeMap.java:1708)
            java.base/java.util.TreeMap$AscendingSubMap.keyIterator(TreeMap.java:2213)
            java.base/java.util.TreeMap$KeySet.iterator(TreeMap.java:1400)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:261) */
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
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:261) */
        RecordType.isSubtype(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#isSubtype(com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.RecordType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(String property: typeB.properties.keySet())
 *  */
    @Test
    public void testIsSubtype_ThrowNullPointerException_1() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:261) */
        RecordType.isSubtype(null, recordType);
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
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        parameterizedType.setReferencedType(referencedType);
        
        boolean actual = recordType.isSubtype(parameterizedType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsSubtype_ReturnTrue_3() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        namedType.setReferencedType(referencedType);
        
        boolean actual = recordType.isSubtype(namedType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsSubtype_ReturnTrue_2() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType.setReferencedType(referencedType1);
        parameterizedType.setReferencedType(referencedType);
        
        boolean actual = recordType.isSubtype(parameterizedType);
        
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
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ProxyObjectType referencedType3 = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        UnknownType referencedType4 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        namedType.setReferencedType(referencedType);
        
        boolean actual = recordType.isSubtype(namedType);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isSubtype(com.google.javascript.rhino.jstype.JSType)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.RecordType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
     */
    @Test
    public void testIsSubtypeReturnsFalse() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        Map map = emptyMap();
        RecordType recordType = new RecordType(jSTypeRegistry, map, true);
        recordType.setOwnerFunction(null);
        JSTypeRegistry jSTypeRegistry1 = new JSTypeRegistry(null);
        JSTypeRegistry.ResolveMode resolveMode1 = JSTypeRegistry.ResolveMode.IMMEDIATE;
        jSTypeRegistry1.setResolveMode(resolveMode1);
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        hashSet.add(null);
        hashSet.add(null);
        UnionType unionType = new UnionType(jSTypeRegistry1, hashSet);
        Collection alternates = emptyList();
        unionType.alternates = alternates;
        
        boolean actual = recordType.isSubtype(unionType);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isSubtype(com.google.javascript.rhino.jstype.JSType)
    
    @Test(expected = StackOverflowError.class)
    public void testIsSubtype1() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NamedType referencedType4 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        referencedType4.setReferencedType(referencedType3);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        namedType.setReferencedType(referencedType);
        
        recordType.isSubtype(namedType);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testIsSubtype2() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        IndexedType indexedType = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NamedType referencedType2 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        referencedType5.setReferencedType(referencedType2);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        indexedType.setReferencedType(referencedType);
        
        recordType.isSubtype(indexedType);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testIsSubtype3() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NamedType referencedType6 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        referencedType6.setReferencedType(referencedType6);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        parameterizedType.setReferencedType(referencedType);
        
        recordType.isSubtype(parameterizedType);
    }
    
    @Test
    public void testIsSubtype4() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        EnumType enumType = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:227) */
        recordType.isSubtype(enumType);
    }
    
    @Test
    public void testIsSubtype5() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        IndexedType indexedType = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        StringType referencedType = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        indexedType.setReferencedType(referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:227)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222) */
        recordType.isSubtype(indexedType);
    }
    
    @Test
    public void testIsSubtype6() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        StringType referencedType = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        parameterizedType.setReferencedType(referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:227)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222) */
        recordType.isSubtype(parameterizedType);
    }
    
    @Test
    public void testIsSubtype7() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        IndexedType indexedType = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        EnumType referencedType = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        indexedType.setReferencedType(referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:227)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222) */
        recordType.isSubtype(indexedType);
    }
    
    @Test
    public void testIsSubtype8() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        EnumType referencedType = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        parameterizedType.setReferencedType(referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:227)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222) */
        recordType.isSubtype(parameterizedType);
    }
    
    @Test
    public void testIsSubtype9() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        StringType referencedType1 = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        referencedType.setReferencedType(referencedType1);
        namedType.setReferencedType(referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:227)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222) */
        recordType.isSubtype(namedType);
    }
    
    @Test
    public void testIsSubtype10() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        StringType referencedType1 = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        referencedType.setReferencedType(referencedType1);
        parameterizedType.setReferencedType(referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:227)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222) */
        recordType.isSubtype(parameterizedType);
    }
    
    @Test
    public void testIsSubtype11() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        EnumType referencedType1 = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        referencedType.setReferencedType(referencedType1);
        namedType.setReferencedType(referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:227)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222) */
        recordType.isSubtype(namedType);
    }
    
    @Test
    public void testIsSubtype12() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        EnumType referencedType1 = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        referencedType.setReferencedType(referencedType1);
        parameterizedType.setReferencedType(referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:227)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222) */
        recordType.isSubtype(parameterizedType);
    }
    
    @Test
    public void testIsSubtype13() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        StringType stringType = new StringType(null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:227) */
        recordType.isSubtype(stringType);
    }
    
    @Test
    public void testIsSubtype14() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        StringType referencedType2 = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        parameterizedType.setReferencedType(referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:227)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222) */
        recordType.isSubtype(parameterizedType);
    }
    
    @Test
    public void testIsSubtype15() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        IndexedType indexedType = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        StringType referencedType2 = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        indexedType.setReferencedType(referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:227)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222) */
        recordType.isSubtype(indexedType);
    }
    
    @Test
    public void testIsSubtype16() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        EnumType referencedType2 = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        namedType.setReferencedType(referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:227)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222) */
        recordType.isSubtype(namedType);
    }
    
    @Test
    public void testIsSubtype17() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        EnumType referencedType2 = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        parameterizedType.setReferencedType(referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:227)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222) */
        recordType.isSubtype(parameterizedType);
    }
    
    @Test
    public void testIsSubtype18() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NamedType referencedType6 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        namedType.setReferencedType(referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ParameterizedType.isUnknownType(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ParameterizedType.isUnknownType(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ParameterizedType.isUnknownType(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ParameterizedType.isUnknownType(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ParameterizedType.isUnknownType(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ParameterizedType.isUnknownType(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1202)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222) */
        recordType.isSubtype(namedType);
    }
    
    @Test
    public void testIsSubtype19() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        IndexedType indexedType = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NamedType referencedType2 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType6 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType7 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NamedType referencedType8 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        StringType referencedType9 = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
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
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:227)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222) */
        recordType.isSubtype(indexedType);
    }
    
    @Test
    public void testIsSubtype20() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        IndexedType indexedType = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NamedType referencedType2 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType6 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType7 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType8 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        EnumType referencedType9 = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
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
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:227)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222) */
        recordType.isSubtype(indexedType);
    }
    
    @Test
    public void testIsSubtype21() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
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
        EnumType referencedType10 = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
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
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:227)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222) */
        recordType.isSubtype(parameterizedType);
    }
    
    @Test
    public void testIsSubtype22() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType6 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType7 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NamedType referencedType8 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedType9 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NamedType referencedType10 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        StringType referencedType11 = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
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
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:227)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222) */
        recordType.isSubtype(parameterizedType);
    }
    
    @Test
    public void testIsSubtype23() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        IndexedType indexedType = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NamedType referencedType3 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NamedType referencedType6 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedType7 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType8 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType9 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType10 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType11 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        EnumType referencedType12 = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
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
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:227)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222) */
        recordType.isSubtype(indexedType);
    }
    
    @Test
    public void testIsSubtype24() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NamedType referencedType3 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType6 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType7 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType8 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType9 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType10 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NamedType referencedType11 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        NamedType referencedType12 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        StringType referencedType13 = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        referencedType12.setReferencedType(referencedType13);
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
        namedType.setReferencedType(referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.isSubtype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:227)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1224)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222) */
        recordType.isSubtype(namedType);
    }
    
    @Test
    public void testIsSubtype25() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
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
        ParameterizedType referencedType12 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType13 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType14 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType15 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NamedType referencedType16 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        referencedType15.setReferencedType(referencedType16);
        referencedType14.setReferencedType(referencedType15);
        referencedType13.setReferencedType(referencedType14);
        referencedType12.setReferencedType(referencedType13);
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
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ParameterizedType.isUnknownType(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ParameterizedType.isUnknownType(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ParameterizedType.isUnknownType(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ParameterizedType.isUnknownType(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ParameterizedType.isUnknownType(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ParameterizedType.isUnknownType(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ParameterizedType.isUnknownType(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ParameterizedType.isUnknownType(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ParameterizedType.isUnknownType(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ParameterizedType.isUnknownType(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ParameterizedType.isUnknownType(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ParameterizedType.isUnknownType(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ParameterizedType.isUnknownType(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ParameterizedType.isUnknownType(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ParameterizedType.isUnknownType(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ParameterizedType.isUnknownType(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.ParameterizedType.isUnknownType(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1202)
            com.google.javascript.rhino.jstype.RecordType.isSubtype(RecordType.java:222) */
        recordType.isSubtype(parameterizedType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.RecordType.resolveInternal
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return super.resolveInternal(t, scope);
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
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:886)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:890)
            com.google.javascript.rhino.jstype.RecordType.getImplicitPrototype(RecordType.java:135)
            com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal(PrototypeObjectType.java:543)
            com.google.javascript.rhino.jstype.RecordType.resolveInternal(RecordType.java:297) */
        recordType.resolveInternal(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return super.resolveInternal(t, scope);
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
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        NumberType numberType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        nativeTypes[19] = ((JSType) numberType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(recordType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.resolveInternal] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.NumberType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.NumberType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:890)
            com.google.javascript.rhino.jstype.RecordType.getImplicitPrototype(RecordType.java:135)
            com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal(PrototypeObjectType.java:543)
            com.google.javascript.rhino.jstype.RecordType.resolveInternal(RecordType.java:297) */
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
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(parameterizedType, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        NumberType resolveResult = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        setField(parameterizedType, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult);
        nativeTypes[19] = ((JSType) parameterizedType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(recordType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.resolveInternal] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.NumberType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.NumberType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal(PrototypeObjectType.java:546)
            com.google.javascript.rhino.jstype.RecordType.resolveInternal(RecordType.java:297) */
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
        int[] value = {};
        setField(root, "java.util.TreeMap$Entry", "value", value);
        setField(properties, "java.util.TreeMap", "root", root);
        setField(recordType, "com.google.javascript.rhino.jstype.RecordType", "properties", properties);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.resolveInternal] produces [java.lang.ClassCastException: class [I cannot be cast to class com.google.javascript.rhino.jstype.JSType ([I is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.jstype.JSType is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            com.google.javascript.rhino.jstype.RecordType.resolveInternal(RecordType.java:291) */
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
        PrototypeObjectType value = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
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
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:886)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:1269)
            com.google.javascript.rhino.jstype.RecordType.resolveInternal(RecordType.java:292) */
        recordType.resolveInternal(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: JSType resolvedType = type.resolve(t, scope);
 *  */
    @Test
    public void testResolveInternal_ThrowClassCastException_3() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        TreeMap properties = ((TreeMap) createInstance("java.util.TreeMap"));
        Object entrySet = createInstance("java.util.TreeMap$EntrySet");
        TreeMap this$0 = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        FunctionType value = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[36];
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        nativeTypes[35] = ((JSType) enumElementType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(call, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(value, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        setField(root, "java.util.TreeMap$Entry", "value", value);
        Object right = createInstance("java.util.TreeMap$Entry");
        setField(root, "java.util.TreeMap$Entry", "right", right);
        setField(this$0, "java.util.TreeMap", "root", root);
        setField(entrySet, "java.util.TreeMap$EntrySet", "this$0", this$0);
        setField(properties, "java.util.TreeMap", "entrySet", entrySet);
        setField(recordType, "com.google.javascript.rhino.jstype.RecordType", "properties", properties);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.resolveInternal] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.EnumElementType cannot be cast to class com.google.javascript.rhino.jstype.ArrowType (com.google.javascript.rhino.jstype.EnumElementType and com.google.javascript.rhino.jstype.ArrowType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            com.google.javascript.rhino.jstype.FunctionType.resolveInternal(FunctionType.java:1170)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:1274)
            com.google.javascript.rhino.jstype.RecordType.resolveInternal(RecordType.java:292) */
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
            com.google.javascript.rhino.jstype.RecordType.resolveInternal(RecordType.java:290) */
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
        int[] value = {};
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
        ErrorFunctionType value = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
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
        RecordType recordType = new RecordType(jSTypeRegistry, map, true);
        recordType.setOwnerFunction(null);
        
        RecordType actual = ((RecordType) recordType.resolveInternal(null, null));
        
        RecordType expected = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        TreeMap properties = new TreeMap();
        setField(expected, "com.google.javascript.rhino.jstype.RecordType", "properties", properties);
        setField(expected, "com.google.javascript.rhino.jstype.RecordType", "declared", true);
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
        Class propAccessClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Object propAccess = getEnumConstantByName(propAccessClazz, "ANY");
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", implicitPrototypeFallback);
        List implementedInterfaces = new ArrayList();
        constructor.setImplementedInterfaces(implementedInterfaces);
        List extendedInterfaces = new ArrayList();
        constructor.setExtendedInterfaces(extendedInterfaces);
        ArrayList subTypes = new ArrayList();
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
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
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        ObjectType.Property prototypeSlot1 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot1, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type1 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className = "Function.prototype";
        setField(type1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        TreeMap properties3 = new TreeMap();
        setField(type1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties3);
        setField(type1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        type1.setOwnerFunction(functionType);
        setField(type1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot1.setType(type1);
        setField(prototypeSlot1, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot1);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(typeOfThis, "com.google.javascript.rhino.jstype.JSTypeRegistry$1", "this$0", registry);
        ArrowType call2 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Node parameters2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call2, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters2);
        setField(call2, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(call2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "call", call2);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        NoObjectType typeOfThis1 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrowType call3 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.FunctionType", "call", call3);
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis1);
        List implementedInterfaces1 = new ArrayList();
        typeOfThis1.setImplementedInterfaces(implementedInterfaces1);
        List extendedInterfaces1 = new ArrayList();
        typeOfThis1.setExtendedInterfaces(extendedInterfaces1);
        Object templateTypeNames = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(typeOfThis1, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames);
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
        Object templateTypeNames1 = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(typeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames1);
        String className1 = "Function";
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className1);
        TreeMap properties5 = new TreeMap();
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties5);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", type1);
        typeOfThis.setPrettyPrint(true);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        Class functionTypeClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class templateTypeNames1Type = Class.forName("java.util.List");
        Method setImplementedInterfacesMethod = functionTypeClazz.getDeclaredMethod("setImplementedInterfaces", templateTypeNames1Type);
        setImplementedInterfacesMethod.setAccessible(true);
        java.lang.Object[] setImplementedInterfacesMethodArguments = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments[0] = templateTypeNames1;
        setImplementedInterfacesMethod.invoke(functionType, setImplementedInterfacesMethodArguments);
        Method setExtendedInterfacesMethod = functionTypeClazz.getDeclaredMethod("setExtendedInterfaces", templateTypeNames1Type);
        setExtendedInterfacesMethod.setAccessible(true);
        java.lang.Object[] setExtendedInterfacesMethodArguments = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments[0] = templateTypeNames1;
        setExtendedInterfacesMethod.invoke(functionType, setExtendedInterfacesMethodArguments);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames1);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className1);
        TreeMap properties6 = new TreeMap();
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties6);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType.setPrettyPrint(true);
        setField(functionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(functionType);
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
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
        setField(returnType1, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", functionType1);
        TreeMap properties7 = new TreeMap();
        setField(returnType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties7);
        setField(returnType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(returnType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(returnType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(call4, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType1);
        setField(call4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "call", call4);
        ObjectType.Property prototypeSlot2 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot2, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type2 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className2 = "Array.prototype";
        setField(type2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className2);
        TreeMap properties8 = new TreeMap();
        setField(type2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties8);
        setField(type2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(type2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        type2.setOwnerFunction(functionType1);
        setField(type2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot2.setType(type2);
        setField(prototypeSlot2, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot2);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType1);
        java.lang.Object[] setImplementedInterfacesMethodArguments1 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments1[0] = templateTypeNames1;
        setImplementedInterfacesMethod.invoke(functionType1, setImplementedInterfacesMethodArguments1);
        java.lang.Object[] setExtendedInterfacesMethodArguments1 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments1[0] = templateTypeNames1;
        setExtendedInterfacesMethod.invoke(functionType1, setExtendedInterfacesMethodArguments1);
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames1);
        String className3 = "Array";
        setField(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className3);
        TreeMap properties9 = new TreeMap();
        setField(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties9);
        setField(functionType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType1.setPrettyPrint(true);
        setField(functionType1, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType1, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(functionType1);
        FunctionType functionType2 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
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
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "call", call5);
        ObjectType.Property prototypeSlot3 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot3, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type3 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className4 = "Boolean.prototype";
        setField(type3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className4);
        TreeMap properties10 = new TreeMap();
        setField(type3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties10);
        setField(type3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(type3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        type3.setOwnerFunction(functionType2);
        setField(type3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot3.setType(type3);
        setField(prototypeSlot3, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot3);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis2 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", functionType2);
        TreeMap properties11 = new TreeMap();
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties11);
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis2);
        java.lang.Object[] setImplementedInterfacesMethodArguments2 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments2[0] = templateTypeNames1;
        setImplementedInterfacesMethod.invoke(functionType2, setImplementedInterfacesMethodArguments2);
        java.lang.Object[] setExtendedInterfacesMethodArguments2 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments2[0] = templateTypeNames1;
        setExtendedInterfacesMethod.invoke(functionType2, setExtendedInterfacesMethodArguments2);
        setField(functionType2, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames1);
        String className5 = "Boolean";
        setField(functionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className5);
        TreeMap properties12 = new TreeMap();
        setField(functionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties12);
        setField(functionType2, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType2.setPrettyPrint(true);
        setField(functionType2, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType2, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(functionType2);
        FunctionType functionType3 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
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
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "call", call6);
        ObjectType.Property prototypeSlot4 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot4, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type4 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className6 = "Date.prototype";
        setField(type4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className6);
        TreeMap properties13 = new TreeMap();
        setField(type4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties13);
        setField(type4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(type4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        type4.setOwnerFunction(functionType3);
        setField(type4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot4.setType(type4);
        setField(prototypeSlot4, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot4);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis3 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", functionType3);
        TreeMap properties14 = new TreeMap();
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties14);
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(typeOfThis3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis3);
        java.lang.Object[] setImplementedInterfacesMethodArguments3 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments3[0] = templateTypeNames1;
        setImplementedInterfacesMethod.invoke(functionType3, setImplementedInterfacesMethodArguments3);
        java.lang.Object[] setExtendedInterfacesMethodArguments3 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments3[0] = templateTypeNames1;
        setExtendedInterfacesMethod.invoke(functionType3, setExtendedInterfacesMethodArguments3);
        setField(functionType3, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames1);
        String className7 = "Date";
        setField(functionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className7);
        TreeMap properties15 = new TreeMap();
        setField(functionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties15);
        setField(functionType3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType3.setPrettyPrint(true);
        setField(functionType3, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType3, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(functionType3);
        FunctionType functionType4 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
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
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "call", call7);
        ObjectType.Property prototypeSlot5 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot5, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type5 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className8 = "Number.prototype";
        setField(type5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className8);
        TreeMap properties16 = new TreeMap();
        setField(type5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties16);
        setField(type5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(type5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        type5.setOwnerFunction(functionType4);
        setField(type5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot5.setType(type5);
        setField(prototypeSlot5, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot5);
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis4 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", functionType4);
        TreeMap properties17 = new TreeMap();
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties17);
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis4);
        java.lang.Object[] setImplementedInterfacesMethodArguments4 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments4[0] = templateTypeNames1;
        setImplementedInterfacesMethod.invoke(functionType4, setImplementedInterfacesMethodArguments4);
        java.lang.Object[] setExtendedInterfacesMethodArguments4 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments4[0] = templateTypeNames1;
        setExtendedInterfacesMethod.invoke(functionType4, setExtendedInterfacesMethodArguments4);
        setField(functionType4, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames1);
        String className9 = "Number";
        setField(functionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className9);
        TreeMap properties18 = new TreeMap();
        setField(functionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties18);
        setField(functionType4, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType4.setPrettyPrint(true);
        setField(functionType4, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType4, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(functionType4);
        FunctionType functionType5 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
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
        setField(returnType5, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", functionType5);
        TreeMap properties19 = new TreeMap();
        setField(returnType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties19);
        setField(returnType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(returnType5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(returnType5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(call8, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType5);
        setField(call8, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "call", call8);
        ObjectType.Property prototypeSlot6 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot6, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type6 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className10 = "RegExp.prototype";
        setField(type6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className10);
        TreeMap properties20 = new TreeMap();
        setField(type6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties20);
        setField(type6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(type6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        type6.setOwnerFunction(functionType5);
        setField(type6, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(type6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot6.setType(type6);
        setField(prototypeSlot6, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot6);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType5);
        java.lang.Object[] setImplementedInterfacesMethodArguments5 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments5[0] = templateTypeNames1;
        setImplementedInterfacesMethod.invoke(functionType5, setImplementedInterfacesMethodArguments5);
        java.lang.Object[] setExtendedInterfacesMethodArguments5 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments5[0] = templateTypeNames1;
        setExtendedInterfacesMethod.invoke(functionType5, setExtendedInterfacesMethodArguments5);
        setField(functionType5, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames1);
        String className11 = "RegExp";
        setField(functionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className11);
        TreeMap properties21 = new TreeMap();
        setField(functionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties21);
        setField(functionType5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType5.setPrettyPrint(true);
        setField(functionType5, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(functionType5);
        FunctionType functionType6 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
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
        setField(functionType6, "com.google.javascript.rhino.jstype.FunctionType", "call", call9);
        ObjectType.Property prototypeSlot7 = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(prototypeSlot7, "com.google.javascript.rhino.jstype.ObjectType$Property", "name", name);
        PrototypeObjectType type7 = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className12 = "String.prototype";
        setField(type7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className12);
        TreeMap properties22 = new TreeMap();
        setField(type7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties22);
        setField(type7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(type7, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        type7.setOwnerFunction(functionType6);
        setField(type7, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeSlot7.setType(type7);
        setField(prototypeSlot7, "com.google.javascript.rhino.jstype.ObjectType$Property", "inferred", true);
        setField(functionType6, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot7);
        setField(functionType6, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType6, "com.google.javascript.rhino.jstype.FunctionType", "propAccess", propAccess);
        InstanceObjectType typeOfThis5 = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.InstanceObjectType", "constructor", functionType6);
        TreeMap properties23 = new TreeMap();
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties23);
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(typeOfThis5, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionType6, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis5);
        java.lang.Object[] setImplementedInterfacesMethodArguments6 = new java.lang.Object[1];
        setImplementedInterfacesMethodArguments6[0] = templateTypeNames1;
        setImplementedInterfacesMethod.invoke(functionType6, setImplementedInterfacesMethodArguments6);
        java.lang.Object[] setExtendedInterfacesMethodArguments6 = new java.lang.Object[1];
        setExtendedInterfacesMethodArguments6[0] = templateTypeNames1;
        setExtendedInterfacesMethod.invoke(functionType6, setExtendedInterfacesMethodArguments6);
        setField(functionType6, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames1);
        String className13 = "String";
        setField(functionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className13);
        TreeMap properties24 = new TreeMap();
        setField(functionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties24);
        setField(functionType6, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        functionType6.setPrettyPrint(true);
        setField(functionType6, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(functionType6, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        subTypes.add(functionType6);
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "subTypes", subTypes);
        setField(constructor, "com.google.javascript.rhino.jstype.FunctionType", "templateTypeNames", templateTypeNames1);
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
        
        boolean actualDeclared = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.RecordType", "declared"));
        assertTrue(actualDeclared);
        
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
        
        boolean actualImplicitPrototypeFallbackConstructorCallInTemplatedCheckVisit = ((Boolean) getFieldValue(actualImplicitPrototypeFallbackConstructorCall, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualImplicitPrototypeFallbackConstructorCallInTemplatedCheckVisit);
        
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
        
        Map expectedImplicitPrototypeFallbackConstructorCallRegistryTemplateTypes = ((Map) getFieldValue(expectedImplicitPrototypeFallbackConstructorCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypes"));
        Map actualImplicitPrototypeFallbackConstructorCallRegistryTemplateTypes = ((Map) getFieldValue(actualImplicitPrototypeFallbackConstructorCallRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypes"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorCallRegistryTemplateTypes, actualImplicitPrototypeFallbackConstructorCallRegistryTemplateTypes));
        
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
        
        Object expectedImplicitPrototypeFallbackConstructorPropAccess = getFieldValue(expectedImplicitPrototypeFallbackConstructor, "com.google.javascript.rhino.jstype.FunctionType", "propAccess");
        Object actualImplicitPrototypeFallbackConstructorPropAccess = getFieldValue(actualImplicitPrototypeFallbackConstructor, "com.google.javascript.rhino.jstype.FunctionType", "propAccess");
        assertEquals(expectedImplicitPrototypeFallbackConstructorPropAccess, actualImplicitPrototypeFallbackConstructorPropAccess);
        
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
        
        ImmutableList expectedImplicitPrototypeFallbackConstructorTemplateTypeNames = expectedImplicitPrototypeFallbackConstructor.getTemplateTypeNames();
        ImmutableList actualImplicitPrototypeFallbackConstructorTemplateTypeNames = actualImplicitPrototypeFallbackConstructor.getTemplateTypeNames();
        // com.google.common.collect.ImmutableList is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expectedImplicitPrototypeFallbackConstructorTemplateTypeNames, actualImplicitPrototypeFallbackConstructorTemplateTypeNames));
        
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
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    @Test
    public void testResolveInternal1() throws Throwable  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        TreeMap properties = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Object left = createInstance("java.util.TreeMap$Entry");
        EnumElementType value = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(value, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        setField(left, "java.util.TreeMap$Entry", "value", value);
        setField(root, "java.util.TreeMap$Entry", "left", left);
        setField(properties, "java.util.TreeMap", "root", root);
        Object entrySet = createInstance("java.util.TreeMap$EntrySet");
        setField(entrySet, "java.util.TreeMap$EntrySet", "this$0", properties);
        setField(properties, "java.util.TreeMap", "entrySet", entrySet);
        setField(recordType, "com.google.javascript.rhino.jstype.RecordType", "properties", properties);
        Object oldRhinoErrorReporter = createInstance("com.google.javascript.jscomp.RhinoErrorReporter$OldRhinoErrorReporter");
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:1269)
            com.google.javascript.rhino.jstype.RecordType.resolveInternal(RecordType.java:292) */
        Class recordTypeClazz = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class oldRhinoErrorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class staticScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method resolveInternalMethod = recordTypeClazz.getDeclaredMethod("resolveInternal", oldRhinoErrorReporterType, staticScopeType);
        resolveInternalMethod.setAccessible(true);
        java.lang.Object[] resolveInternalMethodArguments = new java.lang.Object[2];
        resolveInternalMethodArguments[0] = oldRhinoErrorReporter;
        resolveInternalMethodArguments[1] = ((Object) null);
        try {
            resolveInternalMethod.invoke(recordType, resolveInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    @Test(timeout = 1000L)
    public void testResolveInternal2() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        TreeMap properties = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        EnumElementType value = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(root, "java.util.TreeMap$Entry", "value", value);
        setField(root, "java.util.TreeMap$Entry", "parent", root);
        setField(properties, "java.util.TreeMap", "root", root);
        setField(recordType, "com.google.javascript.rhino.jstype.RecordType", "properties", properties);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        recordType.resolveInternal(null, null);
    }
    
    @Test(timeout = 1000L)
    public void testResolveInternal3() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        TreeMap properties = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        EnumElementType value = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(value, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        setField(root, "java.util.TreeMap$Entry", "value", value);
        setField(root, "java.util.TreeMap$Entry", "right", root);
        setField(properties, "java.util.TreeMap", "root", root);
        setField(recordType, "com.google.javascript.rhino.jstype.RecordType", "properties", properties);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        recordType.resolveInternal(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.RecordType.isSynthetic
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSynthetic()
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#isSynthetic()}
 * @utbot.returnsFrom {@code return !declared;}
 *  */
    @Test
    public void testIsSynthetic_NotDeclared() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        setField(recordType, "com.google.javascript.rhino.jstype.RecordType", "declared", true);
        
        boolean actual = recordType.isSynthetic();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link RecordType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordType#isSynthetic()}
 * @utbot.returnsFrom {@code return !declared;}
 *  */
    @Test
    public void testIsSynthetic_NotDeclared_1() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        
        boolean actual = recordType.isSynthetic();
        
        assertTrue(actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields918673774916900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields918673774916900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass918673774925700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields918673774916900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass918673774925700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields918673775509900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields918673775509900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass918673775511900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields918673775509900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass918673775511900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

