package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.deser.std.CollectionDeserializer;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.util.Converter;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.type.PlaceholderForType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.module.SimpleDeserializers;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla;
import com.fasterxml.jackson.databind.ext.CoreXMLDeserializers.Std;
import com.fasterxml.jackson.databind.ext.CoreXMLDeserializers;
import com.fasterxml.jackson.databind.deser.std.UUIDDeserializer;
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
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        _cachedDeserializers.put(mapType, collectionDeserializer);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        
        boolean actual = deserializerCache.hasValueDeserializerFor(null, null, mapType);
        
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
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TokenBufferDeserializer tokenBufferDeserializer = ((TokenBufferDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer"));
        _cachedDeserializers.put(mapType, tokenBufferDeserializer);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        
        boolean actual = deserializerCache.hasValueDeserializerFor(null, null, mapType);
        
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
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCache2
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _createAndCache2(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.DeserializerFactory, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createAndCache2(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void test_createAndCache2_ThrowNullPointerException_1() throws Exception  {
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
            com.fasterxml.jackson.databind.cfg.MapperConfig.getClassIntrospector(MapperConfig.java:225)
            com.fasterxml.jackson.databind.DeserializationConfig.introspect(DeserializationConfig.java:900)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:324)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCache2(DeserializerCache.java:264) */
        deserializerCache._createAndCache2(impl, beanDeserializerFactory, referenceType);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createAndCache2(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
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
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:324)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCache2(DeserializerCache.java:264) */
        deserializerCache._createAndCache2(impl, beanDeserializerFactory, referenceType);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createAndCache2(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void test_createAndCache2_ThrowNullPointerException_2() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCache2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._mapAbstractType2(BasicDeserializerFactory.java:211)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.mapAbstractType(BasicDeserializerFactory.java:188)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:322)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCache2(DeserializerCache.java:264) */
        deserializerCache._createAndCache2(impl, beanDeserializerFactory, mapLikeType);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createAndCache2(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void test_createAndCache2_ThrowNullPointerException_3() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        Class _class = Object.class;
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCache2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._mapAbstractType2(BasicDeserializerFactory.java:211)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.mapAbstractType(BasicDeserializerFactory.java:188)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:322)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCache2(DeserializerCache.java:264) */
        deserializerCache._createAndCache2(impl, beanDeserializerFactory, collectionType);
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
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:318)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCache2(DeserializerCache.java:264) */
        deserializerCache._createAndCache2(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.DeserializerCache.findConverter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findConverter(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.introspect.Annotated)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#findConverter(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.executesCondition {@code (convDef == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getAnnotationIntrospector()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findDeserializationConverter(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindConverter_ConvDefEqualsNull() throws Exception  {
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
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getAnnotationIntrospector()}
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
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.DeserializerCache._verifyAsClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method _verifyAsClass(java.lang.Object, java.lang.String, java.lang.Class)
    
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
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method _verifyAsClass(java.lang.Object, java.lang.String, java.lang.Class)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (src == null): False},
    ///     {@code (!(src instanceof Class)): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_verifyAsClass(java.lang.Object,java.lang.String,java.lang.Class)}
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
 * @utbot.executesCondition {@code (cls == noneClass): False}
 * @utbot.executesCondition {@code (ClassUtil.isBogusClass(cls)): True}
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
 * @utbot.executesCondition {@code (cls == noneClass): False}
 * @utbot.executesCondition {@code (ClassUtil.isBogusClass(cls)): False}
 * @utbot.returnsFrom {@code return cls;}
 *  */
    @Test
    public void test_verifyAsClass_NotClassUtilIsBogusClass() throws Exception  {
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
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.DeserializerCache._hasCustomHandlers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _hasCustomHandlers(com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_hasCustomHandlers(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void test_hasCustomHandlers_ReturnFalse_1() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        Class deserializerCacheClazz = Class.forName("com.fasterxml.jackson.databind.deser.DeserializerCache");
        Class referenceTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method _hasCustomHandlersMethod = deserializerCacheClazz.getDeclaredMethod("_hasCustomHandlers", referenceTypeType);
        _hasCustomHandlersMethod.setAccessible(true);
        java.lang.Object[] _hasCustomHandlersMethodArguments = new java.lang.Object[1];
        _hasCustomHandlersMethodArguments[0] = referenceType;
        boolean actual = ((Boolean) _hasCustomHandlersMethod.invoke(deserializerCache, _hasCustomHandlersMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_hasCustomHandlers(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void test_hasCustomHandlers_ReturnFalse_4() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        PlaceholderForType placeholderForType = ((PlaceholderForType) createInstance("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        
        Class deserializerCacheClazz = Class.forName("com.fasterxml.jackson.databind.deser.DeserializerCache");
        Class placeholderForTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method _hasCustomHandlersMethod = deserializerCacheClazz.getDeclaredMethod("_hasCustomHandlers", placeholderForTypeType);
        _hasCustomHandlersMethod.setAccessible(true);
        java.lang.Object[] _hasCustomHandlersMethodArguments = new java.lang.Object[1];
        _hasCustomHandlersMethodArguments[0] = placeholderForType;
        boolean actual = ((Boolean) _hasCustomHandlersMethod.invoke(deserializerCache, _hasCustomHandlersMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_hasCustomHandlers(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void test_hasCustomHandlers_ReturnFalse() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        Class deserializerCacheClazz = Class.forName("com.fasterxml.jackson.databind.deser.DeserializerCache");
        Class mapLikeTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method _hasCustomHandlersMethod = deserializerCacheClazz.getDeclaredMethod("_hasCustomHandlers", mapLikeTypeType);
        _hasCustomHandlersMethod.setAccessible(true);
        java.lang.Object[] _hasCustomHandlersMethodArguments = new java.lang.Object[1];
        _hasCustomHandlersMethodArguments[0] = mapLikeType;
        boolean actual = ((Boolean) _hasCustomHandlersMethod.invoke(deserializerCache, _hasCustomHandlersMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_hasCustomHandlers(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return (ct.getValueHandler() != null) || (ct.getTypeHandler() != null);}
 *  */
    @Test
    public void test_hasCustomHandlers_ReturnCtGetValueHandlerEqualsNullOrCtGetTypeHandlerEqualsNull() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        int[] _valueHandler = {};
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        Class deserializerCacheClazz = Class.forName("com.fasterxml.jackson.databind.deser.DeserializerCache");
        Class mapLikeTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method _hasCustomHandlersMethod = deserializerCacheClazz.getDeclaredMethod("_hasCustomHandlers", mapLikeTypeType);
        _hasCustomHandlersMethod.setAccessible(true);
        java.lang.Object[] _hasCustomHandlersMethodArguments = new java.lang.Object[1];
        _hasCustomHandlersMethodArguments[0] = mapLikeType;
        boolean actual = ((Boolean) _hasCustomHandlersMethod.invoke(deserializerCache, _hasCustomHandlersMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_hasCustomHandlers(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void test_hasCustomHandlers_ReturnFalse_2() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        
        Class deserializerCacheClazz = Class.forName("com.fasterxml.jackson.databind.deser.DeserializerCache");
        Class collectionLikeTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method _hasCustomHandlersMethod = deserializerCacheClazz.getDeclaredMethod("_hasCustomHandlers", collectionLikeTypeType);
        _hasCustomHandlersMethod.setAccessible(true);
        java.lang.Object[] _hasCustomHandlersMethodArguments = new java.lang.Object[1];
        _hasCustomHandlersMethodArguments[0] = collectionLikeType;
        boolean actual = ((Boolean) _hasCustomHandlersMethod.invoke(deserializerCache, _hasCustomHandlersMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_hasCustomHandlers(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void test_hasCustomHandlers_ReturnFalse_3() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        
        Class deserializerCacheClazz = Class.forName("com.fasterxml.jackson.databind.deser.DeserializerCache");
        Class arrayTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method _hasCustomHandlersMethod = deserializerCacheClazz.getDeclaredMethod("_hasCustomHandlers", arrayTypeType);
        _hasCustomHandlersMethod.setAccessible(true);
        java.lang.Object[] _hasCustomHandlersMethodArguments = new java.lang.Object[1];
        _hasCustomHandlersMethodArguments[0] = arrayType;
        boolean actual = ((Boolean) _hasCustomHandlersMethod.invoke(deserializerCache, _hasCustomHandlersMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_hasCustomHandlers(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return (ct.getValueHandler() != null) || (ct.getTypeHandler() != null);}
 *  */
    @Test
    public void test_hasCustomHandlers_ReturnCtGetValueHandlerEqualsNullOrCtGetTypeHandlerEqualsNull_2() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        short[] _typeHandler = {};
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        Class deserializerCacheClazz = Class.forName("com.fasterxml.jackson.databind.deser.DeserializerCache");
        Class mapTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method _hasCustomHandlersMethod = deserializerCacheClazz.getDeclaredMethod("_hasCustomHandlers", mapTypeType);
        _hasCustomHandlersMethod.setAccessible(true);
        java.lang.Object[] _hasCustomHandlersMethodArguments = new java.lang.Object[1];
        _hasCustomHandlersMethodArguments[0] = mapType;
        boolean actual = ((Boolean) _hasCustomHandlersMethod.invoke(deserializerCache, _hasCustomHandlersMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_hasCustomHandlers(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return (ct.getValueHandler() != null) || (ct.getTypeHandler() != null);}
 *  */
    @Test
    public void test_hasCustomHandlers_ReturnCtGetValueHandlerEqualsNullOrCtGetTypeHandlerEqualsNull_1() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _valueType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        Class deserializerCacheClazz = Class.forName("com.fasterxml.jackson.databind.deser.DeserializerCache");
        Class mapLikeTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method _hasCustomHandlersMethod = deserializerCacheClazz.getDeclaredMethod("_hasCustomHandlers", mapLikeTypeType);
        _hasCustomHandlersMethod.setAccessible(true);
        java.lang.Object[] _hasCustomHandlersMethodArguments = new java.lang.Object[1];
        _hasCustomHandlersMethodArguments[0] = mapLikeType;
        boolean actual = ((Boolean) _hasCustomHandlersMethod.invoke(deserializerCache, _hasCustomHandlersMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _hasCustomHandlers(com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_hasCustomHandlers(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#isContainerType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: t.isContainerType()
 *  */
    @Test
    public void test_hasCustomHandlers_ThrowNullPointerException() throws Throwable  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._hasCustomHandlers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._hasCustomHandlers(DeserializerCache.java:537) */
        Class deserializerCacheClazz = Class.forName("com.fasterxml.jackson.databind.deser.DeserializerCache");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method _hasCustomHandlersMethod = deserializerCacheClazz.getDeclaredMethod("_hasCustomHandlers", javaTypeType);
        _hasCustomHandlersMethod.setAccessible(true);
        java.lang.Object[] _hasCustomHandlersMethodArguments = new java.lang.Object[1];
        _hasCustomHandlersMethodArguments[0] = ((Object) null);
        try {
            _hasCustomHandlersMethod.invoke(deserializerCache, _hasCustomHandlersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.DeserializerCache._handleUnknownValueDeserializer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _handleUnknownValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_handleUnknownValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<?> rawClass = type.getRawClass();
 *  */
    @Test
    public void test_handleUnknownValueDeserializer_ThrowNullPointerException() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._handleUnknownValueDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._handleUnknownValueDeserializer(DeserializerCache.java:574) */
        deserializerCache._handleUnknownValueDeserializer(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_handleUnknownValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (!ClassUtil.isConcrete(rawClass)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#isConcrete(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#reportMappingException(java.lang.String,java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctxt.reportMappingException("Can not find a Value deserializer for type %s", type);
 *  */
    @Test
    public void test_handleUnknownValueDeserializer_ThrowNullPointerException_1() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._handleUnknownValueDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._handleUnknownValueDeserializer(DeserializerCache.java:578) */
        deserializerCache._handleUnknownValueDeserializer(null, referenceType);
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
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.DeserializerCache._handleUnknownKeyDeserializer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _handleUnknownKeyDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_handleUnknownKeyDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#reportMappingException(java.lang.String,java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctxt.reportMappingException("Can not find a (Map) Key deserializer for type %s", type);
 *  */
    @Test
    public void test_handleUnknownKeyDeserializer_ThrowNullPointerException() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._handleUnknownKeyDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._handleUnknownKeyDeserializer(DeserializerCache.java:585) */
        deserializerCache._handleUnknownKeyDeserializer(null, null);
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
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Object factoryBasedEnumDeserializer = createInstance("com.fasterxml.jackson.databind.deser.std.FactoryBasedEnumDeserializer");
        _cachedDeserializers.put(mapType, factoryBasedEnumDeserializer);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        
        Object actual = deserializerCache._createAndCacheValueDeserializer(null, null, mapType);
        
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
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        deserializerCache._createAndCacheValueDeserializer(null, null, referenceType);
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
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        deserializerCache._createAndCacheValueDeserializer(null, null, mapLikeType);
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
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ReferenceType _valueType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        deserializerCache._createAndCacheValueDeserializer(null, null, mapType);
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
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        deserializerCache._createAndCacheValueDeserializer(null, null, mapLikeType);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createAndCacheValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void test_createAndCacheValueDeserializer_ThrowNullPointerException_4() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        _cachedDeserializers.put(mapType, null);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        
        deserializerCache._createAndCacheValueDeserializer(null, null, mapType);
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
    public void test_createAndCacheValueDeserializer_ThrowNullPointerException_5() throws Exception  {
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
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _createDeserializer2(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.DeserializerFactory, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createDeserializer2(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getConfig()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#isEnumType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#isContainerType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#isReferenceType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.DeserializerFactory#createReferenceDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.ReferenceType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.returnsFrom {@code return factory.createReferenceDeserializer(ctxt, (ReferenceType) type, beanDesc);}
 *  */
    @Test
    public void test_createDeserializer2_DeserializerFactoryCreateReferenceDeserializer() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.deser.Deserializers[] _additionalDeserializers = {};
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_additionalDeserializers", _additionalDeserializers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        AsArrayTypeDeserializer _typeHandler = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        JsonDeserializer actual = deserializerCache._createDeserializer2(impl, beanDeserializerFactory, referenceType, null);
        
        assertNull(actual);
        
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _createDeserializer2(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.DeserializerFactory, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createDeserializer2(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return factory.createReferenceDeserializer(ctxt, (ReferenceType) type, beanDesc);
 *  */
    @Test
    public void test_createDeserializer2_ThrowClassCastException_1() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        short[] _valueHandler = {};
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2] produces [java.lang.ClassCastException: class [S cannot be cast to class com.fasterxml.jackson.databind.JsonDeserializer ([S is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.JsonDeserializer is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @302b9f3c)]
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createReferenceDeserializer(BasicDeserializerFactory.java:1309)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2(DeserializerCache.java:398) */
        deserializerCache._createDeserializer2(impl, beanDeserializerFactory, referenceType, null);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createDeserializer2(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.DeserializerFactory#createMapDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return factory.createMapDeserializer(ctxt, (MapType) mlt, beanDesc);
 *  */
    @Test
    public void test_createDeserializer2_ThrowClassCastException_2() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        short[] _valueHandler = {};
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2] produces [java.lang.ClassCastException: class [S cannot be cast to class com.fasterxml.jackson.databind.JsonDeserializer ([S is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.JsonDeserializer is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @302b9f3c)]
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createMapLikeDeserializer(BasicDeserializerFactory.java:1203)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2(DeserializerCache.java:379) */
        deserializerCache._createDeserializer2(impl, beanDeserializerFactory, mapType, null);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createDeserializer2(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return factory.createReferenceDeserializer(ctxt, (ReferenceType) type, beanDesc);
 *  */
    @Test
    public void test_createDeserializer2_ThrowClassCastException() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        int[] _typeHandler = {};
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2] produces [java.lang.ClassCastException: class [I cannot be cast to class com.fasterxml.jackson.databind.jsontype.TypeDeserializer ([I is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.jsontype.TypeDeserializer is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @302b9f3c)]
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createReferenceDeserializer(BasicDeserializerFactory.java:1312)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2(DeserializerCache.java:398) */
        deserializerCache._createDeserializer2(impl, beanDeserializerFactory, referenceType, null);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createDeserializer2(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final DeserializationConfig config = ctxt.getConfig();
 *  */
    @Test
    public void test_createDeserializer2_ThrowNullPointerException() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2(DeserializerCache.java:365) */
        deserializerCache._createDeserializer2(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createDeserializer2(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return factory.createReferenceDeserializer(ctxt, (ReferenceType) type, beanDesc);
 *  */
    @Test
    public void test_createDeserializer2_ThrowNullPointerException_2() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2(DeserializerCache.java:398) */
        deserializerCache._createDeserializer2(impl, null, referenceType, null);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_createDeserializer2(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.executesCondition {@code (JsonNode.class.isAssignableFrom(type.getRawClass())): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.invokes {@link java.lang.Class#isAssignableFrom(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.DeserializerFactory#createTreeDeserializer(com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return factory.createTreeDeserializer(config, type, beanDesc);
 *  */
    @Test
    public void test_createDeserializer2_ThrowNullPointerException_3() throws Exception  {
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
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.DeserializerFactory#createMapLikeDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapLikeType,com.fasterxml.jackson.databind.BeanDescription)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return factory.createMapLikeDeserializer(ctxt, mlt, beanDesc);
 *  */
    @Test
    public void test_createDeserializer2_ThrowNullPointerException_4() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2(DeserializerCache.java:379) */
        deserializerCache._createDeserializer2(impl, null, mapLikeType, null);
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
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2(DeserializerCache.java:367) */
        deserializerCache._createDeserializer2(impl, null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _createDeserializer2(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.DeserializerFactory, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    @Test
    public void test_createDeserializer21() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.deser.Deserializers[] _additionalDeserializers = new com.fasterxml.jackson.databind.deser.Deserializers[1];
        SimpleDeserializers simpleDeserializers = ((SimpleDeserializers) createInstance("com.fasterxml.jackson.databind.module.SimpleDeserializers"));
        _additionalDeserializers[0] = ((Deserializers) simpleDeserializers);
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_additionalDeserializers", _additionalDeserializers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapType _referencedType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        TypeWrappedDeserializer _valueHandler = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        AsWrapperTypeDeserializer _typeHandler = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        JsonDeserializer actual = deserializerCache._createDeserializer2(impl, beanDeserializerFactory, referenceType, basicBeanDescription);
        
        assertNull(actual);
        
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _createDeserializer2(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.DeserializerFactory, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription)
    
    @Test
    public void test_createDeserializer22() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Object _typeHandler = createInstance("java.lang.Object");
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.fasterxml.jackson.databind.jsontype.TypeDeserializer (java.lang.Object is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.jsontype.TypeDeserializer is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @302b9f3c)]
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createMapLikeDeserializer(BasicDeserializerFactory.java:1213)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2(DeserializerCache.java:379) */
        deserializerCache._createDeserializer2(impl, beanDeserializerFactory, mapType, basicBeanDescription);
    }
    
    @Test
    public void test_createDeserializer23() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Object _valueHandler = createInstance("java.lang.Object");
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.fasterxml.jackson.databind.KeyDeserializer (java.lang.Object is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.KeyDeserializer is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @302b9f3c)]
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createMapLikeDeserializer(BasicDeserializerFactory.java:1206)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2(DeserializerCache.java:379) */
        deserializerCache._createDeserializer2(impl, beanDeserializerFactory, mapType, basicBeanDescription);
    }
    
    @Test
    public void test_createDeserializer24() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ArrayIterator.hasNext(ArrayIterator.java:22)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._findCustomBeanDeserializer(BasicDeserializerFactory.java:1665)
            com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBeanDeserializer(BeanDeserializerFactory.java:143)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2(DeserializerCache.java:403) */
        deserializerCache._createDeserializer2(impl, beanDeserializerFactory, simpleType, basicBeanDescription);
    }
    
    @Test
    public void test_createDeserializer25() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createReferenceDeserializer(BasicDeserializerFactory.java:1309)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2(DeserializerCache.java:398) */
        deserializerCache._createDeserializer2(impl, beanDeserializerFactory, referenceType, null);
    }
    
    @Test
    public void test_createDeserializer26() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.deser.Deserializers[] _additionalDeserializers = new com.fasterxml.jackson.databind.deser.Deserializers[9];
        SimpleDeserializers simpleDeserializers = ((SimpleDeserializers) createInstance("com.fasterxml.jackson.databind.module.SimpleDeserializers"));
        HashMap _classMappings = new HashMap();
        setField(simpleDeserializers, "com.fasterxml.jackson.databind.module.SimpleDeserializers", "_classMappings", _classMappings);
        _additionalDeserializers[0] = ((Deserializers) simpleDeserializers);
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_additionalDeserializers", _additionalDeserializers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapType _referencedType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        TypeWrappedDeserializer _valueHandler = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        AsWrapperTypeDeserializer _typeHandler = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._findCustomReferenceDeserializer(BasicDeserializerFactory.java:1651)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createReferenceDeserializer(BasicDeserializerFactory.java:1316)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2(DeserializerCache.java:398) */
        deserializerCache._createDeserializer2(impl, beanDeserializerFactory, referenceType, basicBeanDescription);
    }
    
    @Test
    public void test_createDeserializer27() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.deser.Deserializers[] _additionalDeserializers = new com.fasterxml.jackson.databind.deser.Deserializers[9];
        SimpleDeserializers simpleDeserializers = ((SimpleDeserializers) createInstance("com.fasterxml.jackson.databind.module.SimpleDeserializers"));
        _additionalDeserializers[0] = ((Deserializers) simpleDeserializers);
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_additionalDeserializers", _additionalDeserializers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapType _referencedType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        AtomicReferenceDeserializer _valueHandler = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        AsWrapperTypeDeserializer _typeHandler = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._findCustomReferenceDeserializer(BasicDeserializerFactory.java:1651)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createReferenceDeserializer(BasicDeserializerFactory.java:1316)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2(DeserializerCache.java:398) */
        deserializerCache._createDeserializer2(impl, beanDeserializerFactory, referenceType, null);
    }
    
    @Test
    public void test_createDeserializer28() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.MapperConfig.getTypeFactory(MapperConfig.java:278)
            com.fasterxml.jackson.databind.cfg.MapperConfig.constructType(MapperConfig.java:290)
            com.fasterxml.jackson.databind.cfg.MapperConfig.introspectClassAnnotations(MapperConfig.java:320)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.findTypeDeserializer(BasicDeserializerFactory.java:1347)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createMapLikeDeserializer(BasicDeserializerFactory.java:1216)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2(DeserializerCache.java:379) */
        deserializerCache._createDeserializer2(impl, beanDeserializerFactory, mapType, basicBeanDescription);
    }
    
    @Test
    public void test_createDeserializer29() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        AsWrapperTypeDeserializer _typeHandler = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ArrayIterator.hasNext(ArrayIterator.java:22)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._findCustomMapLikeDeserializer(BasicDeserializerFactory.java:1754)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createMapLikeDeserializer(BasicDeserializerFactory.java:1218)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2(DeserializerCache.java:379) */
        deserializerCache._createDeserializer2(impl, beanDeserializerFactory, mapType, basicBeanDescription);
    }
    
    @Test
    public void test_createDeserializer210() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        BasicBeanDescription basicBeanDescription = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.findTypeDeserializer(BasicDeserializerFactory.java:1347)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createMapLikeDeserializer(BasicDeserializerFactory.java:1216)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2(DeserializerCache.java:379) */
        deserializerCache._createDeserializer2(impl, beanDeserializerFactory, mapType, basicBeanDescription);
    }
    
    @Test
    public void test_createDeserializer211() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(null);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationConfig.introspectClassAnnotations(DeserializationConfig.java:763)
            com.fasterxml.jackson.databind.cfg.MapperConfig.introspectClassAnnotations(MapperConfig.java:320)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.findTypeDeserializer(BasicDeserializerFactory.java:1347)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createReferenceDeserializer(BasicDeserializerFactory.java:1314)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2(DeserializerCache.java:398) */
        deserializerCache._createDeserializer2(impl, beanDeserializerFactory, referenceType, null);
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
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:318) */
        deserializerCache._createDeserializer(null, null, null);
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
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:324) */
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
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:321) */
        deserializerCache._createDeserializer(impl, null, null);
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
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:322) */
        deserializerCache._createDeserializer(impl, null, mapLikeType);
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
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        Class _class = Object.class;
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:322) */
        deserializerCache._createDeserializer(impl, null, collectionType);
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
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:324) */
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
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._mapAbstractType2(BasicDeserializerFactory.java:213)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.mapAbstractType(BasicDeserializerFactory.java:188)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:322) */
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
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._mapAbstractType2(BasicDeserializerFactory.java:211)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.mapAbstractType(BasicDeserializerFactory.java:188)
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:322) */
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
            com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:324) */
        deserializerCache._createDeserializer(impl, beanDeserializerFactory, mapLikeType);
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
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        UntypedObjectDeserializer untypedObjectDeserializer = ((UntypedObjectDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer"));
        _cachedDeserializers.put(referenceType, untypedObjectDeserializer);
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
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ErrorThrowingDeserializer errorThrowingDeserializer = ((ErrorThrowingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer"));
        _cachedDeserializers.put(mapLikeType, errorThrowingDeserializer);
        MapLikeType mapLikeType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        _cachedDeserializers.put(mapLikeType1, errorThrowingDeserializer);
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
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        EnumDeserializer enumDeserializer = ((EnumDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.EnumDeserializer"));
        _cachedDeserializers.put(collectionLikeType, enumDeserializer);
        CollectionLikeType collectionLikeType1 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        _cachedDeserializers.put(collectionLikeType1, enumDeserializer);
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
        UntypedObjectDeserializer untypedObjectDeserializer = ((UntypedObjectDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer"));
        _cachedDeserializers.put(referenceType, untypedObjectDeserializer);
        ReferenceType referenceType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        _cachedDeserializers.put(referenceType1, untypedObjectDeserializer);
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
        UntypedObjectDeserializer untypedObjectDeserializer = ((UntypedObjectDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer"));
        _cachedDeserializers.put(simpleType, untypedObjectDeserializer);
        SimpleType simpleType1 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        _cachedDeserializers.put(simpleType1, untypedObjectDeserializer);
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
        UntypedObjectDeserializer untypedObjectDeserializer = ((UntypedObjectDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer"));
        _cachedDeserializers.put(arrayType, untypedObjectDeserializer);
        ArrayType arrayType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        _cachedDeserializers.put(arrayType1, untypedObjectDeserializer);
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
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        EnumDeserializer enumDeserializer = ((EnumDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.EnumDeserializer"));
        _cachedDeserializers.put(referenceType, enumDeserializer);
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
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ErrorThrowingDeserializer errorThrowingDeserializer = ((ErrorThrowingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer"));
        _cachedDeserializers.put(collectionLikeType, errorThrowingDeserializer);
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
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        DateDeserializers.SqlDateDeserializer sqlDateDeserializer = ((DateDeserializers.SqlDateDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer"));
        _cachedDeserializers.put(mapLikeType, sqlDateDeserializer);
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
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        UntypedObjectDeserializer untypedObjectDeserializer = ((UntypedObjectDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer"));
        _cachedDeserializers.put(referenceType, untypedObjectDeserializer);
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
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        UntypedObjectDeserializer untypedObjectDeserializer = ((UntypedObjectDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer"));
        _cachedDeserializers.put(collectionLikeType, untypedObjectDeserializer);
        CollectionLikeType collectionLikeType1 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        _cachedDeserializers.put(collectionLikeType1, untypedObjectDeserializer);
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
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ErrorThrowingDeserializer errorThrowingDeserializer = ((ErrorThrowingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer"));
        _cachedDeserializers.put(mapLikeType, errorThrowingDeserializer);
        MapLikeType mapLikeType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        _cachedDeserializers.put(mapLikeType1, errorThrowingDeserializer);
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
        UntypedObjectDeserializer untypedObjectDeserializer = ((UntypedObjectDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer"));
        _cachedDeserializers.put(referenceType, untypedObjectDeserializer);
        ReferenceType referenceType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        _cachedDeserializers.put(referenceType1, untypedObjectDeserializer);
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
        UntypedObjectDeserializer untypedObjectDeserializer = ((UntypedObjectDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer"));
        _cachedDeserializers.put(simpleType, untypedObjectDeserializer);
        SimpleType simpleType1 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        _cachedDeserializers.put(simpleType1, untypedObjectDeserializer);
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
        Object factoryBasedEnumDeserializer = createInstance("com.fasterxml.jackson.databind.deser.std.FactoryBasedEnumDeserializer");
        _cachedDeserializers.put(arrayType, factoryBasedEnumDeserializer);
        ArrayType arrayType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        Object factoryBasedEnumDeserializer1 = createInstance("com.fasterxml.jackson.databind.deser.std.FactoryBasedEnumDeserializer");
        _cachedDeserializers.put(arrayType1, factoryBasedEnumDeserializer1);
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
        _cachedDeserializers.put(null, null);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        BuilderBasedDeserializer builderBasedDeserializer = ((BuilderBasedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        _cachedDeserializers.put(referenceType, builderBasedDeserializer);
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
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ErrorThrowingDeserializer errorThrowingDeserializer = ((ErrorThrowingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer"));
        _cachedDeserializers.put(collectionLikeType, errorThrowingDeserializer);
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
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object intDeser = createInstance("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$IntDeser");
        _cachedDeserializers.put(mapLikeType, intDeser);
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
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.DeserializerCache.findValueDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.DeserializerFactory, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#findValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return deser;}
 *  */
    @Test
    public void testFindValueDeserializer_ReturnDeser() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ByteBufferDeserializer byteBufferDeserializer = ((ByteBufferDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer"));
        _cachedDeserializers.put(mapType, byteBufferDeserializer);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        
        ByteBufferDeserializer actual = ((ByteBufferDeserializer) deserializerCache.findValueDeserializer(null, null, mapType));
        
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#findValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return deser;}
 *  */
    @Test
    public void testFindValueDeserializer_ReturnDeser_1() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ReferenceType _valueType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        ByteBufferDeserializer byteBufferDeserializer = ((ByteBufferDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer"));
        _cachedDeserializers.put(mapType, byteBufferDeserializer);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        
        ByteBufferDeserializer actual = ((ByteBufferDeserializer) deserializerCache.findValueDeserializer(null, null, mapType));
        
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
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.DeserializerCache.modifyTypeByAnnotation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method modifyTypeByAnnotation(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#modifyTypeByAnnotation(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (intr == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getAnnotationIntrospector()}
 * @utbot.returnsFrom {@code return type;}
 *  */
    @Test
    public void testModifyTypeByAnnotation_IntrEqualsNull() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
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
        JavaType actual = ((JavaType) modifyTypeByAnnotationMethod.invoke(deserializerCache, modifyTypeByAnnotationMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method modifyTypeByAnnotation(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.introspect.Annotated, com.fasterxml.jackson.databind.JavaType)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.fasterxml.jackson.databind.DeserializationContext#getAnnotationIntrospector()} once
    /// execute conditions:
    ///     {@code (intr == null): False}
    /// invoke:
    ///     {@link com.fasterxml.jackson.databind.JavaType#isMapLikeType()} once,
    ///     {@link com.fasterxml.jackson.databind.JavaType#getContentType()} once,
    ///     {@link com.fasterxml.jackson.databind.DeserializationContext#getConfig()} once,
    ///     {@link com.fasterxml.jackson.databind.AnnotationIntrospector#refineDeserializationType(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)} once
    /// return from: {@code return type;}
    /// </pre>
    
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
            BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
            setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
            CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            
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
            
            JavaType actual_elementType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType"));
            assertNull(actual_elementType);
            
            JavaType actual_superClass = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass"));
            assertNull(actual_superClass);
            
            com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(actual, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
            assertNull(actual_superInterfaces);
            
            TypeBindings actual_bindings = ((TypeBindings) getFieldValue(actual, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings"));
            assertNull(actual_bindings);
            
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
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#modifyTypeByAnnotation(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (type.isMapLikeType()): True}
 * @utbot.executesCondition {@code (keyType != null): False}
 * @utbot.executesCondition {@code (contentType != null): False}
 * @utbot.returnsFrom {@code return type;}
 *  */
    @Test
    public void testModifyTypeByAnnotation_KeyTypeEqualsNull() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        Class deserializerCacheClazz = Class.forName("com.fasterxml.jackson.databind.deser.DeserializerCache");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class annotatedType = Class.forName("com.fasterxml.jackson.databind.introspect.Annotated");
        Class mapLikeTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method modifyTypeByAnnotationMethod = deserializerCacheClazz.getDeclaredMethod("modifyTypeByAnnotation", implType, annotatedType, mapLikeTypeType);
        modifyTypeByAnnotationMethod.setAccessible(true);
        java.lang.Object[] modifyTypeByAnnotationMethodArguments = new java.lang.Object[3];
        modifyTypeByAnnotationMethodArguments[0] = impl;
        modifyTypeByAnnotationMethodArguments[1] = ((Object) null);
        modifyTypeByAnnotationMethodArguments[2] = mapLikeType;
        MapLikeType actual = ((MapLikeType) modifyTypeByAnnotationMethod.invoke(deserializerCache, modifyTypeByAnnotationMethodArguments));
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(mapLikeType, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#modifyTypeByAnnotation(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getValueHandler()}
 * @utbot.returnsFrom {@code return type;}
 *  */
    @Test
    public void testModifyTypeByAnnotation_JavaTypeGetValueHandler() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
            setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
            MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            byte[] _valueHandler = {};
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
            
            Class deserializerCacheClazz = Class.forName("com.fasterxml.jackson.databind.deser.DeserializerCache");
            Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
            Class annotatedType = Class.forName("com.fasterxml.jackson.databind.introspect.Annotated");
            Class mapTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Method modifyTypeByAnnotationMethod = deserializerCacheClazz.getDeclaredMethod("modifyTypeByAnnotation", implType, annotatedType, mapTypeType);
            modifyTypeByAnnotationMethod.setAccessible(true);
            java.lang.Object[] modifyTypeByAnnotationMethodArguments = new java.lang.Object[3];
            modifyTypeByAnnotationMethodArguments[0] = impl;
            modifyTypeByAnnotationMethodArguments[1] = ((Object) null);
            modifyTypeByAnnotationMethodArguments[2] = mapType;
            MapType actual = ((MapType) modifyTypeByAnnotationMethod.invoke(deserializerCache, modifyTypeByAnnotationMethodArguments));
            
            JavaType mapType_keyType = ((JavaType) getFieldValue(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
            JavaType actual_keyType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(mapType_keyType, actual_keyType);
            
            JavaType mapType_valueType = ((JavaType) getFieldValue(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType"));
            JavaType actual_valueType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType"));
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(mapType_valueType, actual_valueType);
            
            JavaType actual_superClass = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass"));
            assertNull(actual_superClass);
            
            com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(actual, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
            assertNull(actual_superInterfaces);
            
            TypeBindings actual_bindings = ((TypeBindings) getFieldValue(actual, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings"));
            assertNull(actual_bindings);
            
            String actual_canonicalName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.type.TypeBase", "_canonicalName"));
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
            
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#modifyTypeByAnnotation(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (type.isMapLikeType()): True}
 * @utbot.executesCondition {@code (keyType != null): True}
 * @utbot.executesCondition {@code (keyType.getValueHandler() == null): False}
 * @utbot.executesCondition {@code (contentType != null): False}
 * @utbot.returnsFrom {@code return type;}
 *  */
    @Test
    public void testModifyTypeByAnnotation_ContentTypeEqualsNull() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        int[] _valueHandler = {};
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        
        Class deserializerCacheClazz = Class.forName("com.fasterxml.jackson.databind.deser.DeserializerCache");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class annotatedType = Class.forName("com.fasterxml.jackson.databind.introspect.Annotated");
        Class mapTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method modifyTypeByAnnotationMethod = deserializerCacheClazz.getDeclaredMethod("modifyTypeByAnnotation", implType, annotatedType, mapTypeType);
        modifyTypeByAnnotationMethod.setAccessible(true);
        java.lang.Object[] modifyTypeByAnnotationMethodArguments = new java.lang.Object[3];
        modifyTypeByAnnotationMethodArguments[0] = impl;
        modifyTypeByAnnotationMethodArguments[1] = ((Object) null);
        modifyTypeByAnnotationMethodArguments[2] = mapType;
        MapType actual = ((MapType) modifyTypeByAnnotationMethod.invoke(deserializerCache, modifyTypeByAnnotationMethodArguments));
        
        JavaType mapType_keyType = ((JavaType) getFieldValue(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
        JavaType actual_keyType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(mapType_keyType, actual_keyType);
        
        JavaType actual_valueType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType"));
        assertNull(actual_valueType);
        
        JavaType actual_superClass = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass"));
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(actual, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        assertNull(actual_superInterfaces);
        
        TypeBindings actual_bindings = ((TypeBindings) getFieldValue(actual, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings"));
        assertNull(actual_bindings);
        
        String actual_canonicalName = ((String) getFieldValue(actual, "com.fasterxml.jackson.databind.type.TypeBase", "_canonicalName"));
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
            com.fasterxml.jackson.databind.deser.DeserializerCache.modifyTypeByAnnotation(DeserializerCache.java:472) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} when: type.isMapLikeType()
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
                com.fasterxml.jackson.databind.deser.DeserializerCache.modifyTypeByAnnotation(DeserializerCache.java:480) */
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
 * @utbot.executesCondition {@code (intr == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: type.isMapLikeType()
 *  */
    @Test
    public void testModifyTypeByAnnotation_ThrowNullPointerException_1() throws Throwable  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache.modifyTypeByAnnotation] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache.modifyTypeByAnnotation(DeserializerCache.java:480) */
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
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.deser.KeyDeserializers[] _additionalKeyDeserializers = {};
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_additionalKeyDeserializers", _additionalKeyDeserializers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Class _class = Object.class;
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache.findKeyDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationConfig.introspect(DeserializationConfig.java:900)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers.findStringBasedKeyDeserializer(StdKeyDeserializers.java:54)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createKeyDeserializer(BasicDeserializerFactory.java:1414)
            com.fasterxml.jackson.databind.deser.DeserializerCache.findKeyDeserializer(DeserializerCache.java:166) */
        deserializerCache.findKeyDeserializer(impl, beanDeserializerFactory, resolvedRecursiveType);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method findKeyDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.DeserializerFactory, com.fasterxml.jackson.databind.JavaType)
    
    @Test(expected = IllegalArgumentException.class)
    public void testFindKeyDeserializer2() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        DeserializerFactoryConfig deserializerFactoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.deser.KeyDeserializers[] _additionalKeyDeserializers = {null};
        setField(deserializerFactoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_additionalKeyDeserializers", _additionalKeyDeserializers);
        BeanDeserializerFactory beanDeserializerFactory = new BeanDeserializerFactory(deserializerFactoryConfig);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        deserializerCache.findKeyDeserializer(impl, beanDeserializerFactory, referenceType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.DeserializerCache._findCachedDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method _findCachedDeserializer(com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_findCachedDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_findCachedDeserializer_ReturnNull() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _valueType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        byte[] _valueHandler = {};
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        JsonDeserializer actual = deserializerCache._findCachedDeserializer(mapLikeType);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_findCachedDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_findCachedDeserializer_ReturnNull_2() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        ReferenceType _componentType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        byte[] _valueHandler = {};
        setField(_componentType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(arrayType, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        
        JsonDeserializer actual = deserializerCache._findCachedDeserializer(arrayType);
        
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
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _valueType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        byte[] _typeHandler = {};
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        JsonDeserializer actual = deserializerCache._findCachedDeserializer(mapLikeType);
        
        assertNull(actual);
    }
    
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
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        Object actual = deserializerCache._findCachedDeserializer(mapLikeType);
        
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
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Object doubleDeser = createInstance("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$DoubleDeser");
        _cachedDeserializers.put(mapType, doubleDeser);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        Object actual = deserializerCache._findCachedDeserializer(mapLikeType);
        
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
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        _cachedDeserializers.put(mapType, null);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        
        JsonDeserializer actual = deserializerCache._findCachedDeserializer(mapType);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method _findCachedDeserializer(com.fasterxml.jackson.databind.JavaType)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): False},
    ///     {@code (_hasCustomHandlers(type)): False}
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
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object doubleDeser = createInstance("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$DoubleDeser");
        _cachedDeserializers.put(collectionLikeType, doubleDeser);
        CollectionLikeType collectionLikeType1 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object doubleDeser1 = createInstance("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$DoubleDeser");
        _cachedDeserializers.put(collectionLikeType1, doubleDeser1);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        Object actual = deserializerCache._findCachedDeserializer(mapLikeType);
        
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
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        UntypedObjectDeserializer.Vanilla vanilla = ((UntypedObjectDeserializer.Vanilla) createInstance("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer$Vanilla"));
        _cachedDeserializers.put(referenceType, vanilla);
        ReferenceType referenceType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        UntypedObjectDeserializer.Vanilla vanilla1 = ((UntypedObjectDeserializer.Vanilla) createInstance("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer$Vanilla"));
        _cachedDeserializers.put(referenceType1, vanilla1);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        Object actual = deserializerCache._findCachedDeserializer(mapLikeType);
        
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
        AtomicReferenceDeserializer atomicReferenceDeserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        _cachedDeserializers.put(simpleType, atomicReferenceDeserializer);
        SimpleType simpleType1 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        AtomicReferenceDeserializer atomicReferenceDeserializer1 = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        _cachedDeserializers.put(simpleType1, atomicReferenceDeserializer1);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        Object actual = deserializerCache._findCachedDeserializer(mapLikeType);
        
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
        AtomicReferenceDeserializer atomicReferenceDeserializer = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        _cachedDeserializers.put(arrayType, atomicReferenceDeserializer);
        ArrayType arrayType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        AtomicReferenceDeserializer atomicReferenceDeserializer1 = ((AtomicReferenceDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        _cachedDeserializers.put(arrayType1, atomicReferenceDeserializer1);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        Object actual = deserializerCache._findCachedDeserializer(mapLikeType);
        
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
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CoreXMLDeserializers.Std std = ((CoreXMLDeserializers.Std) createInstance("com.fasterxml.jackson.databind.ext.CoreXMLDeserializers$Std"));
        _cachedDeserializers.put(collectionLikeType, std);
        _cachedDeserializers.put(null, null);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        Object actual = deserializerCache._findCachedDeserializer(mapType);
        
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
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CoreXMLDeserializers.Std std = ((CoreXMLDeserializers.Std) createInstance("com.fasterxml.jackson.databind.ext.CoreXMLDeserializers$Std"));
        _cachedDeserializers.put(referenceType, std);
        _cachedDeserializers.put(null, null);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        Object actual = deserializerCache._findCachedDeserializer(mapLikeType);
        
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
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        UUIDDeserializer uUIDDeserializer = ((UUIDDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.UUIDDeserializer"));
        _cachedDeserializers.put(simpleType, uUIDDeserializer);
        _cachedDeserializers.put(null, null);
        setField(deserializerCache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        Object actual = deserializerCache._findCachedDeserializer(mapLikeType);
        
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
    public void test_findCachedDeserializer_ThrowNullPointerException_2() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._findCachedDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._findCachedDeserializer(DeserializerCache.java:210) */
        deserializerCache._findCachedDeserializer(referenceType);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_findCachedDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _cachedDeserializers.get(type);
 *  */
    @Test
    public void test_findCachedDeserializer_ThrowNullPointerException_4() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        PlaceholderForType placeholderForType = ((PlaceholderForType) createInstance("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._findCachedDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._findCachedDeserializer(DeserializerCache.java:210) */
        deserializerCache._findCachedDeserializer(placeholderForType);
    }
    
    /**
    @utbot.classUnderTest {@link DeserializerCache}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.DeserializerCache#_findCachedDeserializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _cachedDeserializers.get(type);
 *  */
    @Test
    public void test_findCachedDeserializer_ThrowNullPointerException() throws Exception  {
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
    public void test_findCachedDeserializer_ThrowNullPointerException_3() throws Exception  {
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
    public void test_findCachedDeserializer_ThrowNullPointerException_1() throws Exception  {
        DeserializerCache deserializerCache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _valueType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.DeserializerCache._findCachedDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.DeserializerCache._findCachedDeserializer(DeserializerCache.java:210) */
        deserializerCache._findCachedDeserializer(mapLikeType);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1087014755142499 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1087014755142499.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1087014755149900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1087014755142499.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1087014755149900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields1087014758185399 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1087014758185399.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1087014758190300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1087014758185399.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1087014758190300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1087014758423700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1087014758423700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1087014758427199 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1087014758423700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1087014758427199).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

