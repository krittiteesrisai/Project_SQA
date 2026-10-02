package com.fasterxml.jackson.databind.ser;

import org.junit.Test;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers.ShortArraySerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers;
import com.fasterxml.jackson.databind.ser.std.TimeZoneSerializer;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap;
import com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap;
import com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import java.lang.reflect.Constructor;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.ser.SerializerCache.TypeKey;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Field;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;

import static org.junit.Assert.assertFalse;

public final class com_fasterxml_jackson_databind_ser_AnyGetterWriterTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method resolve(com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link AnyGetterWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.AnyGetterWriter#resolve(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#handlePrimaryContextualization(com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.BeanProperty)}
 *  */
    @Test
    public void testResolve_SerializerProviderHandlePrimaryContextualization() throws Exception  {
        AnyGetterWriter anyGetterWriter = new AnyGetterWriter(null, null, null);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        anyGetterWriter.resolve(impl);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resolve(com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link AnyGetterWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.AnyGetterWriter#resolve(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#handlePrimaryContextualization(com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _mapSerializer = (MapSerializer) provider.handlePrimaryContextualization(_mapSerializer, _property);
 *  */
    @Test
    public void testResolve_ThrowNullPointerException() throws JsonMappingException  {
        AnyGetterWriter anyGetterWriter = new AnyGetterWriter(null, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve(AnyGetterWriter.java:82) */
        anyGetterWriter.resolve(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method resolve(com.fasterxml.jackson.databind.SerializerProvider)
    
    @Test
    public void testResolve1() throws Exception  {
        MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
        TypeWrappedSerializer _keySerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_keySerializer", _keySerializer);
        Object _suppressableValue = createInstance("java.lang.Object");
        setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_suppressableValue", _suppressableValue);
        AnyGetterWriter anyGetterWriter = new AnyGetterWriter(null, null, mapSerializer);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        MapSerializer initialAnyGetterWriter_mapSerializer = anyGetterWriter._mapSerializer;
        
        anyGetterWriter.resolve(impl);
        
        MapSerializer finalAnyGetterWriter_mapSerializer = anyGetterWriter._mapSerializer;
        
        assertFalse(initialAnyGetterWriter_mapSerializer == finalAnyGetterWriter_mapSerializer);
    }
    
    @Test
    public void testResolve2() throws Exception  {
        MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
        StdArraySerializers.ShortArraySerializer _keySerializer = ((StdArraySerializers.ShortArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$ShortArraySerializer"));
        setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_keySerializer", _keySerializer);
        TimeZoneSerializer _valueSerializer = ((TimeZoneSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.TimeZoneSerializer"));
        setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueSerializer", _valueSerializer);
        AnyGetterWriter anyGetterWriter = new AnyGetterWriter(null, null, mapSerializer);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        MapSerializer initialAnyGetterWriter_mapSerializer = anyGetterWriter._mapSerializer;
        
        anyGetterWriter.resolve(impl);
        
        MapSerializer finalAnyGetterWriter_mapSerializer = anyGetterWriter._mapSerializer;
        
        assertFalse(initialAnyGetterWriter_mapSerializer == finalAnyGetterWriter_mapSerializer);
    }
    
    @Test
    public void testResolve3() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
            MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
            StdArraySerializers.FloatArraySerializer _keySerializer = ((StdArraySerializers.FloatArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$FloatArraySerializer"));
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_keySerializer", _keySerializer);
            TimeZoneSerializer _valueSerializer = ((TimeZoneSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.TimeZoneSerializer"));
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueSerializer", _valueSerializer);
            AnyGetterWriter anyGetterWriter = new AnyGetterWriter(beanPropertyWriter, null, mapSerializer);
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            
            MapSerializer initialAnyGetterWriter_mapSerializer = anyGetterWriter._mapSerializer;
            
            anyGetterWriter.resolve(impl);
            
            MapSerializer finalAnyGetterWriter_mapSerializer = anyGetterWriter._mapSerializer;
            
            assertFalse(initialAnyGetterWriter_mapSerializer == finalAnyGetterWriter_mapSerializer);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testResolve4() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueTypeIsStatic", true);
            SimpleType _valueType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
            Class _class = Object.class;
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueType", _valueType);
            TypeWrappedSerializer _keySerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_keySerializer", _keySerializer);
            Object _suppressableValue = createInstance("java.lang.Object");
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_suppressableValue", _suppressableValue);
            AnyGetterWriter anyGetterWriter = new AnyGetterWriter(null, null, mapSerializer);
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            
            MapSerializer initialAnyGetterWriter_mapSerializer = anyGetterWriter._mapSerializer;
            
            anyGetterWriter.resolve(impl);
            
            MapSerializer finalAnyGetterWriter_mapSerializer = anyGetterWriter._mapSerializer;
            
            assertFalse(initialAnyGetterWriter_mapSerializer == finalAnyGetterWriter_mapSerializer);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testResolve5() throws Exception  {
        MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
        setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueTypeIsStatic", true);
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueType", _valueType);
        NullSerializer _keySerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_keySerializer", _keySerializer);
        Object _suppressableValue = createInstance("java.lang.Object");
        setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_suppressableValue", _suppressableValue);
        AnyGetterWriter anyGetterWriter = new AnyGetterWriter(null, null, mapSerializer);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        MapSerializer initialAnyGetterWriter_mapSerializer = anyGetterWriter._mapSerializer;
        
        anyGetterWriter.resolve(impl);
        
        MapSerializer finalAnyGetterWriter_mapSerializer = anyGetterWriter._mapSerializer;
        
        assertFalse(initialAnyGetterWriter_mapSerializer == finalAnyGetterWriter_mapSerializer);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method resolve(com.fasterxml.jackson.databind.SerializerProvider)
    
    @Test
    public void testResolve6() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueTypeIsStatic", true);
            MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", 91193024);
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueType", _valueType);
            AnyGetterWriter anyGetterWriter = new AnyGetterWriter(null, null, mapSerializer);
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
            JsonSerializerMap _map = ((JsonSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap"));
            java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", 0);
            setField(_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets", _buckets);
            setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map", _map);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 91193023 out of bounds for length 0]
                com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap.find(JsonSerializerMap.java:57)
                com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap.untypedValueSerializer(ReadOnlyClassToSerializerMap.java:70)
                com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:503)
                com.fasterxml.jackson.databind.ser.std.MapSerializer.createContextual(MapSerializer.java:343)
                com.fasterxml.jackson.databind.SerializerProvider.handlePrimaryContextualization(SerializerProvider.java:875)
                com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve(AnyGetterWriter.java:82) */
            anyGetterWriter.resolve(impl);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testResolve7() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            AttributePropertyWriter attributePropertyWriter = ((AttributePropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter"));
            AnnotatedField _member = ((AnnotatedField) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
            setField(attributePropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
            MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
            Class anyGetterWriterClazz = Class.forName("com.fasterxml.jackson.databind.ser.AnyGetterWriter");
            Class attributePropertyWriterType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
            Class annotatedMemberType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
            Class mapSerializerType = Class.forName("com.fasterxml.jackson.databind.ser.std.MapSerializer");
            Constructor anyGetterWriterConstructor = anyGetterWriterClazz.getDeclaredConstructor(attributePropertyWriterType, annotatedMemberType, mapSerializerType);
            anyGetterWriterConstructor.setAccessible(true);
            java.lang.Object[] anyGetterWriterConstructorArguments = new java.lang.Object[3];
            anyGetterWriterConstructorArguments[0] = attributePropertyWriter;
            anyGetterWriterConstructorArguments[1] = ((Object) null);
            anyGetterWriterConstructorArguments[2] = mapSerializer;
            AnyGetterWriter anyGetterWriter = ((AnyGetterWriter) anyGetterWriterConstructor.newInstance(anyGetterWriterConstructorArguments));
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.SerializerProvider.findKeySerializer(SerializerProvider.java:740)
                com.fasterxml.jackson.databind.ser.std.MapSerializer.createContextual(MapSerializer.java:352)
                com.fasterxml.jackson.databind.SerializerProvider.handlePrimaryContextualization(SerializerProvider.java:875)
                com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve(AnyGetterWriter.java:82) */
            anyGetterWriter.resolve(impl);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testResolve8() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
            MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
            Class anyGetterWriterClazz = Class.forName("com.fasterxml.jackson.databind.ser.AnyGetterWriter");
            Class objectIdValuePropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
            Class annotatedMemberType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
            Class mapSerializerType = Class.forName("com.fasterxml.jackson.databind.ser.std.MapSerializer");
            Constructor anyGetterWriterConstructor = anyGetterWriterClazz.getDeclaredConstructor(objectIdValuePropertyType, annotatedMemberType, mapSerializerType);
            anyGetterWriterConstructor.setAccessible(true);
            java.lang.Object[] anyGetterWriterConstructorArguments = new java.lang.Object[3];
            anyGetterWriterConstructorArguments[0] = objectIdValueProperty;
            anyGetterWriterConstructorArguments[1] = ((Object) null);
            anyGetterWriterConstructorArguments[2] = mapSerializer;
            AnyGetterWriter anyGetterWriter = ((AnyGetterWriter) anyGetterWriterConstructor.newInstance(anyGetterWriterConstructorArguments));
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.SerializerProvider.findKeySerializer(SerializerProvider.java:740)
                com.fasterxml.jackson.databind.ser.std.MapSerializer.createContextual(MapSerializer.java:352)
                com.fasterxml.jackson.databind.SerializerProvider.handlePrimaryContextualization(SerializerProvider.java:875)
                com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve(AnyGetterWriter.java:82) */
            anyGetterWriter.resolve(impl);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testResolve9() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
            MapEntrySerializer _valueSerializer = ((MapEntrySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer"));
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueSerializer", _valueSerializer);
            AnyGetterWriter anyGetterWriter = new AnyGetterWriter(null, null, mapSerializer);
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.SerializerProvider.findKeySerializer(SerializerProvider.java:740)
                com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer.createContextual(MapEntrySerializer.java:146)
                com.fasterxml.jackson.databind.SerializerProvider.handleSecondaryContextualization(SerializerProvider.java:903)
                com.fasterxml.jackson.databind.ser.std.MapSerializer.createContextual(MapSerializer.java:346)
                com.fasterxml.jackson.databind.SerializerProvider.handlePrimaryContextualization(SerializerProvider.java:875)
                com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve(AnyGetterWriter.java:82) */
            anyGetterWriter.resolve(impl);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testResolve10() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            AttributePropertyWriter attributePropertyWriter = ((AttributePropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter"));
            MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
            MapEntrySerializer _valueSerializer = ((MapEntrySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer"));
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueSerializer", _valueSerializer);
            Class anyGetterWriterClazz = Class.forName("com.fasterxml.jackson.databind.ser.AnyGetterWriter");
            Class attributePropertyWriterType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
            Class annotatedMemberType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
            Class mapSerializerType = Class.forName("com.fasterxml.jackson.databind.ser.std.MapSerializer");
            Constructor anyGetterWriterConstructor = anyGetterWriterClazz.getDeclaredConstructor(attributePropertyWriterType, annotatedMemberType, mapSerializerType);
            anyGetterWriterConstructor.setAccessible(true);
            java.lang.Object[] anyGetterWriterConstructorArguments = new java.lang.Object[3];
            anyGetterWriterConstructorArguments[0] = attributePropertyWriter;
            anyGetterWriterConstructorArguments[1] = ((Object) null);
            anyGetterWriterConstructorArguments[2] = mapSerializer;
            AnyGetterWriter anyGetterWriter = ((AnyGetterWriter) anyGetterWriterConstructor.newInstance(anyGetterWriterConstructorArguments));
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.SerializerProvider.findKeySerializer(SerializerProvider.java:740)
                com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer.createContextual(MapEntrySerializer.java:146)
                com.fasterxml.jackson.databind.SerializerProvider.handleSecondaryContextualization(SerializerProvider.java:903)
                com.fasterxml.jackson.databind.ser.std.MapSerializer.createContextual(MapSerializer.java:346)
                com.fasterxml.jackson.databind.SerializerProvider.handlePrimaryContextualization(SerializerProvider.java:875)
                com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve(AnyGetterWriter.java:82) */
            anyGetterWriter.resolve(impl);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testResolve11() throws Exception  {
        AttributePropertyWriter attributePropertyWriter = ((AttributePropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter"));
        AnnotatedMethod _member = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(attributePropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
        MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
        MapSerializer _valueSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
        setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueSerializer", _valueSerializer);
        Object _suppressableValue = createInstance("java.lang.Object");
        setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_suppressableValue", _suppressableValue);
        Class anyGetterWriterClazz = Class.forName("com.fasterxml.jackson.databind.ser.AnyGetterWriter");
        Class attributePropertyWriterType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Class annotatedMemberType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
        Class mapSerializerType = Class.forName("com.fasterxml.jackson.databind.ser.std.MapSerializer");
        Constructor anyGetterWriterConstructor = anyGetterWriterClazz.getDeclaredConstructor(attributePropertyWriterType, annotatedMemberType, mapSerializerType);
        anyGetterWriterConstructor.setAccessible(true);
        java.lang.Object[] anyGetterWriterConstructorArguments = new java.lang.Object[3];
        anyGetterWriterConstructorArguments[0] = attributePropertyWriter;
        anyGetterWriterConstructorArguments[1] = ((Object) null);
        anyGetterWriterConstructorArguments[2] = mapSerializer;
        AnyGetterWriter anyGetterWriter = ((AnyGetterWriter) anyGetterWriterConstructor.newInstance(anyGetterWriterConstructorArguments));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.SerializerProvider.findKeySerializer(SerializerProvider.java:740)
            com.fasterxml.jackson.databind.ser.std.MapSerializer.createContextual(MapSerializer.java:352)
            com.fasterxml.jackson.databind.SerializerProvider.handleSecondaryContextualization(SerializerProvider.java:903)
            com.fasterxml.jackson.databind.ser.std.MapSerializer.createContextual(MapSerializer.java:346)
            com.fasterxml.jackson.databind.SerializerProvider.handlePrimaryContextualization(SerializerProvider.java:875)
            com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve(AnyGetterWriter.java:82) */
        anyGetterWriter.resolve(impl);
    }
    
    @Test
    public void testResolve12() throws Exception  {
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
        Class anyGetterWriterClazz = Class.forName("com.fasterxml.jackson.databind.ser.AnyGetterWriter");
        Class objectIdValuePropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Class annotatedMemberType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
        Class mapSerializerType = Class.forName("com.fasterxml.jackson.databind.ser.std.MapSerializer");
        Constructor anyGetterWriterConstructor = anyGetterWriterClazz.getDeclaredConstructor(objectIdValuePropertyType, annotatedMemberType, mapSerializerType);
        anyGetterWriterConstructor.setAccessible(true);
        java.lang.Object[] anyGetterWriterConstructorArguments = new java.lang.Object[3];
        anyGetterWriterConstructorArguments[0] = objectIdValueProperty;
        anyGetterWriterConstructorArguments[1] = ((Object) null);
        anyGetterWriterConstructorArguments[2] = mapSerializer;
        AnyGetterWriter anyGetterWriter = ((AnyGetterWriter) anyGetterWriterConstructor.newInstance(anyGetterWriterConstructorArguments));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.SerializerProvider.findKeySerializer(SerializerProvider.java:740)
            com.fasterxml.jackson.databind.ser.std.MapSerializer.createContextual(MapSerializer.java:352)
            com.fasterxml.jackson.databind.SerializerProvider.handlePrimaryContextualization(SerializerProvider.java:875)
            com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve(AnyGetterWriter.java:82) */
        anyGetterWriter.resolve(impl);
    }
    
    @Test
    public void testResolve13() throws Exception  {
        MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
        MapEntrySerializer _valueSerializer = ((MapEntrySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer"));
        setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueSerializer", _valueSerializer);
        AnyGetterWriter anyGetterWriter = new AnyGetterWriter(null, null, mapSerializer);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.SerializerProvider.findKeySerializer(SerializerProvider.java:740)
            com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer.createContextual(MapEntrySerializer.java:146)
            com.fasterxml.jackson.databind.SerializerProvider.handleSecondaryContextualization(SerializerProvider.java:903)
            com.fasterxml.jackson.databind.ser.std.MapSerializer.createContextual(MapSerializer.java:346)
            com.fasterxml.jackson.databind.SerializerProvider.handlePrimaryContextualization(SerializerProvider.java:875)
            com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve(AnyGetterWriter.java:82) */
        anyGetterWriter.resolve(impl);
    }
    
    @Test
    public void testResolve14() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        AnnotatedConstructor _member = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
        MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
        StdArraySerializers.FloatArraySerializer _keySerializer = ((StdArraySerializers.FloatArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$FloatArraySerializer"));
        setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_keySerializer", _keySerializer);
        TimeZoneSerializer _valueSerializer = ((TimeZoneSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.TimeZoneSerializer"));
        setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueSerializer", _valueSerializer);
        AnyGetterWriter anyGetterWriter = new AnyGetterWriter(beanPropertyWriter, null, mapSerializer);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.MapSerializer.createContextual(MapSerializer.java:378)
            com.fasterxml.jackson.databind.SerializerProvider.handlePrimaryContextualization(SerializerProvider.java:875)
            com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve(AnyGetterWriter.java:82) */
        anyGetterWriter.resolve(impl);
    }
    
    @Test
    public void testResolve15() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
        AnyGetterWriter anyGetterWriter = new AnyGetterWriter(beanPropertyWriter, null, mapSerializer);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.SerializerProvider.findKeySerializer(SerializerProvider.java:740)
            com.fasterxml.jackson.databind.ser.std.MapSerializer.createContextual(MapSerializer.java:352)
            com.fasterxml.jackson.databind.SerializerProvider.handlePrimaryContextualization(SerializerProvider.java:875)
            com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve(AnyGetterWriter.java:82) */
        anyGetterWriter.resolve(impl);
    }
    
    @Test
    public void testResolve16() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueTypeIsStatic", true);
            MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            Class _class = Object.class;
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueType", _valueType);
            MapSerializer _keySerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_keySerializer", _keySerializer);
            AnyGetterWriter anyGetterWriter = new AnyGetterWriter(null, null, mapSerializer);
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.SerializerProvider.findKeySerializer(SerializerProvider.java:740)
                com.fasterxml.jackson.databind.ser.std.MapSerializer.createContextual(MapSerializer.java:352)
                com.fasterxml.jackson.databind.SerializerProvider.handleSecondaryContextualization(SerializerProvider.java:903)
                com.fasterxml.jackson.databind.ser.std.MapSerializer.createContextual(MapSerializer.java:354)
                com.fasterxml.jackson.databind.SerializerProvider.handlePrimaryContextualization(SerializerProvider.java:875)
                com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve(AnyGetterWriter.java:82) */
            anyGetterWriter.resolve(impl);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testResolve17() throws Exception  {
        AttributePropertyWriter attributePropertyWriter = ((AttributePropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter"));
        AnnotatedConstructor _member = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        setField(attributePropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
        MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
        setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueTypeIsStatic", true);
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueType", _valueType);
        Class anyGetterWriterClazz = Class.forName("com.fasterxml.jackson.databind.ser.AnyGetterWriter");
        Class attributePropertyWriterType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Class annotatedMemberType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
        Class mapSerializerType = Class.forName("com.fasterxml.jackson.databind.ser.std.MapSerializer");
        Constructor anyGetterWriterConstructor = anyGetterWriterClazz.getDeclaredConstructor(attributePropertyWriterType, annotatedMemberType, mapSerializerType);
        anyGetterWriterConstructor.setAccessible(true);
        java.lang.Object[] anyGetterWriterConstructorArguments = new java.lang.Object[3];
        anyGetterWriterConstructorArguments[0] = attributePropertyWriter;
        anyGetterWriterConstructorArguments[1] = ((Object) null);
        anyGetterWriterConstructorArguments[2] = mapSerializer;
        AnyGetterWriter anyGetterWriter = ((AnyGetterWriter) anyGetterWriterConstructor.newInstance(anyGetterWriterConstructorArguments));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:503)
            com.fasterxml.jackson.databind.ser.std.MapSerializer.createContextual(MapSerializer.java:343)
            com.fasterxml.jackson.databind.SerializerProvider.handlePrimaryContextualization(SerializerProvider.java:875)
            com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve(AnyGetterWriter.java:82) */
        anyGetterWriter.resolve(impl);
    }
    
    @Test
    public void testResolve18() throws Exception  {
        MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
        setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueTypeIsStatic", true);
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueType", _valueType);
        AnyGetterWriter anyGetterWriter = new AnyGetterWriter(null, null, mapSerializer);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap.untypedValueSerializer(ReadOnlyClassToSerializerMap.java:70)
            com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:503)
            com.fasterxml.jackson.databind.ser.std.MapSerializer.createContextual(MapSerializer.java:343)
            com.fasterxml.jackson.databind.SerializerProvider.handlePrimaryContextualization(SerializerProvider.java:875)
            com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve(AnyGetterWriter.java:82) */
        anyGetterWriter.resolve(impl);
    }
    
    @Test
    public void testResolve19() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueTypeIsStatic", true);
            MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", Integer.MIN_VALUE);
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueType", _valueType);
            AnyGetterWriter anyGetterWriter = new AnyGetterWriter(null, null, mapSerializer);
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
            JsonSerializerMap _map = ((JsonSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap"));
            java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", 39);
            Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket");
            SerializerCache.TypeKey key = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
            setField(bucket, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", "key", key);
            _buckets[38] = bucket;
            setField(_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets", _buckets);
            setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map", _map);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:505)
                com.fasterxml.jackson.databind.ser.std.MapSerializer.createContextual(MapSerializer.java:343)
                com.fasterxml.jackson.databind.SerializerProvider.handlePrimaryContextualization(SerializerProvider.java:875)
                com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve(AnyGetterWriter.java:82) */
            anyGetterWriter.resolve(impl);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testResolve20() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueTypeIsStatic", true);
            CollectionLikeType _valueType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", Integer.MIN_VALUE);
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueType", _valueType);
            AnyGetterWriter anyGetterWriter = new AnyGetterWriter(null, null, mapSerializer);
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
            JsonSerializerMap _map = ((JsonSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap"));
            java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", 39);
            Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket");
            SerializerCache.TypeKey key = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
            setField(bucket, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", "key", key);
            _buckets[38] = bucket;
            setField(_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets", _buckets);
            setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map", _map);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:505)
                com.fasterxml.jackson.databind.ser.std.MapSerializer.createContextual(MapSerializer.java:343)
                com.fasterxml.jackson.databind.SerializerProvider.handlePrimaryContextualization(SerializerProvider.java:875)
                com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve(AnyGetterWriter.java:82) */
            anyGetterWriter.resolve(impl);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testResolve21() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueTypeIsStatic", true);
            MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", Integer.MIN_VALUE);
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueType", _valueType);
            AnyGetterWriter anyGetterWriter = new AnyGetterWriter(null, null, mapSerializer);
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
            JsonSerializerMap _map = ((JsonSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap"));
            java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", 39);
            Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket");
            SerializerCache.TypeKey key = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
            key._isTyped = true;
            setField(bucket, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", "key", key);
            _buckets[38] = bucket;
            setField(_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets", _buckets);
            setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map", _map);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:505)
                com.fasterxml.jackson.databind.ser.std.MapSerializer.createContextual(MapSerializer.java:343)
                com.fasterxml.jackson.databind.SerializerProvider.handlePrimaryContextualization(SerializerProvider.java:875)
                com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve(AnyGetterWriter.java:82) */
            anyGetterWriter.resolve(impl);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testResolve22() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueTypeIsStatic", true);
            MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", Integer.MIN_VALUE);
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueType", _valueType);
            AnyGetterWriter anyGetterWriter = new AnyGetterWriter(null, null, mapSerializer);
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
            JsonSerializerMap _map = ((JsonSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap"));
            java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", 39);
            Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket");
            SerializerCache.TypeKey key = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
            setField(key, "com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey", "_type", _valueType);
            setField(bucket, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", "key", key);
            _buckets[38] = bucket;
            setField(_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets", _buckets);
            setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map", _map);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:505)
                com.fasterxml.jackson.databind.ser.std.MapSerializer.createContextual(MapSerializer.java:343)
                com.fasterxml.jackson.databind.SerializerProvider.handlePrimaryContextualization(SerializerProvider.java:875)
                com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve(AnyGetterWriter.java:82) */
            anyGetterWriter.resolve(impl);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testResolve23() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            Object multiView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView");
            MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
            MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_keyType", _keyType);
            StdKeySerializers.DateKeySerializer _valueSerializer = ((StdKeySerializers.DateKeySerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$DateKeySerializer"));
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueSerializer", _valueSerializer);
            Class anyGetterWriterClazz = Class.forName("com.fasterxml.jackson.databind.ser.AnyGetterWriter");
            Class multiViewType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
            Class annotatedMemberType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
            Class mapSerializerType = Class.forName("com.fasterxml.jackson.databind.ser.std.MapSerializer");
            Constructor anyGetterWriterConstructor = anyGetterWriterClazz.getDeclaredConstructor(multiViewType, annotatedMemberType, mapSerializerType);
            anyGetterWriterConstructor.setAccessible(true);
            java.lang.Object[] anyGetterWriterConstructorArguments = new java.lang.Object[3];
            anyGetterWriterConstructorArguments[0] = multiView;
            anyGetterWriterConstructorArguments[1] = ((Object) null);
            anyGetterWriterConstructorArguments[2] = mapSerializer;
            AnyGetterWriter anyGetterWriter = ((AnyGetterWriter) anyGetterWriterConstructor.newInstance(anyGetterWriterConstructorArguments));
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            BeanSerializerFactory _serializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerFactory", _serializerFactory);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.cfg.MapperConfig.getTypeFactory(MapperConfig.java:256)
                com.fasterxml.jackson.databind.cfg.MapperConfig.constructType(MapperConfig.java:268)
                com.fasterxml.jackson.databind.cfg.MapperConfig.introspectClassAnnotations(MapperConfig.java:298)
                com.fasterxml.jackson.databind.ser.BasicSerializerFactory.createKeySerializer(BasicSerializerFactory.java:209)
                com.fasterxml.jackson.databind.SerializerProvider.findKeySerializer(SerializerProvider.java:740)
                com.fasterxml.jackson.databind.ser.std.MapSerializer.createContextual(MapSerializer.java:352)
                com.fasterxml.jackson.databind.SerializerProvider.handlePrimaryContextualization(SerializerProvider.java:875)
                com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve(AnyGetterWriter.java:82) */
            anyGetterWriter.resolve(impl);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testResolve24() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueTypeIsStatic", true);
            CollectionLikeType _valueType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", Integer.MIN_VALUE);
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueType", _valueType);
            AnyGetterWriter anyGetterWriter = new AnyGetterWriter(null, null, mapSerializer);
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
            JsonSerializerMap _map = ((JsonSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap"));
            java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", 39);
            Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket");
            SerializerCache.TypeKey key = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
            MapType _type = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(key, "com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey", "_type", _type);
            setField(bucket, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", "key", key);
            _buckets[38] = bucket;
            setField(_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets", _buckets);
            setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map", _map);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:505)
                com.fasterxml.jackson.databind.ser.std.MapSerializer.createContextual(MapSerializer.java:343)
                com.fasterxml.jackson.databind.SerializerProvider.handlePrimaryContextualization(SerializerProvider.java:875)
                com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve(AnyGetterWriter.java:82) */
            anyGetterWriter.resolve(impl);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testResolve25() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueTypeIsStatic", true);
            CollectionLikeType _valueType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", Integer.MIN_VALUE);
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueType", _valueType);
            AnyGetterWriter anyGetterWriter = new AnyGetterWriter(null, null, mapSerializer);
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
            JsonSerializerMap _map = ((JsonSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap"));
            java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", 39);
            Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket");
            SerializerCache.TypeKey key = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
            setField(key, "com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey", "_type", _valueType);
            setField(bucket, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", "key", key);
            _buckets[38] = bucket;
            setField(_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets", _buckets);
            setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map", _map);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:505)
                com.fasterxml.jackson.databind.ser.std.MapSerializer.createContextual(MapSerializer.java:343)
                com.fasterxml.jackson.databind.SerializerProvider.handlePrimaryContextualization(SerializerProvider.java:875)
                com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve(AnyGetterWriter.java:82) */
            anyGetterWriter.resolve(impl);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testResolve26() throws Exception  {
        Object multiView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView");
        AnnotatedConstructor _member = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        setField(multiView, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
        MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
        TypeWrappedSerializer _valueSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueSerializer", _valueSerializer);
        Class anyGetterWriterClazz = Class.forName("com.fasterxml.jackson.databind.ser.AnyGetterWriter");
        Class multiViewType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Class annotatedMemberType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
        Class mapSerializerType = Class.forName("com.fasterxml.jackson.databind.ser.std.MapSerializer");
        Constructor anyGetterWriterConstructor = anyGetterWriterClazz.getDeclaredConstructor(multiViewType, annotatedMemberType, mapSerializerType);
        anyGetterWriterConstructor.setAccessible(true);
        java.lang.Object[] anyGetterWriterConstructorArguments = new java.lang.Object[3];
        anyGetterWriterConstructorArguments[0] = multiView;
        anyGetterWriterConstructorArguments[1] = ((Object) null);
        anyGetterWriterConstructorArguments[2] = mapSerializer;
        AnyGetterWriter anyGetterWriter = ((AnyGetterWriter) anyGetterWriterConstructor.newInstance(anyGetterWriterConstructorArguments));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        BeanSerializerFactory _serializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerFactory", _serializerFactory);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.createKeySerializer(BasicSerializerFactory.java:209)
            com.fasterxml.jackson.databind.SerializerProvider.findKeySerializer(SerializerProvider.java:740)
            com.fasterxml.jackson.databind.ser.std.MapSerializer.createContextual(MapSerializer.java:352)
            com.fasterxml.jackson.databind.SerializerProvider.handlePrimaryContextualization(SerializerProvider.java:875)
            com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve(AnyGetterWriter.java:82) */
        anyGetterWriter.resolve(impl);
    }
    
    @Test
    public void testResolve27() throws Exception  {
        ValueInjector valueInjector = new ValueInjector(((PropertyName) null), ((JavaType) null), ((Annotations) null), ((AnnotatedMember) null), ((Object) null));
        MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
        Class anyGetterWriterClazz = Class.forName("com.fasterxml.jackson.databind.ser.AnyGetterWriter");
        Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Class annotatedMemberType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
        Class mapSerializerType = Class.forName("com.fasterxml.jackson.databind.ser.std.MapSerializer");
        Constructor anyGetterWriterConstructor = anyGetterWriterClazz.getDeclaredConstructor(valueInjectorType, annotatedMemberType, mapSerializerType);
        anyGetterWriterConstructor.setAccessible(true);
        java.lang.Object[] anyGetterWriterConstructorArguments = new java.lang.Object[3];
        anyGetterWriterConstructorArguments[0] = valueInjector;
        anyGetterWriterConstructorArguments[1] = ((Object) null);
        anyGetterWriterConstructorArguments[2] = mapSerializer;
        AnyGetterWriter anyGetterWriter = ((AnyGetterWriter) anyGetterWriterConstructor.newInstance(anyGetterWriterConstructorArguments));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.SerializerProvider.findKeySerializer(SerializerProvider.java:740)
            com.fasterxml.jackson.databind.ser.std.MapSerializer.createContextual(MapSerializer.java:352)
            com.fasterxml.jackson.databind.SerializerProvider.handlePrimaryContextualization(SerializerProvider.java:875)
            com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve(AnyGetterWriter.java:82) */
        anyGetterWriter.resolve(impl);
    }
    
    @Test
    public void testResolve28() throws Exception  {
        MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
        setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueTypeIsStatic", true);
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueType", _valueType);
        Object _suppressableValue = createInstance("java.lang.Object");
        setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_suppressableValue", _suppressableValue);
        AnyGetterWriter anyGetterWriter = new AnyGetterWriter(null, null, mapSerializer);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        SerializerCache.TypeKey _cacheKey = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_cacheKey", _cacheKey);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap.untypedValueSerializer(ReadOnlyClassToSerializerMap.java:70)
            com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:503)
            com.fasterxml.jackson.databind.ser.std.MapSerializer.createContextual(MapSerializer.java:343)
            com.fasterxml.jackson.databind.SerializerProvider.handlePrimaryContextualization(SerializerProvider.java:875)
            com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve(AnyGetterWriter.java:82) */
        anyGetterWriter.resolve(impl);
    }
    
    @Test
    public void testResolve29() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            AttributePropertyWriter attributePropertyWriter = ((AttributePropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter"));
            MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueTypeIsStatic", true);
            MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueType", _valueType);
            Class anyGetterWriterClazz = Class.forName("com.fasterxml.jackson.databind.ser.AnyGetterWriter");
            Class attributePropertyWriterType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
            Class annotatedMemberType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
            Class mapSerializerType = Class.forName("com.fasterxml.jackson.databind.ser.std.MapSerializer");
            Constructor anyGetterWriterConstructor = anyGetterWriterClazz.getDeclaredConstructor(attributePropertyWriterType, annotatedMemberType, mapSerializerType);
            anyGetterWriterConstructor.setAccessible(true);
            java.lang.Object[] anyGetterWriterConstructorArguments = new java.lang.Object[3];
            anyGetterWriterConstructorArguments[0] = attributePropertyWriter;
            anyGetterWriterConstructorArguments[1] = ((Object) null);
            anyGetterWriterConstructorArguments[2] = mapSerializer;
            AnyGetterWriter anyGetterWriter = ((AnyGetterWriter) anyGetterWriterConstructor.newInstance(anyGetterWriterConstructorArguments));
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
            SerializerCache.TypeKey _cacheKey = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
            setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_cacheKey", _cacheKey);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap.untypedValueSerializer(ReadOnlyClassToSerializerMap.java:70)
                com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:503)
                com.fasterxml.jackson.databind.ser.std.MapSerializer.createContextual(MapSerializer.java:343)
                com.fasterxml.jackson.databind.SerializerProvider.handlePrimaryContextualization(SerializerProvider.java:875)
                com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve(AnyGetterWriter.java:82) */
            anyGetterWriter.resolve(impl);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testResolve30() throws Exception  {
        MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
        setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueTypeIsStatic", true);
        ArrayType _keyType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_keyType", _keyType);
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueType", _valueType);
        AnyGetterWriter anyGetterWriter = new AnyGetterWriter(null, null, mapSerializer);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        BeanSerializerFactory _serializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerFactory", _serializerFactory);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.MapperConfig.constructType(MapperConfig.java:268)
            com.fasterxml.jackson.databind.cfg.MapperConfig.introspectClassAnnotations(MapperConfig.java:298)
            com.fasterxml.jackson.databind.ser.BasicSerializerFactory.createKeySerializer(BasicSerializerFactory.java:209)
            com.fasterxml.jackson.databind.SerializerProvider.findKeySerializer(SerializerProvider.java:740)
            com.fasterxml.jackson.databind.ser.std.MapSerializer.createContextual(MapSerializer.java:352)
            com.fasterxml.jackson.databind.SerializerProvider.handlePrimaryContextualization(SerializerProvider.java:875)
            com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve(AnyGetterWriter.java:82) */
        anyGetterWriter.resolve(impl);
    }
    
    @Test
    public void testResolve31() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueTypeIsStatic", true);
            MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            Class _class = Object.class;
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_keyType", _keyType);
            MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueType", _valueType);
            AnyGetterWriter anyGetterWriter = new AnyGetterWriter(null, null, mapSerializer);
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
            TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
            setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
            setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            BeanSerializerFactory _serializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerFactory", _serializerFactory);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.type.TypeFactory._fromClass(TypeFactory.java:747)
                com.fasterxml.jackson.databind.type.TypeFactory._constructType(TypeFactory.java:386)
                com.fasterxml.jackson.databind.type.TypeFactory.constructType(TypeFactory.java:358)
                com.fasterxml.jackson.databind.cfg.MapperConfig.constructType(MapperConfig.java:268)
                com.fasterxml.jackson.databind.cfg.MapperConfig.introspectClassAnnotations(MapperConfig.java:298)
                com.fasterxml.jackson.databind.ser.BasicSerializerFactory.createKeySerializer(BasicSerializerFactory.java:209)
                com.fasterxml.jackson.databind.SerializerProvider.findKeySerializer(SerializerProvider.java:740)
                com.fasterxml.jackson.databind.ser.std.MapSerializer.createContextual(MapSerializer.java:352)
                com.fasterxml.jackson.databind.SerializerProvider.handlePrimaryContextualization(SerializerProvider.java:875)
                com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve(AnyGetterWriter.java:82) */
            anyGetterWriter.resolve(impl);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testResolve32() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueTypeIsStatic", true);
            MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", Integer.MIN_VALUE);
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueType", _valueType);
            AnyGetterWriter anyGetterWriter = new AnyGetterWriter(null, null, mapSerializer);
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
            JsonSerializerMap _map = ((JsonSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap"));
            java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", 39);
            Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket");
            _buckets[38] = bucket;
            setField(_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets", _buckets);
            setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map", _map);
            SerializerCache.TypeKey _cacheKey = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
            setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_cacheKey", _cacheKey);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:505)
                com.fasterxml.jackson.databind.ser.std.MapSerializer.createContextual(MapSerializer.java:343)
                com.fasterxml.jackson.databind.SerializerProvider.handlePrimaryContextualization(SerializerProvider.java:875)
                com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve(AnyGetterWriter.java:82) */
            anyGetterWriter.resolve(impl);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testResolve33() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueTypeIsStatic", true);
            MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", Integer.MIN_VALUE);
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueType", _valueType);
            AnyGetterWriter anyGetterWriter = new AnyGetterWriter(null, null, mapSerializer);
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
            JsonSerializerMap _map = ((JsonSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap"));
            java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", 39);
            setField(_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets", _buckets);
            setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map", _map);
            SerializerCache.TypeKey _cacheKey = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
            setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_cacheKey", _cacheKey);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:505)
                com.fasterxml.jackson.databind.ser.std.MapSerializer.createContextual(MapSerializer.java:343)
                com.fasterxml.jackson.databind.SerializerProvider.handlePrimaryContextualization(SerializerProvider.java:875)
                com.fasterxml.jackson.databind.ser.AnyGetterWriter.resolve(AnyGetterWriter.java:82) */
            anyGetterWriter.resolve(impl);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method resolve(com.fasterxml.jackson.databind.SerializerProvider)
    
    @Test(expected = IllegalArgumentException.class)
    public void testResolve34() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
            MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_keyType", _keyType);
            TypeWrappedSerializer _valueSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueSerializer", _valueSerializer);
            AnyGetterWriter anyGetterWriter = new AnyGetterWriter(null, null, mapSerializer);
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
            TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
            setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
            setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            BeanSerializerFactory _serializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerFactory", _serializerFactory);
            
            anyGetterWriter.resolve(impl);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testResolve35() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
            MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_keyType", _keyType);
            AnyGetterWriter anyGetterWriter = new AnyGetterWriter(null, null, mapSerializer);
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
            TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
            setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
            setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            BeanSerializerFactory _serializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerFactory", _serializerFactory);
            
            anyGetterWriter.resolve(impl);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testResolve36() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueTypeIsStatic", true);
            MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_keyType", _keyType);
            MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            Class _class = Object.class;
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueType", _valueType);
            AnyGetterWriter anyGetterWriter = new AnyGetterWriter(null, null, mapSerializer);
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
            TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
            setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
            setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            BeanSerializerFactory _serializerFactory = ((BeanSerializerFactory) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializerFactory"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerFactory", _serializerFactory);
            
            anyGetterWriter.resolve(impl);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testResolve37() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueTypeIsStatic", true);
            MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", Integer.MIN_VALUE);
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueType", _valueType);
            AnyGetterWriter anyGetterWriter = new AnyGetterWriter(null, null, mapSerializer);
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            SerializerCache _serializerCache = ((SerializerCache) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache", _serializerCache);
            ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
            JsonSerializerMap _map = ((JsonSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap"));
            java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", 39);
            Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket");
            _buckets[38] = bucket;
            setField(_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets", _buckets);
            setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map", _map);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
            
            anyGetterWriter.resolve(impl);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testResolve38() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueTypeIsStatic", true);
            MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", Integer.MIN_VALUE);
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueType", _valueType);
            AnyGetterWriter anyGetterWriter = new AnyGetterWriter(null, null, mapSerializer);
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            SerializerCache _serializerCache = ((SerializerCache) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache", _serializerCache);
            ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
            JsonSerializerMap _map = ((JsonSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap"));
            java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", 39);
            setField(_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets", _buckets);
            setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map", _map);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
            
            anyGetterWriter.resolve(impl);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method resolve(com.fasterxml.jackson.databind.SerializerProvider)
    
    @Test(timeout = 1000L)
    public void testResolve39() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueTypeIsStatic", true);
            CollectionLikeType _valueType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", Integer.MIN_VALUE);
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueType", _valueType);
            AnyGetterWriter anyGetterWriter = new AnyGetterWriter(null, null, mapSerializer);
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
            JsonSerializerMap _map = ((JsonSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap"));
            java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", 39);
            Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket");
            SerializerCache.TypeKey key = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
            setField(bucket, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", "key", key);
            setField(bucket, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", "next", bucket);
            _buckets[38] = bucket;
            setField(_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets", _buckets);
            setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map", _map);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
            
            /* This execution may take longer than the 1000 ms timeout
             and therefore fail due to exceeding the timeout. */
            anyGetterWriter.resolve(impl);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test(timeout = 1000L)
    public void testResolve40() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueTypeIsStatic", true);
            MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", Integer.MIN_VALUE);
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueType", _valueType);
            AnyGetterWriter anyGetterWriter = new AnyGetterWriter(null, null, mapSerializer);
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
            JsonSerializerMap _map = ((JsonSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap"));
            java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", 39);
            Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket");
            SerializerCache.TypeKey key = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
            key._isTyped = true;
            setField(bucket, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", "key", key);
            setField(bucket, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", "next", bucket);
            _buckets[38] = bucket;
            setField(_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets", _buckets);
            setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map", _map);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
            
            /* This execution may take longer than the 1000 ms timeout
             and therefore fail due to exceeding the timeout. */
            anyGetterWriter.resolve(impl);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test(timeout = 1000L)
    public void testResolve41() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            MapSerializer mapSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueTypeIsStatic", true);
            MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", Integer.MIN_VALUE);
            setField(mapSerializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueType", _valueType);
            AnyGetterWriter anyGetterWriter = new AnyGetterWriter(null, null, mapSerializer);
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
            JsonSerializerMap _map = ((JsonSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap"));
            java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", 39);
            Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket");
            setField(bucket, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", "next", bucket);
            _buckets[38] = bucket;
            setField(_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets", _buckets);
            setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map", _map);
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
            
            /* This execution may take longer than the 1000 ms timeout
             and therefore fail due to exceeding the timeout. */
            anyGetterWriter.resolve(impl);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.AnyGetterWriter.getAndSerialize
    
    ///region Errors report for getAndSerialize
    
    public void testGetAndSerialize_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 13 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Field
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.AnyGetterWriter.getAndFilter
    
    ///region Errors report for getAndFilter
    
    public void testGetAndFilter_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 14 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Field
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1064530693335800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1064530693335800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1064530693340400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1064530693335800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1064530693340400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1064530693731000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1064530693731000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1064530693732700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1064530693731000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1064530693732700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object[] createArray(String className, int length, Object... values) throws ClassNotFoundException {
        Object array = java.lang.reflect.Array.newInstance(Class.forName(className), length);
    
        for (int i = 0; i < values.length; i++) {
            java.lang.reflect.Array.set(array, i, values[i]);
        }
        
        return (Object[]) array;
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

