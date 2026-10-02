package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers.AtomicReferenceSerializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.CalendarKeySerializer;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import com.fasterxml.jackson.databind.ser.AnyGetterWriter;
import com.fasterxml.jackson.databind.ser.BeanSerializer;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.databind.node.TextNode;
import com.fasterxml.jackson.databind.ser.impl.StringArraySerializer;
import com.fasterxml.jackson.databind.node.BooleanNode;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers.DoubleArraySerializer;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap;
import com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap;
import com.fasterxml.jackson.databind.ser.SerializerCache.TypeKey;
import com.fasterxml.jackson.databind.ser.SerializerCache;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.type.ArrayType;
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

import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public final class com_fasterxml_jackson_databind_ser_std_StdDelegatingSerializerTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer.resolve
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method resolve(com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#resolve(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_delegateSerializer != null): True}
 * @utbot.executesCondition {@code (_delegateSerializer instanceof ResolvableSerializer): False}
 *  */
    @Test
    public void testResolve_Not_delegateSerializerNotInstanceOfResolvableSerializer() throws Exception  {
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        NullSerializer _delegateSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
        
        stdDelegatingSerializer.resolve(null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#resolve(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_delegateSerializer != null): False}
 *  */
    @Test
    public void testResolve__delegateSerializerEqualsNull() throws Exception  {
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        
        stdDelegatingSerializer.resolve(null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#resolve(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_delegateSerializer != null): True}
 * @utbot.executesCondition {@code (_delegateSerializer instanceof ResolvableSerializer): True}
 *  */
    @Test
    public void testResolve__delegateSerializerInstanceOfResolvableSerializer_3() throws Exception  {
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        BeanAsArraySerializer _delegateSerializer = ((BeanAsArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
        UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
        StdJdkSerializers.AtomicReferenceSerializer _serializer = ((StdJdkSerializers.AtomicReferenceSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicReferenceSerializer"));
        setField(unwrappingBeanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_serializer", _serializer);
        DateSerializer _nullSerializer = ((DateSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.DateSerializer"));
        setField(unwrappingBeanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        _props[0] = ((BeanPropertyWriter) unwrappingBeanPropertyWriter);
        setField(_delegateSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = {null};
        setField(_delegateSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
        
        stdDelegatingSerializer.resolve(null);
        
        JsonSerializer jsonSerializer = stdDelegatingSerializer._delegateSerializer;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] jsonSerializer_delegateSerializer_filteredProps = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter[]) getFieldValue(jsonSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps"));
        BeanPropertyWriter finalStdDelegatingSerializer_delegateSerializer_filteredProps0 = ((BeanPropertyWriter) get(jsonSerializer_delegateSerializer_filteredProps, 0));
        
        assertNull(finalStdDelegatingSerializer_delegateSerializer_filteredProps0);
    }
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#resolve(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_delegateSerializer != null): True}
 * @utbot.executesCondition {@code (_delegateSerializer instanceof ResolvableSerializer): True}
 *  */
    @Test
    public void testResolve__delegateSerializerInstanceOfResolvableSerializer_4() throws Exception  {
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        BeanAsArraySerializer _delegateSerializer = ((BeanAsArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
        UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
        StringCollectionSerializer _serializer = ((StringCollectionSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer"));
        setField(unwrappingBeanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_serializer", _serializer);
        _props[0] = ((BeanPropertyWriter) unwrappingBeanPropertyWriter);
        setField(_delegateSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = {null};
        setField(_delegateSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        TypeWrappedSerializer _nullValueSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer", _nullValueSerializer);
        
        JsonSerializer jsonSerializer = stdDelegatingSerializer._delegateSerializer;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] jsonSerializer_delegateSerializer_props = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter[]) getFieldValue(jsonSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props"));
        BeanPropertyWriter jsonSerializer_delegateSerializer_props_delegateSerializer_props0 = ((BeanPropertyWriter) get(jsonSerializer_delegateSerializer_props, 0));
        JsonSerializer initialStdDelegatingSerializer_delegateSerializer_props0_nullSerializer = ((JsonSerializer) getFieldValue(jsonSerializer_delegateSerializer_props_delegateSerializer_props0, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer"));
        
        stdDelegatingSerializer.resolve(impl);
        
        JsonSerializer jsonSerializer1 = stdDelegatingSerializer._delegateSerializer;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] jsonSerializer1_delegateSerializer_props = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter[]) getFieldValue(jsonSerializer1, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props"));
        BeanPropertyWriter jsonSerializer1_delegateSerializer_props_delegateSerializer_props0 = ((BeanPropertyWriter) get(jsonSerializer1_delegateSerializer_props, 0));
        JsonSerializer finalStdDelegatingSerializer_delegateSerializer_props0_nullSerializer = ((JsonSerializer) getFieldValue(jsonSerializer1_delegateSerializer_props_delegateSerializer_props0, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer"));
        JsonSerializer jsonSerializer2 = stdDelegatingSerializer._delegateSerializer;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] jsonSerializer2_delegateSerializer_filteredProps = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter[]) getFieldValue(jsonSerializer2, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps"));
        BeanPropertyWriter finalStdDelegatingSerializer_delegateSerializer_filteredProps0 = ((BeanPropertyWriter) get(jsonSerializer2_delegateSerializer_filteredProps, 0));
        
        assertFalse(initialStdDelegatingSerializer_delegateSerializer_props0_nullSerializer == finalStdDelegatingSerializer_delegateSerializer_props0_nullSerializer);
        
        assertNull(finalStdDelegatingSerializer_delegateSerializer_filteredProps0);
    }
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#resolve(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_delegateSerializer != null): True}
 * @utbot.executesCondition {@code (_delegateSerializer instanceof ResolvableSerializer): True}
 *  */
    @Test
    public void testResolve__delegateSerializerInstanceOfResolvableSerializer() throws Exception  {
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        BeanAsArraySerializer _delegateSerializer = ((BeanAsArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
        UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
        BeanAsArraySerializer _serializer = ((BeanAsArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer"));
        setField(unwrappingBeanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_serializer", _serializer);
        setField(unwrappingBeanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_suppressNulls", true);
        _props[0] = ((BeanPropertyWriter) unwrappingBeanPropertyWriter);
        setField(_delegateSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
        
        stdDelegatingSerializer.resolve(null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#resolve(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_delegateSerializer != null): True}
 * @utbot.executesCondition {@code (_delegateSerializer instanceof ResolvableSerializer): True}
 *  */
    @Test
    public void testResolve__delegateSerializerInstanceOfResolvableSerializer_2() throws Exception  {
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        BeanAsArraySerializer _delegateSerializer = ((BeanAsArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        StdKeySerializers.CalendarKeySerializer _serializer = ((StdKeySerializers.CalendarKeySerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$CalendarKeySerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_serializer", _serializer);
        _props[0] = beanPropertyWriter;
        setField(_delegateSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        TypeWrappedSerializer _nullValueSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer", _nullValueSerializer);
        
        JsonSerializer jsonSerializer = stdDelegatingSerializer._delegateSerializer;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] jsonSerializer_delegateSerializer_props = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter[]) getFieldValue(jsonSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props"));
        BeanPropertyWriter jsonSerializer_delegateSerializer_props_delegateSerializer_props0 = ((BeanPropertyWriter) get(jsonSerializer_delegateSerializer_props, 0));
        JsonSerializer initialStdDelegatingSerializer_delegateSerializer_props0_nullSerializer = ((JsonSerializer) getFieldValue(jsonSerializer_delegateSerializer_props_delegateSerializer_props0, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer"));
        
        stdDelegatingSerializer.resolve(impl);
        
        JsonSerializer jsonSerializer1 = stdDelegatingSerializer._delegateSerializer;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] jsonSerializer1_delegateSerializer_props = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter[]) getFieldValue(jsonSerializer1, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props"));
        BeanPropertyWriter jsonSerializer1_delegateSerializer_props_delegateSerializer_props0 = ((BeanPropertyWriter) get(jsonSerializer1_delegateSerializer_props, 0));
        JsonSerializer finalStdDelegatingSerializer_delegateSerializer_props0_nullSerializer = ((JsonSerializer) getFieldValue(jsonSerializer1_delegateSerializer_props_delegateSerializer_props0, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer"));
        
        assertFalse(initialStdDelegatingSerializer_delegateSerializer_props0_nullSerializer == finalStdDelegatingSerializer_delegateSerializer_props0_nullSerializer);
    }
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#resolve(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_delegateSerializer != null): True}
 * @utbot.executesCondition {@code (_delegateSerializer instanceof ResolvableSerializer): True}
 *  */
    @Test
    public void testResolve__delegateSerializerInstanceOfResolvableSerializer_5() throws Exception  {
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        UnwrappingBeanSerializer _delegateSerializer = ((UnwrappingBeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
        Object singleView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$SingleView");
        BeanPropertyWriter _delegate = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        TypeWrappedSerializer _nullSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        setField(_delegate, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        setField(singleView, "com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$SingleView", "_delegate", _delegate);
        NullSerializer _serializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        setField(singleView, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_serializer", _serializer);
        _props[0] = ((BeanPropertyWriter) singleView);
        setField(_delegateSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = {};
        setField(_delegateSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        AnyGetterWriter _anyGetterWriter = ((AnyGetterWriter) createInstance("com.fasterxml.jackson.databind.ser.AnyGetterWriter"));
        setField(_delegateSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_anyGetterWriter", _anyGetterWriter);
        setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer", _nullSerializer);
        
        stdDelegatingSerializer.resolve(impl);
    }
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#resolve(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_delegateSerializer != null): True}
 * @utbot.executesCondition {@code (_delegateSerializer instanceof ResolvableSerializer): True}
 *  */
    @Test
    public void testResolve__delegateSerializerInstanceOfResolvableSerializer_1() throws Exception  {
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        BeanAsArraySerializer _delegateSerializer = ((BeanAsArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
        UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
        BeanAsArraySerializer _serializer = ((BeanAsArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer"));
        setField(unwrappingBeanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_serializer", _serializer);
        _props[0] = ((BeanPropertyWriter) unwrappingBeanPropertyWriter);
        setField(_delegateSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        stdDelegatingSerializer.resolve(impl);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method resolve(com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#resolve(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_delegateSerializer != null): True}
 * @utbot.executesCondition {@code (_delegateSerializer instanceof ResolvableSerializer): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.ResolvableSerializer#resolve(com.fasterxml.jackson.databind.SerializerProvider)}
 *  */
    @Test
    public void testResolve__delegateSerializerInstanceOfResolvableSerializer_6() throws Exception  {
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        StdDelegatingSerializer _delegateSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
        
        stdDelegatingSerializer.resolve(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method resolve(com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#resolve(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_delegateSerializer != null): True}
 * @utbot.executesCondition {@code (_delegateSerializer instanceof ResolvableSerializer): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.ResolvableSerializer#resolve(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: ((ResolvableSerializer) _delegateSerializer).resolve(provider);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testResolve_ThrowIllegalStateException() throws Exception  {
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        UnwrappingBeanSerializer _delegateSerializer = ((UnwrappingBeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
        Object singleView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$SingleView");
        UnwrappingBeanPropertyWriter _delegate = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
        NullSerializer _nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        setField(_delegate, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        setField(singleView, "com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$SingleView", "_delegate", _delegate);
        _props[0] = ((BeanPropertyWriter) singleView);
        setField(_delegateSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = {null};
        setField(_delegateSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        BeanSerializer _nullValueSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer", _nullValueSerializer);
        
        stdDelegatingSerializer.resolve(impl);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer.getConverter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getConverter()
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#getConverter()}
 * @utbot.returnsFrom {@code return _converter;}
 *  */
    @Test
    public void testGetConverter_Return_converter() {
        StdDelegatingSerializer stdDelegatingSerializer = new StdDelegatingSerializer(null, null);
        
        Converter actual = stdDelegatingSerializer.getConverter();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer.getSchema
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSchema(com.fasterxml.jackson.databind.SerializerProvider, java.lang.reflect.Type)
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.executesCondition {@code (_delegateSerializer instanceof SchemaAware): True}
 * @utbot.returnsFrom {@code return ((SchemaAware) _delegateSerializer).getSchema(provider, typeHint);}
 *  */
    @Test
    public void testGetSchema__delegateSerializerInstanceOfSchemaAware() throws Exception  {
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        UnknownSerializer _delegateSerializer = ((UnknownSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer"));
        setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
        
        JsonNode actual = stdDelegatingSerializer.getSchema(null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.executesCondition {@code (_delegateSerializer instanceof SchemaAware): True}
 * @utbot.returnsFrom {@code return ((SchemaAware) _delegateSerializer).getSchema(provider, typeHint);}
 *  */
    @Test
    public void testGetSchema__delegateSerializerInstanceOfSchemaAware_2() throws Exception  {
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        FailingSerializer _delegateSerializer = ((FailingSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.FailingSerializer"));
        setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
        
        JsonNode actual = stdDelegatingSerializer.getSchema(null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.executesCondition {@code (_delegateSerializer instanceof SchemaAware): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.returnsFrom {@code return super.getSchema(provider, typeHint);}
 *  */
    @Test
    public void testGetSchema_Not_delegateSerializerNotInstanceOfSchemaAware() throws Exception  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
            TypeWrappedSerializer _delegateSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
            setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
            
            ObjectNode actual = ((ObjectNode) stdDelegatingSerializer.getSchema(null, null));
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string = "type";
            String string1 = "string";
            TextNode textNode = new TextNode(string1);
            linkedHashMap.put(string, textNode);
            ObjectNode expected = new ObjectNode(instance, linkedHashMap);
            
            // com.fasterxml.jackson.databind.node.ObjectNode has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonNodeFactory.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.executesCondition {@code (_delegateSerializer instanceof SchemaAware): True}
 * @utbot.returnsFrom {@code return ((SchemaAware) _delegateSerializer).getSchema(provider, typeHint);}
 *  */
    @Test
    public void testGetSchema__delegateSerializerInstanceOfSchemaAware_1() throws Exception  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
            NullSerializer _delegateSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
            setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
            
            ObjectNode actual = ((ObjectNode) stdDelegatingSerializer.getSchema(null, null));
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string = "type";
            String string1 = "null";
            TextNode textNode = new TextNode(string1);
            linkedHashMap.put(string, textNode);
            ObjectNode expected = new ObjectNode(instance, linkedHashMap);
            
            // com.fasterxml.jackson.databind.node.ObjectNode has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonNodeFactory.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.executesCondition {@code (_delegateSerializer instanceof SchemaAware): True}
 * @utbot.returnsFrom {@code return ((SchemaAware) _delegateSerializer).getSchema(provider, typeHint);}
 *  */
    @Test
    public void testGetSchema__delegateSerializerInstanceOfSchemaAware_3() throws Exception  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
            MapSerializer _delegateSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
            setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
            
            ObjectNode actual = ((ObjectNode) stdDelegatingSerializer.getSchema(null, null));
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string = "type";
            String string1 = "object";
            TextNode textNode = new TextNode(string1);
            linkedHashMap.put(string, textNode);
            ObjectNode expected = new ObjectNode(instance, linkedHashMap);
            
            // com.fasterxml.jackson.databind.node.ObjectNode has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonNodeFactory.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.executesCondition {@code (_delegateSerializer instanceof SchemaAware): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.impl.StringArraySerializer#createSchemaNode(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.ObjectNode#set(java.lang.String,com.fasterxml.jackson.databind.JsonNode)}
 * @utbot.returnsFrom {@code return ((SchemaAware) _delegateSerializer).getSchema(provider, typeHint);}
 *  */
    @Test
    public void testGetSchema__delegateSerializerInstanceOfSchemaAware_4() throws Exception  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
            StringArraySerializer _delegateSerializer = ((StringArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.StringArraySerializer"));
            setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
            
            ObjectNode actual = ((ObjectNode) stdDelegatingSerializer.getSchema(null, null));
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string = "type";
            String string1 = "array";
            TextNode textNode = new TextNode(string1);
            linkedHashMap.put(string, textNode);
            String string2 = "items";
            LinkedHashMap linkedHashMap1 = new LinkedHashMap();
            String string3 = "string";
            TextNode textNode1 = new TextNode(string3);
            linkedHashMap1.put(string, textNode1);
            ObjectNode objectNode = new ObjectNode(instance, linkedHashMap1);
            linkedHashMap.put(string2, objectNode);
            ObjectNode expected = new ObjectNode(instance, linkedHashMap);
            
            // com.fasterxml.jackson.databind.node.ObjectNode has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonNodeFactory.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer.getSchema
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSchema(com.fasterxml.jackson.databind.SerializerProvider, java.lang.reflect.Type, boolean)
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean)}
 * @utbot.returnsFrom {@code return ((SchemaAware) _delegateSerializer).getSchema(provider, typeHint, isOptional);}
 *  */
    @Test
    public void testGetSchema_ReturnSchemaAware_delegateSerializerGetSchema() throws Exception  {
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        UnknownSerializer _delegateSerializer = ((UnknownSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer"));
        setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
        
        JsonNode actual = stdDelegatingSerializer.getSchema(null, null, true);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean)}
 * @utbot.returnsFrom {@code return ((SchemaAware) _delegateSerializer).getSchema(provider, typeHint, isOptional);}
 *  */
    @Test
    public void testGetSchema_ReturnSchemaAware_delegateSerializerGetSchema_1() throws Exception  {
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        StdDelegatingSerializer _delegateSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        UnknownSerializer _delegateSerializer1 = ((UnknownSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer"));
        setField(_delegateSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer1);
        setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
        
        JsonNode actual = stdDelegatingSerializer.getSchema(null, null, true);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean)}
 * @utbot.returnsFrom {@code return ((SchemaAware) _delegateSerializer).getSchema(provider, typeHint, isOptional);}
 *  */
    @Test
    public void testGetSchema_ReturnSchemaAware_delegateSerializerGetSchema_2() throws Exception  {
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        StdDelegatingSerializer _delegateSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        FailingSerializer _delegateSerializer1 = ((FailingSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.FailingSerializer"));
        setField(_delegateSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer1);
        setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
        
        JsonNode actual = stdDelegatingSerializer.getSchema(null, null, true);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean)}
 * @utbot.returnsFrom {@code return ((SchemaAware) _delegateSerializer).getSchema(provider, typeHint, isOptional);}
 *  */
    @Test
    public void testGetSchema_ReturnSchemaAware_delegateSerializerGetSchema_4() throws Exception  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
            NullSerializer _delegateSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
            setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
            
            ObjectNode actual = ((ObjectNode) stdDelegatingSerializer.getSchema(null, null, true));
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string = "type";
            String string1 = "null";
            TextNode textNode = new TextNode(string1);
            linkedHashMap.put(string, textNode);
            ObjectNode expected = new ObjectNode(instance, linkedHashMap);
            
            // com.fasterxml.jackson.databind.node.ObjectNode has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonNodeFactory.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean)}
 * @utbot.returnsFrom {@code return ((SchemaAware) _delegateSerializer).getSchema(provider, typeHint, isOptional);}
 *  */
    @Test
    public void testGetSchema_ReturnSchemaAware_delegateSerializerGetSchema_3() throws Exception  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
            StdDelegatingSerializer _delegateSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
            MapSerializer _delegateSerializer1 = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
            setField(_delegateSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer1);
            setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
            
            ObjectNode actual = ((ObjectNode) stdDelegatingSerializer.getSchema(null, null, true));
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string = "type";
            String string1 = "object";
            TextNode textNode = new TextNode(string1);
            linkedHashMap.put(string, textNode);
            ObjectNode expected = new ObjectNode(instance, linkedHashMap);
            
            // com.fasterxml.jackson.databind.node.ObjectNode has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonNodeFactory.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.StdSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.returnsFrom {@code return ((SchemaAware) _delegateSerializer).getSchema(provider, typeHint, isOptional);}
 *  */
    @Test
    public void testGetSchema_StdSerializerGetSchema() throws Exception  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
            StdDelegatingSerializer _delegateSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
            TypeWrappedSerializer _delegateSerializer1 = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
            setField(_delegateSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer1);
            setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
            
            ObjectNode actual = ((ObjectNode) stdDelegatingSerializer.getSchema(null, null, false));
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string = "type";
            String string1 = "string";
            TextNode textNode = new TextNode(string1);
            linkedHashMap.put(string, textNode);
            ObjectNode expected = new ObjectNode(instance, linkedHashMap);
            
            // com.fasterxml.jackson.databind.node.ObjectNode has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonNodeFactory.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean)}
 * @utbot.returnsFrom {@code return ((SchemaAware) _delegateSerializer).getSchema(provider, typeHint, isOptional);}
 *  */
    @Test
    public void testGetSchema_ReturnSchemaAware_delegateSerializerGetSchema_5() throws Exception  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        BooleanNode prevTRUE = BooleanNode.TRUE;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            BooleanNode true1 = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
            setField(true1, "com.fasterxml.jackson.databind.node.BooleanNode", "_value", true);
            Class booleanNodeClazz = Class.forName("com.fasterxml.jackson.databind.node.BooleanNode");
            setStaticField(booleanNodeClazz, "TRUE", true1);
            StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
            NullSerializer _delegateSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
            setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
            
            ObjectNode actual = ((ObjectNode) stdDelegatingSerializer.getSchema(null, null, false));
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string = "type";
            String string1 = "null";
            TextNode textNode = new TextNode(string1);
            linkedHashMap.put(string, textNode);
            String string2 = "required";
            linkedHashMap.put(string2, true1);
            ObjectNode expected = new ObjectNode(instance, linkedHashMap);
            
            // com.fasterxml.jackson.databind.node.ObjectNode has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonNodeFactory.class, "instance", prevInstance);
            setStaticField(BooleanNode.class, "TRUE", prevTRUE);
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getSchema(com.fasterxml.jackson.databind.SerializerProvider, java.lang.reflect.Type, boolean)
    
    @Test
    public void testGetSchema1() throws Exception  {
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        StdDelegatingSerializer _delegateSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        StdDelegatingSerializer _delegateSerializer1 = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        FailingSerializer _delegateSerializer2 = ((FailingSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.FailingSerializer"));
        setField(_delegateSerializer1, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer2);
        setField(_delegateSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer1);
        setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
        
        JsonNode actual = stdDelegatingSerializer.getSchema(null, null, true);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetSchema2() throws Exception  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
            TypeWrappedSerializer _delegateSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
            setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            
            Class stdDelegatingSerializerClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer");
            Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
            Class collectionLikeTypeType = Class.forName("java.lang.reflect.Type");
            Class booleanType = boolean.class;
            Method getSchemaMethod = stdDelegatingSerializerClazz.getDeclaredMethod("getSchema", implType, collectionLikeTypeType, booleanType);
            getSchemaMethod.setAccessible(true);
            java.lang.Object[] getSchemaMethodArguments = new java.lang.Object[3];
            getSchemaMethodArguments[0] = impl;
            getSchemaMethodArguments[1] = collectionLikeType;
            getSchemaMethodArguments[2] = false;
            ObjectNode actual = ((ObjectNode) getSchemaMethod.invoke(stdDelegatingSerializer, getSchemaMethodArguments));
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string = "type";
            String string1 = "string";
            TextNode textNode = new TextNode(string1);
            linkedHashMap.put(string, textNode);
            ObjectNode expected = new ObjectNode(instance, linkedHashMap);
            
            // com.fasterxml.jackson.databind.node.ObjectNode has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonNodeFactory.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testGetSchema3() throws Exception  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
            StdDelegatingSerializer _delegateSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
            StdDelegatingSerializer _delegateSerializer1 = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
            TypeWrappedSerializer _delegateSerializer2 = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
            setField(_delegateSerializer1, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer2);
            setField(_delegateSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer1);
            setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
            
            ObjectNode actual = ((ObjectNode) stdDelegatingSerializer.getSchema(null, null, false));
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string = "type";
            String string1 = "string";
            TextNode textNode = new TextNode(string1);
            linkedHashMap.put(string, textNode);
            ObjectNode expected = new ObjectNode(instance, linkedHashMap);
            
            // com.fasterxml.jackson.databind.node.ObjectNode has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonNodeFactory.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testGetSchema4() throws Exception  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
            StdDelegatingSerializer _delegateSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
            StdDelegatingSerializer _delegateSerializer1 = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
            MapSerializer _delegateSerializer2 = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
            setField(_delegateSerializer1, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer2);
            setField(_delegateSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer1);
            setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
            
            ObjectNode actual = ((ObjectNode) stdDelegatingSerializer.getSchema(null, null, false));
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string = "type";
            String string1 = "object";
            TextNode textNode = new TextNode(string1);
            linkedHashMap.put(string, textNode);
            String string2 = "required";
            BooleanNode booleanNode = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
            setField(booleanNode, "com.fasterxml.jackson.databind.node.BooleanNode", "_value", true);
            linkedHashMap.put(string2, booleanNode);
            ObjectNode expected = new ObjectNode(instance, linkedHashMap);
            
            // com.fasterxml.jackson.databind.node.ObjectNode has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonNodeFactory.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testGetSchema5() throws Exception  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
            StdDelegatingSerializer _delegateSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
            StdDelegatingSerializer _delegateSerializer1 = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
            NullSerializer _delegateSerializer2 = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
            setField(_delegateSerializer1, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer2);
            setField(_delegateSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer1);
            setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
            
            ObjectNode actual = ((ObjectNode) stdDelegatingSerializer.getSchema(null, null, false));
            
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String string = "type";
            String string1 = "null";
            TextNode textNode = new TextNode(string1);
            linkedHashMap.put(string, textNode);
            String string2 = "required";
            BooleanNode booleanNode = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
            setField(booleanNode, "com.fasterxml.jackson.databind.node.BooleanNode", "_value", true);
            linkedHashMap.put(string2, booleanNode);
            ObjectNode expected = new ObjectNode(instance, linkedHashMap);
            
            // com.fasterxml.jackson.databind.node.ObjectNode has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(JsonNodeFactory.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer.convertValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method convertValue(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#convertValue(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.Converter#convert(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _converter.convert(value);
 *  */
    @Test
    public void testConvertValue_ThrowNullPointerException() {
        StdDelegatingSerializer stdDelegatingSerializer = new StdDelegatingSerializer(null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer.convertValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer.convertValue(StdDelegatingSerializer.java:245) */
        stdDelegatingSerializer.convertValue(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer.acceptJsonFormatVisitor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 *  */
    @Test
    public void testAcceptJsonFormatVisitor() throws Exception  {
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        NullSerializer _delegateSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        
        stdDelegatingSerializer.acceptJsonFormatVisitor(anonymousBase, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_1() throws Exception  {
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        UnknownSerializer _delegateSerializer = ((UnknownSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer"));
        setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        
        stdDelegatingSerializer.acceptJsonFormatVisitor(anonymousBase, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_4() throws Exception  {
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        MapSerializer _delegateSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
        setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        
        stdDelegatingSerializer.acceptJsonFormatVisitor(anonymousBase, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_6() throws Exception  {
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        StringArraySerializer _delegateSerializer = ((StringArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.StringArraySerializer"));
        setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        
        stdDelegatingSerializer.acceptJsonFormatVisitor(anonymousBase, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_2() throws Exception  {
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        FailingSerializer _delegateSerializer = ((FailingSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.FailingSerializer"));
        setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
        
        stdDelegatingSerializer.acceptJsonFormatVisitor(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_3() throws Exception  {
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        MapSerializer _delegateSerializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
        setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
        
        stdDelegatingSerializer.acceptJsonFormatVisitor(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_5() throws Exception  {
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        StringArraySerializer _delegateSerializer = ((StringArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.StringArraySerializer"));
        setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
        
        stdDelegatingSerializer.acceptJsonFormatVisitor(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonSerializer#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _delegateSerializer.acceptJsonFormatVisitor(visitor, typeHint);
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_ThrowNullPointerException() throws Exception  {
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer.acceptJsonFormatVisitor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer.acceptJsonFormatVisitor(StdDelegatingSerializer.java:224) */
        stdDelegatingSerializer.acceptJsonFormatVisitor(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer.createContextual
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty)
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (delSer == null): False}
 * @utbot.executesCondition {@code ((delSer == _delegateSerializer)): True}
 * @utbot.returnsFrom {@code return (delSer == _delegateSerializer) ? this : withDelegate(_converter, delegateType, delSer);}
 *  */
    @Test
    public void testCreateContextual_DelSerEquals_delegateSerializer() throws Exception  {
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        StdArraySerializers.DoubleArraySerializer _delegateSerializer = ((StdArraySerializers.DoubleArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$DoubleArraySerializer"));
        setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
        
        StdDelegatingSerializer actual = ((StdDelegatingSerializer) stdDelegatingSerializer.createContextual(null, null));
        
        Converter actual_converter = actual._converter;
        assertNull(actual_converter);
        
        JavaType actual_delegateType = actual._delegateType;
        assertNull(actual_delegateType);
        
        JsonSerializer stdDelegatingSerializer_delegateSerializer = stdDelegatingSerializer._delegateSerializer;
        JsonSerializer actual_delegateSerializer = actual._delegateSerializer;
        BeanProperty actual_delegateSerializer_property = ((BeanProperty) getFieldValue(actual_delegateSerializer, "com.fasterxml.jackson.databind.ser.std.ArraySerializerBase", "_property"));
        assertNull(actual_delegateSerializer_property);
        
        Class actual_delegateSerializer_handledType = ((Class) getFieldValue(actual_delegateSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
        assertNull(actual_delegateSerializer_handledType);
        
        assertTrue(deepEquals(stdDelegatingSerializer, actual));
    }
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (delSer == null): True}
 * @utbot.executesCondition {@code (delegateType == null): False}
 * @utbot.executesCondition {@code ((delSer == _delegateSerializer)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#findValueSerializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#withDelegate(com.fasterxml.jackson.databind.util.Converter,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.returnsFrom {@code return (delSer == _delegateSerializer) ? this : withDelegate(_converter, delegateType, delSer);}
 *  */
    @Test
    public void testCreateContextual_DelSerNotEquals_delegateSerializer() throws Exception  {
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        CollectionType _delegateType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(_delegateType, "com.fasterxml.jackson.databind.JavaType", "_hash", -254);
        setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateType", _delegateType);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        JsonSerializerMap _map = ((JsonSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", 12);
        Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket");
        Object next = createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket");
        SerializerCache.TypeKey key = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
        setField(key, "com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey", "_type", _delegateType);
        setField(next, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", "key", key);
        TypeWrappedSerializer value = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        setField(next, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", "value", value);
        setField(bucket, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", "next", next);
        _buckets[0] = bucket;
        _buckets[1] = bucket;
        setField(_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map", _map);
        SerializerCache.TypeKey _cacheKey = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
        setField(_cacheKey, "com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey", "_hashCode", -255);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_cacheKey", _cacheKey);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        
        StdDelegatingSerializer actual = ((StdDelegatingSerializer) stdDelegatingSerializer.createContextual(impl, null));
        
        StdDelegatingSerializer expected = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        setField(expected, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateType", _delegateType);
        setField(expected, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", value);
        
        Converter actual_converter = actual._converter;
        assertNull(actual_converter);
        
        JavaType expected_delegateType = expected._delegateType;
        JavaType actual_delegateType = actual._delegateType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_delegateType, actual_delegateType);
        
        JsonSerializer expected_delegateSerializer = expected._delegateSerializer;
        JsonSerializer actual_delegateSerializer = actual._delegateSerializer;
        TypeSerializer actual_delegateSerializer_typeSerializer = ((TypeSerializer) getFieldValue(actual_delegateSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_typeSerializer"));
        assertNull(actual_delegateSerializer_typeSerializer);
        
        JsonSerializer actual_delegateSerializer_serializer = ((JsonSerializer) getFieldValue(actual_delegateSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer"));
        assertNull(actual_delegateSerializer_serializer);
        
        Class actual_handledType = actual._handledType;
        assertNull(actual_handledType);
        
        ReadOnlyClassToSerializerMap impl_knownSerializers = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        JsonSerializerMap impl_knownSerializers_knownSerializers_map = ((JsonSerializerMap) getFieldValue(impl_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map"));
        Object impl_knownSerializers_knownSerializers_map_knownSerializers_map_buckets = getFieldValue(impl_knownSerializers_knownSerializers_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_map_buckets2 = get(impl_knownSerializers_knownSerializers_map_knownSerializers_map_buckets, 2);
        ReadOnlyClassToSerializerMap impl_knownSerializers1 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        JsonSerializerMap impl_knownSerializers1_knownSerializers_map = ((JsonSerializerMap) getFieldValue(impl_knownSerializers1, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map"));
        Object impl_knownSerializers1_knownSerializers_map_knownSerializers_map_buckets = getFieldValue(impl_knownSerializers1_knownSerializers_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_map_buckets3 = get(impl_knownSerializers1_knownSerializers_map_knownSerializers_map_buckets, 3);
        ReadOnlyClassToSerializerMap impl_knownSerializers2 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        JsonSerializerMap impl_knownSerializers2_knownSerializers_map = ((JsonSerializerMap) getFieldValue(impl_knownSerializers2, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map"));
        Object impl_knownSerializers2_knownSerializers_map_knownSerializers_map_buckets = getFieldValue(impl_knownSerializers2_knownSerializers_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_map_buckets4 = get(impl_knownSerializers2_knownSerializers_map_knownSerializers_map_buckets, 4);
        ReadOnlyClassToSerializerMap impl_knownSerializers3 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        JsonSerializerMap impl_knownSerializers3_knownSerializers_map = ((JsonSerializerMap) getFieldValue(impl_knownSerializers3, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map"));
        Object impl_knownSerializers3_knownSerializers_map_knownSerializers_map_buckets = getFieldValue(impl_knownSerializers3_knownSerializers_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_map_buckets5 = get(impl_knownSerializers3_knownSerializers_map_knownSerializers_map_buckets, 5);
        ReadOnlyClassToSerializerMap impl_knownSerializers4 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        JsonSerializerMap impl_knownSerializers4_knownSerializers_map = ((JsonSerializerMap) getFieldValue(impl_knownSerializers4, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map"));
        Object impl_knownSerializers4_knownSerializers_map_knownSerializers_map_buckets = getFieldValue(impl_knownSerializers4_knownSerializers_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_map_buckets6 = get(impl_knownSerializers4_knownSerializers_map_knownSerializers_map_buckets, 6);
        ReadOnlyClassToSerializerMap impl_knownSerializers5 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        JsonSerializerMap impl_knownSerializers5_knownSerializers_map = ((JsonSerializerMap) getFieldValue(impl_knownSerializers5, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map"));
        Object impl_knownSerializers5_knownSerializers_map_knownSerializers_map_buckets = getFieldValue(impl_knownSerializers5_knownSerializers_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_map_buckets7 = get(impl_knownSerializers5_knownSerializers_map_knownSerializers_map_buckets, 7);
        ReadOnlyClassToSerializerMap impl_knownSerializers6 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        JsonSerializerMap impl_knownSerializers6_knownSerializers_map = ((JsonSerializerMap) getFieldValue(impl_knownSerializers6, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map"));
        Object impl_knownSerializers6_knownSerializers_map_knownSerializers_map_buckets = getFieldValue(impl_knownSerializers6_knownSerializers_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_map_buckets8 = get(impl_knownSerializers6_knownSerializers_map_knownSerializers_map_buckets, 8);
        ReadOnlyClassToSerializerMap impl_knownSerializers7 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        JsonSerializerMap impl_knownSerializers7_knownSerializers_map = ((JsonSerializerMap) getFieldValue(impl_knownSerializers7, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map"));
        Object impl_knownSerializers7_knownSerializers_map_knownSerializers_map_buckets = getFieldValue(impl_knownSerializers7_knownSerializers_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_map_buckets9 = get(impl_knownSerializers7_knownSerializers_map_knownSerializers_map_buckets, 9);
        ReadOnlyClassToSerializerMap impl_knownSerializers8 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        JsonSerializerMap impl_knownSerializers8_knownSerializers_map = ((JsonSerializerMap) getFieldValue(impl_knownSerializers8, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map"));
        Object impl_knownSerializers8_knownSerializers_map_knownSerializers_map_buckets = getFieldValue(impl_knownSerializers8_knownSerializers_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_map_buckets10 = get(impl_knownSerializers8_knownSerializers_map_knownSerializers_map_buckets, 10);
        ReadOnlyClassToSerializerMap impl_knownSerializers9 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        JsonSerializerMap impl_knownSerializers9_knownSerializers_map = ((JsonSerializerMap) getFieldValue(impl_knownSerializers9, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map"));
        Object impl_knownSerializers9_knownSerializers_map_knownSerializers_map_buckets = getFieldValue(impl_knownSerializers9_knownSerializers_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_map_buckets11 = get(impl_knownSerializers9_knownSerializers_map_knownSerializers_map_buckets, 11);
        
        assertNull(finalImpl_knownSerializers_map_buckets2);
        
        assertNull(finalImpl_knownSerializers_map_buckets3);
        
        assertNull(finalImpl_knownSerializers_map_buckets4);
        
        assertNull(finalImpl_knownSerializers_map_buckets5);
        
        assertNull(finalImpl_knownSerializers_map_buckets6);
        
        assertNull(finalImpl_knownSerializers_map_buckets7);
        
        assertNull(finalImpl_knownSerializers_map_buckets8);
        
        assertNull(finalImpl_knownSerializers_map_buckets9);
        
        assertNull(finalImpl_knownSerializers_map_buckets10);
        
        assertNull(finalImpl_knownSerializers_map_buckets11);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty)
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (delSer == null): True}
 * @utbot.executesCondition {@code (delegateType == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: delSer = provider.findValueSerializer(delegateType);
 *  */
    @Test
    public void testCreateContextual_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        CollectionType _delegateType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(_delegateType, "com.fasterxml.jackson.databind.JavaType", "_hash", 191626144);
        setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateType", _delegateType);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        JsonSerializerMap _map = ((JsonSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", 0);
        setField(_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map", _map);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer.createContextual] produces [java.lang.ArrayIndexOutOfBoundsException: Index 191626143 out of bounds for length 0]
            com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap.find(JsonSerializerMap.java:57)
            com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap.untypedValueSerializer(ReadOnlyClassToSerializerMap.java:70)
            com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:560)
            com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer.createContextual(StdDelegatingSerializer.java:121) */
        stdDelegatingSerializer.createContextual(impl, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (delSer == null): True}
 * @utbot.executesCondition {@code (delegateType == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: delSer = provider.findValueSerializer(delegateType);
 *  */
    @Test
    public void testCreateContextual_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        CollectionType _delegateType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(_delegateType, "com.fasterxml.jackson.databind.JavaType", "_hash", 254);
        setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateType", _delegateType);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        JsonSerializerMap _map = ((JsonSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", 0);
        setField(_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map", _map);
        SerializerCache.TypeKey _cacheKey = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
        setField(_cacheKey, "com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey", "_hashCode", -255);
        Class _class = Object.class;
        setField(_cacheKey, "com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey", "_class", _class);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_cacheKey", _cacheKey);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer.createContextual] produces [java.lang.ArrayIndexOutOfBoundsException: Index 253 out of bounds for length 0]
            com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap.find(JsonSerializerMap.java:57)
            com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap.untypedValueSerializer(ReadOnlyClassToSerializerMap.java:70)
            com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:560)
            com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer.createContextual(StdDelegatingSerializer.java:121) */
        stdDelegatingSerializer.createContextual(impl, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (delSer == null): False}
 * @utbot.executesCondition {@code (delSer instanceof ContextualSerializer): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#handleSecondaryContextualization(com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: delSer = provider.handleSecondaryContextualization(delSer, property);
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException_1() throws Exception  {
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        UnwrappingBeanSerializer _delegateSerializer = ((UnwrappingBeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer"));
        setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer.createContextual(StdDelegatingSerializer.java:124) */
        stdDelegatingSerializer.createContextual(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (delSer == null): True}
 * @utbot.executesCondition {@code (delegateType == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#findValueSerializer(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: delSer = provider.findValueSerializer(delegateType);
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException_2() throws Exception  {
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        MapType _delegateType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateType", _delegateType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer.createContextual(StdDelegatingSerializer.java:121) */
        stdDelegatingSerializer.createContextual(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (delSer == null): True}
 * @utbot.executesCondition {@code (delegateType == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getTypeFactory()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: delegateType = _converter.getOutputType(provider.getTypeFactory());
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException() throws Exception  {
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer.createContextual(StdDelegatingSerializer.java:116) */
        stdDelegatingSerializer.createContextual(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (delSer == null): True}
 * @utbot.executesCondition {@code (delegateType == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getTypeFactory()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: delegateType = _converter.getOutputType(provider.getTypeFactory());
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException_3() throws Exception  {
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer.createContextual(StdDelegatingSerializer.java:116) */
        stdDelegatingSerializer.createContextual(impl, null);
    }
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (delSer == null): True}
 * @utbot.executesCondition {@code (delegateType == null): False}
 * @utbot.executesCondition {@code (delSer instanceof ContextualSerializer): False}
 * @utbot.executesCondition {@code ((delSer == _delegateSerializer)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#withDelegate(com.fasterxml.jackson.databind.util.Converter,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.returnsFrom {@code return (delSer == _delegateSerializer) ? this : withDelegate(_converter, delegateType, delSer);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (delSer == _delegateSerializer) ? this : withDelegate(_converter, delegateType, delSer);
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException_4() throws Exception  {
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        ArrayType _delegateType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_delegateType, "com.fasterxml.jackson.databind.JavaType", "_hash", 2);
        setField(stdDelegatingSerializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateType", _delegateType);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        JsonSerializerMap _map = ((JsonSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", 12);
        Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket");
        SerializerCache.TypeKey key = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
        setField(bucket, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", "key", key);
        TypeWrappedSerializer value = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        setField(bucket, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", "value", value);
        _buckets[1] = bucket;
        setField(_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map", _map);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:562)
            com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer.createContextual(StdDelegatingSerializer.java:121) */
        stdDelegatingSerializer.createContextual(impl, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer.withDelegate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withDelegate(com.fasterxml.jackson.databind.util.Converter, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonSerializer)
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#withDelegate(com.fasterxml.jackson.databind.util.Converter,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (getClass()): False}
 * @utbot.returnsFrom {@code return new StdDelegatingSerializer(converter, delegateType, delegateSerializer);}
 *  */
    @Test
    public void testWithDelegate_NotGetClass() throws Exception  {
        StdDelegatingSerializer stdDelegatingSerializer = new StdDelegatingSerializer(null);
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        
        StdDelegatingSerializer actual = stdDelegatingSerializer.withDelegate(null, collectionType, null);
        
        StdDelegatingSerializer expected = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        setField(expected, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateType", collectionType);
        
        Converter actual_converter = actual._converter;
        assertNull(actual_converter);
        
        JavaType expected_delegateType = expected._delegateType;
        JavaType actual_delegateType = actual._delegateType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_delegateType, actual_delegateType);
        
        JsonSerializer actual_delegateSerializer = actual._delegateSerializer;
        assertNull(actual_delegateSerializer);
        
        Class actual_handledType = actual._handledType;
        assertNull(actual_handledType);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer.getDelegatee
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDelegatee()
    
    /**
    @utbot.classUnderTest {@link StdDelegatingSerializer}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer#getDelegatee()}
 * @utbot.returnsFrom {@code return _delegateSerializer;}
 *  */
    @Test
    public void testGetDelegatee_Return_delegateSerializer() throws Exception  {
        StdDelegatingSerializer stdDelegatingSerializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        
        JsonSerializer actual = stdDelegatingSerializer.getDelegatee();
        
        assertNull(actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1066495117505700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1066495117505700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1066495117525100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1066495117505700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1066495117525100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1066495118164200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1066495118164200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1066495118168100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1066495118164200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1066495118168100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1066495118501700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1066495118501700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1066495118505399 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1066495118501700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1066495118505399).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

