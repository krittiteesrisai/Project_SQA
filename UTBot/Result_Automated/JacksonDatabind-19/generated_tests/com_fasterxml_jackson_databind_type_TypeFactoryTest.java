package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import com.fasterxml.jackson.databind.util.LRUMap;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import com.fasterxml.jackson.core.type.TypeReference;
import sun.reflect.generics.reflectiveObjects.WildcardTypeImpl;
import sun.reflect.generics.tree.FieldTypeSignature;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import sun.reflect.generics.reflectiveObjects.TypeVariableImpl;
import sun.reflect.generics.reflectiveObjects.GenericArrayTypeImpl;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;

public final class com_fasterxml_jackson_databind_type_TypeFactoryTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.clearCache
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clearCache()
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#clearCache()}
 *  */
    @Test
    public void testClearCache() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        LRUMap _typeCache = ((LRUMap) createInstance("com.fasterxml.jackson.databind.util.LRUMap"));
        HashMap _map = new HashMap();
        setField(_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_map", _map);
        setField(typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_typeCache", _typeCache);
        
        typeFactory.clearCache();
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#clearCache()}
 *  */
    @Test
    public void testClearCache_1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        LRUMap _typeCache = ((LRUMap) createInstance("com.fasterxml.jackson.databind.util.LRUMap"));
        HashMap _map = new HashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        _map.put(integer, object);
        setField(_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_map", _map);
        setField(typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_typeCache", _typeCache);
        
        typeFactory.clearCache();
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#clearCache()}
 *  */
    @Test
    public void testClearCache_2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        LRUMap _typeCache = ((LRUMap) createInstance("com.fasterxml.jackson.databind.util.LRUMap"));
        HashMap _map = new HashMap();
        Character character = '\u0000';
        Object object = createInstance("java.lang.Object");
        _map.put(character, object);
        setField(_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_map", _map);
        setField(typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_typeCache", _typeCache);
        
        typeFactory.clearCache();
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#clearCache()}
 *  */
    @Test
    public void testClearCache_3() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        LRUMap _typeCache = ((LRUMap) createInstance("com.fasterxml.jackson.databind.util.LRUMap"));
        HashMap _map = new HashMap();
        Integer integer = 1;
        Object object = createInstance("java.lang.Object");
        _map.put(integer, object);
        Integer integer1 = 0;
        Object object1 = createInstance("java.lang.Object");
        _map.put(integer1, object1);
        setField(_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_map", _map);
        setField(typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_typeCache", _typeCache);
        
        typeFactory.clearCache();
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#clearCache()}
 *  */
    @Test
    public void testClearCache_4() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        LRUMap _typeCache = ((LRUMap) createInstance("com.fasterxml.jackson.databind.util.LRUMap"));
        HashMap _map = new HashMap();
        _map.put(null, null);
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        _map.put(integer, object);
        setField(_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_map", _map);
        setField(typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_typeCache", _typeCache);
        
        typeFactory.clearCache();
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#clearCache()}
 *  */
    @Test
    public void testClearCache_5() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        LRUMap _typeCache = ((LRUMap) createInstance("com.fasterxml.jackson.databind.util.LRUMap"));
        HashMap _map = new HashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        _map.put(integer, object);
        _map.put(null, null);
        setField(_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_map", _map);
        setField(typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_typeCache", _typeCache);
        
        typeFactory.clearCache();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clearCache()
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#clearCache()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.LRUMap#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _typeCache.clear();
 *  */
    @Test
    public void testClearCache_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.clearCache] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory.clearCache(TypeFactory.java:146) */
        typeFactory.clearCache();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method defaultInstance()
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#defaultInstance()}
     */
    @Test
    public void testDefaultInstance() throws Exception  {
        TypeFactory actual = TypeFactory.defaultInstance();
        
        TypeFactory expected = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        LRUMap _typeCache = ((LRUMap) createInstance("com.fasterxml.jackson.databind.util.LRUMap"));
        setField(_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_maxEntries", 100);
        ConcurrentHashMap _map = new ConcurrentHashMap();
        setField(_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_map", _map);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeFactory", "_typeCache", _typeCache);
        TypeParser _parser = ((TypeParser) createInstance("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(_parser, "com.fasterxml.jackson.databind.type.TypeParser", "_factory", expected);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeFactory", "_parser", _parser);
        
        LRUMap expected_typeCache = expected._typeCache;
        LRUMap actual_typeCache = actual._typeCache;
        int expected_typeCache_maxEntries = ((Integer) getFieldValue(expected_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_maxEntries"));
        int actual_typeCache_maxEntries = ((Integer) getFieldValue(actual_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_maxEntries"));
        assertEquals(expected_typeCache_maxEntries, actual_typeCache_maxEntries);
        
        ConcurrentHashMap expected_typeCache_map = ((ConcurrentHashMap) getFieldValue(expected_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_map"));
        ConcurrentHashMap actual_typeCache_map = ((ConcurrentHashMap) getFieldValue(actual_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_map"));
        assertTrue(deepEquals(expected_typeCache_map, actual_typeCache_map));
        
        int expected_typeCache_jdkSerializeMaxEntries = ((Integer) getFieldValue(expected_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_jdkSerializeMaxEntries"));
        int actual_typeCache_jdkSerializeMaxEntries = ((Integer) getFieldValue(actual_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_jdkSerializeMaxEntries"));
        assertEquals(expected_typeCache_jdkSerializeMaxEntries, actual_typeCache_jdkSerializeMaxEntries);
        
        HierarchicType actual_cachedHashMapType = actual._cachedHashMapType;
        assertNull(actual_cachedHashMapType);
        
        HierarchicType actual_cachedArrayListType = actual._cachedArrayListType;
        assertNull(actual_cachedArrayListType);
        
        com.fasterxml.jackson.databind.type.TypeModifier[] actual_modifiers = actual._modifiers;
        assertNull(actual_modifiers);
        
        TypeParser expected_parser = expected._parser;
        TypeParser actual_parser = actual._parser;
        TypeFactory expected_parser_factory = expected_parser._factory;
        TypeFactory actual_parser_factory = actual_parser._factory;
        assertTrue(deepEquals(expected_parser_factory, actual_parser_factory));
        assertTrue(deepEquals(expected_parser_factory, actual_parser_factory));
        assertTrue(deepEquals(expected_parser_factory, actual_parser_factory));
        assertTrue(deepEquals(expected_parser_factory, actual_parser_factory));
        assertTrue(deepEquals(expected_parser_factory, actual_parser_factory));
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method defaultInstance()
    
    @Test
    public void testDefaultInstance1() throws Exception  {
        TypeFactory actual = TypeFactory.defaultInstance();
        
        TypeFactory expected = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        LRUMap _typeCache = ((LRUMap) createInstance("com.fasterxml.jackson.databind.util.LRUMap"));
        setField(_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_maxEntries", 100);
        ConcurrentHashMap _map = new ConcurrentHashMap();
        setField(_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_map", _map);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeFactory", "_typeCache", _typeCache);
        TypeParser _parser = ((TypeParser) createInstance("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(_parser, "com.fasterxml.jackson.databind.type.TypeParser", "_factory", expected);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeFactory", "_parser", _parser);
        
        LRUMap expected_typeCache = expected._typeCache;
        LRUMap actual_typeCache = actual._typeCache;
        int expected_typeCache_maxEntries = ((Integer) getFieldValue(expected_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_maxEntries"));
        int actual_typeCache_maxEntries = ((Integer) getFieldValue(actual_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_maxEntries"));
        assertEquals(expected_typeCache_maxEntries, actual_typeCache_maxEntries);
        
        ConcurrentHashMap expected_typeCache_map = ((ConcurrentHashMap) getFieldValue(expected_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_map"));
        ConcurrentHashMap actual_typeCache_map = ((ConcurrentHashMap) getFieldValue(actual_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_map"));
        assertTrue(deepEquals(expected_typeCache_map, actual_typeCache_map));
        
        int expected_typeCache_jdkSerializeMaxEntries = ((Integer) getFieldValue(expected_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_jdkSerializeMaxEntries"));
        int actual_typeCache_jdkSerializeMaxEntries = ((Integer) getFieldValue(actual_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_jdkSerializeMaxEntries"));
        assertEquals(expected_typeCache_jdkSerializeMaxEntries, actual_typeCache_jdkSerializeMaxEntries);
        
        HierarchicType actual_cachedHashMapType = actual._cachedHashMapType;
        assertNull(actual_cachedHashMapType);
        
        HierarchicType actual_cachedArrayListType = actual._cachedArrayListType;
        assertNull(actual_cachedArrayListType);
        
        com.fasterxml.jackson.databind.type.TypeModifier[] actual_modifiers = actual._modifiers;
        assertNull(actual_modifiers);
        
        TypeParser expected_parser = expected._parser;
        TypeParser actual_parser = actual._parser;
        TypeFactory expected_parser_factory = expected_parser._factory;
        TypeFactory actual_parser_factory = actual_parser._factory;
        assertTrue(deepEquals(expected_parser_factory, actual_parser_factory));
        assertTrue(deepEquals(expected_parser_factory, actual_parser_factory));
        assertTrue(deepEquals(expected_parser_factory, actual_parser_factory));
        assertTrue(deepEquals(expected_parser_factory, actual_parser_factory));
        assertTrue(deepEquals(expected_parser_factory, actual_parser_factory));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructMapType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method constructMapType(java.lang.Class, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructMapType(java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.MapType#construct(java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return MapType.construct(mapClass, keyType, valueType);}
 *  */
    @Test
    public void testConstructMapType_MapTypeConstruct() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
        ReferenceType referenceType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(referenceType1, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
        
        MapType actual = typeFactory.constructMapType(class1, referenceType, referenceType1);
        
        MapType expected = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", referenceType);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", referenceType1);
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
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructMapType
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method constructMapType(java.lang.Class, java.lang.Class, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructMapType(java.lang.Class,java.lang.Class,java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#constructType(java.lang.reflect.Type)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return MapType.construct(mapClass, constructType(keyClass), constructType(valueClass));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructMapType_ThrowIllegalArgumentException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        typeFactory.constructMapType(((Class) null), ((Class) null), ((Class) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method constructMapType(java.lang.Class, java.lang.Class, java.lang.Class)
    
    @Test
    public void testConstructMapType1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructMapType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromClass(TypeFactory.java:777)
            com.fasterxml.jackson.databind.type.TypeFactory._constructType(TypeFactory.java:387)
            com.fasterxml.jackson.databind.type.TypeFactory.constructType(TypeFactory.java:355)
            com.fasterxml.jackson.databind.type.TypeFactory.constructMapType(TypeFactory.java:503) */
        typeFactory.constructMapType(((Class) null), class1, ((Class) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructArrayType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method constructArrayType(com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructArrayType(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.ArrayType#construct(com.fasterxml.jackson.databind.JavaType,java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return ArrayType.construct(elementType, null, null);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ArrayType.construct(elementType, null, null);
 *  */
    @Test
    public void testConstructArrayType_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(arrayType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructArrayType] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.newArray(Native Method)
            java.base/java.lang.reflect.Array.newInstance(Array.java:78)
            com.fasterxml.jackson.databind.type.ArrayType.construct(ArrayType.java:47)
            com.fasterxml.jackson.databind.type.TypeFactory.constructArrayType(TypeFactory.java:443) */
        typeFactory.constructArrayType(arrayType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructArrayType
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method constructArrayType(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructArrayType(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#_constructType(java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return ArrayType.construct(_constructType(elementType, null), null, null);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructArrayType_ThrowIllegalArgumentException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        typeFactory.constructArrayType(((Class) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method constructArrayType(java.lang.Class)
    
    @Test
    public void testConstructArrayType1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructArrayType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromClass(TypeFactory.java:777)
            com.fasterxml.jackson.databind.type.TypeFactory._constructType(TypeFactory.java:387)
            com.fasterxml.jackson.databind.type.TypeFactory.constructArrayType(TypeFactory.java:433) */
        typeFactory.constructArrayType(class1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.rawClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method rawClass(java.lang.reflect.Type)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#rawClass(java.lang.reflect.Type)}
 * @utbot.executesCondition {@code (t instanceof Class<?>): True}
 * @utbot.returnsFrom {@code return (Class<?>) t;}
 *  */
    @Test
    public void testRawClass_TInstanceOfClass() {
        Class class1 = Object.class;
        
        Class actual = TypeFactory.rawClass(class1);
        
        assertEquals(Class.class, actual.getClass());
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method rawClass(java.lang.reflect.Type)
    
    @Test(expected = IllegalArgumentException.class)
    public void testRawClass1() {
        TypeFactory.rawClass(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructCollectionType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method constructCollectionType(java.lang.Class, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructCollectionType(java.lang.Class,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.CollectionType#construct(java.lang.Class,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return CollectionType.construct(collectionClass, elementType);}
 *  */
    @Test
    public void testConstructCollectionType_CollectionTypeConstruct() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
        
        CollectionType actual = typeFactory.constructCollectionType(class1, referenceType);
        
        CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", referenceType);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876755);
        
        JavaType expected_elementType = expected._elementType;
        JavaType actual_elementType = actual._elementType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_elementType, actual_elementType);
        
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
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructCollectionType
    
    ///region OTHER: ERROR SUITE for method constructCollectionType(java.lang.Class, java.lang.Class)
    
    @Test
    public void testConstructCollectionType1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructCollectionType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromClass(TypeFactory.java:777)
            com.fasterxml.jackson.databind.type.TypeFactory._constructType(TypeFactory.java:387)
            com.fasterxml.jackson.databind.type.TypeFactory.constructType(TypeFactory.java:355)
            com.fasterxml.jackson.databind.type.TypeFactory.constructCollectionType(TypeFactory.java:453) */
        typeFactory.constructCollectionType(((Class) null), class1);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method constructCollectionType(java.lang.Class, java.lang.Class)
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructCollectionType2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        typeFactory.constructCollectionType(((Class) null), ((Class) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method constructType(java.lang.reflect.Type, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructType(java.lang.reflect.Type,java.lang.Class)}
 * @utbot.executesCondition {@code ((context == null)): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#_constructType(java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.returnsFrom {@code return _constructType(type, b);}
 *  */
    @Test
    public void testConstructType_ContextEqualsNull() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        Class typeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class mapTypeType = Class.forName("java.lang.reflect.Type");
        Class classType = Class.forName("java.lang.Class");
        Method constructTypeMethod = typeFactoryClazz.getDeclaredMethod("constructType", mapTypeType, classType);
        constructTypeMethod.setAccessible(true);
        java.lang.Object[] constructTypeMethodArguments = new java.lang.Object[2];
        constructTypeMethodArguments[0] = mapType;
        constructTypeMethodArguments[1] = ((Object) null);
        MapType actual = ((MapType) constructTypeMethod.invoke(typeFactory, constructTypeMethodArguments));
        
        JavaType actual_keyType = actual._keyType;
        assertNull(actual_keyType);
        
        JavaType actual_valueType = actual._valueType;
        assertNull(actual_valueType);
        
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
        assertFalse(actual_asStatic);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method constructType(java.lang.reflect.Type, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructType(java.lang.reflect.Type,java.lang.Class)}
 * @utbot.executesCondition {@code ((context == null)): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#_constructType(java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return _constructType(type, b);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructType_ThrowIllegalArgumentException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        typeFactory.constructType(((Type) null), ((Class) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method constructType(java.lang.reflect.Type, java.lang.Class)
    
    @Test
    public void testConstructType1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromClass(TypeFactory.java:777)
            com.fasterxml.jackson.databind.type.TypeFactory._constructType(TypeFactory.java:387)
            com.fasterxml.jackson.databind.type.TypeFactory.constructType(TypeFactory.java:368) */
        typeFactory.constructType(((Type) class1), class1);
    }
    
    @Test
    public void testConstructType2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromClass(TypeFactory.java:777)
            com.fasterxml.jackson.databind.type.TypeFactory._constructType(TypeFactory.java:387)
            com.fasterxml.jackson.databind.type.TypeFactory.constructType(TypeFactory.java:368) */
        typeFactory.constructType(((Type) class1), ((Class) null));
    }
    ///endregion
    
    ///region Errors report for constructType
    
    public void testConstructType_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method constructType(com.fasterxml.jackson.core.type.TypeReference)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructType(com.fasterxml.jackson.core.type.TypeReference)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.type.TypeReference#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _constructType(typeRef.getType(), null);
 *  */
    @Test
    public void testConstructType_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory.constructType(TypeFactory.java:363) */
        typeFactory.constructType(((TypeReference) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method constructType(java.lang.reflect.Type, com.fasterxml.jackson.databind.type.TypeBindings)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructType(java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#_constructType(java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.returnsFrom {@code return _constructType(type, bindings);}
 *  */
    @Test
    public void testConstructType_TypeFactory_constructType() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        Class typeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class mapTypeType = Class.forName("java.lang.reflect.Type");
        Class typeBindingsType = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Method constructTypeMethod = typeFactoryClazz.getDeclaredMethod("constructType", mapTypeType, typeBindingsType);
        constructTypeMethod.setAccessible(true);
        java.lang.Object[] constructTypeMethodArguments = new java.lang.Object[2];
        constructTypeMethodArguments[0] = mapType;
        constructTypeMethodArguments[1] = ((Object) null);
        MapType actual = ((MapType) constructTypeMethod.invoke(typeFactory, constructTypeMethodArguments));
        
        JavaType actual_keyType = actual._keyType;
        assertNull(actual_keyType);
        
        JavaType actual_valueType = actual._valueType;
        assertNull(actual_valueType);
        
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
        assertFalse(actual_asStatic);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method constructType(java.lang.reflect.Type, com.fasterxml.jackson.databind.type.TypeBindings)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructType(java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#_constructType(java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return _constructType(type, bindings);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructType_ThrowIllegalArgumentException1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        typeFactory.constructType(((Type) null), ((TypeBindings) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method constructType(java.lang.reflect.Type, com.fasterxml.jackson.databind.type.TypeBindings)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructType(java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#_constructType(java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return _constructType(type, bindings);
 *  */
    @Test
    public void testConstructType_ThrowIndexOutOfBoundsException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        java.lang.Object[] upperBounds = {};
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "upperBounds", upperBounds);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructType] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        typeFactory.constructType(((Type) wildcardTypeImpl), ((TypeBindings) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method constructType(java.lang.reflect.Type, com.fasterxml.jackson.databind.type.TypeBindings)
    
    @Test
    public void testConstructType3() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromClass(TypeFactory.java:777)
            com.fasterxml.jackson.databind.type.TypeFactory._constructType(TypeFactory.java:387)
            com.fasterxml.jackson.databind.type.TypeFactory.constructType(TypeFactory.java:359) */
        typeFactory.constructType(((Type) class1), ((TypeBindings) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method constructType(java.lang.reflect.Type)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructType(java.lang.reflect.Type)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#_constructType(java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.returnsFrom {@code return _constructType(type, null);}
 *  */
    @Test
    public void testConstructType_TypeFactory_constructType1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        Class typeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class mapTypeType = Class.forName("java.lang.reflect.Type");
        Method constructTypeMethod = typeFactoryClazz.getDeclaredMethod("constructType", mapTypeType);
        constructTypeMethod.setAccessible(true);
        java.lang.Object[] constructTypeMethodArguments = new java.lang.Object[1];
        constructTypeMethodArguments[0] = mapType;
        MapType actual = ((MapType) constructTypeMethod.invoke(typeFactory, constructTypeMethodArguments));
        
        JavaType actual_keyType = actual._keyType;
        assertNull(actual_keyType);
        
        JavaType actual_valueType = actual._valueType;
        assertNull(actual_valueType);
        
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
        assertFalse(actual_asStatic);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method constructType(java.lang.reflect.Type)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructType(java.lang.reflect.Type)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#_constructType(java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return _constructType(type, null);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructType_ThrowIllegalArgumentException2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        typeFactory.constructType(((Type) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method constructType(java.lang.reflect.Type)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructType(java.lang.reflect.Type)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#_constructType(java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return _constructType(type, null);
 *  */
    @Test
    public void testConstructType_ThrowIndexOutOfBoundsException1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        java.lang.Object[] upperBounds = {};
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "upperBounds", upperBounds);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructType] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        typeFactory.constructType(wildcardTypeImpl);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method constructType(java.lang.reflect.Type)
    
    @Test
    public void testConstructType4() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromClass(TypeFactory.java:777)
            com.fasterxml.jackson.databind.type.TypeFactory._constructType(TypeFactory.java:387)
            com.fasterxml.jackson.databind.type.TypeFactory.constructType(TypeFactory.java:355) */
        typeFactory.constructType(class1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method constructType(java.lang.reflect.Type, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructType(java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code ((context == null)): True}
 * @utbot.returnsFrom {@code return _constructType(type, b);}
 *  */
    @Test
    public void testConstructType_ContextEqualsNull1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        Class typeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class mapTypeType = Class.forName("java.lang.reflect.Type");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method constructTypeMethod = typeFactoryClazz.getDeclaredMethod("constructType", mapTypeType, javaTypeType);
        constructTypeMethod.setAccessible(true);
        java.lang.Object[] constructTypeMethodArguments = new java.lang.Object[2];
        constructTypeMethodArguments[0] = mapType;
        constructTypeMethodArguments[1] = ((Object) null);
        MapType actual = ((MapType) constructTypeMethod.invoke(typeFactory, constructTypeMethodArguments));
        
        JavaType actual_keyType = actual._keyType;
        assertNull(actual_keyType);
        
        JavaType actual_valueType = actual._valueType;
        assertNull(actual_valueType);
        
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
        assertFalse(actual_asStatic);
        
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructType(java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code ((context == null)): False}
 * @utbot.returnsFrom {@code return _constructType(type, b);}
 *  */
    @Test
    public void testConstructType_ContextNotEqualsNull() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        Class typeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class mapLikeTypeType = Class.forName("java.lang.reflect.Type");
        Class referenceTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method constructTypeMethod = typeFactoryClazz.getDeclaredMethod("constructType", mapLikeTypeType, referenceTypeType);
        constructTypeMethod.setAccessible(true);
        java.lang.Object[] constructTypeMethodArguments = new java.lang.Object[2];
        constructTypeMethodArguments[0] = mapLikeType;
        constructTypeMethodArguments[1] = referenceType;
        MapLikeType actual = ((MapLikeType) constructTypeMethod.invoke(typeFactory, constructTypeMethodArguments));
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(mapLikeType, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method constructType(java.lang.reflect.Type, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructType(java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code ((context == null)): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#_constructType(java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return _constructType(type, b);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructType_ThrowIllegalArgumentException3() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        typeFactory.constructType(((Type) null), ((JavaType) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method constructType(java.lang.reflect.Type, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructType(java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testConstructType_ThrowClassCastException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        java.lang.Object[] upperBounds = {};
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "upperBounds", upperBounds);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructType] produces [java.lang.ClassCastException: The object with type java.lang.Object[] can not be casted to java.lang.reflect.Type[]] */
        typeFactory.constructType(((Type) wildcardTypeImpl), ((JavaType) null));
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructType(java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return _constructType(type, b);
 *  */
    @Test
    public void testConstructType_ThrowIndexOutOfBoundsException2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        sun.reflect.generics.tree.FieldTypeSignature[] upperBounds = {};
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "upperBounds", upperBounds);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructType] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        typeFactory.constructType(((Type) wildcardTypeImpl), ((JavaType) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method constructType(java.lang.reflect.Type, com.fasterxml.jackson.databind.JavaType)
    
    @Test
    public void testConstructType5() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromClass(TypeFactory.java:777)
            com.fasterxml.jackson.databind.type.TypeFactory._constructType(TypeFactory.java:387)
            com.fasterxml.jackson.databind.type.TypeFactory.constructType(TypeFactory.java:373) */
        typeFactory.constructType(((Type) class1), ((JavaType) null));
    }
    
    @Test
    public void testConstructType6() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromClass(TypeFactory.java:777)
            com.fasterxml.jackson.databind.type.TypeFactory._constructType(TypeFactory.java:387)
            com.fasterxml.jackson.databind.type.TypeFactory.constructType(TypeFactory.java:373) */
        typeFactory.constructType(((Type) class1), referenceType);
    }
    ///endregion
    
    ///region Errors report for constructType
    
    public void testConstructType_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructRawMapType
    
    ///region OTHER: ERROR SUITE for method constructRawMapType(java.lang.Class)
    
    @Test
    public void testConstructRawMapType1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructRawMapType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:78)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:39)
            com.fasterxml.jackson.databind.type.MapLikeType.<init>(MapLikeType.java:38)
            com.fasterxml.jackson.databind.type.MapType.<init>(MapType.java:20)
            com.fasterxml.jackson.databind.type.MapType.construct(MapType.java:25)
            com.fasterxml.jackson.databind.type.TypeFactory.constructRawMapType(TypeFactory.java:739) */
        typeFactory.constructRawMapType(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructParametrizedType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method constructParametrizedType(java.lang.Class, java.lang.Class, [Ljava.lang.Class;)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructParametrizedType(java.lang.Class,java.lang.Class,java.lang.Class[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#constructParametrizedType(java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return constructParametrizedType(parametrized, parametersFor, pt);
 *  */
    @Test
    public void testConstructParametrizedType_ThrowNullPointerException_1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        java.lang.Class[] classArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructParametrizedType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory.constructSimpleType(TypeFactory.java:543)
            com.fasterxml.jackson.databind.type.TypeFactory.constructParametrizedType(TypeFactory.java:677)
            com.fasterxml.jackson.databind.type.TypeFactory.constructParametrizedType(TypeFactory.java:612) */
        typeFactory.constructParametrizedType(class1, ((Class) null), classArray);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructParametrizedType(java.lang.Class,java.lang.Class,java.lang.Class[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int len = parameterClasses.length;
 *  */
    @Test
    public void testConstructParametrizedType_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructParametrizedType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory.constructParametrizedType(TypeFactory.java:607) */
        typeFactory.constructParametrizedType(((Class) null), ((Class) null), ((java.lang.Class[]) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method constructParametrizedType(java.lang.Class, java.lang.Class, [Ljava.lang.Class;)
    
    @Test
    public void testConstructParametrizedType1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        java.lang.Class[] classArray = {};
        
        SimpleType actual = ((SimpleType) typeFactory.constructParametrizedType(class1, class1, classArray));
        
        SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(expected, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParametersFor", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
        Class finalClass11 = class1;
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method constructParametrizedType(java.lang.Class, java.lang.Class, [Ljava.lang.Class;)
    
    @Test
    public void testConstructParametrizedType2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        java.lang.Class[] classArray = new java.lang.Class[1];
        Class class1 = Object.class;
        classArray[0] = class1;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructParametrizedType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromClass(TypeFactory.java:777)
            com.fasterxml.jackson.databind.type.TypeFactory.constructParametrizedType(TypeFactory.java:610) */
        typeFactory.constructParametrizedType(((Class) null), ((Class) null), classArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructParametrizedType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method constructParametrizedType(java.lang.Class, java.lang.Class, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructParametrizedType(java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.executesCondition {@code (parametrized.isArray()): False}
 * @utbot.executesCondition {@code (Map.class.isAssignableFrom(parametrized)): False}
 * @utbot.executesCondition {@code (Collection.class.isAssignableFrom(parametrized)): False}
 * @utbot.invokes {@link java.lang.Class#isArray()}
 * @utbot.invokes {@link java.lang.Class#isAssignableFrom(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#isAssignableFrom(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#constructSimpleType(java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.returnsFrom {@code return resultType;}
 *  */
    @Test
    public void testConstructParametrizedType_NotCollectionClassIsAssignableFrom() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = {};
        
        SimpleType actual = ((SimpleType) typeFactory.constructParametrizedType(class1, class1, javaTypeArray));
        
        SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(expected, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParametersFor", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
        Class finalClass11 = class1;
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method constructParametrizedType(java.lang.Class, java.lang.Class, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructParametrizedType(java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.executesCondition {@code (parametrized.isArray()): True}
 * @utbot.executesCondition {@code (parameterTypes.length != 1): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: parameterTypes.length != 1
 *  */
    @Test
    public void testConstructParametrizedType_ThrowNullPointerException_11() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = {null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructParametrizedType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory.constructSimpleType(TypeFactory.java:543)
            com.fasterxml.jackson.databind.type.TypeFactory.constructParametrizedType(TypeFactory.java:677) */
        typeFactory.constructParametrizedType(class1, ((Class) null), javaTypeArray);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructParametrizedType(java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.executesCondition {@code (parametrized.isArray()): False}
 * @utbot.executesCondition {@code (Map.class.isAssignableFrom(parametrized)): False}
 * @utbot.executesCondition {@code (Collection.class.isAssignableFrom(parametrized)): False}
 * @utbot.invokes {@link java.lang.Class#isAssignableFrom(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#isAssignableFrom(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#constructSimpleType(java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: resultType = constructSimpleType(parametrized, parametersFor, parameterTypes);
 *  */
    @Test
    public void testConstructParametrizedType_ThrowNullPointerException_2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructParametrizedType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory.constructSimpleType(TypeFactory.java:544)
            com.fasterxml.jackson.databind.type.TypeFactory.constructParametrizedType(TypeFactory.java:677) */
        typeFactory.constructParametrizedType(class1, class1, ((com.fasterxml.jackson.databind.JavaType[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructParametrizedType(java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: parametrized.isArray()
 *  */
    @Test
    public void testConstructParametrizedType_ThrowNullPointerException1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructParametrizedType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory.constructParametrizedType(TypeFactory.java:658) */
        typeFactory.constructParametrizedType(((Class) null), ((Class) null), ((com.fasterxml.jackson.databind.JavaType[]) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method constructParametrizedType(java.lang.Class, java.lang.Class, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructParametrizedType(java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.executesCondition {@code (parametrized.isArray()): False}
 * @utbot.executesCondition {@code (Map.class.isAssignableFrom(parametrized)): False}
 * @utbot.executesCondition {@code (Collection.class.isAssignableFrom(parametrized)): False}
 * @utbot.invokes {@link java.lang.Class#isArray()}
 * @utbot.invokes {@link java.lang.Class#isAssignableFrom(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#isAssignableFrom(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#constructSimpleType(java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: resultType = constructSimpleType(parametrized, parametersFor, parameterTypes);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructParametrizedType_ThrowIllegalArgumentException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = {null};
        
        typeFactory.constructParametrizedType(class1, class1, javaTypeArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory._resolveVariableViaSubTypes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _resolveVariableViaSubTypes(com.fasterxml.jackson.databind.type.HierarchicType, java.lang.String, com.fasterxml.jackson.databind.type.TypeBindings)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_resolveVariableViaSubTypes(com.fasterxml.jackson.databind.type.HierarchicType,java.lang.String,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.executesCondition {@code (leafType != null): True}
 * @utbot.executesCondition {@code (leafType.isGeneric()): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.HierarchicType#getRawClass()}
 * @utbot.invokes {@link java.lang.Class#getTypeParameters()}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = typeVariables.length; i < len; ++i)} once
 *  */
    @Test
    public void test_resolveVariableViaSubTypes_NotTypeNotInstanceOfTypeVariable() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        HierarchicType hierarchicType = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        Class _rawClass = Object.class;
        setField(hierarchicType, "com.fasterxml.jackson.databind.type.HierarchicType", "_rawClass", _rawClass);
        ParameterizedTypeImpl _genericType = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        java.lang.reflect.Type[] actualTypeArguments = new java.lang.reflect.Type[1];
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        actualTypeArguments[0] = ((Type) mapType);
        setField(_genericType, "sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl", "actualTypeArguments", actualTypeArguments);
        setField(hierarchicType, "com.fasterxml.jackson.databind.type.HierarchicType", "_genericType", _genericType);
        String string = " ";
        
        MapType actual = ((MapType) typeFactory._resolveVariableViaSubTypes(hierarchicType, string, null));
        
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_resolveVariableViaSubTypes(com.fasterxml.jackson.databind.type.HierarchicType,java.lang.String,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.executesCondition {@code (leafType != null): False}
 * @utbot.returnsFrom {@code return _unknownType();}
 *  */
    @Test
    public void test_resolveVariableViaSubTypes_LeafTypeEqualsNull() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        SimpleType actual = ((SimpleType) typeFactory._resolveVariableViaSubTypes(null, null, null));
        
        SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_resolveVariableViaSubTypes(com.fasterxml.jackson.databind.type.HierarchicType,java.lang.String,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.executesCondition {@code (leafType != null): True}
 * @utbot.executesCondition {@code (leafType.isGeneric()): False}
 * @utbot.returnsFrom {@code return _unknownType();}
 *  */
    @Test
    public void test_resolveVariableViaSubTypes_NotLeafTypeIsGeneric() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        HierarchicType hierarchicType = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        
        SimpleType actual = ((SimpleType) typeFactory._resolveVariableViaSubTypes(hierarchicType, null, null));
        
        SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _resolveVariableViaSubTypes(com.fasterxml.jackson.databind.type.HierarchicType, java.lang.String, com.fasterxml.jackson.databind.type.TypeBindings)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_resolveVariableViaSubTypes(com.fasterxml.jackson.databind.type.HierarchicType,java.lang.String,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.executesCondition {@code (leafType != null): True}
 * @utbot.executesCondition {@code (leafType.isGeneric()): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.HierarchicType#isGeneric()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.HierarchicType#getRawClass()}
 * @utbot.invokes {@link java.lang.Class#getTypeParameters()}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = typeVariables.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: Type type = leafType.asGeneric().getActualTypeArguments()[i];
 *  */
    @Test
    public void test_resolveVariableViaSubTypes_ThrowIndexOutOfBoundsException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        HierarchicType hierarchicType = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        Class _rawClass = Object.class;
        setField(hierarchicType, "com.fasterxml.jackson.databind.type.HierarchicType", "_rawClass", _rawClass);
        ParameterizedTypeImpl _genericType = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        java.lang.reflect.Type[] actualTypeArguments = {};
        setField(_genericType, "sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl", "actualTypeArguments", actualTypeArguments);
        setField(hierarchicType, "com.fasterxml.jackson.databind.type.HierarchicType", "_genericType", _genericType);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._resolveVariableViaSubTypes] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        typeFactory._resolveVariableViaSubTypes(hierarchicType, string, null);
    }
    ///endregion
    
    ///region Errors report for _resolveVariableViaSubTypes
    
    public void test_resolveVariableViaSubTypes_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        // Concrete execution failed
        
        // 5 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory._arrayListSuperInterfaceChain
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _arrayListSuperInterfaceChain(com.fasterxml.jackson.databind.type.HierarchicType)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_arrayListSuperInterfaceChain(com.fasterxml.jackson.databind.type.HierarchicType)}
 * @utbot.executesCondition {@code (_cachedArrayListType == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.HierarchicType#deepCloneWithoutSubtype()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: HierarchicType base = current.deepCloneWithoutSubtype();
 *  */
    @Test
    public void test_arrayListSuperInterfaceChain_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._arrayListSuperInterfaceChain] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._arrayListSuperInterfaceChain(TypeFactory.java:1182) */
        typeFactory._arrayListSuperInterfaceChain(null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_arrayListSuperInterfaceChain(com.fasterxml.jackson.databind.type.HierarchicType)}
 * @utbot.executesCondition {@code (_cachedArrayListType == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.HierarchicType#deepCloneWithoutSubtype()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.HierarchicType#setSuperType(com.fasterxml.jackson.databind.type.HierarchicType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: current.setSuperType(t);
 *  */
    @Test
    public void test_arrayListSuperInterfaceChain_ThrowNullPointerException_1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        HierarchicType _cachedArrayListType = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        typeFactory._cachedArrayListType = _cachedArrayListType;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._arrayListSuperInterfaceChain] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._arrayListSuperInterfaceChain(TypeFactory.java:1187) */
        typeFactory._arrayListSuperInterfaceChain(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _arrayListSuperInterfaceChain(com.fasterxml.jackson.databind.type.HierarchicType)
    
    @Test
    public void test_arrayListSuperInterfaceChain1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        HierarchicType hierarchicType = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        Class _rawClass = Object.class;
        setField(hierarchicType, "com.fasterxml.jackson.databind.type.HierarchicType", "_rawClass", _rawClass);
        HierarchicType _superType = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        hierarchicType._superType = _superType;
        
        HierarchicType initialTypeFactory_cachedArrayListType = typeFactory._cachedArrayListType;
        
        Class initialHierarchicType_rawClass = hierarchicType._rawClass;
        HierarchicType initialHierarchicType_superType = hierarchicType._superType;
        
        HierarchicType actual = typeFactory._arrayListSuperInterfaceChain(hierarchicType);
        
        Type actual_actualType = actual._actualType;
        assertNull(actual_actualType);
        
        Class hierarchicType_rawClass = hierarchicType._rawClass;
        Class actual_rawClass = actual._rawClass;
        assertEquals(Class.class, actual_rawClass.getClass());
        
        ParameterizedType actual_genericType = actual._genericType;
        assertNull(actual_genericType);
        
        HierarchicType hierarchicType_superType = hierarchicType._superType;
        HierarchicType actual_superType = actual._superType;
        assertTrue(deepEquals(hierarchicType_superType, actual_superType));
        Class actual_superType_rawClass = actual_superType._rawClass;
        assertNull(actual_superType_rawClass);
        
        assertTrue(deepEquals(hierarchicType_superType, actual_superType));
        HierarchicType actual_superType_superType = actual_superType._superType;
        assertNull(actual_superType_superType);
        
        HierarchicType hierarchicType_superType_subType = hierarchicType_superType._subType;
        HierarchicType actual_superType_subType = actual_superType._subType;
        assertTrue(deepEquals(hierarchicType_superType_subType, actual_superType_subType));
        assertTrue(deepEquals(hierarchicType_superType_subType, actual_superType_subType));
        assertTrue(deepEquals(hierarchicType_superType_subType, actual_superType_subType));
        assertTrue(deepEquals(hierarchicType_superType_subType, actual_superType_subType));
        HierarchicType actual_superType_subType_subType = actual_superType_subType._subType;
        assertNull(actual_superType_subType_subType);
        
        assertTrue(deepEquals(hierarchicType, actual));
        
        HierarchicType finalTypeFactory_cachedArrayListType = typeFactory._cachedArrayListType;
        
        Class finalHierarchicType_rawClass = hierarchicType._rawClass;
        HierarchicType finalHierarchicType_superType = hierarchicType._superType;
        
        assertFalse(initialTypeFactory_cachedArrayListType == finalTypeFactory_cachedArrayListType);
        
        assertFalse(initialHierarchicType_rawClass == finalHierarchicType_rawClass);
        
        assertFalse(initialHierarchicType_superType == finalHierarchicType_superType);
    }
    
    @Test
    public void test_arrayListSuperInterfaceChain2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        HierarchicType _cachedArrayListType = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        HierarchicType _superType = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        HierarchicType _superType1 = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        HierarchicType _superType2 = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        _superType1._superType = _superType2;
        _superType._superType = _superType1;
        _cachedArrayListType._superType = _superType;
        typeFactory._cachedArrayListType = _cachedArrayListType;
        HierarchicType hierarchicType = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        
        HierarchicType actual = typeFactory._arrayListSuperInterfaceChain(hierarchicType);
        
        Type actual_actualType = actual._actualType;
        assertNull(actual_actualType);
        
        Class actual_rawClass = actual._rawClass;
        assertNull(actual_rawClass);
        
        ParameterizedType actual_genericType = actual._genericType;
        assertNull(actual_genericType);
        
        HierarchicType hierarchicType_superType = hierarchicType._superType;
        HierarchicType actual_superType = actual._superType;
        assertTrue(deepEquals(hierarchicType_superType, actual_superType));
        assertTrue(deepEquals(hierarchicType_superType, actual_superType));
        assertTrue(deepEquals(hierarchicType_superType, actual_superType));
        HierarchicType hierarchicType_superType_superType = hierarchicType_superType._superType;
        HierarchicType actual_superType_superType = actual_superType._superType;
        assertTrue(deepEquals(hierarchicType_superType_superType, actual_superType_superType));
        assertTrue(deepEquals(hierarchicType_superType_superType, actual_superType_superType));
        assertTrue(deepEquals(hierarchicType_superType_superType, actual_superType_superType));
        HierarchicType hierarchicType_superType_superType_superType = hierarchicType_superType_superType._superType;
        HierarchicType actual_superType_superType_superType = actual_superType_superType._superType;
        assertTrue(deepEquals(hierarchicType_superType_superType_superType, actual_superType_superType_superType));
        assertTrue(deepEquals(hierarchicType_superType_superType_superType, actual_superType_superType_superType));
        assertTrue(deepEquals(hierarchicType_superType_superType_superType, actual_superType_superType_superType));
        HierarchicType hierarchicType_superType_superType_superType_superType = hierarchicType_superType_superType_superType._superType;
        HierarchicType actual_superType_superType_superType_superType = actual_superType_superType_superType._superType;
        assertTrue(deepEquals(hierarchicType_superType_superType_superType_superType, actual_superType_superType_superType_superType));
        assertTrue(deepEquals(hierarchicType_superType_superType_superType_superType, actual_superType_superType_superType_superType));
        assertTrue(deepEquals(hierarchicType_superType_superType_superType_superType, actual_superType_superType_superType_superType));
        HierarchicType actual_superType_superType_superType_superType_superType = actual_superType_superType_superType_superType._superType;
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actual_superType_superType_superType_superType_superType, actual_superType_superType_superType_superType_superType));
        
        HierarchicType hierarchicType_superType_superType_superType_superType_subType = hierarchicType_superType_superType_superType_superType._subType;
        HierarchicType actual_superType_superType_superType_superType_subType = actual_superType_superType_superType_superType._subType;
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(hierarchicType_superType_superType_superType_superType_subType, actual_superType_superType_superType_superType_subType));
        
        HierarchicType hierarchicType_superType_superType_superType_subType = hierarchicType_superType_superType_superType._subType;
        HierarchicType actual_superType_superType_superType_subType = actual_superType_superType_superType._subType;
        assertTrue(deepEquals(hierarchicType_superType_superType_superType_subType, actual_superType_superType_superType_subType));
        assertTrue(deepEquals(hierarchicType_superType_superType_superType_subType, actual_superType_superType_superType_subType));
        assertTrue(deepEquals(hierarchicType_superType_superType_superType_subType, actual_superType_superType_superType_subType));
        assertTrue(deepEquals(hierarchicType_superType_superType_superType_subType, actual_superType_superType_superType_subType));
        HierarchicType hierarchicType_superType_superType_superType_subType_subType = hierarchicType_superType_superType_superType_subType._subType;
        HierarchicType actual_superType_superType_superType_subType_subType = actual_superType_superType_superType_subType._subType;
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(hierarchicType_superType_superType_superType_subType_subType, actual_superType_superType_superType_subType_subType));
        
        assertTrue(deepEquals(hierarchicType_superType_superType, actual_superType_superType));
        
        HierarchicType hierarchicType_superType_subType = hierarchicType_superType._subType;
        HierarchicType actual_superType_subType = actual_superType._subType;
        assertTrue(deepEquals(hierarchicType_superType_subType, actual_superType_subType));
        assertTrue(deepEquals(hierarchicType_superType_subType, actual_superType_subType));
        assertTrue(deepEquals(hierarchicType_superType_subType, actual_superType_subType));
        assertTrue(deepEquals(hierarchicType_superType_subType, actual_superType_subType));
        HierarchicType actual_superType_subType_subType = actual_superType_subType._subType;
        assertNull(actual_superType_subType_subType);
        
        assertTrue(deepEquals(hierarchicType, actual));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _arrayListSuperInterfaceChain(com.fasterxml.jackson.databind.type.HierarchicType)
    
    @Test(expected = StackOverflowError.class)
    public void test_arrayListSuperInterfaceChain3() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        HierarchicType _cachedArrayListType = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        _cachedArrayListType._superType = _cachedArrayListType;
        typeFactory._cachedArrayListType = _cachedArrayListType;
        
        typeFactory._arrayListSuperInterfaceChain(null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_arrayListSuperInterfaceChain4() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        HierarchicType hierarchicType = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        HierarchicType _superType = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        _superType._superType = _superType;
        hierarchicType._superType = _superType;
        
        typeFactory._arrayListSuperInterfaceChain(hierarchicType);
    }
    
    @Test
    public void test_arrayListSuperInterfaceChain5() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        HierarchicType hierarchicType = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        Class _actualType = Object.class;
        setField(hierarchicType, "com.fasterxml.jackson.databind.type.HierarchicType", "_actualType", _actualType);
        setField(hierarchicType, "com.fasterxml.jackson.databind.type.HierarchicType", "_rawClass", _actualType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._arrayListSuperInterfaceChain] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._arrayListSuperInterfaceChain(TypeFactory.java:1186) */
        typeFactory._arrayListSuperInterfaceChain(hierarchicType);
    }
    
    @Test
    public void test_arrayListSuperInterfaceChain6() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        HierarchicType _cachedArrayListType = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        HierarchicType _superType = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        _cachedArrayListType._superType = _superType;
        typeFactory._cachedArrayListType = _cachedArrayListType;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._arrayListSuperInterfaceChain] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._arrayListSuperInterfaceChain(TypeFactory.java:1187) */
        typeFactory._arrayListSuperInterfaceChain(null);
    }
    
    @Test
    public void test_arrayListSuperInterfaceChain7() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        HierarchicType hierarchicType = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        HierarchicType _superType = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        HierarchicType _superType1 = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        HierarchicType _superType2 = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        _superType1._superType = _superType2;
        _superType._superType = _superType1;
        hierarchicType._superType = _superType;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._arrayListSuperInterfaceChain] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._doFindSuperInterfaceChain(TypeFactory.java:1140)
            com.fasterxml.jackson.databind.type.TypeFactory._arrayListSuperInterfaceChain(TypeFactory.java:1183) */
        typeFactory._arrayListSuperInterfaceChain(hierarchicType);
    }
    ///endregion
    
    ///region Errors report for _arrayListSuperInterfaceChain
    
    public void test_arrayListSuperInterfaceChain_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.visitor.Reifier.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.visitor" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory._fromParameterizedClass
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _fromParameterizedClass(java.lang.Class, java.util.List)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromParameterizedClass(java.lang.Class,java.util.List)}
 * @utbot.executesCondition {@code (clz.isArray()): False}
 * @utbot.executesCondition {@code (clz.isEnum()): False}
 * @utbot.executesCondition {@code (Map.class.isAssignableFrom(clz)): True}
 * @utbot.invokes {@link java.lang.Class#isEnum()}
 * @utbot.invokes {@link java.lang.Class#isAssignableFrom(java.lang.Class)}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: paramTypes.size() > 0
 *  */
    @Test
    public void test_fromParameterizedClass_ThrowNullPointerException_1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._fromParameterizedClass] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromParameterizedClass(TypeFactory.java:860) */
        typeFactory._fromParameterizedClass(class1, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromParameterizedClass(java.lang.Class,java.util.List)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: clz.isArray()
 *  */
    @Test
    public void test_fromParameterizedClass_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._fromParameterizedClass] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromParameterizedClass(TypeFactory.java:837) */
        typeFactory._fromParameterizedClass(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _fromParameterizedClass(java.lang.Class, java.util.List)
    
    @Test
    public void test_fromParameterizedClass1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        ArrayList arrayList = new ArrayList();
        
        SimpleType actual = ((SimpleType) typeFactory._fromParameterizedClass(class1, arrayList));
        
        SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _fromParameterizedClass(java.lang.Class, java.util.List)
    
    @Test(expected = IllegalArgumentException.class)
    public void test_fromParameterizedClass2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        typeFactory._fromParameterizedClass(class1, arrayList);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructMapLikeType
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method constructMapLikeType(java.lang.Class, java.lang.Class, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructMapLikeType(java.lang.Class,java.lang.Class,java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#constructType(java.lang.reflect.Type)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return MapType.construct(mapClass, constructType(keyClass), constructType(valueClass));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructMapLikeType_ThrowIllegalArgumentException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        typeFactory.constructMapLikeType(((Class) null), ((Class) null), ((Class) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method constructMapLikeType(java.lang.Class, java.lang.Class, java.lang.Class)
    
    @Test
    public void testConstructMapLikeType1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructMapLikeType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromClass(TypeFactory.java:777)
            com.fasterxml.jackson.databind.type.TypeFactory._constructType(TypeFactory.java:387)
            com.fasterxml.jackson.databind.type.TypeFactory.constructType(TypeFactory.java:355)
            com.fasterxml.jackson.databind.type.TypeFactory.constructMapLikeType(TypeFactory.java:523) */
        typeFactory.constructMapLikeType(((Class) null), class1, ((Class) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructMapLikeType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method constructMapLikeType(java.lang.Class, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructMapLikeType(java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.MapLikeType#construct(java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return MapLikeType.construct(mapClass, keyType, valueType);}
 *  */
    @Test
    public void testConstructMapLikeType_MapLikeTypeConstruct() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(arrayType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
        
        MapLikeType actual = typeFactory.constructMapLikeType(class1, arrayType, arrayType);
        
        MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", arrayType);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", arrayType);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructParametricType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method constructParametricType(java.lang.Class, [Ljava.lang.Class;)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructParametricType(java.lang.Class,java.lang.Class[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#constructParametrizedType(java.lang.Class,java.lang.Class,java.lang.Class[])}
 *  */
    @Test
    public void testConstructParametricType_TypeFactoryConstructParametrizedType() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        java.lang.Class[] classArray = {};
        
        SimpleType actual = ((SimpleType) typeFactory.constructParametricType(class1, classArray));
        
        SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(expected, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParametersFor", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method constructParametricType(java.lang.Class, [Ljava.lang.Class;)
    
    @Test
    public void testConstructParametricType1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        java.lang.Class[] classArray = new java.lang.Class[1];
        Class class1 = Object.class;
        classArray[0] = class1;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructParametricType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromClass(TypeFactory.java:777)
            com.fasterxml.jackson.databind.type.TypeFactory.constructParametrizedType(TypeFactory.java:610)
            com.fasterxml.jackson.databind.type.TypeFactory.constructParametricType(TypeFactory.java:620) */
        typeFactory.constructParametricType(((Class) null), classArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructParametricType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method constructParametricType(java.lang.Class, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructParametricType(java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#constructParametrizedType(java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.returnsFrom {@code return constructParametrizedType(parametrized, parametrized, parameterTypes);}
 *  */
    @Test
    public void testConstructParametricType_TypeFactoryConstructParametrizedType1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = {};
        
        SimpleType actual = ((SimpleType) typeFactory.constructParametricType(class1, javaTypeArray));
        
        SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(expected, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParametersFor", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method constructParametricType(java.lang.Class, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructParametricType(java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#constructParametrizedType(java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return constructParametrizedType(parametrized, parametrized, parameterTypes);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructParametricType_ThrowIllegalArgumentException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = {null};
        
        typeFactory.constructParametricType(class1, javaTypeArray);
    }
    ///endregion
    
    ///region Errors report for constructParametricType
    
    public void testConstructParametricType_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.parser.SignatureParser.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.parser" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory._findSuperClassChain
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _findSuperClassChain(java.lang.reflect.Type, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_findSuperClassChain(java.lang.reflect.Type,java.lang.Class)}
 * @utbot.executesCondition {@code (raw == target): False}
 * @utbot.executesCondition {@code (parent != null): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_findSuperClassChain_ParentEqualsNull() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        HierarchicType actual = typeFactory._findSuperClassChain(class1, null);
        
        assertNull(actual);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_findSuperClassChain(java.lang.reflect.Type,java.lang.Class)}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#_findSuperClassChain(java.lang.reflect.Type,java.lang.Class)}
 * @utbot.triggersRecursion _findSuperClassChain, where the test execute conditions:
 *     {@code (parent != null): False}
 * return from: {@code return null;}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_findSuperClassChain_ParentNotEqualsNull() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        Class rawType = Object.class;
        setField(parameterizedTypeImpl, "sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl", "rawType", rawType);
        
        HierarchicType actual = typeFactory._findSuperClassChain(parameterizedTypeImpl, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_findSuperClassChain(java.lang.reflect.Type,java.lang.Class)}
 * @utbot.executesCondition {@code (raw == target): True}
 *  */
    @Test
    public void test_findSuperClassChain_RawEqualsTarget() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        HierarchicType actual = typeFactory._findSuperClassChain(class1, class1);
        
        HierarchicType expected = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        setField(expected, "com.fasterxml.jackson.databind.type.HierarchicType", "_actualType", class1);
        setField(expected, "com.fasterxml.jackson.databind.type.HierarchicType", "_rawClass", class1);
        
        Type expected_actualType = expected._actualType;
        Type actual_actualType = actual._actualType;
        assertEquals(Type.class, actual_actualType.getClass());
        
        Class expected_rawClass = expected._rawClass;
        Class actual_rawClass = actual._rawClass;
        assertEquals(Class.class, actual_rawClass.getClass());
        
        ParameterizedType actual_genericType = actual._genericType;
        assertNull(actual_genericType);
        
        HierarchicType actual_superType = actual._superType;
        assertNull(actual_superType);
        
        HierarchicType actual_subType = actual._subType;
        assertNull(actual_subType);
        
        Class finalClass1 = class1;
        
        Class finalClass11 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_findSuperClassChain(java.lang.reflect.Type,java.lang.Class)}
 * @utbot.executesCondition {@code (raw == target): True}
 *  */
    @Test
    public void test_findSuperClassChain_RawEqualsTarget_1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        
        HierarchicType actual = typeFactory._findSuperClassChain(parameterizedTypeImpl, null);
        
        HierarchicType expected = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        setField(expected, "com.fasterxml.jackson.databind.type.HierarchicType", "_actualType", parameterizedTypeImpl);
        setField(expected, "com.fasterxml.jackson.databind.type.HierarchicType", "_genericType", parameterizedTypeImpl);
        
        Type expected_actualType = expected._actualType;
        Type actual_actualType = actual._actualType;
        Class actual_actualTypeRawType = (((ParameterizedTypeImpl) actual_actualType)).getRawType();
        assertNull(actual_actualTypeRawType);
        
        Class actual_rawClass = actual._rawClass;
        assertNull(actual_rawClass);
        
        ParameterizedType expected_genericType = expected._genericType;
        ParameterizedType actual_genericType = actual._genericType;
        assertTrue(deepEquals(expected_genericType, actual_genericType));
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _findSuperClassChain(java.lang.reflect.Type, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_findSuperClassChain(java.lang.reflect.Type,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: HierarchicType current = new HierarchicType(currentType);
 *  */
    @Test
    public void test_findSuperClassChain_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._findSuperClassChain] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.HierarchicType.<init>(HierarchicType.java:38)
            com.fasterxml.jackson.databind.type.TypeFactory._findSuperClassChain(TypeFactory.java:1095) */
        typeFactory._findSuperClassChain(null, null);
    }
    ///endregion
    
    ///region Errors report for _findSuperClassChain
    
    public void test_findSuperClassChain_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.parser.SignatureParser.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.parser" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.visitor.Reifier.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.visitor" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructRawCollectionLikeType
    
    ///region OTHER: ERROR SUITE for method constructRawCollectionLikeType(java.lang.Class)
    
    @Test
    public void testConstructRawCollectionLikeType1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructRawCollectionLikeType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:78)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:39)
            com.fasterxml.jackson.databind.type.CollectionLikeType.<init>(CollectionLikeType.java:32)
            com.fasterxml.jackson.databind.type.CollectionLikeType.construct(CollectionLikeType.java:67)
            com.fasterxml.jackson.databind.type.TypeFactory.constructRawCollectionLikeType(TypeFactory.java:724) */
        typeFactory.constructRawCollectionLikeType(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory._findSuperInterfaceChain
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _findSuperInterfaceChain(java.lang.reflect.Type, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_findSuperInterfaceChain(java.lang.reflect.Type,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: HierarchicType current = new HierarchicType(currentType);
 *  */
    @Test
    public void test_findSuperInterfaceChain_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._findSuperInterfaceChain] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.HierarchicType.<init>(HierarchicType.java:38)
            com.fasterxml.jackson.databind.type.TypeFactory._findSuperInterfaceChain(TypeFactory.java:1115) */
        typeFactory._findSuperInterfaceChain(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _findSuperInterfaceChain(java.lang.reflect.Type, java.lang.Class)
    
    @Test
    public void test_findSuperInterfaceChain1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        HierarchicType actual = typeFactory._findSuperInterfaceChain(class1, null);
        
        assertNull(actual);
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void test_findSuperInterfaceChain2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        HierarchicType actual = typeFactory._findSuperInterfaceChain(class1, class1);
        
        HierarchicType expected = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        setField(expected, "com.fasterxml.jackson.databind.type.HierarchicType", "_actualType", class1);
        setField(expected, "com.fasterxml.jackson.databind.type.HierarchicType", "_rawClass", class1);
        
        Type expected_actualType = expected._actualType;
        Type actual_actualType = actual._actualType;
        assertEquals(Type.class, actual_actualType.getClass());
        
        Class expected_rawClass = expected._rawClass;
        Class actual_rawClass = actual._rawClass;
        assertEquals(Class.class, actual_rawClass.getClass());
        
        ParameterizedType actual_genericType = actual._genericType;
        assertNull(actual_genericType);
        
        HierarchicType actual_superType = actual._superType;
        assertNull(actual_superType);
        
        HierarchicType actual_subType = actual._subType;
        assertNull(actual_subType);
        
        Class finalClass1 = class1;
        
        Class finalClass11 = class1;
        
    }
    ///endregion
    
    ///region Errors report for _findSuperInterfaceChain
    
    public void test_findSuperInterfaceChain_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory._findSuperTypeChain
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _findSuperTypeChain(java.lang.Class, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_findSuperTypeChain(java.lang.Class,java.lang.Class)}
 * @utbot.executesCondition {@code (supertype.isInterface()): False}
 * @utbot.invokes {@link java.lang.Class#isInterface()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#_findSuperClassChain(java.lang.reflect.Type,java.lang.Class)}
 * @utbot.returnsFrom {@code return _findSuperClassChain(subtype, supertype);}
 *  */
    @Test
    public void test_findSuperTypeChain_NotSupertypeIsInterface() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        HierarchicType actual = typeFactory._findSuperTypeChain(class1, class1);
        
        HierarchicType expected = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        setField(expected, "com.fasterxml.jackson.databind.type.HierarchicType", "_actualType", class1);
        setField(expected, "com.fasterxml.jackson.databind.type.HierarchicType", "_rawClass", class1);
        
        Type expected_actualType = expected._actualType;
        Type actual_actualType = actual._actualType;
        assertEquals(Type.class, actual_actualType.getClass());
        
        Class expected_rawClass = expected._rawClass;
        Class actual_rawClass = actual._rawClass;
        assertEquals(Class.class, actual_rawClass.getClass());
        
        ParameterizedType actual_genericType = actual._genericType;
        assertNull(actual_genericType);
        
        HierarchicType actual_superType = actual._superType;
        assertNull(actual_superType);
        
        HierarchicType actual_subType = actual._subType;
        assertNull(actual_subType);
        
        Class finalClass1 = class1;
        
        Class finalClass11 = class1;
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _findSuperTypeChain(java.lang.Class, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_findSuperTypeChain(java.lang.Class,java.lang.Class)}
 * @utbot.executesCondition {@code (supertype.isInterface()): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#_findSuperClassChain(java.lang.reflect.Type,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _findSuperClassChain(subtype, supertype);
 *  */
    @Test
    public void test_findSuperTypeChain_ThrowNullPointerException_1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._findSuperTypeChain] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.HierarchicType.<init>(HierarchicType.java:38)
            com.fasterxml.jackson.databind.type.TypeFactory._findSuperClassChain(TypeFactory.java:1095)
            com.fasterxml.jackson.databind.type.TypeFactory._findSuperTypeChain(TypeFactory.java:1090) */
        typeFactory._findSuperTypeChain(null, class1);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_findSuperTypeChain(java.lang.Class,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: supertype.isInterface()
 *  */
    @Test
    public void test_findSuperTypeChain_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._findSuperTypeChain] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._findSuperTypeChain(TypeFactory.java:1087) */
        typeFactory._findSuperTypeChain(null, null);
    }
    ///endregion
    
    ///region Errors report for _findSuperTypeChain
    
    public void test_findSuperTypeChain_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructRawCollectionType
    
    ///region OTHER: ERROR SUITE for method constructRawCollectionType(java.lang.Class)
    
    @Test
    public void testConstructRawCollectionType1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructRawCollectionType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:78)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:39)
            com.fasterxml.jackson.databind.type.CollectionLikeType.<init>(CollectionLikeType.java:32)
            com.fasterxml.jackson.databind.type.CollectionType.<init>(CollectionType.java:22)
            com.fasterxml.jackson.databind.type.CollectionType.construct(CollectionType.java:55)
            com.fasterxml.jackson.databind.type.TypeFactory.constructRawCollectionType(TypeFactory.java:709) */
        typeFactory.constructRawCollectionType(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructReferenceType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method constructReferenceType(java.lang.Class, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructReferenceType(java.lang.Class,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return new ReferenceType(rawType, refType, null, null, false);}
 *  */
    @Test
    public void testConstructReferenceType_Return() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(arrayType, "com.fasterxml.jackson.databind.JavaType", "_hash", -250);
        
        ReferenceType actual = ((ReferenceType) typeFactory.constructReferenceType(class1, arrayType));
        
        ReferenceType expected = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(expected, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", arrayType);
        setField(expected, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParametersFor", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876761);
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructFromCanonical
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method constructFromCanonical(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructFromCanonical(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeParser#parse(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _parser.parse(canonical);
 *  */
    @Test
    public void testConstructFromCanonical_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructFromCanonical] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory.constructFromCanonical(TypeFactory.java:237) */
        typeFactory.constructFromCanonical(null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method constructFromCanonical(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructFromCanonical1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeParser _parser = ((TypeParser) createInstance("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_parser", _parser);
        String string = "\u0001\u0001\u0001!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001\u0001";
        
        typeFactory.constructFromCanonical(string);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructFromCanonical2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeParser _parser = ((TypeParser) createInstance("com.fasterxml.jackson.databind.type.TypeParser"));
        setField(typeFactory, "com.fasterxml.jackson.databind.type.TypeFactory", "_parser", _parser);
        String string = "\u0001\u0001\u0001\u0001";
        
        typeFactory.constructFromCanonical(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory._doFindSuperInterfaceChain
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _doFindSuperInterfaceChain(com.fasterxml.jackson.databind.type.HierarchicType, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_doFindSuperInterfaceChain(com.fasterxml.jackson.databind.type.HierarchicType,java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.HierarchicType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<?> raw = current.getRawClass();
 *  */
    @Test
    public void test_doFindSuperInterfaceChain_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._doFindSuperInterfaceChain] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._doFindSuperInterfaceChain(TypeFactory.java:1139) */
        typeFactory._doFindSuperInterfaceChain(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_doFindSuperInterfaceChain(com.fasterxml.jackson.databind.type.HierarchicType,java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.HierarchicType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Type[] parents = raw.getGenericInterfaces();
 *  */
    @Test
    public void test_doFindSuperInterfaceChain_ThrowNullPointerException_1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        HierarchicType hierarchicType = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._doFindSuperInterfaceChain] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._doFindSuperInterfaceChain(TypeFactory.java:1140) */
        typeFactory._doFindSuperInterfaceChain(hierarchicType, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _doFindSuperInterfaceChain(com.fasterxml.jackson.databind.type.HierarchicType, java.lang.Class)
    
    @Test
    public void test_doFindSuperInterfaceChain1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        HierarchicType hierarchicType = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        Class _rawClass = Object.class;
        setField(hierarchicType, "com.fasterxml.jackson.databind.type.HierarchicType", "_rawClass", _rawClass);
        
        Class initialHierarchicType_rawClass = hierarchicType._rawClass;
        
        HierarchicType actual = typeFactory._doFindSuperInterfaceChain(hierarchicType, _rawClass);
        
        assertNull(actual);
        
        Class finalHierarchicType_rawClass = hierarchicType._rawClass;
        
        Class final_rawClass = _rawClass;
        
        assertFalse(initialHierarchicType_rawClass == finalHierarchicType_rawClass);
        
    }
    ///endregion
    
    ///region Errors report for _doFindSuperInterfaceChain
    
    public void test_doFindSuperInterfaceChain_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.visitor.Reifier.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.visitor" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructRawMapLikeType
    
    ///region OTHER: ERROR SUITE for method constructRawMapLikeType(java.lang.Class)
    
    @Test
    public void testConstructRawMapLikeType1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructRawMapLikeType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:78)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:39)
            com.fasterxml.jackson.databind.type.MapLikeType.<init>(MapLikeType.java:38)
            com.fasterxml.jackson.databind.type.MapLikeType.construct(MapLikeType.java:46)
            com.fasterxml.jackson.databind.type.TypeFactory.constructRawMapLikeType(TypeFactory.java:754) */
        typeFactory.constructRawMapLikeType(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.uncheckedSimpleType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method uncheckedSimpleType(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#uncheckedSimpleType(java.lang.Class)}
 * @utbot.returnsFrom {@code return new SimpleType(cls);}
 *  */
    @Test
    public void testUncheckedSimpleType_Return() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        SimpleType actual = ((SimpleType) typeFactory.uncheckedSimpleType(class1));
        
        SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructCollectionLikeType
    
    ///region OTHER: ERROR SUITE for method constructCollectionLikeType(java.lang.Class, java.lang.Class)
    
    @Test
    public void testConstructCollectionLikeType1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructCollectionLikeType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromClass(TypeFactory.java:777)
            com.fasterxml.jackson.databind.type.TypeFactory._constructType(TypeFactory.java:387)
            com.fasterxml.jackson.databind.type.TypeFactory.constructType(TypeFactory.java:355)
            com.fasterxml.jackson.databind.type.TypeFactory.constructCollectionLikeType(TypeFactory.java:473) */
        typeFactory.constructCollectionLikeType(((Class) null), class1);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method constructCollectionLikeType(java.lang.Class, java.lang.Class)
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructCollectionLikeType2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        typeFactory.constructCollectionLikeType(((Class) null), ((Class) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructCollectionLikeType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method constructCollectionLikeType(java.lang.Class, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructCollectionLikeType(java.lang.Class,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.CollectionLikeType#construct(java.lang.Class,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return CollectionLikeType.construct(collectionClass, elementType);}
 *  */
    @Test
    public void testConstructCollectionLikeType_CollectionLikeTypeConstruct() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(arrayType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
        
        CollectionLikeType actual = typeFactory.constructCollectionLikeType(class1, arrayType);
        
        CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", arrayType);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876755);
        
        // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructSpecializedType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method constructSpecializedType(com.fasterxml.jackson.databind.JavaType, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructSpecializedType(com.fasterxml.jackson.databind.JavaType,java.lang.Class)}
 * @utbot.executesCondition {@code (baseType.getRawClass() == subclass): False}
 * @utbot.executesCondition {@code (baseType instanceof SimpleType): True}
 * @utbot.executesCondition {@code (subclass.isArray() || Map.class.isAssignableFrom(subclass)): True}
 * @utbot.executesCondition {@code (Map.class.isAssignableFrom(subclass)): True}
 * @utbot.executesCondition {@code (Collection.class.isAssignableFrom(subclass)): True}
 * @utbot.executesCondition {@code (!baseType.getRawClass().isAssignableFrom(subclass)): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.invokes {@link java.lang.Class#isArray()}
 * @utbot.invokes {@link java.lang.Class#isAssignableFrom(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#isAssignableFrom(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 *  */
    @Test
    public void testConstructSpecializedType_NotBaseTypeGetRawClassIsAssignableFrom() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        SimpleType actual = ((SimpleType) typeFactory.constructSpecializedType(simpleType, _class));
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(simpleType, actual);
        
        Class finalSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        Class final_class = _class;
        
        assertFalse(initialSimpleType_class == finalSimpleType_class);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method constructSpecializedType(com.fasterxml.jackson.databind.JavaType, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructSpecializedType(com.fasterxml.jackson.databind.JavaType,java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: baseType.getRawClass() == subclass
 *  */
    @Test
    public void testConstructSpecializedType_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructSpecializedType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory.constructSpecializedType(TypeFactory.java:194) */
        typeFactory.constructSpecializedType(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructSpecializedType(com.fasterxml.jackson.databind.JavaType,java.lang.Class)}
 * @utbot.executesCondition {@code (baseType.getRawClass() == subclass): False}
 * @utbot.executesCondition {@code (baseType instanceof SimpleType): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: subclass.isArray() || Map.class.isAssignableFrom(subclass) || Collection.class.isAssignableFrom(subclass)
 *  */
    @Test
    public void testConstructSpecializedType_ThrowNullPointerException_1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructSpecializedType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory.constructSpecializedType(TypeFactory.java:200) */
        typeFactory.constructSpecializedType(referenceType, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructSpecializedType(com.fasterxml.jackson.databind.JavaType,java.lang.Class)}
 * @utbot.executesCondition {@code (baseType.getRawClass() == subclass): False}
 * @utbot.executesCondition {@code (baseType instanceof SimpleType): True}
 * @utbot.executesCondition {@code (subclass.isArray() || Map.class.isAssignableFrom(subclass)): True}
 * @utbot.executesCondition {@code (Map.class.isAssignableFrom(subclass)): True}
 * @utbot.executesCondition {@code (Collection.class.isAssignableFrom(subclass)): True}
 * @utbot.invokes {@link java.lang.Class#isAssignableFrom(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#isAssignableFrom(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !baseType.getRawClass().isAssignableFrom(subclass)
 *  */
    @Test
    public void testConstructSpecializedType_ThrowNullPointerException_2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructSpecializedType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType._assertSubclass(JavaType.java:464)
            com.fasterxml.jackson.databind.JavaType.narrowBy(JavaType.java:149)
            com.fasterxml.jackson.databind.type.TypeFactory.constructSpecializedType(TypeFactory.java:222) */
        typeFactory.constructSpecializedType(simpleType, class1);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructSpecializedType(com.fasterxml.jackson.databind.JavaType,java.lang.Class)}
 * @utbot.executesCondition {@code (baseType.getRawClass() == subclass): False}
 * @utbot.executesCondition {@code (baseType instanceof SimpleType): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#narrowBy(java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return baseType.narrowBy(subclass);
 *  */
    @Test
    public void testConstructSpecializedType_ThrowNullPointerException_3() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        Class _class = Object.class;
        setField(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructSpecializedType] produces [java.lang.NullPointerException]
            java.base/java.lang.Class.isAssignableFrom(Native Method)
            com.fasterxml.jackson.databind.JavaType._assertSubclass(JavaType.java:464)
            com.fasterxml.jackson.databind.JavaType.narrowBy(JavaType.java:149)
            com.fasterxml.jackson.databind.type.TypeFactory.constructSpecializedType(TypeFactory.java:222) */
        typeFactory.constructSpecializedType(arrayType, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory._hashMapSuperInterfaceChain
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _hashMapSuperInterfaceChain(com.fasterxml.jackson.databind.type.HierarchicType)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_hashMapSuperInterfaceChain(com.fasterxml.jackson.databind.type.HierarchicType)}
 * @utbot.executesCondition {@code (_cachedHashMapType == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.HierarchicType#deepCloneWithoutSubtype()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: HierarchicType base = current.deepCloneWithoutSubtype();
 *  */
    @Test
    public void test_hashMapSuperInterfaceChain_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._hashMapSuperInterfaceChain] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._hashMapSuperInterfaceChain(TypeFactory.java:1169) */
        typeFactory._hashMapSuperInterfaceChain(null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_hashMapSuperInterfaceChain(com.fasterxml.jackson.databind.type.HierarchicType)}
 * @utbot.executesCondition {@code (_cachedHashMapType == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.HierarchicType#deepCloneWithoutSubtype()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.HierarchicType#setSuperType(com.fasterxml.jackson.databind.type.HierarchicType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: current.setSuperType(t);
 *  */
    @Test
    public void test_hashMapSuperInterfaceChain_ThrowNullPointerException_1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        HierarchicType _cachedHashMapType = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        typeFactory._cachedHashMapType = _cachedHashMapType;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._hashMapSuperInterfaceChain] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._hashMapSuperInterfaceChain(TypeFactory.java:1174) */
        typeFactory._hashMapSuperInterfaceChain(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _hashMapSuperInterfaceChain(com.fasterxml.jackson.databind.type.HierarchicType)
    
    @Test
    public void test_hashMapSuperInterfaceChain1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        HierarchicType _cachedHashMapType = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        HierarchicType _superType = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        _cachedHashMapType._superType = _superType;
        typeFactory._cachedHashMapType = _cachedHashMapType;
        HierarchicType hierarchicType = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        
        HierarchicType actual = typeFactory._hashMapSuperInterfaceChain(hierarchicType);
        
        Type actual_actualType = actual._actualType;
        assertNull(actual_actualType);
        
        Class actual_rawClass = actual._rawClass;
        assertNull(actual_rawClass);
        
        ParameterizedType actual_genericType = actual._genericType;
        assertNull(actual_genericType);
        
        HierarchicType hierarchicType_superType = hierarchicType._superType;
        HierarchicType actual_superType = actual._superType;
        assertTrue(deepEquals(hierarchicType_superType, actual_superType));
        assertTrue(deepEquals(hierarchicType_superType, actual_superType));
        assertTrue(deepEquals(hierarchicType_superType, actual_superType));
        HierarchicType hierarchicType_superType_superType = hierarchicType_superType._superType;
        HierarchicType actual_superType_superType = actual_superType._superType;
        assertTrue(deepEquals(hierarchicType_superType_superType, actual_superType_superType));
        assertTrue(deepEquals(hierarchicType_superType_superType, actual_superType_superType));
        assertTrue(deepEquals(hierarchicType_superType_superType, actual_superType_superType));
        HierarchicType actual_superType_superType_superType = actual_superType_superType._superType;
        assertNull(actual_superType_superType_superType);
        
        HierarchicType hierarchicType_superType_superType_subType = hierarchicType_superType_superType._subType;
        HierarchicType actual_superType_superType_subType = actual_superType_superType._subType;
        assertTrue(deepEquals(hierarchicType_superType_superType_subType, actual_superType_superType_subType));
        assertTrue(deepEquals(hierarchicType_superType_superType_subType, actual_superType_superType_subType));
        assertTrue(deepEquals(hierarchicType_superType_superType_subType, actual_superType_superType_subType));
        assertTrue(deepEquals(hierarchicType_superType_superType_subType, actual_superType_superType_subType));
        HierarchicType hierarchicType_superType_superType_subType_subType = hierarchicType_superType_superType_subType._subType;
        HierarchicType actual_superType_superType_subType_subType = actual_superType_superType_subType._subType;
        assertTrue(deepEquals(hierarchicType_superType_superType_subType_subType, actual_superType_superType_subType_subType));
        assertTrue(deepEquals(hierarchicType_superType_superType_subType_subType, actual_superType_superType_subType_subType));
        assertTrue(deepEquals(hierarchicType_superType_superType_subType_subType, actual_superType_superType_subType_subType));
        assertTrue(deepEquals(hierarchicType_superType_superType_subType_subType, actual_superType_superType_subType_subType));
        HierarchicType actual_superType_superType_subType_subType_subType = actual_superType_superType_subType_subType._subType;
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actual_superType_superType_subType_subType_subType, actual_superType_superType_subType_subType_subType));
        
        assertTrue(deepEquals(hierarchicType_superType, actual_superType));
        
        assertTrue(deepEquals(hierarchicType, actual));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _hashMapSuperInterfaceChain(com.fasterxml.jackson.databind.type.HierarchicType)
    
    @Test(expected = StackOverflowError.class)
    public void test_hashMapSuperInterfaceChain2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        HierarchicType _cachedHashMapType = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        _cachedHashMapType._superType = _cachedHashMapType;
        typeFactory._cachedHashMapType = _cachedHashMapType;
        
        typeFactory._hashMapSuperInterfaceChain(null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_hashMapSuperInterfaceChain3() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        HierarchicType hierarchicType = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        HierarchicType _superType = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        _superType._superType = _superType;
        hierarchicType._superType = _superType;
        
        typeFactory._hashMapSuperInterfaceChain(hierarchicType);
    }
    
    @Test
    public void test_hashMapSuperInterfaceChain4() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        HierarchicType hierarchicType = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        Class _actualType = Object.class;
        setField(hierarchicType, "com.fasterxml.jackson.databind.type.HierarchicType", "_actualType", _actualType);
        setField(hierarchicType, "com.fasterxml.jackson.databind.type.HierarchicType", "_rawClass", _actualType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._hashMapSuperInterfaceChain] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._hashMapSuperInterfaceChain(TypeFactory.java:1173) */
        typeFactory._hashMapSuperInterfaceChain(hierarchicType);
    }
    
    @Test
    public void test_hashMapSuperInterfaceChain5() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        HierarchicType hierarchicType = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        HierarchicType _superType = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        HierarchicType _superType1 = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        HierarchicType _superType2 = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        _superType1._superType = _superType2;
        _superType._superType = _superType1;
        hierarchicType._superType = _superType;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._hashMapSuperInterfaceChain] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._doFindSuperInterfaceChain(TypeFactory.java:1140)
            com.fasterxml.jackson.databind.type.TypeFactory._hashMapSuperInterfaceChain(TypeFactory.java:1170) */
        typeFactory._hashMapSuperInterfaceChain(hierarchicType);
    }
    
    @Test
    public void test_hashMapSuperInterfaceChain6() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        HierarchicType _cachedHashMapType = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        HierarchicType _superType = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        HierarchicType _superType1 = ((HierarchicType) createInstance("com.fasterxml.jackson.databind.type.HierarchicType"));
        _superType._superType = _superType1;
        _cachedHashMapType._superType = _superType;
        typeFactory._cachedHashMapType = _cachedHashMapType;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._hashMapSuperInterfaceChain] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._hashMapSuperInterfaceChain(TypeFactory.java:1174) */
        typeFactory._hashMapSuperInterfaceChain(null);
    }
    ///endregion
    
    ///region Errors report for _hashMapSuperInterfaceChain
    
    public void test_hashMapSuperInterfaceChain_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Default concrete execution failed
        
        // 3 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.visitor.Reifier.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.visitor" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructSimpleType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method constructSimpleType(java.lang.Class, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructSimpleType(java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#constructSimpleType(java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.returnsFrom {@code return constructSimpleType(rawType, rawType, parameterTypes);}
 *  */
    @Test
    public void testConstructSimpleType_TypeFactoryConstructSimpleType() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = {};
        
        SimpleType actual = ((SimpleType) typeFactory.constructSimpleType(class1, javaTypeArray));
        
        SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(expected, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParametersFor", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method constructSimpleType(java.lang.Class, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructSimpleType(java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#constructSimpleType(java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return constructSimpleType(rawType, rawType, parameterTypes);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructSimpleType_ThrowIllegalArgumentException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = {null, null};
        
        typeFactory.constructSimpleType(class1, javaTypeArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method constructSimpleType(java.lang.Class, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructSimpleType(java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#constructSimpleType(java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testConstructSimpleType_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructSimpleType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory.constructSimpleType(TypeFactory.java:544)
            com.fasterxml.jackson.databind.type.TypeFactory.constructSimpleType(TypeFactory.java:533) */
        typeFactory.constructSimpleType(class1, null);
    }
    ///endregion
    
    ///region Errors report for constructSimpleType
    
    public void testConstructSimpleType_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.visitor.Reifier.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.visitor" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.parser.SignatureParser.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.parser" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.constructSimpleType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method constructSimpleType(java.lang.Class, java.lang.Class, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructSimpleType(java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.executesCondition {@code (typeVars.length != parameterTypes.length): False}
 * @utbot.invokes {@link java.lang.Class#getTypeParameters()}
 * @utbot.returnsFrom {@code return new SimpleType(rawType, names, parameterTypes, null, null, false, parameterTarget);}
 *  */
    @Test
    public void testConstructSimpleType_TypeVarsLengthEqualsParameterTypesLength() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = {};
        
        SimpleType actual = ((SimpleType) typeFactory.constructSimpleType(class1, class1, javaTypeArray));
        
        SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(expected, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParametersFor", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
        Class finalClass11 = class1;
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method constructSimpleType(java.lang.Class, java.lang.Class, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructSimpleType(java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.executesCondition {@code (typeVars.length != parameterTypes.length): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: " (and target "
 *  */
    @Test
    public void testConstructSimpleType_ThrowNullPointerException_2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = {null, null};
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructSimpleType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory.constructSimpleType(TypeFactory.java:545) */
        typeFactory.constructSimpleType(null, class1, javaTypeArray);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructSimpleType(java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: typeVars.length != parameterTypes.length
 *  */
    @Test
    public void testConstructSimpleType_ThrowNullPointerException_1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructSimpleType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory.constructSimpleType(TypeFactory.java:544) */
        typeFactory.constructSimpleType(null, class1, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructSimpleType(java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.invokes {@link java.lang.Class#getTypeParameters()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: TypeVariable<?>[] typeVars = parameterTarget.getTypeParameters();
 *  */
    @Test
    public void testConstructSimpleType_ThrowNullPointerException1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.constructSimpleType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory.constructSimpleType(TypeFactory.java:543) */
        typeFactory.constructSimpleType(null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method constructSimpleType(java.lang.Class, java.lang.Class, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#constructSimpleType(java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.executesCondition {@code (typeVars.length != parameterTypes.length): False}
 * @utbot.invokes {@link java.lang.Class#getTypeParameters()}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = typeVars.length; i < len; ++i)} once
 * @utbot.returnsFrom {@code return new SimpleType(rawType, names, parameterTypes, null, null, false, parameterTarget);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new SimpleType(rawType, names, parameterTypes, null, null, false, parameterTarget);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructSimpleType_ThrowIllegalArgumentException1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = {null};
        
        typeFactory.constructSimpleType(class1, class1, javaTypeArray);
    }
    ///endregion
    
    ///region Errors report for constructSimpleType
    
    public void testConstructSimpleType_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.visitor.Reifier.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.visitor" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.parser.SignatureParser.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.parser" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.withModifier
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withModifier(com.fasterxml.jackson.databind.type.TypeModifier)
    
    @Test
    public void testWithModifier1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        TypeFactory actual = typeFactory.withModifier(null);
        
        TypeFactory expected = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        LRUMap _typeCache = ((LRUMap) createInstance("com.fasterxml.jackson.databind.util.LRUMap"));
        setField(_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_maxEntries", 100);
        ConcurrentHashMap _map = new ConcurrentHashMap();
        setField(_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_map", _map);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeFactory", "_typeCache", _typeCache);
        
        LRUMap expected_typeCache = expected._typeCache;
        LRUMap actual_typeCache = actual._typeCache;
        int expected_typeCache_maxEntries = ((Integer) getFieldValue(expected_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_maxEntries"));
        int actual_typeCache_maxEntries = ((Integer) getFieldValue(actual_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_maxEntries"));
        assertEquals(expected_typeCache_maxEntries, actual_typeCache_maxEntries);
        
        ConcurrentHashMap expected_typeCache_map = ((ConcurrentHashMap) getFieldValue(expected_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_map"));
        ConcurrentHashMap actual_typeCache_map = ((ConcurrentHashMap) getFieldValue(actual_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_map"));
        assertTrue(deepEquals(expected_typeCache_map, actual_typeCache_map));
        
        int expected_typeCache_jdkSerializeMaxEntries = ((Integer) getFieldValue(expected_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_jdkSerializeMaxEntries"));
        int actual_typeCache_jdkSerializeMaxEntries = ((Integer) getFieldValue(actual_typeCache, "com.fasterxml.jackson.databind.util.LRUMap", "_jdkSerializeMaxEntries"));
        assertEquals(expected_typeCache_jdkSerializeMaxEntries, actual_typeCache_jdkSerializeMaxEntries);
        
        HierarchicType actual_cachedHashMapType = actual._cachedHashMapType;
        assertNull(actual_cachedHashMapType);
        
        HierarchicType actual_cachedArrayListType = actual._cachedArrayListType;
        assertNull(actual_cachedArrayListType);
        
        com.fasterxml.jackson.databind.type.TypeModifier[] actual_modifiers = actual._modifiers;
        assertNull(actual_modifiers);
        
        TypeParser actual_parser = actual._parser;
        assertNull(actual_parser);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.unknownType
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method unknownType()
    
    @Test
    public void testUnknownType1() throws Exception  {
        SimpleType actual = ((SimpleType) TypeFactory.unknownType());
        
        SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findTypeParameters(java.lang.Class, java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#findTypeParameters(java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.executesCondition {@code (subType == null): False}
 * @utbot.executesCondition {@code (!superType.isGeneric()): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#_findSuperTypeChain(java.lang.Class,java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.HierarchicType#isGeneric()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindTypeParameters_NotSuperTypeIsGeneric() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        com.fasterxml.jackson.databind.JavaType[] actual = typeFactory.findTypeParameters(class1, class1, null);
        
        assertNull(actual);
        
        Class finalClass1 = class1;
        
        Class finalClass11 = class1;
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findTypeParameters(java.lang.Class, java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#findTypeParameters(java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#_findSuperTypeChain(java.lang.Class,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: HierarchicType subType = _findSuperTypeChain(clz, expType);
 *  */
    @Test
    public void testFindTypeParameters_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.HierarchicType.<init>(HierarchicType.java:38)
            com.fasterxml.jackson.databind.type.TypeFactory._findSuperClassChain(TypeFactory.java:1095)
            com.fasterxml.jackson.databind.type.TypeFactory._findSuperTypeChain(TypeFactory.java:1090)
            com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters(TypeFactory.java:286) */
        typeFactory.findTypeParameters(null, class1, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findTypeParameters(java.lang.Class, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#findTypeParameters(java.lang.Class,java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#findTypeParameters(java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return findTypeParameters(clz, expType, new TypeBindings(this, clz));
 *  */
    @Test
    public void testFindTypeParameters_ThrowNullPointerException1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.HierarchicType.<init>(HierarchicType.java:38)
            com.fasterxml.jackson.databind.type.TypeFactory._findSuperClassChain(TypeFactory.java:1095)
            com.fasterxml.jackson.databind.type.TypeFactory._findSuperTypeChain(TypeFactory.java:1090)
            com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters(TypeFactory.java:286)
            com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters(TypeFactory.java:280) */
        typeFactory.findTypeParameters(((Class) null), class1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findTypeParameters(java.lang.Class, java.lang.Class)
    
    @Test
    public void testFindTypeParameters1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        com.fasterxml.jackson.databind.JavaType[] actual = typeFactory.findTypeParameters(class1, class1);
        
        assertNull(actual);
        
        Class finalClass1 = class1;
        
        Class finalClass11 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findTypeParameters(com.fasterxml.jackson.databind.JavaType, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#findTypeParameters(com.fasterxml.jackson.databind.JavaType,java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getParameterSource()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#findTypeParameters(java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings)}
 *  */
    @Test
    public void testFindTypeParameters_TypeFactoryFindTypeParameters() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        com.fasterxml.jackson.databind.JavaType[] actual = typeFactory.findTypeParameters(referenceType, _class);
        
        com.fasterxml.jackson.databind.JavaType[] expected = {null};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        Class final_class = _class;
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findTypeParameters(com.fasterxml.jackson.databind.JavaType, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#findTypeParameters(com.fasterxml.jackson.databind.JavaType,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: expType == type.getParameterSource()
 *  */
    @Test
    public void testFindTypeParameters_ThrowNullPointerException2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters(TypeFactory.java:259) */
        typeFactory.findTypeParameters(((JavaType) null), ((Class) null));
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#findTypeParameters(com.fasterxml.jackson.databind.JavaType,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testFindTypeParameters_ThrowNullPointerException_1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.HierarchicType.<init>(HierarchicType.java:38)
            com.fasterxml.jackson.databind.type.TypeFactory._findSuperClassChain(TypeFactory.java:1095)
            com.fasterxml.jackson.databind.type.TypeFactory._findSuperTypeChain(TypeFactory.java:1090)
            com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters(TypeFactory.java:286)
            com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters(TypeFactory.java:276) */
        typeFactory.findTypeParameters(referenceType, class1);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#findTypeParameters(com.fasterxml.jackson.databind.JavaType,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testFindTypeParameters_ThrowNullPointerException_2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.HierarchicType.<init>(HierarchicType.java:38)
            com.fasterxml.jackson.databind.type.TypeFactory._findSuperClassChain(TypeFactory.java:1095)
            com.fasterxml.jackson.databind.type.TypeFactory._findSuperTypeChain(TypeFactory.java:1090)
            com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters(TypeFactory.java:286)
            com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters(TypeFactory.java:276) */
        typeFactory.findTypeParameters(simpleType, class1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findTypeParameters(com.fasterxml.jackson.databind.JavaType, java.lang.Class)
    
    @Test
    public void testFindTypeParameters2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        com.fasterxml.jackson.databind.JavaType[] actual = typeFactory.findTypeParameters(simpleType, _class);
        
        assertNull(actual);
        
        Class finalSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        Class final_class = _class;
        
        assertFalse(initialSimpleType_class == finalSimpleType_class);
        
    }
    
    @Test
    public void testFindTypeParameters3() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        
        com.fasterxml.jackson.databind.JavaType[] actual = typeFactory.findTypeParameters(simpleType, ((Class) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for findTypeParameters
    
    public void testFindTypeParameters_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory._constructType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _constructType(java.lang.reflect.Type, com.fasterxml.jackson.databind.type.TypeBindings)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_constructType(java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.executesCondition {@code (type instanceof Class<?>): False}
 * @utbot.executesCondition {@code (type instanceof ParameterizedType): False}
 * @utbot.executesCondition {@code (type instanceof JavaType): True}
 * @utbot.returnsFrom {@code return (JavaType) type;}
 *  */
    @Test
    public void test_constructType_TypeInstanceOfJavaType() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        Class typeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class mapTypeType = Class.forName("java.lang.reflect.Type");
        Class typeBindingsType = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Method _constructTypeMethod = typeFactoryClazz.getDeclaredMethod("_constructType", mapTypeType, typeBindingsType);
        _constructTypeMethod.setAccessible(true);
        java.lang.Object[] _constructTypeMethodArguments = new java.lang.Object[2];
        _constructTypeMethodArguments[0] = mapType;
        _constructTypeMethodArguments[1] = ((Object) null);
        MapType actual = ((MapType) _constructTypeMethod.invoke(typeFactory, _constructTypeMethodArguments));
        
        JavaType actual_keyType = actual._keyType;
        assertNull(actual_keyType);
        
        JavaType actual_valueType = actual._valueType;
        assertNull(actual_valueType);
        
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
        assertFalse(actual_asStatic);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _constructType(java.lang.reflect.Type, com.fasterxml.jackson.databind.type.TypeBindings)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_constructType(java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.executesCondition {@code (type instanceof Class<?>): False}
 * @utbot.executesCondition {@code (type instanceof ParameterizedType): False}
 * @utbot.executesCondition {@code (type instanceof JavaType): False}
 * @utbot.executesCondition {@code (type instanceof GenericArrayType): False}
 * @utbot.executesCondition {@code (type instanceof TypeVariable<?>): False}
 * @utbot.executesCondition {@code (type instanceof WildcardType): False}
 * @utbot.executesCondition {@code ((type == null)): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: type instanceof WildcardType
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void test_constructType_ThrowIllegalArgumentException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        typeFactory._constructType(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _constructType(java.lang.reflect.Type, com.fasterxml.jackson.databind.type.TypeBindings)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_constructType(java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: resultType = _fromWildcard((WildcardType) type, context);
 *  */
    @Test
    public void test_constructType_ThrowClassCastException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        java.lang.Object[] upperBounds = {};
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "upperBounds", upperBounds);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._constructType] produces [java.lang.ClassCastException: The object with type java.lang.Object[] can not be casted to java.lang.reflect.Type[]] */
        typeFactory._constructType(wildcardTypeImpl, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_constructType(java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: resultType = _fromWildcard((WildcardType) type, context);
 *  */
    @Test
    public void test_constructType_ThrowIndexOutOfBoundsException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        sun.reflect.generics.tree.FieldTypeSignature[] upperBounds = {};
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "upperBounds", upperBounds);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._constructType] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        typeFactory._constructType(wildcardTypeImpl, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _constructType(java.lang.reflect.Type, com.fasterxml.jackson.databind.type.TypeBindings)
    
    @Test
    public void test_constructType1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._constructType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromClass(TypeFactory.java:777)
            com.fasterxml.jackson.databind.type.TypeFactory._constructType(TypeFactory.java:387) */
        typeFactory._constructType(class1, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory.moreSpecificType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method moreSpecificType(com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#moreSpecificType(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (type1 == null): True}
 *  */
    @Test
    public void testMoreSpecificType_Type1EqualsNull() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        JavaType actual = typeFactory.moreSpecificType(null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#moreSpecificType(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (type1 == null): False}
 * @utbot.executesCondition {@code (type2 == null): True}
 *  */
    @Test
    public void testMoreSpecificType_Type2EqualsNull() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        
        ArrayType actual = ((ArrayType) typeFactory.moreSpecificType(arrayType, null));
        
        // com.fasterxml.jackson.databind.type.ArrayType has overridden equals method
        assertEquals(arrayType, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#moreSpecificType(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (type1 == null): False}
 * @utbot.executesCondition {@code (type2 == null): False}
 * @utbot.executesCondition {@code (raw1 == raw2): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 *  */
    @Test
    public void testMoreSpecificType_Raw1EqualsRaw2() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        
        ArrayType actual = ((ArrayType) typeFactory.moreSpecificType(arrayType, arrayType));
        
        // com.fasterxml.jackson.databind.type.ArrayType has overridden equals method
        assertEquals(arrayType, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method moreSpecificType(com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#moreSpecificType(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: raw1.isAssignableFrom(raw2)
 *  */
    @Test
    public void testMoreSpecificType_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.moreSpecificType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory.moreSpecificType(TypeFactory.java:342) */
        typeFactory.moreSpecificType(referenceType, simpleType);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#moreSpecificType(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (raw1.isAssignableFrom(raw2)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return type1;
 *  */
    @Test
    public void testMoreSpecificType_ThrowNullPointerException_1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        Class _class = Object.class;
        setField(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        ArrayType arrayType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory.moreSpecificType] produces [java.lang.NullPointerException]
            java.base/java.lang.Class.isAssignableFrom(Native Method)
            com.fasterxml.jackson.databind.type.TypeFactory.moreSpecificType(TypeFactory.java:342) */
        typeFactory.moreSpecificType(arrayType, arrayType1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory._fromParamType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _fromParamType(java.lang.reflect.ParameterizedType, com.fasterxml.jackson.databind.type.TypeBindings)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromParamType(java.lang.reflect.ParameterizedType,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.invokes {@link java.lang.reflect.ParameterizedType#getRawType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<?> rawType = (Class<?>) type.getRawType();
 *  */
    @Test
    public void test_fromParamType_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._fromParamType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromParamType(TypeFactory.java:880) */
        typeFactory._fromParamType(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _fromParamType(java.lang.reflect.ParameterizedType, com.fasterxml.jackson.databind.type.TypeBindings)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromParamType(java.lang.reflect.ParameterizedType,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.executesCondition {@code ((args == null)): False}
 * @utbot.executesCondition {@code (paramCount == 0): False}
 * @utbot.invokes {@link java.lang.reflect.ParameterizedType#getRawType()}
 * @utbot.invokes {@link java.lang.reflect.ParameterizedType#getActualTypeArguments()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < paramCount; ++i)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: pt[i] = _constructType(args[i], context);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void test_fromParamType_ThrowIllegalArgumentException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        ParameterizedTypeImpl parameterizedTypeImpl = ((ParameterizedTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl"));
        java.lang.reflect.Type[] actualTypeArguments = {null};
        setField(parameterizedTypeImpl, "sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl", "actualTypeArguments", actualTypeArguments);
        
        typeFactory._fromParamType(parameterizedTypeImpl, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory._fromVariable
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _fromVariable(java.lang.reflect.TypeVariable, com.fasterxml.jackson.databind.type.TypeBindings)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromVariable(java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.executesCondition {@code (context == null): True}
 * @utbot.invokes {@link java.lang.reflect.TypeVariable#getName()}
 * @utbot.invokes {@link java.lang.reflect.TypeVariable#getBounds()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Type[] bounds = type.getBounds();
 *  */
    @Test
    public void test_fromVariable_ThrowClassCastException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        TypeVariableImpl typeVariableImpl = ((TypeVariableImpl) createInstance("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        String name = "";
        setField(typeVariableImpl, "sun.reflect.generics.reflectiveObjects.TypeVariableImpl", "name", name);
        java.lang.Object[] bounds = {};
        setField(typeVariableImpl, "sun.reflect.generics.reflectiveObjects.TypeVariableImpl", "bounds", bounds);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._fromVariable] produces [java.lang.ClassCastException: The object with type java.lang.Object[] can not be casted to java.lang.reflect.Type[]] */
        typeFactory._fromVariable(typeVariableImpl, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromVariable(java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.invokes {@link java.lang.reflect.TypeVariable#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final String name = type.getName();
 *  */
    @Test
    public void test_fromVariable_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._fromVariable] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromVariable(TypeFactory.java:964) */
        typeFactory._fromVariable(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory._fromWildcard
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _fromWildcard(java.lang.reflect.WildcardType, com.fasterxml.jackson.databind.type.TypeBindings)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromWildcard(java.lang.reflect.WildcardType,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.invokes {@link java.lang.reflect.WildcardType#getUpperBounds()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#_constructType(java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.returnsFrom {@code return _constructType(type.getUpperBounds()[0], context);}
 *  */
    @Test
    public void test_fromWildcard_TypeFactory_constructType() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        java.lang.Object[] upperBounds = new java.lang.Object[1];
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        upperBounds[0] = ((Object) collectionLikeType);
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "upperBounds", upperBounds);
        
        CollectionLikeType actual = ((CollectionLikeType) typeFactory._fromWildcard(wildcardTypeImpl, null));
        
        // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
        assertEquals(collectionLikeType, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _fromWildcard(java.lang.reflect.WildcardType, com.fasterxml.jackson.databind.type.TypeBindings)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromWildcard(java.lang.reflect.WildcardType,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return _constructType(type.getUpperBounds()[0], context);
 *  */
    @Test
    public void test_fromWildcard_ThrowClassCastException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        java.lang.Object[] upperBounds = {};
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "upperBounds", upperBounds);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._fromWildcard] produces [java.lang.ClassCastException: The object with type java.lang.Object[] can not be casted to java.lang.reflect.Type[]] */
        typeFactory._fromWildcard(wildcardTypeImpl, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromWildcard(java.lang.reflect.WildcardType,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return _constructType(type.getUpperBounds()[0], context);
 *  */
    @Test
    public void test_fromWildcard_ThrowIndexOutOfBoundsException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        java.lang.Object[] upperBounds = {};
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "upperBounds", upperBounds);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._fromWildcard] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        typeFactory._fromWildcard(wildcardTypeImpl, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromWildcard(java.lang.reflect.WildcardType,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: return _constructType(type.getUpperBounds()[0], context);
 *  */
    @Test
    public void test_fromWildcard_ThrowIndexOutOfBoundsException_1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        sun.reflect.generics.tree.FieldTypeSignature[] upperBounds = {};
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "upperBounds", upperBounds);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._fromWildcard] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        typeFactory._fromWildcard(wildcardTypeImpl, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromWildcard(java.lang.reflect.WildcardType,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.invokes {@link java.lang.reflect.WildcardType#getUpperBounds()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _constructType(type.getUpperBounds()[0], context);
 *  */
    @Test
    public void test_fromWildcard_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._fromWildcard] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromWildcard(TypeFactory.java:1015) */
        typeFactory._fromWildcard(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _fromWildcard(java.lang.reflect.WildcardType, com.fasterxml.jackson.databind.type.TypeBindings)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromWildcard(java.lang.reflect.WildcardType,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.invokes {@link java.lang.reflect.WildcardType#getUpperBounds()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#_constructType(java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return _constructType(type.getUpperBounds()[0], context);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void test_fromWildcard_ThrowIllegalArgumentException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        WildcardTypeImpl wildcardTypeImpl = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        java.lang.Object[] upperBounds = {null};
        setField(wildcardTypeImpl, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "upperBounds", upperBounds);
        
        typeFactory._fromWildcard(wildcardTypeImpl, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory._fromClass
    
    ///region OTHER: ERROR SUITE for method _fromClass(java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings)
    
    @Test
    public void test_fromClass1() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._fromClass] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromClass(TypeFactory.java:777) */
        typeFactory._fromClass(class1, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory._fromArrayType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _fromArrayType(java.lang.reflect.GenericArrayType, com.fasterxml.jackson.databind.type.TypeBindings)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromArrayType(java.lang.reflect.GenericArrayType,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.invokes {@link java.lang.reflect.GenericArrayType#getGenericComponentType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#_constructType(java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: JavaType compType = _constructType(type.getGenericComponentType(), context);
 *  */
    @Test
    public void test_fromArrayType_ThrowIndexOutOfBoundsException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        GenericArrayTypeImpl genericArrayTypeImpl = ((GenericArrayTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.GenericArrayTypeImpl"));
        WildcardTypeImpl genericComponentType = ((WildcardTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.WildcardTypeImpl"));
        java.lang.Object[] upperBounds = {};
        setField(genericComponentType, "sun.reflect.generics.reflectiveObjects.WildcardTypeImpl", "upperBounds", upperBounds);
        setField(genericArrayTypeImpl, "sun.reflect.generics.reflectiveObjects.GenericArrayTypeImpl", "genericComponentType", genericComponentType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._fromArrayType] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        typeFactory._fromArrayType(genericArrayTypeImpl, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromArrayType(java.lang.reflect.GenericArrayType,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType compType = _constructType(type.getGenericComponentType(), context);
 *  */
    @Test
    public void test_fromArrayType_ThrowNullPointerException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._fromArrayType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromArrayType(TypeFactory.java:958) */
        typeFactory._fromArrayType(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _fromArrayType(java.lang.reflect.GenericArrayType, com.fasterxml.jackson.databind.type.TypeBindings)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_fromArrayType(java.lang.reflect.GenericArrayType,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.invokes {@link java.lang.reflect.GenericArrayType#getGenericComponentType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#_constructType(java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: JavaType compType = _constructType(type.getGenericComponentType(), context);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void test_fromArrayType_ThrowIllegalArgumentException() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        GenericArrayTypeImpl genericArrayTypeImpl = ((GenericArrayTypeImpl) createInstance("sun.reflect.generics.reflectiveObjects.GenericArrayTypeImpl"));
        
        typeFactory._fromArrayType(genericArrayTypeImpl, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory._mapType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _mapType(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_mapType(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#findTypeParameters(java.lang.Class,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void test_mapType_ThrowNullPointerException() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._mapType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.HierarchicType.<init>(HierarchicType.java:38)
            com.fasterxml.jackson.databind.type.TypeFactory._findSuperInterfaceChain(TypeFactory.java:1115)
            com.fasterxml.jackson.databind.type.TypeFactory._findSuperTypeChain(TypeFactory.java:1088)
            com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters(TypeFactory.java:286)
            com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters(TypeFactory.java:280)
            com.fasterxml.jackson.databind.type.TypeFactory._mapType(TypeFactory.java:1021) */
        Class typeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class classType = Class.forName("java.lang.Class");
        Method _mapTypeMethod = typeFactoryClazz.getDeclaredMethod("_mapType", classType);
        _mapTypeMethod.setAccessible(true);
        java.lang.Object[] _mapTypeMethodArguments = new java.lang.Object[1];
        _mapTypeMethodArguments[0] = ((Object) null);
        try {
            _mapTypeMethod.invoke(typeFactory, _mapTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _mapType(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_mapType(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#findTypeParameters(java.lang.Class,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: JavaType[] typeParams = findTypeParameters(rawClass, Map.class);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void test_mapType_ThrowIllegalArgumentException() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        Class typeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class class1Type = Class.forName("java.lang.Class");
        Method _mapTypeMethod = typeFactoryClazz.getDeclaredMethod("_mapType", class1Type);
        _mapTypeMethod.setAccessible(true);
        java.lang.Object[] _mapTypeMethodArguments = new java.lang.Object[1];
        _mapTypeMethodArguments[0] = class1;
        try {
            _mapTypeMethod.invoke(typeFactory, _mapTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for _mapType
    
    public void test_mapType_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.visitor.Reifier.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.visitor" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory._unknownType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _unknownType()
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_unknownType()}
 * @utbot.returnsFrom {@code return new SimpleType(Object.class);}
 *  */
    @Test
    public void test_unknownType_Return() throws Exception  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        SimpleType actual = ((SimpleType) typeFactory._unknownType());
        
        SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeFactory._collectionType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _collectionType(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_collectionType(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#findTypeParameters(java.lang.Class,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void test_collectionType_ThrowNullPointerException() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeFactory._collectionType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.HierarchicType.<init>(HierarchicType.java:38)
            com.fasterxml.jackson.databind.type.TypeFactory._findSuperInterfaceChain(TypeFactory.java:1115)
            com.fasterxml.jackson.databind.type.TypeFactory._findSuperTypeChain(TypeFactory.java:1088)
            com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters(TypeFactory.java:286)
            com.fasterxml.jackson.databind.type.TypeFactory.findTypeParameters(TypeFactory.java:280)
            com.fasterxml.jackson.databind.type.TypeFactory._collectionType(TypeFactory.java:1035) */
        Class typeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class classType = Class.forName("java.lang.Class");
        Method _collectionTypeMethod = typeFactoryClazz.getDeclaredMethod("_collectionType", classType);
        _collectionTypeMethod.setAccessible(true);
        java.lang.Object[] _collectionTypeMethodArguments = new java.lang.Object[1];
        _collectionTypeMethodArguments[0] = ((Object) null);
        try {
            _collectionTypeMethod.invoke(typeFactory, _collectionTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _collectionType(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link TypeFactory}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeFactory#_collectionType(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeFactory#findTypeParameters(java.lang.Class,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: JavaType[] typeParams = findTypeParameters(rawClass, Collection.class);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void test_collectionType_ThrowIllegalArgumentException() throws Throwable  {
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        Class class1 = Object.class;
        
        Class typeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class class1Type = Class.forName("java.lang.Class");
        Method _collectionTypeMethod = typeFactoryClazz.getDeclaredMethod("_collectionType", class1Type);
        _collectionTypeMethod.setAccessible(true);
        java.lang.Object[] _collectionTypeMethodArguments = new java.lang.Object[1];
        _collectionTypeMethodArguments[0] = class1;
        try {
            _collectionTypeMethod.invoke(typeFactory, _collectionTypeMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1067410212207600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1067410212207600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1067410212212899 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1067410212207600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1067410212212899).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1067410212587100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1067410212587100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1067410212588600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1067410212587100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1067410212588600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

