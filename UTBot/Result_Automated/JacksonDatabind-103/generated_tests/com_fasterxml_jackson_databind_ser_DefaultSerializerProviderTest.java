package com.fasterxml.jackson.databind.ser;

import org.junit.Test;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;
import java.util.Map;
import java.util.ArrayList;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap;
import java.text.DateFormat;
import com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.SimpleType;
import java.io.IOException;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import java.lang.reflect.Method;
import java.util.InvalidPropertiesFormatException;
import java.util.List;
import java.util.LinkedList;
import java.io.Closeable;
import com.fasterxml.jackson.core.JsonLocation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertFalse;

public final class com_fasterxml_jackson_databind_ser_DefaultSerializerProviderTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.copy
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method copy()
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#copy()}
     */
    @Test
    public void testCopy() throws Exception  {
        DefaultSerializerProvider.Impl impl = new DefaultSerializerProvider.Impl();
        DefaultSerializerProvider.Impl impl1 = new DefaultSerializerProvider.Impl(impl);
        
        DefaultSerializerProvider.Impl actual = ((DefaultSerializerProvider.Impl) impl1.copy());
        
        DefaultSerializerProvider.Impl expected = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializerCache _serializerCache = ((SerializerCache) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache"));
        HashMap _sharedMap = new HashMap();
        setField(_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_sharedMap", _sharedMap);
        AtomicReference _readOnlyMap = ((AtomicReference) createInstance("java.util.concurrent.atomic.AtomicReference"));
        setField(_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_readOnlyMap", _readOnlyMap);
        setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache", _serializerCache);
        UnknownSerializer _unknownTypeSerializer = ((UnknownSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer"));
        Class _handledType = Object.class;
        setField(_unknownTypeSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
        setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_unknownTypeSerializer", _unknownTypeSerializer);
        NullSerializer _nullValueSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        setField(_nullValueSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
        setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer", _nullValueSerializer);
        FailingSerializer _nullKeySerializer = ((FailingSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.FailingSerializer"));
        String _msg = "Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)";
        setField(_nullKeySerializer, "com.fasterxml.jackson.databind.ser.impl.FailingSerializer", "_msg", _msg);
        setField(_nullKeySerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
        setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_nullKeySerializer", _nullKeySerializer);
        setField(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_stdNullValueSerializer", true);
        
        Map actual_seenObjectIds = actual._seenObjectIds;
        assertNull(actual_seenObjectIds);
        
        ArrayList actual_objectIdGenerators = actual._objectIdGenerators;
        assertNull(actual_objectIdGenerators);
        
        JsonGenerator actual_generator = actual._generator;
        assertNull(actual_generator);
        
        SerializationConfig actual_config = ((SerializationConfig) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_config"));
        assertNull(actual_config);
        
        Class actual_serializationView = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_serializationView"));
        assertNull(actual_serializationView);
        
        SerializerFactory actual_serializerFactory = ((SerializerFactory) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerFactory"));
        assertNull(actual_serializerFactory);
        
        SerializerCache expected_serializerCache = ((SerializerCache) getFieldValue(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache"));
        SerializerCache actual_serializerCache = ((SerializerCache) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache"));
        HashMap expected_serializerCache_sharedMap = ((HashMap) getFieldValue(expected_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_sharedMap"));
        HashMap actual_serializerCache_sharedMap = ((HashMap) getFieldValue(actual_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_sharedMap"));
        assertTrue(deepEquals(expected_serializerCache_sharedMap, actual_serializerCache_sharedMap));
        
        AtomicReference expected_serializerCache_readOnlyMap = ((AtomicReference) getFieldValue(expected_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_readOnlyMap"));
        AtomicReference actual_serializerCache_readOnlyMap = ((AtomicReference) getFieldValue(actual_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_readOnlyMap"));
        
        ContextAttributes actual_attributes = ((ContextAttributes) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_attributes"));
        assertNull(actual_attributes);
        
        JsonSerializer expected_unknownTypeSerializer = ((JsonSerializer) getFieldValue(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_unknownTypeSerializer"));
        JsonSerializer actual_unknownTypeSerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_unknownTypeSerializer"));
        Class expected_unknownTypeSerializer_handledType = ((Class) getFieldValue(expected_unknownTypeSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
        Class actual_unknownTypeSerializer_handledType = ((Class) getFieldValue(actual_unknownTypeSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
        assertEquals(Class.class, actual_unknownTypeSerializer_handledType.getClass());
        
        JsonSerializer actual_keySerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_keySerializer"));
        assertNull(actual_keySerializer);
        
        JsonSerializer expected_nullValueSerializer = ((JsonSerializer) getFieldValue(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer"));
        JsonSerializer actual_nullValueSerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer"));
        assertTrue(deepEquals(expected_nullValueSerializer, actual_nullValueSerializer));
        
        JsonSerializer expected_nullKeySerializer = ((JsonSerializer) getFieldValue(expected, "com.fasterxml.jackson.databind.SerializerProvider", "_nullKeySerializer"));
        JsonSerializer actual_nullKeySerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_nullKeySerializer"));
        String expected_nullKeySerializer_msg = ((String) getFieldValue(expected_nullKeySerializer, "com.fasterxml.jackson.databind.ser.impl.FailingSerializer", "_msg"));
        String actual_nullKeySerializer_msg = ((String) getFieldValue(actual_nullKeySerializer, "com.fasterxml.jackson.databind.ser.impl.FailingSerializer", "_msg"));
        assertEquals(expected_nullKeySerializer_msg, actual_nullKeySerializer_msg);
        
        assertTrue(deepEquals(expected_nullKeySerializer, actual_nullKeySerializer));
        
        ReadOnlyClassToSerializerMap actual_knownSerializers = ((ReadOnlyClassToSerializerMap) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        assertNull(actual_knownSerializers);
        
        DateFormat actual_dateFormat = ((DateFormat) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_dateFormat"));
        assertNull(actual_dateFormat);
        
        boolean actual_stdNullValueSerializer = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.SerializerProvider", "_stdNullValueSerializer"));
        assertTrue(actual_stdNullValueSerializer);
        
    }
    ///endregion
    
    ///region Errors report for copy
    
    public void testCopy_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* There is no instantiatable inheritor of the class under test
        that does not override a method given for testing */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.generateJsonSchema
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method generateJsonSchema(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#generateJsonSchema(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#findValueSerializer(java.lang.Class,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JsonSerializer<Object> ser = findValueSerializer(type, null);
 *  */
    @Test
    public void testGenerateJsonSchema_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", 1);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_mask", 128);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.generateJsonSchema] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap.untypedValueSerializer(ReadOnlyClassToSerializerMap.java:119)
            com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:501)
            com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.generateJsonSchema(DefaultSerializerProvider.java:585) */
        impl.generateJsonSchema(class1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.hasSerializerFor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasSerializerFor(java.lang.Class, java.util.concurrent.atomic.AtomicReference)
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#hasSerializerFor(java.lang.Class,java.util.concurrent.atomic.AtomicReference)}
 * @utbot.executesCondition {@code (cls): True}
 * @utbot.executesCondition {@code (!_config.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS)): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializationConfig#isEnabled(com.fasterxml.jackson.databind.SerializationFeature)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testHasSerializerFor_Not_configIsEnabled() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", -255);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        Class class1 = Object.class;
        
        boolean actual = impl.hasSerializerFor(class1, null);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#hasSerializerFor(java.lang.Class,java.util.concurrent.atomic.AtomicReference)}
 * @utbot.executesCondition {@code (cls): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#_findExplicitUntypedSerializer(java.lang.Class)}
 * @utbot.returnsFrom {@code return (ser != null);}
 *  */
    @Test
    public void testHasSerializerFor_SerNotEqualsNull() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", 4);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", 9);
        Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket");
        TypeWrappedSerializer value = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        setField(bucket, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", "value", value);
        Class _class = Object.class;
        setField(bucket, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", "_class", _class);
        _buckets[0] = bucket;
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets", _buckets);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        
        ReadOnlyClassToSerializerMap impl_knownSerializers = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers_knownSerializers_buckets = getFieldValue(impl_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object impl_knownSerializers_knownSerializers_buckets_knownSerializers_buckets0 = get(impl_knownSerializers_knownSerializers_buckets, 0);
        Class initialImpl_knownSerializers_buckets0_class = ((Class) getFieldValue(impl_knownSerializers_knownSerializers_buckets_knownSerializers_buckets0, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", "_class"));
        
        boolean actual = impl.hasSerializerFor(_class, null);
        
        assertTrue(actual);
        
        ReadOnlyClassToSerializerMap impl_knownSerializers1 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers1_knownSerializers_buckets = getFieldValue(impl_knownSerializers1, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object impl_knownSerializers1_knownSerializers_buckets_knownSerializers_buckets0 = get(impl_knownSerializers1_knownSerializers_buckets, 0);
        Class finalImpl_knownSerializers_buckets0_class = ((Class) getFieldValue(impl_knownSerializers1_knownSerializers_buckets_knownSerializers_buckets0, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", "_class"));
        ReadOnlyClassToSerializerMap impl_knownSerializers2 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers2_knownSerializers_buckets = getFieldValue(impl_knownSerializers2, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets1 = get(impl_knownSerializers2_knownSerializers_buckets, 1);
        ReadOnlyClassToSerializerMap impl_knownSerializers3 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers3_knownSerializers_buckets = getFieldValue(impl_knownSerializers3, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets2 = get(impl_knownSerializers3_knownSerializers_buckets, 2);
        ReadOnlyClassToSerializerMap impl_knownSerializers4 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers4_knownSerializers_buckets = getFieldValue(impl_knownSerializers4, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets3 = get(impl_knownSerializers4_knownSerializers_buckets, 3);
        ReadOnlyClassToSerializerMap impl_knownSerializers5 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers5_knownSerializers_buckets = getFieldValue(impl_knownSerializers5, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets4 = get(impl_knownSerializers5_knownSerializers_buckets, 4);
        ReadOnlyClassToSerializerMap impl_knownSerializers6 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers6_knownSerializers_buckets = getFieldValue(impl_knownSerializers6, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets5 = get(impl_knownSerializers6_knownSerializers_buckets, 5);
        ReadOnlyClassToSerializerMap impl_knownSerializers7 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers7_knownSerializers_buckets = getFieldValue(impl_knownSerializers7, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets6 = get(impl_knownSerializers7_knownSerializers_buckets, 6);
        ReadOnlyClassToSerializerMap impl_knownSerializers8 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers8_knownSerializers_buckets = getFieldValue(impl_knownSerializers8, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets7 = get(impl_knownSerializers8_knownSerializers_buckets, 7);
        ReadOnlyClassToSerializerMap impl_knownSerializers9 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers9_knownSerializers_buckets = getFieldValue(impl_knownSerializers9, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets8 = get(impl_knownSerializers9_knownSerializers_buckets, 8);
        
        Class final_class = _class;
        
        assertFalse(initialImpl_knownSerializers_buckets0_class == finalImpl_knownSerializers_buckets0_class);
        
        assertNull(finalImpl_knownSerializers_buckets1);
        
        assertNull(finalImpl_knownSerializers_buckets2);
        
        assertNull(finalImpl_knownSerializers_buckets3);
        
        assertNull(finalImpl_knownSerializers_buckets4);
        
        assertNull(finalImpl_knownSerializers_buckets5);
        
        assertNull(finalImpl_knownSerializers_buckets6);
        
        assertNull(finalImpl_knownSerializers_buckets7);
        
        assertNull(finalImpl_knownSerializers_buckets8);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasSerializerFor(java.lang.Class, java.util.concurrent.atomic.AtomicReference)
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#hasSerializerFor(java.lang.Class,java.util.concurrent.atomic.AtomicReference)}
 * @utbot.executesCondition {@code (cls): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializationConfig#isEnabled(com.fasterxml.jackson.databind.SerializationFeature)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !_config.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS)
 *  */
    @Test
    public void testHasSerializerFor_ThrowNullPointerException() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.hasSerializerFor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.hasSerializerFor(DefaultSerializerProvider.java:254) */
        impl.hasSerializerFor(class1, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializeValue
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method serializeValue(com.fasterxml.jackson.core.JsonGenerator, java.lang.Object, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonSerializer)
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.executesCondition {@code (rootType != null): False}
 * @utbot.executesCondition {@code (ser == null): False}
 * @utbot.executesCondition {@code (rootName == null): False}
 * @utbot.executesCondition {@code (!rootName.isEmpty()): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializationConfig#getFullRootName()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.PropertyName#isEmpty()}
 * @utbot.invokes com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#_serialize(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.PropertyName)
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} in: _serialize(gen, value, ser, rootName);
 *  */
    @Test(expected = JsonMappingException.class)
    public void testSerializeValue_ThrowJsonMappingException() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        PropertyName _rootName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _namespace = "";
        setField(_rootName, "com.fasterxml.jackson.databind.PropertyName", "_namespace", _namespace);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName", _rootName);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        byte[] byteArray = {};
        TypeWrappedSerializer typeWrappedSerializer = new TypeWrappedSerializer(null, null);
        
        impl.serializeValue(null, byteArray, null, typeWrappedSerializer);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method serializeValue(com.fasterxml.jackson.core.JsonGenerator, java.lang.Object, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonSerializer)
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (rootType != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: (rootType != null) && !rootType.getRawClass().isAssignableFrom(value.getClass())
 *  */
    @Test
    public void testSerializeValue_ThrowNullPointerException_1() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        byte[] byteArray = {};
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializeValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializeValue(DefaultSerializerProvider.java:380) */
        impl.serializeValue(null, byteArray, simpleType, null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (rootType != null): False}
 * @utbot.executesCondition {@code (ser == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: PropertyName rootName = _config.getFullRootName();
 *  */
    @Test
    public void testSerializeValue_ThrowNullPointerException() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        byte[] byteArray = {};
        TypeWrappedSerializer typeWrappedSerializer = new TypeWrappedSerializer(null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializeValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializeValue(DefaultSerializerProvider.java:387) */
        impl.serializeValue(null, byteArray, null, typeWrappedSerializer);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (rootType != null): True}
 * @utbot.executesCondition {@code (!rootType.getRawClass().isAssignableFrom(value.getClass())): False}
 * @utbot.executesCondition {@code (ser == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: PropertyName rootName = _config.getFullRootName();
 *  */
    @Test
    public void testSerializeValue_ThrowNullPointerException_2() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        byte[] byteArray = {};
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        TypeWrappedSerializer typeWrappedSerializer = new TypeWrappedSerializer(null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializeValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializeValue(DefaultSerializerProvider.java:387) */
        impl.serializeValue(null, byteArray, simpleType, typeWrappedSerializer);
    }
    ///endregion
    
    ///region FUZZER: CHECKED EXCEPTIONS for method serializeValue(com.fasterxml.jackson.core.JsonGenerator, java.lang.Object, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonSerializer)
    
    @Test(expected = JsonMappingException.class)
    public void testSerializeValueByFuzzer() throws IOException  {
        DefaultSerializerProvider.Impl impl = new DefaultSerializerProvider.Impl();
        DefaultSerializerProvider.Impl impl1 = new DefaultSerializerProvider.Impl(impl);
        
        impl1.serializeValue(null, null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializeValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method serializeValue(com.fasterxml.jackson.core.JsonGenerator, java.lang.Object, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (!rootType.getRawClass().isAssignableFrom(value.getClass())): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#findTypedValueSerializer(com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JsonSerializer<Object> ser = findTypedValueSerializer(rootType, true, null);
 *  */
    @Test
    public void testSerializeValue_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", 1);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_mask", 1073741824);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        byte[] byteArray = {};
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializeValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap.typedValueSerializer(ReadOnlyClassToSerializerMap.java:68)
            com.fasterxml.jackson.databind.SerializerProvider.findTypedValueSerializer(SerializerProvider.java:747)
            com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializeValue(DefaultSerializerProvider.java:345) */
        impl.serializeValue(null, byteArray, simpleType);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !rootType.getRawClass().isAssignableFrom(value.getClass())
 *  */
    @Test
    public void testSerializeValue_ThrowNullPointerException1() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        WriterBasedJsonGenerator _generator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(impl, "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "_generator", _generator);
        int[] intArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializeValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializeValue(DefaultSerializerProvider.java:341) */
        impl.serializeValue(null, intArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !rootType.getRawClass().isAssignableFrom(value.getClass())
 *  */
    @Test
    public void testSerializeValue_ThrowNullPointerException_11() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        byte[] byteArray = {};
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializeValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializeValue(DefaultSerializerProvider.java:341) */
        impl.serializeValue(null, byteArray, simpleType);
    }
    ///endregion
    
    ///region FUZZER: CHECKED EXCEPTIONS for method serializeValue(com.fasterxml.jackson.core.JsonGenerator, java.lang.Object, com.fasterxml.jackson.databind.JavaType)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType)}
     */
    @Test(expected = JsonMappingException.class)
    public void testSerializeValueThrowsJME() throws IOException  {
        DefaultSerializerProvider.Impl impl = new DefaultSerializerProvider.Impl();
        DefaultSerializerProvider.Impl impl1 = new DefaultSerializerProvider.Impl(impl);
        
        impl1.serializeValue(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializeValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method serializeValue(com.fasterxml.jackson.core.JsonGenerator, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#findTypedValueSerializer(java.lang.Class,boolean,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final JsonSerializer<Object> ser = findTypedValueSerializer(cls, true, null);
 *  */
    @Test
    public void testSerializeValue_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", 0);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets", _buckets);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializeValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap.typedValueSerializer(ReadOnlyClassToSerializerMap.java:85)
            com.fasterxml.jackson.databind.SerializerProvider.findTypedValueSerializer(SerializerProvider.java:702)
            com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializeValue(DefaultSerializerProvider.java:308) */
        impl.serializeValue(null, byteArray);
    }
    ///endregion
    
    ///region FUZZER: CHECKED EXCEPTIONS for method serializeValue(com.fasterxml.jackson.core.JsonGenerator, java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#serializeValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object)}
     */
    @Test(expected = JsonMappingException.class)
    public void testSerializeValueThrowsJME1() throws IOException  {
        DefaultSerializerProvider.Impl impl = new DefaultSerializerProvider.Impl();
        DefaultSerializerProvider.Impl impl1 = new DefaultSerializerProvider.Impl(impl);
        
        impl1.serializeValue(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.acceptJsonFormatVisitor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method acceptJsonFormatVisitor(com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)}
 * @utbot.executesCondition {@code (javaType == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper#setProvider(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#findValueSerializer(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonSerializer#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_JavaTypeNotEqualsNull() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", 10);
        Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket");
        NullSerializer value = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        setField(bucket, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", "value", value);
        CollectionType _type = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(_type, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
        setField(bucket, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", "_type", _type);
        _buckets[1] = bucket;
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_mask", 1);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        DefaultSerializerProvider.Impl _provider = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        setField(anonymousBase, "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper$Base", "_provider", _provider);
        
        SerializerProvider initialAnonymousBase_provider = ((SerializerProvider) getFieldValue(anonymousBase, "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper$Base", "_provider"));
        
        impl.acceptJsonFormatVisitor(_type, anonymousBase);
        
        ReadOnlyClassToSerializerMap impl_knownSerializers = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers_knownSerializers_buckets = getFieldValue(impl_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets0 = get(impl_knownSerializers_knownSerializers_buckets, 0);
        ReadOnlyClassToSerializerMap impl_knownSerializers1 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers1_knownSerializers_buckets = getFieldValue(impl_knownSerializers1, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets2 = get(impl_knownSerializers1_knownSerializers_buckets, 2);
        ReadOnlyClassToSerializerMap impl_knownSerializers2 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers2_knownSerializers_buckets = getFieldValue(impl_knownSerializers2, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets3 = get(impl_knownSerializers2_knownSerializers_buckets, 3);
        ReadOnlyClassToSerializerMap impl_knownSerializers3 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers3_knownSerializers_buckets = getFieldValue(impl_knownSerializers3, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets4 = get(impl_knownSerializers3_knownSerializers_buckets, 4);
        ReadOnlyClassToSerializerMap impl_knownSerializers4 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers4_knownSerializers_buckets = getFieldValue(impl_knownSerializers4, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets5 = get(impl_knownSerializers4_knownSerializers_buckets, 5);
        ReadOnlyClassToSerializerMap impl_knownSerializers5 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers5_knownSerializers_buckets = getFieldValue(impl_knownSerializers5, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets6 = get(impl_knownSerializers5_knownSerializers_buckets, 6);
        ReadOnlyClassToSerializerMap impl_knownSerializers6 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers6_knownSerializers_buckets = getFieldValue(impl_knownSerializers6, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets7 = get(impl_knownSerializers6_knownSerializers_buckets, 7);
        ReadOnlyClassToSerializerMap impl_knownSerializers7 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers7_knownSerializers_buckets = getFieldValue(impl_knownSerializers7, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets8 = get(impl_knownSerializers7_knownSerializers_buckets, 8);
        ReadOnlyClassToSerializerMap impl_knownSerializers8 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers8_knownSerializers_buckets = getFieldValue(impl_knownSerializers8, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets9 = get(impl_knownSerializers8_knownSerializers_buckets, 9);
        
        SerializerProvider finalAnonymousBase_provider = ((SerializerProvider) getFieldValue(anonymousBase, "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper$Base", "_provider"));
        
        assertNull(finalImpl_knownSerializers_buckets0);
        
        assertNull(finalImpl_knownSerializers_buckets2);
        
        assertNull(finalImpl_knownSerializers_buckets3);
        
        assertNull(finalImpl_knownSerializers_buckets4);
        
        assertNull(finalImpl_knownSerializers_buckets5);
        
        assertNull(finalImpl_knownSerializers_buckets6);
        
        assertNull(finalImpl_knownSerializers_buckets7);
        
        assertNull(finalImpl_knownSerializers_buckets8);
        
        assertNull(finalImpl_knownSerializers_buckets9);
        
        assertFalse(initialAnonymousBase_provider == finalAnonymousBase_provider);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method acceptJsonFormatVisitor(com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)}
 * @utbot.executesCondition {@code (javaType == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: javaType == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAcceptJsonFormatVisitor_ThrowIllegalArgumentException() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        impl.acceptJsonFormatVisitor(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method acceptJsonFormatVisitor(com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper#setProvider(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#findValueSerializer(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: findValueSerializer(javaType, null).acceptJsonFormatVisitor(visitor, javaType);
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", 1);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_mask", 1073741824);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.JavaType", "_hash", -254);
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.acceptJsonFormatVisitor] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap.untypedValueSerializer(ReadOnlyClassToSerializerMap.java:102)
            com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:547)
            com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.acceptJsonFormatVisitor(DefaultSerializerProvider.java:566) */
        impl.acceptJsonFormatVisitor(resolvedRecursiveType, anonymousBase);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper#setProvider(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: visitor.setProvider(this);
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_ThrowNullPointerException() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.acceptJsonFormatVisitor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.acceptJsonFormatVisitor(DefaultSerializerProvider.java:565) */
        impl.acceptJsonFormatVisitor(resolvedRecursiveType, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.includeFilterSuppressNulls
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method includeFilterSuppressNulls(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#includeFilterSuppressNulls(java.lang.Object)}
 * @utbot.executesCondition {@code (filter == null): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIncludeFilterSuppressNulls_FilterEqualsNull() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        boolean actual = impl.includeFilterSuppressNulls(null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#includeFilterSuppressNulls(java.lang.Object)}
 * @utbot.executesCondition {@code (filter == null): False}
 * @utbot.invokes {@link java.lang.Object#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return filter.equals(null);}
 *  */
    @Test
    public void testIncludeFilterSuppressNulls_FilterNotEqualsNull() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        Integer integer = 0;
        
        boolean actual = impl.includeFilterSuppressNulls(integer);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.includeFilterInstance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method includeFilterInstance(com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#includeFilterInstance(com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,java.lang.Class)}
 * @utbot.executesCondition {@code (filterClass == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testIncludeFilterInstance_FilterClassEqualsNull() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        Object actual = impl.includeFilterInstance(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method includeFilterInstance(com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#includeFilterInstance(com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,java.lang.Class)}
 * @utbot.executesCondition {@code (filterClass == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializationConfig#getHandlerInstantiator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: HandlerInstantiator hi = _config.getHandlerInstantiator();
 *  */
    @Test
    public void testIncludeFilterInstance_ThrowNullPointerException() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.includeFilterInstance] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.includeFilterInstance(DefaultSerializerProvider.java:149) */
        impl.includeFilterInstance(null, class1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method includeFilterInstance(com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition, java.lang.Class)
    
    @Test
    public void testIncludeFilterInstance1() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        SimpleBeanPropertyDefinition simpleBeanPropertyDefinition = ((SimpleBeanPropertyDefinition) createInstance("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Class class1 = Object.class;
        
        Object actual = impl.includeFilterInstance(simpleBeanPropertyDefinition, class1);
        
        Object expected = new Object();
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method includeFilterInstance(com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition, java.lang.Class)
    
    @Test(expected = IllegalArgumentException.class)
    public void testIncludeFilterInstance2() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4096);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        SimpleBeanPropertyDefinition simpleBeanPropertyDefinition = ((SimpleBeanPropertyDefinition) createInstance("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Class class1 = Object.class;
        
        impl.includeFilterInstance(simpleBeanPropertyDefinition, class1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.flushCachedSerializers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method flushCachedSerializers()
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#flushCachedSerializers()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.SerializerCache#flush()}
 *  */
    @Test
    public void testFlushCachedSerializers_SerializerCacheFlush() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializerCache _serializerCache = ((SerializerCache) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache"));
        HashMap _sharedMap = new HashMap();
        setField(_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_sharedMap", _sharedMap);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache", _serializerCache);
        
        impl.flushCachedSerializers();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method flushCachedSerializers()
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#flushCachedSerializers()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.SerializerCache#flush()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _serializerCache.flush();
 *  */
    @Test
    public void testFlushCachedSerializers_ThrowNullPointerException() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.flushCachedSerializers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.flushCachedSerializers(DefaultSerializerProvider.java:540) */
        impl.flushCachedSerializers();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializePolymorphic
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method serializePolymorphic(com.fasterxml.jackson.core.JsonGenerator, java.lang.Object, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsontype.TypeSerializer)
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#serializePolymorphic(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer)}
 * @utbot.executesCondition {@code (rootType != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: (rootType != null) && !rootType.getRawClass().isAssignableFrom(value.getClass())
 *  */
    @Test
    public void testSerializePolymorphic_ThrowNullPointerException_2() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        int[] intArray = {};
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializePolymorphic] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializePolymorphic(DefaultSerializerProvider.java:419) */
        impl.serializePolymorphic(null, intArray, simpleType, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#serializePolymorphic(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer)}
 * @utbot.executesCondition {@code (rootType != null): False}
 * @utbot.executesCondition {@code (valueSer == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: PropertyName rootName = _config.getFullRootName();
 *  */
    @Test
    public void testSerializePolymorphic_ThrowNullPointerException() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        byte[] byteArray = {};
        TypeWrappedSerializer typeWrappedSerializer = new TypeWrappedSerializer(null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializePolymorphic] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializePolymorphic(DefaultSerializerProvider.java:436) */
        impl.serializePolymorphic(null, byteArray, null, typeWrappedSerializer, null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#serializePolymorphic(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer)}
 * @utbot.executesCondition {@code (rootType != null): True}
 * @utbot.executesCondition {@code (!rootType.getRawClass().isAssignableFrom(value.getClass())): False}
 * @utbot.executesCondition {@code (valueSer == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: PropertyName rootName = _config.getFullRootName();
 *  */
    @Test
    public void testSerializePolymorphic_ThrowNullPointerException_3() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        short[] shortArray = {};
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        TypeWrappedSerializer typeWrappedSerializer = new TypeWrappedSerializer(null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializePolymorphic] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializePolymorphic(DefaultSerializerProvider.java:436) */
        impl.serializePolymorphic(null, shortArray, simpleType, typeWrappedSerializer, null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#serializePolymorphic(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer)}
 * @utbot.executesCondition {@code (rootType != null): False}
 * @utbot.executesCondition {@code (valueSer == null): False}
 * @utbot.executesCondition {@code (rootName == null): False}
 * @utbot.executesCondition {@code (rootName.isEmpty()): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializationConfig#getFullRootName()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.PropertyName#isEmpty()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator#writeStartObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: gen.writeStartObject();
 *  */
    @Test
    public void testSerializePolymorphic_ThrowNullPointerException_1() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        PropertyName _rootName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _namespace = "";
        setField(_rootName, "com.fasterxml.jackson.databind.PropertyName", "_namespace", _namespace);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName", _rootName);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        int[] intArray = {};
        TypeWrappedSerializer typeWrappedSerializer = new TypeWrappedSerializer(null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializePolymorphic] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializePolymorphic(DefaultSerializerProvider.java:448) */
        impl.serializePolymorphic(null, intArray, null, typeWrappedSerializer, null);
    }
    ///endregion
    
    ///region FUZZER: CHECKED EXCEPTIONS for method serializePolymorphic(com.fasterxml.jackson.core.JsonGenerator, java.lang.Object, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsontype.TypeSerializer)
    
    @Test(expected = JsonMappingException.class)
    public void testSerializePolymorphicByFuzzer() throws IOException  {
        DefaultSerializerProvider.Impl impl = new DefaultSerializerProvider.Impl();
        DefaultSerializerProvider.Impl impl1 = new DefaultSerializerProvider.Impl(impl);
        
        impl1.serializePolymorphic(null, null, null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.cachedSerializersCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method cachedSerializersCount()
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#cachedSerializersCount()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.SerializerCache#size()}
 * @utbot.returnsFrom {@code return _serializerCache.size();}
 *  */
    @Test
    public void testCachedSerializersCount_SerializerCacheSize() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializerCache _serializerCache = ((SerializerCache) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache"));
        HashMap _sharedMap = new HashMap();
        setField(_serializerCache, "com.fasterxml.jackson.databind.ser.SerializerCache", "_sharedMap", _sharedMap);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache", _serializerCache);
        
        int actual = impl.cachedSerializersCount();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method cachedSerializersCount()
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#cachedSerializersCount()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.SerializerCache#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _serializerCache.size();
 *  */
    @Test
    public void testCachedSerializersCount_ThrowNullPointerException() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.cachedSerializersCount] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.cachedSerializersCount(DefaultSerializerProvider.java:530) */
        impl.cachedSerializersCount();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializerInstance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method serializerInstance(com.fasterxml.jackson.databind.introspect.Annotated, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#serializerInstance(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object)}
 * @utbot.executesCondition {@code (serDef == null): True}
 *  */
    @Test
    public void testSerializerInstance_SerDefEqualsNull() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        JsonSerializer actual = impl.serializerInstance(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method serializerInstance(com.fasterxml.jackson.databind.introspect.Annotated, java.lang.Object)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (serDef == null): False},
    ///     {@code (serDef instanceof JsonSerializer): True}
    /// invoke:
    ///     {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#_handleResolvable(com.fasterxml.jackson.databind.JsonSerializer)} twice
    /// return from: {@code return (JsonSerializer<Object>) _handleResolvable(ser);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#serializerInstance(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object)}
 * @utbot.returnsFrom {@code return (JsonSerializer<Object>) _handleResolvable(ser);}
 *  */
    @Test
    public void testSerializerInstance_Return_handleResolvableSer() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        NullSerializer nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        
        NullSerializer actual = ((NullSerializer) impl.serializerInstance(null, nullSerializer));
        
        Class actual_handledType = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
        assertNull(actual_handledType);
        
    }
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#serializerInstance(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object)}
 * @utbot.returnsFrom {@code return (JsonSerializer<Object>) _handleResolvable(ser);}
 *  */
    @Test
    public void testSerializerInstance_Return_handleResolvableSer_1() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        
        StdDelegatingSerializer actual = ((StdDelegatingSerializer) impl.serializerInstance(null, stdDelegatingSerializer));
        
        Converter actual_converter = ((Converter) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_converter"));
        assertNull(actual_converter);
        
        JavaType actual_delegateType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateType"));
        assertNull(actual_delegateType);
        
        JsonSerializer actual_delegateSerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer"));
        assertNull(actual_delegateSerializer);
        
        Class actual_handledType = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
        assertNull(actual_handledType);
        
    }
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#serializerInstance(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object)}
 * @utbot.returnsFrom {@code return (JsonSerializer<Object>) _handleResolvable(ser);}
 *  */
    @Test
    public void testSerializerInstance_Return_handleResolvableSer_2() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        StdKeySerializers.Default _delegateSerializer = ((StdKeySerializers.Default) createInstance("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default"));
        setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
        
        StdDelegatingSerializer actual = ((StdDelegatingSerializer) impl.serializerInstance(null, stdDelegatingSerializer));
        
        Converter actual_converter = ((Converter) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_converter"));
        assertNull(actual_converter);
        
        JavaType actual_delegateType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateType"));
        assertNull(actual_delegateType);
        
        JsonSerializer stdDelegatingSerializer_delegateSerializer = ((JsonSerializer) getFieldValue(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer"));
        JsonSerializer actual_delegateSerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer"));
        int stdDelegatingSerializer_delegateSerializer_typeId = ((Integer) getFieldValue(stdDelegatingSerializer_delegateSerializer, "com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default", "_typeId"));
        int actual_delegateSerializer_typeId = ((Integer) getFieldValue(actual_delegateSerializer, "com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default", "_typeId"));
        assertEquals(stdDelegatingSerializer_delegateSerializer_typeId, actual_delegateSerializer_typeId);
        
        Class actual_delegateSerializer_handledType = ((Class) getFieldValue(actual_delegateSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
        assertNull(actual_delegateSerializer_handledType);
        
        assertTrue(deepEquals(stdDelegatingSerializer, actual));
    }
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#serializerInstance(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object)}
 * @utbot.returnsFrom {@code return (JsonSerializer<Object>) _handleResolvable(ser);}
 *  */
    @Test
    public void testSerializerInstance_Return_handleResolvableSer_3() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        StdDelegatingSerializer _delegateSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
        
        StdDelegatingSerializer actual = ((StdDelegatingSerializer) impl.serializerInstance(null, stdDelegatingSerializer));
        
        Converter actual_converter = ((Converter) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_converter"));
        assertNull(actual_converter);
        
        JavaType actual_delegateType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateType"));
        assertNull(actual_delegateType);
        
        JsonSerializer stdDelegatingSerializer_delegateSerializer = ((JsonSerializer) getFieldValue(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer"));
        JsonSerializer actual_delegateSerializer = ((JsonSerializer) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer"));
        assertTrue(deepEquals(stdDelegatingSerializer_delegateSerializer, actual_delegateSerializer));
        assertTrue(deepEquals(stdDelegatingSerializer_delegateSerializer, actual_delegateSerializer));
        JsonSerializer actual_delegateSerializer_delegateSerializer = ((JsonSerializer) getFieldValue(actual_delegateSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer"));
        assertNull(actual_delegateSerializer_delegateSerializer);
        
        Class actual_delegateSerializer_handledType = ((Class) getFieldValue(actual_delegateSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
        assertNull(actual_delegateSerializer_handledType);
        
        assertTrue(deepEquals(stdDelegatingSerializer, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method serializerInstance(com.fasterxml.jackson.databind.introspect.Annotated, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#serializerInstance(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object)}
 * @utbot.executesCondition {@code (!(serDef instanceof Class)): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.Annotated#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: reportBadDefinition(annotated.getType(), "AnnotationIntrospector returned serializer definition of type " + serDef.getClass().getName() + "; expected type JsonSerializer or Class<JsonSerializer> instead");
 *  */
    @Test
    public void testSerializerInstance_ThrowNullPointerException() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        short[] shortArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializerInstance] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializerInstance(DefaultSerializerProvider.java:118) */
        impl.serializerInstance(null, shortArray);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#serializerInstance(com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object)}
 * @utbot.executesCondition {@code (!(serDef instanceof Class)): False}
 * @utbot.executesCondition {@code (serClass): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return null;
 *  */
    @Test
    public void testSerializerInstance_ThrowNullPointerException_1() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializerInstance] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializerInstance(DefaultSerializerProvider.java:128) */
        impl.serializerInstance(null, class1);
    }
    ///endregion
    
    ///region Errors report for serializerInstance
    
    public void testSerializerInstance_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.visitor.Reifier.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.visitor" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.getGenerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getGenerator()
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#getGenerator()}
 * @utbot.returnsFrom {@code return _generator;}
 *  */
    @Test
    public void testGetGenerator_Return_generator() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        JsonGenerator actual = impl.getGenerator();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.DefaultSerializerProvider._createObjectIdMap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _createObjectIdMap()
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#_createObjectIdMap()}
 * @utbot.executesCondition {@code (isEnabled(SerializationFeature.USE_EQUALITY_FOR_OBJECT_ID)): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#isEnabled(com.fasterxml.jackson.databind.SerializationFeature)}
 * @utbot.returnsFrom {@code return new HashMap<Object, WritableObjectId>();}
 *  */
    @Test
    public void test_createObjectIdMap_IsEnabled() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", 4194304);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        HashMap actual = ((HashMap) impl._createObjectIdMap());
        
        HashMap expected = new HashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method _createObjectIdMap()
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#_createObjectIdMap()}
     */
    @Test
    public void test_createObjectIdMapThrowsNPE() {
        DefaultSerializerProvider.Impl impl = new DefaultSerializerProvider.Impl();
        DefaultSerializerProvider.Impl impl1 = new DefaultSerializerProvider.Impl(impl);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.DefaultSerializerProvider._createObjectIdMap] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.SerializerProvider.isEnabled(SerializerProvider.java:423)
            com.fasterxml.jackson.databind.ser.DefaultSerializerProvider._createObjectIdMap(DefaultSerializerProvider.java:229) */
        impl1._createObjectIdMap();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.findObjectId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findObjectId(java.lang.Object, com.fasterxml.jackson.annotation.ObjectIdGenerator)
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#findObjectId(java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator)}
 * @utbot.executesCondition {@code (_seenObjectIds == null): False}
 * @utbot.executesCondition {@code (oid != null): True}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return oid;}
 *  */
    @Test
    public void testFindObjectId_OidNotEqualsNull() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        LinkedHashMap _seenObjectIds = new LinkedHashMap();
        Integer integer = 0;
        WritableObjectId writableObjectId = ((WritableObjectId) createInstance("com.fasterxml.jackson.databind.ser.impl.WritableObjectId"));
        _seenObjectIds.put(integer, writableObjectId);
        setField(impl, "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "_seenObjectIds", _seenObjectIds);
        Integer integer1 = 0;
        
        WritableObjectId actual = impl.findObjectId(integer1, null);
        
        ObjectIdGenerator actualGenerator = actual.generator;
        assertNull(actualGenerator);
        
        Object actualId = actual.id;
        assertNull(actualId);
        
        boolean actualIdWritten = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "idWritten"));
        assertFalse(actualIdWritten);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findObjectId(java.lang.Object, com.fasterxml.jackson.annotation.ObjectIdGenerator)
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#findObjectId(java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator)}
 * @utbot.executesCondition {@code (_seenObjectIds == null): False}
 * @utbot.executesCondition {@code (oid != null): False}
 * @utbot.executesCondition {@code (_objectIdGenerators == null): True}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: generator = generatorType.newForSerialization(this);
 *  */
    @Test
    public void testFindObjectId_ThrowNullPointerException_2() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        LinkedHashMap _seenObjectIds = new LinkedHashMap();
        setField(impl, "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "_seenObjectIds", _seenObjectIds);
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.findObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.findObjectId(DefaultSerializerProvider.java:209) */
        impl.findObjectId(byteArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#findObjectId(java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator)}
 * @utbot.executesCondition {@code (_seenObjectIds == null): True}
 * @utbot.executesCondition {@code (_objectIdGenerators == null): False}
 * @utbot.invokes {@link java.util.ArrayList#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: generator = generatorType.newForSerialization(this);
 *  */
    @Test
    public void testFindObjectId_ThrowNullPointerException() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ArrayList _objectIdGenerators = new ArrayList();
        impl._objectIdGenerators = _objectIdGenerators;
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", 4194304);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.findObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.findObjectId(DefaultSerializerProvider.java:209) */
        impl.findObjectId(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#findObjectId(java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator)}
 * @utbot.executesCondition {@code (_seenObjectIds == null): True}
 * @utbot.executesCondition {@code (_objectIdGenerators == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: generator = generatorType.newForSerialization(this);
 *  */
    @Test
    public void testFindObjectId_ThrowNullPointerException_1() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", 4194304);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.findObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.findObjectId(DefaultSerializerProvider.java:209) */
        impl.findObjectId(null, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method findObjectId(java.lang.Object, com.fasterxml.jackson.annotation.ObjectIdGenerator)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#findObjectId(java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator)}
     */
    @Test
    public void testFindObjectIdThrowsNPE() {
        DefaultSerializerProvider.Impl impl = new DefaultSerializerProvider.Impl();
        DefaultSerializerProvider.Impl impl1 = new DefaultSerializerProvider.Impl(impl);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.findObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.SerializerProvider.isEnabled(SerializerProvider.java:423)
            com.fasterxml.jackson.databind.ser.DefaultSerializerProvider._createObjectIdMap(DefaultSerializerProvider.java:229)
            com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.findObjectId(DefaultSerializerProvider.java:187) */
        impl1.findObjectId(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.DefaultSerializerProvider._serializeNull
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method _serializeNull(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#_serializeNull(com.fasterxml.jackson.core.JsonGenerator)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#getDefaultNullValueSerializer()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonSerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.invokes com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#_wrapAsIOE(com.fasterxml.jackson.core.JsonGenerator,java.lang.Exception)
 * @utbot.caughtException {@code Exception e}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} in:  catch (Exception e) {
 *     throw _wrapAsIOE(gen, e);
 * }
 *  */
    @Test(expected = JsonMappingException.class)
    public void test_serializeNull_ThrowJsonMappingException() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        impl._serializeNull(null);
    }
    ///endregion
    
    ///region FUZZER: CHECKED EXCEPTIONS for method _serializeNull(com.fasterxml.jackson.core.JsonGenerator)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#_serializeNull(com.fasterxml.jackson.core.JsonGenerator)}
     */
    @Test(expected = JsonMappingException.class)
    public void test_serializeNullThrowsJME() throws IOException  {
        DefaultSerializerProvider.Impl impl = new DefaultSerializerProvider.Impl();
        DefaultSerializerProvider.Impl impl1 = new DefaultSerializerProvider.Impl(impl);
        
        impl1._serializeNull(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.DefaultSerializerProvider._serialize
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method _serialize(com.fasterxml.jackson.core.JsonGenerator, java.lang.Object, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.PropertyName)
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#_serialize(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator#writeStartObject()}
 * @utbot.invokes com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#_wrapAsIOE(com.fasterxml.jackson.core.JsonGenerator,java.lang.Exception)
 * @utbot.caughtException {@code Exception e}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} in:  catch (Exception e) {
 *     throw _wrapAsIOE(gen, e);
 * }
 *  */
    @Test(expected = JsonMappingException.class)
    public void test_serialize_ThrowJsonMappingException() throws Throwable  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        Class defaultSerializerProviderClazz = Class.forName("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider");
        Class jsonGeneratorType = Class.forName("com.fasterxml.jackson.core.JsonGenerator");
        Class objectType = Class.forName("java.lang.Object");
        Class jsonSerializerType = Class.forName("com.fasterxml.jackson.databind.JsonSerializer");
        Class propertyNameType = Class.forName("com.fasterxml.jackson.databind.PropertyName");
        Method _serializeMethod = defaultSerializerProviderClazz.getDeclaredMethod("_serialize", jsonGeneratorType, objectType, jsonSerializerType, propertyNameType);
        _serializeMethod.setAccessible(true);
        java.lang.Object[] _serializeMethodArguments = new java.lang.Object[4];
        _serializeMethodArguments[0] = ((Object) null);
        _serializeMethodArguments[1] = ((Object) null);
        _serializeMethodArguments[2] = ((Object) null);
        _serializeMethodArguments[3] = ((Object) null);
        try {
            _serializeMethod.invoke(impl, _serializeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.DefaultSerializerProvider._serialize
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method _serialize(com.fasterxml.jackson.core.JsonGenerator, java.lang.Object, com.fasterxml.jackson.databind.JsonSerializer)
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#_serialize(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonSerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.invokes com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#_wrapAsIOE(com.fasterxml.jackson.core.JsonGenerator,java.lang.Exception)
 * @utbot.caughtException {@code Exception e}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} in:  catch (Exception e) {
 *     throw _wrapAsIOE(gen, e);
 * }
 *  */
    @Test(expected = JsonMappingException.class)
    public void test_serialize_ThrowJsonMappingException1() throws Throwable  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        Class defaultSerializerProviderClazz = Class.forName("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider");
        Class jsonGeneratorType = Class.forName("com.fasterxml.jackson.core.JsonGenerator");
        Class objectType = Class.forName("java.lang.Object");
        Class jsonSerializerType = Class.forName("com.fasterxml.jackson.databind.JsonSerializer");
        Method _serializeMethod = defaultSerializerProviderClazz.getDeclaredMethod("_serialize", jsonGeneratorType, objectType, jsonSerializerType);
        _serializeMethod.setAccessible(true);
        java.lang.Object[] _serializeMethodArguments = new java.lang.Object[3];
        _serializeMethodArguments[0] = ((Object) null);
        _serializeMethodArguments[1] = ((Object) null);
        _serializeMethodArguments[2] = ((Object) null);
        try {
            _serializeMethod.invoke(impl, _serializeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.DefaultSerializerProvider._wrapAsIOE
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _wrapAsIOE(com.fasterxml.jackson.core.JsonGenerator, java.lang.Exception)
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#_wrapAsIOE(com.fasterxml.jackson.core.JsonGenerator,java.lang.Exception)}
 * @utbot.executesCondition {@code (e instanceof IOException): True}
 * @utbot.returnsFrom {@code return (IOException) e;}
 *  */
    @Test
    public void test_wrapAsIOE_EInstanceOfIOException() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        InvalidPropertiesFormatException invalidPropertiesFormatException = ((InvalidPropertiesFormatException) createInstance("java.util.InvalidPropertiesFormatException"));
        
        Class defaultSerializerProviderClazz = Class.forName("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider");
        Class jsonGeneratorType = Class.forName("com.fasterxml.jackson.core.JsonGenerator");
        Class invalidPropertiesFormatExceptionType = Class.forName("java.lang.Exception");
        Method _wrapAsIOEMethod = defaultSerializerProviderClazz.getDeclaredMethod("_wrapAsIOE", jsonGeneratorType, invalidPropertiesFormatExceptionType);
        _wrapAsIOEMethod.setAccessible(true);
        java.lang.Object[] _wrapAsIOEMethodArguments = new java.lang.Object[2];
        _wrapAsIOEMethodArguments[0] = ((Object) null);
        _wrapAsIOEMethodArguments[1] = invalidPropertiesFormatException;
        InvalidPropertiesFormatException actual = ((InvalidPropertiesFormatException) _wrapAsIOEMethod.invoke(impl, _wrapAsIOEMethodArguments));
        
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        assertNull(actualBacktrace);
        
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertNull(actualDetailMessage);
        
        Throwable actualCause = actual.getCause();
        assertNull(actualCause);
        
        java.lang.StackTraceElement[] actualStackTrace = actual.getStackTrace();
        assertNull(actualStackTrace);
        
        int invalidPropertiesFormatExceptionDepth = ((Integer) getFieldValue(invalidPropertiesFormatException, "java.lang.Throwable", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "java.lang.Throwable", "depth"));
        assertEquals(invalidPropertiesFormatExceptionDepth, actualDepth);
        
        List actualSuppressedExceptions = ((List) getFieldValue(actual, "java.lang.Throwable", "suppressedExceptions"));
        assertNull(actualSuppressedExceptions);
        
    }
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#_wrapAsIOE(com.fasterxml.jackson.core.JsonGenerator,java.lang.Exception)}
 * @utbot.executesCondition {@code (e instanceof IOException): False}
 * @utbot.executesCondition {@code (msg == null): False}
 * @utbot.invokes {@link java.lang.Exception#getMessage()}
 * @utbot.returnsFrom {@code return new JsonMappingException(g, msg, e);}
 *  */
    @Test
    public void test_wrapAsIOE_MsgNotEqualsNull() throws Exception  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        NumberFormatException numberFormatException = ((NumberFormatException) createInstance("java.lang.NumberFormatException"));
        String detailMessage = "";
        setField(numberFormatException, "java.lang.Throwable", "detailMessage", detailMessage);
        
        Class defaultSerializerProviderClazz = Class.forName("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider");
        Class jsonGeneratorType = Class.forName("com.fasterxml.jackson.core.JsonGenerator");
        Class numberFormatExceptionType = Class.forName("java.lang.Exception");
        Method _wrapAsIOEMethod = defaultSerializerProviderClazz.getDeclaredMethod("_wrapAsIOE", jsonGeneratorType, numberFormatExceptionType);
        _wrapAsIOEMethod.setAccessible(true);
        java.lang.Object[] _wrapAsIOEMethodArguments = new java.lang.Object[2];
        _wrapAsIOEMethodArguments[0] = ((Object) null);
        _wrapAsIOEMethodArguments[1] = numberFormatException;
        JsonMappingException actual = ((JsonMappingException) _wrapAsIOEMethod.invoke(impl, _wrapAsIOEMethodArguments));
        
        JsonMappingException expected = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        java.lang.Object[] backtrace = new java.lang.Object[6];
        short[] shortArray = new short[32];
        shortArray[0] = (short) 16;
        shortArray[1] = (short) 4;
        shortArray[5] = (short) 2;
        shortArray[11] = (short) 1;
        shortArray[12] = (short) 8;
        shortArray[13] = (short) 4;
        shortArray[14] = (short) 2;
        shortArray[15] = (short) 3;
        shortArray[16] = (short) 5;
        shortArray[17] = (short) 1;
        shortArray[18] = (short) 6;
        shortArray[19] = (short) 6;
        shortArray[21] = (short) 1;
        shortArray[22] = (short) 1;
        shortArray[23] = (short) 2;
        shortArray[28] = (short) 1;
        shortArray[29] = (short) 1;
        backtrace[0] = ((Object) shortArray);
        int[] intArray = new int[32];
        intArray[0] = 24903680;
        intArray[1] = 1;
        intArray[2] = 8716289;
        intArray[3] = 393216;
        intArray[4] = 3866632;
        intArray[5] = 4456448;
        intArray[6] = 327680;
        intArray[7] = 524288;
        intArray[8] = 262144;
        intArray[9] = 262144;
        intArray[10] = 262144;
        intArray[11] = 262144;
        intArray[12] = 851976;
        intArray[13] = 3997696;
        intArray[14] = 7536640;
        intArray[15] = 11993088;
        intArray[16] = 3538944;
        intArray[17] = 4128768;
        intArray[18] = 720896;
        intArray[19] = 28573696;
        intArray[20] = 393216;
        intArray[21] = 2097152;
        intArray[22] = 1900544;
        intArray[23] = 11927552;
        intArray[24] = 327680;
        intArray[25] = 3735552;
        intArray[26] = 1310720;
        intArray[27] = 2949120;
        intArray[28] = 65536;
        intArray[29] = 262144;
        backtrace[1] = ((Object) intArray);
        java.lang.Object[] objectArray = new java.lang.Object[32];
        objectArray[0] = ((Object) defaultSerializerProviderClazz);
        Class class1 = Class.forName("jdk.internal.reflect.NativeMethodAccessorImpl");
        objectArray[1] = ((Object) class1);
        objectArray[2] = ((Object) class1);
        Class class2 = Class.forName("jdk.internal.reflect.DelegatingMethodAccessorImpl");
        objectArray[3] = ((Object) class2);
        Class class3 = Method.class;
        objectArray[4] = ((Object) class3);
        Class class4 = Class.forName("org.utbot.instrumentation.instrumentation.InvokeInstrumentation$invoke$2$result$1");
        objectArray[5] = ((Object) class4);
        objectArray[6] = ((Object) class4);
        Class class5 = Class.forName("org.utbot.instrumentation.process.SecurityKt$runSandbox$1$1");
        objectArray[7] = ((Object) class5);
        Class class6 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$1");
        objectArray[8] = ((Object) class6);
        Class class7 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$2");
        objectArray[9] = ((Object) class7);
        Class class8 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$3");
        objectArray[10] = ((Object) class8);
        Class class9 = Class.forName("org.utbot.instrumentation.process.SecurityKt$sandbox$4");
        objectArray[11] = ((Object) class9);
        Class class10 = java.security.AccessController.class;
        objectArray[12] = ((Object) class10);
        Class class11 = org.utbot.instrumentation.process.SecurityKt.class;
        objectArray[13] = ((Object) class11);
        objectArray[14] = ((Object) class11);
        objectArray[15] = ((Object) class11);
        objectArray[16] = ((Object) class11);
        objectArray[17] = ((Object) class11);
        objectArray[18] = ((Object) class11);
        Class class12 = org.utbot.instrumentation.instrumentation.InvokeInstrumentation.class;
        objectArray[19] = ((Object) class12);
        objectArray[20] = ((Object) class12);
        Class class13 = org.utbot.instrumentation.instrumentation.Instrumentation.DefaultImpls.class;
        objectArray[21] = ((Object) class13);
        Class class14 = org.utbot.instrumentation.instrumentation.execution.phases.InvocationPhase.class;
        objectArray[22] = ((Object) class14);
        Class class15 = Class.forName("org.utbot.instrumentation.instrumentation.execution.SimpleUtExecutionInstrumentation$invoke$1$1$concreteResult$1");
        objectArray[23] = ((Object) class15);
        objectArray[24] = ((Object) class15);
        Class class16 = Class.forName("org.utbot.instrumentation.instrumentation.execution.phases.PhasesController$executePhaseInTimeout$1$result$1");
        objectArray[25] = ((Object) class16);
        Class class17 = Class.forName("org.utbot.common.ThreadBasedExecutor$invokeWithTimeout$1");
        objectArray[26] = ((Object) class17);
        Class class18 = Class.forName("org.utbot.common.ThreadBasedExecutor$ensureThreadIsAlive$1");
        objectArray[27] = ((Object) class18);
        objectArray[28] = ((Object) class18);
        Class class19 = Class.forName("kotlin.concurrent.ThreadsKt$thread$thread$1");
        objectArray[29] = ((Object) class19);
        backtrace[2] = objectArray;
        long[] longArray = new long[32];
        longArray[0] = 1892467563520L;
        longArray[1] = 1891300815024L;
        longArray[2] = 1891300089856L;
        longArray[3] = 1891300089856L;
        longArray[4] = 1891300089856L;
        longArray[5] = 1892475202624L;
        longArray[6] = 1891300089856L;
        longArray[7] = 1891300089856L;
        longArray[8] = 1891300089856L;
        longArray[9] = 1891300089856L;
        longArray[10] = 1891300089856L;
        longArray[11] = 1891300097224L;
        longArray[12] = 1891300137968L;
        longArray[13] = 1892454002944L;
        longArray[14] = 1892454002944L;
        longArray[15] = 1892454002944L;
        longArray[16] = 1892454002944L;
        longArray[17] = 1892454002688L;
        longArray[18] = 1892454003712L;
        longArray[19] = 1892476680864L;
        longArray[20] = 1891300089856L;
        longArray[21] = 1892457393024L;
        longArray[22] = 1892484879664L;
        longArray[23] = 1892475202624L;
        longArray[24] = 1891300089856L;
        longArray[25] = 1891300089856L;
        longArray[26] = 1891300089856L;
        longArray[27] = 1891300089856L;
        longArray[28] = 1891300089856L;
        longArray[29] = 1891300097224L;
        backtrace[3] = ((Object) longArray);
        setField(expected, "java.lang.Throwable", "backtrace", backtrace);
        setField(expected, "java.lang.Throwable", "detailMessage", detailMessage);
        setField(expected, "java.lang.Throwable", "cause", numberFormatException);
        java.lang.StackTraceElement[] stackTrace = {};
        expected.setStackTrace(stackTrace);
        setField(expected, "java.lang.Throwable", "depth", 30);
        List suppressedExceptions = new ArrayList();
        setField(expected, "java.lang.Throwable", "suppressedExceptions", suppressedExceptions);
        
        LinkedList actual_path = ((LinkedList) getFieldValue(actual, "com.fasterxml.jackson.databind.JsonMappingException", "_path"));
        assertNull(actual_path);
        
        Closeable actual_processor = ((Closeable) getFieldValue(actual, "com.fasterxml.jackson.databind.JsonMappingException", "_processor"));
        assertNull(actual_processor);
        
        JsonLocation actual_location = ((JsonLocation) getFieldValue(actual, "com.fasterxml.jackson.core.JsonProcessingException", "_location"));
        assertNull(actual_location);
        
        Object expectedBacktrace = getFieldValue(expected, "java.lang.Throwable", "backtrace");
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        int expectedBacktraceSize = getArrayLength(expectedBacktrace);
        assertEquals(expectedBacktraceSize, getArrayLength(actualBacktrace));
        assertTrue(deepEquals(expectedBacktrace, actualBacktrace));
        
        String expectedDetailMessage = ((String) getFieldValue(expected, "java.lang.Throwable", "detailMessage"));
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertEquals(expectedDetailMessage, actualDetailMessage);
        
        Throwable expectedCause = expected.getCause();
        Throwable actualCause = actual.getCause();
        Object actualCauseBacktrace = getFieldValue(actualCause, "java.lang.Throwable", "backtrace");
        assertNull(actualCauseBacktrace);
        
        assertTrue(deepEquals(expectedCause, actualCause));
        Throwable actualCauseCause = actualCause.getCause();
        assertNull(actualCauseCause);
        
        java.lang.StackTraceElement[] actualCauseStackTrace = actualCause.getStackTrace();
        assertNull(actualCauseStackTrace);
        
        int expectedCauseDepth = ((Integer) getFieldValue(expectedCause, "java.lang.Throwable", "depth"));
        int actualCauseDepth = ((Integer) getFieldValue(actualCause, "java.lang.Throwable", "depth"));
        assertEquals(expectedCauseDepth, actualCauseDepth);
        
        List actualCauseSuppressedExceptions = ((List) getFieldValue(actualCause, "java.lang.Throwable", "suppressedExceptions"));
        assertNull(actualCauseSuppressedExceptions);
        
        java.lang.StackTraceElement[] expectedStackTrace = expected.getStackTrace();
        java.lang.StackTraceElement[] actualStackTrace = actual.getStackTrace();
        int expectedStackTraceSize = expectedStackTrace.length;
        assertEquals(expectedStackTraceSize, actualStackTrace.length);
        assertTrue(deepEquals(expectedStackTrace, actualStackTrace));
        
        int expectedDepth = ((Integer) getFieldValue(expected, "java.lang.Throwable", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "java.lang.Throwable", "depth"));
        assertEquals(expectedDepth, actualDepth);
        
        List expectedSuppressedExceptions = ((List) getFieldValue(expected, "java.lang.Throwable", "suppressedExceptions"));
        List actualSuppressedExceptions = ((List) getFieldValue(actual, "java.lang.Throwable", "suppressedExceptions"));
        assertTrue(deepEquals(expectedSuppressedExceptions, actualSuppressedExceptions));
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _wrapAsIOE(com.fasterxml.jackson.core.JsonGenerator, java.lang.Exception)
    
    /**
    @utbot.classUnderTest {@link DefaultSerializerProvider}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.DefaultSerializerProvider#_wrapAsIOE(com.fasterxml.jackson.core.JsonGenerator,java.lang.Exception)}
 * @utbot.executesCondition {@code (e instanceof IOException): False}
 * @utbot.invokes {@link java.lang.Exception#getMessage()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String msg = e.getMessage();
 *  */
    @Test
    public void test_wrapAsIOE_ThrowNullPointerException() throws Throwable  {
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.DefaultSerializerProvider._wrapAsIOE] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.DefaultSerializerProvider._wrapAsIOE(DefaultSerializerProvider.java:505) */
        Class defaultSerializerProviderClazz = Class.forName("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider");
        Class jsonGeneratorType = Class.forName("com.fasterxml.jackson.core.JsonGenerator");
        Class exceptionType = Class.forName("java.lang.Exception");
        Method _wrapAsIOEMethod = defaultSerializerProviderClazz.getDeclaredMethod("_wrapAsIOE", jsonGeneratorType, exceptionType);
        _wrapAsIOEMethod.setAccessible(true);
        java.lang.Object[] _wrapAsIOEMethodArguments = new java.lang.Object[2];
        _wrapAsIOEMethodArguments[0] = ((Object) null);
        _wrapAsIOEMethodArguments[1] = ((Object) null);
        try {
            _wrapAsIOEMethod.invoke(impl, _wrapAsIOEMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1092119933437200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1092119933437200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1092119933446400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1092119933437200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1092119933446400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1092119933932700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1092119933932700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1092119933936300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1092119933932700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1092119933936300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object[] createArray(String className, int length, Object... values) throws ClassNotFoundException {
        Object array = java.lang.reflect.Array.newInstance(Class.forName(className), length);
    
        for (int i = 0; i < values.length; i++) {
            java.lang.reflect.Array.set(array, i, values[i]);
        }
        
        return (Object[]) array;
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

