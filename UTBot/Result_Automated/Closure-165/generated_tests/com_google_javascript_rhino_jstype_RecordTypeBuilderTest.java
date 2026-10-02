package com.google.javascript.rhino.jstype;

import org.junit.Test;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.SortedMap;
import java.util.Map;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.ErrorReporter;
import java.util.Set;
import com.google.common.collect.Multimap;
import com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode;
import com.google.javascript.rhino.jstype.RecordTypeBuilder.RecordProperty;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public final class com_google_javascript_rhino_jstype_RecordTypeBuilderTest {
    ///region Test suites for executable com.google.javascript.rhino.jstype.RecordTypeBuilder.build
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method build()
    
    /**
    @utbot.classUnderTest {@link RecordTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordTypeBuilder#build()}
 * @utbot.executesCondition {@code (isEmpty): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.returnsFrom {@code return registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);}
 *  */
    @Test
    public void testBuild_IsEmpty() throws Exception  {
        RecordTypeBuilder recordTypeBuilder = ((RecordTypeBuilder) createInstance("com.google.javascript.rhino.jstype.RecordTypeBuilder"));
        setField(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "isEmpty", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[38];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry", registry);
        
        JSType actual = recordTypeBuilder.build();
        
        assertNull(actual);
        
        JSTypeRegistry recordTypeBuilderRegistry = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes0 = ((JSType) get(recordTypeBuilderRegistryRegistryNativeTypes, 0));
        JSTypeRegistry recordTypeBuilderRegistry1 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes1 = ((JSType) get(recordTypeBuilderRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry recordTypeBuilderRegistry2 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes2 = ((JSType) get(recordTypeBuilderRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry recordTypeBuilderRegistry3 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes3 = ((JSType) get(recordTypeBuilderRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry recordTypeBuilderRegistry4 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes4 = ((JSType) get(recordTypeBuilderRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry recordTypeBuilderRegistry5 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes5 = ((JSType) get(recordTypeBuilderRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry recordTypeBuilderRegistry6 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes6 = ((JSType) get(recordTypeBuilderRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry recordTypeBuilderRegistry7 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes7 = ((JSType) get(recordTypeBuilderRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry recordTypeBuilderRegistry8 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes8 = ((JSType) get(recordTypeBuilderRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry recordTypeBuilderRegistry9 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes9 = ((JSType) get(recordTypeBuilderRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry recordTypeBuilderRegistry10 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes10 = ((JSType) get(recordTypeBuilderRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry recordTypeBuilderRegistry11 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes11 = ((JSType) get(recordTypeBuilderRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry recordTypeBuilderRegistry12 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes12 = ((JSType) get(recordTypeBuilderRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry recordTypeBuilderRegistry13 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes13 = ((JSType) get(recordTypeBuilderRegistry13RegistryNativeTypes, 13));
        JSTypeRegistry recordTypeBuilderRegistry14 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes14 = ((JSType) get(recordTypeBuilderRegistry14RegistryNativeTypes, 14));
        JSTypeRegistry recordTypeBuilderRegistry15 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry15RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes15 = ((JSType) get(recordTypeBuilderRegistry15RegistryNativeTypes, 15));
        JSTypeRegistry recordTypeBuilderRegistry16 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry16RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes16 = ((JSType) get(recordTypeBuilderRegistry16RegistryNativeTypes, 16));
        JSTypeRegistry recordTypeBuilderRegistry17 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry17RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes17 = ((JSType) get(recordTypeBuilderRegistry17RegistryNativeTypes, 17));
        JSTypeRegistry recordTypeBuilderRegistry18 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry18RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes18 = ((JSType) get(recordTypeBuilderRegistry18RegistryNativeTypes, 18));
        JSTypeRegistry recordTypeBuilderRegistry19 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry19RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes19 = ((JSType) get(recordTypeBuilderRegistry19RegistryNativeTypes, 19));
        JSTypeRegistry recordTypeBuilderRegistry20 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry20RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes20 = ((JSType) get(recordTypeBuilderRegistry20RegistryNativeTypes, 20));
        JSTypeRegistry recordTypeBuilderRegistry21 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry21RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes21 = ((JSType) get(recordTypeBuilderRegistry21RegistryNativeTypes, 21));
        JSTypeRegistry recordTypeBuilderRegistry22 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry22RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes22 = ((JSType) get(recordTypeBuilderRegistry22RegistryNativeTypes, 22));
        JSTypeRegistry recordTypeBuilderRegistry23 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry23RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes23 = ((JSType) get(recordTypeBuilderRegistry23RegistryNativeTypes, 23));
        JSTypeRegistry recordTypeBuilderRegistry24 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry24RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes24 = ((JSType) get(recordTypeBuilderRegistry24RegistryNativeTypes, 24));
        JSTypeRegistry recordTypeBuilderRegistry25 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry25RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes25 = ((JSType) get(recordTypeBuilderRegistry25RegistryNativeTypes, 25));
        JSTypeRegistry recordTypeBuilderRegistry26 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry26RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes26 = ((JSType) get(recordTypeBuilderRegistry26RegistryNativeTypes, 26));
        JSTypeRegistry recordTypeBuilderRegistry27 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry27RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes27 = ((JSType) get(recordTypeBuilderRegistry27RegistryNativeTypes, 27));
        JSTypeRegistry recordTypeBuilderRegistry28 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry28RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes28 = ((JSType) get(recordTypeBuilderRegistry28RegistryNativeTypes, 28));
        JSTypeRegistry recordTypeBuilderRegistry29 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry29RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes29 = ((JSType) get(recordTypeBuilderRegistry29RegistryNativeTypes, 29));
        JSTypeRegistry recordTypeBuilderRegistry30 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry30RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes30 = ((JSType) get(recordTypeBuilderRegistry30RegistryNativeTypes, 30));
        JSTypeRegistry recordTypeBuilderRegistry31 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry31RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry31, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes31 = ((JSType) get(recordTypeBuilderRegistry31RegistryNativeTypes, 31));
        JSTypeRegistry recordTypeBuilderRegistry32 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry32RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry32, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes32 = ((JSType) get(recordTypeBuilderRegistry32RegistryNativeTypes, 32));
        JSTypeRegistry recordTypeBuilderRegistry33 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry33RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry33, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes33 = ((JSType) get(recordTypeBuilderRegistry33RegistryNativeTypes, 33));
        JSTypeRegistry recordTypeBuilderRegistry34 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry34RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry34, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes34 = ((JSType) get(recordTypeBuilderRegistry34RegistryNativeTypes, 34));
        JSTypeRegistry recordTypeBuilderRegistry35 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry35RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry35, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes35 = ((JSType) get(recordTypeBuilderRegistry35RegistryNativeTypes, 35));
        JSTypeRegistry recordTypeBuilderRegistry36 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry36RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry36, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes36 = ((JSType) get(recordTypeBuilderRegistry36RegistryNativeTypes, 36));
        JSTypeRegistry recordTypeBuilderRegistry37 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry37RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry37, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes37 = ((JSType) get(recordTypeBuilderRegistry37RegistryNativeTypes, 37));
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes0);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes1);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes2);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes3);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes4);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes5);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes6);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes7);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes8);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes9);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes10);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes11);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes12);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes13);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes14);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes15);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes16);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes17);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes18);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes19);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes20);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes21);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes22);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes23);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes24);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes25);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes26);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes27);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes28);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes29);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes30);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes31);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes32);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes33);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes34);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes35);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes36);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes37);
    }
    
    /**
    @utbot.classUnderTest {@link RecordTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordTypeBuilder#build()}
 * @utbot.executesCondition {@code (isEmpty): False}
 * @utbot.invokes {@link java.util.Collections#unmodifiableMap(java.util.Map)}
 * @utbot.returnsFrom {@code return new RecordType(registry, Collections.unmodifiableMap(properties));}
 *  */
    @Test
    public void testBuild_NotIsEmpty() throws Exception  {
        RecordTypeBuilder recordTypeBuilder = ((RecordTypeBuilder) createInstance("com.google.javascript.rhino.jstype.RecordTypeBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry", registry);
        HashMap properties = new HashMap();
        setField(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "properties", properties);
        
        RecordType actual = ((RecordType) recordTypeBuilder.build());
        
        RecordType expected = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        TreeMap properties1 = new TreeMap();
        setField(expected, "com.google.javascript.rhino.jstype.RecordType", "properties", properties1);
        setField(expected, "com.google.javascript.rhino.jstype.RecordType", "isFrozen", true);
        TreeMap properties2 = new TreeMap();
        setField(expected, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties2);
        expected.setPrettyPrint(true);
        setField(expected, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
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
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        FunctionType actualOwnerFunction = actual.getOwnerFunction();
        assertNull(actualOwnerFunction);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertTrue(actualPrettyPrint);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertTrue(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry expectedRegistry = expected.registry;
        JSTypeRegistry actualRegistry = actual.registry;
        ErrorReporter actualRegistryReporter = ((ErrorReporter) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        assertNull(actualRegistryReporter);
        
        com.google.javascript.rhino.jstype.JSType[] expectedRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(expectedRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        com.google.javascript.rhino.jstype.JSType[] actualRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        int expectedRegistryNativeTypesSize = expectedRegistryNativeTypes.length;
        assertEquals(expectedRegistryNativeTypesSize, actualRegistryNativeTypes.length);
        assertTrue(deepEquals(expectedRegistryNativeTypes, actualRegistryNativeTypes));
        
        Map actualRegistryNamesToTypes = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        assertNull(actualRegistryNamesToTypes);
        
        Set actualRegistryNamespaces = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        assertNull(actualRegistryNamespaces);
        
        Set actualRegistryNonNullableTypeNames = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames"));
        assertNull(actualRegistryNonNullableTypeNames);
        
        Set actualRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertNull(actualRegistryForwardDeclaredTypes);
        
        Map actualRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertNull(actualRegistryTypesIndexedByProperty);
        
        Map actualRegistryEachRefTypeIndexedByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty"));
        assertNull(actualRegistryEachRefTypeIndexedByProperty);
        
        Map actualRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        assertNull(actualRegistryGreatestSubtypeByProperty);
        
        Multimap actualRegistryInterfaceToImplementors = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        assertNull(actualRegistryInterfaceToImplementors);
        
        Multimap actualRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
        assertNull(actualRegistryUnresolvedNamedTypes);
        
        Multimap actualRegistryResolvedNamedTypes = ((Multimap) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
        assertNull(actualRegistryResolvedNamedTypes);
        
        boolean actualRegistryLastGeneration = ((Boolean) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "lastGeneration"));
        assertFalse(actualRegistryLastGeneration);
        
        String actualRegistryTemplateTypeName = ((String) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypeName"));
        assertNull(actualRegistryTemplateTypeName);
        
        TemplateType actualRegistryTemplateType = ((TemplateType) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
        assertNull(actualRegistryTemplateType);
        
        boolean actualRegistryTolerateUndefinedValues = ((Boolean) getFieldValue(actualRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "tolerateUndefinedValues"));
        assertFalse(actualRegistryTolerateUndefinedValues);
        
        JSTypeRegistry.ResolveMode actualRegistryResolveMode = actualRegistry.getResolveMode();
        assertNull(actualRegistryResolveMode);
        
        JSTypeRegistry recordTypeBuilderRegistry = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes0 = ((JSType) get(recordTypeBuilderRegistryRegistryNativeTypes, 0));
        JSTypeRegistry recordTypeBuilderRegistry1 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry1RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes1 = ((JSType) get(recordTypeBuilderRegistry1RegistryNativeTypes, 1));
        JSTypeRegistry recordTypeBuilderRegistry2 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry2RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes2 = ((JSType) get(recordTypeBuilderRegistry2RegistryNativeTypes, 2));
        JSTypeRegistry recordTypeBuilderRegistry3 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry3RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes3 = ((JSType) get(recordTypeBuilderRegistry3RegistryNativeTypes, 3));
        JSTypeRegistry recordTypeBuilderRegistry4 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry4RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes4 = ((JSType) get(recordTypeBuilderRegistry4RegistryNativeTypes, 4));
        JSTypeRegistry recordTypeBuilderRegistry5 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry5RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes5 = ((JSType) get(recordTypeBuilderRegistry5RegistryNativeTypes, 5));
        JSTypeRegistry recordTypeBuilderRegistry6 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry6RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes6 = ((JSType) get(recordTypeBuilderRegistry6RegistryNativeTypes, 6));
        JSTypeRegistry recordTypeBuilderRegistry7 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry7RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes7 = ((JSType) get(recordTypeBuilderRegistry7RegistryNativeTypes, 7));
        JSTypeRegistry recordTypeBuilderRegistry8 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry8RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes8 = ((JSType) get(recordTypeBuilderRegistry8RegistryNativeTypes, 8));
        JSTypeRegistry recordTypeBuilderRegistry9 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry9RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes9 = ((JSType) get(recordTypeBuilderRegistry9RegistryNativeTypes, 9));
        JSTypeRegistry recordTypeBuilderRegistry10 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry10RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes10 = ((JSType) get(recordTypeBuilderRegistry10RegistryNativeTypes, 10));
        JSTypeRegistry recordTypeBuilderRegistry11 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry11RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes11 = ((JSType) get(recordTypeBuilderRegistry11RegistryNativeTypes, 11));
        JSTypeRegistry recordTypeBuilderRegistry12 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry12RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes12 = ((JSType) get(recordTypeBuilderRegistry12RegistryNativeTypes, 12));
        JSTypeRegistry recordTypeBuilderRegistry13 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry13RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes13 = ((JSType) get(recordTypeBuilderRegistry13RegistryNativeTypes, 13));
        JSTypeRegistry recordTypeBuilderRegistry14 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry14RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes14 = ((JSType) get(recordTypeBuilderRegistry14RegistryNativeTypes, 14));
        JSTypeRegistry recordTypeBuilderRegistry15 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry15RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes15 = ((JSType) get(recordTypeBuilderRegistry15RegistryNativeTypes, 15));
        JSTypeRegistry recordTypeBuilderRegistry16 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry16RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes16 = ((JSType) get(recordTypeBuilderRegistry16RegistryNativeTypes, 16));
        JSTypeRegistry recordTypeBuilderRegistry17 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry17RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes17 = ((JSType) get(recordTypeBuilderRegistry17RegistryNativeTypes, 17));
        JSTypeRegistry recordTypeBuilderRegistry18 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry18RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes18 = ((JSType) get(recordTypeBuilderRegistry18RegistryNativeTypes, 18));
        JSTypeRegistry recordTypeBuilderRegistry19 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry19RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes19 = ((JSType) get(recordTypeBuilderRegistry19RegistryNativeTypes, 19));
        JSTypeRegistry recordTypeBuilderRegistry20 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry20RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes20 = ((JSType) get(recordTypeBuilderRegistry20RegistryNativeTypes, 20));
        JSTypeRegistry recordTypeBuilderRegistry21 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry21RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes21 = ((JSType) get(recordTypeBuilderRegistry21RegistryNativeTypes, 21));
        JSTypeRegistry recordTypeBuilderRegistry22 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry22RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes22 = ((JSType) get(recordTypeBuilderRegistry22RegistryNativeTypes, 22));
        JSTypeRegistry recordTypeBuilderRegistry23 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry23RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes23 = ((JSType) get(recordTypeBuilderRegistry23RegistryNativeTypes, 23));
        JSTypeRegistry recordTypeBuilderRegistry24 = ((JSTypeRegistry) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        com.google.javascript.rhino.jstype.JSType[] recordTypeBuilderRegistry24RegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(recordTypeBuilderRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalRecordTypeBuilderRegistryNativeTypes24 = ((JSType) get(recordTypeBuilderRegistry24RegistryNativeTypes, 24));
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes0);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes1);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes2);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes3);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes4);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes5);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes6);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes7);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes8);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes9);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes10);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes11);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes12);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes13);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes14);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes15);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes16);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes17);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes18);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes19);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes20);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes21);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes22);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes23);
        
        assertNull(finalRecordTypeBuilderRegistryNativeTypes24);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method build()
    
    /**
    @utbot.classUnderTest {@link RecordTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordTypeBuilder#build()}
 * @utbot.executesCondition {@code (isEmpty): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
 *  */
    @Test
    public void testBuild_ThrowClassCastException() throws Exception  {
        RecordTypeBuilder recordTypeBuilder = ((RecordTypeBuilder) createInstance("com.google.javascript.rhino.jstype.RecordTypeBuilder"));
        setField(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "isEmpty", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        NumberType numberType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        nativeTypes[19] = ((JSType) numberType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordTypeBuilder.build] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.NumberType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.NumberType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4d7985b3)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:883)
            com.google.javascript.rhino.jstype.RecordTypeBuilder.build(RecordTypeBuilder.java:88) */
        recordTypeBuilder.build();
    }
    
    /**
    @utbot.classUnderTest {@link RecordTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordTypeBuilder#build()}
 * @utbot.executesCondition {@code (isEmpty): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
 *  */
    @Test
    public void testBuild_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        RecordTypeBuilder recordTypeBuilder = ((RecordTypeBuilder) createInstance("com.google.javascript.rhino.jstype.RecordTypeBuilder"));
        setField(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "isEmpty", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordTypeBuilder.build] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:879)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:883)
            com.google.javascript.rhino.jstype.RecordTypeBuilder.build(RecordTypeBuilder.java:88) */
        recordTypeBuilder.build();
    }
    
    /**
    @utbot.classUnderTest {@link RecordTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordTypeBuilder#build()}
 * @utbot.executesCondition {@code (isEmpty): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testBuild_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        RecordTypeBuilder recordTypeBuilder = ((RecordTypeBuilder) createInstance("com.google.javascript.rhino.jstype.RecordTypeBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry", registry);
        HashMap properties = new HashMap();
        setField(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "properties", properties);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordTypeBuilder.build] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:879)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:883)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:123)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:106)
            com.google.javascript.rhino.jstype.RecordType.<init>(RecordType.java:84)
            com.google.javascript.rhino.jstype.RecordTypeBuilder.build(RecordTypeBuilder.java:92) */
        recordTypeBuilder.build();
    }
    
    /**
    @utbot.classUnderTest {@link RecordTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordTypeBuilder#build()}
 * @utbot.executesCondition {@code (isEmpty): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: registry
 *  */
    @Test
    public void testBuild_ThrowClassCastException_1() throws Exception  {
        RecordTypeBuilder recordTypeBuilder = ((RecordTypeBuilder) createInstance("com.google.javascript.rhino.jstype.RecordTypeBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry", registry);
        HashMap properties = new HashMap();
        Object object = createInstance("java.lang.Object");
        properties.put(null, object);
        setField(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "properties", properties);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordTypeBuilder.build] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.google.javascript.rhino.jstype.RecordTypeBuilder$RecordProperty (java.lang.Object is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.jstype.RecordTypeBuilder$RecordProperty is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4d7985b3)]
            com.google.javascript.rhino.jstype.RecordType.<init>(RecordType.java:88)
            com.google.javascript.rhino.jstype.RecordTypeBuilder.build(RecordTypeBuilder.java:92) */
        recordTypeBuilder.build();
    }
    
    /**
    @utbot.classUnderTest {@link RecordTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordTypeBuilder#build()}
 * @utbot.executesCondition {@code (isEmpty): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
 *  */
    @Test
    public void testBuild_ThrowNullPointerException() throws Exception  {
        RecordTypeBuilder recordTypeBuilder = ((RecordTypeBuilder) createInstance("com.google.javascript.rhino.jstype.RecordTypeBuilder"));
        setField(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "isEmpty", true);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordTypeBuilder.build] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordTypeBuilder.build(RecordTypeBuilder.java:88) */
        recordTypeBuilder.build();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method build()
    
    /**
    @utbot.classUnderTest {@link RecordTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordTypeBuilder#build()}
 * @utbot.executesCondition {@code (isEmpty): False}
 * @utbot.invokes {@link java.util.Collections#unmodifiableMap(java.util.Map)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: registry
 *  */
    @Test(expected = IllegalStateException.class)
    public void testBuild_ThrowIllegalStateException() throws Exception  {
        RecordTypeBuilder recordTypeBuilder = ((RecordTypeBuilder) createInstance("com.google.javascript.rhino.jstype.RecordTypeBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[25];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry", registry);
        HashMap properties = new HashMap();
        properties.put(null, null);
        setField(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "properties", properties);
        
        recordTypeBuilder.build();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.RecordTypeBuilder.addProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addProperty(java.lang.String, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link RecordTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordTypeBuilder#addProperty(java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (properties.containsKey(name)): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testAddProperty_PropertiesContainsKey() throws Exception  {
        RecordTypeBuilder recordTypeBuilder = ((RecordTypeBuilder) createInstance("com.google.javascript.rhino.jstype.RecordTypeBuilder"));
        HashMap properties = new HashMap();
        String string = "";
        RecordTypeBuilder.RecordProperty recordProperty = ((RecordTypeBuilder.RecordProperty) createInstance("com.google.javascript.rhino.jstype.RecordTypeBuilder$RecordProperty"));
        properties.put(string, recordProperty);
        setField(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "properties", properties);
        
        RecordTypeBuilder actual = recordTypeBuilder.addProperty(string, null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link RecordTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordTypeBuilder#addProperty(java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (properties.containsKey(name)): False}
 * @utbot.invokes {@link java.util.HashMap#put(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAddProperty_NotPropertiesContainsKey() throws Exception  {
        RecordTypeBuilder recordTypeBuilder = ((RecordTypeBuilder) createInstance("com.google.javascript.rhino.jstype.RecordTypeBuilder"));
        HashMap properties = new HashMap();
        setField(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "properties", properties);
        
        RecordTypeBuilder actual = recordTypeBuilder.addProperty(null, null, null);
        
        boolean actualIsEmpty = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "isEmpty"));
        assertFalse(actualIsEmpty);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "registry"));
        assertNull(actualRegistry);
        
        HashMap recordTypeBuilderProperties = ((HashMap) getFieldValue(recordTypeBuilder, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "properties"));
        HashMap actualProperties = ((HashMap) getFieldValue(actual, "com.google.javascript.rhino.jstype.RecordTypeBuilder", "properties"));
        assertTrue(deepEquals(recordTypeBuilderProperties, actualProperties));
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addProperty(java.lang.String, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link RecordTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.RecordTypeBuilder#addProperty(java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link java.util.HashMap#containsKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: properties.containsKey(name)
 *  */
    @Test
    public void testAddProperty_ThrowNullPointerException() throws Exception  {
        RecordTypeBuilder recordTypeBuilder = ((RecordTypeBuilder) createInstance("com.google.javascript.rhino.jstype.RecordTypeBuilder"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.RecordTypeBuilder.addProperty] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.RecordTypeBuilder.addProperty(RecordTypeBuilder.java:74) */
        recordTypeBuilder.addProperty(null, null, null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields917110110785200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields917110110785200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass917110110792100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields917110110785200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass917110110792100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields917110111163600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields917110111163600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass917110111167800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields917110111163600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass917110111167800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

