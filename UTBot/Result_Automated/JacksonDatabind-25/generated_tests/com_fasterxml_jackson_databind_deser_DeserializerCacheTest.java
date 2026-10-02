package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.deser.impl.NoClassDefFoundDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.ext.CoreXMLDeserializers.Std;
import com.fasterxml.jackson.databind.ext.CoreXMLDeserializers;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigIntegerDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.ShortDeserializer;
import com.fasterxml.jackson.databind.deser.std.UUIDDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer;
import com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer;
import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;
import com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
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

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public final class com_fasterxml_jackson_databind_deser_DeserializerCacheTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.DeserializerCache.writeReplace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeReplace()
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#writeReplace()}
 * @utbot.invokes {@link java.util.HashMap#clear()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWriteReplace_HashMapClear() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _incompleteDeserializers = new HashMap();
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_incompleteDeserializers", _incompleteDeserializers);
        
        DeserializerCache actual = ((DeserializerCache) deserializerCache.writeReplace());
        
        ConcurrentHashMap actual_cachedDeserializers = actual._cachedDeserializers;
        assertNull(actual_cachedDeserializers);
        
        HashMap deserializerCache_incompleteDeserializers = deserializerCache._incompleteDeserializers;
        HashMap actual_incompleteDeserializers = actual._incompleteDeserializers;
        assertTrue(deepEquals(deserializerCache_incompleteDeserializers, actual_incompleteDeserializers));
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeReplace()
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#writeReplace()}
 * @utbot.invokes {@link java.util.HashMap#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _incompleteDeserializers.clear();
 *  */
    @Test
    public void testWriteReplace_ThrowNullPointerException() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache.writeReplace] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache.writeReplace(DeserializerCache.java:69) */
        deserializerCache.writeReplace();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.DeserializerCache.hasValueDeserializerFor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasValueDeserializerFor(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.DeserializerFactory, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#hasValueDeserializerFor(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return (deser != null);}
 *  */
    @Test
    public void testHasValueDeserializerFor_ReturnDeserEqualsNull() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        DateDeserializers.SqlDateDeserializer sqlDateDeserializer = ((DateDeserializers.SqlDateDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer"));
        _cachedDeserializers.put(collectionLikeType, sqlDateDeserializer);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        
        boolean actual = deserializerCache.hasValueDeserializerFor(null, null, collectionLikeType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#hasValueDeserializerFor(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return (deser != null);}
 *  */
    @Test
    public void testHasValueDeserializerFor_ReturnDeserEqualsNull_1() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Object longDeser = createInstance("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$LongDeser");
        _cachedDeserializers.put(collectionLikeType, longDeser);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        
        boolean actual = deserializerCache.hasValueDeserializerFor(null, null, collectionLikeType);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method hasValueDeserializerFor(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.DeserializerFactory, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#hasValueDeserializerFor(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_findCachedDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: JsonDeserializer<Object> deser = _findCachedDeserializer(type);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHasValueDeserializerFor_ThrowIllegalArgumentException() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        
        deserializerCache.hasValueDeserializerFor(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCacheValueDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _createAndCacheValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.DeserializerFactory, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createAndCacheValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_findCachedDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return deser;}
 *  */
    @Test
    public void test_createAndCacheValueDeserializer_DeserializerCache_findCachedDeserializer() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ByteBufferDeserializer byteBufferDeserializer = ((ByteBufferDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer"));
        _cachedDeserializers.put(collectionType, byteBufferDeserializer);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        
        ByteBufferDeserializer actual = ((ByteBufferDeserializer) deserializerCache._createAndCacheValueDeserializer(null, null, collectionType));
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _createAndCacheValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.DeserializerFactory, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createAndCacheValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void test_createAndCacheValueDeserializer_ThrowNullPointerException() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        
        deserializerCache._createAndCacheValueDeserializer(null, null, simpleType);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createAndCacheValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void test_createAndCacheValueDeserializer_ThrowNullPointerException_1() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        
        deserializerCache._createAndCacheValueDeserializer(null, null, collectionLikeType);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createAndCacheValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void test_createAndCacheValueDeserializer_ThrowNullPointerException_2() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        NoClassDefFoundDeserializer noClassDefFoundDeserializer = ((NoClassDefFoundDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.NoClassDefFoundDeserializer"));
        _cachedDeserializers.put(arrayType, noClassDefFoundDeserializer);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        
        deserializerCache._createAndCacheValueDeserializer(null, null, collectionType);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createAndCacheValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void test_createAndCacheValueDeserializer_ThrowNullPointerException_3() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        _cachedDeserializers.put(null, null);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        deserializerCache._createAndCacheValueDeserializer(null, null, collectionType);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _createAndCacheValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.DeserializerFactory, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createAndCacheValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_findCachedDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_findCachedDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void test_createAndCacheValueDeserializer_ThrowNullPointerException_4() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCacheValueDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCacheValueDeserializer(DeserializerCache.java:228) */
        deserializerCache._createAndCacheValueDeserializer(null, null, null);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _createAndCacheValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.DeserializerFactory, com.fasterxml.jackson.databind.JavaType)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createAndCacheValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void test_createAndCacheValueDeserializerThrowsIAE() throws JsonMappingException  {
        DeserializerCache deserializerCache = new DeserializerCache();
        
        deserializerCache._createAndCacheValueDeserializer(null, null, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _createAndCacheValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.DeserializerFactory, com.fasterxml.jackson.databind.JavaType)
    
    @Test(expected = NullPointerException.class)
    public void test_createAndCacheValueDeserializer1() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _incompleteDeserializers = new HashMap();
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CoreXMLDeserializers.Std std = ((CoreXMLDeserializers.Std) createInstance("com.fasterxml.jackson.databind.ext.CoreXMLDeserializers$Std"));
        _incompleteDeserializers.put(mapLikeType, std);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_incompleteDeserializers", _incompleteDeserializers);
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionType _elementType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        Object _valueHandler = createInstance("java.lang.Object");
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        deserializerCache._createAndCacheValueDeserializer(null, null, collectionLikeType);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_createAndCacheValueDeserializer2() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _incompleteDeserializers = new HashMap();
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        UntypedObjectDeserializer.Vanilla vanilla = ((UntypedObjectDeserializer.Vanilla) createInstance("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer$Vanilla"));
        _incompleteDeserializers.put(collectionType, vanilla);
        _incompleteDeserializers.put(null, null);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_incompleteDeserializers", _incompleteDeserializers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object _typeHandler = createInstance("java.lang.Object");
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        deserializerCache._createAndCacheValueDeserializer(null, beanDeserializerFactory, collectionLikeType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.DeserializerCache.findDeserializerFromAnnotation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findDeserializerFromAnnotation(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#findDeserializerFromAnnotation(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.executesCondition {@code (deserDef == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getAnnotationIntrospector()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findDeserializer(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindDeserializerFromAnnotation_DeserDefEqualsNull() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        JsonDeserializer actual = deserializerCache.findDeserializerFromAnnotation(impl, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findDeserializerFromAnnotation(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#findDeserializerFromAnnotation(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getAnnotationIntrospector()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object deserDef = ctxt.getAnnotationIntrospector().findDeserializer(ann);
 *  */
    @Test
    public void testFindDeserializerFromAnnotation_ThrowNullPointerException() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache.findDeserializerFromAnnotation] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache.findDeserializerFromAnnotation(DeserializerCache.java:415) */
        deserializerCache.findDeserializerFromAnnotation(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#findDeserializerFromAnnotation(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getAnnotationIntrospector()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object deserDef = ctxt.getAnnotationIntrospector().findDeserializer(ann);
 *  */
    @Test
    public void testFindDeserializerFromAnnotation_ThrowNullPointerException_1() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache.findDeserializerFromAnnotation] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache.findDeserializerFromAnnotation(DeserializerCache.java:415) */
        deserializerCache.findDeserializerFromAnnotation(impl, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.DeserializerCache.cachedDeserializersCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method cachedDeserializersCount()
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#cachedDeserializersCount()}
 * @utbot.returnsFrom {@code return _cachedDeserializers.size();}
 *  */
    @Test
    public void testCachedDeserializersCount_Return_cachedDeserializersSize() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        
        int actual = deserializerCache.cachedDeserializersCount();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#cachedDeserializersCount()}
 * @utbot.returnsFrom {@code return _cachedDeserializers.size();}
 *  */
    @Test
    public void testCachedDeserializersCount_Return_cachedDeserializersSize_1() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        DateDeserializers.SqlDateDeserializer sqlDateDeserializer = ((DateDeserializers.SqlDateDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer"));
        _cachedDeserializers.put(arrayType, sqlDateDeserializer);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        
        int actual = deserializerCache.cachedDeserializersCount();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method cachedDeserializersCount()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): True}
    /// invoke:
    ///     {@link org.utbot.engine.overrides.collections.RangeModifiableUnlimitedArray#get(int)} once,
    ///     {@link org.utbot.api.mock.UtMock#assume(boolean)} once,
    ///     {@link org.utbot.engine.overrides.UtOverrideMock#parameter(java.lang.Object)} twice,
    ///     {@link org.utbot.engine.overrides.collections.AssociativeArray#select(java.lang.Object)} once
    /// invoke:
    ///     {@link org.utbot.engine.overrides.collections.RangeModifiableUnlimitedArray#get(int)} once,
    ///     {@link org.utbot.api.mock.UtMock#assume(boolean)} once,
    ///     {@link org.utbot.engine.overrides.UtOverrideMock#parameter(java.lang.Object)} twice,
    ///     {@link org.utbot.engine.overrides.collections.AssociativeArray#select(java.lang.Object)} once,
    ///     {@link java.lang.Object#hashCode()} twice
    /// invoke:
    ///     {@link org.utbot.engine.overrides.collections.RangeModifiableUnlimitedArray#get(int)} once,
    ///     {@link org.utbot.api.mock.UtMock#assume(boolean)} twice,
    ///     {@link org.utbot.engine.overrides.UtOverrideMock#parameter(java.lang.Object)} twice,
    ///     {@link org.utbot.engine.overrides.collections.AssociativeArray#select(java.lang.Object)} once,
    ///     {@link java.lang.Object#hashCode()} twice
    /// execute conditions:
    ///     {@code (null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#cachedDeserializersCount()}
 * @utbot.returnsFrom {@code return _cachedDeserializers.size();}
 *  */
    @Test
    public void testCachedDeserializersCount_Return_cachedDeserializersSize_2() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        StringDeserializer stringDeserializer = ((StringDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringDeserializer"));
        _cachedDeserializers.put(collectionType, stringDeserializer);
        CollectionType collectionType1 = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        _cachedDeserializers.put(collectionType1, stringDeserializer);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        
        int actual = deserializerCache.cachedDeserializersCount();
        
        assertEquals(2, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#cachedDeserializersCount()}
 * @utbot.returnsFrom {@code return _cachedDeserializers.size();}
 *  */
    @Test
    public void testCachedDeserializersCount_Return_cachedDeserializersSize_3() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        StringDeserializer stringDeserializer = ((StringDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringDeserializer"));
        _cachedDeserializers.put(mapLikeType, stringDeserializer);
        MapLikeType mapLikeType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        _cachedDeserializers.put(mapLikeType1, stringDeserializer);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        
        int actual = deserializerCache.cachedDeserializersCount();
        
        assertEquals(2, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#cachedDeserializersCount()}
 * @utbot.returnsFrom {@code return _cachedDeserializers.size();}
 *  */
    @Test
    public void testCachedDeserializersCount_Return_cachedDeserializersSize_4() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        NullifyingDeserializer nullifyingDeserializer = ((NullifyingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer"));
        _cachedDeserializers.put(referenceType, nullifyingDeserializer);
        ReferenceType referenceType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        _cachedDeserializers.put(referenceType1, nullifyingDeserializer);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        
        int actual = deserializerCache.cachedDeserializersCount();
        
        assertEquals(2, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#cachedDeserializersCount()}
 * @utbot.returnsFrom {@code return _cachedDeserializers.size();}
 *  */
    @Test
    public void testCachedDeserializersCount_Return_cachedDeserializersSize_5() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        NullifyingDeserializer nullifyingDeserializer = ((NullifyingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer"));
        _cachedDeserializers.put(simpleType, nullifyingDeserializer);
        SimpleType simpleType1 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        _cachedDeserializers.put(simpleType1, nullifyingDeserializer);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        
        int actual = deserializerCache.cachedDeserializersCount();
        
        assertEquals(2, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#cachedDeserializersCount()}
 * @utbot.returnsFrom {@code return _cachedDeserializers.size();}
 *  */
    @Test
    public void testCachedDeserializersCount_Return_cachedDeserializersSize_6() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        NullifyingDeserializer nullifyingDeserializer = ((NullifyingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer"));
        _cachedDeserializers.put(arrayType, nullifyingDeserializer);
        ArrayType arrayType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        _cachedDeserializers.put(arrayType1, nullifyingDeserializer);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        
        int actual = deserializerCache.cachedDeserializersCount();
        
        assertEquals(2, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#cachedDeserializersCount()}
 * @utbot.returnsFrom {@code return _cachedDeserializers.size();}
 *  */
    @Test
    public void testCachedDeserializersCount_Return_cachedDeserializersSize_7() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        _cachedDeserializers.put(null, null);
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        NoClassDefFoundDeserializer noClassDefFoundDeserializer = ((NoClassDefFoundDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.NoClassDefFoundDeserializer"));
        _cachedDeserializers.put(arrayType, noClassDefFoundDeserializer);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        
        int actual = deserializerCache.cachedDeserializersCount();
        
        assertEquals(2, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#cachedDeserializersCount()}
 * @utbot.returnsFrom {@code return _cachedDeserializers.size();}
 *  */
    @Test
    public void testCachedDeserializersCount_Return_cachedDeserializersSize_8() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ByteBufferDeserializer byteBufferDeserializer = ((ByteBufferDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer"));
        _cachedDeserializers.put(mapLikeType, byteBufferDeserializer);
        _cachedDeserializers.put(null, null);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        
        int actual = deserializerCache.cachedDeserializersCount();
        
        assertEquals(2, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#cachedDeserializersCount()}
 * @utbot.returnsFrom {@code return _cachedDeserializers.size();}
 *  */
    @Test
    public void testCachedDeserializersCount_Return_cachedDeserializersSize_9() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ByteBufferDeserializer byteBufferDeserializer = ((ByteBufferDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer"));
        _cachedDeserializers.put(collectionLikeType, byteBufferDeserializer);
        _cachedDeserializers.put(null, null);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        
        int actual = deserializerCache.cachedDeserializersCount();
        
        assertEquals(2, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method cachedDeserializersCount()
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#cachedDeserializersCount()}
 * @utbot.invokes {@link java.util.concurrent.ConcurrentHashMap#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _cachedDeserializers.size();
 *  */
    @Test
    public void testCachedDeserializersCount_ThrowNullPointerException() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache.cachedDeserializersCount] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache.cachedDeserializersCount(DeserializerCache.java:93) */
        deserializerCache.cachedDeserializersCount();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method cachedDeserializersCount()
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#cachedDeserializersCount()}
     */
    @Test
    public void testCachedDeserializersCountReturnsZero() {
        DeserializerCache deserializerCache = new DeserializerCache();
        
        int actual = deserializerCache.cachedDeserializersCount();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.DeserializerCache.findKeyDeserializer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findKeyDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.DeserializerFactory, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#findKeyDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.DeserializerFactory#createKeyDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: KeyDeserializer kd = factory.createKeyDeserializer(ctxt, type);
 *  */
    @Test
    public void testFindKeyDeserializer_ThrowNullPointerException() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache.findKeyDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache.findKeyDeserializer(DeserializerCache.java:166) */
        deserializerCache.findKeyDeserializer(null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findKeyDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.DeserializerFactory, com.fasterxml.jackson.databind.JavaType)
    
    @Test
    public void testFindKeyDeserializer1() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        BasicClassIntrospector _classIntrospector = ((BasicClassIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_classIntrospector", _classIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.deser.KeyDeserializers[] _additionalKeyDeserializers = {};
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_additionalKeyDeserializers", _additionalKeyDeserializers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache.findKeyDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.MapperConfigBase.findMixInClassFor(MapperConfigBase.java:481)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.<init>(AnnotatedClass.java:122)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(AnnotatedClass.java:141)
            com.fasterxml.jackson.databind.introspect.BasicClassIntrospector.collectProperties(BasicClassIntrospector.java:195)
            com.fasterxml.jackson.databind.introspect.BasicClassIntrospector.forDeserialization(BasicClassIntrospector.java:110)
            com.fasterxml.jackson.databind.introspect.BasicClassIntrospector.forDeserialization(BasicClassIntrospector.java:15)
            com.fasterxml.jackson.databind.DeserializationConfig.introspect(DeserializationConfig.java:724)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers.findStringBasedKeyDeserializer(StdKeyDeserializers.java:54)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createKeyDeserializer(BasicDeserializerFactory.java:1371)
            com.fasterxml.jackson.databind.deser.DeserializerCache.findKeyDeserializer(DeserializerCache.java:166) */
        deserializerCache.findKeyDeserializer(impl, beanDeserializerFactory, simpleType);
    }
    
    @Test
    public void testFindKeyDeserializer2() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        BasicClassIntrospector _classIntrospector = ((BasicClassIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_classIntrospector", _classIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.deser.KeyDeserializers[] _additionalKeyDeserializers = {};
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_additionalKeyDeserializers", _additionalKeyDeserializers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        Class _class = Object.class;
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache.findKeyDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.MapperConfigBase.findMixInClassFor(MapperConfigBase.java:481)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.<init>(AnnotatedClass.java:122)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(AnnotatedClass.java:141)
            com.fasterxml.jackson.databind.introspect.BasicClassIntrospector.collectProperties(BasicClassIntrospector.java:195)
            com.fasterxml.jackson.databind.introspect.BasicClassIntrospector.forDeserialization(BasicClassIntrospector.java:110)
            com.fasterxml.jackson.databind.introspect.BasicClassIntrospector.forDeserialization(BasicClassIntrospector.java:15)
            com.fasterxml.jackson.databind.DeserializationConfig.introspect(DeserializationConfig.java:724)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers.findStringBasedKeyDeserializer(StdKeyDeserializers.java:54)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createKeyDeserializer(BasicDeserializerFactory.java:1371)
            com.fasterxml.jackson.databind.deser.DeserializerCache.findKeyDeserializer(DeserializerCache.java:166) */
        deserializerCache.findKeyDeserializer(impl, beanDeserializerFactory, collectionType);
    }
    
    @Test
    public void testFindKeyDeserializer3() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.deser.KeyDeserializers[] _additionalKeyDeserializers = {null, null, null, null, null, null, null, null, null};
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_additionalKeyDeserializers", _additionalKeyDeserializers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache.findKeyDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromClass(TypeFactory.java:869)
            com.fasterxml.jackson.databind.type.TypeFactory._constructType(TypeFactory.java:479)
            com.fasterxml.jackson.databind.type.TypeFactory.constructType(TypeFactory.java:451)
            com.fasterxml.jackson.databind.cfg.MapperConfig.constructType(MapperConfig.java:280)
            com.fasterxml.jackson.databind.cfg.MapperConfig.introspectClassAnnotations(MapperConfig.java:310)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createKeyDeserializer(BasicDeserializerFactory.java:1358)
            com.fasterxml.jackson.databind.deser.DeserializerCache.findKeyDeserializer(DeserializerCache.java:166) */
        deserializerCache.findKeyDeserializer(impl, beanDeserializerFactory, referenceType);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findKeyDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.DeserializerFactory, com.fasterxml.jackson.databind.JavaType)
    
    @Test(expected = IllegalArgumentException.class)
    public void testFindKeyDeserializer4() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.deser.KeyDeserializers[] _additionalKeyDeserializers = {null, null, null, null, null, null, null, null, null};
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_additionalKeyDeserializers", _additionalKeyDeserializers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        
        deserializerCache.findKeyDeserializer(impl, beanDeserializerFactory, arrayType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.DeserializerCache._hasCustomValueHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method _hasCustomValueHandler(com.fasterxml.jackson.databind.JavaType)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return false;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_hasCustomValueHandler(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (t.isContainerType()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void test_hasCustomValueHandler_NotTIsContainerType() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        
        Class deserializerCacheClazz = Class.forName("com.fasterxml.jackson.databind.deser.DeserializerCache");
        Class simpleTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method _hasCustomValueHandlerMethod = deserializerCacheClazz.getDeclaredMethod("_hasCustomValueHandler", simpleTypeType);
        _hasCustomValueHandlerMethod.setAccessible(true);
        java.lang.Object[] _hasCustomValueHandlerMethodArguments = new java.lang.Object[1];
        _hasCustomValueHandlerMethodArguments[0] = simpleType;
        boolean actual = ((Boolean) _hasCustomValueHandlerMethod.invoke(deserializerCache, _hasCustomValueHandlerMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_hasCustomValueHandler(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (t.isContainerType()): True}
 * @utbot.executesCondition {@code (ct != null): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void test_hasCustomValueHandler_CtEqualsNull() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        
        Class deserializerCacheClazz = Class.forName("com.fasterxml.jackson.databind.deser.DeserializerCache");
        Class collectionLikeTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method _hasCustomValueHandlerMethod = deserializerCacheClazz.getDeclaredMethod("_hasCustomValueHandler", collectionLikeTypeType);
        _hasCustomValueHandlerMethod.setAccessible(true);
        java.lang.Object[] _hasCustomValueHandlerMethodArguments = new java.lang.Object[1];
        _hasCustomValueHandlerMethodArguments[0] = collectionLikeType;
        boolean actual = ((Boolean) _hasCustomValueHandlerMethod.invoke(deserializerCache, _hasCustomValueHandlerMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_hasCustomValueHandler(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (t.isContainerType()): True}
 * @utbot.executesCondition {@code (ct != null): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void test_hasCustomValueHandler_CtEqualsNull_1() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        Class deserializerCacheClazz = Class.forName("com.fasterxml.jackson.databind.deser.DeserializerCache");
        Class mapLikeTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method _hasCustomValueHandlerMethod = deserializerCacheClazz.getDeclaredMethod("_hasCustomValueHandler", mapLikeTypeType);
        _hasCustomValueHandlerMethod.setAccessible(true);
        java.lang.Object[] _hasCustomValueHandlerMethodArguments = new java.lang.Object[1];
        _hasCustomValueHandlerMethodArguments[0] = mapLikeType;
        boolean actual = ((Boolean) _hasCustomValueHandlerMethod.invoke(deserializerCache, _hasCustomValueHandlerMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_hasCustomValueHandler(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (t.isContainerType()): True}
 * @utbot.executesCondition {@code (ct != null): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void test_hasCustomValueHandler_CtEqualsNull_2() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        
        Class deserializerCacheClazz = Class.forName("com.fasterxml.jackson.databind.deser.DeserializerCache");
        Class arrayTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method _hasCustomValueHandlerMethod = deserializerCacheClazz.getDeclaredMethod("_hasCustomValueHandler", arrayTypeType);
        _hasCustomValueHandlerMethod.setAccessible(true);
        java.lang.Object[] _hasCustomValueHandlerMethodArguments = new java.lang.Object[1];
        _hasCustomValueHandlerMethodArguments[0] = arrayType;
        boolean actual = ((Boolean) _hasCustomValueHandlerMethod.invoke(deserializerCache, _hasCustomValueHandlerMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method _hasCustomValueHandler(com.fasterxml.jackson.databind.JavaType)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (t.isContainerType()): True}
    /// invoke:
    ///     {@link com.fasterxml.jackson.databind.JavaType#getContentType()} once
    /// execute conditions:
    ///     {@code (ct != null): True}
    /// invoke:
    ///     {@link com.fasterxml.jackson.databind.JavaType#getValueHandler()} once
    /// return from: {@code return (ct.getValueHandler() != null) || (ct.getTypeHandler() != null);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_hasCustomValueHandler(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return (ct.getValueHandler() != null) || (ct.getTypeHandler() != null);}
 *  */
    @Test
    public void test_hasCustomValueHandler_CtGetValueHandlerNotEqualsNullOrCtGetTypeHandlerNotEqualsNull() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        short[] _valueHandler = {};
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        Class deserializerCacheClazz = Class.forName("com.fasterxml.jackson.databind.deser.DeserializerCache");
        Class collectionLikeTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method _hasCustomValueHandlerMethod = deserializerCacheClazz.getDeclaredMethod("_hasCustomValueHandler", collectionLikeTypeType);
        _hasCustomValueHandlerMethod.setAccessible(true);
        java.lang.Object[] _hasCustomValueHandlerMethodArguments = new java.lang.Object[1];
        _hasCustomValueHandlerMethodArguments[0] = collectionLikeType;
        boolean actual = ((Boolean) _hasCustomValueHandlerMethod.invoke(deserializerCache, _hasCustomValueHandlerMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_hasCustomValueHandler(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return (ct.getValueHandler() != null) || (ct.getTypeHandler() != null);}
 *  */
    @Test
    public void test_hasCustomValueHandler_CtGetValueHandlerNotEqualsNullOrCtGetTypeHandlerNotEqualsNull_1() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        int[] _typeHandler = {};
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        Class deserializerCacheClazz = Class.forName("com.fasterxml.jackson.databind.deser.DeserializerCache");
        Class collectionLikeTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method _hasCustomValueHandlerMethod = deserializerCacheClazz.getDeclaredMethod("_hasCustomValueHandler", collectionLikeTypeType);
        _hasCustomValueHandlerMethod.setAccessible(true);
        java.lang.Object[] _hasCustomValueHandlerMethodArguments = new java.lang.Object[1];
        _hasCustomValueHandlerMethodArguments[0] = collectionLikeType;
        boolean actual = ((Boolean) _hasCustomValueHandlerMethod.invoke(deserializerCache, _hasCustomValueHandlerMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_hasCustomValueHandler(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return (ct.getValueHandler() != null) || (ct.getTypeHandler() != null);}
 *  */
    @Test
    public void test_hasCustomValueHandler_CtGetValueHandlerEqualsNullOrCtGetTypeHandlerEqualsNull() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        Class deserializerCacheClazz = Class.forName("com.fasterxml.jackson.databind.deser.DeserializerCache");
        Class collectionLikeTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method _hasCustomValueHandlerMethod = deserializerCacheClazz.getDeclaredMethod("_hasCustomValueHandler", collectionLikeTypeType);
        _hasCustomValueHandlerMethod.setAccessible(true);
        java.lang.Object[] _hasCustomValueHandlerMethodArguments = new java.lang.Object[1];
        _hasCustomValueHandlerMethodArguments[0] = collectionLikeType;
        boolean actual = ((Boolean) _hasCustomValueHandlerMethod.invoke(deserializerCache, _hasCustomValueHandlerMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _hasCustomValueHandler(com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_hasCustomValueHandler(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#isContainerType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: t.isContainerType()
 *  */
    @Test
    public void test_hasCustomValueHandler_ThrowNullPointerException() throws Throwable  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._hasCustomValueHandler] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._hasCustomValueHandler(DeserializerCache.java:558) */
        Class deserializerCacheClazz = Class.forName("com.fasterxml.jackson.databind.deser.DeserializerCache");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method _hasCustomValueHandlerMethod = deserializerCacheClazz.getDeclaredMethod("_hasCustomValueHandler", javaTypeType);
        _hasCustomValueHandlerMethod.setAccessible(true);
        java.lang.Object[] _hasCustomValueHandlerMethodArguments = new java.lang.Object[1];
        _hasCustomValueHandlerMethodArguments[0] = ((Object) null);
        try {
            _hasCustomValueHandlerMethod.invoke(deserializerCache, _hasCustomValueHandlerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.DeserializerCache.modifyTypeByAnnotation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method modifyTypeByAnnotation(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#modifyTypeByAnnotation(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return type;}
 *  */
    @Test
    public void testModifyTypeByAnnotation_ReturnType() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
            SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
            
            Class deserializerCacheClazz = Class.forName("com.fasterxml.jackson.databind.deser.DeserializerCache");
            Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
            Class annotatedType = Class.forName("com.fasterxml.jackson.databind.introspect.Annotated");
            Class simpleTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Method modifyTypeByAnnotationMethod = deserializerCacheClazz.getDeclaredMethod("modifyTypeByAnnotation", implType, annotatedType, simpleTypeType);
            modifyTypeByAnnotationMethod.setAccessible(true);
            java.lang.Object[] modifyTypeByAnnotationMethodArguments = new java.lang.Object[3];
            modifyTypeByAnnotationMethodArguments[0] = impl;
            modifyTypeByAnnotationMethodArguments[1] = ((Object) null);
            modifyTypeByAnnotationMethodArguments[2] = simpleType;
            SimpleType actual = ((SimpleType) modifyTypeByAnnotationMethod.invoke(deserializerCache, modifyTypeByAnnotationMethodArguments));
            
            // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
            assertEquals(simpleType, actual);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#modifyTypeByAnnotation(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return type;}
 *  */
    @Test
    public void testModifyTypeByAnnotation_ReturnType_1() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
            CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
            int[] _valueHandler = {};
            setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
            setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            
            Class deserializerCacheClazz = Class.forName("com.fasterxml.jackson.databind.deser.DeserializerCache");
            Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
            Class annotatedType = Class.forName("com.fasterxml.jackson.databind.introspect.Annotated");
            Class collectionLikeTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Method modifyTypeByAnnotationMethod = deserializerCacheClazz.getDeclaredMethod("modifyTypeByAnnotation", implType, annotatedType, collectionLikeTypeType);
            modifyTypeByAnnotationMethod.setAccessible(true);
            java.lang.Object[] modifyTypeByAnnotationMethodArguments = new java.lang.Object[3];
            modifyTypeByAnnotationMethodArguments[0] = impl;
            modifyTypeByAnnotationMethodArguments[1] = ((Object) null);
            modifyTypeByAnnotationMethodArguments[2] = collectionLikeType;
            CollectionLikeType actual = ((CollectionLikeType) modifyTypeByAnnotationMethod.invoke(deserializerCache, modifyTypeByAnnotationMethodArguments));
            
            // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
            assertEquals(collectionLikeType, actual);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#modifyTypeByAnnotation(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findContentDeserializer(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return type;}
 *  */
    @Test
    public void testModifyTypeByAnnotation_AnnotationIntrospectorFindContentDeserializer() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
            CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
            setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            
            Class deserializerCacheClazz = Class.forName("com.fasterxml.jackson.databind.deser.DeserializerCache");
            Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
            Class annotatedType = Class.forName("com.fasterxml.jackson.databind.introspect.Annotated");
            Class collectionTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Method modifyTypeByAnnotationMethod = deserializerCacheClazz.getDeclaredMethod("modifyTypeByAnnotation", implType, annotatedType, collectionTypeType);
            modifyTypeByAnnotationMethod.setAccessible(true);
            java.lang.Object[] modifyTypeByAnnotationMethodArguments = new java.lang.Object[3];
            modifyTypeByAnnotationMethodArguments[0] = impl;
            modifyTypeByAnnotationMethodArguments[1] = ((Object) null);
            modifyTypeByAnnotationMethodArguments[2] = collectionType;
            CollectionType actual = ((CollectionType) modifyTypeByAnnotationMethod.invoke(deserializerCache, modifyTypeByAnnotationMethodArguments));
            
            JavaType collectionType_elementType = ((JavaType) getFieldValue(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType"));
            JavaType actual_elementType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType"));
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(collectionType_elementType, actual_elementType);
            
            String actual_canonicalName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.type.TypeBase", "_canonicalName"));
            assertNull(actual_canonicalName);
            
            Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
            assertNull(actual_class);
            
            int collectionType_hash = ((Integer) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            assertEquals(collectionType_hash, actual_hash);
            
            Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
            assertNull(actual_valueHandler);
            
            Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
            assertNull(actual_typeHandler);
            
            boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
            assertFalse(actual_asStatic);
            
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method modifyTypeByAnnotation(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#modifyTypeByAnnotation(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getAnnotationIntrospector()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: AnnotationIntrospector intr = ctxt.getAnnotationIntrospector();
 *  */
    @Test
    public void testModifyTypeByAnnotation_ThrowNullPointerException() throws Throwable  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache.modifyTypeByAnnotation] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache.modifyTypeByAnnotation(DeserializerCache.java:473) */
        Class deserializerCacheClazz = Class.forName("com.fasterxml.jackson.databind.deser.DeserializerCache");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class annotatedType = Class.forName("com.fasterxml.jackson.databind.introspect.Annotated");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method modifyTypeByAnnotationMethod = deserializerCacheClazz.getDeclaredMethod("modifyTypeByAnnotation", deserializationContextType, annotatedType, javaTypeType);
        modifyTypeByAnnotationMethod.setAccessible(true);
        java.lang.Object[] modifyTypeByAnnotationMethodArguments = new java.lang.Object[3];
        modifyTypeByAnnotationMethodArguments[0] = ((Object) null);
        modifyTypeByAnnotationMethodArguments[1] = ((Object) null);
        modifyTypeByAnnotationMethodArguments[2] = ((Object) null);
        try {
            modifyTypeByAnnotationMethod.invoke(deserializerCache, modifyTypeByAnnotationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#modifyTypeByAnnotation(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#isContainerType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: type.isContainerType()
 *  */
    @Test
    public void testModifyTypeByAnnotation_ThrowNullPointerException_2() throws Throwable  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache.modifyTypeByAnnotation] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.DeserializerCache.modifyTypeByAnnotation(DeserializerCache.java:484) */
            Class deserializerCacheClazz = Class.forName("com.fasterxml.jackson.databind.deser.DeserializerCache");
            Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
            Class annotatedType = Class.forName("com.fasterxml.jackson.databind.introspect.Annotated");
            Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Method modifyTypeByAnnotationMethod = deserializerCacheClazz.getDeclaredMethod("modifyTypeByAnnotation", implType, annotatedType, javaTypeType);
            modifyTypeByAnnotationMethod.setAccessible(true);
            java.lang.Object[] modifyTypeByAnnotationMethodArguments = new java.lang.Object[3];
            modifyTypeByAnnotationMethodArguments[0] = impl;
            modifyTypeByAnnotationMethodArguments[1] = ((Object) null);
            modifyTypeByAnnotationMethodArguments[2] = ((Object) null);
            try {
                modifyTypeByAnnotationMethod.invoke(deserializerCache, modifyTypeByAnnotationMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#modifyTypeByAnnotation(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#isContainerType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getKeyType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findDeserializationKeyType(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getKeyType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getContentType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findDeserializationContentType(com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getContentType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: contentType.getValueHandler() == null
 *  */
    @Test
    public void testModifyTypeByAnnotation_ThrowNullPointerException_3() throws Throwable  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
            CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache.modifyTypeByAnnotation] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.DeserializerCache.modifyTypeByAnnotation(DeserializerCache.java:524) */
            Class deserializerCacheClazz = Class.forName("com.fasterxml.jackson.databind.deser.DeserializerCache");
            Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
            Class annotatedType = Class.forName("com.fasterxml.jackson.databind.introspect.Annotated");
            Class collectionLikeTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Method modifyTypeByAnnotationMethod = deserializerCacheClazz.getDeclaredMethod("modifyTypeByAnnotation", implType, annotatedType, collectionLikeTypeType);
            modifyTypeByAnnotationMethod.setAccessible(true);
            java.lang.Object[] modifyTypeByAnnotationMethodArguments = new java.lang.Object[3];
            modifyTypeByAnnotationMethodArguments[0] = impl;
            modifyTypeByAnnotationMethodArguments[1] = ((Object) null);
            modifyTypeByAnnotationMethodArguments[2] = collectionLikeType;
            try {
                modifyTypeByAnnotationMethod.invoke(deserializerCache, modifyTypeByAnnotationMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#modifyTypeByAnnotation(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<?> subclass = intr.findDeserializationType(a, type);
 *  */
    @Test
    public void testModifyTypeByAnnotation_ThrowNullPointerException_1() throws Throwable  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache.modifyTypeByAnnotation] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache.modifyTypeByAnnotation(DeserializerCache.java:474) */
        Class deserializerCacheClazz = Class.forName("com.fasterxml.jackson.databind.deser.DeserializerCache");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class annotatedType = Class.forName("com.fasterxml.jackson.databind.introspect.Annotated");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method modifyTypeByAnnotationMethod = deserializerCacheClazz.getDeclaredMethod("modifyTypeByAnnotation", implType, annotatedType, javaTypeType);
        modifyTypeByAnnotationMethod.setAccessible(true);
        java.lang.Object[] modifyTypeByAnnotationMethodArguments = new java.lang.Object[3];
        modifyTypeByAnnotationMethodArguments[0] = impl;
        modifyTypeByAnnotationMethodArguments[1] = ((Object) null);
        modifyTypeByAnnotationMethodArguments[2] = ((Object) null);
        try {
            modifyTypeByAnnotationMethod.invoke(deserializerCache, modifyTypeByAnnotationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.DeserializerCache._handleUnknownKeyDeserializer
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method _handleUnknownKeyDeserializer(com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_handleUnknownKeyDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} in: throw new JsonMappingException("Can not find a (Map) Key deserializer for type " + type);
 *  */
    @Test(expected = JsonMappingException.class)
    public void test_handleUnknownKeyDeserializer_ThrowJsonMappingException() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        
        deserializerCache._handleUnknownKeyDeserializer(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.DeserializerCache.flushCachedDeserializers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method flushCachedDeserializers()
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#flushCachedDeserializers()}
 *  */
    @Test
    public void testFlushCachedDeserializers() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        
        deserializerCache.flushCachedDeserializers();
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#flushCachedDeserializers()}
 *  */
    @Test
    public void testFlushCachedDeserializers_1() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        ArrayBlockingQueueDeserializer arrayBlockingQueueDeserializer = ((ArrayBlockingQueueDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer"));
        _cachedDeserializers.put(arrayType, arrayBlockingQueueDeserializer);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        
        deserializerCache.flushCachedDeserializers();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method flushCachedDeserializers()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): True}
    /// invoke:
    ///     {@link org.utbot.engine.overrides.collections.RangeModifiableUnlimitedArray#get(int)} once,
    ///     {@link org.utbot.api.mock.UtMock#assume(boolean)} once,
    ///     {@link org.utbot.engine.overrides.UtOverrideMock#parameter(java.lang.Object)} twice,
    ///     {@link org.utbot.engine.overrides.collections.AssociativeArray#select(java.lang.Object)} once
    /// invoke:
    ///     {@link org.utbot.engine.overrides.collections.RangeModifiableUnlimitedArray#get(int)} once,
    ///     {@link org.utbot.api.mock.UtMock#assume(boolean)} once,
    ///     {@link org.utbot.engine.overrides.UtOverrideMock#parameter(java.lang.Object)} twice,
    ///     {@link org.utbot.engine.overrides.collections.AssociativeArray#select(java.lang.Object)} once,
    ///     {@link java.lang.Object#hashCode()} twice
    /// invoke:
    ///     {@link org.utbot.engine.overrides.collections.RangeModifiableUnlimitedArray#get(int)} once,
    ///     {@link org.utbot.api.mock.UtMock#assume(boolean)} twice,
    ///     {@link org.utbot.engine.overrides.UtOverrideMock#parameter(java.lang.Object)} twice,
    ///     {@link org.utbot.engine.overrides.collections.AssociativeArray#select(java.lang.Object)} once,
    ///     {@link java.lang.Object#hashCode()} twice
    /// execute conditions:
    ///     {@code (null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#flushCachedDeserializers()}
 *  */
    @Test
    public void testFlushCachedDeserializers_2() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        BeanAsArrayDeserializer beanAsArrayDeserializer = ((BeanAsArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer"));
        _cachedDeserializers.put(mapLikeType, beanAsArrayDeserializer);
        MapLikeType mapLikeType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        _cachedDeserializers.put(mapLikeType1, beanAsArrayDeserializer);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        
        deserializerCache.flushCachedDeserializers();
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#flushCachedDeserializers()}
 *  */
    @Test
    public void testFlushCachedDeserializers_3() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ArrayBlockingQueueDeserializer arrayBlockingQueueDeserializer = ((ArrayBlockingQueueDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer"));
        _cachedDeserializers.put(collectionLikeType, arrayBlockingQueueDeserializer);
        CollectionLikeType collectionLikeType1 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        _cachedDeserializers.put(collectionLikeType1, arrayBlockingQueueDeserializer);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        
        deserializerCache.flushCachedDeserializers();
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#flushCachedDeserializers()}
 *  */
    @Test
    public void testFlushCachedDeserializers_4() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        DateDeserializers.SqlDateDeserializer sqlDateDeserializer = ((DateDeserializers.SqlDateDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer"));
        _cachedDeserializers.put(referenceType, sqlDateDeserializer);
        ReferenceType referenceType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        DateDeserializers.SqlDateDeserializer sqlDateDeserializer1 = ((DateDeserializers.SqlDateDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer"));
        _cachedDeserializers.put(referenceType1, sqlDateDeserializer1);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        
        deserializerCache.flushCachedDeserializers();
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#flushCachedDeserializers()}
 *  */
    @Test
    public void testFlushCachedDeserializers_5() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        DateDeserializers.SqlDateDeserializer sqlDateDeserializer = ((DateDeserializers.SqlDateDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer"));
        _cachedDeserializers.put(simpleType, sqlDateDeserializer);
        SimpleType simpleType1 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        DateDeserializers.SqlDateDeserializer sqlDateDeserializer1 = ((DateDeserializers.SqlDateDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer"));
        _cachedDeserializers.put(simpleType1, sqlDateDeserializer1);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        
        deserializerCache.flushCachedDeserializers();
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#flushCachedDeserializers()}
 *  */
    @Test
    public void testFlushCachedDeserializers_6() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        DateDeserializers.SqlDateDeserializer sqlDateDeserializer = ((DateDeserializers.SqlDateDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer"));
        _cachedDeserializers.put(arrayType, sqlDateDeserializer);
        ArrayType arrayType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        DateDeserializers.SqlDateDeserializer sqlDateDeserializer1 = ((DateDeserializers.SqlDateDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer"));
        _cachedDeserializers.put(arrayType1, sqlDateDeserializer1);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        
        deserializerCache.flushCachedDeserializers();
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#flushCachedDeserializers()}
 *  */
    @Test
    public void testFlushCachedDeserializers_7() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ByteBufferDeserializer byteBufferDeserializer = ((ByteBufferDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer"));
        _cachedDeserializers.put(mapType, byteBufferDeserializer);
        _cachedDeserializers.put(null, null);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        
        deserializerCache.flushCachedDeserializers();
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#flushCachedDeserializers()}
 *  */
    @Test
    public void testFlushCachedDeserializers_8() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        UntypedObjectDeserializer.Vanilla vanilla = ((UntypedObjectDeserializer.Vanilla) createInstance("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer$Vanilla"));
        _cachedDeserializers.put(collectionType, vanilla);
        _cachedDeserializers.put(null, null);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        
        deserializerCache.flushCachedDeserializers();
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#flushCachedDeserializers()}
 *  */
    @Test
    public void testFlushCachedDeserializers_9() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        NumberDeserializers.BigIntegerDeserializer bigIntegerDeserializer = ((NumberDeserializers.BigIntegerDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigIntegerDeserializer"));
        _cachedDeserializers.put(referenceType, bigIntegerDeserializer);
        _cachedDeserializers.put(null, null);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        
        deserializerCache.flushCachedDeserializers();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method flushCachedDeserializers()
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#flushCachedDeserializers()}
 * @utbot.invokes {@link java.util.concurrent.ConcurrentHashMap#clear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _cachedDeserializers.clear();
 *  */
    @Test
    public void testFlushCachedDeserializers_ThrowNullPointerException() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache.flushCachedDeserializers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache.flushCachedDeserializers(DeserializerCache.java:104) */
        deserializerCache.flushCachedDeserializers();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method flushCachedDeserializers()
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#flushCachedDeserializers()}
     */
    @Test
    public void testFlushCachedDeserializers1() {
        DeserializerCache deserializerCache = new DeserializerCache();
        
        deserializerCache.flushCachedDeserializers();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _createDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.DeserializerFactory, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getConfig()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final DeserializationConfig config = ctxt.getConfig();
 *  */
    @Test
    public void test_createDeserializer_ThrowNullPointerException() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:321) */
        deserializerCache._createDeserializer(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (type.isAbstract() || type.isMapLikeType()): True}
 * @utbot.executesCondition {@code (type.isCollectionLikeType()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: type = factory.mapAbstractType(config, type);
 *  */
    @Test
    public void test_createDeserializer_ThrowNullPointerException_2() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:325) */
        deserializerCache._createDeserializer(impl, null, mapType);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (type.isAbstract() || type.isMapLikeType()): True}
 * @utbot.executesCondition {@code (type.isCollectionLikeType()): True}
 * @utbot.executesCondition {@code (if (type.isAbstract() || type.isMapLikeType() || type.isCollectionLikeType()) {
 *     type = factory.mapAbstractType(config, type);
 * }): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: type = factory.mapAbstractType(config, type);
 *  */
    @Test
    public void test_createDeserializer_ThrowNullPointerException_6() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:325) */
        deserializerCache._createDeserializer(impl, null, collectionLikeType);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (type.isAbstract() || type.isMapLikeType()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: type = factory.mapAbstractType(config, type);
 *  */
    @Test
    public void test_createDeserializer_ThrowNullPointerException_7() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.MapperConfig.getClassIntrospector(MapperConfig.java:215)
            com.fasterxml.jackson.databind.DeserializationConfig.introspect(DeserializationConfig.java:724)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:327) */
        deserializerCache._createDeserializer(impl, null, referenceType);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (type.isAbstract() || type.isMapLikeType()): True}
 * @utbot.executesCondition {@code (type.isCollectionLikeType()): True}
 * @utbot.executesCondition {@code (if (type.isAbstract() || type.isMapLikeType() || type.isCollectionLikeType()) {
 *     type = factory.mapAbstractType(config, type);
 * }): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: BeanDescription beanDesc = config.introspect(type);
 *  */
    @Test
    public void test_createDeserializer_ThrowNullPointerException_9() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:327) */
        deserializerCache._createDeserializer(impl, null, arrayType);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: type.isAbstract() || type.isMapLikeType() || type.isCollectionLikeType()
 *  */
    @Test
    public void test_createDeserializer_ThrowNullPointerException_1() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:324) */
        deserializerCache._createDeserializer(impl, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (type.isAbstract() || type.isMapLikeType()): True}
 * @utbot.executesCondition {@code (type.isCollectionLikeType()): True}
 * @utbot.executesCondition {@code (if (type.isAbstract() || type.isMapLikeType() || type.isCollectionLikeType()) {
 *     type = factory.mapAbstractType(config, type);
 * }): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: BeanDescription beanDesc = config.introspect(type);
 *  */
    @Test
    public void test_createDeserializer_ThrowNullPointerException_8() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:327) */
        deserializerCache._createDeserializer(impl, null, referenceType);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (type.isAbstract() || type.isMapLikeType()): True}
 * @utbot.executesCondition {@code (type.isCollectionLikeType()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: type = factory.mapAbstractType(config, type);
 *  */
    @Test
    public void test_createDeserializer_ThrowNullPointerException_5() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.AbstractTypeResolver[] _abstractTypeResolvers = {null};
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_abstractTypeResolvers", _abstractTypeResolvers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._mapAbstractType2(BasicDeserializerFactory.java:214)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.mapAbstractType(BasicDeserializerFactory.java:189)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:325) */
        deserializerCache._createDeserializer(impl, beanDeserializerFactory, mapLikeType);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (type.isAbstract() || type.isMapLikeType()): True}
 * @utbot.executesCondition {@code (type.isCollectionLikeType()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: type = factory.mapAbstractType(config, type);
 *  */
    @Test
    public void test_createDeserializer_ThrowNullPointerException_3() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._mapAbstractType2(BasicDeserializerFactory.java:212)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.mapAbstractType(BasicDeserializerFactory.java:189)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:325) */
        deserializerCache._createDeserializer(impl, beanDeserializerFactory, mapLikeType);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (type.isAbstract() || type.isMapLikeType()): True}
 * @utbot.executesCondition {@code (type.isCollectionLikeType()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: BeanDescription beanDesc = config.introspect(type);
 *  */
    @Test
    public void test_createDeserializer_ThrowNullPointerException_4() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.AbstractTypeResolver[] _abstractTypeResolvers = {};
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_abstractTypeResolvers", _abstractTypeResolvers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:327) */
        deserializerCache._createDeserializer(impl, beanDeserializerFactory, mapLikeType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _createDeserializer2(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.DeserializerFactory, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createDeserializer2(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.executesCondition {@code (type.isEnumType()): False}
 * @utbot.executesCondition {@code (type.isContainerType()): True}
 * @utbot.executesCondition {@code (type.isArrayType()): False}
 * @utbot.executesCondition {@code (type.isMapLikeType()): False}
 * @utbot.executesCondition {@code (type.isCollectionLikeType()): True}
 * @utbot.executesCondition {@code (format == null): True}
 * @utbot.executesCondition {@code (clt.isTrueCollectionType()): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.DeserializerFactory#createCollectionLikeDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.CollectionLikeType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return factory.createCollectionLikeDeserializer(ctxt, clt, beanDesc);
 *  */
    @Test
    public void test_createDeserializer2_ThrowClassCastException() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        short[] _valueHandler = {};
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2] produces [java.lang.ClassCastException: class [S cannot be cast to class com.fasterxml.jackson.databind.JsonDeserializer ([S is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.JsonDeserializer is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7324b12e)]
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createCollectionLikeDeserializer(BasicDeserializerFactory.java:1070)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2(DeserializerCache.java:396) */
        deserializerCache._createDeserializer2(impl, beanDeserializerFactory, collectionLikeType, basicBeanDescription);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createDeserializer2(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getConfig()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final DeserializationConfig config = ctxt.getConfig();
 *  */
    @Test
    public void test_createDeserializer2_ThrowNullPointerException() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2(DeserializerCache.java:368) */
        deserializerCache._createDeserializer2(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createDeserializer2(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.executesCondition {@code (type.isEnumType()): False}
 * @utbot.executesCondition {@code (type.isContainerType()): False}
 * @utbot.executesCondition {@code (JsonNode.class.isAssignableFrom(type.getRawClass())): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.DeserializerFactory#createBeanDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return factory.createBeanDeserializer(ctxt, type, beanDesc);
 *  */
    @Test
    public void test_createDeserializer2_ThrowNullPointerException_2() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2(DeserializerCache.java:403) */
        deserializerCache._createDeserializer2(impl, null, simpleType, null);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createDeserializer2(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.executesCondition {@code (type.isEnumType()): False}
 * @utbot.executesCondition {@code (type.isContainerType()): True}
 * @utbot.executesCondition {@code (type.isArrayType()): False}
 * @utbot.executesCondition {@code (type.isMapLikeType()): False}
 * @utbot.executesCondition {@code (type.isCollectionLikeType()): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#findExpectedFormat(com.fasterxml.jackson.annotation.JsonFormat.Value)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonFormat.Value format = beanDesc.findExpectedFormat(null);
 *  */
    @Test
    public void test_createDeserializer2_ThrowNullPointerException_4() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2(DeserializerCache.java:390) */
        deserializerCache._createDeserializer2(impl, null, collectionLikeType, null);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createDeserializer2(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: type.isEnumType()
 *  */
    @Test
    public void test_createDeserializer2_ThrowNullPointerException_1() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2(DeserializerCache.java:370) */
        deserializerCache._createDeserializer2(impl, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createDeserializer2(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.executesCondition {@code (type.isEnumType()): False}
 * @utbot.executesCondition {@code (type.isContainerType()): True}
 * @utbot.executesCondition {@code (type.isArrayType()): False}
 * @utbot.executesCondition {@code (type.isMapLikeType()): False}
 * @utbot.executesCondition {@code (type.isCollectionLikeType()): True}
 * @utbot.executesCondition {@code (format == null): True}
 * @utbot.executesCondition {@code (clt.isTrueCollectionType()): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.DeserializerFactory#createCollectionLikeDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.CollectionLikeType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return factory.createCollectionLikeDeserializer(ctxt, clt, beanDesc);
 *  */
    @Test
    public void test_createDeserializer2_ThrowNullPointerException_5() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2(DeserializerCache.java:396) */
        deserializerCache._createDeserializer2(impl, null, collectionLikeType, basicBeanDescription);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createDeserializer2(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.executesCondition {@code (type.isEnumType()): False}
 * @utbot.executesCondition {@code (type.isContainerType()): False}
 * @utbot.executesCondition {@code (JsonNode.class.isAssignableFrom(type.getRawClass())): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.DeserializerFactory#createBeanDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.returnsFrom {@code return factory.createBeanDeserializer(ctxt, type, beanDesc);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return factory.createBeanDeserializer(ctxt, type, beanDesc);
 *  */
    @Test
    public void test_createDeserializer2_ThrowNullPointerException_3() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.deser.Deserializers[] _additionalDeserializers = new com.fasterxml.jackson.databind.deser.Deserializers[1];
        CoreXMLDeserializers coreXMLDeserializers = ((CoreXMLDeserializers) createInstance("com.fasterxml.jackson.databind.ext.CoreXMLDeserializers"));
        _additionalDeserializers[0] = ((Deserializers) coreXMLDeserializers);
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_additionalDeserializers", _additionalDeserializers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig.hasAbstractTypeResolvers(DeserializerFactoryConfig.java:184)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.findDefaultDeserializer(BasicDeserializerFactory.java:1510)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.findStdDeserializer(BeanDeserializerFactory.java:167)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBeanDeserializer(BeanDeserializerFactory.java:132)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2(DeserializerCache.java:403) */
        deserializerCache._createDeserializer2(impl, beanDeserializerFactory, simpleType, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.DeserializerCache._handleUnknownValueDeserializer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _handleUnknownValueDeserializer(com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_handleUnknownValueDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<?> rawClass = type.getRawClass();
 *  */
    @Test
    public void test_handleUnknownValueDeserializer_ThrowNullPointerException() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._handleUnknownValueDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._handleUnknownValueDeserializer(DeserializerCache.java:594) */
        deserializerCache._handleUnknownValueDeserializer(null);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_handleUnknownValueDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (!ClassUtil.isConcrete(rawClass)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#isConcrete(java.lang.Class)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new JsonMappingException("Can not find a Value deserializer for type " + type);
 *  */
    @Test
    public void test_handleUnknownValueDeserializer_ThrowNullPointerException_1() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._handleUnknownValueDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:84)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:171)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.deser.DeserializerCache._handleUnknownValueDeserializer(DeserializerCache.java:598) */
        deserializerCache._handleUnknownValueDeserializer(referenceType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.DeserializerCache.findValueDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.DeserializerFactory, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#findValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return deser;}
 *  */
    @Test
    public void testFindValueDeserializer_ReturnDeser_1() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        _cachedDeserializers.put(collectionLikeType, stdDelegatingDeserializer);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        
        StdDelegatingDeserializer actual = ((StdDelegatingDeserializer) deserializerCache.findValueDeserializer(null, null, collectionLikeType));
        
        StdDelegatingDeserializer expected = new StdDelegatingDeserializer(((Converter) null));
        
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#findValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return deser;}
 *  */
    @Test
    public void testFindValueDeserializer_ReturnDeser() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        NumberDeserializers.ShortDeserializer shortDeserializer = ((NumberDeserializers.ShortDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer"));
        _cachedDeserializers.put(collectionType, shortDeserializer);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        
        NumberDeserializers.ShortDeserializer actual = ((NumberDeserializers.ShortDeserializer) deserializerCache.findValueDeserializer(null, null, collectionType));
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.DeserializerFactory, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#findValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_findCachedDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: JsonDeserializer<Object> deser = _findCachedDeserializer(propertyType);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFindValueDeserializer_ThrowIllegalArgumentException() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        
        deserializerCache.findValueDeserializer(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.DeserializerCache._findCachedDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method _findCachedDeserializer(com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_findCachedDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return _cachedDeserializers.get(type);}
 *  */
    @Test
    public void test_findCachedDeserializer_Return_cachedDeserializersGet() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        Object actual = deserializerCache._findCachedDeserializer(referenceType);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_findCachedDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_findCachedDeserializer_ReturnNull() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        byte[] _valueHandler = {};
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        JsonDeserializer actual = deserializerCache._findCachedDeserializer(collectionLikeType);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_findCachedDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_findCachedDeserializer_ReturnNull_1() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        short[] _typeHandler = {};
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        JsonDeserializer actual = deserializerCache._findCachedDeserializer(collectionLikeType);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_findCachedDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return _cachedDeserializers.get(type);}
 *  */
    @Test
    public void test_findCachedDeserializer_Return_cachedDeserializersGet_1() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        _cachedDeserializers.put(referenceType, null);
        ReferenceType referenceType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CoreXMLDeserializers.Std std = ((CoreXMLDeserializers.Std) createInstance("com.fasterxml.jackson.databind.ext.CoreXMLDeserializers$Std"));
        _cachedDeserializers.put(referenceType1, std);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        
        JsonDeserializer actual = deserializerCache._findCachedDeserializer(referenceType);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_findCachedDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return _cachedDeserializers.get(type);}
 *  */
    @Test
    public void test_findCachedDeserializer_Return_cachedDeserializersGet_2() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        _cachedDeserializers.put(simpleType, null);
        SimpleType simpleType1 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        _cachedDeserializers.put(simpleType1, builderBasedDeserializer);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        
        JsonDeserializer actual = deserializerCache._findCachedDeserializer(simpleType);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method _findCachedDeserializer(com.fasterxml.jackson.databind.JavaType)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): False},
    ///     {@code (_hasCustomValueHandler(type)): False}
    /// invoke:
    ///     {@link java.util.concurrent.ConcurrentHashMap#get(java.lang.Object)} once,
    ///     {@link org.utbot.engine.overrides.collections.UtHashMap#preconditionCheck()} once,
    ///     {@link org.utbot.engine.overrides.UtOverrideMock#alreadyVisited(java.lang.Object)} once
    /// execute conditions:
    ///     {@code (null): False}
    /// invoke:
    ///     {@link org.utbot.engine.overrides.collections.UtHashMap#setEqualGenericType(org.utbot.engine.overrides.collections.RangeModifiableUnlimitedArray)} once,
    ///     {@link org.utbot.engine.overrides.collections.UtHashMap#setEqualGenericType(org.utbot.engine.overrides.collections.AssociativeArray)} once
    /// execute conditions:
    ///     {@code (null): True}
    /// invoke:
    ///     {@link org.utbot.api.mock.UtMock#assume(boolean)} once,
    ///     {@link org.utbot.engine.overrides.collections.RangeModifiableUnlimitedArray#get(int)} once
    /// invoke:
    ///     {@link org.utbot.api.mock.UtMock#assume(boolean)} once,
    ///     {@link org.utbot.engine.overrides.collections.RangeModifiableUnlimitedArray#get(int)} once,
    ///     {@link java.lang.Object#hashCode()} twice
    /// invoke:
    ///     {@link org.utbot.api.mock.UtMock#assume(boolean)} once,
    ///     {@link org.utbot.engine.overrides.collections.RangeModifiableUnlimitedArray#get(int)} once,
    ///     {@link java.lang.Object#hashCode()} twice,
    ///     {@link org.utbot.engine.overrides.UtOverrideMock#visit(java.lang.Object)} once,
    ///     {@link org.utbot.engine.overrides.collections.UtHashMap#preconditionCheck()} once,
    ///     org.utbot.engine.overrides.collections.UtHashMap#getKeyIndex(java.lang.Object) once
    /// invoke:
    ///     {@link org.utbot.api.mock.UtMock#assume(boolean)} once,
    ///     {@link org.utbot.engine.overrides.collections.RangeModifiableUnlimitedArray#get(int)} once,
    ///     {@link java.lang.Object#hashCode()} twice,
    ///     {@link org.utbot.engine.overrides.UtOverrideMock#visit(java.lang.Object)} once,
    ///     {@link org.utbot.engine.overrides.collections.UtHashMap#preconditionCheck()} once,
    ///     org.utbot.engine.overrides.collections.UtHashMap#getKeyIndex(java.lang.Object) twice,
    ///     {@link java.util.concurrent.ConcurrentHashMap#get(java.lang.Object)} once
    /// return from: {@code return _cachedDeserializers.get(type);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_findCachedDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return _cachedDeserializers.get(type);}
 *  */
    @Test
    public void test_findCachedDeserializer_Return_cachedDeserializersGet_3() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        UUIDDeserializer uUIDDeserializer = ((UUIDDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.UUIDDeserializer"));
        _cachedDeserializers.put(mapLikeType, uUIDDeserializer);
        MapLikeType mapLikeType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        _cachedDeserializers.put(mapLikeType1, uUIDDeserializer);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        Object actual = deserializerCache._findCachedDeserializer(referenceType);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_findCachedDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return _cachedDeserializers.get(type);}
 *  */
    @Test
    public void test_findCachedDeserializer_Return_cachedDeserializersGet_4() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        NumberDeserializers.BigDecimalDeserializer bigDecimalDeserializer = ((NumberDeserializers.BigDecimalDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigDecimalDeserializer"));
        _cachedDeserializers.put(collectionLikeType, bigDecimalDeserializer);
        CollectionLikeType collectionLikeType1 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        _cachedDeserializers.put(collectionLikeType1, bigDecimalDeserializer);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        Object actual = deserializerCache._findCachedDeserializer(referenceType);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_findCachedDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return _cachedDeserializers.get(type);}
 *  */
    @Test
    public void test_findCachedDeserializer_Return_cachedDeserializersGet_5() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        AbstractDeserializer abstractDeserializer = ((AbstractDeserializer) createInstance("com.fasterxml.jackson.databind.deser.AbstractDeserializer"));
        _cachedDeserializers.put(simpleType, abstractDeserializer);
        SimpleType simpleType1 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        _cachedDeserializers.put(simpleType1, abstractDeserializer);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        Object actual = deserializerCache._findCachedDeserializer(referenceType);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_findCachedDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return _cachedDeserializers.get(type);}
 *  */
    @Test
    public void test_findCachedDeserializer_Return_cachedDeserializersGet_6() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        AbstractDeserializer abstractDeserializer = ((AbstractDeserializer) createInstance("com.fasterxml.jackson.databind.deser.AbstractDeserializer"));
        _cachedDeserializers.put(arrayType, abstractDeserializer);
        ArrayType arrayType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        _cachedDeserializers.put(arrayType1, abstractDeserializer);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        Object actual = deserializerCache._findCachedDeserializer(referenceType);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_findCachedDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return _cachedDeserializers.get(type);}
 *  */
    @Test
    public void test_findCachedDeserializer_Return_cachedDeserializersGet_7() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        _cachedDeserializers.put(null, null);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        AtomicReferenceDeserializer atomicReferenceDeserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        _cachedDeserializers.put(referenceType, atomicReferenceDeserializer);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        ReferenceType referenceType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        Object actual = deserializerCache._findCachedDeserializer(referenceType1);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_findCachedDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return _cachedDeserializers.get(type);}
 *  */
    @Test
    public void test_findCachedDeserializer_Return_cachedDeserializersGet_8() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CoreXMLDeserializers.Std std = ((CoreXMLDeserializers.Std) createInstance("com.fasterxml.jackson.databind.ext.CoreXMLDeserializers$Std"));
        _cachedDeserializers.put(collectionLikeType, std);
        _cachedDeserializers.put(null, null);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        Object actual = deserializerCache._findCachedDeserializer(referenceType);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_findCachedDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return _cachedDeserializers.get(type);}
 *  */
    @Test
    public void test_findCachedDeserializer_Return_cachedDeserializersGet_9() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        CoreXMLDeserializers.Std std = ((CoreXMLDeserializers.Std) createInstance("com.fasterxml.jackson.databind.ext.CoreXMLDeserializers$Std"));
        _cachedDeserializers.put(mapType, std);
        _cachedDeserializers.put(null, null);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        Object actual = deserializerCache._findCachedDeserializer(referenceType);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _findCachedDeserializer(com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_findCachedDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (type == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: type == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void test_findCachedDeserializer_ThrowIllegalArgumentException() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        
        deserializerCache._findCachedDeserializer(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _findCachedDeserializer(com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_findCachedDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _cachedDeserializers.get(type);
 *  */
    @Test
    public void test_findCachedDeserializer_ThrowNullPointerException() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._findCachedDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._findCachedDeserializer(DeserializerCache.java:210) */
        deserializerCache._findCachedDeserializer(simpleType);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_findCachedDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _cachedDeserializers.get(type);
 *  */
    @Test
    public void test_findCachedDeserializer_ThrowNullPointerException_1() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._findCachedDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._findCachedDeserializer(DeserializerCache.java:210) */
        deserializerCache._findCachedDeserializer(collectionLikeType);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_findCachedDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _cachedDeserializers.get(type);
 *  */
    @Test
    public void test_findCachedDeserializer_ThrowNullPointerException_3() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._findCachedDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._findCachedDeserializer(DeserializerCache.java:210) */
        deserializerCache._findCachedDeserializer(mapLikeType);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_findCachedDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _cachedDeserializers.get(type);
 *  */
    @Test
    public void test_findCachedDeserializer_ThrowNullPointerException_4() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._findCachedDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._findCachedDeserializer(DeserializerCache.java:210) */
        deserializerCache._findCachedDeserializer(arrayType);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_findCachedDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _cachedDeserializers.get(type);
 *  */
    @Test
    public void test_findCachedDeserializer_ThrowNullPointerException_2() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._findCachedDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._findCachedDeserializer(DeserializerCache.java:210) */
        deserializerCache._findCachedDeserializer(collectionLikeType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.DeserializerCache.findConvertingDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findConvertingDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JsonDeserializer)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#findConvertingDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.returnsFrom {@code return deser;}
 *  */
    @Test
    public void testFindConvertingDeserializer_ReturnDeser() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
            
            JsonDeserializer actual = deserializerCache.findConvertingDeserializer(impl, null, null);
            
            assertNull(actual);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#findConvertingDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.returnsFrom {@code return deser;}
 *  */
    @Test
    public void testFindConvertingDeserializer_ReturnDeser_1() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        JsonDeserializer actual = deserializerCache.findConvertingDeserializer(impl, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findConvertingDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JsonDeserializer)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#findConvertingDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JsonDeserializer)}
     */
    @Test
    public void testFindConvertingDeserializerThrowsNPE() throws JsonMappingException  {
        DeserializerCache deserializerCache = new DeserializerCache();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache.findConvertingDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache.findConverter(DeserializerCache.java:446)
            com.fasterxml.jackson.databind.deser.DeserializerCache.findConvertingDeserializer(DeserializerCache.java:434) */
        deserializerCache.findConvertingDeserializer(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCache2
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _createAndCache2(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.DeserializerFactory, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createAndCache2(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: deser = _createDeserializer(ctxt, factory, type);
 *  */
    @Test
    public void test_createAndCache2_ThrowNullPointerException_2() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.AbstractTypeResolver[] _abstractTypeResolvers = {null};
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_abstractTypeResolvers", _abstractTypeResolvers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCache2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.MapperConfig.getClassIntrospector(MapperConfig.java:215)
            com.fasterxml.jackson.databind.DeserializationConfig.introspect(DeserializationConfig.java:724)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:327)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCache2(DeserializerCache.java:264) */
        deserializerCache._createAndCache2(impl, beanDeserializerFactory, referenceType);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createAndCache2(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: deser = _createDeserializer(ctxt, factory, type);
 *  */
    @Test
    public void test_createAndCache2_ThrowNullPointerException() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCache2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:327)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCache2(DeserializerCache.java:264) */
        deserializerCache._createAndCache2(impl, beanDeserializerFactory, referenceType);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createAndCache2(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: deser = _createDeserializer(ctxt, factory, type);
 *  */
    @Test
    public void test_createAndCache2_ThrowNullPointerException_1() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCache2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._mapAbstractType2(BasicDeserializerFactory.java:212)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.mapAbstractType(BasicDeserializerFactory.java:189)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:325)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCache2(DeserializerCache.java:264) */
        deserializerCache._createAndCache2(impl, beanDeserializerFactory, collectionLikeType);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createAndCache2(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: deser = _createDeserializer(ctxt, factory, type);
 *  */
    @Test
    public void test_createAndCache2_ThrowNullPointerException_3() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCache2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._mapAbstractType2(BasicDeserializerFactory.java:212)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.mapAbstractType(BasicDeserializerFactory.java:189)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:325)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCache2(DeserializerCache.java:264) */
        deserializerCache._createAndCache2(impl, beanDeserializerFactory, mapLikeType);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method _createAndCache2(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.DeserializerFactory, com.fasterxml.jackson.databind.JavaType)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createAndCache2(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
     */
    @Test
    public void test_createAndCache2ThrowsNPE() throws JsonMappingException  {
        DeserializerCache deserializerCache = new DeserializerCache();
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCache2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:321)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCache2(DeserializerCache.java:264) */
        deserializerCache._createAndCache2(null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _createAndCache2(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.DeserializerFactory, com.fasterxml.jackson.databind.JavaType)
    
    @Test
    public void test_createAndCache21() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCache2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:327)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCache2(DeserializerCache.java:264) */
        deserializerCache._createAndCache2(impl, null, arrayType);
    }
    
    @Test
    public void test_createAndCache22() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.AbstractTypeResolver[] _abstractTypeResolvers = new com.fasterxml.jackson.databind.AbstractTypeResolver[9];
        SimpleAbstractTypeResolver simpleAbstractTypeResolver = ((SimpleAbstractTypeResolver) createInstance("com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver"));
        _abstractTypeResolvers[0] = ((AbstractTypeResolver) simpleAbstractTypeResolver);
        _abstractTypeResolvers[1] = ((AbstractTypeResolver) simpleAbstractTypeResolver);
        _abstractTypeResolvers[2] = ((AbstractTypeResolver) simpleAbstractTypeResolver);
        _abstractTypeResolvers[3] = ((AbstractTypeResolver) simpleAbstractTypeResolver);
        _abstractTypeResolvers[4] = ((AbstractTypeResolver) simpleAbstractTypeResolver);
        _abstractTypeResolvers[5] = ((AbstractTypeResolver) simpleAbstractTypeResolver);
        _abstractTypeResolvers[6] = ((AbstractTypeResolver) simpleAbstractTypeResolver);
        _abstractTypeResolvers[7] = ((AbstractTypeResolver) simpleAbstractTypeResolver);
        _abstractTypeResolvers[8] = ((AbstractTypeResolver) simpleAbstractTypeResolver);
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_abstractTypeResolvers", _abstractTypeResolvers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCache2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver.findTypeMapping(SimpleAbstractTypeResolver.java:75)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._mapAbstractType2(BasicDeserializerFactory.java:214)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.mapAbstractType(BasicDeserializerFactory.java:189)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:325)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCache2(DeserializerCache.java:264) */
        deserializerCache._createAndCache2(impl, beanDeserializerFactory, collectionLikeType);
    }
    
    @Test
    public void test_createAndCache23() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.AbstractTypeResolver[] _abstractTypeResolvers = new com.fasterxml.jackson.databind.AbstractTypeResolver[9];
        SimpleAbstractTypeResolver simpleAbstractTypeResolver = ((SimpleAbstractTypeResolver) createInstance("com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver"));
        HashMap _mappings = new HashMap();
        setField(simpleAbstractTypeResolver, "com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "_mappings", _mappings);
        _abstractTypeResolvers[0] = ((AbstractTypeResolver) simpleAbstractTypeResolver);
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_abstractTypeResolvers", _abstractTypeResolvers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCache2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._mapAbstractType2(BasicDeserializerFactory.java:214)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.mapAbstractType(BasicDeserializerFactory.java:189)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:325)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCache2(DeserializerCache.java:264) */
        deserializerCache._createAndCache2(impl, beanDeserializerFactory, collectionLikeType);
    }
    
    @Test
    public void test_createAndCache24() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.AbstractTypeResolver[] _abstractTypeResolvers = new com.fasterxml.jackson.databind.AbstractTypeResolver[9];
        SimpleAbstractTypeResolver simpleAbstractTypeResolver = ((SimpleAbstractTypeResolver) createInstance("com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver"));
        HashMap _mappings = new HashMap();
        setField(simpleAbstractTypeResolver, "com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "_mappings", _mappings);
        _abstractTypeResolvers[0] = ((AbstractTypeResolver) simpleAbstractTypeResolver);
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_abstractTypeResolvers", _abstractTypeResolvers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCache2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._mapAbstractType2(BasicDeserializerFactory.java:214)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.mapAbstractType(BasicDeserializerFactory.java:189)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:325)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCache2(DeserializerCache.java:264) */
        deserializerCache._createAndCache2(impl, beanDeserializerFactory, mapType);
    }
    
    @Test
    public void test_createAndCache25() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        BasicClassIntrospector _classIntrospector = ((BasicClassIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_classIntrospector", _classIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.AbstractTypeResolver[] _abstractTypeResolvers = {};
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_abstractTypeResolvers", _abstractTypeResolvers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCache2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.MapperConfigBase.findMixInClassFor(MapperConfigBase.java:481)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.<init>(AnnotatedClass.java:122)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(AnnotatedClass.java:141)
            com.fasterxml.jackson.databind.introspect.BasicClassIntrospector.collectProperties(BasicClassIntrospector.java:195)
            com.fasterxml.jackson.databind.introspect.BasicClassIntrospector.forDeserialization(BasicClassIntrospector.java:110)
            com.fasterxml.jackson.databind.introspect.BasicClassIntrospector.forDeserialization(BasicClassIntrospector.java:15)
            com.fasterxml.jackson.databind.DeserializationConfig.introspect(DeserializationConfig.java:724)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:327)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCache2(DeserializerCache.java:264) */
        deserializerCache._createAndCache2(impl, beanDeserializerFactory, collectionLikeType);
    }
    
    @Test
    public void test_createAndCache26() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        BasicClassIntrospector _classIntrospector = ((BasicClassIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_classIntrospector", _classIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.AbstractTypeResolver[] _abstractTypeResolvers = {};
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_abstractTypeResolvers", _abstractTypeResolvers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCache2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.MapperConfigBase.findMixInClassFor(MapperConfigBase.java:481)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.<init>(AnnotatedClass.java:122)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(AnnotatedClass.java:141)
            com.fasterxml.jackson.databind.introspect.BasicClassIntrospector.collectProperties(BasicClassIntrospector.java:195)
            com.fasterxml.jackson.databind.introspect.BasicClassIntrospector.forDeserialization(BasicClassIntrospector.java:110)
            com.fasterxml.jackson.databind.introspect.BasicClassIntrospector.forDeserialization(BasicClassIntrospector.java:15)
            com.fasterxml.jackson.databind.DeserializationConfig.introspect(DeserializationConfig.java:724)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:327)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCache2(DeserializerCache.java:264) */
        deserializerCache._createAndCache2(impl, beanDeserializerFactory, simpleType);
    }
    
    @Test
    public void test_createAndCache27() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        BasicClassIntrospector _classIntrospector = ((BasicClassIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_classIntrospector", _classIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.AbstractTypeResolver[] _abstractTypeResolvers = {};
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_abstractTypeResolvers", _abstractTypeResolvers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCache2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.MapperConfigBase.findMixInClassFor(MapperConfigBase.java:481)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.<init>(AnnotatedClass.java:122)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(AnnotatedClass.java:141)
            com.fasterxml.jackson.databind.introspect.BasicClassIntrospector.collectProperties(BasicClassIntrospector.java:195)
            com.fasterxml.jackson.databind.introspect.BasicClassIntrospector.forDeserialization(BasicClassIntrospector.java:110)
            com.fasterxml.jackson.databind.introspect.BasicClassIntrospector.forDeserialization(BasicClassIntrospector.java:15)
            com.fasterxml.jackson.databind.DeserializationConfig.introspect(DeserializationConfig.java:724)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:327)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCache2(DeserializerCache.java:264) */
        deserializerCache._createAndCache2(impl, beanDeserializerFactory, mapLikeType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.DeserializerCache._verifyAsClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _verifyAsClass(java.lang.Object, java.lang.String, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_verifyAsClass(java.lang.Object,java.lang.String,java.lang.Class)}
 * @utbot.executesCondition {@code (src == null): False}
 * @utbot.executesCondition {@code (!(src instanceof Class)): False}
 * @utbot.executesCondition {@code (cls == noneClass): True}
 *  */
    @Test
    public void test_verifyAsClass_ClsEqualsNoneClass() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        Class class1 = Object.class;
        
        Class deserializerCacheClazz = Class.forName("com.fasterxml.jackson.databind.deser.DeserializerCache");
        Class stringType = Class.forName("java.lang.String");
        Class class1Type = Class.forName("java.lang.Class");
        Method _verifyAsClassMethod = deserializerCacheClazz.getDeclaredMethod("_verifyAsClass", class1, stringType, class1Type);
        _verifyAsClassMethod.setAccessible(true);
        java.lang.Object[] _verifyAsClassMethodArguments = new java.lang.Object[3];
        _verifyAsClassMethodArguments[0] = class1;
        _verifyAsClassMethodArguments[1] = ((Object) null);
        _verifyAsClassMethodArguments[2] = class1;
        Class actual = ((Class) _verifyAsClassMethod.invoke(deserializerCache, _verifyAsClassMethodArguments));
        
        assertNull(actual);
        
        Class finalClass1 = class1;
        
        Class finalClass11 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_verifyAsClass(java.lang.Object,java.lang.String,java.lang.Class)}
 * @utbot.executesCondition {@code (src == null): False}
 * @utbot.executesCondition {@code (!(src instanceof Class)): False}
 * @utbot.executesCondition {@code (cls == noneClass): False}
 * @utbot.executesCondition {@code (ClassUtil.isBogusClass(cls)): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#isBogusClass(java.lang.Class)}
 *  */
    @Test
    public void test_verifyAsClass_ClassUtilIsBogusClass() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        Class class1 = Object.class;
        
        Class deserializerCacheClazz = Class.forName("com.fasterxml.jackson.databind.deser.DeserializerCache");
        Class stringType = Class.forName("java.lang.String");
        Class classType = Class.forName("java.lang.Class");
        Method _verifyAsClassMethod = deserializerCacheClazz.getDeclaredMethod("_verifyAsClass", class1, stringType, classType);
        _verifyAsClassMethod.setAccessible(true);
        java.lang.Object[] _verifyAsClassMethodArguments = new java.lang.Object[3];
        _verifyAsClassMethodArguments[0] = class1;
        _verifyAsClassMethodArguments[1] = ((Object) null);
        _verifyAsClassMethodArguments[2] = ((Object) null);
        Class actual = ((Class) _verifyAsClassMethod.invoke(deserializerCache, _verifyAsClassMethodArguments));
        
        assertEquals(Class.class, actual.getClass());
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_verifyAsClass(java.lang.Object,java.lang.String,java.lang.Class)}
 * @utbot.executesCondition {@code (src == null): True}
 *  */
    @Test
    public void test_verifyAsClass_SrcEqualsNull() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        
        Class deserializerCacheClazz = Class.forName("com.fasterxml.jackson.databind.deser.DeserializerCache");
        Class objectType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.String");
        Class classType = Class.forName("java.lang.Class");
        Method _verifyAsClassMethod = deserializerCacheClazz.getDeclaredMethod("_verifyAsClass", objectType, stringType, classType);
        _verifyAsClassMethod.setAccessible(true);
        java.lang.Object[] _verifyAsClassMethodArguments = new java.lang.Object[3];
        _verifyAsClassMethodArguments[0] = ((Object) null);
        _verifyAsClassMethodArguments[1] = ((Object) null);
        _verifyAsClassMethodArguments[2] = ((Object) null);
        Class actual = ((Class) _verifyAsClassMethod.invoke(deserializerCache, _verifyAsClassMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _verifyAsClass(java.lang.Object, java.lang.String, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_verifyAsClass(java.lang.Object,java.lang.String,java.lang.Class)}
 * @utbot.executesCondition {@code (src == null): False}
 * @utbot.executesCondition {@code (!(src instanceof Class)): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: !(src instanceof Class)
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_verifyAsClass_ThrowIllegalStateException() throws Throwable  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        byte[] byteArray = {};
        
        Class deserializerCacheClazz = Class.forName("com.fasterxml.jackson.databind.deser.DeserializerCache");
        Class byteArrayType = Class.forName("java.lang.Object");
        Class stringType = Class.forName("java.lang.String");
        Class classType = Class.forName("java.lang.Class");
        Method _verifyAsClassMethod = deserializerCacheClazz.getDeclaredMethod("_verifyAsClass", byteArrayType, stringType, classType);
        _verifyAsClassMethod.setAccessible(true);
        java.lang.Object[] _verifyAsClassMethodArguments = new java.lang.Object[3];
        _verifyAsClassMethodArguments[0] = ((Object) byteArray);
        _verifyAsClassMethodArguments[1] = ((Object) null);
        _verifyAsClassMethodArguments[2] = ((Object) null);
        try {
            _verifyAsClassMethod.invoke(deserializerCache, _verifyAsClassMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.DeserializerCache.findConverter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findConverter(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#findConverter(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getAnnotationIntrospector()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findDeserializationConverter(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindConverter_AnnotationIntrospectorFindDeserializationConverter() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        Converter actual = deserializerCache.findConverter(impl, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findConverter(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#findConverter(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object convDef = ctxt.getAnnotationIntrospector().findDeserializationConverter(a);
 *  */
    @Test
    public void testFindConverter_ThrowNullPointerException() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache.findConverter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache.findConverter(DeserializerCache.java:446) */
        deserializerCache.findConverter(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#findConverter(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getAnnotationIntrospector()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findDeserializationConverter(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object convDef = ctxt.getAnnotationIntrospector().findDeserializationConverter(a);
 *  */
    @Test
    public void testFindConverter_ThrowNullPointerException_1() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache.findConverter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache.findConverter(DeserializerCache.java:446) */
        deserializerCache.findConverter(impl, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findConverter(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.introspect.Annotated)
    
    @Test
    public void testFindConverter1() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
            VirtualAnnotatedMember virtualAnnotatedMember = new VirtualAnnotatedMember(null, null, null, null);
            
            Converter actual = deserializerCache.findConverter(impl, virtualAnnotatedMember);
            
            assertNull(actual);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findConverter(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.introspect.Annotated)
    
    @Test(expected = StackOverflowError.class)
    public void testFindConverter2() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _annotationIntrospector);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        deserializerCache.findConverter(impl, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindConverter3() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary5 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _annotationIntrospector);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        deserializerCache.findConverter(impl, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindConverter4() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary7 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary8 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_primary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary8);
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary8);
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary7);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        deserializerCache.findConverter(impl, annotatedMethod);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindConverter5() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _annotationIntrospector);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        AnnotatedField annotatedField = new AnnotatedField(null, null, null);
        
        deserializerCache.findConverter(impl, annotatedField);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindConverter6() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary5 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary2);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        AnnotatedField annotatedField = new AnnotatedField(null, null, null);
        
        deserializerCache.findConverter(impl, annotatedField);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindConverter7() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary5 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary5);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary6);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        AnnotatedField annotatedField = new AnnotatedField(null, null, null);
        
        deserializerCache.findConverter(impl, annotatedField);
    }
    
    @Test
    public void testFindConverter8() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary5 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        VirtualAnnotatedMember virtualAnnotatedMember = new VirtualAnnotatedMember(null, null, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache.findConverter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:577)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:576)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:576)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:576)
            com.fasterxml.jackson.databind.deser.DeserializerCache.findConverter(DeserializerCache.java:446) */
        deserializerCache.findConverter(impl, virtualAnnotatedMember);
    }
    
    @Test
    public void testFindConverter9() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary7 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary8 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_primary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary1);
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary8);
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary7);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        VirtualAnnotatedMember virtualAnnotatedMember = new VirtualAnnotatedMember(null, null, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache.findConverter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:577)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:576)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:576)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:576)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:576)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:576)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:576)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:577)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:576)
            com.fasterxml.jackson.databind.deser.DeserializerCache.findConverter(DeserializerCache.java:446) */
        deserializerCache.findConverter(impl, virtualAnnotatedMember);
    }
    
    @Test
    public void testFindConverter10() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary5 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary5);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary7 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary8 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary8);
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary7);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        VirtualAnnotatedMember virtualAnnotatedMember = new VirtualAnnotatedMember(null, null, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache.findConverter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:576)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:576)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:576)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:576)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:577)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:576)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:576)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:576)
            com.fasterxml.jackson.databind.deser.DeserializerCache.findConverter(DeserializerCache.java:446) */
        deserializerCache.findConverter(impl, virtualAnnotatedMember);
    }
    
    @Test
    public void testFindConverter11() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary7 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary8 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary9 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary10 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary11 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary12 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary13 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary14 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary15 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary16 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary17 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_primary16, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary17);
        setField(_primary15, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary16);
        setField(_primary14, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary15);
        setField(_primary13, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary14);
        setField(_primary12, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary13);
        setField(_primary11, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary12);
        setField(_primary10, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary11);
        setField(_primary9, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary10);
        setField(_primary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary9);
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary8);
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary7);
        setField(_primary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache.findConverter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1115)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findDeserializationConverter(JacksonAnnotationIntrospector.java:825)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:576)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:576)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:576)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:576)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:576)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:576)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:576)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:576)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:576)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:576)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:576)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:576)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:576)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:576)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:576)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:576)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:576)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findDeserializationConverter(AnnotationIntrospectorPair.java:576)
            com.fasterxml.jackson.databind.deser.DeserializerCache.findConverter(DeserializerCache.java:446) */
        deserializerCache.findConverter(impl, null);
    }
    
    @Test
    public void testFindConverter12() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary5 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        setField(_primary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary5);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary6 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary5);
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary7 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary8 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary9 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary8, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary9);
        setField(_primary7, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary8);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary7);
        setField(_primary6, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary6);
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        VirtualAnnotatedMember virtualAnnotatedMember = new VirtualAnnotatedMember(null, null, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache.findConverter] produces [java.lang.NullPointerException] */
        deserializerCache.findConverter(impl, virtualAnnotatedMember);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1069409020875599 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1069409020875599.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1069409020881400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1069409020875599.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1069409020881400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1069409024276700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1069409024276700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1069409024279299 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1069409024276700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1069409024279299).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields1069409024865000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1069409024865000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1069409024866900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1069409024865000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1069409024866900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

