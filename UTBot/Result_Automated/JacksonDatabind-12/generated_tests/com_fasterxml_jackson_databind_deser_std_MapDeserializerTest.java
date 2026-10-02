package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.DelegatingKD;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.ext.CoreXMLDeserializers.Std;
import com.fasterxml.jackson.databind.ext.CoreXMLDeserializers;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import java.util.HashMap;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.FloatDeser;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.databind.deser.AbstractDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer;
import java.util.Map;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.ShortDeser;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import java.util.HashSet;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.LongDeserializer;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.StringCtorKeyDeserializer;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.KeyDeserializers;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.StringKD;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import java.lang.reflect.Constructor;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer.StringFactoryKeyDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.FailingDeserializer;
import com.fasterxml.jackson.databind.node.MissingNode;
import com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer;
import com.fasterxml.jackson.databind.node.BooleanNode;
import com.fasterxml.jackson.databind.node.ShortNode;
import com.fasterxml.jackson.databind.node.NullNode;
import java.util.TreeMap;
import com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver;
import com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import java.util.LinkedHashMap;
import java.io.FileReader;
import jdk.internal.util.xml.impl.ReaderUTF16;
import com.fasterxml.jackson.core.json.JsonReadContext;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

public final class com_fasterxml_jackson_databind_deser_std_MapDeserializerTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.MapDeserializer.resolve
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method resolve(com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#resolve(com.fasterxml.jackson.databind.DeserializationContext)}
 *  */
    @Test
    public void testResolve_3() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        SimpleType _mapType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_mapType", _mapType);
        StdKeyDeserializer.DelegatingKD _keyDeserializer = ((StdKeyDeserializer.DelegatingKD) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$DelegatingKD"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_keyDeserializer", _keyDeserializer);
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueInstantiator", _valueInstantiator);
        
        mapDeserializer.resolve(null);
        
        boolean finalMapDeserializer_standardStringKey = mapDeserializer._standardStringKey;
        
        assertTrue(finalMapDeserializer_standardStringKey);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#resolve(com.fasterxml.jackson.databind.DeserializationContext)}
 *  */
    @Test
    public void testResolve_2() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        CollectionType _mapType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_mapType", _mapType);
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueInstantiator", _valueInstantiator);
        
        mapDeserializer.resolve(null);
        
        boolean finalMapDeserializer_standardStringKey = mapDeserializer._standardStringKey;
        
        assertTrue(finalMapDeserializer_standardStringKey);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#resolve(com.fasterxml.jackson.databind.DeserializationContext)}
 *  */
    @Test
    public void testResolve() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        MapType _mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        SimpleType _keyType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_mapType", _mapType);
        StdKeyDeserializer.DelegatingKD _keyDeserializer = ((StdKeyDeserializer.DelegatingKD) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$DelegatingKD"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_keyDeserializer", _keyDeserializer);
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        MapType _delegateType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_delegateType", _delegateType);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueInstantiator", _valueInstantiator);
        CoreXMLDeserializers.Std _delegateDeserializer = ((CoreXMLDeserializers.Std) createInstance("com.fasterxml.jackson.databind.ext.CoreXMLDeserializers$Std"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_delegateDeserializer", _delegateDeserializer);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        NumberDeserializers.DoubleDeserializer doubleDeserializer = ((NumberDeserializers.DoubleDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer"));
        _cachedDeserializers.put(_delegateType, doubleDeserializer);
        setField(_cache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        JsonDeserializer initialMapDeserializer_delegateDeserializer = mapDeserializer._delegateDeserializer;
        
        mapDeserializer.resolve(impl);
        
        JsonDeserializer finalMapDeserializer_delegateDeserializer = mapDeserializer._delegateDeserializer;
        
        assertFalse(initialMapDeserializer_delegateDeserializer == finalMapDeserializer_delegateDeserializer);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#resolve(com.fasterxml.jackson.databind.DeserializationContext)}
 *  */
    @Test
    public void testResolve_1() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        MapType _mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_mapType", _mapType);
        StdKeyDeserializer.DelegatingKD _keyDeserializer = ((StdKeyDeserializer.DelegatingKD) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$DelegatingKD"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_keyDeserializer", _keyDeserializer);
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        MapType _delegateType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_delegateType", _delegateType);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueInstantiator", _valueInstantiator);
        ObjectArrayDeserializer _delegateDeserializer = ((ObjectArrayDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_delegateDeserializer", _delegateDeserializer);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        NumberDeserializers.DoubleDeserializer doubleDeserializer = ((NumberDeserializers.DoubleDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer"));
        _cachedDeserializers.put(_delegateType, doubleDeserializer);
        setField(_cache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
        
        JsonDeserializer initialMapDeserializer_delegateDeserializer = mapDeserializer._delegateDeserializer;
        
        mapDeserializer.resolve(impl);
        
        boolean finalMapDeserializer_standardStringKey = mapDeserializer._standardStringKey;
        JsonDeserializer finalMapDeserializer_delegateDeserializer = mapDeserializer._delegateDeserializer;
        
        assertFalse(initialMapDeserializer_delegateDeserializer == finalMapDeserializer_delegateDeserializer);
        
        assertTrue(finalMapDeserializer_standardStringKey);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resolve(com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#resolve(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: SettableBeanProperty[] creatorProps = _valueInstantiator.getFromObjectArguments(ctxt.getConfig());
 *  */
    @Test
    public void testResolve_ThrowNullPointerException_3() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueInstantiator", _valueInstantiator);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.resolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.resolve(MapDeserializer.java:215) */
        mapDeserializer.resolve(null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#resolve(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: _valueInstantiator.canCreateUsingDelegate()
 *  */
    @Test
    public void testResolve_ThrowNullPointerException() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.resolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.resolve(MapDeserializer.java:201) */
        mapDeserializer.resolve(null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#resolve(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#getConfig()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType delegateType = _valueInstantiator.getDelegateType(ctxt.getConfig());
 *  */
    @Test
    public void testResolve_ThrowNullPointerException_1() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        SimpleType _delegateType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_delegateType", _delegateType);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueInstantiator", _valueInstantiator);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.resolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.resolve(MapDeserializer.java:202) */
        mapDeserializer.resolve(null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#resolve(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: SettableBeanProperty[] creatorProps = _valueInstantiator.getFromObjectArguments(ctxt.getConfig());
 *  */
    @Test
    public void testResolve_ThrowNullPointerException_2() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        AnnotatedConstructor _withArgsCreator = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_withArgsCreator", _withArgsCreator);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueInstantiator", _valueInstantiator);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.resolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.resolve(MapDeserializer.java:215) */
        mapDeserializer.resolve(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method resolve(com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void testResolve1() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        AnnotatedConstructor _withArgsCreator = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_withArgsCreator", _withArgsCreator);
        com.fasterxml.jackson.databind.deser.CreatorProperty[] _constructorArguments = new com.fasterxml.jackson.databind.deser.CreatorProperty[1];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        PrimitiveArrayDeserializers.FloatDeser _valueDeserializer = ((PrimitiveArrayDeserializers.FloatDeser) createInstance("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$FloatDeser"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_valueDeserializer", _valueDeserializer);
        _constructorArguments[0] = creatorProperty;
        _valueInstantiator._constructorArguments = _constructorArguments;
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueInstantiator", _valueInstantiator);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.resolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.construct(PropertyBasedCreator.java:103)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.resolve(MapDeserializer.java:216) */
        mapDeserializer.resolve(impl);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.MapDeserializer.getContentType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getContentType()
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#getContentType()}
 * @utbot.returnsFrom {@code return _mapType.getContentType();}
 *  */
    @Test
    public void testGetContentType_Return_mapTypeGetContentType_3() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        SimpleType _mapType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_mapType", _mapType);
        
        JavaType actual = mapDeserializer.getContentType();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#getContentType()}
 * @utbot.returnsFrom {@code return _mapType.getContentType();}
 *  */
    @Test
    public void testGetContentType_Return_mapTypeGetContentType() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        CollectionLikeType _mapType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_mapType", _mapType);
        
        JavaType actual = mapDeserializer.getContentType();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#getContentType()}
 * @utbot.returnsFrom {@code return _mapType.getContentType();}
 *  */
    @Test
    public void testGetContentType_Return_mapTypeGetContentType_1() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        MapLikeType _mapType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_mapType", _mapType);
        
        JavaType actual = mapDeserializer.getContentType();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#getContentType()}
 * @utbot.returnsFrom {@code return _mapType.getContentType();}
 *  */
    @Test
    public void testGetContentType_Return_mapTypeGetContentType_2() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        ArrayType _mapType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_mapType", _mapType);
        
        JavaType actual = mapDeserializer.getContentType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getContentType()
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#getContentType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getContentType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _mapType.getContentType();
 *  */
    @Test
    public void testGetContentType_ThrowNullPointerException() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.getContentType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.getContentType(MapDeserializer.java:271) */
        mapDeserializer.getContentType();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserialize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_deserializeUsingCreator(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} 
 *  */
    @Test
    public void testDeserialize_ThrowNegativeArraySizeException() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", -256);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserialize] produces [java.lang.NegativeArraySizeException: -256]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.<init>(PropertyValueBuffer.java:57)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.startBuilding(PropertyBasedCreator.java:158)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:496)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserialize(MapDeserializer.java:313) */
        mapDeserializer.deserialize(((JsonParser) null), ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): False}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): False}
 * @utbot.executesCondition {@code (!_hasDefaultCreator): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = jp.getCurrentToken();
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_hasDefaultCreator", true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserialize(MapDeserializer.java:323) */
        mapDeserializer.deserialize(((JsonParser) null), ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): False}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): False}
 * @utbot.executesCondition {@code (!_hasDefaultCreator): False}
 * @utbot.executesCondition {@code (t != JsonToken.START_OBJECT): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Map<Object, Object> result = (Map<Object, Object>) _valueInstantiator.createUsingDefault(ctxt);
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_5() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_hasDefaultCreator", true);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserialize(MapDeserializer.java:331) */
        mapDeserializer.deserialize(((JsonParser) uTF8StreamJsonParser), ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): False}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): False}
 * @utbot.executesCondition {@code (!_hasDefaultCreator): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#getMapClass()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#instantiationException(java.lang.Class,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !_hasDefaultCreator
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_1() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        SimpleType _mapType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_mapType", _mapType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserialize(MapDeserializer.java:320) */
        mapDeserializer.deserialize(((JsonParser) null), ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): False}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): False}
 * @utbot.executesCondition {@code (!_hasDefaultCreator): False}
 * @utbot.executesCondition {@code (t != JsonToken.START_OBJECT): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Map<Object, Object> result = (Map<Object, Object>) _valueInstantiator.createUsingDefault(ctxt);
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_2() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_hasDefaultCreator", true);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserialize(MapDeserializer.java:331) */
        mapDeserializer.deserialize(((JsonParser) jsonParserSequence), ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): False}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): False}
 * @utbot.executesCondition {@code (!_hasDefaultCreator): False}
 * @utbot.executesCondition {@code (t != JsonToken.START_OBJECT): True}
 * @utbot.executesCondition {@code (t != JsonToken.FIELD_NAME): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Map<Object, Object> result = (Map<Object, Object>) _valueInstantiator.createUsingDefault(ctxt);
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_3() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_hasDefaultCreator", true);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserialize(MapDeserializer.java:331) */
        mapDeserializer.deserialize(((JsonParser) jsonParserSequence), ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): False}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): False}
 * @utbot.executesCondition {@code (!_hasDefaultCreator): False}
 * @utbot.executesCondition {@code (t != JsonToken.START_OBJECT): True}
 * @utbot.executesCondition {@code (t != JsonToken.FIELD_NAME): True}
 * @utbot.executesCondition {@code (t != JsonToken.END_OBJECT): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Map<Object, Object> result = (Map<Object, Object>) _valueInstantiator.createUsingDefault(ctxt);
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_4() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_hasDefaultCreator", true);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        TreeTraversingParser delegate1 = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.END_OBJECT;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserialize(MapDeserializer.java:331) */
        mapDeserializer.deserialize(((JsonParser) jsonParserSequence), ((DeserializationContext) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDeserialize_ThrowIllegalArgumentException() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 1);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[1];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        int[] _injectableValueId = {};
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_injectableValueId", _injectableValueId);
        _propertiesWithInjectables[0] = ((SettableBeanProperty) creatorProperty);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        com.fasterxml.jackson.databind.InjectableValues.Std _injectableValues = ((com.fasterxml.jackson.databind.InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        
        mapDeserializer.deserialize(((JsonParser) null), ((DeserializationContext) impl));
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDeserialize_ThrowIllegalArgumentException_1() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 1);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[2];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        _propertiesWithInjectables[1] = ((SettableBeanProperty) creatorProperty);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        com.fasterxml.jackson.databind.InjectableValues.Std _injectableValues = ((com.fasterxml.jackson.databind.InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        
        mapDeserializer.deserialize(((JsonParser) null), ((DeserializationContext) impl));
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} 
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserialize_ThrowIllegalStateException_2() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 1);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[2];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        _propertiesWithInjectables[1] = ((SettableBeanProperty) creatorProperty);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        mapDeserializer.deserialize(((JsonParser) null), ((DeserializationContext) impl));
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): False}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: _delegateDeserializer.deserialize(jp, ctxt)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserialize_ThrowIllegalStateException_3() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueInstantiator", _valueInstantiator);
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        setField(_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _delegateDeserializer);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_delegateDeserializer", _delegateDeserializer);
        
        mapDeserializer.deserialize(((JsonParser) null), ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): False}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): False}
 * @utbot.executesCondition {@code (!_hasDefaultCreator): False}
 * @utbot.executesCondition {@code (t != JsonToken.START_OBJECT): True}
 * @utbot.executesCondition {@code (t != JsonToken.FIELD_NAME): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: final Map<Object, Object> result = (Map<Object, Object>) _valueInstantiator.createUsingDefault(ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserialize_ThrowIllegalStateException() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueInstantiator", _valueInstantiator);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_hasDefaultCreator", true);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        TreeTraversingParser delegate1 = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        mapDeserializer.deserialize(((JsonParser) jsonParserSequence), ((DeserializationContext) null));
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_propertyBasedCreator != null): False}
 * @utbot.executesCondition {@code (_delegateDeserializer != null): False}
 * @utbot.executesCondition {@code (!_hasDefaultCreator): False}
 * @utbot.executesCondition {@code (t != JsonToken.START_OBJECT): True}
 * @utbot.executesCondition {@code (t != JsonToken.FIELD_NAME): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: final Map<Object, Object> result = (Map<Object, Object>) _valueInstantiator.createUsingDefault(ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDeserialize_ThrowIllegalStateException_1() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object _valueInstantiator = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla");
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla", "_type", 8);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueInstantiator", _valueInstantiator);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_hasDefaultCreator", true);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        mapDeserializer.deserialize(((JsonParser) jsonParserDelegate1), ((DeserializationContext) null));
    }
    ///endregion
    
    ///region Errors report for deserialize
    
    public void testDeserialize_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserialize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.util.Map)
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 *  */
    @Test
    public void testDeserialize_ReturnResult_1() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        mapDeserializer._standardStringKey = true;
        AbstractDeserializer _valueDeserializer = ((AbstractDeserializer) createInstance("com.fasterxml.jackson.databind.deser.AbstractDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueDeserializer", _valueDeserializer);
        AsArrayTypeDeserializer _valueTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueTypeDeserializer", _valueTypeDeserializer);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nextToken", _nextToken);
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _nextToken);
        
        Map actual = mapDeserializer.deserialize(((JsonParser) treeTraversingParser), ((DeserializationContext) null), ((Map) null));
        
        assertNull(actual);
        
        JsonToken finalTreeTraversingParser_nextToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nextToken"));
        
        assertNull(finalTreeTraversingParser_nextToken);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 *  */
    @Test
    public void testDeserialize_ReturnResult() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        mapDeserializer._standardStringKey = true;
        AbstractDeserializer _valueDeserializer = ((AbstractDeserializer) createInstance("com.fasterxml.jackson.databind.deser.AbstractDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueDeserializer", _valueDeserializer);
        AsWrapperTypeDeserializer _valueTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueTypeDeserializer", _valueTypeDeserializer);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        Map actual = mapDeserializer.deserialize(((JsonParser) treeTraversingParser), ((DeserializationContext) null), ((Map) null));
        
        assertNull(actual);
        
        boolean finalTreeTraversingParser_closed = ((Boolean) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_closed"));
        
        assertTrue(finalTreeTraversingParser_closed);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.util.Map)
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = jp.getCurrentToken();
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException1() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserialize(MapDeserializer.java:346) */
        mapDeserializer.deserialize(((JsonParser) null), ((DeserializationContext) null), ((Map) null));
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.executesCondition {@code (t != JsonToken.START_OBJECT): True}
 * @utbot.executesCondition {@code (t != JsonToken.FIELD_NAME): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: t != JsonToken.START_OBJECT && t != JsonToken.FIELD_NAME
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_11() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        CollectionType _mapType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_mapType", _mapType);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(readerBasedJsonParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:449)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1856)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:183)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind(MapDeserializer.java:390)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserialize(MapDeserializer.java:354) */
        mapDeserializer.deserialize(((JsonParser) jsonParserDelegate), ((DeserializationContext) null), ((Map) null));
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.executesCondition {@code (t != JsonToken.START_OBJECT): True}
 * @utbot.executesCondition {@code (t != JsonToken.FIELD_NAME): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: t != JsonToken.START_OBJECT && t != JsonToken.FIELD_NAME
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException_21() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        CollectionType _mapType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_mapType", _mapType);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8StreamJsonParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserialize] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserialize(MapDeserializer.java:348) */
        mapDeserializer.deserialize(((JsonParser) jsonParserDelegate1), ((DeserializationContext) null), ((Map) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.MapDeserializer.createContextual
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createContextual(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty)
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#createContextual(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (kd == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: kd = ctxt.findKeyDeserializer(_mapType.getKeyType(), property);
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.createContextual(MapDeserializer.java:231) */
        mapDeserializer.createContextual(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#createContextual(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (kd == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getKeyType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#findKeyDeserializer(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: kd = ctxt.findKeyDeserializer(_mapType.getKeyType(), property);
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException_1() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        MapLikeType _mapType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_mapType", _mapType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.createContextual(MapDeserializer.java:231) */
        mapDeserializer.createContextual(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#createContextual(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (kd == null): False}
 * @utbot.executesCondition {@code (kd instanceof ContextualKeyDeserializer): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#findConvertingContentDeserializer(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getContentType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: vd = ctxt.findContextualValueDeserializer(_mapType.getContentType(), property);
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException_2() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        StdKeyDeserializer _keyDeserializer = ((StdKeyDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_keyDeserializer", _keyDeserializer);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.createContextual(MapDeserializer.java:241) */
        mapDeserializer.createContextual(impl, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method createContextual(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty)
    
    @Test
    public void testCreateContextual1() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        StdKeyDeserializer _keyDeserializer = ((StdKeyDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_keyDeserializer", _keyDeserializer);
        PrimitiveArrayDeserializers.ShortDeser _valueDeserializer = ((PrimitiveArrayDeserializers.ShortDeser) createInstance("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$ShortDeser"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueDeserializer", _valueDeserializer);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        MapDeserializer actual = ((MapDeserializer) mapDeserializer.createContextual(impl, beanPropertyWriter));
        
        JavaType actual_mapType = actual._mapType;
        assertNull(actual_mapType);
        
        KeyDeserializer mapDeserializer_keyDeserializer = mapDeserializer._keyDeserializer;
        KeyDeserializer actual_keyDeserializer = actual._keyDeserializer;
        int mapDeserializer_keyDeserializer_kind = ((Integer) getFieldValue(mapDeserializer_keyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_kind"));
        int actual_keyDeserializer_kind = ((Integer) getFieldValue(actual_keyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_kind"));
        assertEquals(mapDeserializer_keyDeserializer_kind, actual_keyDeserializer_kind);
        
        Class actual_keyDeserializer_keyClass = ((Class) getFieldValue(actual_keyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_keyClass"));
        assertNull(actual_keyDeserializer_keyClass);
        
        FromStringDeserializer actual_keyDeserializer_deser = ((FromStringDeserializer) getFieldValue(actual_keyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_deser"));
        assertNull(actual_keyDeserializer_deser);
        
        boolean actual_standardStringKey = actual._standardStringKey;
        assertFalse(actual_standardStringKey);
        
        JsonDeserializer mapDeserializer_valueDeserializer = mapDeserializer._valueDeserializer;
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        Class actual_valueDeserializer_valueClass = ((Class) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_valueDeserializer_valueClass);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        boolean actual_hasDefaultCreator = actual._hasDefaultCreator;
        assertFalse(actual_hasDefaultCreator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        assertNull(actual_propertyBasedCreator);
        
        HashSet actual_ignorableProperties = actual._ignorableProperties;
        assertNull(actual_ignorableProperties);
        
        assertTrue(deepEquals(mapDeserializer, actual));
    }
    
    @Test
    public void testCreateContextual2() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        StdKeyDeserializer _keyDeserializer = ((StdKeyDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_keyDeserializer", _keyDeserializer);
        NumberDeserializers.LongDeserializer _valueDeserializer = ((NumberDeserializers.LongDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueDeserializer", _valueDeserializer);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        MapDeserializer actual = ((MapDeserializer) mapDeserializer.createContextual(impl, null));
        
        JavaType actual_mapType = actual._mapType;
        assertNull(actual_mapType);
        
        KeyDeserializer mapDeserializer_keyDeserializer = mapDeserializer._keyDeserializer;
        KeyDeserializer actual_keyDeserializer = actual._keyDeserializer;
        int mapDeserializer_keyDeserializer_kind = ((Integer) getFieldValue(mapDeserializer_keyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_kind"));
        int actual_keyDeserializer_kind = ((Integer) getFieldValue(actual_keyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_kind"));
        assertEquals(mapDeserializer_keyDeserializer_kind, actual_keyDeserializer_kind);
        
        Class actual_keyDeserializer_keyClass = ((Class) getFieldValue(actual_keyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_keyClass"));
        assertNull(actual_keyDeserializer_keyClass);
        
        FromStringDeserializer actual_keyDeserializer_deser = ((FromStringDeserializer) getFieldValue(actual_keyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_deser"));
        assertNull(actual_keyDeserializer_deser);
        
        boolean actual_standardStringKey = actual._standardStringKey;
        assertFalse(actual_standardStringKey);
        
        JsonDeserializer mapDeserializer_valueDeserializer = mapDeserializer._valueDeserializer;
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        Object actual_valueDeserializer_nullValue = getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer", "_nullValue");
        assertNull(actual_valueDeserializer_nullValue);
        
        Class actual_valueDeserializer_valueClass = ((Class) getFieldValue(actual_valueDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_valueDeserializer_valueClass);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        boolean actual_hasDefaultCreator = actual._hasDefaultCreator;
        assertFalse(actual_hasDefaultCreator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        assertNull(actual_propertyBasedCreator);
        
        HashSet actual_ignorableProperties = actual._ignorableProperties;
        assertNull(actual_ignorableProperties);
        
        assertTrue(deepEquals(mapDeserializer, actual));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createContextual(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty)
    
    @Test
    public void testCreateContextual3() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        CollectionLikeType _mapType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_mapType", _mapType);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object multiView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView");
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.findKeyDeserializer(DeserializationContext.java:417)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.createContextual(MapDeserializer.java:231) */
        Class mapDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class multiViewType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = mapDeserializerClazz.getDeclaredMethod("createContextual", implType, multiViewType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = multiView;
        try {
            createContextualMethod.invoke(mapDeserializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateContextual4() throws Throwable  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
            StdKeyDeserializer.StringCtorKeyDeserializer _keyDeserializer = ((StdKeyDeserializer.StringCtorKeyDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringCtorKeyDeserializer"));
            setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_keyDeserializer", _keyDeserializer);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
            Object multiView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView");
            
            /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.createContextual] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.std.MapDeserializer.createContextual(MapDeserializer.java:241) */
            Class mapDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
            Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
            Class multiViewType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
            Method createContextualMethod = mapDeserializerClazz.getDeclaredMethod("createContextual", implType, multiViewType);
            createContextualMethod.setAccessible(true);
            java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
            createContextualMethodArguments[0] = impl;
            createContextualMethodArguments[1] = multiView;
            try {
                createContextualMethod.invoke(mapDeserializer, createContextualMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testCreateContextual5() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        StdKeyDeserializer _keyDeserializer = ((StdKeyDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_keyDeserializer", _keyDeserializer);
        CollectionDeserializer _valueDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueDeserializer", _valueDeserializer);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.createContextual(CollectionDeserializer.java:153)
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.createContextual(CollectionDeserializer.java:25)
            com.fasterxml.jackson.databind.DeserializationContext.handleSecondaryContextualization(DeserializationContext.java:594)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.createContextual(MapDeserializer.java:243) */
        mapDeserializer.createContextual(impl, null);
    }
    
    @Test
    public void testCreateContextual6() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        StdKeyDeserializer _keyDeserializer = ((StdKeyDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_keyDeserializer", _keyDeserializer);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findDeserializationContentConverter(JacksonAnnotationIntrospector.java:619)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.findConvertingContentDeserializer(StdDeserializer.java:867)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.createContextual(MapDeserializer.java:239) */
        mapDeserializer.createContextual(impl, beanPropertyWriter);
    }
    
    @Test
    public void testCreateContextual7() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        MapLikeType _mapType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _keyType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_mapType", _mapType);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
        DeserializerFactoryConfig _factoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.deser.KeyDeserializers[] _additionalKeyDeserializers = {null, null, null, null, null, null, null, null, null};
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_additionalKeyDeserializers", _additionalKeyDeserializers);
        setField(_factory, "com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_factoryConfig", _factoryConfig);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeFactory._fromClass(TypeFactory.java:707)
            com.fasterxml.jackson.databind.type.TypeFactory._constructType(TypeFactory.java:387)
            com.fasterxml.jackson.databind.type.TypeFactory.constructType(TypeFactory.java:358)
            com.fasterxml.jackson.databind.cfg.MapperConfig.constructType(MapperConfig.java:268)
            com.fasterxml.jackson.databind.cfg.MapperConfig.introspectClassAnnotations(MapperConfig.java:298)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createKeyDeserializer(BasicDeserializerFactory.java:1257)
            com.fasterxml.jackson.databind.deser.DeserializerCache.findKeyDeserializer(DeserializerCache.java:166)
            com.fasterxml.jackson.databind.DeserializationContext.findKeyDeserializer(DeserializationContext.java:417)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.createContextual(MapDeserializer.java:231) */
        mapDeserializer.createContextual(impl, null);
    }
    
    @Test
    public void testCreateContextual8() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        MapLikeType _mapType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _keyType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_mapType", _mapType);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
        DeserializerFactoryConfig _factoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.deser.KeyDeserializers[] _additionalKeyDeserializers = {};
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_additionalKeyDeserializers", _additionalKeyDeserializers);
        setField(_factory, "com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_factoryConfig", _factoryConfig);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        BasicClassIntrospector _classIntrospector = ((BasicClassIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_classIntrospector", _classIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationConfig.getDefaultVisibilityChecker(DeserializationConfig.java:489)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.<init>(POJOPropertiesCollector.java:109)
            com.fasterxml.jackson.databind.introspect.BasicClassIntrospector.constructPropertyCollector(BasicClassIntrospector.java:163)
            com.fasterxml.jackson.databind.introspect.BasicClassIntrospector.collectProperties(BasicClassIntrospector.java:142)
            com.fasterxml.jackson.databind.introspect.BasicClassIntrospector.forDeserialization(BasicClassIntrospector.java:81)
            com.fasterxml.jackson.databind.introspect.BasicClassIntrospector.forDeserialization(BasicClassIntrospector.java:11)
            com.fasterxml.jackson.databind.DeserializationConfig.introspect(DeserializationConfig.java:550)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers.findStringBasedKeyDeserializer(StdKeyDeserializers.java:54)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createKeyDeserializer(BasicDeserializerFactory.java:1270)
            com.fasterxml.jackson.databind.deser.DeserializerCache.findKeyDeserializer(DeserializerCache.java:166)
            com.fasterxml.jackson.databind.DeserializationContext.findKeyDeserializer(DeserializationContext.java:417)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.createContextual(MapDeserializer.java:231) */
        mapDeserializer.createContextual(impl, null);
    }
    
    @Test
    public void testCreateContextual9() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        MapLikeType _mapType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _keyType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_mapType", _mapType);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
        DeserializerFactoryConfig _factoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.deser.KeyDeserializers[] _additionalKeyDeserializers = {};
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_additionalKeyDeserializers", _additionalKeyDeserializers);
        setField(_factory, "com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_factoryConfig", _factoryConfig);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        BasicClassIntrospector _classIntrospector = ((BasicClassIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_classIntrospector", _classIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationConfig.getDefaultVisibilityChecker(DeserializationConfig.java:489)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.<init>(POJOPropertiesCollector.java:109)
            com.fasterxml.jackson.databind.introspect.BasicClassIntrospector.constructPropertyCollector(BasicClassIntrospector.java:163)
            com.fasterxml.jackson.databind.introspect.BasicClassIntrospector.collectProperties(BasicClassIntrospector.java:142)
            com.fasterxml.jackson.databind.introspect.BasicClassIntrospector.forDeserialization(BasicClassIntrospector.java:81)
            com.fasterxml.jackson.databind.introspect.BasicClassIntrospector.forDeserialization(BasicClassIntrospector.java:11)
            com.fasterxml.jackson.databind.DeserializationConfig.introspect(DeserializationConfig.java:550)
            com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers.findStringBasedKeyDeserializer(StdKeyDeserializers.java:54)
            com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createKeyDeserializer(BasicDeserializerFactory.java:1270)
            com.fasterxml.jackson.databind.deser.DeserializerCache.findKeyDeserializer(DeserializerCache.java:166)
            com.fasterxml.jackson.databind.DeserializationContext.findKeyDeserializer(DeserializationContext.java:417)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.createContextual(MapDeserializer.java:231) */
        mapDeserializer.createContextual(impl, null);
    }
    
    @Test
    public void testCreateContextual10() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        StdKeyDeserializer.StringKD _keyDeserializer = ((StdKeyDeserializer.StringKD) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringKD"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_keyDeserializer", _keyDeserializer);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        com.fasterxml.jackson.databind.BeanProperty.Std std = new com.fasterxml.jackson.databind.BeanProperty.Std(((PropertyName) null), ((JavaType) null), ((PropertyName) null), ((Annotations) null), ((AnnotatedMember) null), ((PropertyMetadata) null));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findDeserializationContentConverter(JacksonAnnotationIntrospector.java:619)
            com.fasterxml.jackson.databind.deser.std.StdDeserializer.findConvertingContentDeserializer(StdDeserializer.java:867)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.createContextual(MapDeserializer.java:239) */
        mapDeserializer.createContextual(impl, std);
    }
    
    @Test
    public void testCreateContextual11() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        CollectionLikeType _mapType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_mapType", _mapType);
        StdKeyDeserializer.DelegatingKD _keyDeserializer = ((StdKeyDeserializer.DelegatingKD) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$DelegatingKD"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_keyDeserializer", _keyDeserializer);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        ValueInjector valueInjector = new ValueInjector(((PropertyName) null), ((JavaType) null), ((Annotations) null), ((AnnotatedMember) null), ((Object) null));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.findContextualValueDeserializer(DeserializationContext.java:380)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.createContextual(MapDeserializer.java:241) */
        Class mapDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = mapDeserializerClazz.getDeclaredMethod("createContextual", implType, valueInjectorType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = valueInjector;
        try {
            createContextualMethod.invoke(mapDeserializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createContextual(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty)
    
    @Test(expected = IllegalArgumentException.class)
    public void testCreateContextual12() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        MapLikeType _mapType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _keyType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(_mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_mapType", _mapType);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
        DeserializerFactoryConfig _factoryConfig = ((DeserializerFactoryConfig) createInstance("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"));
        com.fasterxml.jackson.databind.deser.KeyDeserializers[] _additionalKeyDeserializers = {null, null, null, null, null, null, null, null, null};
        setField(_factoryConfig, "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "_additionalKeyDeserializers", _additionalKeyDeserializers);
        setField(_factory, "com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_factoryConfig", _factoryConfig);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        mapDeserializer.createContextual(impl, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.MapDeserializer._isStdKeyDeser
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _isStdKeyDeser(com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.KeyDeserializer)
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_isStdKeyDeser(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.KeyDeserializer)}
 * @utbot.executesCondition {@code (keyDeser == null): True}
 *  */
    @Test
    public void test_isStdKeyDeser_KeyDeserEqualsNull() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        
        boolean actual = mapDeserializer._isStdKeyDeser(null, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_isStdKeyDeser(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.KeyDeserializer)}
 * @utbot.executesCondition {@code (keyDeser == null): False}
 * @utbot.executesCondition {@code (keyType == null): True}
 *  */
    @Test
    public void test_isStdKeyDeser_KeyTypeEqualsNull_1() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(0, null);
        
        boolean actual = mapDeserializer._isStdKeyDeser(collectionType, stdKeyDeserializer);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_isStdKeyDeser(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.KeyDeserializer)}
 * @utbot.executesCondition {@code (keyDeser == null): False}
 * @utbot.executesCondition {@code (keyType == null): True}
 *  */
    @Test
    public void test_isStdKeyDeser_KeyTypeEqualsNull() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(0, null);
        
        boolean actual = mapDeserializer._isStdKeyDeser(mapLikeType, stdKeyDeserializer);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_isStdKeyDeser(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.KeyDeserializer)}
 * @utbot.executesCondition {@code (keyDeser == null): False}
 * @utbot.executesCondition {@code (keyType == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.returnsFrom {@code return ((rawKeyType == String.class || rawKeyType == Object.class) && isDefaultKeyDeserializer(keyDeser));}
 *  */
    @Test
    public void test_isStdKeyDeser_RawKeyTypeNotEqualsStringClassOrRawKeyTypeNotEqualsObjectClassAndIsDefaultKeyDeserializer() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        SimpleType _keyType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(0, null);
        
        boolean actual = mapDeserializer._isStdKeyDeser(mapType, stdKeyDeserializer);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _isStdKeyDeser(com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.KeyDeserializer)
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_isStdKeyDeser(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.KeyDeserializer)}
 * @utbot.executesCondition {@code (keyDeser == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getKeyType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType keyType = mapType.getKeyType();
 *  */
    @Test
    public void test_isStdKeyDeser_ThrowNullPointerException() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(0, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._isStdKeyDeser] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._isStdKeyDeser(MapDeserializer.java:177) */
        mapDeserializer._isStdKeyDeser(null, stdKeyDeserializer);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.MapDeserializer.isCachable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isCachable()
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#isCachable()}
 * @utbot.returnsFrom {@code return (_valueTypeDeserializer == null) && (_ignorableProperties == null);}
 *  */
    @Test
    public void testIsCachable__valueTypeDeserializerNotEqualsNullAnd_ignorablePropertiesNotEqualsNull() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        AsWrapperTypeDeserializer _valueTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueTypeDeserializer", _valueTypeDeserializer);
        
        boolean actual = mapDeserializer.isCachable();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#isCachable()}
 * @utbot.returnsFrom {@code return (_valueTypeDeserializer == null) && (_ignorableProperties == null);}
 *  */
    @Test
    public void testIsCachable__valueTypeDeserializerEqualsNullAnd_ignorablePropertiesEqualsNull() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        
        boolean actual = mapDeserializer.isCachable();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#isCachable()}
 * @utbot.returnsFrom {@code return (_valueTypeDeserializer == null) && (_ignorableProperties == null);}
 *  */
    @Test
    public void testIsCachable__valueTypeDeserializerNotEqualsNullAnd_ignorablePropertiesNotEqualsNull_1() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        HashSet _ignorableProperties = new HashSet();
        mapDeserializer._ignorableProperties = _ignorableProperties;
        
        boolean actual = mapDeserializer.isCachable();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.MapDeserializer.withResolved
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method withResolved(com.fasterxml.jackson.databind.KeyDeserializer, com.fasterxml.jackson.databind.jsontype.TypeDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, java.util.HashSet)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (_keyDeserializer == keyDeser): True},
    ///     {@code (_valueDeserializer == valueDeser): True}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#withResolved(com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,java.util.HashSet)}
 * @utbot.executesCondition {@code (_valueTypeDeserializer == valueTypeDeser): True}
 * @utbot.executesCondition {@code (_ignorableProperties == ignorable): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithResolved__ignorablePropertiesEqualsIgnorable() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        
        MapDeserializer actual = mapDeserializer.withResolved(null, null, null, null);
        
        JavaType actual_mapType = actual._mapType;
        assertNull(actual_mapType);
        
        KeyDeserializer actual_keyDeserializer = actual._keyDeserializer;
        assertNull(actual_keyDeserializer);
        
        boolean actual_standardStringKey = actual._standardStringKey;
        assertFalse(actual_standardStringKey);
        
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        boolean actual_hasDefaultCreator = actual._hasDefaultCreator;
        assertFalse(actual_hasDefaultCreator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        assertNull(actual_propertyBasedCreator);
        
        HashSet actual_ignorableProperties = actual._ignorableProperties;
        assertNull(actual_ignorableProperties);
        
        Class actual_valueClass = actual._valueClass;
        assertNull(actual_valueClass);
        
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#withResolved(com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,java.util.HashSet)}
 * @utbot.executesCondition {@code (_valueTypeDeserializer == valueTypeDeser): False}
 * @utbot.returnsFrom {@code return new MapDeserializer(this, keyDeser, (JsonDeserializer<Object>) valueDeser, valueTypeDeser, ignorable);}
 *  */
    @Test
    public void testWithResolved__valueTypeDeserializerNotEqualsValueTypeDeser() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        CollectionType _mapType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_mapType", _mapType);
        StdKeyDeserializer _keyDeserializer = ((StdKeyDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_keyDeserializer", _keyDeserializer);
        AsArrayTypeDeserializer _valueTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueTypeDeserializer", _valueTypeDeserializer);
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(0, null);
        
        MapDeserializer actual = mapDeserializer.withResolved(stdKeyDeserializer, null, null, null);
        
        MapDeserializer expected = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_mapType", _mapType);
        setField(expected, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_keyDeserializer", _keyDeserializer);
        expected._standardStringKey = true;
        
        JavaType expected_mapType = expected._mapType;
        JavaType actual_mapType = actual._mapType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_mapType, actual_mapType);
        
        KeyDeserializer expected_keyDeserializer = expected._keyDeserializer;
        KeyDeserializer actual_keyDeserializer = actual._keyDeserializer;
        int expected_keyDeserializer_kind = ((Integer) getFieldValue(expected_keyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_kind"));
        int actual_keyDeserializer_kind = ((Integer) getFieldValue(actual_keyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_kind"));
        assertEquals(expected_keyDeserializer_kind, actual_keyDeserializer_kind);
        
        Class actual_keyDeserializer_keyClass = ((Class) getFieldValue(actual_keyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_keyClass"));
        assertNull(actual_keyDeserializer_keyClass);
        
        FromStringDeserializer actual_keyDeserializer_deser = ((FromStringDeserializer) getFieldValue(actual_keyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_deser"));
        assertNull(actual_keyDeserializer_deser);
        
        boolean actual_standardStringKey = actual._standardStringKey;
        assertTrue(actual_standardStringKey);
        
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        boolean actual_hasDefaultCreator = actual._hasDefaultCreator;
        assertFalse(actual_hasDefaultCreator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        assertNull(actual_propertyBasedCreator);
        
        HashSet actual_ignorableProperties = actual._ignorableProperties;
        assertNull(actual_ignorableProperties);
        
        Class actual_valueClass = actual._valueClass;
        assertNull(actual_valueClass);
        
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#withResolved(com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,java.util.HashSet)}
 * @utbot.executesCondition {@code (_valueTypeDeserializer == valueTypeDeser): True}
 * @utbot.executesCondition {@code (_ignorableProperties == ignorable): False}
 * @utbot.returnsFrom {@code return new MapDeserializer(this, keyDeser, (JsonDeserializer<Object>) valueDeser, valueTypeDeser, ignorable);}
 *  */
    @Test
    public void testWithResolved__ignorablePropertiesNotEqualsIgnorable_1() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        MapLikeType _mapType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_mapType", _mapType);
        StdKeyDeserializer _keyDeserializer = ((StdKeyDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_keyDeserializer", _keyDeserializer);
        HashSet _ignorableProperties = new HashSet();
        mapDeserializer._ignorableProperties = _ignorableProperties;
        StdKeyDeserializer stdKeyDeserializer = new StdKeyDeserializer(0, null);
        
        MapDeserializer actual = mapDeserializer.withResolved(stdKeyDeserializer, null, null, null);
        
        MapDeserializer expected = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_mapType", _mapType);
        setField(expected, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_keyDeserializer", _keyDeserializer);
        expected._standardStringKey = true;
        
        JavaType expected_mapType = expected._mapType;
        JavaType actual_mapType = actual._mapType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_mapType, actual_mapType);
        
        KeyDeserializer expected_keyDeserializer = expected._keyDeserializer;
        KeyDeserializer actual_keyDeserializer = actual._keyDeserializer;
        int expected_keyDeserializer_kind = ((Integer) getFieldValue(expected_keyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_kind"));
        int actual_keyDeserializer_kind = ((Integer) getFieldValue(actual_keyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_kind"));
        assertEquals(expected_keyDeserializer_kind, actual_keyDeserializer_kind);
        
        Class actual_keyDeserializer_keyClass = ((Class) getFieldValue(actual_keyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_keyClass"));
        assertNull(actual_keyDeserializer_keyClass);
        
        FromStringDeserializer actual_keyDeserializer_deser = ((FromStringDeserializer) getFieldValue(actual_keyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_deser"));
        assertNull(actual_keyDeserializer_deser);
        
        boolean actual_standardStringKey = actual._standardStringKey;
        assertTrue(actual_standardStringKey);
        
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        boolean actual_hasDefaultCreator = actual._hasDefaultCreator;
        assertFalse(actual_hasDefaultCreator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        assertNull(actual_propertyBasedCreator);
        
        HashSet actual_ignorableProperties = actual._ignorableProperties;
        assertNull(actual_ignorableProperties);
        
        Class actual_valueClass = actual._valueClass;
        assertNull(actual_valueClass);
        
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#withResolved(com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,java.util.HashSet)}
 * @utbot.executesCondition {@code (_valueTypeDeserializer == valueTypeDeser): True}
 * @utbot.executesCondition {@code (_ignorableProperties == ignorable): False}
 * @utbot.returnsFrom {@code return new MapDeserializer(this, keyDeser, (JsonDeserializer<Object>) valueDeser, valueTypeDeser, ignorable);}
 *  */
    @Test
    public void testWithResolved__ignorablePropertiesNotEqualsIgnorable() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        MapLikeType _mapType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionType _keyType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(_mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_mapType", _mapType);
        StdKeyDeserializer.StringCtorKeyDeserializer _keyDeserializer = ((StdKeyDeserializer.StringCtorKeyDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringCtorKeyDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_keyDeserializer", _keyDeserializer);
        HashSet _ignorableProperties = new HashSet();
        mapDeserializer._ignorableProperties = _ignorableProperties;
        
        MapDeserializer actual = mapDeserializer.withResolved(_keyDeserializer, null, null, null);
        
        MapDeserializer expected = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_mapType", _mapType);
        setField(expected, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_keyDeserializer", _keyDeserializer);
        
        JavaType expected_mapType = expected._mapType;
        JavaType actual_mapType = actual._mapType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_mapType, actual_mapType);
        
        KeyDeserializer expected_keyDeserializer = expected._keyDeserializer;
        KeyDeserializer actual_keyDeserializer = actual._keyDeserializer;
        Constructor actual_keyDeserializer_ctor = ((Constructor) getFieldValue(actual_keyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringCtorKeyDeserializer", "_ctor"));
        assertNull(actual_keyDeserializer_ctor);
        
        int expected_keyDeserializer_kind = ((Integer) getFieldValue(expected_keyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_kind"));
        int actual_keyDeserializer_kind = ((Integer) getFieldValue(actual_keyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_kind"));
        assertEquals(expected_keyDeserializer_kind, actual_keyDeserializer_kind);
        
        Class actual_keyDeserializer_keyClass = ((Class) getFieldValue(actual_keyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_keyClass"));
        assertNull(actual_keyDeserializer_keyClass);
        
        FromStringDeserializer actual_keyDeserializer_deser = ((FromStringDeserializer) getFieldValue(actual_keyDeserializer, "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_deser"));
        assertNull(actual_keyDeserializer_deser);
        
        boolean actual_standardStringKey = actual._standardStringKey;
        assertFalse(actual_standardStringKey);
        
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        boolean actual_hasDefaultCreator = actual._hasDefaultCreator;
        assertFalse(actual_hasDefaultCreator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        assertNull(actual_propertyBasedCreator);
        
        HashSet actual_ignorableProperties = actual._ignorableProperties;
        assertNull(actual_ignorableProperties);
        
        Class actual_valueClass = actual._valueClass;
        assertNull(actual_valueClass);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method withResolved(com.fasterxml.jackson.databind.KeyDeserializer, com.fasterxml.jackson.databind.jsontype.TypeDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, java.util.HashSet)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return new MapDeserializer(this, keyDeser, (JsonDeserializer<Object>) valueDeser, valueTypeDeser, ignorable);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#withResolved(com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,java.util.HashSet)}
 * @utbot.executesCondition {@code (_keyDeserializer == keyDeser): False}
 * @utbot.returnsFrom {@code return new MapDeserializer(this, keyDeser, (JsonDeserializer<Object>) valueDeser, valueTypeDeser, ignorable);}
 *  */
    @Test
    public void testWithResolved__keyDeserializerNotEqualsKeyDeser() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        StdKeyDeserializer.StringFactoryKeyDeserializer _keyDeserializer = ((StdKeyDeserializer.StringFactoryKeyDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringFactoryKeyDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_keyDeserializer", _keyDeserializer);
        
        MapDeserializer actual = mapDeserializer.withResolved(null, null, null, null);
        
        MapDeserializer expected = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        expected._standardStringKey = true;
        
        JavaType actual_mapType = actual._mapType;
        assertNull(actual_mapType);
        
        KeyDeserializer actual_keyDeserializer = actual._keyDeserializer;
        assertNull(actual_keyDeserializer);
        
        boolean actual_standardStringKey = actual._standardStringKey;
        assertTrue(actual_standardStringKey);
        
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        boolean actual_hasDefaultCreator = actual._hasDefaultCreator;
        assertFalse(actual_hasDefaultCreator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        assertNull(actual_propertyBasedCreator);
        
        HashSet actual_ignorableProperties = actual._ignorableProperties;
        assertNull(actual_ignorableProperties);
        
        Class actual_valueClass = actual._valueClass;
        assertNull(actual_valueClass);
        
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#withResolved(com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,java.util.HashSet)}
 * @utbot.executesCondition {@code (_keyDeserializer == keyDeser): True}
 * @utbot.executesCondition {@code (_valueDeserializer == valueDeser): False}
 * @utbot.returnsFrom {@code return new MapDeserializer(this, keyDeser, (JsonDeserializer<Object>) valueDeser, valueTypeDeser, ignorable);}
 *  */
    @Test
    public void testWithResolved__valueDeserializerNotEqualsValueDeser() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        TypeWrappedDeserializer _valueDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueDeserializer", _valueDeserializer);
        
        MapDeserializer actual = mapDeserializer.withResolved(null, null, null, null);
        
        MapDeserializer expected = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        expected._standardStringKey = true;
        
        JavaType actual_mapType = actual._mapType;
        assertNull(actual_mapType);
        
        KeyDeserializer actual_keyDeserializer = actual._keyDeserializer;
        assertNull(actual_keyDeserializer);
        
        boolean actual_standardStringKey = actual._standardStringKey;
        assertTrue(actual_standardStringKey);
        
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        boolean actual_hasDefaultCreator = actual._hasDefaultCreator;
        assertFalse(actual_hasDefaultCreator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        assertNull(actual_propertyBasedCreator);
        
        HashSet actual_ignorableProperties = actual._ignorableProperties;
        assertNull(actual_ignorableProperties);
        
        Class actual_valueClass = actual._valueClass;
        assertNull(actual_valueClass);
        
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#withResolved(com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,java.util.HashSet)}
 * @utbot.executesCondition {@code (_keyDeserializer == keyDeser): True}
 * @utbot.executesCondition {@code (_valueDeserializer == valueDeser): True}
 * @utbot.executesCondition {@code (_valueTypeDeserializer == valueTypeDeser): True}
 * @utbot.executesCondition {@code (_ignorableProperties == ignorable): False}
 * @utbot.returnsFrom {@code return new MapDeserializer(this, keyDeser, (JsonDeserializer<Object>) valueDeser, valueTypeDeser, ignorable);}
 *  */
    @Test
    public void testWithResolved__ignorablePropertiesNotEqualsIgnorable_2() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        HashSet _ignorableProperties = new HashSet();
        mapDeserializer._ignorableProperties = _ignorableProperties;
        
        MapDeserializer actual = mapDeserializer.withResolved(null, null, null, null);
        
        MapDeserializer expected = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        expected._standardStringKey = true;
        
        JavaType actual_mapType = actual._mapType;
        assertNull(actual_mapType);
        
        KeyDeserializer actual_keyDeserializer = actual._keyDeserializer;
        assertNull(actual_keyDeserializer);
        
        boolean actual_standardStringKey = actual._standardStringKey;
        assertTrue(actual_standardStringKey);
        
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        boolean actual_hasDefaultCreator = actual._hasDefaultCreator;
        assertFalse(actual_hasDefaultCreator);
        
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        assertNull(actual_delegateDeserializer);
        
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        assertNull(actual_propertyBasedCreator);
        
        HashSet actual_ignorableProperties = actual._ignorableProperties;
        assertNull(actual_ignorableProperties);
        
        Class actual_valueClass = actual._valueClass;
        assertNull(actual_valueClass);
        
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#withResolved(com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer,java.util.HashSet)}
 * @utbot.executesCondition {@code (_keyDeserializer == keyDeser): True}
 * @utbot.executesCondition {@code (_valueDeserializer == valueDeser): True}
 * @utbot.executesCondition {@code (_valueTypeDeserializer == valueTypeDeser): False}
 * @utbot.returnsFrom {@code return new MapDeserializer(this, keyDeser, (JsonDeserializer<Object>) valueDeser, valueTypeDeser, ignorable);}
 *  */
    @Test
    public void testWithResolved__valueTypeDeserializerNotEqualsValueTypeDeser_1() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        ArrayType _mapType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        Class _class = Object.class;
        setField(_mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_mapType", _mapType);
        AsArrayTypeDeserializer _valueTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueTypeDeserializer", _valueTypeDeserializer);
        BeanAsArrayBuilderDeserializer _delegateDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_delegateDeserializer", _delegateDeserializer);
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        
        JavaType javaType = mapDeserializer._mapType;
        Class initialMapDeserializer_mapType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapDeserializer actual = mapDeserializer.withResolved(null, null, null, null);
        
        MapDeserializer expected = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        setField(expected, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_mapType", _mapType);
        expected._standardStringKey = true;
        setField(expected, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_delegateDeserializer", _delegateDeserializer);
        expected._propertyBasedCreator = _propertyBasedCreator;
        setField(expected, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass", _class);
        
        JavaType expected_mapType = expected._mapType;
        JavaType actual_mapType = actual._mapType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_mapType, actual_mapType);
        
        KeyDeserializer actual_keyDeserializer = actual._keyDeserializer;
        assertNull(actual_keyDeserializer);
        
        boolean actual_standardStringKey = actual._standardStringKey;
        assertTrue(actual_standardStringKey);
        
        JsonDeserializer actual_valueDeserializer = actual._valueDeserializer;
        assertNull(actual_valueDeserializer);
        
        TypeDeserializer actual_valueTypeDeserializer = actual._valueTypeDeserializer;
        assertNull(actual_valueTypeDeserializer);
        
        ValueInstantiator actual_valueInstantiator = actual._valueInstantiator;
        assertNull(actual_valueInstantiator);
        
        boolean actual_hasDefaultCreator = actual._hasDefaultCreator;
        assertFalse(actual_hasDefaultCreator);
        
        JsonDeserializer expected_delegateDeserializer = expected._delegateDeserializer;
        JsonDeserializer actual_delegateDeserializer = actual._delegateDeserializer;
        BeanDeserializerBase actual_delegateDeserializer_delegate = ((BeanDeserializerBase) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer", "_delegate"));
        assertNull(actual_delegateDeserializer_delegate);
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_delegateDeserializer_orderedProperties = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer", "_orderedProperties"));
        assertNull(actual_delegateDeserializer_orderedProperties);
        
        AnnotatedMethod actual_delegateDeserializer_buildMethod = ((AnnotatedMethod) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer", "_buildMethod"));
        assertNull(actual_delegateDeserializer_buildMethod);
        
        Annotations actual_delegateDeserializer_classAnnotations = ((Annotations) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_classAnnotations"));
        assertNull(actual_delegateDeserializer_classAnnotations);
        
        JavaType actual_delegateDeserializer_beanType = ((JavaType) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType"));
        assertNull(actual_delegateDeserializer_beanType);
        
        JsonFormat.Shape actual_delegateDeserializer_serializationShape = ((JsonFormat.Shape) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_serializationShape"));
        assertNull(actual_delegateDeserializer_serializationShape);
        
        ValueInstantiator actual_delegateDeserializer_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_valueInstantiator"));
        assertNull(actual_delegateDeserializer_valueInstantiator);
        
        JsonDeserializer actual_delegateDeserializer_delegateDeserializer = ((JsonDeserializer) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_delegateDeserializer"));
        assertNull(actual_delegateDeserializer_delegateDeserializer);
        
        PropertyBasedCreator actual_delegateDeserializer_propertyBasedCreator = ((PropertyBasedCreator) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_propertyBasedCreator"));
        assertNull(actual_delegateDeserializer_propertyBasedCreator);
        
        boolean actual_delegateDeserializer_nonStandardCreation = ((Boolean) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_nonStandardCreation"));
        assertFalse(actual_delegateDeserializer_nonStandardCreation);
        
        boolean actual_delegateDeserializer_vanillaProcessing = ((Boolean) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing"));
        assertFalse(actual_delegateDeserializer_vanillaProcessing);
        
        BeanPropertyMap actual_delegateDeserializer_beanProperties = ((BeanPropertyMap) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanProperties"));
        assertNull(actual_delegateDeserializer_beanProperties);
        
        com.fasterxml.jackson.databind.deser.impl.ValueInjector[] actual_delegateDeserializer_injectables = ((com.fasterxml.jackson.databind.deser.impl.ValueInjector[]) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_injectables"));
        assertNull(actual_delegateDeserializer_injectables);
        
        SettableAnyProperty actual_delegateDeserializer_anySetter = ((SettableAnyProperty) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_anySetter"));
        assertNull(actual_delegateDeserializer_anySetter);
        
        HashSet actual_delegateDeserializer_ignorableProps = ((HashSet) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignorableProps"));
        assertNull(actual_delegateDeserializer_ignorableProps);
        
        boolean actual_delegateDeserializer_ignoreAllUnknown = ((Boolean) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_ignoreAllUnknown"));
        assertFalse(actual_delegateDeserializer_ignoreAllUnknown);
        
        boolean actual_delegateDeserializer_needViewProcesing = ((Boolean) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_needViewProcesing"));
        assertFalse(actual_delegateDeserializer_needViewProcesing);
        
        Map actual_delegateDeserializer_backRefs = ((Map) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_backRefs"));
        assertNull(actual_delegateDeserializer_backRefs);
        
        HashMap actual_delegateDeserializer_subDeserializers = ((HashMap) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_subDeserializers"));
        assertNull(actual_delegateDeserializer_subDeserializers);
        
        UnwrappedPropertyHandler actual_delegateDeserializer_unwrappedPropertyHandler = ((UnwrappedPropertyHandler) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_unwrappedPropertyHandler"));
        assertNull(actual_delegateDeserializer_unwrappedPropertyHandler);
        
        ExternalTypeHandler actual_delegateDeserializer_externalTypeIdHandler = ((ExternalTypeHandler) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_externalTypeIdHandler"));
        assertNull(actual_delegateDeserializer_externalTypeIdHandler);
        
        ObjectIdReader actual_delegateDeserializer_objectIdReader = ((ObjectIdReader) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_objectIdReader"));
        assertNull(actual_delegateDeserializer_objectIdReader);
        
        Class actual_delegateDeserializer_valueClass = ((Class) getFieldValue(actual_delegateDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_delegateDeserializer_valueClass);
        
        PropertyBasedCreator expected_propertyBasedCreator = expected._propertyBasedCreator;
        PropertyBasedCreator actual_propertyBasedCreator = actual._propertyBasedCreator;
        ValueInstantiator actual_propertyBasedCreator_valueInstantiator = ((ValueInstantiator) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator"));
        assertNull(actual_propertyBasedCreator_valueInstantiator);
        
        HashMap actual_propertyBasedCreator_properties = ((HashMap) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_properties"));
        assertNull(actual_propertyBasedCreator_properties);
        
        int expected_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(expected_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        int actual_propertyBasedCreator_propertyCount = ((Integer) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount"));
        assertEquals(expected_propertyBasedCreator_propertyCount, actual_propertyBasedCreator_propertyCount);
        
        java.lang.Object[] actual_propertyBasedCreator_defaultValues = ((java.lang.Object[]) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_defaultValues"));
        assertNull(actual_propertyBasedCreator_defaultValues);
        
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] actual_propertyBasedCreator_propertiesWithInjectables = ((com.fasterxml.jackson.databind.deser.SettableBeanProperty[]) getFieldValue(actual_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables"));
        assertNull(actual_propertyBasedCreator_propertiesWithInjectables);
        
        HashSet actual_ignorableProperties = actual._ignorableProperties;
        assertNull(actual_ignorableProperties);
        
        Class expected_valueClass = expected._valueClass;
        Class actual_valueClass = actual._valueClass;
        assertEquals(Class.class, actual_valueClass.getClass());
        
        JavaType javaType1 = mapDeserializer._mapType;
        Class finalMapDeserializer_mapType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapDeserializer_mapType_class == finalMapDeserializer_mapType_class);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.MapDeserializer.wrapAndThrow
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method wrapAndThrow(java.lang.Throwable, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#wrapAndThrow(java.lang.Throwable,java.lang.Object)}
 * @utbot.throwsException {@link java.io.IOException} in: wrapAndThrow(t, ref, null);
 *  */
    @Test(expected = IOException.class)
    public void testWrapAndThrow_ThrowIOException() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        IOException iOException = ((IOException) createInstance("java.io.IOException"));
        
        mapDeserializer.wrapAndThrow(iOException, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#wrapAndThrow(java.lang.Throwable,java.lang.Object)}
 * @utbot.throwsException {@link java.io.IOException} in: wrapAndThrow(t, ref, null);
 *  */
    @Test(expected = IOException.class)
    public void testWrapAndThrow_ThrowIOException_1() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        InvocationTargetException invocationTargetException = ((InvocationTargetException) createInstance("java.lang.reflect.InvocationTargetException"));
        IOException target = ((IOException) createInstance("java.io.IOException"));
        setField(invocationTargetException, "java.lang.reflect.InvocationTargetException", "target", target);
        
        mapDeserializer.wrapAndThrow(invocationTargetException, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method wrapAndThrow(java.lang.Throwable, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#wrapAndThrow(java.lang.Throwable,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.Error} in: wrapAndThrow(t, ref, null);
 *  */
    @Test(expected = Error.class)
    public void testWrapAndThrow_ThrowError() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Error error = ((Error) createInstance("java.lang.Error"));
        
        mapDeserializer.wrapAndThrow(error, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#wrapAndThrow(java.lang.Throwable,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: wrapAndThrow(t, ref, null);
 *  */
    @Test(expected = NullPointerException.class)
    public void testWrapAndThrow_ThrowNullPointerException() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        
        mapDeserializer.wrapAndThrow(jsonMappingException, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#wrapAndThrow(java.lang.Throwable,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: wrapAndThrow(t, ref, null);
 *  */
    @Test(expected = NullPointerException.class)
    public void testWrapAndThrow_ThrowNullPointerException_1() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        
        mapDeserializer.wrapAndThrow(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#wrapAndThrow(java.lang.Throwable,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: wrapAndThrow(t, ref, null);
 *  */
    @Test(expected = NullPointerException.class)
    public void testWrapAndThrow_ThrowNullPointerException_2() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        InvocationTargetException invocationTargetException = ((InvocationTargetException) createInstance("java.lang.reflect.InvocationTargetException"));
        
        mapDeserializer.wrapAndThrow(invocationTargetException, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.MapDeserializer.wrapAndThrow
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method wrapAndThrow(java.lang.Throwable, java.lang.Object, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#wrapAndThrow(java.lang.Throwable,java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (t instanceof Error): True}
 * @utbot.throwsException {@link java.lang.Error} when: t instanceof Error
 *  */
    @Test(expected = Error.class)
    public void testWrapAndThrow_ThrowError1() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Error error = ((Error) createInstance("java.lang.Error"));
        
        mapDeserializer.wrapAndThrow(error, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#wrapAndThrow(java.lang.Throwable,java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (t instanceof Error): True}
 * @utbot.iterates iterate the loop {@code while(t instanceof InvocationTargetException && t.getCause() != null)} once
 * @utbot.throwsException {@link java.lang.Error} when: t instanceof Error
 *  */
    @Test(expected = Error.class)
    public void testWrapAndThrow_ThrowError_1() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        InvocationTargetException invocationTargetException = ((InvocationTargetException) createInstance("java.lang.reflect.InvocationTargetException"));
        Error target = ((Error) createInstance("java.lang.Error"));
        setField(invocationTargetException, "java.lang.reflect.InvocationTargetException", "target", target);
        
        mapDeserializer.wrapAndThrow(invocationTargetException, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#wrapAndThrow(java.lang.Throwable,java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (t instanceof Error): False}
 * @utbot.executesCondition {@code (t instanceof IOException): True}
 * @utbot.executesCondition {@code (!(t instanceof JsonMappingException)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw JsonMappingException.wrapWithPath(t, ref, key);
 *  */
    @Test(expected = NullPointerException.class)
    public void testWrapAndThrow_ThrowNullPointerException_21() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        
        mapDeserializer.wrapAndThrow(jsonMappingException, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#wrapAndThrow(java.lang.Throwable,java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (t instanceof Error): False}
 * @utbot.executesCondition {@code (t instanceof IOException): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw JsonMappingException.wrapWithPath(t, ref, key);
 *  */
    @Test(expected = NullPointerException.class)
    public void testWrapAndThrow_ThrowNullPointerException1() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        
        mapDeserializer.wrapAndThrow(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#wrapAndThrow(java.lang.Throwable,java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (t instanceof Error): False}
 * @utbot.executesCondition {@code (t instanceof IOException): False}
 * @utbot.iterates iterate the loop {@code while(t instanceof InvocationTargetException && t.getCause() != null)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw JsonMappingException.wrapWithPath(t, ref, key);
 *  */
    @Test(expected = NullPointerException.class)
    public void testWrapAndThrow_ThrowNullPointerException_11() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        InvocationTargetException invocationTargetException = ((InvocationTargetException) createInstance("java.lang.reflect.InvocationTargetException"));
        
        mapDeserializer.wrapAndThrow(invocationTargetException, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method wrapAndThrow(java.lang.Throwable, java.lang.Object, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#wrapAndThrow(java.lang.Throwable,java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (t instanceof Error): False}
 * @utbot.executesCondition {@code (t instanceof IOException): True}
 * @utbot.executesCondition {@code (!(t instanceof JsonMappingException)): True}
 * @utbot.throwsException {@link java.io.IOException} when: t instanceof IOException && !(t instanceof JsonMappingException)
 *  */
    @Test(expected = IOException.class)
    public void testWrapAndThrow_ThrowIOException1() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        IOException iOException = ((IOException) createInstance("java.io.IOException"));
        
        mapDeserializer.wrapAndThrow(iOException, null, null);
    }
    ///endregion
    
    ///region Errors report for wrapAndThrow
    
    public void testWrapAndThrow_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.MapDeserializer.getValueType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValueType()
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#getValueType()}
 * @utbot.returnsFrom {@code return _mapType;}
 *  */
    @Test
    public void testGetValueType_Return_mapType() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        
        JavaType actual = mapDeserializer.getValueType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _readAndBind(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.util.Map)
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBind(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): True}
 * @utbot.executesCondition {@code (useObjectId): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#nextToken()}
 *  */
    @Test
    public void test_readAndBind_TEqualsJsonTokenSTART_OBJECT() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        FailingDeserializer _valueDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueDeserializer", _valueDeserializer);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nextToken", _nextToken);
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _nextToken);
        
        mapDeserializer._readAndBind(treeTraversingParser, null, null);
        
        JsonToken finalTreeTraversingParser_nextToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nextToken"));
        
        assertNull(finalTreeTraversingParser_nextToken);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBind(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (useObjectId): False}
 *  */
    @Test
    public void test_readAndBind_NotUseObjectId() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        StdKeyDeserializer.StringKD _keyDeserializer = ((StdKeyDeserializer.StringKD) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringKD"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_keyDeserializer", _keyDeserializer);
        AbstractDeserializer _valueDeserializer = ((AbstractDeserializer) createInstance("com.fasterxml.jackson.databind.deser.AbstractDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueDeserializer", _valueDeserializer);
        AsArrayTypeDeserializer _valueTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueTypeDeserializer", _valueTypeDeserializer);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8StreamJsonParser);
        
        mapDeserializer._readAndBind(jsonParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBind(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (useObjectId): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getContentType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 *  */
    @Test
    public void test_readAndBind_UseObjectId() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        CollectionLikeType _mapType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionType _elementType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(_mapType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_mapType", _mapType);
        StdKeyDeserializer.StringKD _keyDeserializer = ((StdKeyDeserializer.StringKD) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringKD"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_keyDeserializer", _keyDeserializer);
        AbstractDeserializer _valueDeserializer = ((AbstractDeserializer) createInstance("com.fasterxml.jackson.databind.deser.AbstractDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_objectIdReader", _objectIdReader);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueTypeDeserializer", _valueTypeDeserializer);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.END_OBJECT;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8StreamJsonParser);
        
        mapDeserializer._readAndBind(jsonParserDelegate, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _readAndBind(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.util.Map)
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBind(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: t = jp.nextToken();
 *  */
    @Test
    public void test_readAndBind_ThrowClassCastException() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$Object");
        Object _current = createInstance("java.util.KeyValueHolder");
        int[] value = {};
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$Object", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind] produces [java.lang.ClassCastException: class [I cannot be cast to class com.fasterxml.jackson.databind.JsonNode ([I is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.JsonNode is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3a36e3bf)]
            com.fasterxml.jackson.databind.node.NodeCursor$Object.nextToken(NodeCursor.java:208)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.nextToken(TreeTraversingParser.java:149)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind(MapDeserializer.java:390) */
        mapDeserializer._readAndBind(treeTraversingParser, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBind(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: t = jp.nextToken();
 *  */
    @Test
    public void test_readAndBind_ThrowClassCastException_1() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$Object");
        Object _current = createInstance("java.util.KeyValueHolder");
        MissingNode value = ((MissingNode) createInstance("com.fasterxml.jackson.databind.node.MissingNode"));
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$Object", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_startContainer", true);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind] produces [java.lang.ClassCastException: class com.fasterxml.jackson.databind.node.MissingNode cannot be cast to class com.fasterxml.jackson.databind.node.ContainerNode (com.fasterxml.jackson.databind.node.MissingNode and com.fasterxml.jackson.databind.node.ContainerNode are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3a36e3bf)]
            com.fasterxml.jackson.databind.node.NodeCursor$Object.currentHasChildren(NodeCursor.java:231)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.nextToken(TreeTraversingParser.java:131)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind(MapDeserializer.java:390) */
        mapDeserializer._readAndBind(treeTraversingParser, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBind(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void test_readAndBind_ThrowClassCastException_2() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$Object");
        Object _current = createInstance("java.util.KeyValueHolder");
        int[] value = {};
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$Object", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_startContainer", true);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind] produces [java.lang.ClassCastException: class [I cannot be cast to class com.fasterxml.jackson.databind.JsonNode ([I is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.JsonNode is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3a36e3bf)]
            com.fasterxml.jackson.databind.node.NodeCursor$Object.currentNode(NodeCursor.java:226)
            com.fasterxml.jackson.databind.node.NodeCursor$Object.currentHasChildren(NodeCursor.java:231)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.nextToken(TreeTraversingParser.java:131)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind(MapDeserializer.java:390) */
        mapDeserializer._readAndBind(treeTraversingParser, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBind(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = jp.getCurrentToken();
 *  */
    @Test
    public void test_readAndBind_ThrowNullPointerException() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind(MapDeserializer.java:388) */
        mapDeserializer._readAndBind(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBind(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean useObjectId = valueDes.getObjectIdReader() != null;
 *  */
    @Test
    public void test_readAndBind_ThrowNullPointerException_6() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        StdKeyDeserializer _keyDeserializer = ((StdKeyDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_keyDeserializer", _keyDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueTypeDeserializer", _valueTypeDeserializer);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.END_ARRAY;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind(MapDeserializer.java:397) */
        mapDeserializer._readAndBind(uTF8StreamJsonParser, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBind(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean useObjectId = valueDes.getObjectIdReader() != null;
 *  */
    @Test
    public void test_readAndBind_ThrowNullPointerException_1() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        StdKeyDeserializer _keyDeserializer = ((StdKeyDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_keyDeserializer", _keyDeserializer);
        AsArrayTypeDeserializer _valueTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueTypeDeserializer", _valueTypeDeserializer);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(treeTraversingParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind(MapDeserializer.java:397) */
        mapDeserializer._readAndBind(jsonParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBind(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean useObjectId = valueDes.getObjectIdReader() != null;
 *  */
    @Test
    public void test_readAndBind_ThrowNullPointerException_7() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        StdKeyDeserializer _keyDeserializer = ((StdKeyDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_keyDeserializer", _keyDeserializer);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _nextToken = JsonToken.END_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind(MapDeserializer.java:397) */
        mapDeserializer._readAndBind(treeTraversingParser, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBind(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean useObjectId = valueDes.getObjectIdReader() != null;
 *  */
    @Test
    public void test_readAndBind_ThrowNullPointerException_13() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        StdKeyDeserializer.DelegatingKD _keyDeserializer = ((StdKeyDeserializer.DelegatingKD) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$DelegatingKD"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_keyDeserializer", _keyDeserializer);
        AsExternalTypeDeserializer _valueTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueTypeDeserializer", _valueTypeDeserializer);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootValue");
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_startContainer", true);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind(MapDeserializer.java:397) */
        mapDeserializer._readAndBind(treeTraversingParser, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBind(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (useObjectId): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: referringAccumulator = new MapReferringAccumulator(_mapType.getContentType().getRawClass(), result);
 *  */
    @Test
    public void test_readAndBind_ThrowNullPointerException_2() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        StdKeyDeserializer.StringKD _keyDeserializer = ((StdKeyDeserializer.StringKD) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringKD"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_keyDeserializer", _keyDeserializer);
        AbstractDeserializer _valueDeserializer = ((AbstractDeserializer) createInstance("com.fasterxml.jackson.databind.deser.AbstractDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_objectIdReader", _objectIdReader);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueTypeDeserializer", _valueTypeDeserializer);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8StreamJsonParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind(MapDeserializer.java:399) */
        mapDeserializer._readAndBind(jsonParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBind(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean useObjectId = valueDes.getObjectIdReader() != null;
 *  */
    @Test
    public void test_readAndBind_ThrowNullPointerException_10() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        StdKeyDeserializer _keyDeserializer = ((StdKeyDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_keyDeserializer", _keyDeserializer);
        AsArrayTypeDeserializer _valueTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueTypeDeserializer", _valueTypeDeserializer);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind(MapDeserializer.java:397) */
        mapDeserializer._readAndBind(treeTraversingParser, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBind(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean useObjectId = valueDes.getObjectIdReader() != null;
 *  */
    @Test
    public void test_readAndBind_ThrowNullPointerException_14() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        StdKeyDeserializer.DelegatingKD _keyDeserializer = ((StdKeyDeserializer.DelegatingKD) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$DelegatingKD"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_keyDeserializer", _keyDeserializer);
        AsArrayTypeDeserializer _valueTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueTypeDeserializer", _valueTypeDeserializer);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.END_ARRAY;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8StreamJsonParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind(MapDeserializer.java:397) */
        mapDeserializer._readAndBind(jsonParserDelegate1, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBind(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (useObjectId): False}
 * @utbot.iterates iterate the loop {@code for(; t == JsonToken.FIELD_NAME; t = jp.nextToken())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object key = keyDes.deserializeKey(fieldName, ctxt);
 *  */
    @Test
    public void test_readAndBind_ThrowNullPointerException_5() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        AbstractDeserializer _valueDeserializer = ((AbstractDeserializer) createInstance("com.fasterxml.jackson.databind.deser.AbstractDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueTypeDeserializer", _valueTypeDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        TreeTraversingParser delegate = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind(MapDeserializer.java:404) */
        mapDeserializer._readAndBind(jsonParserSequence, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBind(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): True}
 * @utbot.executesCondition {@code (useObjectId): False}
 * @utbot.iterates iterate the loop {@code for(; t == JsonToken.FIELD_NAME; t = jp.nextToken())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object key = keyDes.deserializeKey(fieldName, ctxt);
 *  */
    @Test
    public void test_readAndBind_ThrowNullPointerException_8() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        AbstractDeserializer _valueDeserializer = ((AbstractDeserializer) createInstance("com.fasterxml.jackson.databind.deser.AbstractDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueTypeDeserializer", _valueTypeDeserializer);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _nextToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind(MapDeserializer.java:404) */
        mapDeserializer._readAndBind(treeTraversingParser, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBind(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean useObjectId = valueDes.getObjectIdReader() != null;
 *  */
    @Test
    public void test_readAndBind_ThrowNullPointerException_11() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        StdKeyDeserializer _keyDeserializer = ((StdKeyDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_keyDeserializer", _keyDeserializer);
        AsArrayTypeDeserializer _valueTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueTypeDeserializer", _valueTypeDeserializer);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$Object");
        Object _current = createInstance("java.util.KeyValueHolder");
        BooleanNode value = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(value, "com.fasterxml.jackson.databind.node.BooleanNode", "_value", true);
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$Object", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind(MapDeserializer.java:397) */
        mapDeserializer._readAndBind(treeTraversingParser, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBind(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean useObjectId = valueDes.getObjectIdReader() != null;
 *  */
    @Test
    public void test_readAndBind_ThrowNullPointerException_12() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        StdKeyDeserializer.DelegatingKD _keyDeserializer = ((StdKeyDeserializer.DelegatingKD) createInstance("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$DelegatingKD"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_keyDeserializer", _keyDeserializer);
        AsArrayTypeDeserializer _valueTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueTypeDeserializer", _valueTypeDeserializer);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$Object");
        Object _current = createInstance("java.util.KeyValueHolder");
        BooleanNode value = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$Object", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind(MapDeserializer.java:397) */
        mapDeserializer._readAndBind(treeTraversingParser, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBind(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): True}
 * @utbot.executesCondition {@code (useObjectId): False}
 * @utbot.iterates iterate the loop {@code for(; t == JsonToken.FIELD_NAME; t = jp.nextToken())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object key = keyDes.deserializeKey(fieldName, ctxt);
 *  */
    @Test
    public void test_readAndBind_ThrowNullPointerException_9() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        AbstractDeserializer _valueDeserializer = ((AbstractDeserializer) createInstance("com.fasterxml.jackson.databind.deser.AbstractDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueTypeDeserializer", _valueTypeDeserializer);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$Array");
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _nextToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind(MapDeserializer.java:404) */
        mapDeserializer._readAndBind(treeTraversingParser, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBind(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (useObjectId): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: referringAccumulator = new MapReferringAccumulator(_mapType.getContentType().getRawClass(), result);
 *  */
    @Test
    public void test_readAndBind_ThrowNullPointerException_3() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        CollectionLikeType _mapType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_mapType", _mapType);
        AbstractDeserializer _valueDeserializer = ((AbstractDeserializer) createInstance("com.fasterxml.jackson.databind.deser.AbstractDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_objectIdReader", _objectIdReader);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueDeserializer", _valueDeserializer);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8StreamJsonParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind(MapDeserializer.java:399) */
        mapDeserializer._readAndBind(jsonParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBind(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (useObjectId): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: referringAccumulator = new MapReferringAccumulator(_mapType.getContentType().getRawClass(), result);
 *  */
    @Test
    public void test_readAndBind_ThrowNullPointerException_4() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        MapLikeType _mapType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_mapType", _mapType);
        AbstractDeserializer _valueDeserializer = ((AbstractDeserializer) createInstance("com.fasterxml.jackson.databind.deser.AbstractDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_objectIdReader", _objectIdReader);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueDeserializer", _valueDeserializer);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8StreamJsonParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBind(MapDeserializer.java:399) */
        mapDeserializer._readAndBind(jsonParserDelegate, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.MapDeserializer.getMapClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMapClass()
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#getMapClass()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testGetMapClass_JavaTypeGetRawClass() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        CollectionType _mapType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        Class _class = Object.class;
        setField(_mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_mapType", _mapType);
        
        JavaType javaType = mapDeserializer._mapType;
        Class initialMapDeserializer_mapType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        Class actual = mapDeserializer.getMapClass();
        
        assertEquals(Class.class, actual.getClass());
        
        JavaType javaType1 = mapDeserializer._mapType;
        Class finalMapDeserializer_mapType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapDeserializer_mapType_class == finalMapDeserializer_mapType_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getMapClass()
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#getMapClass()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public 
 *  */
    @Test
    public void testGetMapClass_ThrowNullPointerException() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.getMapClass] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.getMapClass(MapDeserializer.java:374) */
        mapDeserializer.getMapClass();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.MapDeserializer.setIgnorableProperties
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setIgnorableProperties([Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#setIgnorableProperties(java.lang.String[])}
 * @utbot.executesCondition {@code ((ignorable == null || ignorable.length == 0)): True}
 * @utbot.executesCondition {@code ((ignorable == null || ignorable.length == 0)): True}
 *  */
    @Test
    public void testSetIgnorableProperties_IgnorableEqualsNullOrIgnorableLengthEqualsZero_1() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        java.lang.String[] stringArray = {};
        
        mapDeserializer.setIgnorableProperties(stringArray);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#setIgnorableProperties(java.lang.String[])}
 * @utbot.executesCondition {@code ((ignorable == null || ignorable.length == 0)): True}
 * @utbot.executesCondition {@code ((ignorable == null || ignorable.length == 0)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ArrayBuilders#arrayToSet(java.lang.Object[])}
 *  */
    @Test
    public void testSetIgnorableProperties_IgnorableNotEqualsNullOrIgnorableLengthNotEqualsZero() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        java.lang.String[] stringArray = {null};
        
        mapDeserializer.setIgnorableProperties(stringArray);
        
        String finalStringArray0 = stringArray[0];
        
        assertNull(finalStringArray0);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#setIgnorableProperties(java.lang.String[])}
 * @utbot.executesCondition {@code ((ignorable == null || ignorable.length == 0)): False}
 *  */
    @Test
    public void testSetIgnorableProperties_IgnorableEqualsNullOrIgnorableLengthEqualsZero() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        
        mapDeserializer.setIgnorableProperties(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBindStringMap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _readAndBindStringMap(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.util.Map)
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBindStringMap(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 *  */
    @Test
    public void test_readAndBindStringMap_1() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        FailingDeserializer _valueDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.END_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        mapDeserializer._readAndBindStringMap(jsonParserSequence, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBindStringMap(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 *  */
    @Test
    public void test_readAndBindStringMap() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        AbstractDeserializer _valueDeserializer = ((AbstractDeserializer) createInstance("com.fasterxml.jackson.databind.deser.AbstractDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueDeserializer", _valueDeserializer);
        AsArrayTypeDeserializer _valueTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueTypeDeserializer", _valueTypeDeserializer);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.END_OBJECT;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8StreamJsonParser);
        
        mapDeserializer._readAndBindStringMap(jsonParserDelegate, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _readAndBindStringMap(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.util.Map)
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBindStringMap(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: t = jp.nextToken();
 *  */
    @Test
    public void test_readAndBindStringMap_ThrowClassCastException() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$Object");
        Object _current = createInstance("java.util.KeyValueHolder");
        int[] value = {};
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$Object", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBindStringMap] produces [java.lang.ClassCastException: class [I cannot be cast to class com.fasterxml.jackson.databind.JsonNode ([I is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.JsonNode is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3a36e3bf)]
            com.fasterxml.jackson.databind.node.NodeCursor$Object.nextToken(NodeCursor.java:208)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.nextToken(TreeTraversingParser.java:149)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBindStringMap(MapDeserializer.java:449) */
        mapDeserializer._readAndBindStringMap(treeTraversingParser, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBindStringMap(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void test_readAndBindStringMap_ThrowClassCastException_1() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$Object");
        Object _current = createInstance("java.text.AttributeEntry");
        short[] value = {};
        setField(_current, "java.text.AttributeEntry", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$Object", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_startContainer", true);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBindStringMap] produces [java.lang.ClassCastException: class [S cannot be cast to class com.fasterxml.jackson.databind.JsonNode ([S is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.JsonNode is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3a36e3bf)]
            com.fasterxml.jackson.databind.node.NodeCursor$Object.currentNode(NodeCursor.java:226)
            com.fasterxml.jackson.databind.node.NodeCursor$Object.currentHasChildren(NodeCursor.java:231)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.nextToken(TreeTraversingParser.java:131)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBindStringMap(MapDeserializer.java:449) */
        mapDeserializer._readAndBindStringMap(treeTraversingParser, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBindStringMap(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: t = jp.nextToken();
 *  */
    @Test
    public void test_readAndBindStringMap_ThrowClassCastException_2() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$Object");
        Object _current = createInstance("java.util.KeyValueHolder");
        ShortNode value = ((ShortNode) createInstance("com.fasterxml.jackson.databind.node.ShortNode"));
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$Object", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_startContainer", true);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBindStringMap] produces [java.lang.ClassCastException: class com.fasterxml.jackson.databind.node.ShortNode cannot be cast to class com.fasterxml.jackson.databind.node.ContainerNode (com.fasterxml.jackson.databind.node.ShortNode and com.fasterxml.jackson.databind.node.ContainerNode are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3a36e3bf)]
            com.fasterxml.jackson.databind.node.NodeCursor$Object.currentHasChildren(NodeCursor.java:231)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.nextToken(TreeTraversingParser.java:131)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBindStringMap(MapDeserializer.java:449) */
        mapDeserializer._readAndBindStringMap(treeTraversingParser, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBindStringMap(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = jp.getCurrentToken();
 *  */
    @Test
    public void test_readAndBindStringMap_ThrowNullPointerException() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBindStringMap] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBindStringMap(MapDeserializer.java:447) */
        mapDeserializer._readAndBindStringMap(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBindStringMap(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean useObjectId = valueDes.getObjectIdReader() != null;
 *  */
    @Test
    public void test_readAndBindStringMap_ThrowNullPointerException_5() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        AsWrapperTypeDeserializer _valueTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueTypeDeserializer", _valueTypeDeserializer);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.END_ARRAY;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBindStringMap] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBindStringMap(MapDeserializer.java:454) */
        mapDeserializer._readAndBindStringMap(uTF8StreamJsonParser, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBindStringMap(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean useObjectId = valueDes.getObjectIdReader() != null;
 *  */
    @Test
    public void test_readAndBindStringMap_ThrowNullPointerException_11() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        AsExternalTypeDeserializer _valueTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueTypeDeserializer", _valueTypeDeserializer);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _nextToken = JsonToken.VALUE_NULL;
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBindStringMap] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBindStringMap(MapDeserializer.java:454) */
        mapDeserializer._readAndBindStringMap(treeTraversingParser, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBindStringMap(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean useObjectId = valueDes.getObjectIdReader() != null;
 *  */
    @Test
    public void test_readAndBindStringMap_ThrowNullPointerException_1() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        AsWrapperTypeDeserializer _valueTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueTypeDeserializer", _valueTypeDeserializer);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(readerBasedJsonParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBindStringMap] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBindStringMap(MapDeserializer.java:454) */
        mapDeserializer._readAndBindStringMap(jsonParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBindStringMap(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean useObjectId = valueDes.getObjectIdReader() != null;
 *  */
    @Test
    public void test_readAndBindStringMap_ThrowNullPointerException_10() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueTypeDeserializer", _valueTypeDeserializer);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootValue");
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_startContainer", true);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBindStringMap] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBindStringMap(MapDeserializer.java:454) */
        mapDeserializer._readAndBindStringMap(treeTraversingParser, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBindStringMap(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (useObjectId): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: referringAccumulator = new MapReferringAccumulator(_mapType.getContentType().getRawClass(), result);
 *  */
    @Test
    public void test_readAndBindStringMap_ThrowNullPointerException_2() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        AbstractDeserializer _valueDeserializer = ((AbstractDeserializer) createInstance("com.fasterxml.jackson.databind.deser.AbstractDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_objectIdReader", _objectIdReader);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueDeserializer", _valueDeserializer);
        AsPropertyTypeDeserializer _valueTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueTypeDeserializer", _valueTypeDeserializer);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonToken _currToken = JsonToken.END_OBJECT;
        setField(uTF8StreamJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8StreamJsonParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBindStringMap] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBindStringMap(MapDeserializer.java:456) */
        mapDeserializer._readAndBindStringMap(jsonParserDelegate, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBindStringMap(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean useObjectId = valueDes.getObjectIdReader() != null;
 *  */
    @Test
    public void test_readAndBindStringMap_ThrowNullPointerException_6() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        AsArrayTypeDeserializer _valueTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueTypeDeserializer", _valueTypeDeserializer);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBindStringMap] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBindStringMap(MapDeserializer.java:454) */
        mapDeserializer._readAndBindStringMap(treeTraversingParser, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBindStringMap(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean useObjectId = valueDes.getObjectIdReader() != null;
 *  */
    @Test
    public void test_readAndBindStringMap_ThrowNullPointerException_7() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        AsExternalTypeDeserializer _valueTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueTypeDeserializer", _valueTypeDeserializer);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$Object");
        Object _current = createInstance("java.util.KeyValueHolder");
        BooleanNode value = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(value, "com.fasterxml.jackson.databind.node.BooleanNode", "_value", true);
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$Object", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBindStringMap] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBindStringMap(MapDeserializer.java:454) */
        mapDeserializer._readAndBindStringMap(treeTraversingParser, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBindStringMap(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean useObjectId = valueDes.getObjectIdReader() != null;
 *  */
    @Test
    public void test_readAndBindStringMap_ThrowNullPointerException_8() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        AsExternalTypeDeserializer _valueTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueTypeDeserializer", _valueTypeDeserializer);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$Object");
        Object _current = createInstance("java.util.KeyValueHolder");
        BooleanNode value = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$Object", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBindStringMap] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBindStringMap(MapDeserializer.java:454) */
        mapDeserializer._readAndBindStringMap(treeTraversingParser, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBindStringMap(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean useObjectId = valueDes.getObjectIdReader() != null;
 *  */
    @Test
    public void test_readAndBindStringMap_ThrowNullPointerException_9() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        AsExternalTypeDeserializer _valueTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueTypeDeserializer", _valueTypeDeserializer);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$Object");
        Object _current = createInstance("java.util.KeyValueHolder");
        NullNode value = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$Object", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBindStringMap] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBindStringMap(MapDeserializer.java:454) */
        mapDeserializer._readAndBindStringMap(treeTraversingParser, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBindStringMap(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (useObjectId): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: referringAccumulator = new MapReferringAccumulator(_mapType.getContentType().getRawClass(), result);
 *  */
    @Test
    public void test_readAndBindStringMap_ThrowNullPointerException_3() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        CollectionLikeType _mapType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_mapType", _mapType);
        AbstractDeserializer _valueDeserializer = ((AbstractDeserializer) createInstance("com.fasterxml.jackson.databind.deser.AbstractDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_objectIdReader", _objectIdReader);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueDeserializer", _valueDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        UTF8StreamJsonParser delegate = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBindStringMap] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBindStringMap(MapDeserializer.java:456) */
        mapDeserializer._readAndBindStringMap(jsonParserSequence, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_readAndBindStringMap(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.util.Map)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (useObjectId): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: referringAccumulator = new MapReferringAccumulator(_mapType.getContentType().getRawClass(), result);
 *  */
    @Test
    public void test_readAndBindStringMap_ThrowNullPointerException_4() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        MapLikeType _mapType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_mapType", _mapType);
        AbstractDeserializer _valueDeserializer = ((AbstractDeserializer) createInstance("com.fasterxml.jackson.databind.deser.AbstractDeserializer"));
        ObjectIdReader _objectIdReader = ((ObjectIdReader) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(_valueDeserializer, "com.fasterxml.jackson.databind.deser.AbstractDeserializer", "_objectIdReader", _objectIdReader);
        setField(mapDeserializer, "com.fasterxml.jackson.databind.deser.std.MapDeserializer", "_valueDeserializer", _valueDeserializer);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8StreamJsonParser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBindStringMap] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._readAndBindStringMap(MapDeserializer.java:456) */
        mapDeserializer._readAndBindStringMap(jsonParserDelegate, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.MapDeserializer.getContentDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getContentDeserializer()
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#getContentDeserializer()}
 * @utbot.returnsFrom {@code return _valueDeserializer;}
 *  */
    @Test
    public void testGetContentDeserializer_Return_valueDeserializer() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        
        JsonDeserializer actual = mapDeserializer.getContentDeserializer();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserializeWithType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserializeWithType(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.jsontype.TypeDeserializer)
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testDeserializeWithType_ThrowClassCastException() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        byte[] key = {};
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        Class jsonParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Constructor jsonParserDelegateConstructor = jsonParserDelegateClazz.getDeclaredConstructor(parserType);
        jsonParserDelegateConstructor.setAccessible(true);
        java.lang.Object[] jsonParserDelegateConstructorArguments = new java.lang.Object[1];
        jsonParserDelegateConstructorArguments[0] = parser;
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) jsonParserDelegateConstructor.newInstance(jsonParserDelegateConstructorArguments));
        AsExternalTypeDeserializer asExternalTypeDeserializer = new AsExternalTypeDeserializer(null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserializeWithType] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Integer] */
        mapDeserializer.deserializeWithType(jsonParserDelegate, null, asExternalTypeDeserializer);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testDeserializeWithType_ThrowClassCastException_1() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 1;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        Object left = createInstance("java.util.TreeMap$Entry");
        byte[] key1 = {};
        setField(left, "java.util.TreeMap$Entry", "key", key1);
        setField(root, "java.util.TreeMap$Entry", "left", left);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        Class jsonParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Constructor jsonParserDelegateConstructor = jsonParserDelegateClazz.getDeclaredConstructor(parserType);
        jsonParserDelegateConstructor.setAccessible(true);
        java.lang.Object[] jsonParserDelegateConstructorArguments = new java.lang.Object[1];
        jsonParserDelegateConstructorArguments[0] = parser;
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) jsonParserDelegateConstructor.newInstance(jsonParserDelegateConstructorArguments));
        AsExternalTypeDeserializer asExternalTypeDeserializer = new AsExternalTypeDeserializer(null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserializeWithType] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Integer] */
        mapDeserializer.deserializeWithType(jsonParserDelegate, null, asExternalTypeDeserializer);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return typeDeserializer.deserializeTypedFromObject(jp, ctxt);
 *  */
    @Test
    public void testDeserializeWithType_ThrowNullPointerException_2() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:82)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromObject(AsWrapperTypeDeserializer.java:49)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserializeWithType(MapDeserializer.java:364) */
        mapDeserializer.deserializeWithType(null, null, asWrapperTypeDeserializer);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return typeDeserializer.deserializeTypedFromObject(jp, ctxt);
 *  */
    @Test
    public void testDeserializeWithType_ThrowNullPointerException() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserializeWithType(MapDeserializer.java:364) */
        mapDeserializer.deserializeWithType(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#deserializeWithType(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return typeDeserializer.deserializeTypedFromObject(jp, ctxt);
 *  */
    @Test
    public void testDeserializeWithType_ThrowNullPointerException_1() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        AsExternalTypeDeserializer asExternalTypeDeserializer = new AsExternalTypeDeserializer(null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserializeWithType] produces [java.lang.NullPointerException] */
        mapDeserializer.deserializeWithType(null, null, asExternalTypeDeserializer);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserializeWithType(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.jsontype.TypeDeserializer)
    
    @Test
    public void testDeserializeWithType1() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        Object delegate1 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(delegate1, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Object key = createInstance("java.lang.Object");
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate1, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserializeWithType] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Integer (java.lang.Object and java.lang.Integer are in module java.base of loader 'bootstrap')]
            java.base/java.lang.Integer.compareTo(Integer.java:71)
            java.base/java.util.TreeMap.getEntry(TreeMap.java:350)
            java.base/java.util.TreeMap.get(TreeMap.java:279)
            com.fasterxml.jackson.databind.util.TokenBuffer$Segment.findTypeId(TokenBuffer.java:1787)
            com.fasterxml.jackson.databind.util.TokenBuffer$Parser.getTypeId(TokenBuffer.java:1511)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTypeId(JsonParserDelegate.java:202)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getTypeId(JsonParserDelegate.java:202)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:83)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromObject(AsWrapperTypeDeserializer.java:49)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserializeWithType(MapDeserializer.java:364) */
        mapDeserializer.deserializeWithType(jsonParserSequence, null, asWrapperTypeDeserializer);
    }
    
    @Test
    public void testDeserializeWithType2() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName(TypeDeserializerBase.java:114)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:92)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromObject(AsWrapperTypeDeserializer.java:49)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserializeWithType(MapDeserializer.java:364) */
        Class mapDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class asWrapperTypeDeserializerType = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        Method deserializeWithTypeMethod = mapDeserializerClazz.getDeclaredMethod("deserializeWithType", parserType, deserializationContextType, asWrapperTypeDeserializerType);
        deserializeWithTypeMethod.setAccessible(true);
        java.lang.Object[] deserializeWithTypeMethodArguments = new java.lang.Object[3];
        deserializeWithTypeMethodArguments[0] = parser;
        deserializeWithTypeMethodArguments[1] = ((Object) null);
        deserializeWithTypeMethodArguments[2] = asWrapperTypeDeserializer;
        try {
            deserializeWithTypeMethod.invoke(mapDeserializer, deserializeWithTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDeserializeWithType3() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(parser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        MapType _defaultImpl = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer._locateTypeId(AsArrayTypeDeserializer.java:132)
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer._deserialize(AsArrayTypeDeserializer.java:93)
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer.deserializeTypedFromObject(AsArrayTypeDeserializer.java:58)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserializeWithType(MapDeserializer.java:364) */
        Class mapDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class asArrayTypeDeserializerType = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        Method deserializeWithTypeMethod = mapDeserializerClazz.getDeclaredMethod("deserializeWithType", parserType, implType, asArrayTypeDeserializerType);
        deserializeWithTypeMethod.setAccessible(true);
        java.lang.Object[] deserializeWithTypeMethodArguments = new java.lang.Object[3];
        deserializeWithTypeMethodArguments[0] = parser;
        deserializeWithTypeMethodArguments[1] = impl;
        deserializeWithTypeMethodArguments[2] = asArrayTypeDeserializer;
        try {
            deserializeWithTypeMethod.invoke(mapDeserializer, deserializeWithTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDeserializeWithType4() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName(TypeDeserializerBase.java:114)
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer._locateTypeId(AsArrayTypeDeserializer.java:122)
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer._deserialize(AsArrayTypeDeserializer.java:93)
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer.deserializeTypedFromObject(AsArrayTypeDeserializer.java:58)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserializeWithType(MapDeserializer.java:364) */
        Class mapDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class asArrayTypeDeserializerType = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        Method deserializeWithTypeMethod = mapDeserializerClazz.getDeclaredMethod("deserializeWithType", parserType, implType, asArrayTypeDeserializerType);
        deserializeWithTypeMethod.setAccessible(true);
        java.lang.Object[] deserializeWithTypeMethodArguments = new java.lang.Object[3];
        deserializeWithTypeMethodArguments[0] = parser;
        deserializeWithTypeMethodArguments[1] = impl;
        deserializeWithTypeMethodArguments[2] = asArrayTypeDeserializer;
        try {
            deserializeWithTypeMethod.invoke(mapDeserializer, deserializeWithTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDeserializeWithType5() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(parser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        Class jsonParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Constructor jsonParserDelegateConstructor = jsonParserDelegateClazz.getDeclaredConstructor(parserType);
        jsonParserDelegateConstructor.setAccessible(true);
        java.lang.Object[] jsonParserDelegateConstructorArguments = new java.lang.Object[1];
        jsonParserDelegateConstructorArguments[0] = parser;
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) jsonParserDelegateConstructor.newInstance(jsonParserDelegateConstructorArguments));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        ClassNameIdResolver _idResolver = ((ClassNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        MapLikeType _baseType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase", "_baseType", _baseType);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:149)
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer._deserialize(AsArrayTypeDeserializer.java:94)
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer.deserializeTypedFromObject(AsArrayTypeDeserializer.java:58)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserializeWithType(MapDeserializer.java:364) */
        mapDeserializer.deserializeWithType(jsonParserDelegate, impl, asArrayTypeDeserializer);
    }
    
    @Test
    public void testDeserializeWithType6() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(delegate, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        ClassNameIdResolver _idResolver = ((ClassNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        MapLikeType _baseType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase", "_baseType", _baseType);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserSequence.switchToNext(JsonParserSequence.java:139)
            com.fasterxml.jackson.core.util.JsonParserSequence.nextToken(JsonParserSequence.java:101)
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer._locateTypeId(AsArrayTypeDeserializer.java:125)
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer._deserialize(AsArrayTypeDeserializer.java:93)
            com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer.deserializeTypedFromObject(AsArrayTypeDeserializer.java:58)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserializeWithType(MapDeserializer.java:364) */
        mapDeserializer.deserializeWithType(jsonParserSequence, null, asArrayTypeDeserializer);
    }
    
    @Test
    public void testDeserializeWithType7() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("java.util.Collections$ReverseComparator");
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        Class jsonParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Constructor jsonParserDelegateConstructor = jsonParserDelegateClazz.getDeclaredConstructor(parserType);
        jsonParserDelegateConstructor.setAccessible(true);
        java.lang.Object[] jsonParserDelegateConstructorArguments = new java.lang.Object[1];
        jsonParserDelegateConstructorArguments[0] = parser;
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) jsonParserDelegateConstructor.newInstance(jsonParserDelegateConstructorArguments));
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName(TypeDeserializerBase.java:114)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:92)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromObject(AsWrapperTypeDeserializer.java:49)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserializeWithType(MapDeserializer.java:364) */
        mapDeserializer.deserializeWithType(jsonParserDelegate, null, asWrapperTypeDeserializer);
    }
    
    @Test
    public void testDeserializeWithType8() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("java.util.Collections$ReverseComparator");
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        Class jsonParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Constructor jsonParserDelegateConstructor = jsonParserDelegateClazz.getDeclaredConstructor(parserType);
        jsonParserDelegateConstructor.setAccessible(true);
        java.lang.Object[] jsonParserDelegateConstructorArguments = new java.lang.Object[1];
        jsonParserDelegateConstructorArguments[0] = parser;
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) jsonParserDelegateConstructor.newInstance(jsonParserDelegateConstructorArguments));
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserializeWithType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName(TypeDeserializerBase.java:114)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer._deserialize(AsWrapperTypeDeserializer.java:92)
            com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer.deserializeTypedFromObject(AsWrapperTypeDeserializer.java:49)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.deserializeWithType(MapDeserializer.java:364) */
        mapDeserializer.deserializeWithType(jsonParserDelegate1, null, asWrapperTypeDeserializer);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deserializeWithType(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.jsontype.TypeDeserializer)
    
    @Test(expected = NullPointerException.class)
    public void testDeserializeWithType9() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Class jsonParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Constructor jsonParserDelegateConstructor = jsonParserDelegateClazz.getDeclaredConstructor(parserType);
        jsonParserDelegateConstructor.setAccessible(true);
        java.lang.Object[] jsonParserDelegateConstructorArguments = new java.lang.Object[1];
        jsonParserDelegateConstructorArguments[0] = parser;
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) jsonParserDelegateConstructor.newInstance(jsonParserDelegateConstructorArguments));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        TypeNameIdResolver _idResolver = ((TypeNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        MapLikeType _baseType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase", "_baseType", _baseType);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _baseType);
        HashMap _deserializers = new HashMap();
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        
        mapDeserializer.deserializeWithType(jsonParserDelegate, impl, asExternalTypeDeserializer);
    }
    
    @Test(expected = NullPointerException.class)
    public void testDeserializeWithType10() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 0;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        Integer value = Integer.MIN_VALUE;
        setField(root, "java.util.TreeMap$Entry", "value", value);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        Class jsonParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Constructor jsonParserDelegateConstructor = jsonParserDelegateClazz.getDeclaredConstructor(parserType);
        jsonParserDelegateConstructor.setAccessible(true);
        java.lang.Object[] jsonParserDelegateConstructorArguments = new java.lang.Object[1];
        jsonParserDelegateConstructorArguments[0] = parser;
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) jsonParserDelegateConstructor.newInstance(jsonParserDelegateConstructorArguments));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        HashMap _deserializers = new HashMap();
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        
        mapDeserializer.deserializeWithType(jsonParserDelegate, impl, asArrayTypeDeserializer);
    }
    
    @Test(expected = NullPointerException.class)
    public void testDeserializeWithType11() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_hasNativeTypeIds", true);
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 0;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        String value = "";
        setField(root, "java.util.TreeMap$Entry", "value", value);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        Class jsonParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Constructor jsonParserDelegateConstructor = jsonParserDelegateClazz.getDeclaredConstructor(parserType);
        jsonParserDelegateConstructor.setAccessible(true);
        java.lang.Object[] jsonParserDelegateConstructorArguments = new java.lang.Object[1];
        jsonParserDelegateConstructorArguments[0] = parser;
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) jsonParserDelegateConstructor.newInstance(jsonParserDelegateConstructorArguments));
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        HashMap _deserializers = new HashMap();
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        
        mapDeserializer.deserializeWithType(jsonParserDelegate, null, asExternalTypeDeserializer);
    }
    ///endregion
    
    ///region Errors report for deserializeWithType
    
    public void testDeserializeWithType_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 7 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.MapDeserializer.handleUnresolvedReference
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleUnresolvedReference(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.deser.std.MapDeserializer$MapReferringAccumulator, java.lang.Object, com.fasterxml.jackson.databind.deser.UnresolvedForwardReference)
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#handleUnresolvedReference(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.deser.std.MapDeserializer.MapReferringAccumulator,java.lang.Object,com.fasterxml.jackson.databind.deser.UnresolvedForwardReference)}
 *  */
    @Test
    public void testHandleUnresolvedReference() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object mapReferringAccumulator = createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer$MapReferringAccumulator");
        ArrayList _accumulator = new ArrayList();
        _accumulator.add(null);
        _accumulator.add(null);
        _accumulator.add(null);
        setField(mapReferringAccumulator, "com.fasterxml.jackson.databind.deser.std.MapDeserializer$MapReferringAccumulator", "_accumulator", _accumulator);
        UnresolvedForwardReference unresolvedForwardReference = ((UnresolvedForwardReference) createInstance("com.fasterxml.jackson.databind.deser.UnresolvedForwardReference"));
        ReadableObjectId _roid = ((ReadableObjectId) createInstance("com.fasterxml.jackson.databind.deser.impl.ReadableObjectId"));
        setField(_roid, "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", "_referringProperties", _accumulator);
        setField(unresolvedForwardReference, "com.fasterxml.jackson.databind.deser.UnresolvedForwardReference", "_roid", _roid);
        
        Class mapDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Class jsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class mapReferringAccumulatorType = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer$MapReferringAccumulator");
        Class objectType = Class.forName("java.lang.Object");
        Class unresolvedForwardReferenceType = Class.forName("com.fasterxml.jackson.databind.deser.UnresolvedForwardReference");
        Method handleUnresolvedReferenceMethod = mapDeserializerClazz.getDeclaredMethod("handleUnresolvedReference", jsonParserType, mapReferringAccumulatorType, objectType, unresolvedForwardReferenceType);
        handleUnresolvedReferenceMethod.setAccessible(true);
        java.lang.Object[] handleUnresolvedReferenceMethodArguments = new java.lang.Object[4];
        handleUnresolvedReferenceMethodArguments[0] = ((Object) null);
        handleUnresolvedReferenceMethodArguments[1] = mapReferringAccumulator;
        handleUnresolvedReferenceMethodArguments[2] = ((Object) null);
        handleUnresolvedReferenceMethodArguments[3] = unresolvedForwardReference;
        handleUnresolvedReferenceMethod.invoke(mapDeserializer, handleUnresolvedReferenceMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#handleUnresolvedReference(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.deser.std.MapDeserializer.MapReferringAccumulator,java.lang.Object,com.fasterxml.jackson.databind.deser.UnresolvedForwardReference)}
 *  */
    @Test
    public void testHandleUnresolvedReference_1() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object mapReferringAccumulator = createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer$MapReferringAccumulator");
        ArrayList _accumulator = new ArrayList();
        _accumulator.add(null);
        _accumulator.add(null);
        _accumulator.add(null);
        setField(mapReferringAccumulator, "com.fasterxml.jackson.databind.deser.std.MapDeserializer$MapReferringAccumulator", "_accumulator", _accumulator);
        UnresolvedForwardReference unresolvedForwardReference = ((UnresolvedForwardReference) createInstance("com.fasterxml.jackson.databind.deser.UnresolvedForwardReference"));
        ReadableObjectId _roid = ((ReadableObjectId) createInstance("com.fasterxml.jackson.databind.deser.impl.ReadableObjectId"));
        setField(unresolvedForwardReference, "com.fasterxml.jackson.databind.deser.UnresolvedForwardReference", "_roid", _roid);
        
        Class mapDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Class jsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class mapReferringAccumulatorType = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer$MapReferringAccumulator");
        Class objectType = Class.forName("java.lang.Object");
        Class unresolvedForwardReferenceType = Class.forName("com.fasterxml.jackson.databind.deser.UnresolvedForwardReference");
        Method handleUnresolvedReferenceMethod = mapDeserializerClazz.getDeclaredMethod("handleUnresolvedReference", jsonParserType, mapReferringAccumulatorType, objectType, unresolvedForwardReferenceType);
        handleUnresolvedReferenceMethod.setAccessible(true);
        java.lang.Object[] handleUnresolvedReferenceMethodArguments = new java.lang.Object[4];
        handleUnresolvedReferenceMethodArguments[0] = ((Object) null);
        handleUnresolvedReferenceMethodArguments[1] = mapReferringAccumulator;
        handleUnresolvedReferenceMethodArguments[2] = ((Object) null);
        handleUnresolvedReferenceMethodArguments[3] = unresolvedForwardReference;
        handleUnresolvedReferenceMethod.invoke(mapDeserializer, handleUnresolvedReferenceMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method handleUnresolvedReference(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.deser.std.MapDeserializer$MapReferringAccumulator, java.lang.Object, com.fasterxml.jackson.databind.deser.UnresolvedForwardReference)
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#handleUnresolvedReference(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.deser.std.MapDeserializer.MapReferringAccumulator,java.lang.Object,com.fasterxml.jackson.databind.deser.UnresolvedForwardReference)}
 * @utbot.executesCondition {@code (accumulator == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonMappingException#from(com.fasterxml.jackson.core.JsonParser,java.lang.String,java.lang.Throwable)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} when: accumulator == null
 *  */
    @Test(expected = JsonMappingException.class)
    public void testHandleUnresolvedReference_ThrowJsonMappingException() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        
        Class mapDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Class jsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class mapReferringAccumulatorType = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer$MapReferringAccumulator");
        Class objectType = Class.forName("java.lang.Object");
        Class unresolvedForwardReferenceType = Class.forName("com.fasterxml.jackson.databind.deser.UnresolvedForwardReference");
        Method handleUnresolvedReferenceMethod = mapDeserializerClazz.getDeclaredMethod("handleUnresolvedReference", jsonParserType, mapReferringAccumulatorType, objectType, unresolvedForwardReferenceType);
        handleUnresolvedReferenceMethod.setAccessible(true);
        java.lang.Object[] handleUnresolvedReferenceMethodArguments = new java.lang.Object[4];
        handleUnresolvedReferenceMethodArguments[0] = ((Object) null);
        handleUnresolvedReferenceMethodArguments[1] = ((Object) null);
        handleUnresolvedReferenceMethodArguments[2] = ((Object) null);
        handleUnresolvedReferenceMethodArguments[3] = ((Object) null);
        try {
            handleUnresolvedReferenceMethod.invoke(mapDeserializer, handleUnresolvedReferenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleUnresolvedReference(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.deser.std.MapDeserializer$MapReferringAccumulator, java.lang.Object, com.fasterxml.jackson.databind.deser.UnresolvedForwardReference)
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#handleUnresolvedReference(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.deser.std.MapDeserializer.MapReferringAccumulator,java.lang.Object,com.fasterxml.jackson.databind.deser.UnresolvedForwardReference)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: reference.getRoid().appendReferring(referring);
 *  */
    @Test
    public void testHandleUnresolvedReference_ThrowNullPointerException() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object mapReferringAccumulator = createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer$MapReferringAccumulator");
        Class _valueType = Object.class;
        setField(mapReferringAccumulator, "com.fasterxml.jackson.databind.deser.std.MapDeserializer$MapReferringAccumulator", "_valueType", _valueType);
        ArrayList _accumulator = new ArrayList();
        _accumulator.add(null);
        _accumulator.add(null);
        _accumulator.add(null);
        setField(mapReferringAccumulator, "com.fasterxml.jackson.databind.deser.std.MapDeserializer$MapReferringAccumulator", "_accumulator", _accumulator);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.handleUnresolvedReference] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.handleUnresolvedReference(MapDeserializer.java:590) */
        Class mapDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Class jsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class mapReferringAccumulatorType = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer$MapReferringAccumulator");
        Class unresolvedForwardReferenceType = Class.forName("com.fasterxml.jackson.databind.deser.UnresolvedForwardReference");
        Method handleUnresolvedReferenceMethod = mapDeserializerClazz.getDeclaredMethod("handleUnresolvedReference", jsonParserType, mapReferringAccumulatorType, _valueType, unresolvedForwardReferenceType);
        handleUnresolvedReferenceMethod.setAccessible(true);
        java.lang.Object[] handleUnresolvedReferenceMethodArguments = new java.lang.Object[4];
        handleUnresolvedReferenceMethodArguments[0] = ((Object) null);
        handleUnresolvedReferenceMethodArguments[1] = mapReferringAccumulator;
        handleUnresolvedReferenceMethodArguments[2] = ((Object) null);
        handleUnresolvedReferenceMethodArguments[3] = ((Object) null);
        try {
            handleUnresolvedReferenceMethod.invoke(mapDeserializer, handleUnresolvedReferenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#handleUnresolvedReference(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.deser.std.MapDeserializer.MapReferringAccumulator,java.lang.Object,com.fasterxml.jackson.databind.deser.UnresolvedForwardReference)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.UnresolvedForwardReference#getRoid()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: reference.getRoid().appendReferring(referring);
 *  */
    @Test
    public void testHandleUnresolvedReference_ThrowNullPointerException_1() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        Object mapReferringAccumulator = createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer$MapReferringAccumulator");
        ArrayList _accumulator = new ArrayList();
        _accumulator.add(null);
        _accumulator.add(null);
        _accumulator.add(null);
        setField(mapReferringAccumulator, "com.fasterxml.jackson.databind.deser.std.MapDeserializer$MapReferringAccumulator", "_accumulator", _accumulator);
        UnresolvedForwardReference unresolvedForwardReference = ((UnresolvedForwardReference) createInstance("com.fasterxml.jackson.databind.deser.UnresolvedForwardReference"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer.handleUnresolvedReference] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer.handleUnresolvedReference(MapDeserializer.java:590) */
        Class mapDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Class jsonParserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class mapReferringAccumulatorType = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer$MapReferringAccumulator");
        Class objectType = Class.forName("java.lang.Object");
        Class unresolvedForwardReferenceType = Class.forName("com.fasterxml.jackson.databind.deser.UnresolvedForwardReference");
        Method handleUnresolvedReferenceMethod = mapDeserializerClazz.getDeclaredMethod("handleUnresolvedReference", jsonParserType, mapReferringAccumulatorType, objectType, unresolvedForwardReferenceType);
        handleUnresolvedReferenceMethod.setAccessible(true);
        java.lang.Object[] handleUnresolvedReferenceMethodArguments = new java.lang.Object[4];
        handleUnresolvedReferenceMethodArguments[0] = ((Object) null);
        handleUnresolvedReferenceMethodArguments[1] = mapReferringAccumulator;
        handleUnresolvedReferenceMethodArguments[2] = ((Object) null);
        handleUnresolvedReferenceMethodArguments[3] = unresolvedForwardReference;
        try {
            handleUnresolvedReferenceMethod.invoke(mapDeserializer, handleUnresolvedReferenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _deserializeUsingCreator(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_deserializeUsingCreator(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: PropertyValueBuffer buffer = creator.startBuilding(jp, ctxt, null);
 *  */
    @Test
    public void test_deserializeUsingCreator_ThrowNegativeArraySizeException() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", -256);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NegativeArraySizeException: -256]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.<init>(PropertyValueBuffer.java:57)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.startBuilding(PropertyBasedCreator.java:158)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:496) */
        mapDeserializer._deserializeUsingCreator(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_deserializeUsingCreator(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: t = jp.nextToken();
 *  */
    @Test
    public void test_deserializeUsingCreator_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 2);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\u0000', '\u0000'};
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1073741823);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1073741824);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741823 out of bounds for length 2]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1649)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:500) */
        mapDeserializer._deserializeUsingCreator(readerBasedJsonParser, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_deserializeUsingCreator(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: t = jp.nextToken();
 *  */
    @Test
    public void test_deserializeUsingCreator_ThrowClassCastException() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 1);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$Object");
        Object _current = createInstance("java.util.KeyValueHolder");
        short[] value = {};
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$Object", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_startContainer", true);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.ClassCastException: class [S cannot be cast to class com.fasterxml.jackson.databind.JsonNode ([S is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.JsonNode is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3a36e3bf)]
            com.fasterxml.jackson.databind.node.NodeCursor$Object.currentNode(NodeCursor.java:226)
            com.fasterxml.jackson.databind.node.NodeCursor$Object.currentHasChildren(NodeCursor.java:231)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.nextToken(TreeTraversingParser.java:131)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:500) */
        mapDeserializer._deserializeUsingCreator(treeTraversingParser, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_deserializeUsingCreator(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: PropertyValueBuffer buffer = creator.startBuilding(jp, ctxt, null);
 *  */
    @Test
    public void test_deserializeUsingCreator_ThrowNullPointerException() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:496) */
        mapDeserializer._deserializeUsingCreator(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_deserializeUsingCreator(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = jp.getCurrentToken();
 *  */
    @Test
    public void test_deserializeUsingCreator_ThrowNullPointerException_2() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 1);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:498) */
        mapDeserializer._deserializeUsingCreator(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_deserializeUsingCreator(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = jp.getCurrentToken();
 *  */
    @Test
    public void test_deserializeUsingCreator_ThrowNullPointerException_3() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 1);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:498) */
        mapDeserializer._deserializeUsingCreator(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_deserializeUsingCreator(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonToken t = jp.getCurrentToken();
 *  */
    @Test
    public void test_deserializeUsingCreator_ThrowNullPointerException_1() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 1);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:498) */
        mapDeserializer._deserializeUsingCreator(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _deserializeUsingCreator(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link MapDeserializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.std.MapDeserializer#_deserializeUsingCreator(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator#startBuilding(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.ObjectIdReader)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: PropertyValueBuffer buffer = creator.startBuilding(jp, ctxt, null);
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_deserializeUsingCreator_ThrowIllegalStateException() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 1);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[1];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        _propertiesWithInjectables[0] = ((SettableBeanProperty) creatorProperty);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        mapDeserializer._deserializeUsingCreator(null, impl);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _deserializeUsingCreator(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void test_deserializeUsingCreator1() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 18);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t',
            '\t'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 8);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 11);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1879)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:500) */
        mapDeserializer._deserializeUsingCreator(readerBasedJsonParser, impl);
    }
    
    @Test
    public void test_deserializeUsingCreator2() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 1);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$Object");
        Object _current = createInstance("java.util.KeyValueHolder");
        BooleanNode value = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$Object", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_startContainer", true);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.ClassCastException: class com.fasterxml.jackson.databind.node.BooleanNode cannot be cast to class com.fasterxml.jackson.databind.node.ContainerNode (com.fasterxml.jackson.databind.node.BooleanNode and com.fasterxml.jackson.databind.node.ContainerNode are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3a36e3bf)]
            com.fasterxml.jackson.databind.node.NodeCursor$Object.currentHasChildren(NodeCursor.java:231)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.nextToken(TreeTraversingParser.java:131)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:500) */
        mapDeserializer._deserializeUsingCreator(treeTraversingParser, null);
    }
    
    @Test
    public void test_deserializeUsingCreator3() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 1);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$Object");
        Object _current = createInstance("java.util.KeyValueHolder");
        setField(_current, "java.util.KeyValueHolder", "value", _propertiesWithInjectables);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$Object", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.ClassCastException: class [Lcom.fasterxml.jackson.databind.deser.SettableBeanProperty; cannot be cast to class com.fasterxml.jackson.databind.JsonNode ([Lcom.fasterxml.jackson.databind.deser.SettableBeanProperty; and com.fasterxml.jackson.databind.JsonNode are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3a36e3bf)]
            com.fasterxml.jackson.databind.node.NodeCursor$Object.nextToken(NodeCursor.java:208)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.nextToken(TreeTraversingParser.java:149)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:500) */
        mapDeserializer._deserializeUsingCreator(treeTraversingParser, null);
    }
    
    @Test
    public void test_deserializeUsingCreator4() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '}', '\r', '}', '}', '}', '}', '}', '}',
            '}', '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:599)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:500) */
        mapDeserializer._deserializeUsingCreator(readerBasedJsonParser, impl);
    }
    
    @Test
    public void test_deserializeUsingCreator5() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\t', '\t', '\t', '\t', '\t', '\t', '\t', '\t',
            '\t', '\t'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:449)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:1906)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1898)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:500) */
        mapDeserializer._deserializeUsingCreator(readerBasedJsonParser, impl);
    }
    
    @Test
    public void test_deserializeUsingCreator6() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[11];
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        _propertiesWithInjectables[2] = ((SettableBeanProperty) managedReferenceProperty);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        _propertiesWithInjectables[3] = ((SettableBeanProperty) objectIdValueProperty);
        _propertiesWithInjectables[4] = ((SettableBeanProperty) objectIdValueProperty);
        _propertiesWithInjectables[5] = ((SettableBeanProperty) objectIdValueProperty);
        _propertiesWithInjectables[6] = ((SettableBeanProperty) objectIdValueProperty);
        _propertiesWithInjectables[7] = ((SettableBeanProperty) objectIdValueProperty);
        _propertiesWithInjectables[8] = ((SettableBeanProperty) objectIdValueProperty);
        _propertiesWithInjectables[9] = ((SettableBeanProperty) objectIdValueProperty);
        _propertiesWithInjectables[10] = ((SettableBeanProperty) objectIdValueProperty);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.inject(PropertyValueBuffer.java:66)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.startBuilding(PropertyBasedCreator.java:160)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:496) */
        mapDeserializer._deserializeUsingCreator(null, null);
    }
    
    @Test
    public void test_deserializeUsingCreator7() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 10);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '?', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:366)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1419)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:508)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:445)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1644)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:500) */
        mapDeserializer._deserializeUsingCreator(readerBasedJsonParser, impl);
    }
    
    @Test
    public void test_deserializeUsingCreator8() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 10);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[11];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '\\';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 2);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 7);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:366)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1419)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:508)
            com.fasterxml.jackson.core.base.ParserMinimalBase._handleUnrecognizedCharacterEscape(ParserMinimalBase.java:485)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeEscaped(ReaderBasedJsonParser.java:2046)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1658)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:500) */
        mapDeserializer._deserializeUsingCreator(readerBasedJsonParser, null);
    }
    
    @Test
    public void test_deserializeUsingCreator9() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 2);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '/', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:366)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1419)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:508)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:437)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipComment(ReaderBasedJsonParser.java:1937)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:1912)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1863)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:500) */
        mapDeserializer._deserializeUsingCreator(readerBasedJsonParser, null);
    }
    
    @Test
    public void test_deserializeUsingCreator10() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '\t';
        _inputBuffer[1] = '\t';
        _inputBuffer[2] = '\t';
        _inputBuffer[3] = '\t';
        _inputBuffer[4] = '\t';
        _inputBuffer[5] = '\t';
        _inputBuffer[6] = '\t';
        _inputBuffer[7] = '\t';
        _inputBuffer[8] = '\t';
        _inputBuffer[9] = '\t';
        _inputBuffer[10] = '\t';
        _inputBuffer[11] = '\t';
        _inputBuffer[12] = '\t';
        _inputBuffer[13] = '\t';
        _inputBuffer[14] = '\t';
        _inputBuffer[15] = '\t';
        _inputBuffer[16] = '\t';
        _inputBuffer[17] = '\t';
        _inputBuffer[18] = '\t';
        _inputBuffer[19] = '\t';
        _inputBuffer[20] = '\t';
        _inputBuffer[21] = '\t';
        _inputBuffer[22] = '\t';
        _inputBuffer[23] = '\t';
        _inputBuffer[24] = '\t';
        _inputBuffer[25] = '\t';
        _inputBuffer[26] = '\t';
        _inputBuffer[27] = '\t';
        _inputBuffer[28] = '\t';
        _inputBuffer[29] = '\t';
        _inputBuffer[30] = '\t';
        _inputBuffer[31] = '\t';
        _inputBuffer[32] = '\t';
        _inputBuffer[33] = '\t';
        _inputBuffer[34] = '\t';
        _inputBuffer[35] = '\t';
        _inputBuffer[36] = '\t';
        _inputBuffer[37] = '\t';
        _inputBuffer[38] = '/';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:366)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1419)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:508)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportUnexpectedChar(ParserMinimalBase.java:437)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipComment(ReaderBasedJsonParser.java:1937)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:1912)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1883)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:500) */
        mapDeserializer._deserializeUsingCreator(readerBasedJsonParser, null);
    }
    
    @Test
    public void test_deserializeUsingCreator11() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 2);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '!', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_tokenInputTotal", 0L);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:607)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:500) */
        mapDeserializer._deserializeUsingCreator(readerBasedJsonParser, null);
    }
    
    @Test
    public void test_deserializeUsingCreator12() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = ' ';
        _inputBuffer[38] = '\u0001';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:366)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1419)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:508)
            com.fasterxml.jackson.core.base.ParserMinimalBase._throwInvalidSpace(ParserMinimalBase.java:459)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1894)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:500) */
        mapDeserializer._deserializeUsingCreator(readerBasedJsonParser, null);
    }
    
    @Test
    public void test_deserializeUsingCreator13() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 10);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\\', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:366)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1419)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:508)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:445)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeEscaped(ReaderBasedJsonParser.java:2018)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1658)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:500) */
        mapDeserializer._deserializeUsingCreator(readerBasedJsonParser, null);
    }
    
    @Test
    public void test_deserializeUsingCreator14() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 16);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '\t';
        _inputBuffer[1] = '\t';
        _inputBuffer[2] = '\t';
        _inputBuffer[3] = '\t';
        _inputBuffer[4] = '\t';
        _inputBuffer[5] = '\t';
        _inputBuffer[6] = '\t';
        _inputBuffer[7] = '\t';
        _inputBuffer[8] = '\t';
        _inputBuffer[9] = '\t';
        _inputBuffer[10] = '\t';
        _inputBuffer[11] = '\t';
        _inputBuffer[12] = '\t';
        _inputBuffer[13] = '\t';
        _inputBuffer[14] = '\t';
        _inputBuffer[15] = '\t';
        _inputBuffer[16] = '\t';
        _inputBuffer[17] = '\t';
        _inputBuffer[18] = '\t';
        _inputBuffer[19] = '\t';
        _inputBuffer[20] = '\t';
        _inputBuffer[21] = '\t';
        _inputBuffer[22] = '\t';
        _inputBuffer[23] = '\t';
        _inputBuffer[24] = '\t';
        _inputBuffer[25] = '\t';
        _inputBuffer[26] = '\t';
        _inputBuffer[27] = '\t';
        _inputBuffer[28] = '\t';
        _inputBuffer[29] = '\t';
        _inputBuffer[30] = '\t';
        _inputBuffer[31] = '\t';
        _inputBuffer[32] = '\t';
        _inputBuffer[33] = '\t';
        _inputBuffer[34] = '\t';
        _inputBuffer[35] = '\t';
        _inputBuffer[36] = '\t';
        _inputBuffer[37] = '\t';
        _inputBuffer[38] = '#';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:607)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:500) */
        mapDeserializer._deserializeUsingCreator(readerBasedJsonParser, null);
    }
    
    @Test
    public void test_deserializeUsingCreator15() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 1);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '#', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:607)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:500) */
        mapDeserializer._deserializeUsingCreator(readerBasedJsonParser, null);
    }
    
    @Test
    public void test_deserializeUsingCreator16() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 16);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = '\r';
        _inputBuffer[38] = '\n';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:449)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:1906)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1898)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:500) */
        mapDeserializer._deserializeUsingCreator(readerBasedJsonParser, null);
    }
    
    @Test
    public void test_deserializeUsingCreator17() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 16);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '\t';
        _inputBuffer[1] = '\t';
        _inputBuffer[2] = '\t';
        _inputBuffer[3] = '\t';
        _inputBuffer[4] = '\t';
        _inputBuffer[5] = '\t';
        _inputBuffer[6] = '\t';
        _inputBuffer[7] = '\t';
        _inputBuffer[8] = '\t';
        _inputBuffer[9] = '\t';
        _inputBuffer[10] = '\t';
        _inputBuffer[11] = '\t';
        _inputBuffer[12] = '\t';
        _inputBuffer[13] = '\t';
        _inputBuffer[14] = '\t';
        _inputBuffer[15] = '\t';
        _inputBuffer[16] = '\t';
        _inputBuffer[17] = '\t';
        _inputBuffer[18] = '\t';
        _inputBuffer[19] = '\t';
        _inputBuffer[20] = '\t';
        _inputBuffer[21] = '\t';
        _inputBuffer[22] = '\t';
        _inputBuffer[23] = '\t';
        _inputBuffer[24] = '\t';
        _inputBuffer[25] = '\t';
        _inputBuffer[26] = '\t';
        _inputBuffer[27] = '\t';
        _inputBuffer[28] = '\t';
        _inputBuffer[29] = '\t';
        _inputBuffer[30] = '\t';
        _inputBuffer[31] = '\t';
        _inputBuffer[32] = '\t';
        _inputBuffer[33] = '\t';
        _inputBuffer[34] = '\t';
        _inputBuffer[35] = '\t';
        _inputBuffer[36] = '\t';
        _inputBuffer[37] = '\t';
        _inputBuffer[38] = '\r';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:449)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:1906)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1898)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:500) */
        mapDeserializer._deserializeUsingCreator(readerBasedJsonParser, null);
    }
    
    @Test
    public void test_deserializeUsingCreator18() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[10];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        String _injectableValueId = "";
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_injectableValueId", _injectableValueId);
        _propertiesWithInjectables[1] = ((SettableBeanProperty) creatorProperty);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        com.fasterxml.jackson.databind.InjectableValues.Std _injectableValues = ((com.fasterxml.jackson.databind.InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        LinkedHashMap _values = new LinkedHashMap();
        setField(_injectableValues, "com.fasterxml.jackson.databind.InjectableValues$Std", "_values", _values);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:357)
            com.fasterxml.jackson.databind.InjectableValues$Std.findInjectableValue(InjectableValues.java:75)
            com.fasterxml.jackson.databind.DeserializationContext.findInjectableValue(DeserializationContext.java:293)
            com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer.inject(PropertyValueBuffer.java:66)
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.startBuilding(PropertyBasedCreator.java:160)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:496) */
        mapDeserializer._deserializeUsingCreator(uTF8StreamJsonParser, impl);
    }
    
    @Test
    public void test_deserializeUsingCreator19() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\"', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:449)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1856)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:500) */
        mapDeserializer._deserializeUsingCreator(readerBasedJsonParser, null);
    }
    
    @Test
    public void test_deserializeUsingCreator20() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 16);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = '\n';
        _inputBuffer[38] = '\n';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:449)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:1906)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1898)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:500) */
        mapDeserializer._deserializeUsingCreator(readerBasedJsonParser, null);
    }
    
    @Test
    public void test_deserializeUsingCreator21() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 16);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = '\\';
        _inputBuffer[38] = 'r';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:366)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1419)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:508)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:445)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1644)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:500) */
        mapDeserializer._deserializeUsingCreator(readerBasedJsonParser, null);
    }
    
    @Test
    public void test_deserializeUsingCreator22() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 16);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = '\\';
        _inputBuffer[38] = '/';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:366)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1419)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:508)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:445)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1644)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:500) */
        mapDeserializer._deserializeUsingCreator(readerBasedJsonParser, null);
    }
    
    @Test
    public void test_deserializeUsingCreator23() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 16);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = '\\';
        _inputBuffer[38] = 't';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:366)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1419)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:508)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:445)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1644)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:500) */
        mapDeserializer._deserializeUsingCreator(readerBasedJsonParser, null);
    }
    
    @Test
    public void test_deserializeUsingCreator24() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 16);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '\t';
        _inputBuffer[1] = '\t';
        _inputBuffer[2] = '\t';
        _inputBuffer[3] = '\t';
        _inputBuffer[4] = '\t';
        _inputBuffer[5] = '\t';
        _inputBuffer[6] = '\t';
        _inputBuffer[7] = '\t';
        _inputBuffer[8] = '\t';
        _inputBuffer[9] = '\t';
        _inputBuffer[10] = '\t';
        _inputBuffer[11] = '\t';
        _inputBuffer[12] = '\t';
        _inputBuffer[13] = '\t';
        _inputBuffer[14] = '\t';
        _inputBuffer[15] = '\t';
        _inputBuffer[16] = '\t';
        _inputBuffer[17] = '\t';
        _inputBuffer[18] = '\t';
        _inputBuffer[19] = '\t';
        _inputBuffer[20] = '\t';
        _inputBuffer[21] = '\t';
        _inputBuffer[22] = '\t';
        _inputBuffer[23] = '\t';
        _inputBuffer[24] = '\t';
        _inputBuffer[25] = '\t';
        _inputBuffer[26] = '\t';
        _inputBuffer[27] = '\t';
        _inputBuffer[28] = '\t';
        _inputBuffer[29] = '\t';
        _inputBuffer[30] = '\t';
        _inputBuffer[31] = '\t';
        _inputBuffer[32] = '\t';
        _inputBuffer[33] = '\t';
        _inputBuffer[34] = '\t';
        _inputBuffer[35] = '\t';
        _inputBuffer[36] = '\t';
        _inputBuffer[37] = '\t';
        _inputBuffer[38] = ' ';
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._handleEOF(ParserBase.java:449)
            com.fasterxml.jackson.core.base.ParserBase._eofAsNextChar(ParserBase.java:458)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd2(ReaderBasedJsonParser.java:1906)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1898)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:500) */
        mapDeserializer._deserializeUsingCreator(readerBasedJsonParser, null);
    }
    
    @Test
    public void test_deserializeUsingCreator25() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 4);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            '\u0001', '\t', '\t', '\t', '\t', '\t', '\t', '\t',
            '\t'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:366)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1419)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:508)
            com.fasterxml.jackson.core.base.ParserMinimalBase._throwInvalidSpace(ParserMinimalBase.java:459)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1874)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:500) */
        mapDeserializer._deserializeUsingCreator(readerBasedJsonParser, null);
    }
    
    @Test
    public void test_deserializeUsingCreator26() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {
            ' ', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase.getCurrentLocation(ParserBase.java:366)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1419)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:508)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:445)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1644)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:569)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:500) */
        mapDeserializer._deserializeUsingCreator(readerBasedJsonParser, null);
    }
    
    @Test
    public void test_deserializeUsingCreator27() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _nextToken = JsonToken.VALUE_FALSE;
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:554) */
        mapDeserializer._deserializeUsingCreator(treeTraversingParser, impl);
    }
    
    @Test
    public void test_deserializeUsingCreator28() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 8);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        FileReader _reader = ((FileReader) createInstance("java.io.FileReader"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reader", _reader);
        char[] _inputBuffer = {};
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", -2147483647);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            java.base/java.io.InputStreamReader.read(InputStreamReader.java:177)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.loadMore(ReaderBasedJsonParser.java:153)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1855)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:500) */
        mapDeserializer._deserializeUsingCreator(readerBasedJsonParser, null);
    }
    
    @Test
    public void test_deserializeUsingCreator29() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 8);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        ReaderUTF16 _reader = ((ReaderUTF16) createInstance("jdk.internal.util.xml.impl.ReaderUTF16"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reader", _reader);
        char[] _inputBuffer = {
            '\r', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            java.base/jdk.internal.util.xml.impl.ReaderUTF16.read(ReaderUTF16.java:84)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.loadMore(ReaderBasedJsonParser.java:153)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipCR(ReaderBasedJsonParser.java:1686)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1872)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:500) */
        mapDeserializer._deserializeUsingCreator(readerBasedJsonParser, null);
    }
    
    @Test
    public void test_deserializeUsingCreator30() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1859)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:571)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:500) */
        mapDeserializer._deserializeUsingCreator(readerBasedJsonParser, null);
    }
    
    @Test
    public void test_deserializeUsingCreator31() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(parser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        Class jsonParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Constructor jsonParserDelegateConstructor = jsonParserDelegateClazz.getDeclaredConstructor(parserType);
        jsonParserDelegateConstructor.setAccessible(true);
        java.lang.Object[] jsonParserDelegateConstructorArguments = new java.lang.Object[1];
        jsonParserDelegateConstructorArguments[0] = parser;
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) jsonParserDelegateConstructor.newInstance(jsonParserDelegateConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:554) */
        mapDeserializer._deserializeUsingCreator(jsonParserDelegate, null);
    }
    
    @Test
    public void test_deserializeUsingCreator32() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:554) */
        mapDeserializer._deserializeUsingCreator(treeTraversingParser, impl);
    }
    
    @Test
    public void test_deserializeUsingCreator33() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", -2147483647);
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        JsonReadContext _parsingContext = ((JsonReadContext) createInstance("com.fasterxml.jackson.core.json.JsonReadContext"));
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserBase", "_parsingContext", _parsingContext);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(readerBasedJsonParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserBase._releaseBuffers(ParserBase.java:434)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._releaseBuffers(ReaderBasedJsonParser.java:201)
            com.fasterxml.jackson.core.base.ParserBase.close(ParserBase.java:338)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:576)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:500) */
        mapDeserializer._deserializeUsingCreator(readerBasedJsonParser, null);
    }
    
    @Test
    public void test_deserializeUsingCreator34() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentToken(JsonParserDelegate.java:87)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentToken(JsonParserDelegate.java:87)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentToken(JsonParserDelegate.java:87)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentToken(JsonParserDelegate.java:87)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:498) */
        mapDeserializer._deserializeUsingCreator(jsonParserDelegate, null);
    }
    
    @Test
    public void test_deserializeUsingCreator35() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$Object");
        Object _current = createInstance("java.text.AttributeEntry");
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$Object", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_startContainer", true);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.NodeCursor$Object.currentHasChildren(NodeCursor.java:231)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.nextToken(TreeTraversingParser.java:131)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:500) */
        mapDeserializer._deserializeUsingCreator(treeTraversingParser, null);
    }
    
    @Test
    public void test_deserializeUsingCreator36() throws Throwable  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(parser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Parser.getCurrentName(TokenBuffer.java:1265)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:505) */
        Class mapDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.MapDeserializer");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method _deserializeUsingCreatorMethod = mapDeserializerClazz.getDeclaredMethod("_deserializeUsingCreator", parserType, implType);
        _deserializeUsingCreatorMethod.setAccessible(true);
        java.lang.Object[] _deserializeUsingCreatorMethodArguments = new java.lang.Object[2];
        _deserializeUsingCreatorMethodArguments[0] = parser;
        _deserializeUsingCreatorMethodArguments[1] = impl;
        try {
            _deserializeUsingCreatorMethod.invoke(mapDeserializer, _deserializeUsingCreatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_deserializeUsingCreator37() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$Object");
        Object _current = createInstance("java.util.KeyValueHolder");
        NullNode value = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$Object", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:554) */
        mapDeserializer._deserializeUsingCreator(treeTraversingParser, null);
    }
    
    @Test
    public void test_deserializeUsingCreator38() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 1);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$Object");
        Object _current = createInstance("java.util.KeyValueHolder");
        BooleanNode value = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$Object", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:554) */
        mapDeserializer._deserializeUsingCreator(treeTraversingParser, null);
    }
    
    @Test
    public void test_deserializeUsingCreator39() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 1);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$Object");
        Object _current = createInstance("java.util.KeyValueHolder");
        BooleanNode value = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(value, "com.fasterxml.jackson.databind.node.BooleanNode", "_value", true);
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$Object", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:554) */
        mapDeserializer._deserializeUsingCreator(treeTraversingParser, null);
    }
    
    @Test
    public void test_deserializeUsingCreator40() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootValue");
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _nextToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.NodeCursor$RootValue.nextToken(NodeCursor.java:118)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.nextToken(TreeTraversingParser.java:149)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:506) */
        mapDeserializer._deserializeUsingCreator(treeTraversingParser, null);
    }
    
    @Test
    public void test_deserializeUsingCreator41() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 32);
        java.lang.Object[] _defaultValues = {null, null, null, null, null, null, null, null, null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_defaultValues", _defaultValues);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _nextToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nextToken", _nextToken);
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _nextToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:554) */
        mapDeserializer._deserializeUsingCreator(treeTraversingParser, impl);
    }
    
    @Test
    public void test_deserializeUsingCreator42() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(parser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        Class jsonParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Constructor jsonParserDelegateConstructor = jsonParserDelegateClazz.getDeclaredConstructor(parserType);
        jsonParserDelegateConstructor.setAccessible(true);
        java.lang.Object[] jsonParserDelegateConstructorArguments = new java.lang.Object[1];
        jsonParserDelegateConstructorArguments[0] = parser;
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) jsonParserDelegateConstructor.newInstance(jsonParserDelegateConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer$Parser.getCurrentName(TokenBuffer.java:1265)
            com.fasterxml.jackson.core.util.JsonParserDelegate.getCurrentName(JsonParserDelegate.java:90)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:505) */
        mapDeserializer._deserializeUsingCreator(jsonParserDelegate, null);
    }
    
    @Test
    public void test_deserializeUsingCreator43() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.findCreatorProperty(PropertyBasedCreator.java:132)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:512) */
        mapDeserializer._deserializeUsingCreator(treeTraversingParser, impl);
    }
    
    @Test
    public void test_deserializeUsingCreator44() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 18);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _nextToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nextToken", _nextToken);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator.findCreatorProperty(PropertyBasedCreator.java:132)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:512) */
        mapDeserializer._deserializeUsingCreator(treeTraversingParser, null);
    }
    
    @Test
    public void test_deserializeUsingCreator45() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        Object _nodeCursor = createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootValue");
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.NodeCursor$RootValue.nextToken(NodeCursor.java:118)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.nextToken(TreeTraversingParser.java:149)
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:506) */
        mapDeserializer._deserializeUsingCreator(treeTraversingParser, impl);
    }
    
    @Test
    public void test_deserializeUsingCreator46() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        StdValueInstantiator _valueInstantiator = ((StdValueInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        AnnotatedMethod _withArgsCreator = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(_valueInstantiator, "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_withArgsCreator", _withArgsCreator);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 1);
        java.lang.Object[] _defaultValues = new java.lang.Object[9];
        Object object = createInstance("java.lang.Object");
        _defaultValues[0] = object;
        byte[] byteArray = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        _defaultValues[1] = ((Object) byteArray);
        _defaultValues[2] = ((Object) byteArray);
        _defaultValues[3] = ((Object) byteArray);
        _defaultValues[4] = ((Object) byteArray);
        _defaultValues[5] = ((Object) byteArray);
        _defaultValues[6] = ((Object) byteArray);
        _defaultValues[7] = ((Object) byteArray);
        _defaultValues[8] = ((Object) byteArray);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_defaultValues", _defaultValues);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:554) */
        mapDeserializer._deserializeUsingCreator(readerBasedJsonParser, null);
    }
    
    @Test
    public void test_deserializeUsingCreator47() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(uTF8StreamJsonParser);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        JsonParserDelegate jsonParserDelegate2 = new JsonParserDelegate(jsonParserDelegate1);
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:554) */
        mapDeserializer._deserializeUsingCreator(jsonParserDelegate2, null);
    }
    
    @Test
    public void test_deserializeUsingCreator48() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        java.lang.Object[] _defaultValues = {null, null, null, null, null, null, null, null, null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_defaultValues", _defaultValues);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:554) */
        mapDeserializer._deserializeUsingCreator(treeTraversingParser, null);
    }
    
    @Test
    public void test_deserializeUsingCreator49() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 2);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:554) */
        mapDeserializer._deserializeUsingCreator(treeTraversingParser, impl);
    }
    
    @Test
    public void test_deserializeUsingCreator50() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        JsonLocationInstantiator _valueInstantiator = ((JsonLocationInstantiator) createInstance("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_valueInstantiator", _valueInstantiator);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = {null};
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.MapDeserializer._deserializeUsingCreator(MapDeserializer.java:554) */
        mapDeserializer._deserializeUsingCreator(treeTraversingParser, impl);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _deserializeUsingCreator(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = IllegalArgumentException.class)
    public void test_deserializeUsingCreator51() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_injectableValueId", _propertiesWithInjectables);
        _propertiesWithInjectables[0] = ((SettableBeanProperty) creatorProperty);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        com.fasterxml.jackson.databind.InjectableValues.Std _injectableValues = ((com.fasterxml.jackson.databind.InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        
        mapDeserializer._deserializeUsingCreator(uTF8StreamJsonParser, impl);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test_deserializeUsingCreator52() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[10];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        Object _injectableValueId = createInstance("java.lang.Object");
        setField(creatorProperty, "com.fasterxml.jackson.databind.deser.CreatorProperty", "_injectableValueId", _injectableValueId);
        _propertiesWithInjectables[1] = ((SettableBeanProperty) creatorProperty);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        com.fasterxml.jackson.databind.InjectableValues.Std _injectableValues = ((com.fasterxml.jackson.databind.InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        
        mapDeserializer._deserializeUsingCreator(uTF8StreamJsonParser, impl);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test_deserializeUsingCreator53() throws Exception  {
        MapDeserializer mapDeserializer = ((MapDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.MapDeserializer"));
        PropertyBasedCreator _propertyBasedCreator = ((PropertyBasedCreator) createInstance("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertyCount", 9);
        com.fasterxml.jackson.databind.deser.SettableBeanProperty[] _propertiesWithInjectables = new com.fasterxml.jackson.databind.deser.SettableBeanProperty[9];
        CreatorProperty creatorProperty = ((CreatorProperty) createInstance("com.fasterxml.jackson.databind.deser.CreatorProperty"));
        _propertiesWithInjectables[0] = ((SettableBeanProperty) creatorProperty);
        setField(_propertyBasedCreator, "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "_propertiesWithInjectables", _propertiesWithInjectables);
        mapDeserializer._propertyBasedCreator = _propertyBasedCreator;
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        com.fasterxml.jackson.databind.InjectableValues.Std _injectableValues = ((com.fasterxml.jackson.databind.InjectableValues.Std) createInstance("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_injectableValues", _injectableValues);
        
        mapDeserializer._deserializeUsingCreator(null, impl);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1065114254025199 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1065114254025199.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1065114254031900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1065114254025199.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1065114254031900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1065114254238900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1065114254238900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1065114254239599 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1065114254238900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1065114254239599).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1065114256468799 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1065114256468799.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1065114256470799 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1065114256468799.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1065114256470799).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

