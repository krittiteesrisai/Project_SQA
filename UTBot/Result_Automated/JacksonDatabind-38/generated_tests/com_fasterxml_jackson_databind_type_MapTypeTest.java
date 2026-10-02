package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;

public final class com_fasterxml_jackson_databind_type_MapTypeTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapType.toString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#toString()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return "[map type; class " + _class.getName() + ", " + _keyType + " -> " + _valueType + "]";
 *  */
    @Test
    public void testToString_ThrowNullPointerException() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapType.toString(MapType.java:153) */
        mapType.toString();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()
    
    @Test
    public void testToString1() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ArrayType _keyType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = mapType.toString();
        
        String expected = "[map type; class java.lang.Object, [array type, component type: null] -> null]";
        
        assertEquals(expected, actual);
        
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    
    @Test
    public void testToString2() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = mapType._keyType;
        Class initialMapType_keyType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = mapType.toString();
        
        String expected = "[map type; class java.lang.Object, [map type; class java.lang.Object, null -> null] -> null]";
        
        assertEquals(expected, actual);
        
        JavaType javaType1 = mapType._keyType;
        Class finalMapType_keyType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_keyType_class == finalMapType_keyType_class);
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    
    @Test
    public void testToString3() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = mapType._keyType;
        Class initialMapType_keyType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = mapType.toString();
        
        String expected = "[map type; class java.lang.Object, [map-like type; class java.lang.Object, null -> null] -> null]";
        
        assertEquals(expected, actual);
        
        JavaType javaType1 = mapType._keyType;
        Class finalMapType_keyType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_keyType_class == finalMapType_keyType_class);
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    
    @Test
    public void testToString4() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ArrayType _valueType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = mapType.toString();
        
        String expected = "[map type; class java.lang.Object, null -> [array type, component type: null]]";
        
        assertEquals(expected, actual);
        
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    
    @Test
    public void testToString5() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = mapType.toString();
        
        String expected = "[map type; class java.lang.Object, null -> null]";
        
        assertEquals(expected, actual);
        
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toString()
    
    @Test
    public void testToString6() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        SimpleType _keyType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:191)
            com.fasterxml.jackson.databind.type.SimpleType.toString(SimpleType.java:262)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.MapType.toString(MapType.java:153) */
        mapType.toString();
    }
    
    @Test
    public void testToString7() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:145)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:212)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.MapType.toString(MapType.java:153) */
        mapType.toString();
    }
    
    @Test
    public void testToString8() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:143)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:212)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.MapType.toString(MapType.java:153) */
        mapType.toString();
    }
    
    @Test
    public void testToString9() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        SimpleType _valueType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:191)
            com.fasterxml.jackson.databind.type.SimpleType.toString(SimpleType.java:262)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.MapType.toString(MapType.java:153) */
        mapType.toString();
    }
    
    @Test
    public void testToString10() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ReferenceType _valueType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:143)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:212)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.MapType.toString(MapType.java:153) */
        mapType.toString();
    }
    
    @Test
    public void testToString11() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.toString(MapLikeType.java:261)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.MapType.toString(MapType.java:153) */
        mapType.toString();
    }
    
    @Test
    public void testToString12() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapType.toString(MapType.java:153)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.MapType.toString(MapType.java:153) */
        mapType.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapType.construct
    
    ///region OTHER: ERROR SUITE for method construct(java.lang.Class, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JavaType)
    
    @Test
    public void testConstruct1() {
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapType.construct] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.<init>(MapLikeType.java:38)
            com.fasterxml.jackson.databind.type.MapType.<init>(MapType.java:22)
            com.fasterxml.jackson.databind.type.MapType.construct(MapType.java:48) */
        MapType.construct(class1, ((JavaType) null), ((JavaType) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapType.construct
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method construct(java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings, com.fasterxml.jackson.databind.JavaType, [Lcom.fasterxml.jackson.databind.JavaType;, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#construct(java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[],com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return new MapType(rawType, bindings, superClass, superInts, keyT, valueT, null, null, false);}
 *  */
    @Test
    public void testConstruct_Return_1() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        Class typeBaseClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        TypeBindings prevNO_BINDINGS = ((TypeBindings) getStaticFieldValue(typeBaseClazz, "NO_BINDINGS"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            setStaticField(typeBaseClazz, "NO_BINDINGS", empty);
            Class class1 = Object.class;
            MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
            
            MapType actual = MapType.construct(class1, null, null, null, mapType, mapType);
            
            MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", mapType);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", mapType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            
            JavaType expected_keyType = expected._keyType;
            JavaType actual_keyType = actual._keyType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_keyType, actual_keyType);
            
            JavaType expected_valueType = expected._valueType;
            JavaType actual_valueType = actual._valueType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_valueType, actual_valueType);
            
            JavaType actual_superClass = actual._superClass;
            assertNull(actual_superClass);
            
            com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
            assertNull(actual_superInterfaces);
            
            TypeBindings expected_bindings = expected._bindings;
            TypeBindings actual_bindings = actual._bindings;
            // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
            assertEquals(expected_bindings, actual_bindings);
            
            String actual_canonicalName = actual._canonicalName;
            assertNull(actual_canonicalName);
            
            Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
            assertEquals(Class.class, actual_class.getClass());
            
            int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            assertEquals(expected_hash, actual_hash);
            
            Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
            assertNull(actual_valueHandler);
            
            Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
            assertNull(actual_typeHandler);
            
            boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
            assertFalse(actual_asStatic);
            
            Class finalClass1 = class1;
            
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#construct(java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[],com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return new MapType(rawType, bindings, superClass, superInts, keyT, valueT, null, null, false);}
 *  */
    @Test
    public void testConstruct_Return() throws Exception  {
        Class class1 = Object.class;
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_hash", -190);
        MapType mapType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(mapType1, "com.fasterxml.jackson.databind.JavaType", "_hash", -254);
        
        MapType actual = MapType.construct(class1, typeBindings, null, null, mapType, mapType1);
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", mapType);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", mapType1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", typeBindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877075);
        
        JavaType expected_keyType = expected._keyType;
        JavaType actual_keyType = actual._keyType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_keyType, actual_keyType);
        
        JavaType expected_valueType = expected._valueType;
        JavaType actual_valueType = actual._valueType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_valueType, actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapType.withKeyValueHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withKeyValueHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withKeyValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType.withValueHandler(h), _valueType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithKeyValueHandler_Return_4() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        SimpleType _keyType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = mapType._valueType;
        Class initialMapType_valueType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapType actual = mapType.withKeyValueHandler(((Object) null));
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        JavaType expected_keyType = expected._keyType;
        JavaType actual_keyType = actual._keyType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_keyType, actual_keyType);
        
        JavaType expected_valueType = expected._valueType;
        JavaType actual_valueType = actual._valueType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_valueType, actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        JavaType javaType1 = mapType._valueType;
        Class finalMapType_valueType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_valueType_class == finalMapType_valueType_class);
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withKeyValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType.withValueHandler(h), _valueType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithKeyValueHandler_Return_2() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = mapType._valueType;
        Class initialMapType_valueType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapType actual = mapType.withKeyValueHandler(((Object) null));
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        JavaType expected_keyType = expected._keyType;
        JavaType actual_keyType = actual._keyType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_keyType, actual_keyType);
        
        JavaType expected_valueType = expected._valueType;
        JavaType actual_valueType = actual._valueType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_valueType, actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        JavaType javaType1 = mapType._valueType;
        Class finalMapType_valueType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_valueType_class == finalMapType_valueType_class);
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withKeyValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType.withValueHandler(h), _valueType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithKeyValueHandler_Return_6() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ArrayType _keyType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = mapType._valueType;
        Class initialMapType_valueType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapType actual = mapType.withKeyValueHandler(((Object) null));
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        JavaType expected_keyType = expected._keyType;
        JavaType actual_keyType = actual._keyType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_keyType, actual_keyType);
        
        JavaType expected_valueType = expected._valueType;
        JavaType actual_valueType = actual._valueType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_valueType, actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        JavaType javaType1 = mapType._valueType;
        Class finalMapType_valueType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_valueType_class == finalMapType_valueType_class);
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withKeyValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType.withValueHandler(h), _valueType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithKeyValueHandler_Return_5() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        Class typeBaseClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        TypeBindings prevNO_BINDINGS = ((TypeBindings) getStaticFieldValue(typeBaseClazz, "NO_BINDINGS"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            setStaticField(typeBaseClazz, "NO_BINDINGS", empty);
            MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            SimpleType _keyType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
            Class _class = Object.class;
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            Object _valueHandler = createInstance("java.lang.Object");
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            ReferenceType _valueType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            JavaType javaType = mapType._keyType;
            Class initialMapType_keyType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            MapType actual = mapType.withKeyValueHandler(((Object) null));
            
            MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            SimpleType _keyType1 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
            setField(_keyType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127754022);
            
            JavaType expected_keyType = expected._keyType;
            JavaType actual_keyType = actual._keyType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_keyType, actual_keyType);
            
            JavaType expected_valueType = expected._valueType;
            JavaType actual_valueType = actual._valueType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_valueType, actual_valueType);
            
            JavaType actual_superClass = actual._superClass;
            assertNull(actual_superClass);
            
            com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
            assertNull(actual_superInterfaces);
            
            TypeBindings expected_bindings = expected._bindings;
            TypeBindings actual_bindings = actual._bindings;
            // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
            assertEquals(expected_bindings, actual_bindings);
            
            String actual_canonicalName = actual._canonicalName;
            assertNull(actual_canonicalName);
            
            Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
            assertEquals(Class.class, actual_class.getClass());
            
            int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            assertEquals(expected_hash, actual_hash);
            
            Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
            assertNull(actual_valueHandler);
            
            Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
            assertNull(actual_typeHandler);
            
            boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
            assertFalse(actual_asStatic);
            
            JavaType javaType1 = mapType._keyType;
            Class finalMapType_keyType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialMapType_keyType_class == finalMapType_keyType_class);
            
            assertFalse(initialMapType_class == finalMapType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withKeyValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType.withValueHandler(h), _valueType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithKeyValueHandler_Return_1() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _keyType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType2 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_keyType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_keyType2, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_keyType2, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_keyType2, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(_keyType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType2);
        setField(_keyType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
        setField(_keyType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
        setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = mapType._keyType;
        JavaType javaType_keyType_keyType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
        JavaType javaType_keyType_keyType_keyType_keyType_keyType = ((JavaType) getFieldValue(javaType_keyType_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
        Class initialMapType_keyType_keyType_keyType_class = ((Class) getFieldValue(javaType_keyType_keyType_keyType_keyType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType1 = mapType._keyType;
        JavaType javaType1_keyType_keyType = ((JavaType) getFieldValue(javaType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
        Class initialMapType_keyType_keyType_class = ((Class) getFieldValue(javaType1_keyType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType2 = mapType._keyType;
        Class initialMapType_keyType_class = ((Class) getFieldValue(javaType2, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapType actual = mapType.withKeyValueHandler(((Object) null));
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType3 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_keyType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
        setField(_keyType3, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_keyType3, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_keyType3, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType3);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753983);
        
        JavaType expected_keyType = expected._keyType;
        JavaType actual_keyType = actual._keyType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_keyType, actual_keyType);
        
        JavaType expected_valueType = expected._valueType;
        JavaType actual_valueType = actual._valueType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_valueType, actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        JavaType javaType3 = mapType._keyType;
        JavaType javaType3_keyType_keyType = ((JavaType) getFieldValue(javaType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
        JavaType javaType3_keyType_keyType_keyType_keyType_keyType = ((JavaType) getFieldValue(javaType3_keyType_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
        Class finalMapType_keyType_keyType_keyType_class = ((Class) getFieldValue(javaType3_keyType_keyType_keyType_keyType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType4 = mapType._keyType;
        JavaType javaType4_keyType_keyType = ((JavaType) getFieldValue(javaType4, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
        Class finalMapType_keyType_keyType_class = ((Class) getFieldValue(javaType4_keyType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType5 = mapType._keyType;
        Class finalMapType_keyType_class = ((Class) getFieldValue(javaType5, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_keyType_keyType_keyType_class == finalMapType_keyType_keyType_keyType_class);
        
        assertFalse(initialMapType_keyType_keyType_class == finalMapType_keyType_keyType_class);
        
        assertFalse(initialMapType_keyType_class == finalMapType_keyType_class);
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withKeyValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType.withValueHandler(h), _valueType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithKeyValueHandler_Return_7() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ArrayType _keyType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        MapType _componentType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        byte[] _emptyArray = {};
        setField(_keyType, "com.fasterxml.jackson.databind.type.ArrayType", "_emptyArray", _emptyArray);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Object _valueHandler = createInstance("java.lang.Object");
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ArrayType _keyType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        setField(_keyType1, "com.fasterxml.jackson.databind.type.ArrayType", "_emptyArray", _emptyArray);
        setField(_keyType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = mapType._valueType;
        JavaType javaType_valueType_keyType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
        Class initialMapType_valueType_keyType_class = ((Class) getFieldValue(javaType_valueType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType1 = mapType._valueType;
        Class initialMapType_valueType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapType actual = mapType.withKeyValueHandler(((Object) null));
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ArrayType _keyType2 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_keyType2, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        setField(_keyType2, "com.fasterxml.jackson.databind.type.ArrayType", "_emptyArray", _emptyArray);
        setField(_keyType2, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class1 = byte[].class;
        setField(_keyType2, "com.fasterxml.jackson.databind.JavaType", "_class", _class1);
        setField(_keyType2, "com.fasterxml.jackson.databind.JavaType", "_hash", 2887);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType2);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063880011);
        
        JavaType expected_keyType = expected._keyType;
        JavaType actual_keyType = actual._keyType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_keyType, actual_keyType);
        
        JavaType expected_valueType = expected._valueType;
        JavaType actual_valueType = actual._valueType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_valueType, actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        JavaType javaType2 = mapType._valueType;
        JavaType javaType2_valueType_keyType = ((JavaType) getFieldValue(javaType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
        Class finalMapType_valueType_keyType_class = ((Class) getFieldValue(javaType2_valueType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType3 = mapType._valueType;
        Class finalMapType_valueType_class = ((Class) getFieldValue(javaType3, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_valueType_keyType_class == finalMapType_valueType_keyType_class);
        
        assertFalse(initialMapType_valueType_class == finalMapType_valueType_class);
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withKeyValueHandler(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.MapType#withValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType.withValueHandler(h), _valueType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithKeyValueHandler_Return() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        Class typeBaseClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        TypeBindings prevNO_BINDINGS = ((TypeBindings) getStaticFieldValue(typeBaseClazz, "NO_BINDINGS"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            setStaticField(typeBaseClazz, "NO_BINDINGS", empty);
            MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            MapType _keyType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            MapType _keyType2 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_keyType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
            setField(_keyType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
            setField(_keyType2, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            Class _class = Object.class;
            setField(_keyType2, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_keyType2, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
            setField(_keyType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType2);
            setField(_keyType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
            TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            setField(_keyType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
            setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
            setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
            setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            JavaType javaType = mapType._keyType;
            JavaType javaType_keyType_keyType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
            JavaType javaType_keyType_keyType_keyType_keyType_keyType = ((JavaType) getFieldValue(javaType_keyType_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
            Class initialMapType_keyType_keyType_keyType_class = ((Class) getFieldValue(javaType_keyType_keyType_keyType_keyType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType1 = mapType._keyType;
            JavaType javaType1_keyType_keyType = ((JavaType) getFieldValue(javaType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
            Class initialMapType_keyType_keyType_class = ((Class) getFieldValue(javaType1_keyType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType2 = mapType._keyType;
            Class initialMapType_keyType_class = ((Class) getFieldValue(javaType2, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            MapType actual = mapType.withKeyValueHandler(((Object) null));
            
            MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            MapType _keyType3 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_keyType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
            setField(_keyType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
            setField(_keyType3, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(_keyType3, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_keyType3, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType3);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753983);
            
            JavaType expected_keyType = expected._keyType;
            JavaType actual_keyType = actual._keyType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_keyType, actual_keyType);
            
            JavaType expected_valueType = expected._valueType;
            JavaType actual_valueType = actual._valueType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_valueType, actual_valueType);
            
            JavaType actual_superClass = actual._superClass;
            assertNull(actual_superClass);
            
            com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
            assertNull(actual_superInterfaces);
            
            TypeBindings expected_bindings = expected._bindings;
            TypeBindings actual_bindings = actual._bindings;
            // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
            assertEquals(expected_bindings, actual_bindings);
            
            String actual_canonicalName = actual._canonicalName;
            assertNull(actual_canonicalName);
            
            Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
            assertEquals(Class.class, actual_class.getClass());
            
            int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            assertEquals(expected_hash, actual_hash);
            
            Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
            assertNull(actual_valueHandler);
            
            Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
            assertNull(actual_typeHandler);
            
            boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
            assertFalse(actual_asStatic);
            
            JavaType javaType3 = mapType._keyType;
            JavaType javaType3_keyType_keyType = ((JavaType) getFieldValue(javaType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
            JavaType javaType3_keyType_keyType_keyType_keyType_keyType = ((JavaType) getFieldValue(javaType3_keyType_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
            Class finalMapType_keyType_keyType_keyType_class = ((Class) getFieldValue(javaType3_keyType_keyType_keyType_keyType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType4 = mapType._keyType;
            JavaType javaType4_keyType_keyType = ((JavaType) getFieldValue(javaType4, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
            Class finalMapType_keyType_keyType_class = ((Class) getFieldValue(javaType4_keyType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType5 = mapType._keyType;
            Class finalMapType_keyType_class = ((Class) getFieldValue(javaType5, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialMapType_keyType_keyType_keyType_class == finalMapType_keyType_keyType_keyType_class);
            
            assertFalse(initialMapType_keyType_keyType_class == finalMapType_keyType_keyType_class);
            
            assertFalse(initialMapType_keyType_class == finalMapType_keyType_class);
            
            assertFalse(initialMapType_class == finalMapType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withKeyValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType.withValueHandler(h), _valueType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithKeyValueHandler_Return_3() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        Class typeBaseClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        TypeBindings prevNO_BINDINGS = ((TypeBindings) getStaticFieldValue(typeBaseClazz, "NO_BINDINGS"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            setStaticField(typeBaseClazz, "NO_BINDINGS", empty);
            MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(_keyType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
            MapType _superClass = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
            Class _class = Object.class;
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            Object _valueHandler = createInstance("java.lang.Object");
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            ReferenceType _keyType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            setField(_keyType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
            setField(_keyType1, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
            setField(_keyType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
            setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
            setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            setField(_valueType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            JavaType javaType = mapType._keyType;
            Class initialMapType_keyType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType1 = mapType._valueType;
            JavaType javaType1_valueType_keyType = ((JavaType) getFieldValue(javaType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
            Class initialMapType_valueType_keyType_class = ((Class) getFieldValue(javaType1_valueType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType2 = mapType._valueType;
            Class initialMapType_valueType_class = ((Class) getFieldValue(javaType2, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            MapType actual = mapType.withKeyValueHandler(((Object) null));
            
            MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            ReferenceType _keyType2 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            setField(_keyType2, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
            setField(_keyType2, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
            setField(_keyType2, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(_keyType2, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_keyType2, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType2);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753983);
            
            JavaType expected_keyType = expected._keyType;
            JavaType actual_keyType = actual._keyType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_keyType, actual_keyType);
            
            JavaType expected_valueType = expected._valueType;
            JavaType actual_valueType = actual._valueType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_valueType, actual_valueType);
            
            JavaType actual_superClass = actual._superClass;
            assertNull(actual_superClass);
            
            com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
            assertNull(actual_superInterfaces);
            
            TypeBindings expected_bindings = expected._bindings;
            TypeBindings actual_bindings = actual._bindings;
            // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
            assertEquals(expected_bindings, actual_bindings);
            
            String actual_canonicalName = actual._canonicalName;
            assertNull(actual_canonicalName);
            
            Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
            assertEquals(Class.class, actual_class.getClass());
            
            int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            assertEquals(expected_hash, actual_hash);
            
            Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
            assertNull(actual_valueHandler);
            
            Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
            assertNull(actual_typeHandler);
            
            boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
            assertFalse(actual_asStatic);
            
            JavaType javaType3 = mapType._keyType;
            Class finalMapType_keyType_class = ((Class) getFieldValue(javaType3, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType4 = mapType._valueType;
            JavaType javaType4_valueType_keyType = ((JavaType) getFieldValue(javaType4, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
            Class finalMapType_valueType_keyType_class = ((Class) getFieldValue(javaType4_valueType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType5 = mapType._valueType;
            Class finalMapType_valueType_class = ((Class) getFieldValue(javaType5, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialMapType_keyType_class == finalMapType_keyType_class);
            
            assertFalse(initialMapType_valueType_keyType_class == finalMapType_valueType_keyType_class);
            
            assertFalse(initialMapType_valueType_class == finalMapType_valueType_class);
            
            assertFalse(initialMapType_class == finalMapType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withKeyValueHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withKeyValueHandler(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#withValueHandler(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _superClass
 *  */
    @Test
    public void testWithKeyValueHandler_ThrowNullPointerException() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapType.withKeyValueHandler] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapType.withKeyValueHandler(MapType.java:140) */
        mapType.withKeyValueHandler(((Object) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapType.withContentTypeHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withContentTypeHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withContentTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withTypeHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentTypeHandler_Return_5() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        SimpleType _valueType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapType actual = mapType.withContentTypeHandler(((Object) null));
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        JavaType expected_keyType = expected._keyType;
        JavaType actual_keyType = actual._keyType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_keyType, actual_keyType);
        
        JavaType expected_valueType = expected._valueType;
        JavaType actual_valueType = actual._valueType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_valueType, actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withContentTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withTypeHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentTypeHandler_Return_3() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        ReferenceType _valueType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapType actual = mapType.withContentTypeHandler(((Object) null));
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        JavaType expected_keyType = expected._keyType;
        JavaType actual_keyType = actual._keyType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_keyType, actual_keyType);
        
        JavaType expected_valueType = expected._valueType;
        JavaType actual_valueType = actual._valueType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_valueType, actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withContentTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withTypeHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentTypeHandler_Return_6() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        SimpleType _valueType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        byte[] _valueHandler = {};
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        Object _typeHandler = createInstance("java.lang.Object");
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces = {};
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        TypeBindings _bindings1 = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings1);
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        byte[] _valueHandler1 = {};
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler1);
        
        JavaType javaType = mapType._valueType;
        Class initialMapType_valueType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapType actual = mapType.withContentTypeHandler(((Object) null));
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        SimpleType _valueType1 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_valueType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(_valueType1, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127754022);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler1);
        
        JavaType expected_keyType = expected._keyType;
        JavaType actual_keyType = actual._keyType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_keyType, actual_keyType);
        
        JavaType expected_valueType = expected._valueType;
        JavaType actual_valueType = actual._valueType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_valueType, actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] expected_superInterfaces = expected._superInterfaces;
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        int expected_superInterfacesSize = expected_superInterfaces.length;
        assertEquals(expected_superInterfacesSize, actual_superInterfaces.length);
        assertTrue(deepEquals(expected_superInterfaces, actual_superInterfaces));
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object expected_valueHandler = getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        int expected_valueHandlerSize = getArrayLength(expected_valueHandler);
        assertEquals(expected_valueHandlerSize, getArrayLength(actual_valueHandler));
        assertArrayEquals(((byte[]) expected_valueHandler), ((byte[]) actual_valueHandler));
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        JavaType javaType1 = mapType._valueType;
        Class finalMapType_valueType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_valueType_class == finalMapType_valueType_class);
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withContentTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withTypeHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentTypeHandler_Return_1() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_valueType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = mapType._keyType;
        JavaType javaType_keyType_valueType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType"));
        Class initialMapType_keyType_valueType_class = ((Class) getFieldValue(javaType_keyType_valueType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType1 = mapType._keyType;
        Class initialMapType_keyType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType2 = mapType._valueType;
        Class initialMapType_valueType_class = ((Class) getFieldValue(javaType2, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapType actual = mapType.withContentTypeHandler(((Object) null));
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType2 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_valueType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_valueType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        setField(_valueType2, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753983);
        
        JavaType expected_keyType = expected._keyType;
        JavaType actual_keyType = actual._keyType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_keyType, actual_keyType);
        
        JavaType expected_valueType = expected._valueType;
        JavaType actual_valueType = actual._valueType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_valueType, actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        JavaType javaType3 = mapType._keyType;
        JavaType javaType3_keyType_valueType = ((JavaType) getFieldValue(javaType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType"));
        Class finalMapType_keyType_valueType_class = ((Class) getFieldValue(javaType3_keyType_valueType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType4 = mapType._keyType;
        Class finalMapType_keyType_class = ((Class) getFieldValue(javaType4, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType5 = mapType._valueType;
        Class finalMapType_valueType_class = ((Class) getFieldValue(javaType5, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_keyType_valueType_class == finalMapType_keyType_valueType_class);
        
        assertFalse(initialMapType_keyType_class == finalMapType_keyType_class);
        
        assertFalse(initialMapType_valueType_class == finalMapType_valueType_class);
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withContentTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withTypeHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentTypeHandler_Return_4() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        ReferenceType _valueType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        ReferenceType _valueType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_valueType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        Object _typeHandler = createInstance("java.lang.Object");
        setField(_valueType1, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = mapType._keyType;
        JavaType javaType_keyType_valueType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType"));
        Class initialMapType_keyType_valueType_class = ((Class) getFieldValue(javaType_keyType_valueType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType1 = mapType._keyType;
        Class initialMapType_keyType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType2 = mapType._valueType;
        Class initialMapType_valueType_class = ((Class) getFieldValue(javaType2, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapType actual = mapType.withContentTypeHandler(((Object) null));
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        ReferenceType _valueType2 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_valueType2, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(_valueType2, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753983);
        
        JavaType expected_keyType = expected._keyType;
        JavaType actual_keyType = actual._keyType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_keyType, actual_keyType);
        
        JavaType expected_valueType = expected._valueType;
        JavaType actual_valueType = actual._valueType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_valueType, actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        JavaType javaType3 = mapType._keyType;
        JavaType javaType3_keyType_valueType = ((JavaType) getFieldValue(javaType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType"));
        Class finalMapType_keyType_valueType_class = ((Class) getFieldValue(javaType3_keyType_valueType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType4 = mapType._keyType;
        Class finalMapType_keyType_class = ((Class) getFieldValue(javaType4, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType5 = mapType._valueType;
        Class finalMapType_valueType_class = ((Class) getFieldValue(javaType5, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_keyType_valueType_class == finalMapType_keyType_valueType_class);
        
        assertFalse(initialMapType_keyType_class == finalMapType_keyType_class);
        
        assertFalse(initialMapType_valueType_class == finalMapType_valueType_class);
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withContentTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withTypeHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentTypeHandler_Return() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        MapLikeType _valueType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", -1);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType2 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_valueType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_valueType2, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = mapType._keyType;
        JavaType javaType_keyType_valueType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType"));
        Class initialMapType_keyType_valueType_class = ((Class) getFieldValue(javaType_keyType_valueType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType1 = mapType._keyType;
        Class initialMapType_keyType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType2 = mapType._valueType;
        Class initialMapType_valueType_class = ((Class) getFieldValue(javaType2, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapType actual = mapType.withContentTypeHandler(((Object) null));
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType3 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_valueType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_valueType3, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_valueType3, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType3, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType3);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", -1);
        
        JavaType expected_keyType = expected._keyType;
        JavaType actual_keyType = actual._keyType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_keyType, actual_keyType);
        
        JavaType expected_valueType = expected._valueType;
        JavaType actual_valueType = actual._valueType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_valueType, actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        JavaType javaType3 = mapType._keyType;
        JavaType javaType3_keyType_valueType = ((JavaType) getFieldValue(javaType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType"));
        Class finalMapType_keyType_valueType_class = ((Class) getFieldValue(javaType3_keyType_valueType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType4 = mapType._keyType;
        Class finalMapType_keyType_class = ((Class) getFieldValue(javaType4, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType5 = mapType._valueType;
        Class finalMapType_valueType_class = ((Class) getFieldValue(javaType5, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_keyType_valueType_class == finalMapType_keyType_valueType_class);
        
        assertFalse(initialMapType_keyType_class == finalMapType_keyType_class);
        
        assertFalse(initialMapType_valueType_class == finalMapType_valueType_class);
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withContentTypeHandler(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#hashCode()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#hashCode()}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withTypeHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentTypeHandler_Return_2() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        Class typeBaseClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        TypeBindings prevNO_BINDINGS = ((TypeBindings) getStaticFieldValue(typeBaseClazz, "NO_BINDINGS"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            setStaticField(typeBaseClazz, "NO_BINDINGS", empty);
            MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            MapType _keyType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
            ReferenceType _valueType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
            setField(_valueType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            Class _class = Object.class;
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
            setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            MapType _valueType2 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_valueType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
            setField(_valueType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
            setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
            setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            JavaType javaType = mapType._keyType;
            JavaType javaType_keyType_valueType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType"));
            Class initialMapType_keyType_valueType_class = ((Class) getFieldValue(javaType_keyType_valueType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType1 = mapType._keyType;
            Class initialMapType_keyType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType2 = mapType._valueType;
            Class initialMapType_valueType_class = ((Class) getFieldValue(javaType2, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            MapType actual = mapType.withContentTypeHandler(((Object) null));
            
            MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            MapType _valueType3 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_valueType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
            setField(_valueType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
            setField(_valueType3, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(_valueType3, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_valueType3, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType3);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753983);
            
            JavaType expected_keyType = expected._keyType;
            JavaType actual_keyType = actual._keyType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_keyType, actual_keyType);
            
            JavaType expected_valueType = expected._valueType;
            JavaType actual_valueType = actual._valueType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_valueType, actual_valueType);
            
            JavaType actual_superClass = actual._superClass;
            assertNull(actual_superClass);
            
            com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
            assertNull(actual_superInterfaces);
            
            TypeBindings expected_bindings = expected._bindings;
            TypeBindings actual_bindings = actual._bindings;
            // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
            assertEquals(expected_bindings, actual_bindings);
            
            String actual_canonicalName = actual._canonicalName;
            assertNull(actual_canonicalName);
            
            Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
            assertEquals(Class.class, actual_class.getClass());
            
            int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            assertEquals(expected_hash, actual_hash);
            
            Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
            assertNull(actual_valueHandler);
            
            Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
            assertNull(actual_typeHandler);
            
            boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
            assertFalse(actual_asStatic);
            
            JavaType javaType3 = mapType._keyType;
            JavaType javaType3_keyType_valueType = ((JavaType) getFieldValue(javaType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType"));
            Class finalMapType_keyType_valueType_class = ((Class) getFieldValue(javaType3_keyType_valueType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType4 = mapType._keyType;
            Class finalMapType_keyType_class = ((Class) getFieldValue(javaType4, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType5 = mapType._valueType;
            Class finalMapType_valueType_class = ((Class) getFieldValue(javaType5, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialMapType_keyType_valueType_class == finalMapType_keyType_valueType_class);
            
            assertFalse(initialMapType_keyType_class == finalMapType_keyType_class);
            
            assertFalse(initialMapType_valueType_class == finalMapType_valueType_class);
            
            assertFalse(initialMapType_class == finalMapType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withContentTypeHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withContentTypeHandler(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#withTypeHandler(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _superClass
 *  */
    @Test
    public void testWithContentTypeHandler_ThrowNullPointerException() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapType.withContentTypeHandler] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapType.withContentTypeHandler(MapType.java:70) */
        mapType.withContentTypeHandler(((Object) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapType.withContentValueHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withContentValueHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withContentValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withValueHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentValueHandler_Return_5() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        SimpleType _valueType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapType actual = mapType.withContentValueHandler(((Object) null));
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        JavaType expected_keyType = expected._keyType;
        JavaType actual_keyType = actual._keyType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_keyType, actual_keyType);
        
        JavaType expected_valueType = expected._valueType;
        JavaType actual_valueType = actual._valueType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_valueType, actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withContentValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withValueHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentValueHandler_Return_3() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        ReferenceType _valueType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapType actual = mapType.withContentValueHandler(((Object) null));
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        JavaType expected_keyType = expected._keyType;
        JavaType actual_keyType = actual._keyType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_keyType, actual_keyType);
        
        JavaType expected_valueType = expected._valueType;
        JavaType actual_valueType = actual._valueType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_valueType, actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withContentValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withValueHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentValueHandler_Return_7() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        ArrayType _valueType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapType actual = mapType.withContentValueHandler(((Object) null));
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        JavaType expected_keyType = expected._keyType;
        JavaType actual_keyType = actual._keyType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_keyType, actual_keyType);
        
        JavaType expected_valueType = expected._valueType;
        JavaType actual_valueType = actual._valueType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_valueType, actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withContentValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withValueHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentValueHandler_Return_6() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        SimpleType _valueType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        Object _valueHandler = createInstance("java.lang.Object");
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings1 = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings1);
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = mapType._valueType;
        Class initialMapType_valueType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapType actual = mapType.withContentValueHandler(((Object) null));
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        SimpleType _valueType1 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_valueType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127754022);
        
        JavaType expected_keyType = expected._keyType;
        JavaType actual_keyType = actual._keyType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_keyType, actual_keyType);
        
        JavaType expected_valueType = expected._valueType;
        JavaType actual_valueType = actual._valueType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_valueType, actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        JavaType javaType1 = mapType._valueType;
        Class finalMapType_valueType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_valueType_class == finalMapType_valueType_class);
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withContentValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withValueHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentValueHandler_Return_1() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_valueType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = mapType._keyType;
        JavaType javaType_keyType_valueType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType"));
        Class initialMapType_keyType_valueType_class = ((Class) getFieldValue(javaType_keyType_valueType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType1 = mapType._keyType;
        Class initialMapType_keyType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType2 = mapType._valueType;
        Class initialMapType_valueType_class = ((Class) getFieldValue(javaType2, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapType actual = mapType.withContentValueHandler(((Object) null));
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType2 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_valueType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_valueType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        setField(_valueType2, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753983);
        
        JavaType expected_keyType = expected._keyType;
        JavaType actual_keyType = actual._keyType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_keyType, actual_keyType);
        
        JavaType expected_valueType = expected._valueType;
        JavaType actual_valueType = actual._valueType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_valueType, actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        JavaType javaType3 = mapType._keyType;
        JavaType javaType3_keyType_valueType = ((JavaType) getFieldValue(javaType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType"));
        Class finalMapType_keyType_valueType_class = ((Class) getFieldValue(javaType3_keyType_valueType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType4 = mapType._keyType;
        Class finalMapType_keyType_class = ((Class) getFieldValue(javaType4, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType5 = mapType._valueType;
        Class finalMapType_valueType_class = ((Class) getFieldValue(javaType5, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_keyType_valueType_class == finalMapType_keyType_valueType_class);
        
        assertFalse(initialMapType_keyType_class == finalMapType_keyType_class);
        
        assertFalse(initialMapType_valueType_class == finalMapType_valueType_class);
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withContentValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withValueHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentValueHandler_Return_4() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        ReferenceType _valueType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        ReferenceType _valueType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_valueType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        Object _valueHandler = createInstance("java.lang.Object");
        setField(_valueType1, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = mapType._keyType;
        JavaType javaType_keyType_valueType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType"));
        Class initialMapType_keyType_valueType_class = ((Class) getFieldValue(javaType_keyType_valueType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType1 = mapType._keyType;
        Class initialMapType_keyType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType2 = mapType._valueType;
        Class initialMapType_valueType_class = ((Class) getFieldValue(javaType2, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapType actual = mapType.withContentValueHandler(((Object) null));
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        ReferenceType _valueType2 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_valueType2, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(_valueType2, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753983);
        
        JavaType expected_keyType = expected._keyType;
        JavaType actual_keyType = actual._keyType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_keyType, actual_keyType);
        
        JavaType expected_valueType = expected._valueType;
        JavaType actual_valueType = actual._valueType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_valueType, actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        JavaType javaType3 = mapType._keyType;
        JavaType javaType3_keyType_valueType = ((JavaType) getFieldValue(javaType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType"));
        Class finalMapType_keyType_valueType_class = ((Class) getFieldValue(javaType3_keyType_valueType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType4 = mapType._keyType;
        Class finalMapType_keyType_class = ((Class) getFieldValue(javaType4, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType5 = mapType._valueType;
        Class finalMapType_valueType_class = ((Class) getFieldValue(javaType5, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_keyType_valueType_class == finalMapType_keyType_valueType_class);
        
        assertFalse(initialMapType_keyType_class == finalMapType_keyType_class);
        
        assertFalse(initialMapType_valueType_class == finalMapType_valueType_class);
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withContentValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withValueHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentValueHandler_Return() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        MapLikeType _valueType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", -1);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType2 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_valueType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_valueType2, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = mapType._keyType;
        JavaType javaType_keyType_valueType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType"));
        Class initialMapType_keyType_valueType_class = ((Class) getFieldValue(javaType_keyType_valueType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType1 = mapType._keyType;
        Class initialMapType_keyType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType2 = mapType._valueType;
        Class initialMapType_valueType_class = ((Class) getFieldValue(javaType2, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapType actual = mapType.withContentValueHandler(((Object) null));
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType3 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_valueType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_valueType3, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_valueType3, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType3, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType3);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", -1);
        
        JavaType expected_keyType = expected._keyType;
        JavaType actual_keyType = actual._keyType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_keyType, actual_keyType);
        
        JavaType expected_valueType = expected._valueType;
        JavaType actual_valueType = actual._valueType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_valueType, actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        JavaType javaType3 = mapType._keyType;
        JavaType javaType3_keyType_valueType = ((JavaType) getFieldValue(javaType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType"));
        Class finalMapType_keyType_valueType_class = ((Class) getFieldValue(javaType3_keyType_valueType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType4 = mapType._keyType;
        Class finalMapType_keyType_class = ((Class) getFieldValue(javaType4, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType5 = mapType._valueType;
        Class finalMapType_valueType_class = ((Class) getFieldValue(javaType5, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_keyType_valueType_class == finalMapType_keyType_valueType_class);
        
        assertFalse(initialMapType_keyType_class == finalMapType_keyType_class);
        
        assertFalse(initialMapType_valueType_class == finalMapType_valueType_class);
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withContentValueHandler(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#hashCode()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#hashCode()}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withValueHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentValueHandler_Return_2() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        Class typeBaseClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        TypeBindings prevNO_BINDINGS = ((TypeBindings) getStaticFieldValue(typeBaseClazz, "NO_BINDINGS"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            setStaticField(typeBaseClazz, "NO_BINDINGS", empty);
            MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            MapType _keyType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
            ReferenceType _valueType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
            setField(_valueType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            Class _class = Object.class;
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
            setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            MapType _valueType2 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_valueType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
            setField(_valueType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
            setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
            setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            JavaType javaType = mapType._keyType;
            JavaType javaType_keyType_valueType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType"));
            Class initialMapType_keyType_valueType_class = ((Class) getFieldValue(javaType_keyType_valueType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType1 = mapType._keyType;
            Class initialMapType_keyType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType2 = mapType._valueType;
            Class initialMapType_valueType_class = ((Class) getFieldValue(javaType2, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            MapType actual = mapType.withContentValueHandler(((Object) null));
            
            MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            MapType _valueType3 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_valueType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
            setField(_valueType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
            setField(_valueType3, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(_valueType3, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_valueType3, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType3);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753983);
            
            JavaType expected_keyType = expected._keyType;
            JavaType actual_keyType = actual._keyType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_keyType, actual_keyType);
            
            JavaType expected_valueType = expected._valueType;
            JavaType actual_valueType = actual._valueType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_valueType, actual_valueType);
            
            JavaType actual_superClass = actual._superClass;
            assertNull(actual_superClass);
            
            com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
            assertNull(actual_superInterfaces);
            
            TypeBindings expected_bindings = expected._bindings;
            TypeBindings actual_bindings = actual._bindings;
            // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
            assertEquals(expected_bindings, actual_bindings);
            
            String actual_canonicalName = actual._canonicalName;
            assertNull(actual_canonicalName);
            
            Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
            assertEquals(Class.class, actual_class.getClass());
            
            int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            assertEquals(expected_hash, actual_hash);
            
            Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
            assertNull(actual_valueHandler);
            
            Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
            assertNull(actual_typeHandler);
            
            boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
            assertFalse(actual_asStatic);
            
            JavaType javaType3 = mapType._keyType;
            JavaType javaType3_keyType_valueType = ((JavaType) getFieldValue(javaType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType"));
            Class finalMapType_keyType_valueType_class = ((Class) getFieldValue(javaType3_keyType_valueType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType4 = mapType._keyType;
            Class finalMapType_keyType_class = ((Class) getFieldValue(javaType4, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType5 = mapType._valueType;
            Class finalMapType_valueType_class = ((Class) getFieldValue(javaType5, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialMapType_keyType_valueType_class == finalMapType_keyType_valueType_class);
            
            assertFalse(initialMapType_keyType_class == finalMapType_keyType_class);
            
            assertFalse(initialMapType_valueType_class == finalMapType_valueType_class);
            
            assertFalse(initialMapType_class == finalMapType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withContentValueHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withContentValueHandler(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#withValueHandler(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _superClass
 *  */
    @Test
    public void testWithContentValueHandler_ThrowNullPointerException() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapType.withContentValueHandler] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapType.withContentValueHandler(MapType.java:83) */
        mapType.withContentValueHandler(((Object) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapType._narrow
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _narrow(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#_narrow(java.lang.Class)}
 * @utbot.returnsFrom {@code return new MapType(subclass, _bindings, _superClass, _superInterfaces, _keyType, _valueType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void test_narrow_Return() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        ReferenceType _valueType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class class1 = Object.class;
        
        MapType actual = ((MapType) mapType._narrow(class1));
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        JavaType expected_keyType = expected._keyType;
        JavaType actual_keyType = actual._keyType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_keyType, actual_keyType);
        
        JavaType expected_valueType = expected._valueType;
        JavaType actual_valueType = actual._valueType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_valueType, actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#_narrow(java.lang.Class)}
 * @utbot.returnsFrom {@code return new MapType(subclass, _bindings, _superClass, _superInterfaces, _keyType, _valueType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void test_narrow_Return_1() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        Class typeBaseClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        TypeBindings prevNO_BINDINGS = ((TypeBindings) getStaticFieldValue(typeBaseClazz, "NO_BINDINGS"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            setStaticField(typeBaseClazz, "NO_BINDINGS", empty);
            MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            ReferenceType _valueType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            Class class1 = Object.class;
            
            MapType actual = ((MapType) mapType._narrow(class1));
            
            MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            
            JavaType expected_keyType = expected._keyType;
            JavaType actual_keyType = actual._keyType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_keyType, actual_keyType);
            
            JavaType expected_valueType = expected._valueType;
            JavaType actual_valueType = actual._valueType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_valueType, actual_valueType);
            
            JavaType actual_superClass = actual._superClass;
            assertNull(actual_superClass);
            
            com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
            assertNull(actual_superInterfaces);
            
            TypeBindings expected_bindings = expected._bindings;
            TypeBindings actual_bindings = actual._bindings;
            // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
            assertEquals(expected_bindings, actual_bindings);
            
            String actual_canonicalName = actual._canonicalName;
            assertNull(actual_canonicalName);
            
            Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
            assertEquals(Class.class, actual_class.getClass());
            
            int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            assertEquals(expected_hash, actual_hash);
            
            Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
            assertNull(actual_valueHandler);
            
            Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
            assertNull(actual_typeHandler);
            
            boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
            assertFalse(actual_asStatic);
            
            Class finalClass1 = class1;
            
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapType.withKeyType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withKeyType(com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withKeyType(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (keyType == _keyType): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithKeyType_KeyTypeEquals_keyType() {
        MapType mapType = new MapType(null, null, null);
        
        MapType actual = mapType.withKeyType(((JavaType) null));
        
        JavaType actual_keyType = actual._keyType;
        assertNull(actual_keyType);
        
    }
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withKeyType(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (keyType == _keyType): False}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, keyType, _valueType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithKeyType_KeyTypeNotEquals_keyType() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        ReferenceType _valueType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
        
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapType actual = mapType.withKeyType(((JavaType) referenceType));
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", referenceType);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        JavaType expected_keyType = expected._keyType;
        JavaType actual_keyType = actual._keyType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_keyType, actual_keyType);
        
        JavaType expected_valueType = expected._valueType;
        JavaType actual_valueType = actual._valueType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_valueType, actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withKeyType(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (keyType == _keyType): False}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, keyType, _valueType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithKeyType_KeyTypeNotEquals_keyType_1() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        Class typeBaseClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        TypeBindings prevNO_BINDINGS = ((TypeBindings) getStaticFieldValue(typeBaseClazz, "NO_BINDINGS"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            setStaticField(typeBaseClazz, "NO_BINDINGS", empty);
            MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            SimpleType _keyType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            Class _class = Object.class;
            setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_hash", -194);
            
            Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            MapType actual = mapType.withKeyType(((JavaType) referenceType));
            
            MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", referenceType);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877074);
            
            JavaType expected_keyType = expected._keyType;
            JavaType actual_keyType = actual._keyType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_keyType, actual_keyType);
            
            JavaType expected_valueType = expected._valueType;
            JavaType actual_valueType = actual._valueType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_valueType, actual_valueType);
            
            JavaType actual_superClass = actual._superClass;
            assertNull(actual_superClass);
            
            com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
            assertNull(actual_superInterfaces);
            
            TypeBindings expected_bindings = expected._bindings;
            TypeBindings actual_bindings = actual._bindings;
            // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
            assertEquals(expected_bindings, actual_bindings);
            
            String actual_canonicalName = actual._canonicalName;
            assertNull(actual_canonicalName);
            
            Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
            assertEquals(Class.class, actual_class.getClass());
            
            int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            assertEquals(expected_hash, actual_hash);
            
            Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
            assertNull(actual_valueHandler);
            
            Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
            assertNull(actual_typeHandler);
            
            boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
            assertFalse(actual_asStatic);
            
            Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialMapType_class == finalMapType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapType.refine
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method refine(java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings, com.fasterxml.jackson.databind.JavaType, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#refine(java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.returnsFrom {@code return new MapType(rawType, bindings, superClass, superInterfaces, _keyType, _valueType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testRefine_Return() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        Class class1 = Object.class;
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        
        MapType actual = ((MapType) mapType.refine(class1, typeBindings, null, null));
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", typeBindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        JavaType expected_keyType = expected._keyType;
        JavaType actual_keyType = actual._keyType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_keyType, actual_keyType);
        
        JavaType expected_valueType = expected._valueType;
        JavaType actual_valueType = actual._valueType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_valueType, actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#refine(java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.returnsFrom {@code return new MapType(rawType, bindings, superClass, superInterfaces, _keyType, _valueType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testRefine_Return_1() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        Class typeBaseClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        TypeBindings prevNO_BINDINGS = ((TypeBindings) getStaticFieldValue(typeBaseClazz, "NO_BINDINGS"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            setStaticField(typeBaseClazz, "NO_BINDINGS", empty);
            MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            Class class1 = Object.class;
            
            MapType actual = ((MapType) mapType.refine(class1, null, null, null));
            
            MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            
            JavaType expected_keyType = expected._keyType;
            JavaType actual_keyType = actual._keyType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_keyType, actual_keyType);
            
            JavaType expected_valueType = expected._valueType;
            JavaType actual_valueType = actual._valueType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_valueType, actual_valueType);
            
            JavaType actual_superClass = actual._superClass;
            assertNull(actual_superClass);
            
            com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
            assertNull(actual_superInterfaces);
            
            TypeBindings expected_bindings = expected._bindings;
            TypeBindings actual_bindings = actual._bindings;
            // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
            assertEquals(expected_bindings, actual_bindings);
            
            String actual_canonicalName = actual._canonicalName;
            assertNull(actual_canonicalName);
            
            Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
            assertEquals(Class.class, actual_class.getClass());
            
            int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            assertEquals(expected_hash, actual_hash);
            
            Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
            assertNull(actual_valueHandler);
            
            Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
            assertNull(actual_typeHandler);
            
            boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
            assertFalse(actual_asStatic);
            
            Class finalClass1 = class1;
            
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapType.withTypeHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withTypeHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType, _valueHandler, h, _asStatic);}
 *  */
    @Test
    public void testWithTypeHandler_Return() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapType actual = mapType.withTypeHandler(((Object) null));
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        JavaType expected_keyType = expected._keyType;
        JavaType actual_keyType = actual._keyType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_keyType, actual_keyType);
        
        JavaType expected_valueType = expected._valueType;
        JavaType actual_valueType = actual._valueType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_valueType, actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType, _valueHandler, h, _asStatic);}
 *  */
    @Test
    public void testWithTypeHandler_Return_1() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        Class typeBaseClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        TypeBindings prevNO_BINDINGS = ((TypeBindings) getStaticFieldValue(typeBaseClazz, "NO_BINDINGS"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            setStaticField(typeBaseClazz, "NO_BINDINGS", empty);
            MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            Class _class = Object.class;
            setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            MapType actual = mapType.withTypeHandler(((Object) null));
            
            MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            
            JavaType expected_keyType = expected._keyType;
            JavaType actual_keyType = actual._keyType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_keyType, actual_keyType);
            
            JavaType expected_valueType = expected._valueType;
            JavaType actual_valueType = actual._valueType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_valueType, actual_valueType);
            
            JavaType actual_superClass = actual._superClass;
            assertNull(actual_superClass);
            
            com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
            assertNull(actual_superInterfaces);
            
            TypeBindings expected_bindings = expected._bindings;
            TypeBindings actual_bindings = actual._bindings;
            // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
            assertEquals(expected_bindings, actual_bindings);
            
            String actual_canonicalName = actual._canonicalName;
            assertNull(actual_canonicalName);
            
            Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
            assertEquals(Class.class, actual_class.getClass());
            
            int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            assertEquals(expected_hash, actual_hash);
            
            Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
            assertNull(actual_valueHandler);
            
            Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
            assertNull(actual_typeHandler);
            
            boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
            assertFalse(actual_asStatic);
            
            Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialMapType_class == finalMapType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapType.withValueHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withValueHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType, h, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithValueHandler_Return() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapType actual = mapType.withValueHandler(((Object) null));
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        JavaType expected_keyType = expected._keyType;
        JavaType actual_keyType = actual._keyType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_keyType, actual_keyType);
        
        JavaType expected_valueType = expected._valueType;
        JavaType actual_valueType = actual._valueType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_valueType, actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType, h, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithValueHandler_Return_1() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        Class typeBaseClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        TypeBindings prevNO_BINDINGS = ((TypeBindings) getStaticFieldValue(typeBaseClazz, "NO_BINDINGS"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            setStaticField(typeBaseClazz, "NO_BINDINGS", empty);
            MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            Class _class = Object.class;
            setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            MapType actual = mapType.withValueHandler(((Object) null));
            
            MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            
            JavaType expected_keyType = expected._keyType;
            JavaType actual_keyType = actual._keyType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_keyType, actual_keyType);
            
            JavaType expected_valueType = expected._valueType;
            JavaType actual_valueType = actual._valueType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_valueType, actual_valueType);
            
            JavaType actual_superClass = actual._superClass;
            assertNull(actual_superClass);
            
            com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
            assertNull(actual_superInterfaces);
            
            TypeBindings expected_bindings = expected._bindings;
            TypeBindings actual_bindings = actual._bindings;
            // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
            assertEquals(expected_bindings, actual_bindings);
            
            String actual_canonicalName = actual._canonicalName;
            assertNull(actual_canonicalName);
            
            Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
            assertEquals(Class.class, actual_class.getClass());
            
            int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            assertEquals(expected_hash, actual_hash);
            
            Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
            assertNull(actual_valueHandler);
            
            Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
            assertNull(actual_typeHandler);
            
            boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
            assertFalse(actual_asStatic);
            
            Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialMapType_class == finalMapType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapType.withContentType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withContentType(com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withContentType(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (_valueType == contentType): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithContentType__valueTypeEqualsContentType() {
        MapType mapType = new MapType(null, null, null);
        
        MapType actual = ((MapType) mapType.withContentType(null));
        
        JavaType actual_valueType = actual._valueType;
        assertNull(actual_valueType);
        
    }
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withContentType(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (_valueType == contentType): False}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType, contentType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentType__valueTypeNotEqualsContentType() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        ReferenceType _valueType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
        
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapType actual = ((MapType) mapType.withContentType(referenceType));
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", referenceType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        JavaType expected_keyType = expected._keyType;
        JavaType actual_keyType = actual._keyType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_keyType, actual_keyType);
        
        JavaType expected_valueType = expected._valueType;
        JavaType actual_valueType = actual._valueType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_valueType, actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withContentType(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (_valueType == contentType): False}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType, contentType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentType__valueTypeNotEqualsContentType_1() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        Class typeBaseClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        TypeBindings prevNO_BINDINGS = ((TypeBindings) getStaticFieldValue(typeBaseClazz, "NO_BINDINGS"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            setStaticField(typeBaseClazz, "NO_BINDINGS", empty);
            MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            SimpleType _valueType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            Class _class = Object.class;
            setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_hash", -130);
            
            Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            MapType actual = ((MapType) mapType.withContentType(referenceType));
            
            MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", referenceType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877138);
            
            JavaType expected_keyType = expected._keyType;
            JavaType actual_keyType = actual._keyType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_keyType, actual_keyType);
            
            JavaType expected_valueType = expected._valueType;
            JavaType actual_valueType = actual._valueType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_valueType, actual_valueType);
            
            JavaType actual_superClass = actual._superClass;
            assertNull(actual_superClass);
            
            com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
            assertNull(actual_superInterfaces);
            
            TypeBindings expected_bindings = expected._bindings;
            TypeBindings actual_bindings = actual._bindings;
            // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
            assertEquals(expected_bindings, actual_bindings);
            
            String actual_canonicalName = actual._canonicalName;
            assertNull(actual_canonicalName);
            
            Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
            assertEquals(Class.class, actual_class.getClass());
            
            int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            assertEquals(expected_hash, actual_hash);
            
            Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
            assertNull(actual_valueHandler);
            
            Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
            assertNull(actual_typeHandler);
            
            boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
            assertFalse(actual_asStatic);
            
            Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialMapType_class == finalMapType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapType.withKeyTypeHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withKeyTypeHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withKeyTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType.withTypeHandler(h), _valueType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithKeyTypeHandler_Return_2() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        SimpleType _keyType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = mapType._valueType;
        Class initialMapType_valueType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapType actual = mapType.withKeyTypeHandler(((Object) null));
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        JavaType expected_keyType = expected._keyType;
        JavaType actual_keyType = actual._keyType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_keyType, actual_keyType);
        
        JavaType expected_valueType = expected._valueType;
        JavaType actual_valueType = actual._valueType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_valueType, actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        JavaType javaType1 = mapType._valueType;
        Class finalMapType_valueType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_valueType_class == finalMapType_valueType_class);
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withKeyTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType.withTypeHandler(h), _valueType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithKeyTypeHandler_Return() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = mapType._valueType;
        Class initialMapType_valueType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapType actual = mapType.withKeyTypeHandler(((Object) null));
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        JavaType expected_keyType = expected._keyType;
        JavaType actual_keyType = actual._keyType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_keyType, actual_keyType);
        
        JavaType expected_valueType = expected._valueType;
        JavaType actual_valueType = actual._valueType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_valueType, actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        JavaType javaType1 = mapType._valueType;
        Class finalMapType_valueType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_valueType_class == finalMapType_valueType_class);
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withKeyTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType.withTypeHandler(h), _valueType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithKeyTypeHandler_Return_3() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ArrayType _keyType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = mapType._valueType;
        Class initialMapType_valueType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapType actual = mapType.withKeyTypeHandler(((Object) null));
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        JavaType expected_keyType = expected._keyType;
        JavaType actual_keyType = actual._keyType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_keyType, actual_keyType);
        
        JavaType expected_valueType = expected._valueType;
        JavaType actual_valueType = actual._valueType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_valueType, actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        JavaType javaType1 = mapType._valueType;
        Class finalMapType_valueType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_valueType_class == finalMapType_valueType_class);
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withKeyTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType.withTypeHandler(h), _valueType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithKeyTypeHandler_Return_1() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        Class typeBaseClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        TypeBindings prevNO_BINDINGS = ((TypeBindings) getStaticFieldValue(typeBaseClazz, "NO_BINDINGS"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            setStaticField(typeBaseClazz, "NO_BINDINGS", empty);
            MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            MapType _referencedType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_keyType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
            MapType _superClass = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
            Class _class = Object.class;
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            Object _typeHandler = createInstance("java.lang.Object");
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            ReferenceType _keyType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            setField(_keyType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
            setField(_keyType1, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
            setField(_keyType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
            setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
            setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            setField(_valueType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            JavaType javaType = mapType._keyType;
            Class initialMapType_keyType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType1 = mapType._valueType;
            JavaType javaType1_valueType_keyType = ((JavaType) getFieldValue(javaType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
            Class initialMapType_valueType_keyType_class = ((Class) getFieldValue(javaType1_valueType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType2 = mapType._valueType;
            Class initialMapType_valueType_class = ((Class) getFieldValue(javaType2, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            MapType actual = mapType.withKeyTypeHandler(((Object) null));
            
            MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            ReferenceType _keyType2 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            setField(_keyType2, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
            setField(_keyType2, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
            setField(_keyType2, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(_keyType2, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_keyType2, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType2);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753983);
            
            JavaType expected_keyType = expected._keyType;
            JavaType actual_keyType = actual._keyType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_keyType, actual_keyType);
            
            JavaType expected_valueType = expected._valueType;
            JavaType actual_valueType = actual._valueType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_valueType, actual_valueType);
            
            JavaType actual_superClass = actual._superClass;
            assertNull(actual_superClass);
            
            com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
            assertNull(actual_superInterfaces);
            
            TypeBindings expected_bindings = expected._bindings;
            TypeBindings actual_bindings = actual._bindings;
            // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
            assertEquals(expected_bindings, actual_bindings);
            
            String actual_canonicalName = actual._canonicalName;
            assertNull(actual_canonicalName);
            
            Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
            assertEquals(Class.class, actual_class.getClass());
            
            int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            assertEquals(expected_hash, actual_hash);
            
            Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
            assertNull(actual_valueHandler);
            
            Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
            assertNull(actual_typeHandler);
            
            boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
            assertFalse(actual_asStatic);
            
            JavaType javaType3 = mapType._keyType;
            Class finalMapType_keyType_class = ((Class) getFieldValue(javaType3, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType4 = mapType._valueType;
            JavaType javaType4_valueType_keyType = ((JavaType) getFieldValue(javaType4, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
            Class finalMapType_valueType_keyType_class = ((Class) getFieldValue(javaType4_valueType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType5 = mapType._valueType;
            Class finalMapType_valueType_class = ((Class) getFieldValue(javaType5, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialMapType_keyType_class == finalMapType_keyType_class);
            
            assertFalse(initialMapType_valueType_keyType_class == finalMapType_valueType_keyType_class);
            
            assertFalse(initialMapType_valueType_class == finalMapType_valueType_class);
            
            assertFalse(initialMapType_class == finalMapType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withKeyTypeHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withKeyTypeHandler(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#withTypeHandler(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _superClass
 *  */
    @Test
    public void testWithKeyTypeHandler_ThrowNullPointerException() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapType.withKeyTypeHandler] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapType.withKeyTypeHandler(MapType.java:133) */
        mapType.withKeyTypeHandler(((Object) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withKeyTypeHandler(java.lang.Object)
    
    @Test
    public void testWithKeyTypeHandler1() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ArrayType _keyType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        char[] _typeHandler = {};
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        CollectionType _valueType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces = {null, null, null, null, null, null, null, null, null};
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapType actual = mapType.withKeyTypeHandler(((Object) _typeHandler));
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        JavaType expected_keyType = expected._keyType;
        JavaType actual_keyType = actual._keyType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_keyType, actual_keyType);
        
        JavaType expected_valueType = expected._valueType;
        JavaType actual_valueType = actual._valueType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_valueType, actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] expected_superInterfaces = expected._superInterfaces;
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        int expected_superInterfacesSize = expected_superInterfaces.length;
        assertEquals(expected_superInterfacesSize, actual_superInterfaces.length);
        assertTrue(deepEquals(expected_superInterfaces, actual_superInterfaces));
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        JavaType finalMapType_superInterfaces0 = mapType._superInterfaces[0];
        JavaType finalMapType_superInterfaces1 = mapType._superInterfaces[1];
        JavaType finalMapType_superInterfaces2 = mapType._superInterfaces[2];
        JavaType finalMapType_superInterfaces3 = mapType._superInterfaces[3];
        JavaType finalMapType_superInterfaces4 = mapType._superInterfaces[4];
        JavaType finalMapType_superInterfaces5 = mapType._superInterfaces[5];
        JavaType finalMapType_superInterfaces6 = mapType._superInterfaces[6];
        JavaType finalMapType_superInterfaces7 = mapType._superInterfaces[7];
        JavaType finalMapType_superInterfaces8 = mapType._superInterfaces[8];
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_class == finalMapType_class);
        
        assertNull(finalMapType_superInterfaces0);
        
        assertNull(finalMapType_superInterfaces1);
        
        assertNull(finalMapType_superInterfaces2);
        
        assertNull(finalMapType_superInterfaces3);
        
        assertNull(finalMapType_superInterfaces4);
        
        assertNull(finalMapType_superInterfaces5);
        
        assertNull(finalMapType_superInterfaces6);
        
        assertNull(finalMapType_superInterfaces7);
        
        assertNull(finalMapType_superInterfaces8);
    }
    
    @Test
    public void testWithKeyTypeHandler2() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        Class typeBaseClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        TypeBindings prevNO_BINDINGS = ((TypeBindings) getStaticFieldValue(typeBaseClazz, "NO_BINDINGS"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            setStaticField(typeBaseClazz, "NO_BINDINGS", empty);
            MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            SimpleType _keyType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
            Class _class = Object.class;
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            Object _typeHandler = createInstance("java.lang.Object");
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            CollectionType _valueType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            com.fasterxml.jackson.databind.JavaType[] _superInterfaces = {null, null, null, null, null, null, null, null, null, null};
            setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
            TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            JavaType javaType = mapType._keyType;
            Class initialMapType_keyType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            MapType actual = mapType.withKeyTypeHandler(((Object) null));
            
            MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            SimpleType _keyType1 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
            setField(_keyType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127754022);
            
            JavaType expected_keyType = expected._keyType;
            JavaType actual_keyType = actual._keyType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_keyType, actual_keyType);
            
            JavaType expected_valueType = expected._valueType;
            JavaType actual_valueType = actual._valueType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_valueType, actual_valueType);
            
            JavaType actual_superClass = actual._superClass;
            assertNull(actual_superClass);
            
            com.fasterxml.jackson.databind.JavaType[] expected_superInterfaces = expected._superInterfaces;
            com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
            int expected_superInterfacesSize = expected_superInterfaces.length;
            assertEquals(expected_superInterfacesSize, actual_superInterfaces.length);
            assertTrue(deepEquals(expected_superInterfaces, actual_superInterfaces));
            
            TypeBindings expected_bindings = expected._bindings;
            TypeBindings actual_bindings = actual._bindings;
            // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
            assertEquals(expected_bindings, actual_bindings);
            
            String actual_canonicalName = actual._canonicalName;
            assertNull(actual_canonicalName);
            
            Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
            assertEquals(Class.class, actual_class.getClass());
            
            int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            assertEquals(expected_hash, actual_hash);
            
            Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
            assertNull(actual_valueHandler);
            
            Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
            assertNull(actual_typeHandler);
            
            boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
            assertFalse(actual_asStatic);
            
            JavaType javaType1 = mapType._keyType;
            Class finalMapType_keyType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType finalMapType_superInterfaces0 = mapType._superInterfaces[0];
            JavaType finalMapType_superInterfaces1 = mapType._superInterfaces[1];
            JavaType finalMapType_superInterfaces2 = mapType._superInterfaces[2];
            JavaType finalMapType_superInterfaces3 = mapType._superInterfaces[3];
            JavaType finalMapType_superInterfaces4 = mapType._superInterfaces[4];
            JavaType finalMapType_superInterfaces5 = mapType._superInterfaces[5];
            JavaType finalMapType_superInterfaces6 = mapType._superInterfaces[6];
            JavaType finalMapType_superInterfaces7 = mapType._superInterfaces[7];
            JavaType finalMapType_superInterfaces8 = mapType._superInterfaces[8];
            JavaType finalMapType_superInterfaces9 = mapType._superInterfaces[9];
            Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialMapType_keyType_class == finalMapType_keyType_class);
            
            assertFalse(initialMapType_class == finalMapType_class);
            
            assertNull(finalMapType_superInterfaces0);
            
            assertNull(finalMapType_superInterfaces1);
            
            assertNull(finalMapType_superInterfaces2);
            
            assertNull(finalMapType_superInterfaces3);
            
            assertNull(finalMapType_superInterfaces4);
            
            assertNull(finalMapType_superInterfaces5);
            
            assertNull(finalMapType_superInterfaces6);
            
            assertNull(finalMapType_superInterfaces7);
            
            assertNull(finalMapType_superInterfaces8);
            
            assertNull(finalMapType_superInterfaces9);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    
    @Test
    public void testWithKeyTypeHandler3() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ArrayType _keyType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        MapType _componentType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(_componentType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_componentType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
        setField(_keyType, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        setField(_keyType, "com.fasterxml.jackson.databind.type.ArrayType", "_emptyArray", _componentType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _componentType);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        CollectionType _valueType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        Object object = new Object();
        
        JavaType javaType = mapType._keyType;
        JavaType javaType_keyType_componentType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType"));
        Class initialMapType_keyType_componentType_class = ((Class) getFieldValue(javaType_keyType_componentType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapType actual = mapType.withKeyTypeHandler(object);
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ArrayType _keyType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        setField(_keyType1, "com.fasterxml.jackson.databind.type.ArrayType", "_emptyArray", _componentType);
        setField(_keyType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class1 = MapType.class;
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class1);
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_hash", -2124435391);
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _componentType);
        Object _typeHandler = createInstance("java.lang.Object");
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings1 = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", -1060558380);
        
        JavaType expected_keyType = expected._keyType;
        JavaType actual_keyType = actual._keyType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_keyType, actual_keyType);
        
        JavaType expected_valueType = expected._valueType;
        JavaType actual_valueType = actual._valueType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_valueType, actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        JavaType javaType1 = mapType._keyType;
        JavaType javaType1_keyType_componentType = ((JavaType) getFieldValue(javaType1, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType"));
        Class finalMapType_keyType_componentType_class = ((Class) getFieldValue(javaType1_keyType_componentType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_keyType_componentType_class == finalMapType_keyType_componentType_class);
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    
    @Test
    public void testWithKeyTypeHandler4() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        SimpleType _keyType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        MapType _superClass = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(_superClass, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        Object _typeHandler = createInstance("java.lang.Object");
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        CollectionType _valueType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces = {null, null, null, null, null, null, null, null, null};
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = mapType._keyType;
        JavaType javaType_keyType_superClass = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass"));
        Class initialMapType_keyType_superClass_class = ((Class) getFieldValue(javaType_keyType_superClass, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType1 = mapType._keyType;
        Class initialMapType_keyType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapType actual = mapType.withKeyTypeHandler(((Object) null));
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        SimpleType _keyType1 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
        setField(_keyType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        TypeBindings _bindings1 = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127754022);
        
        JavaType expected_keyType = expected._keyType;
        JavaType actual_keyType = actual._keyType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_keyType, actual_keyType);
        
        JavaType expected_valueType = expected._valueType;
        JavaType actual_valueType = actual._valueType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_valueType, actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] expected_superInterfaces = expected._superInterfaces;
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        int expected_superInterfacesSize = expected_superInterfaces.length;
        assertEquals(expected_superInterfacesSize, actual_superInterfaces.length);
        assertTrue(deepEquals(expected_superInterfaces, actual_superInterfaces));
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        JavaType javaType2 = mapType._keyType;
        JavaType javaType2_keyType_superClass = ((JavaType) getFieldValue(javaType2, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass"));
        Class finalMapType_keyType_superClass_class = ((Class) getFieldValue(javaType2_keyType_superClass, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType3 = mapType._keyType;
        Class finalMapType_keyType_class = ((Class) getFieldValue(javaType3, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType finalMapType_superInterfaces0 = mapType._superInterfaces[0];
        JavaType finalMapType_superInterfaces1 = mapType._superInterfaces[1];
        JavaType finalMapType_superInterfaces2 = mapType._superInterfaces[2];
        JavaType finalMapType_superInterfaces3 = mapType._superInterfaces[3];
        JavaType finalMapType_superInterfaces4 = mapType._superInterfaces[4];
        JavaType finalMapType_superInterfaces5 = mapType._superInterfaces[5];
        JavaType finalMapType_superInterfaces6 = mapType._superInterfaces[6];
        JavaType finalMapType_superInterfaces7 = mapType._superInterfaces[7];
        JavaType finalMapType_superInterfaces8 = mapType._superInterfaces[8];
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_keyType_superClass_class == finalMapType_keyType_superClass_class);
        
        assertFalse(initialMapType_keyType_class == finalMapType_keyType_class);
        
        assertFalse(initialMapType_class == finalMapType_class);
        
        assertNull(finalMapType_superInterfaces0);
        
        assertNull(finalMapType_superInterfaces1);
        
        assertNull(finalMapType_superInterfaces2);
        
        assertNull(finalMapType_superInterfaces3);
        
        assertNull(finalMapType_superInterfaces4);
        
        assertNull(finalMapType_superInterfaces5);
        
        assertNull(finalMapType_superInterfaces6);
        
        assertNull(finalMapType_superInterfaces7);
        
        assertNull(finalMapType_superInterfaces8);
    }
    
    @Test
    public void testWithKeyTypeHandler5() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapType _referencedType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
        setField(_keyType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        CollectionType _valueType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        Object object = new Object();
        
        JavaType javaType = mapType._keyType;
        JavaType javaType_keyType_referencedType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType"));
        Class initialMapType_keyType_referencedType_class = ((Class) getFieldValue(javaType_keyType_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType1 = mapType._keyType;
        Class initialMapType_keyType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapType actual = mapType.withKeyTypeHandler(object);
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ReferenceType _keyType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(_keyType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876755);
        Object _typeHandler = createInstance("java.lang.Object");
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753766);
        
        JavaType expected_keyType = expected._keyType;
        JavaType actual_keyType = actual._keyType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_keyType, actual_keyType);
        
        JavaType expected_valueType = expected._valueType;
        JavaType actual_valueType = actual._valueType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_valueType, actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        JavaType javaType2 = mapType._keyType;
        JavaType javaType2_keyType_referencedType = ((JavaType) getFieldValue(javaType2, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType"));
        Class finalMapType_keyType_referencedType_class = ((Class) getFieldValue(javaType2_keyType_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType3 = mapType._keyType;
        Class finalMapType_keyType_class = ((Class) getFieldValue(javaType3, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_keyType_referencedType_class == finalMapType_keyType_referencedType_class);
        
        assertFalse(initialMapType_keyType_class == finalMapType_keyType_class);
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    
    @Test
    public void testWithKeyTypeHandler6() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _keyType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        CollectionType _valueType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = mapType._keyType;
        JavaType javaType_keyType_keyType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
        Class initialMapType_keyType_keyType_class = ((Class) getFieldValue(javaType_keyType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType1 = mapType._keyType;
        Class initialMapType_keyType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapType actual = mapType.withKeyTypeHandler(((Object) null));
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType2 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_keyType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
        setField(_keyType2, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_keyType2, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_keyType2, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType2);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings1 = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127754022);
        
        JavaType expected_keyType = expected._keyType;
        JavaType actual_keyType = actual._keyType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_keyType, actual_keyType);
        
        JavaType expected_valueType = expected._valueType;
        JavaType actual_valueType = actual._valueType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_valueType, actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        JavaType javaType2 = mapType._keyType;
        JavaType javaType2_keyType_keyType = ((JavaType) getFieldValue(javaType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
        Class finalMapType_keyType_keyType_class = ((Class) getFieldValue(javaType2_keyType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType3 = mapType._keyType;
        Class finalMapType_keyType_class = ((Class) getFieldValue(javaType3, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_keyType_keyType_class == finalMapType_keyType_keyType_class);
        
        assertFalse(initialMapType_keyType_class == finalMapType_keyType_class);
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    
    @Test
    public void testWithKeyTypeHandler7() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        Class typeBaseClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        TypeBindings prevNO_BINDINGS = ((TypeBindings) getStaticFieldValue(typeBaseClazz, "NO_BINDINGS"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            setStaticField(typeBaseClazz, "NO_BINDINGS", empty);
            MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            ArrayType _keyType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
            MapType _componentType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_componentType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
            setField(_keyType, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
            setField(_keyType, "com.fasterxml.jackson.databind.type.ArrayType", "_emptyArray", _componentType);
            Object _typeHandler = createInstance("java.lang.Object");
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            CollectionType _valueType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            Class _class = Object.class;
            setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            Object _valueHandler = createInstance("java.lang.Object");
            setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
            Object _typeHandler1 = createInstance("java.lang.Object");
            setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler1);
            
            Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            MapType actual = mapType.withKeyTypeHandler(((Object) null));
            
            MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            ArrayType _keyType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
            setField(_keyType1, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
            setField(_keyType1, "com.fasterxml.jackson.databind.type.ArrayType", "_emptyArray", _componentType);
            setField(_keyType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            Class _class1 = MapType.class;
            setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class1);
            setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_hash", -2124435391);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", -1060558380);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler1);
            
            JavaType expected_keyType = expected._keyType;
            JavaType actual_keyType = actual._keyType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_keyType, actual_keyType);
            
            JavaType expected_valueType = expected._valueType;
            JavaType actual_valueType = actual._valueType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_valueType, actual_valueType);
            
            JavaType actual_superClass = actual._superClass;
            assertNull(actual_superClass);
            
            com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
            assertNull(actual_superInterfaces);
            
            TypeBindings expected_bindings = expected._bindings;
            TypeBindings actual_bindings = actual._bindings;
            // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
            assertEquals(expected_bindings, actual_bindings);
            
            String actual_canonicalName = actual._canonicalName;
            assertNull(actual_canonicalName);
            
            Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
            assertEquals(Class.class, actual_class.getClass());
            
            int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            assertEquals(expected_hash, actual_hash);
            
            Object expected_valueHandler = getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
            Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
            
            Object expected_typeHandler = getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
            Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
            
            boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
            assertFalse(actual_asStatic);
            
            Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialMapType_class == finalMapType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    
    @Test
    public void testWithKeyTypeHandler8() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        Class typeBaseClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        TypeBindings prevNO_BINDINGS = ((TypeBindings) getStaticFieldValue(typeBaseClazz, "NO_BINDINGS"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            setStaticField(typeBaseClazz, "NO_BINDINGS", empty);
            MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            MapType _keyType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            Class _class = Object.class;
            setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
            setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            CollectionType _valueType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            com.fasterxml.jackson.databind.JavaType[] _superInterfaces = {null, null, null, null, null, null, null, null, null};
            setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
            TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            Object object = new Object();
            
            JavaType javaType = mapType._keyType;
            JavaType javaType_keyType_keyType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
            Class initialMapType_keyType_keyType_class = ((Class) getFieldValue(javaType_keyType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType1 = mapType._keyType;
            Class initialMapType_keyType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            MapType actual = mapType.withKeyTypeHandler(object);
            
            MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            MapLikeType _keyType2 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(_keyType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
            setField(_keyType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
            setField(_keyType2, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(_keyType2, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_keyType2, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            Object _typeHandler = createInstance("java.lang.Object");
            setField(_keyType2, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType2);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127754022);
            
            JavaType expected_keyType = expected._keyType;
            JavaType actual_keyType = actual._keyType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_keyType, actual_keyType);
            
            JavaType expected_valueType = expected._valueType;
            JavaType actual_valueType = actual._valueType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_valueType, actual_valueType);
            
            JavaType actual_superClass = actual._superClass;
            assertNull(actual_superClass);
            
            com.fasterxml.jackson.databind.JavaType[] expected_superInterfaces = expected._superInterfaces;
            com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
            int expected_superInterfacesSize = expected_superInterfaces.length;
            assertEquals(expected_superInterfacesSize, actual_superInterfaces.length);
            assertTrue(deepEquals(expected_superInterfaces, actual_superInterfaces));
            
            TypeBindings expected_bindings = expected._bindings;
            TypeBindings actual_bindings = actual._bindings;
            // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
            assertEquals(expected_bindings, actual_bindings);
            
            String actual_canonicalName = actual._canonicalName;
            assertNull(actual_canonicalName);
            
            Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
            assertEquals(Class.class, actual_class.getClass());
            
            int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            assertEquals(expected_hash, actual_hash);
            
            Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
            assertNull(actual_valueHandler);
            
            Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
            assertNull(actual_typeHandler);
            
            boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
            assertFalse(actual_asStatic);
            
            JavaType javaType2 = mapType._keyType;
            JavaType javaType2_keyType_keyType = ((JavaType) getFieldValue(javaType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
            Class finalMapType_keyType_keyType_class = ((Class) getFieldValue(javaType2_keyType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType3 = mapType._keyType;
            Class finalMapType_keyType_class = ((Class) getFieldValue(javaType3, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType finalMapType_superInterfaces0 = mapType._superInterfaces[0];
            JavaType finalMapType_superInterfaces1 = mapType._superInterfaces[1];
            JavaType finalMapType_superInterfaces2 = mapType._superInterfaces[2];
            JavaType finalMapType_superInterfaces3 = mapType._superInterfaces[3];
            JavaType finalMapType_superInterfaces4 = mapType._superInterfaces[4];
            JavaType finalMapType_superInterfaces5 = mapType._superInterfaces[5];
            JavaType finalMapType_superInterfaces6 = mapType._superInterfaces[6];
            JavaType finalMapType_superInterfaces7 = mapType._superInterfaces[7];
            JavaType finalMapType_superInterfaces8 = mapType._superInterfaces[8];
            Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialMapType_keyType_keyType_class == finalMapType_keyType_keyType_class);
            
            assertFalse(initialMapType_keyType_class == finalMapType_keyType_class);
            
            assertFalse(initialMapType_class == finalMapType_class);
            
            assertNull(finalMapType_superInterfaces0);
            
            assertNull(finalMapType_superInterfaces1);
            
            assertNull(finalMapType_superInterfaces2);
            
            assertNull(finalMapType_superInterfaces3);
            
            assertNull(finalMapType_superInterfaces4);
            
            assertNull(finalMapType_superInterfaces5);
            
            assertNull(finalMapType_superInterfaces6);
            
            assertNull(finalMapType_superInterfaces7);
            
            assertNull(finalMapType_superInterfaces8);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    
    @Test
    public void testWithKeyTypeHandler9() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        Class typeBaseClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        TypeBindings prevNO_BINDINGS = ((TypeBindings) getStaticFieldValue(typeBaseClazz, "NO_BINDINGS"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            setStaticField(typeBaseClazz, "NO_BINDINGS", empty);
            MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            MapType _keyType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            Class _class = Object.class;
            setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
            setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            CollectionType _valueType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            com.fasterxml.jackson.databind.JavaType[] _superInterfaces = {null, null, null, null, null, null, null, null, null};
            setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
            TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            JavaType javaType = mapType._keyType;
            JavaType javaType_keyType_keyType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
            Class initialMapType_keyType_keyType_class = ((Class) getFieldValue(javaType_keyType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType1 = mapType._keyType;
            Class initialMapType_keyType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            MapType actual = mapType.withKeyTypeHandler(((Object) null));
            
            MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            MapType _keyType2 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_keyType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
            setField(_keyType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
            setField(_keyType2, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(_keyType2, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_keyType2, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType2);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127754022);
            
            JavaType expected_keyType = expected._keyType;
            JavaType actual_keyType = actual._keyType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_keyType, actual_keyType);
            
            JavaType expected_valueType = expected._valueType;
            JavaType actual_valueType = actual._valueType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_valueType, actual_valueType);
            
            JavaType actual_superClass = actual._superClass;
            assertNull(actual_superClass);
            
            com.fasterxml.jackson.databind.JavaType[] expected_superInterfaces = expected._superInterfaces;
            com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
            int expected_superInterfacesSize = expected_superInterfaces.length;
            assertEquals(expected_superInterfacesSize, actual_superInterfaces.length);
            assertTrue(deepEquals(expected_superInterfaces, actual_superInterfaces));
            
            TypeBindings expected_bindings = expected._bindings;
            TypeBindings actual_bindings = actual._bindings;
            // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
            assertEquals(expected_bindings, actual_bindings);
            
            String actual_canonicalName = actual._canonicalName;
            assertNull(actual_canonicalName);
            
            Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
            assertEquals(Class.class, actual_class.getClass());
            
            int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            assertEquals(expected_hash, actual_hash);
            
            Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
            assertNull(actual_valueHandler);
            
            Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
            assertNull(actual_typeHandler);
            
            boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
            assertFalse(actual_asStatic);
            
            JavaType javaType2 = mapType._keyType;
            JavaType javaType2_keyType_keyType = ((JavaType) getFieldValue(javaType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
            Class finalMapType_keyType_keyType_class = ((Class) getFieldValue(javaType2_keyType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType3 = mapType._keyType;
            Class finalMapType_keyType_class = ((Class) getFieldValue(javaType3, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType finalMapType_superInterfaces0 = mapType._superInterfaces[0];
            JavaType finalMapType_superInterfaces1 = mapType._superInterfaces[1];
            JavaType finalMapType_superInterfaces2 = mapType._superInterfaces[2];
            JavaType finalMapType_superInterfaces3 = mapType._superInterfaces[3];
            JavaType finalMapType_superInterfaces4 = mapType._superInterfaces[4];
            JavaType finalMapType_superInterfaces5 = mapType._superInterfaces[5];
            JavaType finalMapType_superInterfaces6 = mapType._superInterfaces[6];
            JavaType finalMapType_superInterfaces7 = mapType._superInterfaces[7];
            JavaType finalMapType_superInterfaces8 = mapType._superInterfaces[8];
            Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialMapType_keyType_keyType_class == finalMapType_keyType_keyType_class);
            
            assertFalse(initialMapType_keyType_class == finalMapType_keyType_class);
            
            assertFalse(initialMapType_class == finalMapType_class);
            
            assertNull(finalMapType_superInterfaces0);
            
            assertNull(finalMapType_superInterfaces1);
            
            assertNull(finalMapType_superInterfaces2);
            
            assertNull(finalMapType_superInterfaces3);
            
            assertNull(finalMapType_superInterfaces4);
            
            assertNull(finalMapType_superInterfaces5);
            
            assertNull(finalMapType_superInterfaces6);
            
            assertNull(finalMapType_superInterfaces7);
            
            assertNull(finalMapType_superInterfaces8);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    
    @Test
    public void testWithKeyTypeHandler10() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ArrayType _keyType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        CollectionType _valueType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        Object _valueHandler = createInstance("java.lang.Object");
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        CollectionType _valueType1 = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces = {null, null, null, null, null, null, null, null, null};
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = mapType._keyType;
        Class initialMapType_keyType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapType actual = mapType.withKeyTypeHandler(((Object) null));
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType2 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_keyType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_keyType2, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_keyType2, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_keyType2, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876756);
        setField(_keyType2, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType2);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        TypeBindings _bindings1 = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753767);
        
        JavaType expected_keyType = expected._keyType;
        JavaType actual_keyType = actual._keyType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_keyType, actual_keyType);
        
        JavaType expected_valueType = expected._valueType;
        JavaType actual_valueType = actual._valueType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_valueType, actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] expected_superInterfaces = expected._superInterfaces;
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        int expected_superInterfacesSize = expected_superInterfaces.length;
        assertEquals(expected_superInterfacesSize, actual_superInterfaces.length);
        assertTrue(deepEquals(expected_superInterfaces, actual_superInterfaces));
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        JavaType javaType1 = mapType._keyType;
        Class finalMapType_keyType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType finalMapType_superInterfaces0 = mapType._superInterfaces[0];
        JavaType finalMapType_superInterfaces1 = mapType._superInterfaces[1];
        JavaType finalMapType_superInterfaces2 = mapType._superInterfaces[2];
        JavaType finalMapType_superInterfaces3 = mapType._superInterfaces[3];
        JavaType finalMapType_superInterfaces4 = mapType._superInterfaces[4];
        JavaType finalMapType_superInterfaces5 = mapType._superInterfaces[5];
        JavaType finalMapType_superInterfaces6 = mapType._superInterfaces[6];
        JavaType finalMapType_superInterfaces7 = mapType._superInterfaces[7];
        JavaType finalMapType_superInterfaces8 = mapType._superInterfaces[8];
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_keyType_class == finalMapType_keyType_class);
        
        assertFalse(initialMapType_class == finalMapType_class);
        
        assertNull(finalMapType_superInterfaces0);
        
        assertNull(finalMapType_superInterfaces1);
        
        assertNull(finalMapType_superInterfaces2);
        
        assertNull(finalMapType_superInterfaces3);
        
        assertNull(finalMapType_superInterfaces4);
        
        assertNull(finalMapType_superInterfaces5);
        
        assertNull(finalMapType_superInterfaces6);
        
        assertNull(finalMapType_superInterfaces7);
        
        assertNull(finalMapType_superInterfaces8);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method withKeyTypeHandler(java.lang.Object)
    
    @Test
    public void testWithKeyTypeHandler11() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        SimpleType _keyType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Object _typeHandler = createInstance("java.lang.Object");
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        CollectionType _valueType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces = {null, null, null, null, null, null, null, null, null};
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapType.withKeyTypeHandler] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:80)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:45)
            com.fasterxml.jackson.databind.type.SimpleType.<init>(SimpleType.java:55)
            com.fasterxml.jackson.databind.type.SimpleType.withTypeHandler(SimpleType.java:151)
            com.fasterxml.jackson.databind.type.SimpleType.withTypeHandler(SimpleType.java:13)
            com.fasterxml.jackson.databind.type.MapType.withKeyTypeHandler(MapType.java:133) */
        mapType.withKeyTypeHandler(object);
    }
    
    @Test
    public void testWithKeyTypeHandler12() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        Class typeBaseClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        TypeBindings prevNO_BINDINGS = ((TypeBindings) getStaticFieldValue(typeBaseClazz, "NO_BINDINGS"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            setStaticField(typeBaseClazz, "NO_BINDINGS", empty);
            MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            ArrayType _keyType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
            MapType _componentType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_componentType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
            setField(_keyType, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
            setField(_keyType, "com.fasterxml.jackson.databind.type.ArrayType", "_emptyArray", _componentType);
            Object _typeHandler = createInstance("java.lang.Object");
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            CollectionType _valueType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            Object _valueHandler = createInstance("java.lang.Object");
            setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
            Object _typeHandler1 = createInstance("java.lang.Object");
            setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler1);
            
            /* This test fails because method [com.fasterxml.jackson.databind.type.MapType.withKeyTypeHandler] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:80)
                com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:45)
                com.fasterxml.jackson.databind.type.MapLikeType.<init>(MapLikeType.java:38)
                com.fasterxml.jackson.databind.type.MapType.<init>(MapType.java:22)
                com.fasterxml.jackson.databind.type.MapType.withKeyTypeHandler(MapType.java:133) */
            mapType.withKeyTypeHandler(((Object) null));
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapType.withStaticTyping
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withStaticTyping()
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withStaticTyping()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithStaticTyping_Return() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        
        MapType actual = mapType.withStaticTyping();
        
        JavaType actual_keyType = actual._keyType;
        assertNull(actual_keyType);
        
        JavaType actual_valueType = actual._valueType;
        assertNull(actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings actual_bindings = actual._bindings;
        assertNull(actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertNull(actual_class);
        
        int mapType_hash = ((Integer) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(mapType_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertTrue(actual_asStatic);
        
    }
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withStaticTyping()}
 * @utbot.executesCondition {@code (_asStatic): False}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType.withStaticTyping(), _valueType.withStaticTyping(), _valueHandler, _typeHandler, true);}
 *  */
    @Test
    public void testWithStaticTyping_Not_asStatic() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        Class typeBaseClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        TypeBindings prevNO_BINDINGS = ((TypeBindings) getStaticFieldValue(typeBaseClazz, "NO_BINDINGS"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            setStaticField(typeBaseClazz, "NO_BINDINGS", empty);
            MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
            Class _class = Object.class;
            setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            MapType actual = mapType.withStaticTyping();
            
            MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
            
            JavaType expected_keyType = expected._keyType;
            JavaType actual_keyType = actual._keyType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_keyType, actual_keyType);
            
            JavaType expected_valueType = expected._valueType;
            JavaType actual_valueType = actual._valueType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_valueType, actual_valueType);
            
            JavaType actual_superClass = actual._superClass;
            assertNull(actual_superClass);
            
            com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
            assertNull(actual_superInterfaces);
            
            TypeBindings expected_bindings = expected._bindings;
            TypeBindings actual_bindings = actual._bindings;
            // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
            assertEquals(expected_bindings, actual_bindings);
            
            String actual_canonicalName = actual._canonicalName;
            assertNull(actual_canonicalName);
            
            Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
            assertEquals(Class.class, actual_class.getClass());
            
            int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            assertEquals(expected_hash, actual_hash);
            
            Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
            assertNull(actual_valueHandler);
            
            Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
            assertNull(actual_typeHandler);
            
            boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
            assertTrue(actual_asStatic);
            
            Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialMapType_class == finalMapType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withStaticTyping()}
 * @utbot.executesCondition {@code (_asStatic): False}
 * @utbot.returnsFrom {@code return new MapType(_class, _bindings, _superClass, _superInterfaces, _keyType.withStaticTyping(), _valueType.withStaticTyping(), _valueHandler, _typeHandler, true);}
 *  */
    @Test
    public void testWithStaticTyping_Not_asStatic_1() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = mapType._keyType;
        Class initialMapType_keyType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapType actual = mapType.withStaticTyping();
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        
        JavaType expected_keyType = expected._keyType;
        JavaType actual_keyType = actual._keyType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_keyType, actual_keyType);
        
        JavaType expected_valueType = expected._valueType;
        JavaType actual_valueType = actual._valueType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_valueType, actual_valueType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertTrue(actual_asStatic);
        
        JavaType javaType1 = mapType._keyType;
        Class finalMapType_keyType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_keyType_class == finalMapType_keyType_class);
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withStaticTyping()
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withStaticTyping()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#withStaticTyping()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _superClass
 *  */
    @Test
    public void testWithStaticTyping_ThrowNullPointerException() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93) */
        mapType.withStaticTyping();
    }
    
    /**
    @utbot.classUnderTest {@link MapType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapType#withStaticTyping()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#withStaticTyping()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#withStaticTyping()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _superClass
 *  */
    @Test
    public void testWithStaticTyping_ThrowNullPointerException_1() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93) */
        mapType.withStaticTyping();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method withStaticTyping()
    
    @Test(expected = StackOverflowError.class)
    public void testWithStaticTyping1() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionType _keyType2 = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType2);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_keyType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        ArrayType _superClass = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_keyType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        Object _valueHandler = createInstance("java.lang.Object");
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _valueHandler);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces = {null};
        setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        ArrayType _superClass1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass1);
        
        mapType.withStaticTyping();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testWithStaticTyping2() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionType _keyType1 = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        Object _typeHandler = createInstance("java.lang.Object");
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _valueType1);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces = {null, null, null, null, null, null, null, null, null, null};
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        
        mapType.withStaticTyping();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testWithStaticTyping3() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _valueType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        mapType.withStaticTyping();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testWithStaticTyping4() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        
        mapType.withStaticTyping();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testWithStaticTyping5() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_keyType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        mapType.withStaticTyping();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testWithStaticTyping6() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ReferenceType _keyType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _valueType);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        mapType.withStaticTyping();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testWithStaticTyping7() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        ReferenceType _valueType2 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_valueType2, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _valueType1);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        mapType.withStaticTyping();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testWithStaticTyping8() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        mapType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping9() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionType _keyType2 = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType2);
        setField(_keyType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        Class _class = Object.class;
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93) */
        mapType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping10() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:80)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:45)
            com.fasterxml.jackson.databind.type.MapLikeType.<init>(MapLikeType.java:38)
            com.fasterxml.jackson.databind.type.MapType.<init>(MapType.java:22)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93) */
        mapType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping11() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            MapLikeType _keyType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
            setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
            MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            CollectionType _keyType2 = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType2);
            MapLikeType _valueType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(_valueType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
            setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
            Class _class = Object.class;
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            Object _valueHandler = createInstance("java.lang.Object");
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
            Object _typeHandler = createInstance("java.lang.Object");
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
            setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            ResolvedRecursiveType _superClass = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
            setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
            TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            CollectionType _superClass1 = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass1);
            com.fasterxml.jackson.databind.JavaType[] _superInterfaces = {null, null, null, null, null, null, null, null, null, null};
            setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
            
            /* This test fails because method [com.fasterxml.jackson.databind.type.MapType.withStaticTyping] produces [java.lang.NullPointerException] */
            mapType.withStaticTyping();
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
        }
    }
    
    @Test
    public void testWithStaticTyping12() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.<init>(MapLikeType.java:38)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93) */
        mapType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping13() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        MapType _valueType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapType.withStaticTyping] produces [java.lang.NullPointerException] */
        mapType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping14() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ReferenceType _keyType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        MapType _valueType2 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        Class _class = Object.class;
        setField(_valueType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapType.withStaticTyping] produces [java.lang.NullPointerException] */
        mapType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping15() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        ReferenceType _valueType2 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:80)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:45)
            com.fasterxml.jackson.databind.type.MapLikeType.<init>(MapLikeType.java:38)
            com.fasterxml.jackson.databind.type.MapType.<init>(MapType.java:22)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93) */
        mapType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping16() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ReferenceType _keyType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _keyType);
        Class _class = Object.class;
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapType.withStaticTyping] produces [java.lang.NullPointerException] */
        mapType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping17() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType2 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93) */
        mapType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping18() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType2 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType2, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType2);
        MapType _valueType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_keyType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapType.withStaticTyping] produces [java.lang.NullPointerException] */
        mapType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping19() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        ReferenceType _valueType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapType _referencedType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:80)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:45)
            com.fasterxml.jackson.databind.type.SimpleType.<init>(SimpleType.java:68)
            com.fasterxml.jackson.databind.type.ReferenceType.<init>(ReferenceType.java:23)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:127)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:13)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93) */
        mapType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping20() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType2 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        setField(_keyType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.<init>(MapLikeType.java:38)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93) */
        mapType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping21() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType2 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_keyType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType2);
        setField(_keyType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapType.withStaticTyping] produces [java.lang.NullPointerException] */
        mapType.withStaticTyping();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1072556211748800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1072556211748800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1072556211873200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1072556211748800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1072556211873200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1072556212311200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1072556212311200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1072556212314399 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1072556212311200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1072556212314399).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1072556212774700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1072556212774700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1072556212777900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1072556212774700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1072556212777900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1072556213402299 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1072556213402299.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1072556213404899 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1072556213402299.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1072556213404899).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static int getArrayLength(Object arr) {
        return java.lang.reflect.Array.getLength(arr);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

