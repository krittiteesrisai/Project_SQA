package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import com.fasterxml.jackson.databind.ser.BeanSerializer;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.AnyGetterWriter;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.EnumKeySerializer;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.core.io.SerializedString;
import java.lang.reflect.Field;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.util.NameTransformer.Chained;
import java.lang.reflect.Constructor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.SerializeExceptFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;

public final class com_fasterxml_jackson_databind_ser_std_BeanSerializerBaseTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.resolve
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method resolve(com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#resolve(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code ((_filteredProps == null)): False}
 * @utbot.executesCondition {@code (_anyGetterWriter != null): True}
 *  */
    @Test
    public void testResolve__anyGetterWriterNotEqualsNull() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = {};
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = {null};
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        AnyGetterWriter _anyGetterWriter = ((AnyGetterWriter) createInstance("com.fasterxml.jackson.databind.ser.AnyGetterWriter"));
        ByteBufferSerializer _serializer = ((ByteBufferSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.ByteBufferSerializer"));
        setField(_anyGetterWriter, "com.fasterxml.jackson.databind.ser.AnyGetterWriter", "_serializer", _serializer);
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_anyGetterWriter", _anyGetterWriter);
        
        beanSerializer.resolve(null);
        
        BeanPropertyWriter finalBeanSerializer_filteredProps0 = beanSerializer._filteredProps[0];
        
        assertNull(finalBeanSerializer_filteredProps0);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#resolve(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code ((_filteredProps == null)): True}
 * @utbot.executesCondition {@code (_anyGetterWriter != null): False}
 *  */
    @Test
    public void testResolve__anyGetterWriterEqualsNull() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = ((UnwrappingBeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = {};
        setField(unwrappingBeanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        
        unwrappingBeanSerializer.resolve(null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#resolve(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code ((_filteredProps == null)): True}
 * @utbot.executesCondition {@code (_anyGetterWriter != null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _props.length; i < len; ++i)} once
 *  */
    @Test
    public void testResolve_PropWillSuppressNulls() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = ((UnwrappingBeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
        AttributePropertyWriter attributePropertyWriter = ((AttributePropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter"));
        NullSerializer _serializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        setField(attributePropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_serializer", _serializer);
        setField(attributePropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_suppressNulls", true);
        _props[0] = ((BeanPropertyWriter) attributePropertyWriter);
        setField(unwrappingBeanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        
        unwrappingBeanSerializer.resolve(null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#resolve(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code ((_filteredProps == null)): True}
 * @utbot.executesCondition {@code (_anyGetterWriter != null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _props.length; i < len; ++i)} once
 *  */
    @Test
    public void testResolve_PropHasNullSerializer() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        StdKeySerializers.EnumKeySerializer _serializer = ((StdKeySerializers.EnumKeySerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$EnumKeySerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_serializer", _serializer);
        InetSocketAddressSerializer _nullSerializer = ((InetSocketAddressSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        _props[0] = beanPropertyWriter;
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        
        beanSerializer.resolve(null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#resolve(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code ((_filteredProps == null)): False}
 * @utbot.executesCondition {@code (_anyGetterWriter != null): True}
 *  */
    @Test
    public void testResolve__anyGetterWriterNotEqualsNull_1() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = ((UnwrappingBeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = {};
        setField(unwrappingBeanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = {null};
        setField(unwrappingBeanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        AnyGetterWriter _anyGetterWriter = ((AnyGetterWriter) createInstance("com.fasterxml.jackson.databind.ser.AnyGetterWriter"));
        StdDelegatingSerializer _serializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        StdKeySerializers.EnumKeySerializer _delegateSerializer = ((StdKeySerializers.EnumKeySerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$EnumKeySerializer"));
        setField(_serializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
        setField(_anyGetterWriter, "com.fasterxml.jackson.databind.ser.AnyGetterWriter", "_serializer", _serializer);
        setField(unwrappingBeanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_anyGetterWriter", _anyGetterWriter);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        unwrappingBeanSerializer.resolve(impl);
        
        BeanPropertyWriter finalUnwrappingBeanSerializer_filteredProps0 = unwrappingBeanSerializer._filteredProps[0];
        
        assertNull(finalUnwrappingBeanSerializer_filteredProps0);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#resolve(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code ((_filteredProps == null)): True}
 * @utbot.executesCondition {@code (_anyGetterWriter != null): True}
 *  */
    @Test
    public void testResolve__anyGetterWriterNotEqualsNull_2() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = ((UnwrappingBeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = {};
        setField(unwrappingBeanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        AnyGetterWriter _anyGetterWriter = ((AnyGetterWriter) createInstance("com.fasterxml.jackson.databind.ser.AnyGetterWriter"));
        StdDelegatingSerializer _serializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        ReferenceType _delegateType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_delegateType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_serializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateType", _delegateType);
        setField(_anyGetterWriter, "com.fasterxml.jackson.databind.ser.AnyGetterWriter", "_serializer", _serializer);
        setField(unwrappingBeanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_anyGetterWriter", _anyGetterWriter);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        AnyGetterWriter anyGetterWriter = unwrappingBeanSerializer._anyGetterWriter;
        JsonSerializer anyGetterWriter_anyGetterWriter_serializer = ((JsonSerializer) getFieldValue(anyGetterWriter, "com.fasterxml.jackson.databind.ser.AnyGetterWriter", "_serializer"));
        JavaType anyGetterWriter_anyGetterWriter_serializer_anyGetterWriter_serializer_delegateType = ((JavaType) getFieldValue(anyGetterWriter_anyGetterWriter_serializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateType"));
        Class initialUnwrappingBeanSerializer_anyGetterWriter_serializer_delegateType_class = ((Class) getFieldValue(anyGetterWriter_anyGetterWriter_serializer_anyGetterWriter_serializer_delegateType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        unwrappingBeanSerializer.resolve(impl);
        
        AnyGetterWriter anyGetterWriter1 = unwrappingBeanSerializer._anyGetterWriter;
        JsonSerializer anyGetterWriter1_anyGetterWriter_serializer = ((JsonSerializer) getFieldValue(anyGetterWriter1, "com.fasterxml.jackson.databind.ser.AnyGetterWriter", "_serializer"));
        JavaType anyGetterWriter1_anyGetterWriter_serializer_anyGetterWriter_serializer_delegateType = ((JavaType) getFieldValue(anyGetterWriter1_anyGetterWriter_serializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateType"));
        Class finalUnwrappingBeanSerializer_anyGetterWriter_serializer_delegateType_class = ((Class) getFieldValue(anyGetterWriter1_anyGetterWriter_serializer_anyGetterWriter_serializer_delegateType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialUnwrappingBeanSerializer_anyGetterWriter_serializer_delegateType_class == finalUnwrappingBeanSerializer_anyGetterWriter_serializer_delegateType_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method resolve(com.fasterxml.jackson.databind.SerializerProvider)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code ((_filteredProps == null)): False}
    /// invoke:
    ///     {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#willSuppressNulls()} once
    /// execute conditions:
    ///     {@code (!prop.willSuppressNulls()): True}
    /// invoke:
    ///     {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#hasNullSerializer()} once
    /// execute conditions:
    ///     {@code (!prop.hasNullSerializer()): True}
    /// invoke:
    ///     {@link com.fasterxml.jackson.databind.SerializerProvider#findNullValueSerializer(com.fasterxml.jackson.databind.BeanProperty)} once,
    ///     {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#hasSerializer()} once
    /// execute conditions:
    ///     {@code (prop.hasSerializer()): True},
    ///     {@code (_anyGetterWriter != null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#resolve(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _props.length; i < len; ++i)} once
 *  */
    @Test
    public void testResolve_IGreaterOrEqualFilteredCount() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        StdKeySerializers.EnumKeySerializer _serializer = ((StdKeySerializers.EnumKeySerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$EnumKeySerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_serializer", _serializer);
        _props[0] = beanPropertyWriter;
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = {};
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        TypeWrappedSerializer _nullValueSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer", _nullValueSerializer);
        
        BeanPropertyWriter beanPropertyWriter1 = beanSerializer._props[0];
        JsonSerializer initialBeanSerializer_props0_nullSerializer = ((JsonSerializer) getFieldValue(beanPropertyWriter1, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer"));
        
        beanSerializer.resolve(impl);
        
        BeanPropertyWriter beanPropertyWriter2 = beanSerializer._props[0];
        JsonSerializer finalBeanSerializer_props0_nullSerializer = ((JsonSerializer) getFieldValue(beanPropertyWriter2, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer"));
        
        assertFalse(initialBeanSerializer_props0_nullSerializer == finalBeanSerializer_props0_nullSerializer);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#resolve(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _props.length; i < len; ++i)} once
 *  */
    @Test
    public void testResolve_W2EqualsNull() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = ((UnwrappingBeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
        UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
        StdKeySerializers.EnumKeySerializer _serializer = ((StdKeySerializers.EnumKeySerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$EnumKeySerializer"));
        setField(unwrappingBeanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_serializer", _serializer);
        _props[0] = ((BeanPropertyWriter) unwrappingBeanPropertyWriter);
        setField(unwrappingBeanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = {null};
        setField(unwrappingBeanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        TypeWrappedSerializer _nullValueSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer", _nullValueSerializer);
        
        BeanPropertyWriter beanPropertyWriter = unwrappingBeanSerializer._props[0];
        JsonSerializer initialUnwrappingBeanSerializer_props0_nullSerializer = ((JsonSerializer) getFieldValue(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer"));
        
        unwrappingBeanSerializer.resolve(impl);
        
        BeanPropertyWriter beanPropertyWriter1 = unwrappingBeanSerializer._props[0];
        JsonSerializer finalUnwrappingBeanSerializer_props0_nullSerializer = ((JsonSerializer) getFieldValue(beanPropertyWriter1, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer"));
        BeanPropertyWriter finalUnwrappingBeanSerializer_filteredProps0 = unwrappingBeanSerializer._filteredProps[0];
        
        assertFalse(initialUnwrappingBeanSerializer_props0_nullSerializer == finalUnwrappingBeanSerializer_props0_nullSerializer);
        
        assertNull(finalUnwrappingBeanSerializer_filteredProps0);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#resolve(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _props.length; i < len; ++i)} once
 *  */
    @Test
    public void testResolve_NullSerEqualsNull() throws Exception  {
        BeanAsArraySerializer beanAsArraySerializer = ((BeanAsArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        StdKeySerializers.StringKeySerializer _serializer = ((StdKeySerializers.StringKeySerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$StringKeySerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_serializer", _serializer);
        _props[0] = beanPropertyWriter;
        setField(beanAsArraySerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = {null};
        setField(beanAsArraySerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        beanAsArraySerializer.resolve(impl);
        
        BeanPropertyWriter finalBeanAsArraySerializer_filteredProps0 = beanAsArraySerializer._filteredProps[0];
        
        assertNull(finalBeanAsArraySerializer_filteredProps0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resolve(com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#resolve(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code ((_filteredProps == null)): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _props.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !prop.willSuppressNulls() && !prop.hasNullSerializer()
 *  */
    @Test
    public void testResolve_ThrowNullPointerException_2() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = {null};
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = {null};
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.resolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.resolve(BeanSerializerBase.java:283) */
        beanSerializer.resolve(null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#resolve(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code ((_filteredProps == null)): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _props.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonSerializer<Object> nullSer = provider.findNullValueSerializer(prop);
 *  */
    @Test
    public void testResolve_ThrowNullPointerException_3() throws Exception  {
        BeanAsArraySerializer beanAsArraySerializer = ((BeanAsArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
        UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
        _props[0] = ((BeanPropertyWriter) unwrappingBeanPropertyWriter);
        setField(beanAsArraySerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = {null};
        setField(beanAsArraySerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.resolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.resolve(BeanSerializerBase.java:284) */
        beanAsArraySerializer.resolve(null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#resolve(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code ((_filteredProps == null)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0, len = _props.length; i < len; ++i)
 *  */
    @Test
    public void testResolve_ThrowNullPointerException() throws Exception  {
        BeanAsArraySerializer beanAsArraySerializer = ((BeanAsArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = {null};
        setField(beanAsArraySerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.resolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.resolve(BeanSerializerBase.java:280) */
        beanAsArraySerializer.resolve(null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#resolve(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code ((_filteredProps == null)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0, len = _props.length; i < len; ++i)
 *  */
    @Test
    public void testResolve_ThrowNullPointerException_1() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.resolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.resolve(BeanSerializerBase.java:280) */
        beanSerializer.resolve(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method resolve(com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#resolve(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code ((_filteredProps == null)): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _props.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: w2.assignNullSerializer(nullSer);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testResolve_ThrowIllegalStateException() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = ((UnwrappingBeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
        UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
        _props[0] = ((BeanPropertyWriter) unwrappingBeanPropertyWriter);
        setField(unwrappingBeanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
        UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter1 = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
        StdKeySerializers.EnumKeySerializer _nullSerializer = ((StdKeySerializers.EnumKeySerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$EnumKeySerializer"));
        setField(unwrappingBeanPropertyWriter1, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        _filteredProps[0] = ((BeanPropertyWriter) unwrappingBeanPropertyWriter1);
        setField(unwrappingBeanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        TypeWrappedSerializer _nullValueSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer", _nullValueSerializer);
        
        unwrappingBeanSerializer.resolve(impl);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.properties
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method properties()
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#properties()}
 * @utbot.invokes {@link java.util.Arrays#asList(java.lang.Object[])}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.returnsFrom {@code return Arrays.<PropertyWriter>asList(_props).iterator();}
 *  */
    @Test
    public void testProperties_ListIterator() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = {};
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        
        Object actual = beanSerializer.properties();
        
        Object expected = createInstance("java.util.Arrays$ArrayItr");
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method rename([Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;, com.fasterxml.jackson.databind.util.NameTransformer)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return props;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#rename(com.fasterxml.jackson.databind.ser.BeanPropertyWriter[],com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.executesCondition {@code (props == null): False}
 * @utbot.executesCondition {@code (props.length == 0): True}
 * @utbot.returnsFrom {@code return props;}
 *  */
    @Test
    public void testRename_PropsLengthEqualsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = {};
        
        Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class beanPropertyWriterArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;");
        Class nameTransformerType = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Method renameMethod = beanSerializerBaseClazz.getDeclaredMethod("rename", beanPropertyWriterArrayType, nameTransformerType);
        renameMethod.setAccessible(true);
        java.lang.Object[] renameMethodArguments = new java.lang.Object[2];
        renameMethodArguments[0] = ((Object) beanPropertyWriterArray);
        renameMethodArguments[1] = ((Object) null);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter[]) renameMethod.invoke(null, renameMethodArguments));
        
        int beanPropertyWriterArraySize = beanPropertyWriterArray.length;
        assertEquals(beanPropertyWriterArraySize, actual.length);
        assertTrue(deepEquals(beanPropertyWriterArray, actual));
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#rename(com.fasterxml.jackson.databind.ser.BeanPropertyWriter[],com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.executesCondition {@code (props == null): False}
 * @utbot.executesCondition {@code (props.length == 0): False}
 * @utbot.executesCondition {@code (transformer == null): True}
 * @utbot.returnsFrom {@code return props;}
 *  */
    @Test
    public void testRename_TransformerEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = {null, null};
        
        Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class beanPropertyWriterArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;");
        Class nameTransformerType = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Method renameMethod = beanSerializerBaseClazz.getDeclaredMethod("rename", beanPropertyWriterArrayType, nameTransformerType);
        renameMethod.setAccessible(true);
        java.lang.Object[] renameMethodArguments = new java.lang.Object[2];
        renameMethodArguments[0] = ((Object) beanPropertyWriterArray);
        renameMethodArguments[1] = ((Object) null);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter[]) renameMethod.invoke(null, renameMethodArguments));
        
        int beanPropertyWriterArraySize = beanPropertyWriterArray.length;
        assertEquals(beanPropertyWriterArraySize, actual.length);
        assertTrue(deepEquals(beanPropertyWriterArray, actual));
        
        BeanPropertyWriter finalBeanPropertyWriterArray0 = beanPropertyWriterArray[0];
        BeanPropertyWriter finalBeanPropertyWriterArray1 = beanPropertyWriterArray[1];
        
        assertNull(finalBeanPropertyWriterArray0);
        
        assertNull(finalBeanPropertyWriterArray1);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#rename(com.fasterxml.jackson.databind.ser.BeanPropertyWriter[],com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.executesCondition {@code (props == null): False}
 * @utbot.executesCondition {@code (props.length == 0): False}
 * @utbot.executesCondition {@code (transformer == null): False}
 * @utbot.executesCondition {@code (transformer == NameTransformer.NOP): True}
 * @utbot.returnsFrom {@code return props;}
 *  */
    @Test
    public void testRename_TransformerNotEqualsNull() throws Exception  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            Object nop = createInstance("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer");
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = {null, null};
            
            Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
            Class beanPropertyWriterArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;");
            Method renameMethod = beanSerializerBaseClazz.getDeclaredMethod("rename", beanPropertyWriterArrayType, nameTransformerClazz);
            renameMethod.setAccessible(true);
            java.lang.Object[] renameMethodArguments = new java.lang.Object[2];
            renameMethodArguments[0] = ((Object) beanPropertyWriterArray);
            renameMethodArguments[1] = nop;
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter[]) renameMethod.invoke(null, renameMethodArguments));
            
            int beanPropertyWriterArraySize = beanPropertyWriterArray.length;
            assertEquals(beanPropertyWriterArraySize, actual.length);
            assertTrue(deepEquals(beanPropertyWriterArray, actual));
            
            BeanPropertyWriter finalBeanPropertyWriterArray0 = beanPropertyWriterArray[0];
            BeanPropertyWriter finalBeanPropertyWriterArray1 = beanPropertyWriterArray[1];
            
            assertNull(finalBeanPropertyWriterArray0);
            
            assertNull(finalBeanPropertyWriterArray1);
        } finally {
            setStaticField(NameTransformer.class, "NOP", prevNOP);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#rename(com.fasterxml.jackson.databind.ser.BeanPropertyWriter[],com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.executesCondition {@code (props == null): True}
 * @utbot.returnsFrom {@code return props;}
 *  */
    @Test
    public void testRename_PropsEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class beanPropertyWriterArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;");
        Class nameTransformerType = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Method renameMethod = beanSerializerBaseClazz.getDeclaredMethod("rename", beanPropertyWriterArrayType, nameTransformerType);
        renameMethod.setAccessible(true);
        java.lang.Object[] renameMethodArguments = new java.lang.Object[2];
        renameMethodArguments[0] = ((Object) null);
        renameMethodArguments[1] = ((Object) null);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter[]) renameMethod.invoke(null, renameMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method rename([Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;, com.fasterxml.jackson.databind.util.NameTransformer)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (props == null): False},
    ///     {@code (props.length == 0): False},
    ///     {@code (transformer == null): False},
    ///     {@code (transformer == NameTransformer.NOP): False},
    ///     {@code (bpw != null): True}
    /// invoke:
    ///     {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#rename(com.fasterxml.jackson.databind.util.NameTransformer)} once
    /// return from: {@code return result;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#rename(com.fasterxml.jackson.databind.ser.BeanPropertyWriter[],com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testRename_IterateForLoop() throws Exception  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            Object nop = createInstance("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer");
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
            AttributePropertyWriter attributePropertyWriter = ((AttributePropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter"));
            SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            String _value = "";
            setField(_name, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
            setField(attributePropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
            beanPropertyWriterArray[0] = ((BeanPropertyWriter) attributePropertyWriter);
            Object nopTransformer = createInstance("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer");
            
            Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
            Class beanPropertyWriterArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;");
            Method renameMethod = beanSerializerBaseClazz.getDeclaredMethod("rename", beanPropertyWriterArrayType, nameTransformerClazz);
            renameMethod.setAccessible(true);
            java.lang.Object[] renameMethodArguments = new java.lang.Object[2];
            renameMethodArguments[0] = ((Object) beanPropertyWriterArray);
            renameMethodArguments[1] = nopTransformer;
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter[]) renameMethod.invoke(null, renameMethodArguments));
            
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] expected = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
            expected[0] = ((BeanPropertyWriter) attributePropertyWriter);
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(NameTransformer.class, "NOP", prevNOP);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#rename(com.fasterxml.jackson.databind.ser.BeanPropertyWriter[],com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testRename_IterateForLoop_1() throws Exception  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            Object nop = createInstance("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer");
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
            UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
            SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            String _value = "";
            setField(_name, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
            setField(unwrappingBeanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
            Method _accessorMethod = ((Method) createInstance("java.lang.reflect.Method"));
            setField(unwrappingBeanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_accessorMethod", _accessorMethod);
            Field _field = ((Field) createInstance("java.lang.reflect.Field"));
            setField(unwrappingBeanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_field", _field);
            JsonFormat.Value _format = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
            setField(unwrappingBeanPropertyWriter, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_format", _format);
            beanPropertyWriterArray[0] = ((BeanPropertyWriter) unwrappingBeanPropertyWriter);
            Object nopTransformer = createInstance("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer");
            
            Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
            Class beanPropertyWriterArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;");
            Method renameMethod = beanSerializerBaseClazz.getDeclaredMethod("rename", beanPropertyWriterArrayType, nameTransformerClazz);
            renameMethod.setAccessible(true);
            java.lang.Object[] renameMethodArguments = new java.lang.Object[2];
            renameMethodArguments[0] = ((Object) beanPropertyWriterArray);
            renameMethodArguments[1] = nopTransformer;
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter[]) renameMethod.invoke(null, renameMethodArguments));
            
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] expected = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
            UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter1 = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
            NameTransformer.Chained _nameTransformer = ((NameTransformer.Chained) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$Chained"));
            setField(_nameTransformer, "com.fasterxml.jackson.databind.util.NameTransformer$Chained", "_t1", nopTransformer);
            setField(unwrappingBeanPropertyWriter1, "com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter", "_nameTransformer", _nameTransformer);
            SerializedString _name1 = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            setField(_name1, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
            setField(unwrappingBeanPropertyWriter1, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name1);
            setField(unwrappingBeanPropertyWriter1, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_accessorMethod", _accessorMethod);
            setField(unwrappingBeanPropertyWriter1, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_field", _field);
            setField(unwrappingBeanPropertyWriter1, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_format", _format);
            expected[0] = ((BeanPropertyWriter) unwrappingBeanPropertyWriter1);
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(NameTransformer.class, "NOP", prevNOP);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#rename(com.fasterxml.jackson.databind.ser.BeanPropertyWriter[],com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} twice
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testRename_BpwEqualsNull() throws Exception  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            Object nop = createInstance("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer");
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[2];
            AttributePropertyWriter attributePropertyWriter = ((AttributePropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter"));
            SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            String _value = "";
            setField(_name, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
            setField(attributePropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
            beanPropertyWriterArray[1] = ((BeanPropertyWriter) attributePropertyWriter);
            Object nopTransformer = createInstance("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer");
            Class chainedClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$Chained");
            Constructor chainedConstructor = chainedClazz.getDeclaredConstructor(nameTransformerClazz, nameTransformerClazz);
            chainedConstructor.setAccessible(true);
            java.lang.Object[] chainedConstructorArguments = new java.lang.Object[2];
            chainedConstructorArguments[0] = nopTransformer;
            chainedConstructorArguments[1] = nopTransformer;
            NameTransformer.Chained chained = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments));
            java.lang.Object[] chainedConstructorArguments1 = new java.lang.Object[2];
            chainedConstructorArguments1[0] = nopTransformer;
            chainedConstructorArguments1[1] = chained;
            NameTransformer.Chained chained1 = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments1));
            
            Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
            Class beanPropertyWriterArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;");
            Method renameMethod = beanSerializerBaseClazz.getDeclaredMethod("rename", beanPropertyWriterArrayType, nameTransformerClazz);
            renameMethod.setAccessible(true);
            java.lang.Object[] renameMethodArguments = new java.lang.Object[2];
            renameMethodArguments[0] = ((Object) beanPropertyWriterArray);
            renameMethodArguments[1] = chained1;
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter[]) renameMethod.invoke(null, renameMethodArguments));
            
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] expected = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[2];
            expected[1] = ((BeanPropertyWriter) attributePropertyWriter);
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
            
            BeanPropertyWriter finalBeanPropertyWriterArray0 = beanPropertyWriterArray[0];
            
            assertNull(finalBeanPropertyWriterArray0);
        } finally {
            setStaticField(NameTransformer.class, "NOP", prevNOP);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method rename([Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;, com.fasterxml.jackson.databind.util.NameTransformer)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#rename(com.fasterxml.jackson.databind.ser.BeanPropertyWriter[],com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: result[i] = bpw.rename(transformer);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testRename_ThrowIllegalStateException_1() throws Throwable  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            Object nop = createInstance("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer");
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
            UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
            SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            setField(unwrappingBeanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
            beanPropertyWriterArray[0] = ((BeanPropertyWriter) unwrappingBeanPropertyWriter);
            Object nopTransformer = createInstance("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer");
            
            Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
            Class beanPropertyWriterArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;");
            Method renameMethod = beanSerializerBaseClazz.getDeclaredMethod("rename", beanPropertyWriterArrayType, nameTransformerClazz);
            renameMethod.setAccessible(true);
            java.lang.Object[] renameMethodArguments = new java.lang.Object[2];
            renameMethodArguments[0] = ((Object) beanPropertyWriterArray);
            renameMethodArguments[1] = nopTransformer;
            try {
                renameMethod.invoke(null, renameMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(NameTransformer.class, "NOP", prevNOP);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#rename(com.fasterxml.jackson.databind.ser.BeanPropertyWriter[],com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: result[i] = bpw.rename(transformer);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testRename_ThrowIllegalStateException() throws Throwable  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            Object nop = createInstance("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer");
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
            UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
            SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            setField(unwrappingBeanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
            beanPropertyWriterArray[0] = ((BeanPropertyWriter) unwrappingBeanPropertyWriter);
            Object nopTransformer = createInstance("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer");
            Class chainedClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$Chained");
            Constructor chainedConstructor = chainedClazz.getDeclaredConstructor(nameTransformerClazz, nameTransformerClazz);
            chainedConstructor.setAccessible(true);
            java.lang.Object[] chainedConstructorArguments = new java.lang.Object[2];
            chainedConstructorArguments[0] = nopTransformer;
            chainedConstructorArguments[1] = nopTransformer;
            NameTransformer.Chained chained = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments));
            
            Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
            Class beanPropertyWriterArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;");
            Method renameMethod = beanSerializerBaseClazz.getDeclaredMethod("rename", beanPropertyWriterArrayType, nameTransformerClazz);
            renameMethod.setAccessible(true);
            java.lang.Object[] renameMethodArguments = new java.lang.Object[2];
            renameMethodArguments[0] = ((Object) beanPropertyWriterArray);
            renameMethodArguments[1] = chained;
            try {
                renameMethod.invoke(null, renameMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(NameTransformer.class, "NOP", prevNOP);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method rename([Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;, com.fasterxml.jackson.databind.util.NameTransformer)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#rename(com.fasterxml.jackson.databind.ser.BeanPropertyWriter[],com.fasterxml.jackson.databind.util.NameTransformer)}
     */
    @Test
    public void testRenameWithNonEmptyObjectArray() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = {null, null, null};
        NameTransformer.Chained chained = new NameTransformer.Chained(null, null);
        NameTransformer.Chained chained1 = new NameTransformer.Chained(null, null);
        NameTransformer.Chained chained2 = new NameTransformer.Chained(chained, chained1);
        
        Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class beanPropertyWriterArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;");
        Class chained2Type = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Method renameMethod = beanSerializerBaseClazz.getDeclaredMethod("rename", beanPropertyWriterArrayType, chained2Type);
        renameMethod.setAccessible(true);
        java.lang.Object[] renameMethodArguments = new java.lang.Object[2];
        renameMethodArguments[0] = ((Object) beanPropertyWriterArray);
        renameMethodArguments[1] = chained2;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter[]) renameMethod.invoke(null, renameMethodArguments));
        
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] expected = {null, null, null};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        BeanPropertyWriter finalBeanPropertyWriterArray0 = beanPropertyWriterArray[0];
        BeanPropertyWriter finalBeanPropertyWriterArray1 = beanPropertyWriterArray[1];
        BeanPropertyWriter finalBeanPropertyWriterArray2 = beanPropertyWriterArray[2];
        
        assertNull(finalBeanPropertyWriterArray0);
        
        assertNull(finalBeanPropertyWriterArray1);
        
        assertNull(finalBeanPropertyWriterArray2);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.acceptJsonFormatVisitor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (visitor == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_VisitorEqualsNull() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        
        beanSerializer.acceptJsonFormatVisitor(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (visitor == null): False}
 * @utbot.executesCondition {@code (objectVisitor == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_ObjectVisitorEqualsNull_1() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        JsonFormatVisitorWrapper.Base base = new JsonFormatVisitorWrapper.Base();
        
        beanSerializer.acceptJsonFormatVisitor(base, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (visitor == null): False}
 * @utbot.executesCondition {@code (objectVisitor == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_ObjectVisitorEqualsNull() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        
        beanSerializer.acceptJsonFormatVisitor(anonymousBase, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (visitor == null): False}
 * @utbot.executesCondition {@code (objectVisitor == null): False}
 * @utbot.executesCondition {@code (_propertyFilterId != null): False}
 * @utbot.executesCondition {@code (((_filteredProps == null) || (provider == null))): True}
 * @utbot.executesCondition {@code (((_filteredProps == null) || (provider == null))): False}
 * @utbot.executesCondition {@code (view != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper#getProvider()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getActiveView()}
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_ViewNotEqualsNull() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = {};
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base val$visitor = ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base) createInstance("com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor$Base"));
        setField(anonymousBase, "com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1", "val$visitor", val$visitor);
        DefaultSerializerProvider.Impl _provider = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        Class _serializationView = Object.class;
        setField(_provider, "com.fasterxml.jackson.databind.SerializerProvider", "_serializationView", _serializationView);
        setField(anonymousBase, "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper$Base", "_provider", _provider);
        
        SerializerProvider anonymousBase_provider = ((SerializerProvider) getFieldValue(anonymousBase, "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper$Base", "_provider"));
        Class initialAnonymousBase_provider_serializationView = ((Class) getFieldValue(anonymousBase_provider, "com.fasterxml.jackson.databind.SerializerProvider", "_serializationView"));
        
        beanSerializer.acceptJsonFormatVisitor(anonymousBase, null);
        
        SerializerProvider anonymousBase_provider1 = ((SerializerProvider) getFieldValue(anonymousBase, "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper$Base", "_provider"));
        Class finalAnonymousBase_provider_serializationView = ((Class) getFieldValue(anonymousBase_provider1, "com.fasterxml.jackson.databind.SerializerProvider", "_serializationView"));
        
        assertFalse(initialAnonymousBase_provider_serializationView == finalAnonymousBase_provider_serializationView);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper, com.fasterxml.jackson.databind.JavaType)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (visitor == null): False}
    /// invoke:
    ///     {@link com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper#expectObjectFormat(com.fasterxml.jackson.databind.JavaType)} once
    /// execute conditions:
    ///     {@code (objectVisitor == null): False}
    /// invoke:
    ///     {@link com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper#getProvider()} once
    /// execute conditions:
    ///     {@code (_propertyFilterId != null): False},
    ///     {@code (view != null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (((_filteredProps == null) || (provider == null))): True}
 * @utbot.executesCondition {@code (((_filteredProps == null) || (provider == null))): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0, end = props.length; i < end; ++i)} once
 *  */
    @Test
    public void testAcceptJsonFormatVisitor__filteredPropsEqualsNullOrProviderEqualsNull() throws Exception  {
        BeanAsArraySerializer beanAsArraySerializer = ((BeanAsArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
        AttributePropertyWriter attributePropertyWriter = ((AttributePropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter"));
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(attributePropertyWriter, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        _props[0] = ((BeanPropertyWriter) attributePropertyWriter);
        setField(beanAsArraySerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = {null};
        setField(beanAsArraySerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base val$visitor = ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base) createInstance("com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor$Base"));
        setField(anonymousBase, "com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1", "val$visitor", val$visitor);
        
        beanAsArraySerializer.acceptJsonFormatVisitor(anonymousBase, null);
        
        BeanPropertyWriter finalBeanAsArraySerializer_filteredProps0 = beanAsArraySerializer._filteredProps[0];
        
        assertNull(finalBeanAsArraySerializer_filteredProps0);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (((_filteredProps == null) || (provider == null))): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0, end = props.length; i < end; ++i)} once
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_PropEqualsNull() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = {null};
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base val$visitor = ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base) createInstance("com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor$Base"));
        setField(anonymousBase, "com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1", "val$visitor", val$visitor);
        DefaultSerializerProvider.Impl _provider = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        setField(anonymousBase, "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper$Base", "_provider", _provider);
        
        beanSerializer.acceptJsonFormatVisitor(anonymousBase, null);
        
        BeanPropertyWriter finalBeanSerializer_props0 = beanSerializer._props[0];
        
        assertNull(finalBeanSerializer_props0);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (((_filteredProps == null) || (provider == null))): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0, end = props.length; i < end; ++i)} once
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_PropNotEqualsNull() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = ((UnwrappingBeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
        AttributePropertyWriter attributePropertyWriter = ((AttributePropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter"));
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = true;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(attributePropertyWriter, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        _props[0] = ((BeanPropertyWriter) attributePropertyWriter);
        setField(unwrappingBeanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base val$visitor = ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base) createInstance("com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor$Base"));
        setField(anonymousBase, "com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1", "val$visitor", val$visitor);
        DefaultSerializerProvider.Impl _provider = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        setField(anonymousBase, "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper$Base", "_provider", _provider);
        
        unwrappingBeanSerializer.acceptJsonFormatVisitor(anonymousBase, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (((_filteredProps == null) || (provider == null))): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0, end = props.length; i < end; ++i)} once
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_PropNotEqualsNull_1() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = ((UnwrappingBeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
        AttributePropertyWriter attributePropertyWriter = ((AttributePropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter"));
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = false;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(attributePropertyWriter, "com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase", "_metadata", _metadata);
        _props[0] = ((BeanPropertyWriter) attributePropertyWriter);
        setField(unwrappingBeanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base val$visitor = ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base) createInstance("com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor$Base"));
        setField(anonymousBase, "com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1", "val$visitor", val$visitor);
        DefaultSerializerProvider.Impl _provider = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        setField(anonymousBase, "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper$Base", "_provider", _provider);
        
        unwrappingBeanSerializer.acceptJsonFormatVisitor(anonymousBase, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (_propertyFilterId != null): False}
 * @utbot.executesCondition {@code (((_filteredProps == null) || (provider == null))): True}
 * @utbot.executesCondition {@code (((_filteredProps == null) || (provider == null))): False}
 * @utbot.executesCondition {@code (view != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getActiveView()}
 * @utbot.iterates iterate the loop {@code for(int i = 0, end = props.length; i < end; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: prop.depositSchemaProperty(objectVisitor, provider);
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = ((UnwrappingBeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
        UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
        ReferenceType _declaredType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_declaredType, "com.fasterxml.jackson.databind.JavaType", "_hash", Integer.MIN_VALUE);
        setField(unwrappingBeanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_declaredType", _declaredType);
        _filteredProps[0] = ((BeanPropertyWriter) unwrappingBeanPropertyWriter);
        setField(unwrappingBeanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base val$visitor = ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base) createInstance("com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor$Base"));
        setField(anonymousBase, "com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1", "val$visitor", val$visitor);
        DefaultSerializerProvider.Impl _provider = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        Class _serializationView = Object.class;
        setField(_provider, "com.fasterxml.jackson.databind.SerializerProvider", "_serializationView", _serializationView);
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", 1);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_mask", 1073741824);
        setField(_provider, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        setField(anonymousBase, "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper$Base", "_provider", _provider);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.acceptJsonFormatVisitor] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap.untypedValueSerializer(ReadOnlyClassToSerializerMap.java:102)
            com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:522)
            com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter.depositSchemaProperty(UnwrappingBeanPropertyWriter.java:158)
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.acceptJsonFormatVisitor(BeanSerializerBase.java:819) */
        unwrappingBeanSerializer.acceptJsonFormatVisitor(anonymousBase, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (_propertyFilterId != null): False}
 * @utbot.executesCondition {@code (((_filteredProps == null) || (provider == null))): True}
 * @utbot.executesCondition {@code (((_filteredProps == null) || (provider == null))): True}
 * @utbot.executesCondition {@code (view != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0, end = props.length; i < end; ++i)
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_ThrowNullPointerException() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = {null};
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base val$visitor = ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base) createInstance("com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor$Base"));
        setField(anonymousBase, "com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1", "val$visitor", val$visitor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.acceptJsonFormatVisitor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.acceptJsonFormatVisitor(BeanSerializerBase.java:816) */
        beanSerializer.acceptJsonFormatVisitor(anonymousBase, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (_propertyFilterId != null): False}
 * @utbot.executesCondition {@code (((_filteredProps == null) || (provider == null))): False}
 * @utbot.executesCondition {@code (view != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0, end = props.length; i < end; ++i)
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_ThrowNullPointerException_1() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base val$visitor = ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base) createInstance("com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor$Base"));
        setField(anonymousBase, "com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1", "val$visitor", val$visitor);
        DefaultSerializerProvider.Impl _provider = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        setField(anonymousBase, "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper$Base", "_provider", _provider);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.acceptJsonFormatVisitor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.acceptJsonFormatVisitor(BeanSerializerBase.java:816) */
        beanSerializer.acceptJsonFormatVisitor(anonymousBase, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (_propertyFilterId != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper#getProvider()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#findPropertyFilter(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0, end = _props.length; i < end; ++i)
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_ThrowNullPointerException_2() throws Exception  {
        BeanAsArraySerializer beanAsArraySerializer = ((BeanAsArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer"));
        byte[] _propertyFilterId = {};
        setField(beanAsArraySerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_propertyFilterId", _propertyFilterId);
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base val$visitor = ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base) createInstance("com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor$Base"));
        setField(anonymousBase, "com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1", "val$visitor", val$visitor);
        DefaultSerializerProvider.Impl _provider = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        SimpleFilterProvider _filterProvider = ((SimpleFilterProvider) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider"));
        LinkedHashMap _filtersById = new LinkedHashMap();
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_filtersById", _filtersById);
        SimpleBeanPropertyFilter.SerializeExceptFilter _defaultFilter = ((SimpleBeanPropertyFilter.SerializeExceptFilter) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter$SerializeExceptFilter"));
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_defaultFilter", _defaultFilter);
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider", _filterProvider);
        setField(_provider, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        setField(anonymousBase, "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper$Base", "_provider", _provider);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.acceptJsonFormatVisitor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.acceptJsonFormatVisitor(BeanSerializerBase.java:803) */
        beanAsArraySerializer.acceptJsonFormatVisitor(anonymousBase, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeWithType
    
    ///region Errors report for serializeWithType
    
    public void testSerializeWithType_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 10 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Field
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.getSchema
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSchema(com.fasterxml.jackson.databind.SerializerProvider, java.lang.reflect.Type)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#getSchema(com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#createSchemaNode(java.lang.String,boolean)}
 * @utbot.invokes {@link java.lang.Class#getAnnotation(java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonSerializableSchema ann = _handledType.getAnnotation(JsonSerializableSchema.class);
 *  */
    @Test
    public void testGetSchema_ThrowNullPointerException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, JsonMappingException  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(null, null, null);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.getSchema] produces [java.lang.NullPointerException] */
            unwrappingBeanSerializer.getSchema(null, null);
        } finally {
            setStaticField(JsonNodeFactory.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.BeanSerializerBase._serializeObjectId
    
    ///region Errors report for _serializeObjectId
    
    public void test_serializeObjectId_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Field
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.createContextual
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (shape == JsonFormat.Shape.ARRAY): True}
 * @utbot.returnsFrom {@code return contextual.asArraySerializer();}
 *  */
    @Test
    public void testCreateContextual_ShapeEqualsJsonFormatShapeARRAY_1() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        Object _propertyFilterId = createInstance("java.lang.Object");
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_propertyFilterId", _propertyFilterId);
        JsonFormat.Shape _serializationShape = JsonFormat.Shape.ARRAY;
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_serializationShape", _serializationShape);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        BeanSerializer actual = ((BeanSerializer) beanSerializer.createContextual(impl, null));
        
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual_props = actual._props;
        assertNull(actual_props);
        
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual_filteredProps = actual._filteredProps;
        assertNull(actual_filteredProps);
        
        AnyGetterWriter actual_anyGetterWriter = actual._anyGetterWriter;
        assertNull(actual_anyGetterWriter);
        
        Object beanSerializer_propertyFilterId = beanSerializer._propertyFilterId;
        Object actual_propertyFilterId = actual._propertyFilterId;
        
        AnnotatedMember actual_typeId = actual._typeId;
        assertNull(actual_typeId);
        
        ObjectIdWriter actual_objectIdWriter = actual._objectIdWriter;
        assertNull(actual_objectIdWriter);
        
        JsonFormat.Shape beanSerializer_serializationShape = beanSerializer._serializationShape;
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertEquals(beanSerializer_serializationShape, actual_serializationShape);
        
        Class actual_handledType = actual._handledType;
        assertNull(actual_handledType);
        
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (shape == JsonFormat.Shape.ARRAY): False}
 * @utbot.returnsFrom {@code return contextual;}
 *  */
    @Test
    public void testCreateContextual_ShapeNotEqualsJsonFormatShapeARRAY() throws Exception  {
        BeanAsArraySerializer beanAsArraySerializer = ((BeanAsArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        BeanAsArraySerializer actual = ((BeanAsArraySerializer) beanAsArraySerializer.createContextual(impl, null));
        
        BeanSerializerBase actual_defaultSerializer = ((BeanSerializerBase) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer", "_defaultSerializer"));
        assertNull(actual_defaultSerializer);
        
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual_props = actual._props;
        assertNull(actual_props);
        
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual_filteredProps = actual._filteredProps;
        assertNull(actual_filteredProps);
        
        AnyGetterWriter actual_anyGetterWriter = actual._anyGetterWriter;
        assertNull(actual_anyGetterWriter);
        
        Object actual_propertyFilterId = actual._propertyFilterId;
        assertNull(actual_propertyFilterId);
        
        AnnotatedMember actual_typeId = actual._typeId;
        assertNull(actual_typeId);
        
        ObjectIdWriter actual_objectIdWriter = actual._objectIdWriter;
        assertNull(actual_objectIdWriter);
        
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertNull(actual_serializationShape);
        
        Class actual_handledType = actual._handledType;
        assertNull(actual_handledType);
        
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (shape == JsonFormat.Shape.ARRAY): True}
 * @utbot.returnsFrom {@code return contextual.asArraySerializer();}
 *  */
    @Test
    public void testCreateContextual_ShapeEqualsJsonFormatShapeARRAY() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        AnyGetterWriter _anyGetterWriter = ((AnyGetterWriter) createInstance("com.fasterxml.jackson.databind.ser.AnyGetterWriter"));
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_anyGetterWriter", _anyGetterWriter);
        JsonFormat.Shape _serializationShape = JsonFormat.Shape.ARRAY;
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_serializationShape", _serializationShape);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        BeanSerializer actual = ((BeanSerializer) beanSerializer.createContextual(impl, null));
        
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual_props = actual._props;
        assertNull(actual_props);
        
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual_filteredProps = actual._filteredProps;
        assertNull(actual_filteredProps);
        
        AnyGetterWriter beanSerializer_anyGetterWriter = beanSerializer._anyGetterWriter;
        AnyGetterWriter actual_anyGetterWriter = actual._anyGetterWriter;
        BeanProperty actual_anyGetterWriter_property = ((BeanProperty) getFieldValue(actual_anyGetterWriter, "com.fasterxml.jackson.databind.ser.AnyGetterWriter", "_property"));
        assertNull(actual_anyGetterWriter_property);
        
        AnnotatedMember actual_anyGetterWriter_accessor = ((AnnotatedMember) getFieldValue(actual_anyGetterWriter, "com.fasterxml.jackson.databind.ser.AnyGetterWriter", "_accessor"));
        assertNull(actual_anyGetterWriter_accessor);
        
        JsonSerializer actual_anyGetterWriter_serializer = ((JsonSerializer) getFieldValue(actual_anyGetterWriter, "com.fasterxml.jackson.databind.ser.AnyGetterWriter", "_serializer"));
        assertNull(actual_anyGetterWriter_serializer);
        
        MapSerializer actual_anyGetterWriter_mapSerializer = ((MapSerializer) getFieldValue(actual_anyGetterWriter, "com.fasterxml.jackson.databind.ser.AnyGetterWriter", "_mapSerializer"));
        assertNull(actual_anyGetterWriter_mapSerializer);
        
        Object actual_propertyFilterId = actual._propertyFilterId;
        assertNull(actual_propertyFilterId);
        
        AnnotatedMember actual_typeId = actual._typeId;
        assertNull(actual_typeId);
        
        ObjectIdWriter actual_objectIdWriter = actual._objectIdWriter;
        assertNull(actual_objectIdWriter);
        
        JsonFormat.Shape beanSerializer_serializationShape = beanSerializer._serializationShape;
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertEquals(beanSerializer_serializationShape, actual_serializationShape);
        
        Class actual_handledType = actual._handledType;
        assertNull(actual_handledType);
        
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code ((property == null || intr == null)): True}
 * @utbot.executesCondition {@code (shape == JsonFormat.Shape.ARRAY): False}
 * @utbot.returnsFrom {@code return contextual;}
 *  */
    @Test
    public void testCreateContextual_ShapeNotEqualsJsonFormatShapeARRAY_1() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ValueInjector valueInjector = new ValueInjector(((PropertyName) null), ((JavaType) null), ((Annotations) null), ((AnnotatedMember) null), ((Object) null));
        
        Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = beanSerializerBaseClazz.getDeclaredMethod("createContextual", implType, valueInjectorType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = valueInjector;
        BeanSerializer actual = ((BeanSerializer) createContextualMethod.invoke(beanSerializer, createContextualMethodArguments));
        
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual_props = actual._props;
        assertNull(actual_props);
        
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual_filteredProps = actual._filteredProps;
        assertNull(actual_filteredProps);
        
        AnyGetterWriter actual_anyGetterWriter = actual._anyGetterWriter;
        assertNull(actual_anyGetterWriter);
        
        Object actual_propertyFilterId = actual._propertyFilterId;
        assertNull(actual_propertyFilterId);
        
        AnnotatedMember actual_typeId = actual._typeId;
        assertNull(actual_typeId);
        
        ObjectIdWriter actual_objectIdWriter = actual._objectIdWriter;
        assertNull(actual_objectIdWriter);
        
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertNull(actual_serializationShape);
        
        Class actual_handledType = actual._handledType;
        assertNull(actual_handledType);
        
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code ((property == null || intr == null)): True}
 * @utbot.executesCondition {@code (shape == JsonFormat.Shape.ARRAY): True}
 * @utbot.returnsFrom {@code return contextual.asArraySerializer();}
 *  */
    @Test
    public void testCreateContextual_ShapeEqualsJsonFormatShapeARRAY_2() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = ((UnwrappingBeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer"));
        JsonFormat.Shape _serializationShape = JsonFormat.Shape.ARRAY;
        setField(unwrappingBeanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_serializationShape", _serializationShape);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ValueInjector valueInjector = new ValueInjector(((PropertyName) null), ((JavaType) null), ((Annotations) null), ((AnnotatedMember) null), ((Object) null));
        
        Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class valueInjectorType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = beanSerializerBaseClazz.getDeclaredMethod("createContextual", implType, valueInjectorType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = valueInjector;
        UnwrappingBeanSerializer actual = ((UnwrappingBeanSerializer) createContextualMethod.invoke(unwrappingBeanSerializer, createContextualMethodArguments));
        
        NameTransformer actual_nameTransformer = ((NameTransformer) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer", "_nameTransformer"));
        assertNull(actual_nameTransformer);
        
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual_props = actual._props;
        assertNull(actual_props);
        
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual_filteredProps = actual._filteredProps;
        assertNull(actual_filteredProps);
        
        AnyGetterWriter actual_anyGetterWriter = actual._anyGetterWriter;
        assertNull(actual_anyGetterWriter);
        
        Object actual_propertyFilterId = actual._propertyFilterId;
        assertNull(actual_propertyFilterId);
        
        AnnotatedMember actual_typeId = actual._typeId;
        assertNull(actual_typeId);
        
        ObjectIdWriter actual_objectIdWriter = actual._objectIdWriter;
        assertNull(actual_objectIdWriter);
        
        JsonFormat.Shape unwrappingBeanSerializer_serializationShape = unwrappingBeanSerializer._serializationShape;
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertEquals(unwrappingBeanSerializer_serializationShape, actual_serializationShape);
        
        Class actual_handledType = actual._handledType;
        assertNull(actual_handledType);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code ((property == null || intr == null)): True}
 * @utbot.executesCondition {@code (accessor != null): False}
 * @utbot.executesCondition {@code (accessor != null): False}
 * @utbot.executesCondition {@code (oiw != null): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: JsonSerializer<?> ser = provider.findValueSerializer(oiw.idType, property);
 *  */
    @Test
    public void testCreateContextual_ThrowIndexOutOfBoundsException() throws Throwable  {
        BeanAsArraySerializer beanAsArraySerializer = new BeanAsArraySerializer(null);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", 1);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_mask", -2);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.createContextual] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class managedReferencePropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = beanSerializerBaseClazz.getDeclaredMethod("createContextual", implType, managedReferencePropertyType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = managedReferenceProperty;
        try {
            createContextualMethod.invoke(beanAsArraySerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code ((property == null || intr == null)): False}
 * @utbot.executesCondition {@code (accessor != null): False}
 * @utbot.executesCondition {@code (accessor != null): False}
 * @utbot.executesCondition {@code (oiw != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanProperty#getMember()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: JsonSerializer<?> ser = provider.findValueSerializer(oiw.idType, property);
 *  */
    @Test
    public void testCreateContextual_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        BeanAsArraySerializer beanAsArraySerializer = new BeanAsArraySerializer(null);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", 1);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_mask", 1073741824);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        Object singleView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$SingleView");
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.createContextual] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class singleViewType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = beanSerializerBaseClazz.getDeclaredMethod("createContextual", implType, singleViewType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = singleView;
        try {
            createContextualMethod.invoke(beanAsArraySerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final AnnotationIntrospector intr = provider.getAnnotationIntrospector();
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException() throws JsonMappingException  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(((UnwrappingBeanSerializer) null), ((ObjectIdWriter) null));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.createContextual] produces [java.lang.NullPointerException] */
        unwrappingBeanSerializer.createContextual(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty)
    
    @Test
    public void testCreateContextual1() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            
            BeanSerializer actual = ((BeanSerializer) beanSerializer.createContextual(impl, null));
            
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual_props = actual._props;
            assertNull(actual_props);
            
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual_filteredProps = actual._filteredProps;
            assertNull(actual_filteredProps);
            
            AnyGetterWriter actual_anyGetterWriter = actual._anyGetterWriter;
            assertNull(actual_anyGetterWriter);
            
            Object actual_propertyFilterId = actual._propertyFilterId;
            assertNull(actual_propertyFilterId);
            
            AnnotatedMember actual_typeId = actual._typeId;
            assertNull(actual_typeId);
            
            ObjectIdWriter actual_objectIdWriter = actual._objectIdWriter;
            assertNull(actual_objectIdWriter);
            
            JsonFormat.Shape actual_serializationShape = actual._serializationShape;
            assertNull(actual_serializationShape);
            
            Class actual_handledType = actual._handledType;
            assertNull(actual_handledType);
            
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void testCreateContextual2() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        JsonFormat.Shape _serializationShape = JsonFormat.Shape.ARRAY;
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_serializationShape", _serializationShape);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        AttributePropertyWriter attributePropertyWriter = ((AttributePropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter"));
        
        Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class attributePropertyWriterType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = beanSerializerBaseClazz.getDeclaredMethod("createContextual", implType, attributePropertyWriterType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = attributePropertyWriter;
        BeanAsArraySerializer actual = ((BeanAsArraySerializer) createContextualMethod.invoke(beanSerializer, createContextualMethodArguments));
        
        BeanAsArraySerializer expected = ((BeanAsArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer"));
        setField(expected, "com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer", "_defaultSerializer", beanSerializer);
        setField(expected, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_serializationShape", _serializationShape);
        
        BeanSerializerBase expected_defaultSerializer = ((BeanSerializerBase) getFieldValue(expected, "com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer", "_defaultSerializer"));
        BeanSerializerBase actual_defaultSerializer = ((BeanSerializerBase) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer", "_defaultSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual_defaultSerializer_props = actual_defaultSerializer._props;
        assertNull(actual_defaultSerializer_props);
        
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual_defaultSerializer_filteredProps = actual_defaultSerializer._filteredProps;
        assertNull(actual_defaultSerializer_filteredProps);
        
        AnyGetterWriter actual_defaultSerializer_anyGetterWriter = actual_defaultSerializer._anyGetterWriter;
        assertNull(actual_defaultSerializer_anyGetterWriter);
        
        Object actual_defaultSerializer_propertyFilterId = actual_defaultSerializer._propertyFilterId;
        assertNull(actual_defaultSerializer_propertyFilterId);
        
        AnnotatedMember actual_defaultSerializer_typeId = actual_defaultSerializer._typeId;
        assertNull(actual_defaultSerializer_typeId);
        
        ObjectIdWriter actual_defaultSerializer_objectIdWriter = actual_defaultSerializer._objectIdWriter;
        assertNull(actual_defaultSerializer_objectIdWriter);
        
        JsonFormat.Shape expected_defaultSerializer_serializationShape = expected_defaultSerializer._serializationShape;
        JsonFormat.Shape actual_defaultSerializer_serializationShape = actual_defaultSerializer._serializationShape;
        assertEquals(expected_defaultSerializer_serializationShape, actual_defaultSerializer_serializationShape);
        
        Class actual_defaultSerializer_handledType = actual_defaultSerializer._handledType;
        assertNull(actual_defaultSerializer_handledType);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testCreateContextual3() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        JsonFormat.Shape _serializationShape = JsonFormat.Shape.ARRAY;
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_serializationShape", _serializationShape);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        BeanAsArraySerializer actual = ((BeanAsArraySerializer) beanSerializer.createContextual(impl, null));
        
        BeanAsArraySerializer expected = ((BeanAsArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer"));
        setField(expected, "com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer", "_defaultSerializer", beanSerializer);
        setField(expected, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_serializationShape", _serializationShape);
        
        BeanSerializerBase expected_defaultSerializer = ((BeanSerializerBase) getFieldValue(expected, "com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer", "_defaultSerializer"));
        BeanSerializerBase actual_defaultSerializer = ((BeanSerializerBase) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer", "_defaultSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual_defaultSerializer_props = actual_defaultSerializer._props;
        assertNull(actual_defaultSerializer_props);
        
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual_defaultSerializer_filteredProps = actual_defaultSerializer._filteredProps;
        assertNull(actual_defaultSerializer_filteredProps);
        
        AnyGetterWriter actual_defaultSerializer_anyGetterWriter = actual_defaultSerializer._anyGetterWriter;
        assertNull(actual_defaultSerializer_anyGetterWriter);
        
        Object actual_defaultSerializer_propertyFilterId = actual_defaultSerializer._propertyFilterId;
        assertNull(actual_defaultSerializer_propertyFilterId);
        
        AnnotatedMember actual_defaultSerializer_typeId = actual_defaultSerializer._typeId;
        assertNull(actual_defaultSerializer_typeId);
        
        ObjectIdWriter actual_defaultSerializer_objectIdWriter = actual_defaultSerializer._objectIdWriter;
        assertNull(actual_defaultSerializer_objectIdWriter);
        
        JsonFormat.Shape expected_defaultSerializer_serializationShape = expected_defaultSerializer._serializationShape;
        JsonFormat.Shape actual_defaultSerializer_serializationShape = actual_defaultSerializer._serializationShape;
        assertEquals(expected_defaultSerializer_serializationShape, actual_defaultSerializer_serializationShape);
        
        Class actual_defaultSerializer_handledType = actual_defaultSerializer._handledType;
        assertNull(actual_defaultSerializer_handledType);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testCreateContextual4() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        ObjectIdWriter _objectIdWriter = ((ObjectIdWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"));
        MapLikeType idType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(idType, "com.fasterxml.jackson.databind.JavaType", "_hash", Integer.MIN_VALUE);
        setField(_objectIdWriter, "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "idType", idType);
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_objectIdWriter", _objectIdWriter);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", 39);
        Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket");
        UnknownSerializer value = ((UnknownSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer"));
        setField(bucket, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", "value", value);
        setField(bucket, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", "_type", idType);
        _buckets[38] = bucket;
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_mask", 38);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        AttributePropertyWriter attributePropertyWriter = ((AttributePropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter"));
        
        Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class attributePropertyWriterType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = beanSerializerBaseClazz.getDeclaredMethod("createContextual", implType, attributePropertyWriterType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = attributePropertyWriter;
        BeanSerializer actual = ((BeanSerializer) createContextualMethod.invoke(beanSerializer, createContextualMethodArguments));
        
        BeanSerializer expected = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        ObjectIdWriter _objectIdWriter1 = ((ObjectIdWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"));
        setField(_objectIdWriter1, "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "idType", idType);
        setField(_objectIdWriter1, "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "serializer", value);
        setField(expected, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_objectIdWriter", _objectIdWriter1);
        
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual_props = actual._props;
        assertNull(actual_props);
        
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual_filteredProps = actual._filteredProps;
        assertNull(actual_filteredProps);
        
        AnyGetterWriter actual_anyGetterWriter = actual._anyGetterWriter;
        assertNull(actual_anyGetterWriter);
        
        Object actual_propertyFilterId = actual._propertyFilterId;
        assertNull(actual_propertyFilterId);
        
        AnnotatedMember actual_typeId = actual._typeId;
        assertNull(actual_typeId);
        
        ObjectIdWriter expected_objectIdWriter = expected._objectIdWriter;
        ObjectIdWriter actual_objectIdWriter = actual._objectIdWriter;
        JavaType expected_objectIdWriterIdType = expected_objectIdWriter.idType;
        JavaType actual_objectIdWriterIdType = actual_objectIdWriter.idType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_objectIdWriterIdType, actual_objectIdWriterIdType);
        
        SerializableString actual_objectIdWriterPropertyName = actual_objectIdWriter.propertyName;
        assertNull(actual_objectIdWriterPropertyName);
        
        ObjectIdGenerator actual_objectIdWriterGenerator = actual_objectIdWriter.generator;
        assertNull(actual_objectIdWriterGenerator);
        
        JsonSerializer expected_objectIdWriterSerializer = expected_objectIdWriter.serializer;
        JsonSerializer actual_objectIdWriterSerializer = actual_objectIdWriter.serializer;
        Class actual_objectIdWriterSerializer_handledType = ((Class) getFieldValue(actual_objectIdWriterSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
        assertNull(actual_objectIdWriterSerializer_handledType);
        
        boolean actual_objectIdWriterAlwaysAsId = actual_objectIdWriter.alwaysAsId;
        assertFalse(actual_objectIdWriterAlwaysAsId);
        
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertNull(actual_serializationShape);
        
        assertTrue(deepEquals(expected, actual));
        
        ReadOnlyClassToSerializerMap impl_knownSerializers = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers_knownSerializers_buckets = getFieldValue(impl_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets0 = get(impl_knownSerializers_knownSerializers_buckets, 0);
        ReadOnlyClassToSerializerMap impl_knownSerializers1 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers1_knownSerializers_buckets = getFieldValue(impl_knownSerializers1, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets1 = get(impl_knownSerializers1_knownSerializers_buckets, 1);
        ReadOnlyClassToSerializerMap impl_knownSerializers2 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers2_knownSerializers_buckets = getFieldValue(impl_knownSerializers2, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets2 = get(impl_knownSerializers2_knownSerializers_buckets, 2);
        ReadOnlyClassToSerializerMap impl_knownSerializers3 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers3_knownSerializers_buckets = getFieldValue(impl_knownSerializers3, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets3 = get(impl_knownSerializers3_knownSerializers_buckets, 3);
        ReadOnlyClassToSerializerMap impl_knownSerializers4 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers4_knownSerializers_buckets = getFieldValue(impl_knownSerializers4, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets4 = get(impl_knownSerializers4_knownSerializers_buckets, 4);
        ReadOnlyClassToSerializerMap impl_knownSerializers5 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers5_knownSerializers_buckets = getFieldValue(impl_knownSerializers5, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets5 = get(impl_knownSerializers5_knownSerializers_buckets, 5);
        ReadOnlyClassToSerializerMap impl_knownSerializers6 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers6_knownSerializers_buckets = getFieldValue(impl_knownSerializers6, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets6 = get(impl_knownSerializers6_knownSerializers_buckets, 6);
        ReadOnlyClassToSerializerMap impl_knownSerializers7 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers7_knownSerializers_buckets = getFieldValue(impl_knownSerializers7, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets7 = get(impl_knownSerializers7_knownSerializers_buckets, 7);
        ReadOnlyClassToSerializerMap impl_knownSerializers8 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers8_knownSerializers_buckets = getFieldValue(impl_knownSerializers8, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets8 = get(impl_knownSerializers8_knownSerializers_buckets, 8);
        ReadOnlyClassToSerializerMap impl_knownSerializers9 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers9_knownSerializers_buckets = getFieldValue(impl_knownSerializers9, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets9 = get(impl_knownSerializers9_knownSerializers_buckets, 9);
        ReadOnlyClassToSerializerMap impl_knownSerializers10 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers10_knownSerializers_buckets = getFieldValue(impl_knownSerializers10, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets10 = get(impl_knownSerializers10_knownSerializers_buckets, 10);
        ReadOnlyClassToSerializerMap impl_knownSerializers11 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers11_knownSerializers_buckets = getFieldValue(impl_knownSerializers11, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets11 = get(impl_knownSerializers11_knownSerializers_buckets, 11);
        ReadOnlyClassToSerializerMap impl_knownSerializers12 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers12_knownSerializers_buckets = getFieldValue(impl_knownSerializers12, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets12 = get(impl_knownSerializers12_knownSerializers_buckets, 12);
        ReadOnlyClassToSerializerMap impl_knownSerializers13 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers13_knownSerializers_buckets = getFieldValue(impl_knownSerializers13, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets13 = get(impl_knownSerializers13_knownSerializers_buckets, 13);
        ReadOnlyClassToSerializerMap impl_knownSerializers14 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers14_knownSerializers_buckets = getFieldValue(impl_knownSerializers14, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets14 = get(impl_knownSerializers14_knownSerializers_buckets, 14);
        ReadOnlyClassToSerializerMap impl_knownSerializers15 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers15_knownSerializers_buckets = getFieldValue(impl_knownSerializers15, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets15 = get(impl_knownSerializers15_knownSerializers_buckets, 15);
        ReadOnlyClassToSerializerMap impl_knownSerializers16 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers16_knownSerializers_buckets = getFieldValue(impl_knownSerializers16, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets16 = get(impl_knownSerializers16_knownSerializers_buckets, 16);
        ReadOnlyClassToSerializerMap impl_knownSerializers17 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers17_knownSerializers_buckets = getFieldValue(impl_knownSerializers17, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets17 = get(impl_knownSerializers17_knownSerializers_buckets, 17);
        ReadOnlyClassToSerializerMap impl_knownSerializers18 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers18_knownSerializers_buckets = getFieldValue(impl_knownSerializers18, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets18 = get(impl_knownSerializers18_knownSerializers_buckets, 18);
        ReadOnlyClassToSerializerMap impl_knownSerializers19 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers19_knownSerializers_buckets = getFieldValue(impl_knownSerializers19, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets19 = get(impl_knownSerializers19_knownSerializers_buckets, 19);
        ReadOnlyClassToSerializerMap impl_knownSerializers20 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers20_knownSerializers_buckets = getFieldValue(impl_knownSerializers20, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets20 = get(impl_knownSerializers20_knownSerializers_buckets, 20);
        ReadOnlyClassToSerializerMap impl_knownSerializers21 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers21_knownSerializers_buckets = getFieldValue(impl_knownSerializers21, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets21 = get(impl_knownSerializers21_knownSerializers_buckets, 21);
        ReadOnlyClassToSerializerMap impl_knownSerializers22 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers22_knownSerializers_buckets = getFieldValue(impl_knownSerializers22, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets22 = get(impl_knownSerializers22_knownSerializers_buckets, 22);
        ReadOnlyClassToSerializerMap impl_knownSerializers23 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers23_knownSerializers_buckets = getFieldValue(impl_knownSerializers23, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets23 = get(impl_knownSerializers23_knownSerializers_buckets, 23);
        ReadOnlyClassToSerializerMap impl_knownSerializers24 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers24_knownSerializers_buckets = getFieldValue(impl_knownSerializers24, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets24 = get(impl_knownSerializers24_knownSerializers_buckets, 24);
        ReadOnlyClassToSerializerMap impl_knownSerializers25 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers25_knownSerializers_buckets = getFieldValue(impl_knownSerializers25, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets25 = get(impl_knownSerializers25_knownSerializers_buckets, 25);
        ReadOnlyClassToSerializerMap impl_knownSerializers26 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers26_knownSerializers_buckets = getFieldValue(impl_knownSerializers26, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets26 = get(impl_knownSerializers26_knownSerializers_buckets, 26);
        ReadOnlyClassToSerializerMap impl_knownSerializers27 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers27_knownSerializers_buckets = getFieldValue(impl_knownSerializers27, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets27 = get(impl_knownSerializers27_knownSerializers_buckets, 27);
        ReadOnlyClassToSerializerMap impl_knownSerializers28 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers28_knownSerializers_buckets = getFieldValue(impl_knownSerializers28, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets28 = get(impl_knownSerializers28_knownSerializers_buckets, 28);
        ReadOnlyClassToSerializerMap impl_knownSerializers29 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers29_knownSerializers_buckets = getFieldValue(impl_knownSerializers29, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets29 = get(impl_knownSerializers29_knownSerializers_buckets, 29);
        ReadOnlyClassToSerializerMap impl_knownSerializers30 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers30_knownSerializers_buckets = getFieldValue(impl_knownSerializers30, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets30 = get(impl_knownSerializers30_knownSerializers_buckets, 30);
        ReadOnlyClassToSerializerMap impl_knownSerializers31 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers31_knownSerializers_buckets = getFieldValue(impl_knownSerializers31, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets31 = get(impl_knownSerializers31_knownSerializers_buckets, 31);
        ReadOnlyClassToSerializerMap impl_knownSerializers32 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers32_knownSerializers_buckets = getFieldValue(impl_knownSerializers32, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets32 = get(impl_knownSerializers32_knownSerializers_buckets, 32);
        ReadOnlyClassToSerializerMap impl_knownSerializers33 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers33_knownSerializers_buckets = getFieldValue(impl_knownSerializers33, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets33 = get(impl_knownSerializers33_knownSerializers_buckets, 33);
        ReadOnlyClassToSerializerMap impl_knownSerializers34 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers34_knownSerializers_buckets = getFieldValue(impl_knownSerializers34, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets34 = get(impl_knownSerializers34_knownSerializers_buckets, 34);
        ReadOnlyClassToSerializerMap impl_knownSerializers35 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers35_knownSerializers_buckets = getFieldValue(impl_knownSerializers35, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets35 = get(impl_knownSerializers35_knownSerializers_buckets, 35);
        ReadOnlyClassToSerializerMap impl_knownSerializers36 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers36_knownSerializers_buckets = getFieldValue(impl_knownSerializers36, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets36 = get(impl_knownSerializers36_knownSerializers_buckets, 36);
        ReadOnlyClassToSerializerMap impl_knownSerializers37 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers37_knownSerializers_buckets = getFieldValue(impl_knownSerializers37, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets37 = get(impl_knownSerializers37_knownSerializers_buckets, 37);
        
        assertNull(finalImpl_knownSerializers_buckets0);
        
        assertNull(finalImpl_knownSerializers_buckets1);
        
        assertNull(finalImpl_knownSerializers_buckets2);
        
        assertNull(finalImpl_knownSerializers_buckets3);
        
        assertNull(finalImpl_knownSerializers_buckets4);
        
        assertNull(finalImpl_knownSerializers_buckets5);
        
        assertNull(finalImpl_knownSerializers_buckets6);
        
        assertNull(finalImpl_knownSerializers_buckets7);
        
        assertNull(finalImpl_knownSerializers_buckets8);
        
        assertNull(finalImpl_knownSerializers_buckets9);
        
        assertNull(finalImpl_knownSerializers_buckets10);
        
        assertNull(finalImpl_knownSerializers_buckets11);
        
        assertNull(finalImpl_knownSerializers_buckets12);
        
        assertNull(finalImpl_knownSerializers_buckets13);
        
        assertNull(finalImpl_knownSerializers_buckets14);
        
        assertNull(finalImpl_knownSerializers_buckets15);
        
        assertNull(finalImpl_knownSerializers_buckets16);
        
        assertNull(finalImpl_knownSerializers_buckets17);
        
        assertNull(finalImpl_knownSerializers_buckets18);
        
        assertNull(finalImpl_knownSerializers_buckets19);
        
        assertNull(finalImpl_knownSerializers_buckets20);
        
        assertNull(finalImpl_knownSerializers_buckets21);
        
        assertNull(finalImpl_knownSerializers_buckets22);
        
        assertNull(finalImpl_knownSerializers_buckets23);
        
        assertNull(finalImpl_knownSerializers_buckets24);
        
        assertNull(finalImpl_knownSerializers_buckets25);
        
        assertNull(finalImpl_knownSerializers_buckets26);
        
        assertNull(finalImpl_knownSerializers_buckets27);
        
        assertNull(finalImpl_knownSerializers_buckets28);
        
        assertNull(finalImpl_knownSerializers_buckets29);
        
        assertNull(finalImpl_knownSerializers_buckets30);
        
        assertNull(finalImpl_knownSerializers_buckets31);
        
        assertNull(finalImpl_knownSerializers_buckets32);
        
        assertNull(finalImpl_knownSerializers_buckets33);
        
        assertNull(finalImpl_knownSerializers_buckets34);
        
        assertNull(finalImpl_knownSerializers_buckets35);
        
        assertNull(finalImpl_knownSerializers_buckets36);
        
        assertNull(finalImpl_knownSerializers_buckets37);
    }
    
    @Test
    public void testCreateContextual5() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        ObjectIdWriter _objectIdWriter = ((ObjectIdWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"));
        MapLikeType idType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(idType, "com.fasterxml.jackson.databind.JavaType", "_hash", 131072);
        setField(_objectIdWriter, "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "idType", idType);
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_objectIdWriter", _objectIdWriter);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", 15);
        Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket");
        FileSerializer value = ((FileSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.FileSerializer"));
        setField(bucket, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", "value", value);
        setField(bucket, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", "_type", idType);
        _buckets[14] = bucket;
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_mask", 14);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        
        BeanSerializer actual = ((BeanSerializer) beanSerializer.createContextual(impl, null));
        
        BeanSerializer expected = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        ObjectIdWriter _objectIdWriter1 = ((ObjectIdWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"));
        setField(_objectIdWriter1, "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "idType", idType);
        setField(_objectIdWriter1, "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "serializer", value);
        setField(expected, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_objectIdWriter", _objectIdWriter1);
        
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual_props = actual._props;
        assertNull(actual_props);
        
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual_filteredProps = actual._filteredProps;
        assertNull(actual_filteredProps);
        
        AnyGetterWriter actual_anyGetterWriter = actual._anyGetterWriter;
        assertNull(actual_anyGetterWriter);
        
        Object actual_propertyFilterId = actual._propertyFilterId;
        assertNull(actual_propertyFilterId);
        
        AnnotatedMember actual_typeId = actual._typeId;
        assertNull(actual_typeId);
        
        ObjectIdWriter expected_objectIdWriter = expected._objectIdWriter;
        ObjectIdWriter actual_objectIdWriter = actual._objectIdWriter;
        JavaType expected_objectIdWriterIdType = expected_objectIdWriter.idType;
        JavaType actual_objectIdWriterIdType = actual_objectIdWriter.idType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_objectIdWriterIdType, actual_objectIdWriterIdType);
        
        SerializableString actual_objectIdWriterPropertyName = actual_objectIdWriter.propertyName;
        assertNull(actual_objectIdWriterPropertyName);
        
        ObjectIdGenerator actual_objectIdWriterGenerator = actual_objectIdWriter.generator;
        assertNull(actual_objectIdWriterGenerator);
        
        JsonSerializer expected_objectIdWriterSerializer = expected_objectIdWriter.serializer;
        JsonSerializer actual_objectIdWriterSerializer = actual_objectIdWriter.serializer;
        Class actual_objectIdWriterSerializer_handledType = ((Class) getFieldValue(actual_objectIdWriterSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
        assertNull(actual_objectIdWriterSerializer_handledType);
        
        boolean actual_objectIdWriterAlwaysAsId = actual_objectIdWriter.alwaysAsId;
        assertFalse(actual_objectIdWriterAlwaysAsId);
        
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertNull(actual_serializationShape);
        
        assertTrue(deepEquals(expected, actual));
        
        ReadOnlyClassToSerializerMap impl_knownSerializers = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers_knownSerializers_buckets = getFieldValue(impl_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets0 = get(impl_knownSerializers_knownSerializers_buckets, 0);
        ReadOnlyClassToSerializerMap impl_knownSerializers1 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers1_knownSerializers_buckets = getFieldValue(impl_knownSerializers1, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets1 = get(impl_knownSerializers1_knownSerializers_buckets, 1);
        ReadOnlyClassToSerializerMap impl_knownSerializers2 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers2_knownSerializers_buckets = getFieldValue(impl_knownSerializers2, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets2 = get(impl_knownSerializers2_knownSerializers_buckets, 2);
        ReadOnlyClassToSerializerMap impl_knownSerializers3 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers3_knownSerializers_buckets = getFieldValue(impl_knownSerializers3, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets3 = get(impl_knownSerializers3_knownSerializers_buckets, 3);
        ReadOnlyClassToSerializerMap impl_knownSerializers4 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers4_knownSerializers_buckets = getFieldValue(impl_knownSerializers4, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets4 = get(impl_knownSerializers4_knownSerializers_buckets, 4);
        ReadOnlyClassToSerializerMap impl_knownSerializers5 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers5_knownSerializers_buckets = getFieldValue(impl_knownSerializers5, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets5 = get(impl_knownSerializers5_knownSerializers_buckets, 5);
        ReadOnlyClassToSerializerMap impl_knownSerializers6 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers6_knownSerializers_buckets = getFieldValue(impl_knownSerializers6, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets6 = get(impl_knownSerializers6_knownSerializers_buckets, 6);
        ReadOnlyClassToSerializerMap impl_knownSerializers7 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers7_knownSerializers_buckets = getFieldValue(impl_knownSerializers7, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets7 = get(impl_knownSerializers7_knownSerializers_buckets, 7);
        ReadOnlyClassToSerializerMap impl_knownSerializers8 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers8_knownSerializers_buckets = getFieldValue(impl_knownSerializers8, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets8 = get(impl_knownSerializers8_knownSerializers_buckets, 8);
        ReadOnlyClassToSerializerMap impl_knownSerializers9 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers9_knownSerializers_buckets = getFieldValue(impl_knownSerializers9, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets9 = get(impl_knownSerializers9_knownSerializers_buckets, 9);
        ReadOnlyClassToSerializerMap impl_knownSerializers10 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers10_knownSerializers_buckets = getFieldValue(impl_knownSerializers10, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets10 = get(impl_knownSerializers10_knownSerializers_buckets, 10);
        ReadOnlyClassToSerializerMap impl_knownSerializers11 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers11_knownSerializers_buckets = getFieldValue(impl_knownSerializers11, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets11 = get(impl_knownSerializers11_knownSerializers_buckets, 11);
        ReadOnlyClassToSerializerMap impl_knownSerializers12 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers12_knownSerializers_buckets = getFieldValue(impl_knownSerializers12, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets12 = get(impl_knownSerializers12_knownSerializers_buckets, 12);
        ReadOnlyClassToSerializerMap impl_knownSerializers13 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        Object impl_knownSerializers13_knownSerializers_buckets = getFieldValue(impl_knownSerializers13, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets");
        Object finalImpl_knownSerializers_buckets13 = get(impl_knownSerializers13_knownSerializers_buckets, 13);
        
        assertNull(finalImpl_knownSerializers_buckets0);
        
        assertNull(finalImpl_knownSerializers_buckets1);
        
        assertNull(finalImpl_knownSerializers_buckets2);
        
        assertNull(finalImpl_knownSerializers_buckets3);
        
        assertNull(finalImpl_knownSerializers_buckets4);
        
        assertNull(finalImpl_knownSerializers_buckets5);
        
        assertNull(finalImpl_knownSerializers_buckets6);
        
        assertNull(finalImpl_knownSerializers_buckets7);
        
        assertNull(finalImpl_knownSerializers_buckets8);
        
        assertNull(finalImpl_knownSerializers_buckets9);
        
        assertNull(finalImpl_knownSerializers_buckets10);
        
        assertNull(finalImpl_knownSerializers_buckets11);
        
        assertNull(finalImpl_knownSerializers_buckets12);
        
        assertNull(finalImpl_knownSerializers_buckets13);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty)
    
    @Test
    public void testCreateContextual6() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
            ObjectIdWriter _objectIdWriter = ((ObjectIdWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"));
            setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_objectIdWriter", _objectIdWriter);
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.createContextual] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:522)
                com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.createContextual(BeanSerializerBase.java:496) */
            beanSerializer.createContextual(impl, null);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.usesObjectId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method usesObjectId()
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#usesObjectId()}
 * @utbot.returnsFrom {@code return (_objectIdWriter != null);}
 *  */
    @Test
    public void testUsesObjectId__objectIdWriterNotEqualsNull() throws Exception  {
        ObjectIdWriter objectIdWriter = ((ObjectIdWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"));
        UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(null, objectIdWriter, null);
        
        boolean actual = unwrappingBeanSerializer.usesObjectId();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#usesObjectId()}
 * @utbot.returnsFrom {@code return (_objectIdWriter != null);}
 *  */
    @Test
    public void testUsesObjectId__objectIdWriterEqualsNull() {
        UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(null, null, null);
        
        boolean actual = unwrappingBeanSerializer.usesObjectId();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFields
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method serializeFields(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#serializeFields(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_filteredProps != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getActiveView()}
 *  */
    @Test
    public void testSerializeFields__filteredPropsNotEqualsNull() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = {};
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        Class _serializationView = Object.class;
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_serializationView", _serializationView);
        
        Class initialImpl_serializationView = ((Class) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_serializationView"));
        
        beanSerializer.serializeFields(null, null, impl);
        
        Class finalImpl_serializationView = ((Class) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_serializationView"));
        
        assertFalse(initialImpl_serializationView == finalImpl_serializationView);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#serializeFields(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_filteredProps != null): False}
 *  */
    @Test
    public void testSerializeFields__filteredPropsEqualsNull() throws Exception  {
        BeanAsArraySerializer beanAsArraySerializer = ((BeanAsArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = {};
        setField(beanAsArraySerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        
        beanAsArraySerializer.serializeFields(null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method serializeFields(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#serializeFields(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_filteredProps != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: _filteredProps != null && provider.getActiveView() != null
 *  */
    @Test
    public void testSerializeFields_ThrowNullPointerException() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = {null};
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFields] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFields(BeanSerializerBase.java:666) */
        beanSerializer.serializeFields(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#serializeFields(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_filteredProps != null): False}
 * @utbot.caughtException {@code Exception e}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (i == props.length)
 *  */
    @Test
    public void testSerializeFields_ThrowNullPointerException_1() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFields] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFields(BeanSerializerBase.java:683) */
        beanSerializer.serializeFields(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#serializeFields(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_filteredProps != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getActiveView()}
 * @utbot.caughtException {@code Exception e}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (i == props.length)
 *  */
    @Test
    public void testSerializeFields_ThrowNullPointerException_2() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = {null};
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFields] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFields(BeanSerializerBase.java:683) */
        beanSerializer.serializeFields(null, null, impl);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method serializeFields(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
    
    @Test
    public void testSerializeFields1() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = {null, null, null, null, null, null, null, null, null};
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        Object object = new Object();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        Class _serializationView = Object.class;
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_serializationView", _serializationView);
        
        Class initialImpl_serializationView = ((Class) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_serializationView"));
        
        beanSerializer.serializeFields(object, null, impl);
        
        BeanPropertyWriter finalBeanSerializer_filteredProps0 = beanSerializer._filteredProps[0];
        BeanPropertyWriter finalBeanSerializer_filteredProps1 = beanSerializer._filteredProps[1];
        BeanPropertyWriter finalBeanSerializer_filteredProps2 = beanSerializer._filteredProps[2];
        BeanPropertyWriter finalBeanSerializer_filteredProps3 = beanSerializer._filteredProps[3];
        BeanPropertyWriter finalBeanSerializer_filteredProps4 = beanSerializer._filteredProps[4];
        BeanPropertyWriter finalBeanSerializer_filteredProps5 = beanSerializer._filteredProps[5];
        BeanPropertyWriter finalBeanSerializer_filteredProps6 = beanSerializer._filteredProps[6];
        BeanPropertyWriter finalBeanSerializer_filteredProps7 = beanSerializer._filteredProps[7];
        BeanPropertyWriter finalBeanSerializer_filteredProps8 = beanSerializer._filteredProps[8];
        
        Class finalImpl_serializationView = ((Class) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_serializationView"));
        
        assertNull(finalBeanSerializer_filteredProps0);
        
        assertNull(finalBeanSerializer_filteredProps1);
        
        assertNull(finalBeanSerializer_filteredProps2);
        
        assertNull(finalBeanSerializer_filteredProps3);
        
        assertNull(finalBeanSerializer_filteredProps4);
        
        assertNull(finalBeanSerializer_filteredProps5);
        
        assertNull(finalBeanSerializer_filteredProps6);
        
        assertNull(finalBeanSerializer_filteredProps7);
        
        assertNull(finalBeanSerializer_filteredProps8);
        
        assertFalse(initialImpl_serializationView == finalImpl_serializationView);
    }
    
    @Test
    public void testSerializeFields2() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = {null, null, null, null, null, null, null, null, null};
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        Object object = new Object();
        
        beanSerializer.serializeFields(object, null, null);
        
        BeanPropertyWriter finalBeanSerializer_props0 = beanSerializer._props[0];
        BeanPropertyWriter finalBeanSerializer_props1 = beanSerializer._props[1];
        BeanPropertyWriter finalBeanSerializer_props2 = beanSerializer._props[2];
        BeanPropertyWriter finalBeanSerializer_props3 = beanSerializer._props[3];
        BeanPropertyWriter finalBeanSerializer_props4 = beanSerializer._props[4];
        BeanPropertyWriter finalBeanSerializer_props5 = beanSerializer._props[5];
        BeanPropertyWriter finalBeanSerializer_props6 = beanSerializer._props[6];
        BeanPropertyWriter finalBeanSerializer_props7 = beanSerializer._props[7];
        BeanPropertyWriter finalBeanSerializer_props8 = beanSerializer._props[8];
        
        assertNull(finalBeanSerializer_props0);
        
        assertNull(finalBeanSerializer_props1);
        
        assertNull(finalBeanSerializer_props2);
        
        assertNull(finalBeanSerializer_props3);
        
        assertNull(finalBeanSerializer_props4);
        
        assertNull(finalBeanSerializer_props5);
        
        assertNull(finalBeanSerializer_props6);
        
        assertNull(finalBeanSerializer_props7);
        
        assertNull(finalBeanSerializer_props8);
    }
    
    @Test
    public void testSerializeFields3() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = {null, null, null, null, null, null, null, null, null};
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = {null, null, null, null, null, null, null, null, null};
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        Object object = new Object();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        beanSerializer.serializeFields(object, null, impl);
        
        BeanPropertyWriter finalBeanSerializer_props0 = beanSerializer._props[0];
        BeanPropertyWriter finalBeanSerializer_props1 = beanSerializer._props[1];
        BeanPropertyWriter finalBeanSerializer_props2 = beanSerializer._props[2];
        BeanPropertyWriter finalBeanSerializer_props3 = beanSerializer._props[3];
        BeanPropertyWriter finalBeanSerializer_props4 = beanSerializer._props[4];
        BeanPropertyWriter finalBeanSerializer_props5 = beanSerializer._props[5];
        BeanPropertyWriter finalBeanSerializer_props6 = beanSerializer._props[6];
        BeanPropertyWriter finalBeanSerializer_props7 = beanSerializer._props[7];
        BeanPropertyWriter finalBeanSerializer_props8 = beanSerializer._props[8];
        BeanPropertyWriter finalBeanSerializer_filteredProps0 = beanSerializer._filteredProps[0];
        BeanPropertyWriter finalBeanSerializer_filteredProps1 = beanSerializer._filteredProps[1];
        BeanPropertyWriter finalBeanSerializer_filteredProps2 = beanSerializer._filteredProps[2];
        BeanPropertyWriter finalBeanSerializer_filteredProps3 = beanSerializer._filteredProps[3];
        BeanPropertyWriter finalBeanSerializer_filteredProps4 = beanSerializer._filteredProps[4];
        BeanPropertyWriter finalBeanSerializer_filteredProps5 = beanSerializer._filteredProps[5];
        BeanPropertyWriter finalBeanSerializer_filteredProps6 = beanSerializer._filteredProps[6];
        BeanPropertyWriter finalBeanSerializer_filteredProps7 = beanSerializer._filteredProps[7];
        BeanPropertyWriter finalBeanSerializer_filteredProps8 = beanSerializer._filteredProps[8];
        
        assertNull(finalBeanSerializer_props0);
        
        assertNull(finalBeanSerializer_props1);
        
        assertNull(finalBeanSerializer_props2);
        
        assertNull(finalBeanSerializer_props3);
        
        assertNull(finalBeanSerializer_props4);
        
        assertNull(finalBeanSerializer_props5);
        
        assertNull(finalBeanSerializer_props6);
        
        assertNull(finalBeanSerializer_props7);
        
        assertNull(finalBeanSerializer_props8);
        
        assertNull(finalBeanSerializer_filteredProps0);
        
        assertNull(finalBeanSerializer_filteredProps1);
        
        assertNull(finalBeanSerializer_filteredProps2);
        
        assertNull(finalBeanSerializer_filteredProps3);
        
        assertNull(finalBeanSerializer_filteredProps4);
        
        assertNull(finalBeanSerializer_filteredProps5);
        
        assertNull(finalBeanSerializer_filteredProps6);
        
        assertNull(finalBeanSerializer_filteredProps7);
        
        assertNull(finalBeanSerializer_filteredProps8);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method serializeFields(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
    
    @Test
    public void testSerializeFields4() throws Exception  {
        BeanAsArraySerializer beanAsArraySerializer = ((BeanAsArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[22];
        Object multiView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView");
        _filteredProps[1] = ((BeanPropertyWriter) multiView);
        setField(beanAsArraySerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        Object object = new Object();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        Class _serializationView = Object.class;
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_serializationView", _serializationView);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFields] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getName(BeanPropertyWriter.java:445)
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFields(BeanSerializerBase.java:683) */
        beanAsArraySerializer.serializeFields(object, null, impl);
    }
    
    @Test
    public void testSerializeFields5() throws Exception  {
        BeanAsArraySerializer beanAsArraySerializer = ((BeanAsArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[9];
        Object multiView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView");
        _props[0] = ((BeanPropertyWriter) multiView);
        setField(beanAsArraySerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = {null, null, null, null, null, null, null, null, null};
        setField(beanAsArraySerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        Object object = new Object();
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFields] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getName(BeanPropertyWriter.java:445)
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFields(BeanSerializerBase.java:683) */
        beanAsArraySerializer.serializeFields(object, uTF8JsonGenerator, impl);
    }
    
    @Test
    public void testSerializeFields6() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[9];
        Object multiView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView");
        _props[0] = ((BeanPropertyWriter) multiView);
        _props[1] = ((BeanPropertyWriter) multiView);
        _props[2] = ((BeanPropertyWriter) multiView);
        _props[3] = ((BeanPropertyWriter) multiView);
        _props[4] = ((BeanPropertyWriter) multiView);
        _props[5] = ((BeanPropertyWriter) multiView);
        _props[6] = ((BeanPropertyWriter) multiView);
        _props[7] = ((BeanPropertyWriter) multiView);
        _props[8] = ((BeanPropertyWriter) multiView);
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        Object object = new Object();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFields] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getName(BeanPropertyWriter.java:445)
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFields(BeanSerializerBase.java:683) */
        beanSerializer.serializeFields(object, null, impl);
    }
    
    @Test
    public void testSerializeFields7() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[10];
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        _props[1] = beanPropertyWriter;
        _props[2] = beanPropertyWriter;
        _props[3] = beanPropertyWriter;
        _props[4] = beanPropertyWriter;
        _props[5] = beanPropertyWriter;
        _props[6] = beanPropertyWriter;
        _props[7] = beanPropertyWriter;
        _props[8] = beanPropertyWriter;
        _props[9] = beanPropertyWriter;
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFields] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getName(BeanPropertyWriter.java:445)
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFields(BeanSerializerBase.java:683) */
        beanSerializer.serializeFields(object, null, null);
    }
    
    @Test
    public void testSerializeFields8() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[10];
        Object multiView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView");
        _props[1] = ((BeanPropertyWriter) multiView);
        _props[2] = ((BeanPropertyWriter) multiView);
        _props[3] = ((BeanPropertyWriter) multiView);
        _props[4] = ((BeanPropertyWriter) multiView);
        _props[5] = ((BeanPropertyWriter) multiView);
        _props[6] = ((BeanPropertyWriter) multiView);
        _props[7] = ((BeanPropertyWriter) multiView);
        _props[8] = ((BeanPropertyWriter) multiView);
        _props[9] = ((BeanPropertyWriter) multiView);
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        Object object = new Object();
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFields] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getName(BeanPropertyWriter.java:445)
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFields(BeanSerializerBase.java:683) */
        beanSerializer.serializeFields(object, null, null);
    }
    
    @Test
    public void testSerializeFields9() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = {null, null};
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = {null, null, null, null, null, null, null, null, null};
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        AnyGetterWriter _anyGetterWriter = ((AnyGetterWriter) createInstance("com.fasterxml.jackson.databind.ser.AnyGetterWriter"));
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_anyGetterWriter", _anyGetterWriter);
        Object object = new Object();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFields] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.SerializerProvider.isEnabled(SerializerProvider.java:414)
            com.fasterxml.jackson.databind.ser.std.StdSerializer.wrapAndThrow(StdSerializer.java:331)
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFields(BeanSerializerBase.java:684) */
        beanSerializer.serializeFields(object, null, impl);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method serializeFields(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
    
    @Test(expected = JsonMappingException.class)
    public void testSerializeFields10() throws Exception  {
        BeanAsArraySerializer beanAsArraySerializer = ((BeanAsArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = {};
        setField(beanAsArraySerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        AnyGetterWriter _anyGetterWriter = ((AnyGetterWriter) createInstance("com.fasterxml.jackson.databind.ser.AnyGetterWriter"));
        AnnotatedParameter _accessor = ((AnnotatedParameter) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        setField(_anyGetterWriter, "com.fasterxml.jackson.databind.ser.AnyGetterWriter", "_accessor", _accessor);
        setField(beanAsArraySerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_anyGetterWriter", _anyGetterWriter);
        Object object = new Object();
        
        beanAsArraySerializer.serializeFields(object, null, null);
    }
    ///endregion
    
    ///region Errors report for serializeFields
    
    public void testSerializeFields_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 29 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.BeanSerializerBase._customTypeId
    
    ///region Errors report for _customTypeId
    
    public void test_customTypeId_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 11 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Field
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.BeanSerializerBase._serializeWithObjectId
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _serializeWithObjectId(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider, boolean)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#_serializeWithObjectId(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,boolean)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#findObjectId(java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: WritableObjectId objectId = provider.findObjectId(bean, w.generator);
 *  */
    @Test
    public void test_serializeWithObjectId_ThrowNullPointerException_1() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        ObjectIdWriter _objectIdWriter = ((ObjectIdWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"));
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_objectIdWriter", _objectIdWriter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase._serializeWithObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase._serializeWithObjectId(BeanSerializerBase.java:580) */
        beanSerializer._serializeWithObjectId(((Object) null), ((JsonGenerator) null), ((SerializerProvider) null), false);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#_serializeWithObjectId(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: WritableObjectId objectId = provider.findObjectId(bean, w.generator);
 *  */
    @Test
    public void test_serializeWithObjectId_ThrowNullPointerException() throws IOException  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(null, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase._serializeWithObjectId] produces [java.lang.NullPointerException] */
        unwrappingBeanSerializer._serializeWithObjectId(((Object) null), ((JsonGenerator) null), ((SerializerProvider) null), false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.BeanSerializerBase._serializeWithObjectId
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _serializeWithObjectId(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.jsontype.TypeSerializer)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#_serializeWithObjectId(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#findObjectId(java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: WritableObjectId objectId = provider.findObjectId(bean, w.generator);
 *  */
    @Test
    public void test_serializeWithObjectId_ThrowNullPointerException_11() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        ObjectIdWriter _objectIdWriter = ((ObjectIdWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"));
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_objectIdWriter", _objectIdWriter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase._serializeWithObjectId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase._serializeWithObjectId(BeanSerializerBase.java:609) */
        beanSerializer._serializeWithObjectId(((Object) null), ((JsonGenerator) null), ((SerializerProvider) null), ((TypeSerializer) null));
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#_serializeWithObjectId(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: WritableObjectId objectId = provider.findObjectId(bean, w.generator);
 *  */
    @Test
    public void test_serializeWithObjectId_ThrowNullPointerException1() throws IOException  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(null, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase._serializeWithObjectId] produces [java.lang.NullPointerException] */
        unwrappingBeanSerializer._serializeWithObjectId(((Object) null), ((JsonGenerator) null), ((SerializerProvider) null), ((TypeSerializer) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFieldsFiltered
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method serializeFieldsFiltered(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#serializeFieldsFiltered(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (filter == null): False}
 * @utbot.executesCondition {@code (_anyGetterWriter != null): False}
 *  */
    @Test
    public void testSerializeFieldsFiltered__anyGetterWriterEqualsNull() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = ((UnwrappingBeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = {};
        setField(unwrappingBeanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        byte[] _propertyFilterId = {};
        setField(unwrappingBeanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_propertyFilterId", _propertyFilterId);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        SimpleFilterProvider _filterProvider = ((SimpleFilterProvider) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider"));
        LinkedHashMap _filtersById = new LinkedHashMap();
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_filtersById", _filtersById);
        SimpleBeanPropertyFilter.SerializeExceptFilter _defaultFilter = ((SimpleBeanPropertyFilter.SerializeExceptFilter) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter$SerializeExceptFilter"));
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_defaultFilter", _defaultFilter);
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider", _filterProvider);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        unwrappingBeanSerializer.serializeFieldsFiltered(null, null, impl);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#serializeFieldsFiltered(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (filter == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#serializeFields(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testSerializeFieldsFiltered_FilterEqualsNull() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = ((UnwrappingBeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = {};
        setField(unwrappingBeanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        byte[] _propertyFilterId = {};
        setField(unwrappingBeanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_propertyFilterId", _propertyFilterId);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        SimpleFilterProvider _filterProvider = ((SimpleFilterProvider) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider"));
        LinkedHashMap _filtersById = new LinkedHashMap();
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_filtersById", _filtersById);
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider", _filterProvider);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        unwrappingBeanSerializer.serializeFieldsFiltered(null, null, impl);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method serializeFieldsFiltered(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#serializeFieldsFiltered(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_filteredProps != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getActiveView()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: _filteredProps != null && provider.getActiveView() != null
 *  */
    @Test
    public void testSerializeFieldsFiltered_ThrowNullPointerException() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = {null};
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFieldsFiltered] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFieldsFiltered(BeanSerializerBase.java:713) */
        beanSerializer.serializeFieldsFiltered(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#serializeFieldsFiltered(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_filteredProps != null): False}
 * @utbot.executesCondition {@code (filter == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#findPropertyFilter(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object)}
 * @utbot.caughtException {@code Exception e}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (i == props.length)
 *  */
    @Test
    public void testSerializeFieldsFiltered_ThrowNullPointerException_1() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = ((UnwrappingBeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer"));
        byte[] _propertyFilterId = {};
        setField(unwrappingBeanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_propertyFilterId", _propertyFilterId);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        SimpleFilterProvider _filterProvider = ((SimpleFilterProvider) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider"));
        LinkedHashMap _filtersById = new LinkedHashMap();
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_filtersById", _filtersById);
        SimpleBeanPropertyFilter.SerializeExceptFilter _defaultFilter = ((SimpleBeanPropertyFilter.SerializeExceptFilter) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter$SerializeExceptFilter"));
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_defaultFilter", _defaultFilter);
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider", _filterProvider);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFieldsFiltered] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFieldsFiltered(BeanSerializerBase.java:736) */
        unwrappingBeanSerializer.serializeFieldsFiltered(null, null, impl);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method serializeFieldsFiltered(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#serializeFieldsFiltered(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_filteredProps != null): True}
 * @utbot.executesCondition {@code (provider.getActiveView() != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getActiveView()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#findPropertyFilter(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: final PropertyFilter filter = findPropertyFilter(provider, _propertyFilterId, bean);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSerializeFieldsFiltered_ThrowIllegalArgumentException() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = {null, null};
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        byte[] _propertyFilterId = {};
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_propertyFilterId", _propertyFilterId);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        SimpleFilterProvider _filterProvider = ((SimpleFilterProvider) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider"));
        LinkedHashMap _filtersById = new LinkedHashMap();
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_filtersById", _filtersById);
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_cfgFailOnUnknownId", true);
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider", _filterProvider);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        Class _serializationView = Object.class;
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_serializationView", _serializationView);
        
        beanSerializer.serializeFieldsFiltered(null, null, impl);
    }
    ///endregion
    
    ///region Errors report for serializeFieldsFiltered
    
    public void testSerializeFieldsFiltered_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.findConvertingSerializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findConvertingSerializer(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.ser.BeanPropertyWriter)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#findConvertingSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.BeanPropertyWriter)}
 * @utbot.executesCondition {@code (intr != null): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindConvertingSerializer_IntrEqualsNull() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        JsonSerializer actual = beanSerializer.findConvertingSerializer(impl, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#findConvertingSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.BeanPropertyWriter)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findSerializationConverter(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindConvertingSerializer_AnnotationIntrospectorFindSerializationConverter() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            BeanAsArraySerializer beanAsArraySerializer = new BeanAsArraySerializer(null);
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
            AnnotatedConstructor _member = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
            setField(unwrappingBeanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
            
            JsonSerializer actual = beanAsArraySerializer.findConvertingSerializer(impl, unwrappingBeanPropertyWriter);
            
            assertNull(actual);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#findConvertingSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.BeanPropertyWriter)}
 * @utbot.executesCondition {@code (intr != null): True}
 * @utbot.executesCondition {@code (m != null): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindConvertingSerializer_MEqualsNull() throws Exception  {
        BeanAsArraySerializer beanAsArraySerializer = new BeanAsArraySerializer(null);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        AttributePropertyWriter attributePropertyWriter = ((AttributePropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter"));
        
        JsonSerializer actual = beanAsArraySerializer.findConvertingSerializer(impl, attributePropertyWriter);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findConvertingSerializer(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.ser.BeanPropertyWriter)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#findConvertingSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.BeanPropertyWriter)}
 * @utbot.executesCondition {@code (intr != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: AnnotatedMember m = prop.getMember();
 *  */
    @Test
    public void testFindConvertingSerializer_ThrowNullPointerException_2() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.findConvertingSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.findConvertingSerializer(BeanSerializerBase.java:367) */
        beanSerializer.findConvertingSerializer(impl, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#findConvertingSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.BeanPropertyWriter)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getAnnotationIntrospector()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final AnnotationIntrospector intr = provider.getAnnotationIntrospector();
 *  */
    @Test
    public void testFindConvertingSerializer_ThrowNullPointerException() throws JsonMappingException  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(((UnwrappingBeanSerializer) null), ((ObjectIdWriter) null));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.findConvertingSerializer] produces [java.lang.NullPointerException] */
        unwrappingBeanSerializer.findConvertingSerializer(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#findConvertingSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.BeanPropertyWriter)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: AnnotatedMember m = prop.getMember();
 *  */
    @Test
    public void testFindConvertingSerializer_ThrowNullPointerException_1() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(((UnwrappingBeanSerializer) null), ((ObjectIdWriter) null));
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.findConvertingSerializer] produces [java.lang.NullPointerException] */
            unwrappingBeanSerializer.findConvertingSerializer(impl, null);
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1083905664060500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1083905664060500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1083905664065799 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1083905664060500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1083905664065799).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1083905664447299 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1083905664447299.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1083905664449499 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1083905664447299.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1083905664449499).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1083905667561100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1083905667561100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1083905667562900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1083905667561100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1083905667562900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

